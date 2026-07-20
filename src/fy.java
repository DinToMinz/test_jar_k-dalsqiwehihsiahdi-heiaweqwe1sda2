public final class fy
{
  public ev a;
  public am[] b;
  public int c;
  public int d;
  public long e;
  public int f;
  public int g;
  public short h;
  public int i;
  public int j;
  public boolean k = m[0];
  private static int[] m;
  public int l;
  
  private static boolean a(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public final int a()
  {
    if (b(dn.h)) {
      return dn.ab;
    }
    return this.i;
  }
  
  public static void b() {}
  
  static
  {
    cs.a(63);
    b();
  }
  
  private static void g()
  {
    m = new int[8];
    m[0] = ((0x9D ^ 0x91) & (0xCA ^ 0xC6 ^ 0xFFFFFFFF));
    m[1] = (-(96 + 0 - 32 + 77) & 0xFFFFFFBF & 0x3333FF);
    m[2] = (0x42 ^ 0x44);
    m[3] = "  ".length();
    m[4] = (0xDC7F & 0x4467C4);
    m[5] = (0xB6 ^ 0xBF);
    m[6] = (0x89 ^ 0x9B);
    m[7] = " ".length();
  }
  
  public final boolean c()
  {
    if (a(b(System.currentTimeMillis() - this.e, this.l))) {
      return m[7];
    }
    return m[0];
  }
  
  public final int d()
  {
    if (b(dn.r)) {
      return dn.k;
    }
    return this.g;
  }
  
  private static int b(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public final int e()
  {
    if (b(dn.w)) {
      return dn.aa;
    }
    return this.c;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  public final void a(int paramInt1, int paramInt2, cf paramcf)
  {
    dq.a(paramcf, this.a.g, paramInt1, paramInt2, m[0], dr.j);
    long l1;
    if (a(a(l1 = System.currentTimeMillis() - this.e, this.l)))
    {
      paramcf.a(m[1]);
      if ((b(this.k)) && (a(aw.ap % m[2], m[3]))) {
        paramcf.a(m[4]);
      }
      int n = (int)(l1 * 18L / this.l);
      paramcf.b(paramInt1 - m[5], paramInt2 - m[5] + n, m[6], m[6] - n);
      return;
    }
    this.k = m[0];
  }
  
  public static void f() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */