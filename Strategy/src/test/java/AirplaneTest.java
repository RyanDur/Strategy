/**
 *
 */

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author oded
 */
public class AirplaneTest {
  private static FlyingFactory flyingFactory;
  private static LiftOffFactory liftOffFactory;

  @BeforeClass
  public static void onlyOnce() {
    flyingFactory = new FlyingFactory();
    liftOffFactory = new LiftOffFactory();
  }

  @Test
  public void test1() {

    String expectedOutput = "Like a fighter jet";
    String stringReturned;

    Flying fly = flyingFactory.createFlying("Fighter Jet");
    LiftOff liftOff = liftOffFactory.createLiftOff("Vertically");

    Airplane classUnderTest = new Airplane(liftOff, fly);

    stringReturned = classUnderTest.howDoYouFly();

    assertEquals("Wrong Answer !", expectedOutput, stringReturned);

  }


  @Test
  public void test2() {

    String expectedOutput = "I don't Fly";
    String stringReturned;

    Flying fly = flyingFactory.createFlying("Model Airplane");
    LiftOff liftOff = liftOffFactory.createLiftOff("Horizontally");

    Airplane classUnderTest = new Airplane(liftOff, fly);

    stringReturned = classUnderTest.howDoYouFly();

    assertEquals("Wrong Answer !", expectedOutput, stringReturned);

  }

  @Test
  public void test3() {

    String expectedOutput = "Like a passenger airplane";
    String stringReturned;

    Flying fly = new IFlyLikePP();
    LiftOff liftOff = new ILiftOffV();

    Airplane classUnderTest = new Airplane(liftOff, fly);

    stringReturned = classUnderTest.howDoYouFly();

    assertEquals("Wrong Answer !", expectedOutput, stringReturned);

  }


  @Test
  public void test4() {

    String expectedOutput = "Vertically";
    String stringReturned;

    Flying fly = new IFlyLikeFJ();
    LiftOff liftOff = new ILiftOffV();

    Airplane classUnderTest = new Airplane(liftOff, fly);

    stringReturned = classUnderTest.howDoYouLiftOff();

    assertEquals("Wrong Answer !", expectedOutput, stringReturned);

  }

  @Test
  public void test5() {

    String expectedOutput = "I don't LiftOff";
    String stringReturned;

    Flying fly = new IFlyLikeFJ();
    LiftOff liftOff = new IDontLiftOff();

    Airplane classUnderTest = new Airplane(liftOff, fly);

    stringReturned = classUnderTest.howDoYouLiftOff();

    assertEquals("Wrong Answer !", expectedOutput, stringReturned);

  }

  @Test
  public void test6() {

    String expectedOutput = "Horizontally";
    String stringReturned;

    Flying fly = new IFlyLikeFJ();
    LiftOff liftOff = new ILiftOffH();

    Airplane classUnderTest = new Airplane(liftOff, fly);

    stringReturned = classUnderTest.howDoYouLiftOff();

    assertEquals("Wrong Answer !", expectedOutput, stringReturned);

  }
}
