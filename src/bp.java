import java.io.PrintStream;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;

public final class bp
  extends f
  implements ay
{
  private bb i;
  private int j;
  private int k = r[3];
  private int l = r[7];
  private String m = "";
  private bb n;
  private ek o;
  public static boolean h;
  private ek p;
  private bb q;
  private static int[] r;
  private String[] s;
  private ek t;
  private boolean u = r[1];
  private static bp v;
  private int w;
  private ek x;
  private int y;
  private boolean z = r[1];
  private static ft aa;
  private int ab = r[2];
  private bb ac;
  private int ad;
  private int ae = r[6];
  private static Image af;
  private int ag;
  private int ah = r[1];
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static void a(boolean paramBoolean)
  {
    aw.ah = paramBoolean;
    if (b(paramBoolean))
    {
      "".length();
      if (((0xB5 ^ 0xA6 ^ 0x74 ^ 0x5E) & (119 + 31 - 123 + 148 ^ 46 + 108 - 143 + 139 ^ -" ".length())) == 0) {
        break label80;
      }
    }
    label80:
    df.a(r[3], r[2]);
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt >= 0;
  }
  
  public final void a(int paramInt)
  {
    if (b(this.t.e))
    {
      "".length();
      "".length();
      if ((0x7F ^ 0x7B) == (0xC1 ^ 0xC5)) {}
    }
    else if (b(this.o.e))
    {
      "".length();
      "".length();
      if (-(0xA9 ^ 0xAC) < 0) {}
    }
    else if ((b(this.z)) && (b(this.p.e)))
    {
      "".length();
      "".length();
      if ((('®' + 0 - 71 + 109 ^ 41 + 3 - 41 + 128) & (16 + '³' - 36 + 96 ^ 38 + 108 - 106 + 128 ^ -" ".length())) >= -" ".length()) {}
    }
    else if ((b(this.z)) && (b(this.x.e)))
    {
      "".length();
    }
    super.a(paramInt);
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public final void f()
  {
    if (c(fn.ad = fn.ad + r[3], aw.b * r[21] + r[11])) {
      fn.ad = r[11];
    }
    this.t.d();
    this.o.d();
    if (b(this.z))
    {
      this.p.d();
      this.x.d();
    }
    if (f(this.ag, this.w)) {
      this.w += (this.ag - this.w >> r[3]);
    }
    if (b(aw.s))
    {
      this.f = null;
      if (b(this.z))
      {
        this.e = this.n;
        "".length();
        if ("  ".length() >= 0) {}
      }
      else
      {
        this.e = this.ac;
        "".length();
        if (-"  ".length() <= 0) {}
      }
    }
    else if (b(this.z))
    {
      this.f = this.n;
      "".length();
      if ((0x54 ^ 0x51) > 0) {}
    }
    else if (d(this.j, r[2]))
    {
      this.f = this.q;
      if (b(this.u))
      {
        this.f.g = an.iu;
        "".length();
        if (null == null) {}
      }
      else
      {
        this.f.g = an.ce;
        "".length();
        if (((0xF4 ^ 0xB4) & (0x7E ^ 0x3E ^ 0xFFFFFFFF)) == 0) {}
      }
    }
    else
    {
      this.f = this.ac;
    }
    if (c(this.ah))
    {
      this.l += this.k * this.ah;
      this.ah += this.k * this.ab;
      if (f(this.ah)) {
        this.k = (-this.k);
      }
      if (g(this.l))
      {
        this.k = (-this.k);
        this.ah -= r[2] * this.ab;
      }
    }
    if ((c(this.ae)) && (d(aw.ap % r[11])))
    {
      this.ae += r[3];
      if (e(this.ae, an.rr.length)) {
        this.ae = r[1];
      }
      this.s = ax.t.b(an.rr[this.ae], aw.b - r[27]);
    }
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject == null;
  }
  
  private void m()
  {
    this.ae = (aw.ap % an.rr.length);
    this.s = ax.t.b(an.rr[this.ae], aw.b - r[27]);
    String str1 = this.t.a().toLowerCase().trim();
    String str2 = this.o.a().toLowerCase().trim();
    if (((!b(str1.equals("a"))) || (d(str2.equals("a")))) && (b(str1.equals("b")))) {
      "".length();
    }
    if ((a(str1)) && (a(str2)) && (d(str1.equals(""))))
    {
      if (b(str2.equals("")))
      {
        this.j = r[3];
        this.t.e = r[1];
        this.o.e = r[3];
        this.e = this.o.d;
        return;
      }
      aw.b(an.ls);
      aw.c();
      aw.b(an.df);
      dl.ae().b(str1, str2, "1.8.8");
      h = r[3];
      if (b(this.u))
      {
        df.a("check", r[3]);
        df.a("acc", str1);
        df.a("pass", str2);
        "".length();
        if (-"   ".length() < 0) {}
      }
      else
      {
        df.a("check", r[2]);
        df.a("acc", "");
        df.a("pass", "");
      }
      this.j = r[1];
    }
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private void a(String paramString)
  {
    bv.a = ep.e[r[1]];
    aw.b(an.ls);
    aw.c();
    aw.b(an.nb);
    dl.ae().s();
    dl.ae().c(paramString, this.o.a(), this.x.a());
  }
  
  public static bp h()
  {
    return v;
  }
  
  private static void n()
  {
    r = new int[58];
    r[0] = (-(0x2E ^ 0x15 ^ 0x34 ^ 0x3D));
    r[1] = ("   ".length() & ("   ".length() ^ -" ".length()));
    r[2] = "  ".length();
    r[3] = " ".length();
    r[4] = (0xB7F7 & 0x4FDD);
    r[5] = (0xDEFF & 0x6F53);
    r[6] = (-" ".length());
    r[7] = (-(35 + 33 - -16 + 52 ^ 59 + 41 - -5 + 55));
    r[8] = (0x77 ^ 0x72);
    r[9] = (0x78 ^ 0x7E);
    r[10] = (0x8D ^ 0x90 ^ 0xB7 ^ 0xAE);
    r[11] = (0x99 ^ 0x85 ^ 0x57 ^ 0x2F);
    r[12] = ('' + '' - 227 + 136);
    r[13] = (0xE7 ^ 0xB7);
    r[14] = (0x32 ^ 0x57 ^ 0x6 ^ 0x22);
    r[15] = (62 + 48 - -16 + 46 ^ 73 + 54 - 122 + 173);
    r[16] = ((0xA4 ^ 0x84) + (0xFC ^ 0xA8) - (0xF4 ^ 0x9D) + (0xE ^ 0x72));
    r[17] = ((0x37 ^ 0x6) + (0xBD ^ 0x8F) - -(0x53 ^ 0x49) + (0x68 ^ 0x76));
    r[18] = ((0x5C ^ 0x38) + (0x4 ^ 0x3C) - (60 + 84 - 58 + 51) + (104 + 103 - 152 + 86));
    r[19] = (34 + 18 - 4 + 117 ^ 25 + 112 - 20 + 60);
    r[20] = (0x99 ^ 0xA0);
    r[21] = "   ".length();
    r[22] = (0xD7 ^ 0xB4 ^ 0x5C ^ 0x1C);
    r[23] = (0xA7D9 & 0x5FF6);
    r[24] = (0xBFF1 & 0x47DF);
    r[25] = (-(0xFB35 & 0x1CEF) & 0xBFFE & 0x5FF7);
    r[26] = (-(0xA6F9 & 0x79AE) & 0xF7EF & 0x29F7);
    r[27] = (0xBC ^ 0x94);
    r[28] = ('' + 9 - 126 + 129 ^ 28 + 32 - 34 + 134);
    r[29] = ('' + '®' - 277 + 146 + (0x91 ^ 0x9D) - (104 + 50 - 131 + 107) + (120 + 70 - 96 + 69));
    r[30] = (0x3F ^ 0x6A);
    r[31] = (0x16 ^ 0x19);
    r[32] = ((0xA4 ^ 0x85) + (0x57 ^ 0x65) - (0x23 ^ 0x6D) + (11 + 8 - -32 + 114));
    r[33] = (60 + 20 - 62 + 132);
    r[34] = (0x76 ^ 0x7B ^ 0x45 ^ 0x12);
    r[35] = (0xA0 ^ 0xA7);
    r[36] = (0xB5 ^ 0x87);
    r[37] = (0x16 ^ 0x1B);
    r[38] = (0x3F ^ 0x6B ^ 0x6B ^ 0x35);
    r[39] = (5 + 80 - -12 + 48 ^ 85 + 0 - 36 + 104);
    r[40] = (0xEFE5 & 0x373F);
    r[41] = (0xB77F & 0x6FB9);
    r[42] = (-(0xBB6B & 0x4CD5) & 0xAFFB & 0x7F7E);
    r[43] = (-(0xFF56 & 0x50BB) & 0xD3FF & 0x7FFF);
    r[44] = (0x87F1 & 0x7BFF);
    r[45] = (0x9FFD & 0x6BBA);
    r[46] = (-(0xE4D7 & 0x3F2D) & 0xBFFD & 0x6FBF);
    r[47] = (0xBFED & 0x675F);
    r[48] = (0xF7F6 & 0x2ABB);
    r[49] = (0xCFB1 & 0x3FEE);
    r[50] = (-(0xED ^ 0xBC) & 0xCFFF & 0x3FF1);
    r[51] = (0xFFFFFFD9 & 0x4E6F);
    r[52] = (0xB6F5 & 0x6BBF);
    r[53] = (-(0xF31B & 0x7DE5) & 0xFFFFFFED & 0x37FF7);
    r[54] = (-(0xEB4E & 0x55BB) & 0xDFEF & 0x36FFF);
    r[55] = (-(0xEF85 & 0x55FB) & 0xFDED & 0x7FFE);
    r[56] = (-"   ".length() & 0xBCEF & 0x7B7F);
    r[57] = (-(0xCB ^ 0xC3) & 0xCEBF & 0x7F67);
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public final void e()
  {
    if (b(aw.ak[r[2]]))
    {
      this.j -= r[3];
      if (e(this.j))
      {
        this.j = r[21];
        "".length();
        if (-(0x55 ^ 0x7E ^ 0x6C ^ 0x43) < 0) {}
      }
    }
    else if (b(aw.ak[r[39]]))
    {
      this.j += r[3];
      if (c(this.j, r[21])) {
        this.j = r[1];
      }
    }
    if ((!d(aw.ak[r[2]])) || (b(aw.ak[r[39]])))
    {
      aw.g();
      if (d(this.j, r[3]))
      {
        this.t.e = r[1];
        this.o.e = r[3];
        this.p.e = r[1];
        this.x.e = r[1];
        this.e = this.o.d;
        "".length();
        if (-"  ".length() < 0) {}
      }
      else if (d(this.j))
      {
        this.t.e = r[3];
        this.o.e = r[1];
        this.p.e = r[1];
        this.x.e = r[1];
        this.e = this.t.d;
        "".length();
        if (null == null) {}
      }
      else
      {
        this.t.e = r[1];
        this.o.e = r[1];
        if (b(this.z)) {
          if (d(this.j, r[2]))
          {
            this.p.e = r[3];
            this.x.e = r[1];
            this.e = this.p.d;
            "".length();
            if ("   ".length() != " ".length()) {}
          }
          else if (d(this.j, r[21]))
          {
            this.x.e = r[3];
            this.p.e = r[1];
            this.e = this.x.d;
          }
        }
      }
    }
    if (b(aw.j)) {
      if (b(aw.b(this.t.a, this.t.f, this.t.h, this.t.k)))
      {
        this.j = r[1];
        "".length();
        if ("   ".length() != 0) {}
      }
      else if (b(aw.b(this.o.a, this.o.f, this.o.h, this.o.k)))
      {
        this.j = r[3];
        "".length();
        if ((('Ñ' + 45 - 224 + 190 ^ 113 + 5 - 45 + 63) & (0x67 ^ 0x62 ^ 0xD1 ^ 0x80 ^ -" ".length())) <= 0) {}
      }
      else
      {
        if (b(this.z))
        {
          if (b(aw.b(this.p.a, this.p.f, this.p.h, this.p.k)))
          {
            this.j = r[2];
            "".length();
            if (null == null) {}
          }
          else if (b(aw.b(this.x.a, this.x.f, this.x.h, this.x.k)))
          {
            this.j = r[21];
            "".length();
            if (-(0x6B ^ 0x6E) < 0) {}
          }
        }
        else if (b(aw.b(this.t.a - r[19], aw.al + r[27], r[13], r[19])))
        {
          if (d(this.u))
          {
            "".length();
            if ("  ".length() >= "  ".length()) {
              break label873;
            }
          }
          label873:
          r[3].u = r[1];
        }
        this.j = r[2];
      }
    }
    super.e();
    aw.g();
  }
  
  public final void d()
  {
    super.d();
  }
  
  public final void b()
  {
    if (b(df.d("random"))) {
      df.a("random", de.h());
    }
    this.w = r[0];
    this.z = r[1];
    fn.et = aw.av;
    if (d(aw.q, r[2]))
    {
      aw.a(r[1]);
      "".length();
      if ("   ".length() >= "   ".length()) {}
    }
    else
    {
      aw.a(et.f);
    }
    super.b();
    if (a(fn.eq)) {
      fn.eq = null;
    }
    if (a(aw.af)) {
      aw.af = new eu();
    }
    aw.ah = r[1];
    int i1;
    if (f(i1 = df.c("isSoftKey")))
    {
      df.a("isSoftKey", r[3]);
      fn.l = r[3];
      "".length();
      if (-" ".length() <= 0) {}
    }
    else if (d(i1, r[3]))
    {
      fn.l = r[3];
      "".length();
      if (((0xD4 ^ 0x83 ^ 0xFC ^ 0xB6) & (105 + '' - 129 + 52 ^ 84 + 27 - 98 + 115 ^ -" ".length())) == ((69 + 30 - 5 + 40 ^ '' + 93 - 112 + 29) & (0x35 ^ 0x7A ^ 0xCE ^ 0x8C ^ -" ".length()))) {}
    }
    else if (d(i1, r[2]))
    {
      fn.l = r[1];
    }
    if (e(i1 = df.c("isSound")))
    {
      df.a("isSound", r[3]);
      doa.a = r[3];
      "".length();
      if (-"  ".length() <= 0) {}
    }
    else if (d(i1, r[3]))
    {
      doa.a = r[3];
      "".length();
      if ((0x8B ^ 0x8F) >= " ".length()) {}
    }
    else if (d(i1, r[2]))
    {
      doa.a = r[1];
    }
    this.a = (this.i = new bb("Q.Mật Khẩu", this, r[4], null));
  }
  
  public static Image i()
  {
    return af;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt < 0;
  }
  
  public final void a(cf paramcf)
  {
    paramcf.a(r[1]);
    paramcf.b(r[1], r[1], aw.b, aw.av);
    aw.b(paramcf);
    int i1 = this.t.f - r[28];
    if (b(aw.av, r[29])) {
      i1 += 5;
    }
    if (b(aw.u))
    {
      if (b(this.z))
      {
        en.d(aw.aq - r[30], this.t.f - r[31], r[32], r[33], paramcf);
        "".length();
        if ("  ".length() <= (0x68 ^ 0x48 ^ 0xBF ^ 0x9B)) {}
      }
      else
      {
        en.d(aw.aq - r[30], this.t.f - r[31], r[32], r[34], paramcf);
      }
      localObject = af;
      if ((c(aw.av, r[18])) && (a(localObject))) {
        paramcf.a((Image)localObject, aw.aq, i1 - r[2], r[21]);
      }
      this.t.b(paramcf);
      this.o.b(paramcf);
      if (b(this.z))
      {
        this.p.b(paramcf);
        this.x.b(paramcf);
      }
      paramcf.c(r[1], r[1], aw.b, aw.av);
      if (c(aw.b, r[12]))
      {
        if (b(this.t.a().equals(""))) {
          if (d(this.t.e))
          {
            ax.n.a(paramcf, an.ou, this.t.a + r[8], this.t.f + r[35], r[1]);
            "".length();
            if ((0x4C ^ 0x48) != ((0x29 ^ 0x4B) & (0x27 ^ 0x45 ^ 0xFFFFFFFF))) {}
          }
          else
          {
            ax.p.a(paramcf, an.ou, this.t.a + r[8], this.t.f + r[35], r[1]);
          }
        }
        if (b(this.o.a().equals(""))) {
          if (d(this.o.e))
          {
            ax.n.a(paramcf, an.jp, this.o.a + r[8], this.o.f + r[35], r[1]);
            "".length();
            if ((0x2 ^ 0x19 ^ 0x30 ^ 0x2F) >= 0) {}
          }
          else
          {
            ax.p.a(paramcf, an.jp, this.o.a + r[8], this.o.f + r[35], r[1]);
          }
        }
        if (b(this.z))
        {
          if (b(this.p.a().equals(""))) {
            if (d(this.p.e))
            {
              ax.n.a(paramcf, an.gx, this.p.a + r[8], this.p.f + r[35], r[1]);
              ax.n.a(paramcf, an.jp, this.p.a + r[36], this.p.f + r[35], r[1]);
              "".length();
              if ("   ".length() != 0) {}
            }
            else
            {
              ax.p.a(paramcf, an.gx, this.p.a + r[8], this.p.f + r[35], r[1]);
              ax.p.a(paramcf, an.jp, this.p.a + r[36], this.p.f + r[35], r[1]);
            }
          }
          if (b(this.x.a().equals("")))
          {
            if (d(this.x.e))
            {
              ax.n.a(paramcf, "Email/số di động", this.x.a + r[8], this.x.f + r[8], r[1]);
              "".length();
              if (-"  ".length() < 0) {
                break label1334;
              }
              return;
            }
            ax.p.a(paramcf, "Email/số di động", this.x.a + r[8], this.x.f + r[8], r[1]);
            "".length();
            if (null == null) {
              break label1334;
            }
          }
        }
      }
      else
      {
        if (b(this.t.a().equals(""))) {
          ax.n.a(paramcf, an.pl, this.t.a - r[22], this.t.f + r[35], r[1]);
        }
        if (b(this.o.a().equals(""))) {
          ax.n.a(paramcf, an.lb, this.o.a - r[22], this.o.f + r[35], r[1]);
        }
        if (b(this.z))
        {
          ax.n.a(paramcf, an.eh, this.p.a - r[22], this.p.f - r[3], r[1]);
          ax.n.a(paramcf, an.lb, this.p.a - r[22], this.p.f + r[37], r[1]);
          ax.n.a(paramcf, "Email/số di động", this.x.a - r[22], this.x.f + r[8], r[1]);
        }
      }
      "".length();
      if (null == null) {}
    }
    else if (a(this.s))
    {
      i1 = r[1];
      while (a(i1, this.s.length))
      {
        ax.t.a(paramcf, this.s[i1], aw.b / r[2], this.t.f - r[31] + i1 * r[38], r[2], ax.p);
        i1++;
        "".length();
        if (null != null) {
          return;
        }
      }
    }
    label1334:
    Object localObject = "1.8.8";
    if (b(h)) {
      localObject = au.a().p;
    }
    ax.p.a(paramcf, (String)localObject, aw.b - r[8], r[8], r[3]);
    super.a(paramcf);
  }
  
  public bp()
  {
    v = this;
    this.z = r[1];
    if ((!f(et.f = (byte)(int)(System.currentTimeMillis() % 9L), r[8])) || (d(et.f, r[9]))) {
      et.f = r[10];
    }
    fn.a(r[3]);
    fn.ad = r[11];
    if (c(aw.av, r[12]))
    {
      this.ag = (aw.al - r[13]);
      "".length();
      if ("   ".length() < 0) {
        throw null;
      }
    }
    else
    {
      this.ag = (aw.al - r[14]);
    }
    this.w = r[0];
    this.y = (aw.b - r[15]);
    if (a(this.y, r[16])) {
      this.y = r[16];
    }
    if (c(this.y, r[17])) {
      this.y = r[17];
    }
    this.ad = (aw.al - f.d - r[8]);
    if (b(aw.av, r[18])) {
      this.ad = r[19];
    }
    this.t = new ek();
    this.t.c = an.ou;
    this.t.a = (aw.aq - r[19] - r[20]);
    this.t.f = this.ad;
    this.t.h = this.y;
    this.t.k = (f.d + r[2]);
    this.t.e = r[3];
    this.t.b(r[21]);
    this.o = new ek();
    this.o.c = an.jp;
    this.o.a = (aw.aq - r[19] - r[20]);
    this.o.f = (this.ad += r[22]);
    this.o.h = this.y;
    this.o.k = (f.d + r[2]);
    this.o.e = r[1];
    this.o.b(r[2]);
    this.p = new ek();
    this.p.c = an.hs;
    this.p.a = (aw.aq - r[19] - r[20]);
    this.p.f = (this.ad += r[22]);
    this.p.h = this.y;
    this.p.k = (f.d + r[2]);
    this.p.e = r[1];
    this.p.b(r[2]);
    this.x = new ek();
    this.x.c = "Email/Số di động";
    this.x.a = (aw.aq - r[19] - r[20]);
    this.x.f = (this.ad += r[22]);
    this.x.h = this.y;
    this.x.k = (f.d + r[2]);
    this.x.e = r[1];
    this.x.b(r[21]);
    this.u = r[3];
    if (a(de.h)) {
      if (b(de.h.startsWith("tmpusr")))
      {
        this.t.a("");
        this.o.a("");
        "".length();
        if ("  ".length() == ((0x8 ^ 0x5D) & (0x5E ^ 0xB ^ 0xFFFFFFFF))) {
          throw null;
        }
      }
      else
      {
        this.t.a(de.h);
        this.o.a(de.j);
      }
    }
    this.j = r[1];
    this.ac = new bb(an.nd, this, r[23], null);
    this.q = new bb(an.ce, this, r[24], null);
    this.n = new bb(an.nd, this, r[25], null);
    if (d(this.z))
    {
      this.a = (this.i = new bb("Q.Mật Khẩu", this, r[4], null));
      "".length();
      if (" ".length() >= (0x75 ^ 0x71)) {
        throw null;
      }
    }
    else
    {
      this.a = (this.i = new bb("Hủy", this, r[5], null));
    }
    if ((b(aw.s)) && (e(aw.b, r[26])))
    {
      this.f = null;
      this.e = this.ac;
      return;
    }
    this.f = this.ac;
    this.e = this.t.d;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt <= 0;
  }
  
  public final void j()
  {
    this.z = r[3];
    this.w = r[0];
    fn.et = aw.av;
    if (d(aw.q, r[2]))
    {
      aw.a(r[1]);
      "".length();
      if ("  ".length() >= 0) {}
    }
    else
    {
      aw.a(et.f);
    }
    super.b();
    if (a(fn.eq)) {
      fn.eq = null;
    }
    if (a(aw.af)) {
      aw.af = new eu();
    }
    aw.ah = r[1];
    this.a = (this.i = new bb("Hủy", this, r[5], null));
  }
  
  public static void k()
  {
    n();
    af = aw.c("/tt.png");
    aa = new ft();
  }
  
  static
  {
    cs.a(84);
    k();
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    try
    {
      switch (paramInt)
      {
      case 1002: 
        this.z = r[3];
        this.p.e = r[1];
        this.x.e = r[1];
        this.o.e = r[1];
        this.t.e = r[3];
        this.e = this.t.d;
        this.a = new bb(an.gk, this, r[40], null);
        return;
      case 1003: 
        "".length();
        return;
      case 1004: 
        paramObject = new ci();
        paramInt = df.c("lowGraphic");
        if (d(aw.s)) {
          if (d(paramInt, r[3]))
          {
            ((ci)paramObject).addElement(new bb(an.mq, this, r[41], null));
            "".length();
            if (((0x4 ^ 0x1 ^ 0xE4 ^ 0xC2) & (0xC2 ^ 0xB1 ^ 0xFB ^ 0xAB ^ -" ".length())) == 0) {}
          }
          else
          {
            ((ci)paramObject).addElement(new bb(an.kk, this, r[42], null));
          }
        }
        ((ci)paramObject).addElement(new bb(an.rm, this, r[43], null));
        if (a(aw.ai, this)) {
          ((ci)paramObject).addElement(new bb(an.cp, this, r[44], null));
        }
        aw.af.a((ci)paramObject);
        return;
      case 1005: 
        aw.a(an.jh, new bb("3G/Wifi", this, r[45], null), new bb("GPRS", this, r[46], null));
        return;
      case 1006: 
        aw.a(an.pc, new bb(an.o, this, r[47], null), new bb(an.mm, aw.k(), r[48], null));
        return;
      case 1007: 
        if (d(doa.a))
        {
          "".length();
          if (-" ".length() < " ".length()) {
            break label669;
          }
        }
        if (b(doa.a = r[1]))
        {
          df.a("isSound", r[3]);
          return;
        }
        df.a("isSound", r[2]);
        System.out.println("tat am thanh");
        return;
      case 1009: 
        df.f();
        return;
      case 2000: 
        if ((d(this.t.a().equals(""))) && (d(this.o.a().equals(""))))
        {
          de.i = this.t.a();
          de.k = this.o.a();
        }
        aw.au.b();
        return;
      case 2001: 
        if (b(this.u))
        {
          this.u = r[1];
          return;
        }
        this.u = r[3];
        return;
      case 2002: 
        if (b(this.t.a().equals("")))
        {
          aw.a(an.jl);
          return;
        }
        paramObject = this.t.a().toCharArray();
        paramInt = r[1];
        while (a(paramInt, paramObject.length))
        {
          if (d(ek.a(paramObject[paramInt])))
          {
            aw.a(an.by);
            return;
          }
          paramInt++;
          "".length();
          if (" ".length() >= "  ".length()) {
            return;
          }
        }
        if (b(this.o.a().equals("")))
        {
          aw.a(an.gi);
          return;
        }
        if (b(this.p.a().equals("")))
        {
          aw.a(an.oy);
          return;
        }
        if (a(this.t.a().length(), r[8]))
        {
          aw.a(an.mn);
          return;
        }
        if (d(this.o.a().equals(this.p.a())))
        {
          aw.a(an.jd);
          return;
        }
        if (d(this.x.a().equals("")))
        {
          aw.h.a(an.og[r[1]] + " " + this.t.a() + ", " + an.og[r[3]], new bb(an.o, this, r[49], null), null, new bb(an.mm, aw.t, r[48], null));
          aw.u = aw.h;
          return;
        }
        aw.a("Bạn chưa nhập Email/số di động, Email/số di động giúp bạn lấy lại mật khẩu khi mất mật khẩu", new bb("Tiếp Tục", this, r[50], null), new bb(an.mm, aw.t, r[48], null));
        return;
      case 2003: 
        bv.a("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
        return;
      case 2004: 
        aw.ao.a(an.fv, new bb(an.nd, this, r[51], null), r[1]);
        return;
      case 2005: 
        paramObject = aa;
        gb.a(bv.d).a(((ft)paramObject).a);
        return;
      case 3000: 
        a(r[1]);
        aw.p();
        return;
      case 3001: 
        a(r[3]);
        aw.p();
        return;
      case 4000: 
        a(this.t.a());
        return;
      case 4001: 
        a(this.t.a());
        return;
      case 10021: 
        this.z = r[1];
        this.p.e = r[1];
        this.o.e = r[1];
        this.t.e = r[3];
        this.e = this.t.d;
        this.a = this.i;
        return;
      case 10041: 
        df.a("lowGraphic", r[1]);
        aw.a(an.ey, r[52]);
        return;
      case 10042: 
        df.a("lowGraphic", r[3]);
        aw.a(an.ey, r[52]);
        return;
      case 10051: 
        df.a("isSoftKey", r[3]);
        fn.l = r[3];
        return;
      case 10052: 
        df.a("isSoftKey", r[2]);
        fn.l = r[1];
        return;
      case 10061: 
        aw.p();
        df.a("indLanguage", r[6]);
        bv.d.g();
        return;
      case 20041: 
        this.m = aw.ao.a.a().toString();
        aw.p();
        if (b(this.m.equals("")))
        {
          aw.a(an.jl);
          return;
        }
        aw.a(an.dq, new bb(an.nt, this, r[53], null), new bb(an.mm, this, r[54], null));
        return;
      case 20051: 
        fn.j().b();
        return;
      case 20052: 
        bv.a("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
        return;
      case 200041: 
        aw.af.c = r[1];
        bv.a = "localhost";
        bv.c = r[55];
        df.a("indServer", r[2]);
        m();
        return;
      case 200042: 
        aw.af.c = r[1];
        bv.a = "localhost";
        bv.c = r[56];
        df.a("indServer", r[21]);
        m();
        return;
      case 200421: 
        aw.p();
        paramInt = this.m;
        bv.a = ep.e[r[1]];
        aw.b(an.ls);
        aw.c();
        aw.b(an.ki);
        dl.ae().s(paramInt);
        return;
      case 200422: 
        label669:
        aw.a(an.a(an.jg, this.m));
      }
      if ((e(paramInt, r[57])) && (a(paramInt, r[57] + ep.b.length)))
      {
        paramInt = ep.b[(paramInt - r[57])];
        aw.af.c = r[1];
        bv.a = ep.e[paramInt];
        bv.c = ep.c[paramInt];
        bv.e = ep.a[paramInt];
        df.a("indServer", ep.b[paramInt]);
        m();
      }
      return;
    }
    catch (ConnectionNotFoundException localConnectionNotFoundException)
    {
      (paramObject = localConnectionNotFoundException).printStackTrace();
    }
  }
  
  public static void l() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */