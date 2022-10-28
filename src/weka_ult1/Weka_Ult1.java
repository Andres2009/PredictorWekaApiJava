package Weka_Ult1;
 
// Main class
//import java.awt.BorderLayout;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.Random;
//import weka.classifiers.Classifier;
//import weka.core.Instance;
//import weka.core.Instances; 
//import java.util.Arrays;
//
//import weka.core.converters.ConverterUtils.DataSource;
//import weka.classifiers.bayes.NaiveBayes; 
//import weka.core.Instances; 
//import weka.classifiers.bayes.NaiveBayes;
//import weka.classifiers.evaluation.Evaluation;
//import weka.classifiers.trees.J48;
//import weka.classifiers.functions.SMO; 
//import weka.gui.treevisualizer.PlaceNode2;
//import weka.gui.treevisualizer.TreeVisualizer;
//import weka_ult1.Metodos;
//
//
//import java.awt.BorderLayout;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import javax.swing.JFrame;
// 
//import weka.classifiers.evaluation.ThresholdCurve;
//
//import weka.classifiers.trees.J48;
//import weka.core.Instances;
//import weka.core.Utils;
//import weka.gui.treevisualizer.PlaceNode2;
//import weka.gui.visualize.PlotData2D;
//import weka.gui.visualize.ThresholdVisualizePanel;
import weka_ult1.Frame1;
//import weka.gui.treevisualizer.TreeVisualizer;

// BreastCancer
public class Weka_Ult1  {
 
	public static void main(String args[])  { 
              
            Frame1 despliegue = new Frame1();
            despliegue.setVisible(true);
             
            //EL CODIGO COMENTADO SON PRUEBAS PREVIAS AL DESARROLLO
            
//        			//load training dataset  
//		DataSource source = new DataSource(""); 
//		Instances trainDataset = source.getDataSet();	
//		//set class index to the last attribute
//		trainDataset.setClassIndex(trainDataset.numAttributes()-1); 
//		//create and build the classifier
//		Classifier nb = new NaiveBayes();
//		//nb.setOptions(options);
//                nb.buildClassifier(trainDataset); 
//                //USO DE LA CLASE EVALUATION PARA LA CLASIFICACION CORRECTA E INCONRRECTA
//                Evaluation eva = new Evaluation(trainDataset);
//                eva.crossValidateModel(nb, trainDataset, 10, new Random(1)); 
//               
//                Lista3.add((  ("PRECISION "+eva.precision(1)*100)+"\n"+eva.toSummaryString("NAYBAYES ALGORITMO",true)));
//         
//              // train classifier
//            J48 cls = new J48();
//            Instances data = new Instances(new BufferedReader(new FileReader("D:\\caesarian.arff")));
//            data.setClassIndex(data.numAttributes()-1);
//            cls.buildClassifier(data); 
//            // display classifier
//            final javax.swing.JFrame jf = 
//              new javax.swing.JFrame("Weka Classifier Tree Visualizer: J48");
//            jf.setSize(500,400);
//            jf.getContentPane().setLayout(new BorderLayout());
//            TreeVisualizer tv = new TreeVisualizer(null,
//                cls.graph(),
//                new PlaceNode2());
//            jf.getContentPane().add(tv, BorderLayout.CENTER);
//            jf.addWindowListener(new java.awt.event.WindowAdapter() {
//              public void windowClosing(java.awt.event.WindowEvent e) {
//                jf.dispose();
//              }
//            });
//
//            jf.setVisible(true);
//            tv.fitToScreen();
          
//		//load training dataset 
//		DataSource source = new DataSource("D:\\caesarian.arff"); 
//		Instances trainDataset = source.getDataSet();	
//		//set class index to the last attribute
//		trainDataset.setClassIndex(trainDataset.numAttributes()-1);
//		//get number of classes
//		int numClasses = trainDataset.numClasses();
//		//print out class values in the training dataset
//		for(int i = 0; i < numClasses; i++){
//			//get class string value using the class index
//			String classValue = trainDataset.classAttribute().value(i);
//			System.out.println("Class Value "+i+" is " + classValue);
//		}
//                //String[] options = {"-S 0 -K 2"};
//		//create and build the classifier
//		Classifier nb = new NaiveBayes();
//		//nb.setOptions(options);
//                nb.buildClassifier(trainDataset); 
//                //USO DE LA CLASE EVALUATION PARA LA CLASIFICACION CORRECTA E INCONRRECTA
//                Evaluation eva = new Evaluation(trainDataset);
//                eva.crossValidateModel(nb, trainDataset, 10, new Random(1));
//                System.out.println("PRECISION "+eva.precision(1));
//                System.out.println(eva.toSummaryString(" NAYBAYES ALGORITMO",true));
//		//load new dataset
//		DataSource source1 = new DataSource("D:\\caesarian-test.arff");
//		Instances testDataset = source1.getDataSet();	
//                //System.out.println("hola "+source1.getRevision());
//                System.out.println("hola "+source1.getDataSet());
//                J48 cls = new J48();
//          
//		//set class index to the last attribute
//		testDataset.setClassIndex(testDataset.numAttributes()-1);
//		//loop through the new dataset and make predictions
//                  // display classifier
//                 final javax.swing.JFrame jf = 
//                   new javax.swing.JFrame("Weka Classifier Tree Visualizer: J48");
//                 jf.setSize(500,400);
//                 jf.getContentPane().setLayout(new BorderLayout());
//                 TreeVisualizer tv;
//            tv = new TreeVisualizer(null,
//                    nb. ,
//                    new PlaceNode2());
//                 jf.getContentPane().add(tv, BorderLayout.CENTER);
//                 jf.addWindowListener(new java.awt.event.WindowAdapter() {
//                   @Override
//                   public void windowClosing(java.awt.event.WindowEvent e) {
//                     jf.dispose();
//                   }
//                 });
//
//                 jf.setVisible(true);
//                 tv.fitToScreen();
//                
//                
//		System.out.println("===================");
//		System.out.println("Actual Class, NB Predicted");
//		for (int i = 0; i < testDataset.numInstances(); i++) {
//			//get class double value for current instance
//			double actualClass = testDataset.instance(i).classValue();
//			//get class string value using the class index using the class's int value
//			String actual = testDataset.classAttribute().value((int) actualClass);
//			//get Instance object of current instance
//			Instance newInst = testDataset.instance(i);
//			//call classifyInstance, which returns a double value for the class
//			double predNB = nb.classifyInstance(newInst);
//			//use this value to get string value of the predicted class
//			String predString = testDataset.classAttribute().value((int) predNB);
//			System.out.println(actual+", "+predString);
//		}
//	}
}
        }