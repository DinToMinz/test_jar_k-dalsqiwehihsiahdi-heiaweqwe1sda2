public final class fm
{
  private static int[] b;
  private int c;
  private int d;
  private int e;
  private int f = b[0];
  public int a = b[0];
  
  private static void d()
  {
    b = new int[11];
    b[0] = ((0xC3 ^ 0x98) & (0x98 ^ 0xC3 ^ 0xFFFFFFFF));
    b[1] = " ".length();
    b[2] = "  ".length();
    b[3] = "   ".length();
    b[4] = ('«' + 0 - 60 + 67 ^ '' + '®' - 307 + 164);
    b[5] = (0x6E ^ 0x5B ^ 0x96 ^ 0xA6);
    b[6] = (0xA8 ^ 0x8D ^ 0x82 ^ 0xB3);
    b[7] = (125 + 86 - 158 + 75 ^ 106 + 49 - 105 + 111);
    b[8] = (0x80 ^ 0xBB ^ 0x0 ^ 0x34);
    b[9] = (115 + '' - 204 + 136 ^ 12 + 103 - -18 + 56);
    b[10] = (0xB5 ^ 0xBD);
  }
  
  public fm(int paramInt1, int paramInt2, int paramInt3)
  {
    this.e = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public final void a()
  {
    if (b(this.d, b[1]))
    {
      this.f += b[1];
      if (a(this.f % b[2])) {
        this.a += b[1];
      }
    }
    else
    {
      if (a(this.d))
      {
        this.a += b[1];
        return;
      }
      if ((!a(this.d, b[2])) || (!a(this.d, b[3])) || (!a(this.d, b[4])) || (b(this.d, b[5])))
      {
        this.f += b[1];
        if (a(this.f % b[2])) {
          this.a += b[1];
        }
      }
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final void a(cf paramcf)
  {
    if (a(this.d))
    {
      paramcf.a(fn.da, b[0], this.a * b[3], b[3], b[3], b[0], this.e, this.c, b[0]);
      return;
    }
    if (b(this.d, b[1]))
    {
      paramcf.a(fn.dg, b[0], this.a * b[6], b[6], b[6], b[0], this.e, this.c, b[7]);
      return;
    }
    if (b(this.d, b[2]))
    {
      paramcf.a(fn.dn, b[0], this.a * b[8], b[9], b[8], b[0], this.e + b[6], this.c + b[4], b[6]);
      return;
    }
    if (b(this.d, b[3]))
    {
      paramcf.a(fn.bs, b[0], this.a << b[3], b[10], b[10], b[0], this.e + b[6], this.c + b[4], b[6]);
      return;
    }
    if (b(this.d, b[4]))
    {
      paramcf.a(fn.ed, b[0], this.a << b[3], b[10], b[10], b[0], this.e + b[6], this.c + b[4], b[6]);
      return;
    }
    if (b(this.d, b[5])) {
      paramcf.a(fn.br, b[0], this.a * b[9], b[9], b[9], b[0], this.e + b[6], this.c + b[4], b[6]);
    }
  }
  
  public static void b() {}
  
  static
  {
    cs.a(164);
    b();
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */