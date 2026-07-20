import java.util.Vector;

public final class j
  extends fj
  implements ay
{
  private int f;
  private static int[] g;
  private int h;
  public ek a;
  private int i;
  public ek b;
  private int j;
  private String[] k;
  
  public static void a() {}
  
  static
  {
    cs.a(116);
    a();
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static void d()
  {
    g = new int[20];
    g[0] = (-(0xFD77 & 0x3E9F) & 0xBFFE & 0x7FFF);
    g[1] = (80 + '' - 95 + 28 ^ '·' + '¬' - 220 + 55);
    g[2] = ((0x21 ^ 0x36) & (0x79 ^ 0x6E ^ 0xFFFFFFFF));
    g[3] = ('¢' + 31 - 45 + 28);
    g[4] = (0x1 ^ 0x5B ^ 0x36 ^ 0x66);
    g[5] = "  ".length();
    g[6] = (0x36 ^ 0x4);
    g[7] = (0x79 ^ 0x6D);
    g[8] = " ".length();
    g[9] = (0x9F ^ 0xB4);
    g[10] = "   ".length();
    g[11] = (0xDE ^ 0xC6 ^ 0xD4 ^ 0x99);
    g[12] = (0xE5 ^ 0xA9 ^ 0x0 ^ 0x41);
    g[13] = (0xA5 ^ 0x99 ^ 0xC4 ^ 0xA8);
    g[14] = (0x90 ^ 0x95);
    g[15] = (0xF ^ 0x3A ^ 0x7 ^ 0x3A);
    g[16] = ('' + 11 - 26 + 40);
    g[17] = (0x14 ^ 0x19 ^ 0x19 ^ 0xE);
    g[18] = (0xD7 ^ 0x9D ^ 0x52 ^ 0x3B);
    g[19] = (0xED ^ 0xA2 ^ 0x8F ^ 0x98);
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  public final void a(String paramString, bb parambb1, bb parambb2, int paramInt1, int paramInt2)
  {
    this.b.a("");
    this.b.b(paramInt1);
    this.a.a("");
    this.a.b(paramInt2);
    this.k = ax.c.b(paramString, aw.b - this.h * g[10]);
    paramString = ax.c.a(paramString, aw.b - this.h * g[10]);
    this.i = paramString.size();
    this.c = parambb1;
    this.e = parambb2;
    aw.u = this;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if (a(ax.c.a(paramString1), ax.c.a(paramString2)))
    {
      "".length();
      if ("   ".length() > ((0x74 ^ 0x36) & (0xFF ^ 0xBD ^ 0xFFFFFFFF))) {
        break label65;
      }
    }
    label65:
    ax.c.a(paramString1).f = ax.c.a(paramString2);
    this.h = g[1];
    this.j = g[2];
    if (b(aw.b, g[3])) {
      this.h = g[4];
    }
    this.b.a = (this.h + this.f + g[4]);
    this.b.f = (aw.av - g[5] * f.d - g[6]);
    this.b.h = (aw.b - g[5] * this.h - this.f - g[7]);
    this.b.k = (f.d + g[5]);
    this.b.e = g[8];
    this.b.i = paramString1;
    this.a.a = (this.h + this.f + g[4]);
    this.a.f = (aw.av - f.d - g[9]);
    this.a.h = (aw.b - g[5] * this.h - this.f - g[7]);
    this.a.k = (f.d + g[5]);
    this.a.i = paramString2;
    this.d = this.b.d;
  }
  
  public j()
  {
    new bb("", g[0], null);
    this.b = new ek();
    this.a = new ek();
  }
  
  public final void a(cf paramcf)
  {
    en.a(paramcf, this.h, aw.av - g[11] - f.g - this.i * g[12], aw.b - (this.h << g[8]), g[13] + this.i * g[12], this.k);
    ax.c.a(paramcf, this.b.i + ": ", this.b.a - this.f - g[14], this.b.f + g[14], g[2]);
    this.b.b(paramcf);
    paramcf.c(g[2], g[2], aw.b, aw.av);
    ax.c.a(paramcf, this.a.i + ": ", this.a.a - this.f - g[14], this.a.f + g[14], g[2]);
    this.a.b(paramcf);
    super.a(paramcf);
  }
  
  public final void b()
  {
    if (b(aw.ak[g[5]])) {
      this.j = g[2];
    }
    if (b(aw.ak[g[15]])) {
      this.j = g[8];
    }
    if (c(this.j))
    {
      this.b.e = g[8];
      this.a.e = g[2];
      this.d = this.b.d;
      this.b.d();
      "".length();
      if (null == null) {}
    }
    else
    {
      this.b.e = g[2];
      this.a.e = g[8];
      this.d = this.a.d;
      this.a.d();
    }
    if ((b(aw.s)) && (b(aw.j)) && (b(aw.as)))
    {
      if (b(aw.b(this.b.a, this.b.f, this.b.h, this.b.k))) {
        this.j = g[2];
      }
      if (b(aw.b(this.a.a, this.a.f, this.a.h, this.a.k))) {
        this.j = g[8];
      }
    }
    if (a(this.c))
    {
      this.c.c = (aw.b / g[5] - g[16]);
      this.c.h = (aw.av - g[17]);
    }
    if (a(this.e))
    {
      this.e.c = (aw.b / g[5] - g[18]);
      this.e.h = (aw.av - g[17]);
    }
    if (a(this.d))
    {
      this.d.c = (aw.b / g[5] + g[19]);
      this.d.h = (aw.av - g[17]);
    }
    super.b();
  }
  
  public final void a(int paramInt, Object paramObject) {}
  
  private static boolean c(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final void a(int paramInt)
  {
    if (c(this.j))
    {
      "".length();
      "".length();
      if ("  ".length() >= 0) {}
    }
    else
    {
      "".length();
    }
    super.a(paramInt);
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */