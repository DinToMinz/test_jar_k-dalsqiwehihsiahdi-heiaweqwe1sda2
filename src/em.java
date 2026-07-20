public final class em
{
  public String a;
  private static int[] g;
  public short b;
  public int c;
  public String d;
  public String[] e;
  public int f;
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public em(int paramInt1, String paramString1, String paramString2, short paramShort, int paramInt2, String paramString3)
  {
    this.c = paramInt1;
    this.a = paramString1;
    this.b = paramShort;
    this.f = paramInt2;
    this.d = paramString3;
    paramInt1 = g[0];
    if ((!b(aw.b, g[1])) || (a(aw.av, g[2]))) {
      paramInt1 = g[3];
    }
    this.e = ax.t.b(paramString2, paramInt1);
  }
  
  private static void c()
  {
    g = new int[4];
    g[0] = (46 + 44 - 57 + 143);
    g[1] = ((0x42 ^ 0x59) + (0x11 ^ 0x54) - (0xBF ^ 0xB7) + (0x46 ^ 0x6E));
    g[2] = ('' + 17 - 166 + 200);
    g[3] = (0x2 ^ 0x3B ^ 0xF8 ^ 0xA5);
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(98);
    a();
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\em.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */