import java.util.Hashtable;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;

public class gb
{
  private Displayable d;
  public static Display a;
  public static Hashtable b = new Hashtable();
  public static ga c;
  
  private gb(gl paramgl)
  {
    b.put(paramgl, this);
  }
  
  public void a(Runnable paramRunnable)
  {
    a.callSerially(paramRunnable);
  }
  
  public void a(Item paramItem)
  {
    if (paramItem != null) {
      try
      {
        a.setCurrentItem(paramItem);
        this.d = a.getCurrent();
        return;
      }
      catch (Throwable paramItem)
      {
        c.a(paramItem, this);
      }
    }
  }
  
  public boolean a(int paramInt)
  {
    return a.flashBacklight(paramInt);
  }
  
  public boolean b(int paramInt)
  {
    return a.vibrate(paramInt);
  }
  
  public static gb a(gl paramgl)
  {
    gb localgb;
    if ((localgb = (gb)b.get(paramgl)) == null) {
      localgb = new gb(paramgl);
    }
    return localgb;
  }
  
  public synchronized void a(Displayable paramDisplayable)
  {
    if (a == null)
    {
      c.a();
      return;
    }
    a.setCurrent(this.d = paramDisplayable);
  }
  
  public void a(gd paramgd, Displayable paramDisplayable)
  {
    a.setCurrent(paramgd, paramDisplayable == null ? this.d : (this.d = paramDisplayable));
  }
  
  public boolean a()
  {
    return a.isColor();
  }
  
  public int b()
  {
    return a.numAlphaLevels();
  }
  
  public int c()
  {
    return a.numColors();
  }
  
  public Displayable d()
  {
    return this.d;
  }
  
  public int c(int paramInt)
  {
    return a.getColor(paramInt);
  }
  
  public int d(int paramInt)
  {
    return a.getBestImageWidth(paramInt);
  }
  
  public int e(int paramInt)
  {
    return a.getBestImageHeight(paramInt);
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gb.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */