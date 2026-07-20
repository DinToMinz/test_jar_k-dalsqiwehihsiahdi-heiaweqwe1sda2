import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cf
{
  public static int a;
  public static int b;
  public static int c;
  private static int[] e;
  public Graphics d;
  
  public static int a(Image paramImage)
  {
    return paramImage.getWidth() / c;
  }
  
  public cf() {}
  
  public final void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt1 *= c;
    paramInt2 *= c;
    this.d.drawImage(paramImage, paramInt1, paramInt2, paramInt3);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 *= c;
    paramInt2 *= c;
    paramInt3 *= c;
    paramInt4 *= c;
    this.d.drawArc(paramInt1, paramInt2, paramInt3, paramInt4, e[0], e[1]);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 *= c;
    paramInt2 *= c;
    paramInt3 *= c;
    paramInt4 *= c;
    this.d.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 *= c;
    paramInt2 *= c;
    paramInt3 *= c;
    paramInt4 *= c;
    this.d.setClip(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a()
  {
    e();
    c = e[2];
    a = e[2];
    b = e[3];
  }
  
  static
  {
    cs.a(158);
    a();
  }
  
  public final int b()
  {
    return this.d.getTranslateX() / c;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    paramInt1 *= c;
    paramInt2 *= c;
    paramInt3 *= c;
    paramInt4 *= c;
    paramInt5 *= c;
    paramInt6 *= c;
    this.d.drawRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    paramInt1 *= c;
    paramInt2 *= c;
    paramInt3 *= c;
    paramInt4 *= c;
    paramInt5 *= c;
    paramInt6 *= c;
    this.d.fillRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public final void a(int paramInt)
  {
    this.d.setColor(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    paramInt1 *= c;
    paramInt2 *= c;
    this.d.translate(paramInt1, paramInt2);
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 *= c;
    paramInt2 *= c;
    paramInt3 *= c;
    paramInt4 *= c;
    this.d.drawLine(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final int c()
  {
    return this.d.getTranslateY() / c;
  }
  
  public final void a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    paramInt6 *= c;
    paramInt7 *= c;
    paramInt1 *= c;
    paramInt2 *= c;
    paramInt3 *= c;
    paramInt4 *= c;
    this.d.drawRegion(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public final void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 *= c;
    paramInt2 *= c;
    paramInt3 *= c;
    paramInt4 *= c;
    this.d.drawRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public cf(Graphics paramGraphics)
  {
    this.d = paramGraphics;
  }
  
  public static int b(Image paramImage)
  {
    return paramImage.getHeight() / c;
  }
  
  private static void e()
  {
    e = new int[4];
    e[0] = ((0xCC ^ 0x80) & (0x34 ^ 0x78 ^ 0xFFFFFFFF));
    e[1] = (-(0x9FBF & 0x7ED3) & 0xFFFFFFFF & 0x1FFA);
    e[2] = " ".length();
    e[3] = "  ".length();
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\cf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */