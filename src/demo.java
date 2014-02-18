import static com.googlecode.javacv.cpp.opencv_core.*;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import com.googlecode.javacv.cpp.opencv_features2d.KeyPoint;
import com.googlecode.javacv.cpp.opencv_features2d.ORB;
import com.googlecode.javacv.cpp.opencv_legacy.CvEM;
import com.googlecode.javacv.cpp.opencv_nonfree.SIFT;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;

 
public class demo {
  
    public static void main(String[] args) {
         
     //Load image img1 as IplImage
       /* final IplImage image = cvLoadImage("C:\\Users\\799943\\Pictures\\error - Copy.png");
         
        //create canvas frame named 'Demo'
        final CanvasFrame canvas = new CanvasFrame("Demo");
         
        //Show image in canvas frame
        canvas.showImage(image);
         
        //This will close canvas frame on exit
        canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);  
        */
    	
    	
        //ORB
    	/*
    	 SIFT sift = new SIFT(0, 3, 0.04, 10, 1.6); 
         ORB orb = new ORB(2000, 1.2f, 8, 31, 0, 2, 0, 31); 

         FeatureDetector detector = orb.getFeatureDetector(); 
         DescriptorExtractor descriptor = sift.getDescriptorExtractor(); 

         CvMat db_image_1 = cvLoadImageM("C:\\Users\\799943\\Pictures\\error - Copy.png"); 
         CvMat db_image_2 = cvLoadImageM("C:\\Users\\799943\\Pictures\\error - Copy.png");  

         KeyPoint db_keypoints_1 = new KeyPoint(); 
         KeyPoint db_keypoints_2 = new KeyPoint();  
         KeyPoint match = new KeyPoint();

         CvMat db_descriptors_1 = com.googlecode.javacv.cpp.opencv_core.cvCreateMat(2000, 2000, com.googlecode.javacv.cpp.opencv_core.CV_8UC1); 
         CvMat db_descriptors_2 = com.googlecode.javacv.cpp.opencv_core.cvCreateMat(2000, 2000, com.googlecode.javacv.cpp.opencv_core.CV_8UC1);

         detector.detect(db_image_1, db_keypoints_1, null); 
         System.out.println("KP1: "+ db_keypoints_1.capacity()); 
         detector.detect(db_image_2, db_keypoints_2, null); 
         System.out.println("KP2: "+ db_keypoints_2.capacity()); 
         

         descriptor.compute(db_image_1, db_keypoints_1, db_descriptors_1); 
         System.out.println("DC1: "+db_descriptors_1.rows()); 
         descriptor.compute(db_image_2, db_keypoints_2, db_descriptors_2); 
         System.out.println("DC2: "+db_descriptors_2.rows()); 
    	
         detector.detect(db_image_1, match, db_descriptors_2);
         System.out.println("Match: "+ match.capacity());
         */
    	/*
    	CvMat image = cvLoadImageM("C:\\Users\\799943\\Pictures\\error - Copy.png");
    	CvMat image2 = cvLoadImageM("C:\\Users\\799943\\Pictures\\error - Copy.png");
    	System.out.println(image2.type());
    	System.out.println(com.googlecode.javacv.cpp.opencv_core.CV_8UC1);
    	KeyPoint keypoints = new KeyPoint();
    	ORB orb = new ORB(2000, (float) 1.2, 8, 1, 0, 2, 5, 31);
    	orb.detect(image, image2, keypoints);
    	System.out.println(keypoints.capacity());
    	*/
    	 
    	 
    	
    	

    	
    	System.load("C:\\OpenCV-2.4.8\\opencv\\build\\java\\x86\\opencv_java248.dll");
    	   //   Mat mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
    	    //  System.out.println( "mat = " + mat.dump() );
         
         FeatureDetector detector = FeatureDetector.create(FeatureDetector.ORB);
         DescriptorExtractor descriptor = DescriptorExtractor.create(DescriptorExtractor.ORB);
         DescriptorMatcher matcher = DescriptorMatcher.create(DescriptorMatcher.BRUTEFORCE_HAMMING);

         MatOfKeyPoint keypoints1 = new MatOfKeyPoint();
         MatOfKeyPoint keypoints2 = new MatOfKeyPoint();
         Mat[] descriptors = new Mat[2];
         descriptors[0] = new Mat();
         descriptors[1] = new Mat();

        // IplImage first = cvLoadImage("C:\\Users\\799943\\Pictures\\error - Copy.png");
        // IplImage second = cvLoadImage("C:\\Users\\799943\\Pictures\\error - Copy.png");
         Mat image1 = Mat.eye( 3, 3, CvType.CV_8UC1 );
         Mat image2 = Mat.eye( 3, 3, CvType.CV_8UC1 );
         
         //ORB orb = new ORB();
         //orb.detect(image1, null, keypoints1);
         //System.out.println(image1);
         //System.out.println(keypoints1);
         //detector.detect(image1, keypoints1, null);
         //descriptor.compute(image1, keypoints1, descriptors[0]);

        // detector.detect(image2, keypoints2, null);
         //orb.detect(image2, null, keypoints2);
        // descriptor.compute(image2, keypoints2, descriptors[1]);

         detector.detect(image1, keypoints1, image2);
         System.out.println(keypoints1.size());
         //descriptor.compute(image1, keypoints1, descriptors[0]);
         
         // matcher should include 2 different image's descriptors
        // MatOfDMatch matches = new MatOfDMatch();
        // matcher.match(descriptors[0], descriptors[1], matches);
    	 
    	
    }    
}