import java.util.Vector;

public final class bs
  extends bg
{
  private int a = v[3];
  private int b;
  private static byte[] g;
  private static int[] h;
  private static int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private ct o;
  private static int[] p;
  private int q;
  private int r;
  private int s;
  private dt t;
  private int u;
  private static int[] v;
  private int w = v[2];
  private int x;
  private static Vector y;
  private short z = v[1];
  private static int aa;
  private boolean ab;
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public final void a(cf paramcf)
  {
    int i1;
    if (c(this.ab))
    {
      i1 = aw.ap % v[23];
      if (b(this.r, v[24]))
      {
        if (d(i1, v[14]))
        {
          dq.a(paramcf, v[25], this.n, this.x, v[3], v[5]);
          return;
        }
        dq.a(paramcf, v[26], this.n, this.x, v[3], v[5]);
        return;
      }
      if (b(this.r, v[27]))
      {
        if (d(i1 = aw.ap % v[28], v[14]))
        {
          dq.a(paramcf, v[29], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[30]))
        {
          dq.a(paramcf, v[31], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[32]))
        {
          dq.a(paramcf, v[29], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[15])) {
          dq.a(paramcf, v[33], this.n, this.x, v[3], v[5]);
        }
      }
      else if (b(this.r, v[34]))
      {
        if (d(i1 = aw.ap % v[35], v[14]))
        {
          dq.a(paramcf, v[36], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[30]))
        {
          dq.a(paramcf, v[37], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[32]))
        {
          dq.a(paramcf, v[38], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[15])) {
          dq.a(paramcf, v[39], this.n, this.x, v[3], v[5]);
        }
      }
      else if (b(this.r, v[40]))
      {
        if (d(i1 = aw.ap % v[28], v[14]))
        {
          dq.a(paramcf, v[41], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[30]))
        {
          dq.a(paramcf, v[31], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[32]))
        {
          dq.a(paramcf, v[42], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[15])) {
          dq.a(paramcf, v[33], this.n, this.x, v[3], v[5]);
        }
      }
      else if ((!a(this.r, v[43])) || (b(this.r, v[44])))
      {
        if (d(i1 = aw.ap % v[28], v[14]))
        {
          dq.a(paramcf, v[41], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[30]))
        {
          dq.a(paramcf, v[31], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[32]))
        {
          dq.a(paramcf, v[42], this.n, this.x, v[3], v[5]);
          return;
        }
        if (d(i1, v[15])) {
          dq.a(paramcf, v[33], this.n, this.x, v[3], v[5]);
        }
      }
    }
    else
    {
      if (e(aa, v[9]))
      {
        paramcf.a(fn.bm, v[3], this.a * v[45], v[46], v[45], i, this.n, this.x, v[3]);
        "".length();
        if (((0xF ^ 0x24) & (0xA8 ^ 0x83 ^ 0xFFFFFFFF)) == 0) {}
      }
      else if ((e(aa, v[11])) && (f(aa, v[9])))
      {
        paramcf.a(fn.bm, v[3], v[3], v[22], v[22], i, this.n, this.x, v[3]);
        "".length();
        if (null == null) {}
      }
      else if ((e(aa, v[13])) && (f(aa, v[11])))
      {
        paramcf.a(fn.bm, v[3], v[3], v[30], v[30], i, this.n, this.x, v[3]);
        "".length();
        if ((0xA2 ^ 0xB8 ^ 0x33 ^ 0x2D) > 0) {}
      }
      else if ((d(aa)) && (f(aa, v[13])))
      {
        paramcf.a(fn.bm, v[3], v[3], v[30], v[30], i, this.n, this.x, v[3]);
      }
      i1 = v[3];
      while (d(i1, y.size()))
      {
        fm localfm;
        if (a(localfm = (fm)y.elementAt(i1))) {
          localfm.a(paramcf);
        }
        i1++;
        "".length();
        if ("  ".length() <= 0) {}
      }
    }
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private void b(int paramInt)
  {
    this.m = paramInt;
    this.j = (this.z * bc.f(paramInt) >> v[0]);
    this.u = (this.z * bc.b(paramInt) >> v[0]);
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public final void a()
  {
    fm localfm1;
    if (e(aa, v[9]))
    {
      localfm1 = new fm(this.n, this.x, v[10]);
      y.addElement(localfm1);
      "".length();
      if (((0x2C ^ 0x36 ^ 0x3 ^ 0x50) & (0xC9 ^ 0x9A ^ 0x4E ^ 0x54 ^ -" ".length())) == ((48 + '' - 124 + 104 ^ 60 + '' - 46 + 4) & ('â' + '®' - 274 + 118 ^ 119 + 37 - 59 + 96 ^ -" ".length()))) {}
    }
    else if ((e(aa, v[11])) && (f(aa, v[9])))
    {
      localfm1 = new fm(this.n, this.x, v[12]);
      y.addElement(localfm1);
      "".length();
      if ("   ".length() > 0) {}
    }
    else if ((e(aa, v[13])) && (f(aa, v[11])))
    {
      localfm1 = new fm(this.n, this.x, v[14]);
      y.addElement(localfm1);
      "".length();
      if (-(0xA1 ^ 0xA5) < 0) {}
    }
    else if ((d(aa)) && (f(aa, v[13])))
    {
      localfm1 = new fm(this.n, this.x, v[5]);
      y.addElement(localfm1);
    }
    int i3;
    if (a(this.t))
    {
      i1 = this.t.eg - this.n;
      i3 = this.t.ey - (this.t.fp >> v[2]) - this.x;
      this.s += v[2];
      if (((!d(bc.a(i1), v[15])) || (c(bc.a(i3), v[15]))) && (f(this.s, v[16])))
      {
        if ((!c(Math.abs((i2 = bc.a(i1, i3)) - this.m), v[4])) || (e(i1 * i1 + i3 * i3, v[17]))) {
          if (d(Math.abs(i2 - this.m), v[18]))
          {
            this.m = i2;
            "".length();
            if (((0xEB ^ 0x8A) & (0x16 ^ 0x77 ^ 0xFFFFFFFF)) < "  ".length()) {}
          }
          else if (((!a(i2 - this.m)) || (c(i2 - this.m, v[8]))) && (c(i2 - this.m, v[19])))
          {
            this.m = bc.d(this.m - v[18]);
            "".length();
            if ("  ".length() > 0) {}
          }
          else
          {
            this.m = bc.d(this.m + v[18]);
          }
        }
        if (d(this.z, v[20])) {
          this.z = ((short)(this.z + v[21]));
        }
        this.j = (this.z * bc.f(this.m) >> v[0]);
        this.u = (this.z * bc.b(this.m) >> v[0]);
        i1 = i1 + this.j >> v[0];
        this.n += i1;
        i3 = i3 + this.u >> v[0];
        this.x += i3;
        i1 = bc.a(i1, -i3);
        i3 = v[3];
        label937:
        do
        {
          if (c(i3, p.length - v[2]))
          {
            i1 = v[3];
            "".length();
            if (((0x9E ^ 0xAB ^ 0x32 ^ 0x3A) & (0x56 ^ 0x3E ^ 0x1F ^ 0x4A ^ -" ".length())) <= " ".length()) {
              break;
            }
            return;
          }
          if ((c(i1, p[i3])) && (f(i1, p[(i3 + v[2])])))
          {
            if (c(i3, v[15]))
            {
              "".length();
              if (((0x1D ^ 0x5C) & (0xF3 ^ 0xB2 ^ 0xFFFFFFFF)) >= 0) {
                break label937;
              }
            }
            i1 = i3;
            "".length();
            if ((0x13 ^ 0x17) >= "  ".length()) {
              break;
            }
            return;
          }
          i3++;
          "".length();
        } while ("  ".length() == "  ".length());
        return;
        this.k = i1;
        this.a = g[this.k];
        i = h[this.k];
      }
    }
    int i2 = v[3];
    int i1 = v[3];
    if (c(this.b))
    {
      if (b(this.b, v[2]))
      {
        i2 = this.o.c - this.n;
        i1 = this.o.b - v[0] - this.x;
        this.s += v[2];
        if (((d(bc.a(i2), v[15])) && (!c(bc.a(i1), v[15]))) || (e(this.s, v[16])))
        {
          this.o.a = v[2];
          "".length();
        }
      }
    }
    else
    {
      i2 = this.t.eg - this.n;
      i1 = this.t.ey - v[0] - this.x;
      this.s += v[2];
      if ((!a(this.t.ee, v[12])) || (b(this.t.ee, v[22])))
      {
        this.n += (this.t.eg - this.n) / v[10];
        this.x += (this.t.ey - this.x) / v[10];
      }
      if (((d(bc.a(i2), v[15])) && (!c(bc.a(i1), v[15]))) || (e(this.s, v[16])))
      {
        this.t.a(this.l, this.q, this.ab, this.r);
        "".length();
        return;
      }
    }
    if ((!c(Math.abs((i3 = bc.a(i2, i1)) - this.m), v[4])) || (e(i2 * i2 + i1 * i1, v[17]))) {
      if (d(Math.abs(i3 - this.m), v[18]))
      {
        this.m = i3;
        "".length();
        if (null == null) {}
      }
      else if (((!a(i3 - this.m)) || (c(i3 - this.m, v[8]))) && (c(i3 - this.m, v[19])))
      {
        this.m = bc.d(this.m - v[18]);
        "".length();
        if (null == null) {}
      }
      else
      {
        this.m = bc.d(this.m + v[18]);
      }
    }
    i2 = i2 + this.j >> v[0];
    this.n += i2;
    i2 = i1 + this.u >> v[0];
    this.x += i2;
    i2 = v[3];
    while (d(i2, y.size()))
    {
      fm localfm2;
      (localfm2 = (fm)y.elementAt(i2)).a();
      if (e(localfm2.a, v[5])) {
        y.removeElementAt(i2);
      }
      i2++;
      "".length();
      if ((0x2C ^ 0x32 ^ 0xD8 ^ 0xC2) != (0x63 ^ 0x5F ^ 0x0 ^ 0x38)) {}
    }
  }
  
  public static void a(int paramInt1, int paramInt2, boolean paramBoolean, short paramShort, int paramInt3, int paramInt4, int paramInt5, dt paramdt)
  {
    aa = paramShort;
    bg.f.addElement(new bs(paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4, paramInt5, paramdt));
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static void d()
  {
    v = new int[73];
    v[0] = (0x18 ^ 0x3D ^ 0x8A ^ 0xA5);
    v[1] = (-(0xE47B & 0x1F94) & 0xB7AF & 0x4D5F);
    v[2] = " ".length();
    v[3] = ((0x3E ^ 0x35) & (0xA2 ^ 0xA9 ^ 0xFFFFFFFF));
    v[4] = ('' + 126 - 100 + 0 ^ '' + 44 - 156 + 162);
    v[5] = "   ".length();
    v[6] = ((0xF7 ^ 0xA5) + (0x5D ^ 0x46) - -(0xDF ^ 0x81) + (0x17 ^ 0x32));
    v[7] = (0xB9AC & 0x477F);
    v[8] = ((0x42 ^ 0x50) + (0x28 ^ 0x6E) - (0x6D ^ 0x42) + (1 + 25 - -110 + 3));
    v[9] = (0x36 ^ 0x52);
    v[10] = "  ".length();
    v[11] = (0x7F ^ 0x4D);
    v[12] = (0xC5 ^ 0xC0);
    v[13] = (0x32 ^ 0x2C);
    v[14] = (0xA8 ^ 0xAC);
    v[15] = (113 + '' - 229 + 139 ^ 40 + 123 - 32 + 50);
    v[16] = (0x4F ^ 0x73);
    v[17] = (-(0xBFF7 & 0x61BB) & 0xB9F7 & 0x77BA);
    v[18] = (0xAE ^ 0xA1);
    v[19] = (-((0x9F ^ 0xC0) + (0xB0 ^ 0xC5) - (21 + 97 - 42 + 66) + (0x3A ^ 0x54)));
    v[20] = (0xA194 & 0x7E6B);
    v[21] = (0xBCE1 & 0x471E);
    v[22] = (0x4E ^ 0xE ^ 0xC9 ^ 0x87);
    v[23] = (0xC6 ^ 0xC1);
    v[24] = (17 + 94 - 71 + 152 ^ '¯' + 65 - 108 + 46);
    v[25] = (0xC73F & 0x3DD3);
    v[26] = (0xF51B & 0xFFF);
    v[27] = (0xC7 ^ 0xB4);
    v[28] = (0xBB ^ 0x92 ^ 0x8E ^ 0xB3);
    v[29] = (-(0xFABD & 0x7D7) & 0xC7F7 & 0x3FFF);
    v[30] = (0x1F ^ 0x17);
    v[31] = (-(0xFB9E & 0x5C6B) & 0xDDEF & 0x7F7D);
    v[32] = (0x7F ^ 0x73);
    v[33] = (-(0xAADD & 0x57BB) & 0xAFFE & 0x57FF);
    v[34] = ('Ô' + 75 - 248 + 197 ^ 113 + 47 - 102 + 94);
    v[35] = (0xAC ^ 0xBD);
    v[36] = (0xC7FF & 0x3D77);
    v[37] = (-(0xEBE5 & 0x541B) & 0xFDFD & 0x477A);
    v[38] = (0xB5F9 & 0x4F7F);
    v[39] = (-(0xFEB3 & 0x73CE) & 0xFFFFFFFB & 0x77FF);
    v[40] = ((0x76 ^ 0x31) + "   ".length() - (0x6D ^ 0x24) + (50 + 80 - 108 + 116));
    v[41] = (0xD5BB & 0x2FF7);
    v[42] = (-(0xFB3F & 0x6CCB) & 0xFDFF & 0x6FBF);
    v[43] = ((0x60 ^ 0x40) + (0x43 ^ 0x61) - -(0xB8 ^ 0x83) + (0x63 ^ 0x70));
    v[44] = (122 + 84 - 138 + 80 + (0xE5 ^ 0xAE) - (0x18 ^ 0x59) + (0x61 ^ 0x64));
    v[45] = (0x11 ^ 0x34 ^ 0x2B ^ 0x19);
    v[46] = (0x84 ^ 0x9B);
    v[47] = (0x4E ^ 0x57);
    v[48] = (0x57 ^ 0x36 ^ 0x2B ^ 0x4C);
    v[49] = (0x2A ^ 0x23);
    v[50] = (0x9A ^ 0x91);
    v[51] = (0x1E ^ 0x15 ^ 0x0 ^ 0x6);
    v[52] = (0xFB ^ 0xBA ^ 0xD6 ^ 0x85);
    v[53] = (0xD1 ^ 0x8B ^ 0x8F ^ 0xC6);
    v[54] = (88 + 50 - 93 + 99 ^ 8 + 80 - 17 + 62);
    v[55] = (0x4C ^ 0x5A);
    v[56] = (0x4A ^ 0x7B ^ 0x75 ^ 0x5C);
    v[57] = (0x64 ^ 0x19 ^ 0x15 ^ 0x4D);
    v[58] = (0xF1 ^ 0xC5);
    v[59] = (0x8E ^ 0xC5);
    v[60] = (0x4E ^ 0x28 ^ 0x29 ^ 0x26);
    v[61] = ((0xD8 ^ 0xB4) + (0x58 ^ 0x2E) - (63 + '®' - 139 + 93) + (0x79 ^ 0x25));
    v[62] = (33 + 31 - -6 + 72);
    v[63] = (26 + 126 - 125 + 138);
    v[64] = ('¬' + 67 - 92 + 48);
    v[65] = ('' + 'µ' - 206 + 107);
    v[66] = ('â' + 'Ó' - 405 + 200);
    v[67] = ('' + 83 - 107 + 77 + (51 + 120 - 151 + 227) - (0xB9AC & 0x47DB) + (24 + 106 - -39 + 41));
    v[68] = (0xF3BF & 0xD5D);
    v[69] = (0xD933 & 0x27FF);
    v[70] = (-(0xD692 & 0x2DFF) & 0xD7DF & 0x2DF3);
    v[71] = (0xE75F & 0x19F9);
    v[72] = (-(0xCB87 & 0x7EFE) & 0xFFFFFFFF & 0x4BF7);
  }
  
  private bs(int paramInt1, int paramInt2, ct paramct)
  {
    this.b = v[2];
    this.n = paramInt1;
    this.x = paramInt2;
    this.o = paramct;
    if (e(paramInt1, paramct.c))
    {
      b(v[6]);
      "".length();
      if (-" ".length() >= "  ".length()) {
        throw null;
      }
    }
    else
    {
      b(v[7]);
    }
    this.z = v[1];
    this.m = v[8];
    this.j = (this.z * bc.f(this.m) >> v[0]);
    this.u = (this.z * bc.b(this.m) >> v[0]);
  }
  
  private bs(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, dt paramdt)
  {
    this.b = v[3];
    this.n = paramInt1;
    this.x = paramInt2;
    this.ab = paramBoolean;
    this.r = paramInt3;
    this.l = paramInt4;
    this.q = paramInt5;
    this.t = paramdt;
    if (c(paramBoolean))
    {
      b(this.w * v[4]);
      this.w += v[2];
      if (e(this.w, v[5])) {
        this.w = v[2];
      }
    }
    else
    {
      if (e(paramInt1, paramdt.eg))
      {
        b(v[6]);
        return;
      }
      b(v[7]);
    }
  }
  
  public static void b()
  {
    d();
    y = new Vector();
    i = v[3];
    g = new byte[] { v[3], v[2], v[10], v[2], v[3], v[2], v[10], v[2], v[3], v[2], v[10], v[2], v[3], v[2], v[10], v[2], v[3], v[2], v[10], v[2], v[3], v[2], v[10], v[2], v[3] };
    h = new int[] { v[3], v[3], v[3], v[23], v[48], v[48], v[48], v[10], v[10], v[5], v[5], v[14], v[12], v[12], v[12], v[2] };
    p = new int[] { v[3], v[18], v[57], v[58], v[59], v[60], v[61], v[62], v[63], v[64], v[65], v[66], v[67], v[68], v[69], v[70], v[71], v[72] };
  }
  
  static
  {
    cs.a(68);
    b();
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static void a(int paramInt1, int paramInt2, ct paramct)
  {
    bg.f.addElement(new bs(paramInt1, paramInt2, paramct));
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bs.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */