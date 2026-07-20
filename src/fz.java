public final class fz
  extends f
  implements ay
{
  public int[] h;
  public String[] i;
  public int[] j;
  public byte[] k;
  public String[] l;
  public int[] m;
  private int s;
  public boolean n = x[2];
  private int t;
  public static String o;
  private int u;
  private int v = x[1];
  public int[] p;
  private int w;
  private static int[] x;
  private static fz y;
  public int q;
  private int z = x[0];
  public int[] r;
  private bb aa;
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static fz h()
  {
    if (a(y)) {
      y = new fz();
    }
    return y;
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt > 0;
  }
  
  private void k()
  {
    if (b(this.l[this.q]))
    {
      o = this.l[this.q];
      dl.ae().d(this.l[this.q]);
      aw.b(an.ki);
      aw.x = x[2];
      return;
    }
    di.h().b();
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public final void b()
  {
    et.a();
    System.gc();
    super.b();
    int i1 = x[21];
    while (c(i1, this.l.length)) {
      if (b(this.l[i1]))
      {
        this.n = x[21];
        "".length();
        if (-" ".length() <= "   ".length()) {
          break;
        }
      }
      else
      {
        i1++;
        "".length();
        if ("  ".length() < 0) {
          return;
        }
      }
    }
    if (e(this.n)) {
      di.h().b();
    }
  }
  
  public fz()
  {
    if (c(aw.b, x[3])) {
      this.z = x[4];
    }
    this.u = x[5];
    this.s = ((aw.b - x[6] * this.z >> x[2]) - x[7]);
    this.w = (aw.al - (this.v >> x[2]) + x[8]);
    if ((e(aw.s)) && (d(aw.b, x[9])))
    {
      this.z = x[10];
      this.u = x[11];
      this.v = x[12];
      this.s = ((aw.b - x[6] * this.z >> x[2]) - x[13]);
      this.w = (aw.al - (this.v >> x[2]));
      if (c(aw.b, x[14]))
      {
        this.u = x[15];
        this.s = ((aw.b - x[6] * this.z >> x[2]) - x[15]);
      }
    }
    this.a = null;
    this.aa = new bb(an.jt, this, x[16], null);
    this.f = new bb("", this, x[16], null);
    this.e = new bb(an.bs, this, x[17], null);
    this.a = this.aa;
    if (e(aw.s))
    {
      this.f = null;
      this.a = null;
    }
    if ((e(aw.s)) && (a(aw.b, x[14])))
    {
      this.e.c = (aw.b / x[18] + x[19]);
      this.e.h = (aw.av - x[20]);
    }
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public final void a(cf paramcf)
  {
    aw.b(paramcf);
    int i1 = x[21];
    while (c(i1, x[6]))
    {
      if (b(this.q, i1))
      {
        en.c(this.s + i1 * (this.z + this.u), this.w, this.z, this.v, paramcf);
        "".length();
        if (null == null) {}
      }
      else
      {
        en.a(this.s + i1 * (this.z + this.u), this.w, this.z, this.v, paramcf);
      }
      en.b(this.s + i1 * (this.z + this.u), this.w, this.z, this.v, paramcf);
      i1++;
      "".length();
      if ("  ".length() <= -" ".length()) {
        return;
      }
    }
    i1 = x[21];
    while (c(i1, x[6]))
    {
      if (b(this.l[i1]))
      {
        fw localfw1 = fn.dp[this.p[i1]];
        fw localfw2 = fn.dp[this.j[i1]];
        fw localfw3 = fn.dp[this.h[i1]];
        fw localfw4 = fn.dp[this.m[i1]];
        if ((b(localfw1.a)) && (a(localfw1.a.length, x[25]))) {
          i2 = x[21];
        }
        while (c(i2, localfw1.a.length)) {
          if ((!b(localfw1.a[i2])) || (b(dq.a(localfw1.a[i2].b))))
          {
            "".length();
            localfw1 = dt.i(this.k[i1]);
            "".length();
            if (((0xBE ^ 0x8E) & (0x72 ^ 0x42 ^ 0xFFFFFFFF)) >= 0) {
              break;
            }
          }
          else
          {
            i2++;
            "".length();
            if (-"   ".length() >= 0)
            {
              return;
              "".length();
              localfw1 = dt.i(this.k[i1]);
            }
          }
        }
        int i2 = this.s + i1 * (this.z + this.u) + this.z / x[18];
        int i3;
        if (b(aw.s))
        {
          i3 = this.w + this.v / x[18] + x[26];
          dq.a(paramcf, localfw4.a[dt.fe[x[21]][x[6]][x[21]]].b, i2 + dt.fe[x[21]][x[6]][x[2]] + localfw4.a[dt.fe[x[21]][x[6]][x[21]]].a, i3 - dt.fe[x[21]][x[6]][x[18]] + localfw4.a[dt.fe[x[21]][x[6]][x[21]]].c, x[21], x[21]);
          dq.a(paramcf, localfw1.a[dt.fe[x[21]][x[21]][x[21]]].b, i2 + dt.fe[x[21]][x[21]][x[2]] + localfw1.a[dt.fe[x[21]][x[21]][x[21]]].a, i3 - dt.fe[x[21]][x[21]][x[18]] + localfw1.a[dt.fe[x[21]][x[21]][x[21]]].c, x[21], x[21]);
          dq.a(paramcf, localfw2.a[dt.fe[x[21]][x[2]][x[21]]].b, i2 + dt.fe[x[21]][x[2]][x[2]] + localfw2.a[dt.fe[x[21]][x[2]][x[21]]].a, i3 - dt.fe[x[21]][x[2]][x[18]] + localfw2.a[dt.fe[x[21]][x[2]][x[21]]].c, x[21], x[21]);
          dq.a(paramcf, localfw3.a[dt.fe[x[21]][x[18]][x[21]]].b, i2 + dt.fe[x[21]][x[18]][x[2]] + localfw3.a[dt.fe[x[21]][x[18]][x[21]]].a, i3 - dt.fe[x[21]][x[18]][x[18]] + localfw3.a[dt.fe[x[21]][x[18]][x[21]]].c, x[21], x[21]);
          if (b(this.q, i1))
          {
            ax.c.a(paramcf, an.fs[x[21]] + ": " + this.l[i1], aw.aq, this.w - x[27], x[18]);
            ax.n.a(paramcf, an.fs[x[2]] + ": " + this.r[i1], aw.aq, this.w - x[28], x[18], ax.a);
            ax.n.a(paramcf, this.i[i1], aw.aq, this.w - x[26], x[18], ax.a);
            "".length();
            if (-" ".length() < 0) {}
          }
        }
        else
        {
          i3 = this.w + this.v / x[18] - x[7];
          dq.a(paramcf, localfw4.a[dt.fe[x[21]][x[6]][x[21]]].b, i2 + dt.fe[x[21]][x[6]][x[2]] + localfw4.a[dt.fe[x[21]][x[6]][x[21]]].a, i3 - dt.fe[x[21]][x[6]][x[18]] + localfw4.a[dt.fe[x[21]][x[6]][x[21]]].c, x[21], x[21]);
          dq.a(paramcf, localfw1.a[dt.fe[x[21]][x[21]][x[21]]].b, i2 + dt.fe[x[21]][x[21]][x[2]] + localfw1.a[dt.fe[x[21]][x[21]][x[21]]].a, i3 - dt.fe[x[21]][x[21]][x[18]] + localfw1.a[dt.fe[x[21]][x[21]][x[21]]].c, x[21], x[21]);
          dq.a(paramcf, localfw2.a[dt.fe[x[21]][x[2]][x[21]]].b, i2 + dt.fe[x[21]][x[2]][x[2]] + localfw2.a[dt.fe[x[21]][x[2]][x[21]]].a, i3 - dt.fe[x[21]][x[2]][x[18]] + localfw2.a[dt.fe[x[21]][x[2]][x[21]]].c, x[21], x[21]);
          dq.a(paramcf, localfw3.a[dt.fe[x[21]][x[18]][x[21]]].b, i2 + dt.fe[x[21]][x[18]][x[2]] + localfw3.a[dt.fe[x[21]][x[18]][x[21]]].a, i3 - dt.fe[x[21]][x[18]][x[18]] + localfw3.a[dt.fe[x[21]][x[18]][x[21]]].c, x[21], x[21]);
          ax.c.a(paramcf, this.l[i1], i2, this.w + this.v / x[18] + x[7], x[18]);
          ax.n.a(paramcf, an.fs[x[2]] + ": " + this.r[i1], i2, this.w + this.v / x[18] + x[29], x[18]);
          if (d(aw.b, x[9])) {
            ax.n.a(paramcf, this.i[i1], i2, this.w + this.v / x[18] + x[30], x[18]);
          }
        }
      }
      i1++;
      "".length();
      if (null != null) {
        return;
      }
    }
    super.a(paramcf);
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  public final void e()
  {
    super.e();
    if (e(aw.ak[x[15]]))
    {
      this.q += x[2];
      if (a(this.q, x[6])) {
        this.q = x[21];
      }
    }
    if (e(aw.ak[x[22]]))
    {
      this.q -= x[2];
      if (d(this.q)) {
        this.q = x[18];
      }
    }
    if ((e(aw.y)) && (e(aw.b(this.s, this.w, x[6] * (this.z + this.u), this.v))))
    {
      int i1;
      if (d(i1 = (aw.f - this.s) / (this.z + this.u), x[18])) {
        i1 = x[18];
      }
      if (d(i1)) {
        i1 = x[21];
      }
      this.q = i1;
    }
    if (e(aw.j)) {
      if (e(aw.b(this.s, this.w, x[6] * (this.z + this.u), this.v)))
      {
        this.t = x[7];
        "".length();
        if (" ".length() <= " ".length()) {}
      }
      else
      {
        this.q = x[23];
      }
    }
    aw.b();
    aw.g();
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 1000: 
      k();
      return;
    case 1001: 
      au.a().c();
      aw.t.o();
    }
  }
  
  private static void l()
  {
    x = new int[31];
    x[0] = (" ".length() ^ 0x9E ^ 0xAF);
    x[1] = (0x4D ^ 0x18);
    x[2] = " ".length();
    x[3] = ((0x37 ^ 0x3C) + (0xF9 ^ 0xBA) - -(0x7F ^ 0x5C) + (0x3E ^ 0x11));
    x[4] = (0xA1 ^ 0x81);
    x[5] = (0xF8 ^ 0xA1 ^ 0x20 ^ 0x7E);
    x[6] = "   ".length();
    x[7] = (0x6F ^ 0x6A);
    x[8] = (0xB5 ^ 0xBF);
    x[9] = (112 + 108 - 85 + 65);
    x[10] = (0x5 ^ 0x2F ^ 0x49 ^ 0x29);
    x[11] = (0x95 ^ 0x8E ^ "  ".length());
    x[12] = (0xEF ^ 0x81);
    x[13] = (0xAD ^ 0xB9);
    x[14] = (0xADFA & 0x5345);
    x[15] = (0x0 ^ 0x6);
    x[16] = (0xDBFB & 0x27EC);
    x[17] = (-(0xB927 & 0x7EDF) & 0xBFEF & 0x7BFF);
    x[18] = "  ".length();
    x[19] = (0x3F ^ 0x67);
    x[20] = (0xE0 ^ 0xBE ^ 0x87 ^ 0xC3);
    x[21] = ((0x1E ^ 0x52 ^ 0xF9 ^ 0x96) & (0xA8 ^ 0x90 ^ 0x18 ^ 0x3 ^ -" ".length()));
    x[22] = (0x55 ^ 0x51);
    x[23] = (-" ".length());
    x[24] = (0x13 ^ 0x77);
    x[25] = (56 + 115 - 12 + 1 ^ '' + '' - 150 + 25);
    x[26] = ("   ".length() ^ 0x47 ^ 0x54);
    x[27] = (0x2E ^ 0x3);
    x[28] = (0x14 ^ 0x43 ^ 0x2B ^ 0x60);
    x[29] = (0x6A ^ 0x7C);
    x[30] = (83 + 109 - 144 + 123 ^ 63 + 76 - 134 + 132);
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt >= 0;
  }
  
  public static void i()
  {
    l();
    o = "";
  }
  
  static
  {
    cs.a(59);
    i();
  }
  
  public final void f()
  {
    if (d(fn.ad = fn.ad + x[2], aw.b * x[6] + x[24])) {
      fn.ad = x[24];
    }
    if (c(this.t))
    {
      this.t -= x[2];
      if ((b(this.t)) && (f(this.q))) {
        k();
      }
    }
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public static void j() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fz.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */