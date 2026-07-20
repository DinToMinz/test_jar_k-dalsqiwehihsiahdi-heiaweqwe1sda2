import javax.microedition.lcdui.Image;

public final class ba
{
  private int a;
  private int b;
  private int[] c;
  private int d;
  private Image e;
  private int f;
  private static int[] g;
  
  public static void a() {}
  
  static
  {
    cs.a(57);
    a();
  }
  
  private static void c()
  {
    g = new int[1];
    g[0] = ((0x72 ^ 0x5E) & (0x33 ^ 0x1F ^ 0xFFFFFFFF));
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, cf paramcf)
  {
    if ((a(paramInt1)) && (a(paramInt1, this.d))) {
      paramcf.a(this.e, g[0], this.c[paramInt1], this.b, this.a, paramInt4, paramInt2, paramInt3, paramInt5);
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt >= 0;
  }
  
  public ba(Image paramImage, int paramInt1, int paramInt2)
  {
    this.e = paramImage;
    this.b = paramInt1;
    this.a = paramInt2;
    this.f = paramImage.getHeight();
    this.d = (this.f / paramInt2);
    this.c = new int[this.d];
    paramImage = g[0];
    while (a(paramImage, this.d))
    {
      this.c[paramImage] = (paramImage * paramInt2);
      paramImage++;
      "".length();
      if ("  ".length() <= 0) {
        throw null;
      }
    }
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ba.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */