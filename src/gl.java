import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.midlet.MIDlet;

public abstract class gl
{
  private Hashtable a;
  private static final Hashtable b = new Hashtable();
  private boolean c = false;
  public static MIDlet k;
  public static String l;
  public go m;
  private static byte[] d = new byte['က'];
  
  protected gl()
  {
    e(l);
  }
  
  public void e()
  {
    gb localgb;
    (localgb = gb.a(this)).a(localgb.d());
  }
  
  public void f()
  {
    try
    {
      b();
      return;
    }
    catch (Throwable localThrowable)
    {
      gb.c.a(localThrowable, this);
    }
  }
  
  protected abstract void a(boolean paramBoolean);
  
  public String b(String paramString)
  {
    return (String)this.a.get(paramString);
  }
  
  public void g()
  {
    if (!this.c)
    {
      this.c = true;
      try
      {
        a(true);
      }
      catch (Throwable localThrowable)
      {
        gb.c.a(localThrowable, this);
      }
      gb.c.a(this);
    }
  }
  
  public void h()
  {
    gb.c.a();
  }
  
  protected abstract void c();
  
  public void i()
  {
    gb.c.b();
  }
  
  protected abstract void b();
  
  public final boolean c(String paramString)
  {
    return paramString = k.platformRequest(paramString);
  }
  
  public final int d(String paramString)
  {
    return k.checkPermission(paramString);
  }
  
  public final void e(String paramString)
  {
    if ((this.a = (Hashtable)b.get(paramString)) == null)
    {
      this.a = new Hashtable();
      b.put(paramString, this.a);
      if ((paramString = getClass().getResourceAsStream(paramString)) != null)
      {
        String str2 = "";
        try
        {
          String str1;
          while ((str1 = a(paramString)) != null)
          {
            int i;
            if ((i = str1.indexOf(':')) > 0) {
              this.a.put(str2 = str1.substring(0, i), str1.substring(i + 1).trim());
            } else if ((str1 = str1.trim()).length() > 0) {
              this.a.put(str2, this.a.get(str2) + str1);
            }
          }
          paramString.close();
          return;
        }
        catch (Throwable localThrowable)
        {
          gb.c.a(localThrowable, this);
        }
      }
    }
  }
  
  private static String a(InputStream paramInputStream)
  {
    int i = 0;
    int j;
    for (;;)
    {
      switch (j = paramInputStream.read())
      {
      case -1: 
      case 10: 
        break;
      case 13: 
        paramInputStream.read();
        break;
      default: 
        d[(i++)] = ((byte)j);
      }
    }
    if ((j == -1) && (i == 0)) {
      return null;
    }
    return new String(d, 0, i, "utf-8");
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gl.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */