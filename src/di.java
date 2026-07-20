import java.io.PrintStream;

public final class di
  extends f
  implements ay
{
  private int h = q[0];
  private bb i;
  private static int[][] j;
  private static int[] k;
  private static int l;
  private static ek m;
  private static int[] n;
  private bb o;
  private static int p;
  private static int[] q;
  private static di r;
  private static int s;
  
  private static boolean b(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public final void f()
  {
    if (d(fn.ad = fn.ad + q[7], aw.b * q[20] + q[8])) {
      fn.ad = q[8];
    }
    if ((c(aw.s)) && (b(aw.b, q[21])))
    {
      if (a(this.a))
      {
        this.a.c = (aw.b / q[3] - q[22]);
        this.a.h = (aw.av - q[12]);
      }
      if (a(this.f))
      {
        this.f.c = (aw.b / q[3] - q[23]);
        this.f.h = (aw.av - q[12]);
      }
      if (a(this.e))
      {
        this.e.c = (aw.b / q[3] + q[24]);
        this.e.h = (aw.av - q[12]);
      }
    }
    if (a(this.o)) {
      this.o.a();
    }
    if (a(this.i)) {
      this.i.a();
    }
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt != 0;
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 8000: 
      dl.ae().a(m.a(), p, j[p][s]);
      return;
    case 8001: 
      if (c(fz.h().n))
      {
        aw.au.b();
        return;
      }
      fz.h().b();
      return;
    case 8002: 
      this.h = q[7];
      l = q[7];
      if ((c(this.h, l)) && (b(p = p - q[7])))
      {
        p = an.me.length - q[7];
        return;
      }
      break;
    case 8003: 
      this.h = q[3];
      l = q[3];
      if ((c(this.h, l)) && (d(s = s + q[7], an.ke[q[0]].length - q[7]))) {
        s = q[0];
      }
      break;
    }
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  public final void a(int paramInt)
  {
    "".length();
  }
  
  public final void b()
  {
    p = aw.ap % q[3];
    s = aw.ap % q[19];
    super.b();
  }
  
  public static di h()
  {
    if (b(r)) {
      r = new di();
    }
    return r;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public final void a(cf paramcf)
  {
    try
    {
      aw.b(paramcf);
      en.d(fn.j, fn.ag, fn.bx, fn.dm, paramcf);
      int i1 = q[29];
      if (c(aw.b, q[1])) {
        i1 = q[30];
      }
      int i2 = j[p][s];
      int i4 = k[p];
      int i6 = n[p];
      fw localfw1 = fn.dp[i2];
      fw localfw2 = fn.dp[i4];
      fw localfw3 = fn.dp[i6];
      int i7 = aw.b / q[3];
      int i8 = fn.ag + q[31];
      dq.a(paramcf, localfw1.a[dt.fe[q[0]][q[0]][q[0]]].b, i7 + dt.fe[q[0]][q[0]][q[7]] + localfw1.a[dt.fe[q[0]][q[0]][q[0]]].a, i8 - dt.fe[q[0]][q[0]][q[3]] + localfw1.a[dt.fe[q[0]][q[0]][q[0]]].c, q[0], q[0]);
      dq.a(paramcf, localfw2.a[dt.fe[q[0]][q[7]][q[0]]].b, i7 + dt.fe[q[0]][q[7]][q[7]] + localfw2.a[dt.fe[q[0]][q[7]][q[0]]].a, i8 - dt.fe[q[0]][q[7]][q[3]] + localfw2.a[dt.fe[q[0]][q[7]][q[0]]].c, q[0], q[0]);
      dq.a(paramcf, localfw3.a[dt.fe[q[0]][q[3]][q[0]]].b, i7 + dt.fe[q[0]][q[3]][q[7]] + localfw3.a[dt.fe[q[0]][q[3]][q[0]]].a, i8 - dt.fe[q[0]][q[3]][q[3]] + localfw3.a[dt.fe[q[0]][q[3]][q[0]]].c, q[0], q[0]);
      if (d(aw.s))
      {
        int i3 = q[0];
        while (a(i3, an.au.length))
        {
          if (c(l, i3))
          {
            if (e(i3))
            {
              "".length();
              if ((0xF2 ^ 0x86 ^ 0xDD ^ 0xAD) > "   ".length()) {
                break label674;
              }
            }
            label674:
            int i5 = q[0];
            if (d(aw.ap % q[35], q[20]))
            {
              "".length();
              if (" ".length() != 0) {
                break label741;
              }
            }
            label741:
            dq.a(q[33], fn.j + q[34], q[7] + q[0], fn.ag + q[36] + i3 * i1 + i5, q[3], dr.j);
            if (d(aw.ap % q[35], q[20]))
            {
              "".length();
              if ("   ".length() > "  ".length()) {
                break label844;
              }
            }
            label844:
            dq.a(q[33], fn.j + fn.bx - q[37], q[7] - q[0], fn.ag + q[36] + i3 * i1 + i5, q[0], dr.j);
          }
          i3++;
          "".length();
          if (-(56 + 22 - -34 + 59 ^ 115 + 40 - 121 + 140) >= 0) {
            return;
          }
        }
      }
      if (c(aw.s))
      {
        this.i.g = an.me[p];
        this.i.a(paramcf);
        this.o.g = an.ke[p][s];
        this.o.a(paramcf);
        "".length();
        if (" ".length() != 0) {}
      }
      else
      {
        en.b(this.i.c, this.i.h, this.i.a, this.i.i, paramcf);
        if (c(l, q[7]))
        {
          paramcf.a(en.f);
          paramcf.b(this.i.c, this.i.h, this.i.a, this.i.i);
          en.b(this.i.c, this.i.h, this.i.a, this.i.i, paramcf);
        }
        en.b(this.o.c, this.o.h, this.o.a, this.o.i, paramcf);
        if (c(l, q[3]))
        {
          paramcf.a(en.f);
          paramcf.b(this.o.c, this.o.h, this.o.a, this.o.i);
          en.b(this.o.c, this.o.h, this.o.a, this.o.i, paramcf);
        }
        ax.n.a(paramcf, an.me[p], fn.j + q[38], fn.ag + q[39] + i1, q[3]);
        ax.n.a(paramcf, an.ke[p][s], fn.j + q[38], fn.ag + q[39] + (i1 << q[7]), q[3]);
      }
      m.a = (fn.j + fn.bx / q[3] - m.h / q[3]);
      m.f = (fn.ag + q[10]);
      m.j = an.dw;
      m.b(paramcf);
      super.a(paramcf);
      paramcf.a(q[0]);
      return;
    }
    catch (Exception localException)
    {
      System.out.println("CreateCharScr.paint(): 0");
      localException.printStackTrace();
    }
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject == null;
  }
  
  public final void e()
  {
    if ((c(aw.ak[q[3]])) && (b(l = l - q[7]))) {
      l = an.au.length - q[7];
    }
    if ((c(aw.ak[q[25]])) && (b(l = l + q[7], an.au.length))) {
      l = q[0];
    }
    if (d(l))
    {
      this.e = m.d;
      m.d();
    }
    if (c(l, q[7]))
    {
      if ((c(aw.ak[q[19]])) && (b(p = p - q[7]))) {
        p = an.me.length - q[7];
      }
      if ((c(aw.ak[q[26]])) && (d(p = p + q[7], an.me.length - q[7]))) {
        p = q[0];
      }
      this.e = null;
    }
    if (c(l, q[3]))
    {
      if ((c(aw.ak[q[19]])) && (b(s = s - q[7]))) {
        s = an.ke[q[0]].length - q[7];
      }
      if ((c(aw.ak[q[26]])) && (d(s = s + q[7], an.ke[q[0]].length - q[7]))) {
        s = q[0];
      }
    }
    if ((c(aw.j)) && (c(aw.b(fn.j + q[27], fn.ag + q[28], fn.bx - q[27], f.d)))) {
      l = q[0];
    }
    super.e();
    aw.b();
    aw.g();
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public di()
  {
    if (c(aw.b, q[1]))
    {
      fn.b(q[1], q[2]);
      fn.j = (aw.b - q[1]) / q[3];
      fn.ag = q[0];
      "".length();
      if (null != null) {
        throw null;
      }
    }
    else
    {
      fn.b(q[4], q[5]);
      fn.j = (aw.b - q[4]) / q[3];
      fn.ag = (aw.av - q[6]) / q[3];
    }
    p = q[7];
    (m = new ek()).c = an.dw;
    m.h = q[8];
    m.a = (fn.j + q[9]);
    m.a = (fn.j + fn.bx / q[3] - m.h / q[3]);
    m.f = (fn.ag + q[10]);
    if (c(aw.b, q[1])) {
      m.h = q[11];
    }
    m.k = q[12];
    m.e = q[7];
    m.b(q[0]);
    p = q[7];
    s = q[0];
    this.f = new bb(an.qu, this, q[13], null);
    this.a = new bb(an.doa, this, q[14], null);
    this.i = new bb("", this, q[15], fn.j + fn.bx / q[3] - f.c / q[3], fn.ag + q[16] + q[17]);
    this.o = new bb("", this, q[18], fn.j + fn.bx / q[3] - f.c / q[3], fn.ag + q[16] + q[16]);
    this.e = m.d;
  }
  
  private static void k()
  {
    q = new int[47];
    q[0] = ((0x3B ^ 0x59) & (0xE8 ^ 0x8A ^ 0xFFFFFFFF));
    q[1] = ((0xC9 ^ 0x9B) + (0x5D ^ 0x39) - (0x77 ^ 0x25) + (0x9F ^ 0x83));
    q[2] = (0x15 ^ 0x6D);
    q[3] = "  ".length();
    q[4] = (64 + 114 - 63 + 55);
    q[5] = (' ' + 24 - 87 + 93);
    q[6] = ('Î' + 72 - 117 + 59);
    q[7] = " ".length();
    q[8] = (94 + '§' - 52 + 22 ^ 111 + 78 - 71 + 13);
    q[9] = (0xED ^ 0xC0);
    q[10] = (0xA6 ^ 0x98);
    q[11] = (52 + 4 - -81 + 1 ^ 109 + 48 - 135 + 160);
    q[12] = (0x3C ^ 0x26);
    q[13] = (0xFF64 & 0x1FDB);
    q[14] = (-(95 + 126 - 170 + 102) & 0x9FDD & 0x7FFB);
    q[15] = (-(0xE995 & 0x76FF) & 0xFFFFFFFE & 0x7FD7);
    q[16] = (0x1F ^ 0x31 ^ 0x3B ^ 0x53);
    q[17] = (0x9F ^ 0x81);
    q[18] = (0xBF67 & 0x5FDB);
    q[19] = (0xC6 ^ 0x82 ^ 0x6C ^ 0x2C);
    q[20] = "   ".length();
    q[21] = (-(0xBAF7 & 0x6FAD) & 0xBBEF & 0x6FF4);
    q[22] = ('' + 50 - 155 + 117);
    q[23] = (0x88 ^ 0xAB);
    q[24] = (0xC9 ^ 0x91);
    q[25] = (0x11 ^ 0x19);
    q[26] = (0x6E ^ 0x68);
    q[27] = (0xAA ^ 0xAF);
    q[28] = (0x53 ^ 0x12);
    q[29] = (0x98 ^ 0x9E ^ 0x76 ^ 0x58);
    q[30] = (0x4C ^ 0x3A ^ 0x25 ^ 0x47);
    q[31] = (0x48 ^ 0x7A);
    q[32] = (-(0xB1 ^ 0xB5 ^ " ".length()));
    q[33] = (0xC3DF & 0x3FFD);
    q[34] = (0x4 ^ 0x55 ^ 0x4E ^ 0x15);
    q[35] = (0xBC ^ 0xBB);
    q[36] = (0x61 ^ 0x20 ^ 0xAD ^ 0xA0);
    q[37] = (0x60 ^ 0x6F);
    q[38] = (0x6 ^ 0x4F ^ 0xDB ^ 0xC7);
    q[39] = (0x66 ^ 0x31 ^ 0xAF ^ 0xBA);
    q[40] = (0x4C ^ 0x47);
    q[41] = (0x61 ^ 0x2C ^ 0xC5 ^ 0x93);
    q[42] = (0xB2 ^ 0xAE);
    q[43] = (0x44 ^ 0x6F ^ 0x26 ^ 0x1A);
    q[44] = (102 + 75 - 21 + 62 ^ 64 + '¬' - 59 + 17);
    q[45] = (0x21 ^ 0x38);
    q[46] = (0x22 ^ 0x2B);
  }
  
  public static void i()
  {
    k();
    j = new int[][] { { q[40], q[12], q[41], q[42] }, { q[3], q[43], q[44], q[45] } };
    k = new int[] { q[46], q[0] };
    n = new int[] { q[34], q[7] };
  }
  
  static
  {
    cs.a(58);
    i();
  }
  
  public static void j() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\di.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */