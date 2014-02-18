/**
 * Created by ryandurling on 2/18/14.
 */
public class FlyingFactory {
  public Flying createFlying(String s) {
    return new IFlyLikeFJ();
  }

  public static FlyingFactory getInstance() {
    return null;
  }
}
