public final class eb
{
  public byte a = g[0];
  public int b;
  private static int[] g;
  public int c;
  public static e d;
  public int e = g[0];
  public int f;
  
  public eb(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.c = paramInt2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static void d()
  {
    g = new int[4];
    g[0] = ((0xB6 ^ 0xA3) & (0x1F ^ 0xA ^ 0xFFFFFFFF));
    g[1] = (0xBF ^ 0xA1);
    g[2] = (0x87 ^ 0x8F);
    g[3] = " ".length();
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public final boolean a()
  {
    if ((a(this.f, fn.ad)) && (b(this.f, fn.ad + fn.au)) && (a(this.c, fn.dz)) && (b(this.c, fn.dz + fn.et + g[1])) && ((!a(d)) || (c(d.j, g[2])))) {
      return g[3];
    }
    return g[0];
  }
  
  public static void b() {}
  
  static
  {
    cs.a(112);
    b();
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\eb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */