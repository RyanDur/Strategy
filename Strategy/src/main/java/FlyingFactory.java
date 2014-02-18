/**
 * Created by ryandurling on 2/18/14.
 */
public class FlyingFactory {
  public Flying createFlying(String s) {
    Flying result = null;

    if (s == "Fighter Jet") {
      result = new IFlyLikeFJ();
    } else if (s == "Model Airplane") {
      result = new IDontFly();
    }
    return result;
  }
}
