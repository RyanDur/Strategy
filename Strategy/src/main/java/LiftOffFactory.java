/**
 * Created by ryandurling on 2/18/14.
 */
public class LiftOffFactory {
  public LiftOff createLiftOff(String s) {
    LiftOff result;
    if (s == "Vertically") {
      result = new ILiftOffV();
    } else {
      result = new ILiftOffH();
    }
    return result;
  }
}
