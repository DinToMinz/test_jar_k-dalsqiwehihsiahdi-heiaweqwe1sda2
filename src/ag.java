public final class ag
  extends f
  implements ay
{
  private int j;
  private ek[] k = new ek[p[0]];
  private int l;
  public ce h = new ce();
  public static ag i;
  private int m;
  private String[] n = { "Họ và tên", "Ngày, tháng, năm sinh", "Địa chỉ thường trú", "CMND", "Ngày cấp", "Nơi cấp", "Số điện thoại, địa chỉ thư điện tử (nếu có).", "* Dưới 18 tuổi chỉ có thể chơi 180p 1 ngày" };
  private int o;
  private static int[] p;
  private int q;
  private String[] r = { "Nguyen Van A", "17-03-1991", "34 Phan A p.12 q.BT", "987654321", "01-01-2011", "TP.Hồ Chí Minh", "abc@gmail.com", "" };
  private int s;
  private int t;
  
  public final void e()
  {
    if (c(aw.ak[p[4]]))
    {
      this.q -= p[3];
      if (d(this.q)) {
        this.q = this.n.length;
      }
      this.h.a(this.q * this.h.g);
      "".length();
      if ("   ".length() == "   ".length()) {}
    }
    else if (c(aw.ak[p[1]]))
    {
      this.q += p[3];
      if (b(this.q, this.n.length)) {
        this.q = p[2];
      }
      this.h.a(this.q * this.h.g);
    }
    int i1;
    if ((!b(aw.ak[p[4]])) || (c(aw.ak[p[1]])))
    {
      aw.g();
      i1 = p[2];
      while (d(i1, this.k.length))
      {
        this.k[i1].e = p[2];
        i1++;
        "".length();
        if ("  ".length() == ((0xC ^ 0x6E) & (0xDF ^ 0xBD ^ 0xFFFFFFFF) & ((0x27 ^ 0x74) & (0x16 ^ 0x45 ^ 0xFFFFFFFF) ^ 0xFFFFFFFF))) {
          return;
        }
      }
      if (d(this.q, this.k.length)) {
        this.k[this.q].e = p[3];
      }
      this.h.a(this.q * this.h.g);
    }
    if ((c(aw.b(this.o, this.t, this.l, this.j))) && (c(aw.j)))
    {
      i1 = p[2];
      while (d(i1, this.k.length))
      {
        if (c(aw.b(this.k[i1].a, this.k[i1].f, this.k[i1].h, this.k[i1].k))) {
          this.q = i1;
        }
        i1++;
        "".length();
        if (null != null) {
          return;
        }
      }
    }
    super.e();
    aw.g();
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final void b()
  {
    super.b();
    this.h.a();
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public final void f()
  {
    super.f();
    if (b(fn.ad = fn.ad + p[3], aw.b * p[5] + p[9])) {
      fn.ad = p[9];
    }
    int i1 = p[2];
    while (d(i1, this.k.length))
    {
      this.k[i1].d();
      i1++;
      "".length();
      if ("  ".length() <= 0) {
        return;
      }
    }
    new dx();
    dx localdx;
    if ((!b((localdx = this.h.e()).a)) || (c(localdx.c))) {
      this.q = ((byte)localdx.b);
    }
    this.h.d();
    if (a(this.q, p[14]))
    {
      int i2 = p[2];
      while (d(i2, this.k.length))
      {
        this.k[i2].e = p[2];
        i2++;
        "".length();
        if (null != null) {}
      }
    }
  }
  
  public ag()
  {
    i = this;
    this.o = (aw.aq - p[9]);
    this.t = p[10];
    this.l = p[11];
    this.j = (aw.av - p[12]);
    this.s = (this.l - p[12]);
    this.m = (aw.aq - this.s / p[4]);
    int i1 = p[2];
    while (d(i1, this.k.length))
    {
      this.k[i1] = new ek();
      this.k[i1].c = this.n[i1];
      this.k[i1].a = this.m;
      this.k[i1].f = ((i1 + p[3]) * p[13]);
      this.k[i1].h = this.s;
      this.k[i1].k = (f.d + p[4]);
      this.k[i1].e = p[2];
      this.k[i1].b(p[5]);
      this.k[i1].a(this.r[i1]);
      if (b(i1)) {
        this.k[i1].e = p[3];
      }
      i1++;
      "".length();
      if ("   ".length() < "   ".length()) {
        throw null;
      }
    }
    this.a = new bb(an.cl, this, p[3], null);
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt != 0;
  }
  
  public final void a(cf paramcf)
  {
    paramcf.a(p[2]);
    paramcf.b(p[2], p[2], aw.b, aw.av);
    aw.b(paramcf);
    en.d(this.o, this.t, this.l, this.j, paramcf);
    ax.n.a(paramcf, an.cl, aw.aq, this.t + p[10], p[4]);
    this.h.a(this.n.length, p[13], this.o, this.t + p[15], this.l, this.j - p[15], p[3], p[2]);
    this.h.a(paramcf, this.o, this.t + p[15], this.l, this.j - p[15]);
    int i1 = p[2];
    while (d(i1, this.n.length))
    {
      if (c(i1, this.n.length - p[3]))
      {
        ax.l.a(paramcf, this.n[i1], aw.aq, (i1 + p[3]) * p[13] - p[16], p[4]);
        "".length();
        if ((0x6B ^ 0x6F) >= "  ".length()) {}
      }
      else
      {
        ax.r.a(paramcf, this.n[i1], aw.aq, (i1 + p[3]) * p[13] - p[16], p[4]);
      }
      i1++;
      "".length();
      if (-" ".length() >= (6 + 76 - -52 + 10 ^ '' + '' - 230 + 117)) {
        return;
      }
    }
    i1 = p[2];
    while (d(i1, this.k.length))
    {
      this.k[i1].a(paramcf);
      i1++;
      "".length();
      if (((0x7A ^ 0x4C) & (0x55 ^ 0x63 ^ 0xFFFFFFFF)) > 0) {
        return;
      }
    }
    super.a(paramcf);
  }
  
  public static void h() {}
  
  static
  {
    cs.a(36);
    h();
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static void j()
  {
    p = new int[17];
    p[0] = (0x3A ^ 0x3D);
    p[1] = (0xB7 ^ 0xBF);
    p[2] = ((0xD0 ^ 0x92) & (0x5D ^ 0x1F ^ 0xFFFFFFFF));
    p[3] = " ".length();
    p[4] = "  ".length();
    p[5] = "   ".length();
    p[6] = (34 + '' - 63 + 58 ^ 45 + 84 - 60 + 105);
    p[7] = (0xA8 ^ 0xAD);
    p[8] = (0xC3 ^ 0xC5);
    p[9] = (0xEE ^ 0xC0 ^ 0x8 ^ 0x42);
    p[10] = (0x6B ^ 0x64 ^ 0x2E ^ 0x2B);
    p[11] = ('Ä' + 101 - 213 + 116);
    p[12] = (0x45 ^ 0x6D);
    p[13] = (0x3B ^ 0x9);
    p[14] = (-" ".length());
    p[15] = ((0x62 ^ 0x7E) & (0x40 ^ 0x5C ^ 0xFFFFFFFF) ^ 0xB3 ^ 0xAA);
    p[16] = (0xCA ^ 0xB7 ^ 0x3F ^ 0x4F);
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public final void a(int paramInt)
  {
    super.a(paramInt);
    int i1 = p[2];
    while (d(i1, this.k.length))
    {
      if (c(this.k[i1].e)) {
        "".length();
      }
      i1++;
      "".length();
      if ((0x47 ^ 0x43) < "  ".length()) {}
    }
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 1: 
      dl.ae().a(this.k[p[2]].a(), this.k[p[3]].a(), this.k[p[4]].a(), this.k[p[5]].a(), this.k[p[6]].a(), this.k[p[7]].a(), this.k[p[8]].a());
      aw.at = p[2];
      fn.j().b();
    }
  }
  
  public static void i() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ag.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */