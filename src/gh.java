import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class gh
  extends gq
{
  private static Image a;
  
  protected gh(boolean paramBoolean)
  {
    if (a == null)
    {
      super.setFullScreenMode(true);
      a = Image.createImage(super.getWidth(), super.getHeight());
      super.setFullScreenMode(false);
    }
  }
  
  public void a()
  {
    repaint();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    repaint(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected Graphics b()
  {
    return a.getGraphics();
  }
  
  public int c()
  {
    return 0;
  }
  
  public void a(Graphics paramGraphics)
  {
    try
    {
      paramGraphics.drawImage(a, 0, 0, 20);
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gh.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */