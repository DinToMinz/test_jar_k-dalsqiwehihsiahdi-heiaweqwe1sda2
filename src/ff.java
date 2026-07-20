import javax.microedition.lcdui.Image;

public final class ff
{
  public int a;
  private int b;
  private static int[] c;
  private int d;
  
  private Object c()
  {
    Object localObject;
    if (a(localObject = et.g.get(String.valueOf(this.a)))) {
      return localObject;
    }
    return null;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(129);
    a();
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static void d()
  {
    c = new int[4];
    c[0] = (0x41 ^ 0x59);
    c[1] = (0x88 ^ 0xBD ^ 0x90 ^ 0xA9);
    c[2] = "   ".length();
    c[3] = (0x65 ^ 0x44);
  }
  
  public final void a(cf paramcf)
  {
    if ((a(aw.ag)) && (a(c()))) {
      paramcf.a((Image)c(), this.d, this.b, c[3]);
    }
  }
  
  public ff(int paramInt1, int paramInt2)
  {
    this.d = (paramInt1 * c[0] + c[1]);
    this.b = (paramInt2 * c[0] + c[0] + c[2]);
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ff.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */