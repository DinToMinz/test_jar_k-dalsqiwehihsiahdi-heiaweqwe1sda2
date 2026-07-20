import java.util.Vector;

public final class fc
  extends dt
{
  public static ch[] gn;
  public ch go;
  private static int[] gq;
  
  private static boolean o(int paramInt)
  {
    return paramInt != 0;
  }
  
  public fc(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.eg = paramInt2;
    this.ey = paramInt3;
    this.ee = paramInt1;
    this.go = gn[paramInt4];
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject == null;
  }
  
  public final void c(cf paramcf)
  {
    if ((o(d())) && (f(this.ee, gq[14])))
    {
      if (o(this.fm))
      {
        super.c(paramcf);
        return;
      }
      if (a(this.go))
      {
        if (g(this.go.a, gq[15]))
        {
          if ((a(dt.g().bw)) && (o(dt.g().bw.equals(this)))) {
            dq.a(paramcf, gq[16], this.eg, this.ey - this.fp - gq[3], gq[0], gq[17]);
          }
          dq.a(paramcf, gq[18], this.eg, this.ey, gq[0], gq[17]);
          ax.t.a(paramcf, String.valueOf(et.b), this.eg, this.ey - gq[7] - gq[5] - ax.q.c(), gq[5]);
          return;
        }
        if (g(this.go.a, gq[19]))
        {
          if ((a(dt.g().bw)) && (o(dt.g().bw.equals(this)))) {
            dq.a(paramcf, gq[16], this.eg, this.ey - this.fp - gq[3], gq[0], gq[17]);
          }
          dq.a(paramcf, gq[20], this.eg, this.ey, gq[0], gq[17]);
          return;
        }
        if (g(this.go.a, gq[21]))
        {
          if ((a(dt.g().bw)) && (o(dt.g().bw.equals(this)))) {
            dq.a(paramcf, gq[16], this.eg, this.ey - this.fp - gq[3], gq[0], gq[17]);
          }
          dq.a(paramcf, gq[22], this.eg, this.ey, gq[0], gq[17]);
          return;
        }
        fw localfw1 = fn.dp[this.go.e];
        fw localfw2 = fn.dp[this.go.d];
        fw localfw3 = fn.dp[this.go.b];
        if (g(this.dm, gq[3]))
        {
          dq.a(paramcf, localfw1.a[dt.fe[this.at][gq[0]][gq[0]]].b, this.eg + dt.fe[this.at][gq[0]][gq[3]] + localfw1.a[dt.fe[this.at][gq[0]][gq[0]]].a, this.ey - dt.fe[this.at][gq[0]][gq[5]] + localfw1.a[dt.fe[this.at][gq[0]][gq[0]]].c, gq[0], gq[0]);
          dq.a(paramcf, localfw2.a[dt.fe[this.at][gq[3]][gq[0]]].b, this.eg + dt.fe[this.at][gq[3]][gq[3]] + localfw2.a[dt.fe[this.at][gq[3]][gq[0]]].a, this.ey - dt.fe[this.at][gq[3]][gq[5]] + localfw2.a[dt.fe[this.at][gq[3]][gq[0]]].c, gq[0], gq[0]);
          dq.a(paramcf, localfw3.a[dt.fe[this.at][gq[5]][gq[0]]].b, this.eg + dt.fe[this.at][gq[5]][gq[3]] + localfw3.a[dt.fe[this.at][gq[5]][gq[0]]].a, this.ey - dt.fe[this.at][gq[5]][gq[5]] + localfw3.a[dt.fe[this.at][gq[5]][gq[0]]].c, gq[0], gq[0]);
          "".length();
          if (-(0xCA ^ 0x8A ^ 0x6C ^ 0x28) < 0) {}
        }
        else
        {
          dq.a(paramcf, localfw1.a[dt.fe[this.at][gq[0]][gq[0]]].b, this.eg - dt.fe[this.at][gq[0]][gq[3]] - localfw1.a[dt.fe[this.at][gq[0]][gq[0]]].a, this.ey - dt.fe[this.at][gq[0]][gq[5]] + localfw1.a[dt.fe[this.at][gq[0]][gq[0]]].c, gq[5], gq[23]);
          dq.a(paramcf, localfw2.a[dt.fe[this.at][gq[3]][gq[0]]].b, this.eg - dt.fe[this.at][gq[3]][gq[3]] - localfw2.a[dt.fe[this.at][gq[3]][gq[0]]].a, this.ey - dt.fe[this.at][gq[3]][gq[5]] + localfw2.a[dt.fe[this.at][gq[3]][gq[0]]].c, gq[5], gq[23]);
          dq.a(paramcf, localfw3.a[dt.fe[this.at][gq[5]][gq[0]]].b, this.eg - dt.fe[this.at][gq[5]][gq[3]] - localfw3.a[dt.fe[this.at][gq[5]][gq[0]]].a, this.ey - dt.fe[this.at][gq[5]][gq[5]] + localfw3.a[dt.fe[this.at][gq[5]][gq[0]]].c, gq[5], gq[23]);
        }
        if ((r(this.cu)) && (a(this.cn)) && (q(this.fm)))
        {
          dq.a(paramcf, this.cn.a[this.cu].a, this.eg + this.cn.a[this.cu].c, this.ey + this.cn.a[this.cu].b, gq[0], gq[6]);
          if (q(aw.ap % gq[5]))
          {
            this.cu += gq[3];
            if (i(this.cu, this.cn.a.length)) {
              this.cu = gq[0];
            }
          }
        }
        if ((a(dt.g().bw)) && (o(dt.g().bw.equals(this))))
        {
          ax.l.a(paramcf, this.go.c + " [" + this.go.a + "]", this.eg, this.ey - this.fp - ax.q.c() - gq[2], gq[5], ax.q);
          dq.a(paramcf, gq[16], this.eg, this.ey - this.fp - gq[5], gq[0], gq[17]);
          return;
        }
        ax.l.a(paramcf, this.go.c + " [" + this.go.a + "]", this.eg, this.ey - this.fp - gq[6] - ax.q.c(), gq[5], ax.q);
      }
    }
  }
  
  private static boolean p(int paramInt)
  {
    return paramInt > 0;
  }
  
  public final void s()
  {
    if (b(this.cn))
    {
      byte[] arrayOfByte = { gq[1], gq[4], gq[4], gq[7], gq[7], gq[10], gq[10] };
      if ((i(dt.g().cj, gq[4])) && (j(dt.g().cj, gq[7])) && (p(dt.g().bs.b)) && (g(arrayOfByte[dt.g().bs.b], this.go.a)))
      {
        if (a(dt.g().fj))
        {
          if ((!a(dt.g().fj)) || (!g(dt.g().fj.e + gq[3], dt.g().fj.a.length))) {
            break label438;
          }
          this.cn = fn.fg[gq[12]];
          "".length();
          if (-(0xB2 ^ 0xA8 ^ 0x58 ^ 0x47) < 0) {
            break label429;
          }
        }
      }
      else
      {
        "".length();
        int i = fn.an();
        if ((!b(dt.g().fj)) || (f(i, this.go.a)))
        {
          if ((!a(dt.g().fj)) || (!g(i, this.go.a))) {
            break label438;
          }
          if (g(dt.g().fj.e + gq[3], dt.g().fj.a.length))
          {
            this.cn = fn.fg[gq[12]];
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) == 0) {
              break label429;
            }
            return;
          }
        }
      }
      this.cn = fn.fg[gq[13]];
      label429:
      this.cu = gq[0];
    }
    label438:
    super.s();
  }
  
  public static void aj()
  {
    int i = gq[0];
    while (h(i, fn.al.size()))
    {
      fc localfc;
      (localfc = (fc)fn.al.elementAt(i)).cn = null;
      localfc.cu = gq[1];
      i++;
      "".length();
      if (-"   ".length() > 0) {}
    }
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean q(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean g(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean r(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean h(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void ak() {}
  
  static
  {
    cs.a(120);
    ak();
  }
  
  private static void ao()
  {
    gq = new int[24];
    gq[0] = ((0x16 ^ 0x25) & (0x3C ^ 0xF ^ 0xFFFFFFFF));
    gq[1] = (-" ".length());
    gq[2] = (0xE ^ 0x9);
    gq[3] = " ".length();
    gq[4] = (61 + 114 - 81 + 48 ^ 52 + '' - 84 + 39);
    gq[5] = "  ".length();
    gq[6] = "   ".length();
    gq[7] = (0xE3 ^ 0xB5 ^ 0x56 ^ 0xA);
    gq[8] = (0xFE ^ 0x8B ^ 0x73 ^ 0x2);
    gq[9] = (0x4D ^ 0x48);
    gq[10] = (0x9A ^ 0x8F ^ 0x47 ^ 0x59);
    gq[11] = (0x4F ^ 0x49);
    gq[12] = (0x8C ^ 0xB2);
    gq[13] = (0x74 ^ 0x4D);
    gq[14] = (0x13 ^ 0x1C);
    gq[15] = (63 + 38 - -52 + 29 ^ 13 + '¸' - 150 + 140);
    gq[16] = (-(0xFFFFFFBF & 0x7463) & 0xFFFFFFFE & 0x77FF);
    gq[17] = (0x64 ^ 0x45);
    gq[18] = (0xFF74 & 0x4AF);
    gq[19] = (0x27 ^ 0x38);
    gq[20] = (0xAFBF & 0x554B);
    gq[21] = (0x30 ^ 0x2F ^ 0x33 ^ 0x37);
    gq[22] = (-(0xEF2A & 0x39FD) & 0xEDFF & 0x3FEF);
    gq[23] = (0x5A ^ 0x42);
  }
  
  private static boolean i(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean j(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public static void al() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */