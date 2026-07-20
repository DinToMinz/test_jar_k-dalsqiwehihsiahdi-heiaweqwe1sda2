import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class gq
  extends Canvas
{
  private Thread a;
  public static long d = 500L;
  public static int e = 42;
  public static Image f;
  public static Image g;
  
  public final void keyPressed(int paramInt)
  {
    if (paramInt == e)
    {
      (this.a = new gg(this, paramInt)).start();
      return;
    }
    try
    {
      b(paramInt);
      return;
    }
    catch (Throwable paramInt)
    {
      gb.c.a(paramInt, this);
    }
  }
  
  public final void keyReleased(int paramInt)
  {
    if (paramInt == e)
    {
      if (this.a != null) {
        this.a.interrupt();
      }
      return;
    }
    try
    {
      a(paramInt);
      return;
    }
    catch (Throwable paramInt)
    {
      gb.c.a(paramInt, this);
    }
  }
  
  public void paint(Graphics paramGraphics)
  {
    try
    {
      if (f == null)
      {
        g = null;
        a(paramGraphics);
      }
      else
      {
        int i = super.getWidth();
        int j = super.getHeight();
        if ((g == null) || (g.getHeight() != j)) {
          g = Image.createImage(i, j);
        }
        a(g.getGraphics());
        paramGraphics.translate(-paramGraphics.getTranslateX(), -paramGraphics.getTranslateY());
        paramGraphics.setClip(0, 0, i, j);
        paramGraphics.drawImage(g, 0, 0, 20);
        paramGraphics.drawImage(f, i >> 1, j >> 1, 3);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      gb.c.a(localThrowable, this);
    }
  }
  
  protected void a(Graphics paramGraphics) {}
  
  protected void b(int paramInt) {}
  
  protected void a(int paramInt) {}
  
  static Thread a(gq paramgq, Thread paramThread)
  {
    return paramgq.a = null;
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gq.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */