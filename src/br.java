public final class br
  extends fj
{
  private static int[] b;
  private String[] f;
  public ek a;
  private int g = b[0];
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public final void b()
  {
    this.a.d();
    super.b();
  }
  
  public br()
  {
    if (a(aw.b, b[1])) {
      this.g = b[2];
    }
    this.a = new ek();
    this.a.a = (this.g + b[2]);
    this.a.f = (aw.av - f.d - b[3]);
    this.a.h = (aw.b - b[4] * (this.g + b[2]));
    this.a.k = (f.d + b[4]);
    this.a.e = b[5];
    this.d = this.a.d;
  }
  
  public final void a(cf paramcf)
  {
    en.a(paramcf, this.g, aw.av - b[11] - f.g, aw.b - (this.g << b[5]), b[12], this.f);
    this.a.b(paramcf);
    super.a(paramcf);
  }
  
  public static void a() {}
  
  static
  {
    cs.a(6);
    a();
  }
  
  private static void d()
  {
    b = new int[13];
    b[0] = (0xD6 ^ 0x83 ^ 0x33 ^ 0x4E);
    b[1] = (8 + '§' - 91 + 92);
    b[2] = (0x59 ^ 0x3 ^ 0x7A ^ 0x2A);
    b[3] = (0xDA ^ 0x93 ^ 0xCF ^ 0xAD);
    b[4] = "  ".length();
    b[5] = " ".length();
    b[6] = (0xBFFA & 0x62B7);
    b[7] = (14 + 115 - 123 + 154);
    b[8] = (0x12 ^ 0x8);
    b[9] = (0xF ^ 0x33 ^ 0xDA ^ 0xC5);
    b[10] = (0xFD ^ 0xA5);
    b[11] = (0xD9 ^ 0x94);
    b[12] = (0x63 ^ 0x1B ^ 0x62 ^ 0x5F);
  }
  
  public final void a(String paramString, bb parambb, int paramInt)
  {
    try
    {
      this.a.a("");
      this.a.b(paramInt);
      this.f = ax.c.b(paramString, aw.b - (this.g << b[5]));
      this.c = new bb(an.qt, aw.k(), b[6], null);
      this.e = parambb;
      if (a(this.c))
      {
        this.c.c = (aw.b / b[4] - b[7]);
        this.c.h = (aw.av - b[8]);
      }
      if (a(this.e))
      {
        this.e.c = (aw.b / b[4] - b[9]);
        this.e.h = (aw.av - b[8]);
      }
      if (a(this.d))
      {
        this.d.c = (aw.b / b[4] + b[10]);
        this.d.h = (aw.av - b[8]);
      }
      aw.u = this;
      return;
    }
    catch (Exception localException)
    {
      (paramString = localException).printStackTrace();
    }
  }
  
  public final void a(int paramInt)
  {
    "".length();
    super.a(paramInt);
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\br.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */