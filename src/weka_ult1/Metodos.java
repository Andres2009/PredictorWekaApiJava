/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weka_ult1;
 
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;
import weka.core.converters.ConverterUtils.DataSource;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;

/**
 *
 * @author ASUS
 */
public class Metodos/*throws Exception */{
    
    public ArrayList<String> BuscarDocumento(String a) throws Exception{
        ArrayList<String> Lista = new ArrayList<String>();
        DataSource source = new ConverterUtils.DataSource(a);
        source.getDataSet();
                
        Instances trainDataset = source.getDataSet();	
        //set class index to the last attribute
        trainDataset.setClassIndex(trainDataset.numAttributes()-1);
        //get number of classes
        int numClasses = trainDataset.numClasses();
        //print out class values in the training dataset
        for(int i = 0; i < numClasses; i++){
                //get class string value using the class index
                String classValue = trainDataset.classAttribute().value(i);
                //System.out.println("Class Value "+i+" is " + classValue);
                String dato = +i+" - " + classValue;
                Lista.add(dato);
        } 
         
        return Lista;
    }
    
    
    public ArrayList<String> MostrarPrediccion(String a,String b) throws Exception{
                ArrayList<String> Lista2 = new ArrayList<>();
        	//load training dataset 
		DataSource source = new DataSource(a); 
		Instances trainDataset = source.getDataSet();	
		//set class index to the last attribute
		trainDataset.setClassIndex(trainDataset.numAttributes()-1);
		//get number of classes
		int numClasses = trainDataset.numClasses();
		//print out class values in the training dataset
		for(int i = 0; i < numClasses; i++){
			//get class string value using the class index
			String classValue = trainDataset.classAttribute().value(i);
			//System.out.println("Class Value "+i+" is " + classValue);
		}
                //String[] options = {"-S 0 -K 2"};
		//create and build the classifier
		Classifier nb = new NaiveBayes();
		//nb.setOptions(options);
                nb.buildClassifier(trainDataset); 
                //USO DE LA CLASE EVALUATION PARA LA CLASIFICACION CORRECTA E INCONRRECTA
                Evaluation eva = new Evaluation(trainDataset);
                eva.crossValidateModel(nb, trainDataset, 10, new Random(1));
              
		//load new dataset
		DataSource source1 = new DataSource(b);
		Instances testDataset = source1.getDataSet();	
		//set class index to the last attribute
		testDataset.setClassIndex(testDataset.numAttributes()-1);
		//loop through the new dataset and make predictions
//		System.out.println("===================");
//		System.out.println("Actual Class, NB Predicted");
		for (int i = 0; i < testDataset.numInstances(); i++) {
			//get class double value for current instance
			double actualClass = testDataset.instance(i).classValue();
			//get class string value using the class index using the class's int value
			String actual = testDataset.classAttribute().value((int) actualClass);
			//get Instance object of current instance
			Instance newInst = testDataset.instance(i);
			//call classifyInstance, which returns a double value for the class
			double predNB = nb.classifyInstance(newInst);
			//use this value to get string value of the predicted class
			String predString = testDataset.classAttribute().value((int) predNB);
			String dato = predString;
                        Lista2.add(dato);
		}
                
           
        return Lista2;
    }
     public ArrayList<String> Precision(String a) throws Exception{
                ArrayList<String> Lista3 = new ArrayList<>();
        			//load training dataset  
		DataSource source = new DataSource(a); 
		Instances trainDataset = source.getDataSet();	
		//set class index to the last attribute
		trainDataset.setClassIndex(trainDataset.numAttributes()-1); 
		//create and build the classifier
		Classifier nb = new NaiveBayes();
		//nb.setOptions(options);
                nb.buildClassifier(trainDataset); 
                //USO DE LA CLASE EVALUATION PARA LA CLASIFICACION CORRECTA E INCONRRECTA
                Evaluation eva = new Evaluation(trainDataset);
                eva.crossValidateModel(nb, trainDataset, 10, new Random(1)); 
               
                Lista3.add((  ("PRECISION "+eva.precision(1)*100)+"\n"+eva.toSummaryString("NAYBAYES ALGORITMO",true)));
                
           
        return Lista3;
    }
     
     public void VerArbol() throws Exception{
           J48 cls = new J48();
            Instances data = new Instances(new BufferedReader(new FileReader("D:\\caesarian.arff")));
            data.setClassIndex(data.numAttributes()-1);
            cls.buildClassifier(data); 
            // display classifier
            final javax.swing.JFrame jf = 
              new javax.swing.JFrame("Weka Classifier Tree Visualizer: J48");
            jf.setSize(500,400);
            jf.getContentPane().setLayout(new BorderLayout());
            TreeVisualizer tv = new TreeVisualizer(null,
                cls.graph(),
                new PlaceNode2());
            jf.getContentPane().add(tv, BorderLayout.CENTER);
            jf.addWindowListener(new java.awt.event.WindowAdapter() {
              public void windowClosing(java.awt.event.WindowEvent e) {
                jf.dispose();
              }
            });

            jf.setVisible(true);
            tv.fitToScreen();
     }
}

