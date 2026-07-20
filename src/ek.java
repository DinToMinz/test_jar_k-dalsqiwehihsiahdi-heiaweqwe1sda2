import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;

public final class ek
  implements ay
{
  private int l = n[0];
  private static String[] m;
  public int a;
  private static int[] n;
  private String o = "";
  private static String[] p;
  private int q = n[0];
  private static int r;
  private int s = n[0];
  private int t = n[14];
  public boolean b;
  public String c = "";
  public bb d;
  public boolean e;
  private static final int[] u;
  private int v = n[0];
  private int w = n[0];
  private int x = n[0];
  private static int y;
  public int f;
  private int z = n[13];
  public static boolean g;
  public int h;
  public String i = "";
  private static int aa;
  private String ab = "";
  private int ac = n[0];
  private int ad = n[12];
  private String ae = "";
  public String j = "";
  public int k;
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public final String a()
  {
    return this.ab;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private void g()
  {
    if (c(this.l, n[3]))
    {
      this.o = "";
      int i1 = n[0];
      while (e(i1, this.ab.length()))
      {
        this.o += "*";
        i1++;
        "".length();
        if (" ".length() <= -" ".length()) {
          return;
        }
      }
      if ((d(this.x)) && (d(this.ac))) {
        this.o = (this.o.substring(n[0], this.ac - n[5]) + this.ab.charAt(this.ac - n[5]) + this.o.substring(this.ac, this.o.length()));
      }
    }
  }
  
  public final void b()
  {
    if ((d(this.ac)) && (d(this.ab.length())))
    {
      this.ab = (this.ab.substring(n[0], this.ac - n[5]) + this.ab.substring(this.ac, this.ab.length()));
      this.ac -= n[5];
      h();
      g();
    }
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final void c()
  {
    gm localgm;
    (localgm = new gm(this.c, "", this.ad, n[0])).addCommand(new Command(an.nd, n[1], n[0]));
    localgm.addCommand(new Command("Cancel", n[2], n[0]));
    localgm.setCommandListener(new fi(this, localgm));
    try
    {
      if (c(this.l, n[3]))
      {
        localgm.setConstraints(n[4]);
        "".length();
        if (" ".length() >= 0) {}
      }
      else if (c(this.l, n[5]))
      {
        localgm.setConstraints(n[3]);
        "".length();
        if (-" ".length() <= "  ".length()) {}
      }
      else
      {
        localgm.setConstraints(n[0]);
        "".length();
        if ((0xC7 ^ 0xC3) == 0) {
          return;
        }
      }
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
      localgm.setString(this.ab);
      "".length();
      gb.a(bv.d).a(localgm);
    }
  }
  
  public final void a(int paramInt)
  {
    this.ad = paramInt;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 1000: 
      b();
    }
  }
  
  public final void a(cf paramcf)
  {
    boolean bool = this.e;
    if (c(this.l, n[3]))
    {
      this.ae = this.o;
      "".length();
      if (-"  ".length() < 0) {}
    }
    else
    {
      this.ae = this.ab;
    }
    if (i(this.ae.equals(""))) {
      this.ae = this.j;
    }
    en.a(paramcf, bool, this.a, this.f, this.h, n[1] + this.s + this.a, this.f + (this.k - ax.c.c()) / n[3], this.ae);
    paramcf.a(n[0]);
    if ((i(this.e)) && (e(this.x)) && ((!h(this.t)) || (e(this.v / n[32] % n[3]))))
    {
      paramcf.a(n[33]);
      paramcf.b(n[32] + this.s + this.a + ax.c.a(this.ae.substring(n[0], this.ac)) - n[5], this.f + (this.k - aa) / n[3] + n[5], n[5], aa);
    }
  }
  
  private void f(int paramInt)
  {
    if (((f(this.l, n[3])) && (!c(this.l, n[2]))) || ((d(paramInt, n[6])) && (!a(paramInt, n[7]))) || ((d(paramInt, n[8])) && (!a(paramInt, n[9]))) || ((d(paramInt, n[10])) && (b(paramInt, n[11])) && (e(this.ab.length(), this.ad))))
    {
      paramInt = this.ab.substring(n[0], this.ac) + (char)paramInt;
      if (e(this.ac, this.ab.length())) {
        paramInt = paramInt + this.ab.substring(this.ac, this.ab.length());
      }
      this.ab = paramInt;
      this.ac += n[5];
      g();
      h();
    }
  }
  
  public ek()
  {
    aa = ax.c.c() + n[5];
    this.d = new bb(an.ng, this, n[15], null);
    if (c(df.c("qwerty"), n[5])) {
      g = n[5];
    }
  }
  
  public final void d()
  {
    this.v += n[5];
    if (d(this.x))
    {
      this.x -= n[5];
      if (e(this.x))
      {
        this.q = n[0];
        if ((c(this.w, n[5])) && (f(this.z, r))) {
          this.w = n[0];
        }
        this.z = n[13];
        g();
      }
    }
    if (d(this.t)) {
      this.t -= n[5];
    }
    if (i(aw.j))
    {
      if (a(aw.ai, ag.i))
      {
        if (a(ag.i)) {
          ag.i = new ag();
        }
        int i1 = ag.i.h.c;
        if (e(aw.b(this.a, this.f - i1, this.h, this.k)))
        {
          this.e = n[0];
          return;
        }
        c();
        return;
      }
      if (i(aw.b(this.a, this.f, this.h, this.k)))
      {
        c();
        return;
      }
      this.e = n[0];
    }
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt < 0;
  }
  
  public final void a(String paramString)
  {
    if (b(paramString))
    {
      this.z = n[13];
      this.x = n[0];
      this.q = n[0];
      this.ab = paramString;
      this.ae = paramString;
      g();
      this.ac = paramString.length();
      h();
    }
  }
  
  private static boolean h(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public final void b(int paramInt)
  {
    this.l = paramInt;
  }
  
  public final void b(cf paramcf)
  {
    paramcf.c(n[0], n[0], aw.b, aw.av);
    boolean bool = this.e;
    if (c(this.l, n[3]))
    {
      this.ae = this.o;
      "".length();
      if (-(54 + 126 - 85 + 83 ^ 80 + '' - 199 + 145) <= 0) {}
    }
    else
    {
      this.ae = this.ab;
    }
    if (i(this.ae.equals(""))) {
      this.ae = this.j;
    }
    en.a(paramcf, bool, this.a, this.f, this.h, this.k, n[1] + this.s + this.a, this.f + (this.k - ax.c.c()) / n[3], this.ae);
    paramcf.c(this.a + n[2], this.f + n[5], this.h - n[1], this.k - n[1]);
    paramcf.a(n[0]);
    if ((i(this.e)) && (e(this.x)) && ((!h(this.t)) || (e(this.v / n[32] % n[3]))))
    {
      paramcf.a(n[33]);
      paramcf.b(n[32] + this.s + this.a + ax.c.a(this.ae.substring(n[0], this.ac)) - n[5], this.f + (this.k - aa) / n[3] + n[5], n[5], aa);
    }
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  private void h()
  {
    if (c(this.l, n[3]))
    {
      this.ae = this.o;
      "".length();
      if (null == null) {}
    }
    else
    {
      this.ae = this.ab;
    }
    if ((g(this.s)) && (e(ax.c.a(this.ae) + this.s, this.h - n[1] - n[16]))) {
      this.s = (this.h - n[14] - ax.c.a(this.ae));
    }
    if (h(this.s + ax.c.a(this.ae.substring(n[0], this.ac))))
    {
      this.s = (-ax.c.a(this.ae.substring(n[0], this.ac)));
      this.s += n[17];
      "".length();
      if ("   ".length() != "  ".length()) {}
    }
    else if (d(this.s + ax.c.a(this.ae.substring(n[0], this.ac)), this.h - n[18]))
    {
      this.s = (this.h - n[14] - ax.c.a(this.ae.substring(n[0], this.ac)) - n[19]);
    }
    if (d(this.s)) {
      this.s = n[0];
    }
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public static void e()
  {
    i();
    y = n[3];
    u = new int[] { n[35], n[29], n[36], n[37], n[38], n[1], n[3] };
    aa = n[0];
    m = new String[] { " 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2áàảãạâấầẩẫậăắằẳẵặ2", "def3đéèẻẽẹêếềểễệ3", "ghi4íìỉĩị4", "jkl5", "mno6óòỏõọôốồổỗộơớờởỡợ6", "pqrs7", "tuv8úùủũụưứừửữự8", "wxyz9ýỳỷỹỵ9", "*", "#" };
    p = new String[] { "0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0" };
    r = n[36];
  }
  
  static
  {
    cs.a(41);
    e();
  }
  
  public final boolean c(int paramInt)
  {
    if ((f(paramInt, n[19])) && (f(paramInt, n[20])) && (f(paramInt, n[21])))
    {
      if ((d(paramInt, n[8])) && (b(paramInt, n[11])) && (e(g)))
      {
        g = n[5];
        df.a("qwerty", n[5]);
      }
      if (i(g))
      {
        if (c(paramInt, n[22]))
        {
          if ((c(paramInt, this.z)) && (e(this.x, u[y])))
          {
            this.ab = (this.ab.substring(n[0], this.ac - n[5]) + n[23]);
            this.ae = this.ab;
            g();
            h();
            this.z = n[13];
            return n[0];
          }
          this.z = n[22];
        }
        if (d(paramInt, n[24]))
        {
          f(paramInt);
          return n[0];
        }
      }
      if (c(paramInt, r))
      {
        this.w += n[5];
        if (a(this.w, n[2])) {
          this.w = n[0];
        }
        this.x = n[5];
        this.z = paramInt;
        return n[0];
      }
      if (c(paramInt, n[25])) {
        paramInt = n[26];
      }
      if (c(paramInt, n[27])) {
        paramInt = n[28];
      }
      if ((d(paramInt, n[6])) && (b(paramInt, n[28])))
      {
        if ((i(this.l)) && (f(this.l, n[3])) && (f(this.l, n[2])))
        {
          if (c(this.l, n[5]))
          {
            f(paramInt);
            this.x = n[5];
            "".length();
            if (((0xD6 ^ 0xC2 ^ 0x32 ^ 0x3D) & ('' + '' - 157 + 33 ^ 47 + 33 - -20 + 79 ^ -" ".length())) != 0) {
              return (0x2A ^ 0x42 ^ 0x4F ^ 0x3C) & (0x50 ^ 0x2D ^ 0xD9 ^ 0xBF ^ -" ".length());
            }
          }
        }
        else
        {
          Object localObject;
          if ((f(this.l, n[3])) && (f(this.l, n[2])))
          {
            localObject = m;
            "".length();
            if (((96 + 3 - 81 + 160 ^ 68 + 119 - 135 + 83) & (0x7 ^ 0x2F ^ 0x2A ^ 0x37 ^ -" ".length())) != 0) {
              return (0x3C ^ 0x79 ^ 0x4C ^ 0x3B) & (0x29 ^ 0x32 ^ 0x32 ^ 0x1B ^ -" ".length());
            }
          }
          else
          {
            localObject = p;
          }
          char c1;
          if (c(paramInt, this.z))
          {
            this.q = ((this.q + n[5]) % localObject[(paramInt - n[6])].length());
            c1 = localObject[(paramInt - n[6])].charAt(this.q);
            if (e(this.w))
            {
              c1 = Character.toLowerCase(c1);
              "".length();
              if (-" ".length() >= "  ".length()) {
                return (0x44 ^ 0x2A ^ 0x84 ^ 0xAF) & (1 + '¯' - -29 + 16 ^ '' + 90 - 117 + 49 ^ -" ".length());
              }
            }
            else if (c(this.w, n[5]))
            {
              c1 = Character.toUpperCase(c1);
              "".length();
              if ((22 + 75 - 50 + 104 ^ 45 + 31 - 43 + 114) <= 0) {
                return (0x9C ^ 0xC7 ^ 0x5D ^ 0x43) & (0x73 ^ 0x1B ^ 0x4C ^ 0x61 ^ -" ".length());
              }
            }
            else if (c(this.w, n[3]))
            {
              c1 = Character.toUpperCase(c1);
              "".length();
              if (((0x7E ^ 0x2D ^ 0x6F ^ 0x79) & (0x48 ^ 0x2B ^ 0x9B ^ 0xBD ^ -" ".length())) != (('±' + 34 - 114 + 93 ^ 44 + 86 - 0 + 23) & (0x51 ^ 0x2A ^ 0x73 ^ 0x2F ^ -" ".length()))) {
                return (0xCE ^ 0xA6 ^ 0xAF ^ 0x84) & ('Å' + 'Ê' - 350 + 154 ^ 67 + 12 - 19 + 76 ^ -" ".length());
              }
            }
            else
            {
              c1 = localObject[(paramInt - n[6])].charAt(localObject[(paramInt - n[6])].length() - n[5]);
            }
            localObject = this.ab.substring(n[0], this.ac - n[5]) + c1;
            if (e(this.ac, this.ab.length())) {
              localObject = (String)localObject + this.ab.substring(this.ac, this.ab.length());
            }
            this.ab = ((String)localObject);
            this.x = u[y];
            g();
            "".length();
            if ("   ".length() < 0) {
              return (0xE ^ 0x56) & (0xF7 ^ 0xAF ^ 0xFFFFFFFF);
            }
          }
          else if (e(this.ab.length(), this.ad))
          {
            if ((c(this.w, n[5])) && (f(this.z, n[13]))) {
              this.w = n[0];
            }
            this.q = n[0];
            c1 = localObject[(paramInt - n[6])].charAt(this.q);
            if (e(this.w))
            {
              c1 = Character.toLowerCase(c1);
              "".length();
              if ((18 + 54 - 41 + 146 ^ 58 + 44 - -69 + 10) == -" ".length()) {
                return ('' + 5 - 28 + 45 ^ 29 + 87 - 7 + 83) & (21 + 87 - 46 + 133 ^ 112 + 63 - 166 + 139 ^ -" ".length());
              }
            }
            else if (c(this.w, n[5]))
            {
              c1 = Character.toUpperCase(c1);
              "".length();
              if (((0x6B ^ 0x25 ^ 0x40 ^ 0x4B) & ('Ä' + 'Ô' - 208 + 55 ^ 0 + 106 - 29 + 109 ^ -" ".length())) == "  ".length()) {
                return (126 + 86 - -12 + 21 ^ 48 + 111 - 67 + 73) & ('Ó' + 63 - 85 + 24 ^ 90 + 52 - 116 + 107 ^ -" ".length());
              }
            }
            else if (c(this.w, n[3]))
            {
              c1 = Character.toUpperCase(c1);
              "".length();
              if (-"  ".length() >= 0) {
                return ('' + 97 - 239 + 181 ^ '' + 51 - 37 + 12) & (" ".length() ^ 0x66 ^ 0x3D ^ -" ".length());
              }
            }
            else
            {
              c1 = localObject[(paramInt - n[6])].charAt(localObject[(paramInt - n[6])].length() - n[5]);
            }
            localObject = this.ab.substring(n[0], this.ac) + c1;
            if (e(this.ac, this.ab.length())) {
              localObject = (String)localObject + this.ab.substring(this.ac, this.ab.length());
            }
            this.ab = ((String)localObject);
            this.x = u[y];
            this.ac += n[5];
            g();
            h();
          }
          this.z = paramInt;
          "".length();
          if ((0x20 ^ 0x76 ^ 0x33 ^ 0x61) != ('¥' + 118 - 174 + 58 ^ 86 + 11 - -47 + 19)) {
            return " ".length() & (" ".length() ^ -" ".length());
          }
        }
      }
      else
      {
        this.q = n[0];
        this.z = n[13];
        if (c(paramInt, n[29]))
        {
          if (d(this.ac))
          {
            this.ac -= n[5];
            h();
            this.t = n[14];
            return n[0];
          }
        }
        else if (c(paramInt, n[30]))
        {
          if (e(this.ac, this.ab.length()))
          {
            this.ac += n[5];
            h();
            this.t = n[14];
            return n[0];
          }
        }
        else
        {
          if (c(paramInt, n[31]))
          {
            b();
            return n[0];
          }
          this.z = paramInt;
        }
      }
      return n[5];
    }
    b();
    return n[5];
  }
  
  public static boolean a(char paramChar)
  {
    if (((d(paramChar, n[6])) && (!a(paramChar, n[7]))) || ((d(paramChar, n[8])) && (!a(paramChar, n[9]))) || ((d(paramChar, n[10])) && (b(paramChar, n[11])))) {
      return n[5];
    }
    return n[0];
  }
  
  private static boolean i(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static void i()
  {
    n = new int[39];
    n[0] = (('' + 123 - 228 + 121 ^ '®' + 100 - 266 + 178) & (96 + '' - 181 + 106 ^ 48 + 82 - 66 + 71 ^ -" ".length()));
    n[1] = (0x80 ^ 0x84);
    n[2] = "   ".length();
    n[3] = "  ".length();
    n[4] = (-(0xCEFE & 0x354D) & 0xD65B & 0x12DEF);
    n[5] = " ".length();
    n[6] = ('' + '' - 202 + 84 ^ 13 + 45 - 29 + 99);
    n[7] = (0x38 ^ 0x1);
    n[8] = (0xF7 ^ 0xB6);
    n[9] = (0x70 ^ 0x2A);
    n[10] = (0x7B ^ 0x1A);
    n[11] = (0xD3 ^ 0xAA ^ "   ".length());
    n[12] = (-(0xCE8F & 0x3F7B) & 0xEFFE & 0x1FFF);
    n[13] = (-(0xEFE2 & 0x17DD));
    n[14] = (0x5E ^ 0x54);
    n[15] = (-(0xE73C & 0x78D7) & 0xFBFF & 0x67FB);
    n[16] = (0x4E ^ 0x43);
    n[17] = (0xE9 ^ 0xC1);
    n[18] = (0x5E ^ 0x52);
    n[19] = (36 + '' - 132 + 117 ^ 57 + '' - 158 + 120);
    n[20] = (-(0x15 ^ 0x1D));
    n[21] = ((0x7D ^ 0x42) + (0x7D ^ 0x71) - -(0x22 ^ 0x1D) + (0x26 ^ 0x64));
    n[22] = (0x35 ^ 0x50 ^ 0xCD ^ 0x85);
    n[23] = (0xD9 ^ 0x86);
    n[24] = (0xAA ^ 0x8A);
    n[25] = (0x77 ^ 0x27 ^ 0x4F ^ 0x35);
    n[26] = (64 + 6 - 18 + 112 ^ 70 + 88 - 58 + 58);
    n[27] = (0x17 ^ 0x5B ^ 0xF4 ^ 0x9B);
    n[28] = (0x6E ^ 0x55);
    n[29] = (0x48 ^ 0x15 ^ 0xC9 ^ 0x9A);
    n[30] = (0x10 ^ 0x2C ^ 0x8B ^ 0xB8);
    n[31] = (0xB ^ 0x39 ^ 0x9B ^ 0xBA);
    n[32] = (0x40 ^ 0x45);
    n[33] = (0xEABE & 0xAABFEB);
    n[34] = (0x12 ^ 0x15);
    n[35] = (0x87 ^ 0x95);
    n[36] = (0x7 ^ 0xC);
    n[37] = (0xB5 ^ 0xB8 ^ 0x29 ^ 0x2D);
    n[38] = ('' + 9 - 39 + 92 ^ '' + '¼' - 177 + 48);
  }
  
  public static void f() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ek.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */