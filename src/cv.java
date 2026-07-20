public final class cv
  extends fj
{
  public int a;
  private static int[] f;
  private int g;
  private int h = f[0];
  public boolean b;
  private String[] i;
  
  public final void a()
  {
    a(an.ki, null, null, null);
    aw.u = this;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public final void b()
  {
    if (b(this.a))
    {
      this.a -= f[3];
      if (d(this.a, f[3]))
      {
        aw.p();
        this.a = f[11];
      }
    }
    super.b();
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(150);
    c();
  }
  
  public final void a(cf paramcf)
  {
    int j = aw.av - this.g - f[14];
    en.d(this.h, j, aw.b - (this.h << f[3]), this.g, paramcf);
    j = j + (this.g - this.i.length * ax.c.c()) / f[5] - f[5];
    if (c(this.b))
    {
      j += 8;
      aw.a(aw.aq, j - f[15], paramcf);
    }
    int k = f[11];
    while (a(k, this.i.length))
    {
      ax.c.a(paramcf, this.i[k], aw.aq, j, f[5]);
      k++;
      j += ax.c.c();
      "".length();
      if ("  ".length() != "  ".length()) {
        return;
      }
    }
    super.a(paramcf);
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt > 0;
  }
  
  public cv()
  {
    if (b(aw.b, f[1])) {
      this.h = f[2];
    }
  }
  
  public final void a(String paramString, bb parambb1, bb parambb2, bb parambb3)
  {
    this.i = ax.c.b(paramString, aw.b - ((this.h << f[3]) + f[4]));
    this.c = parambb1;
    this.e = parambb2;
    this.d = parambb3;
    if (a(parambb2))
    {
      this.e.c = (aw.b / f[5] - f[6]);
      this.e.h = (aw.av - f[7]);
      if (a(parambb1))
      {
        this.c.c = (aw.b / f[5] - f[8]);
        this.c.h = (aw.av - f[7]);
      }
      if (a(parambb3))
      {
        this.d.c = (aw.b / f[5] + f[9]);
        this.d.h = (aw.av - f[7]);
        "".length();
        if (((0x5D ^ 0x69) & (0xB3 ^ 0x87 ^ 0xFFFFFFFF)) == 0) {}
      }
    }
    else
    {
      if (a(parambb1))
      {
        this.c.c = (aw.b / f[5] - f[10]);
        this.c.h = (aw.av - f[7]);
      }
      if (a(parambb3))
      {
        this.d.c = (aw.b / f[5] + f[2]);
        this.d.h = (aw.av - f[7]);
      }
    }
    this.b = f[11];
    this.g = f[10];
    if (c(this.i.length, f[12])) {
      this.g = (this.i.length * ax.c.c() + f[13]);
    }
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static void g()
  {
    f = new int[16];
    f[0] = (0x50 ^ 0x29 ^ 0x21 ^ 0x46);
    f[1] = ((0xBE ^ 0x83) + (0x7 ^ 0x74) - (126 + 34 - 145 + 114) + (77 + 10 - 81 + 123));
    f[2] = (0x97 ^ 0x9D);
    f[3] = " ".length();
    f[4] = (0x40 ^ 0x68);
    f[5] = "  ".length();
    f[6] = (0x7E ^ 0x5D);
    f[7] = (0x4A ^ 0x7F ^ 0xAD ^ 0x82);
    f[8] = (22 + 40 - -92 + 83 ^ 59 + 6 - 63 + 156);
    f[9] = (106 + 26 - 49 + 50 ^ 106 + '¥' - 103 + 0);
    f[10] = (0xE0 ^ 0xB0);
    f[11] = ((115 + 'Õ' - 145 + 33 ^ 32 + 80 - -66 + 6) & (52 + '' - -6 + 18 ^ 23 + 88 - -2 + 75 ^ -" ".length()));
    f[12] = (0xBE ^ 0xBB);
    f[13] = (0x82 ^ 0x96);
    f[14] = (0x94 ^ 0xB2);
    f[15] = (0x66 ^ 0x11 ^ 0xC8 ^ 0xB3);
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\cv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */