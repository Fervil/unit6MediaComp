/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorSnowman()
  {
      Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorSnowman();
    snowman.explore();
    }
  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMirrorVerticalRightToLeft(){
       Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVerticalRightToLeft();
        caterpillar.explore();
  }
  
  public static void testHorizontal(){
       Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMin(){
    Picture flower = new Picture(1000,1000);
    Picture flower1 = new Picture("1.png");
    Picture flower2 =new Picture("2.png");
    Picture flower3 =new Picture("3.png");
    Picture flower4 =new Picture("4.png");
    
    flower1.maxRed();
    
    flower2.greyscale();
    flower2.sepia();
    
    flower3.moreAwesome();
    
    flower4.mirrorVerticalRightToLeft();
    
    flower.copy(flower1,0,0);
    flower.copy(flower2,0,560);
    flower.copy(flower3,424,0);
    flower.copy(flower4,392,424);
    flower.explore();
    flower.write("I HATE MATH.jpg");
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //Picture derp = new Picture();
   // derp.testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
   // derp.testMirrorVerticalRightLeft();
    //testMirrorTemple();
    //testMirrorArms();
   // testMirrorSnowman();
    //testMirrorVerticalRightToLeft();
    //testHorizontal();
    testMin();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    
  }
}