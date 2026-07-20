import java.util.Calendar;
import java.util.Random;

public final class ab
  extends r
{
  private String y;
  private static int[] z;
  public static boolean v;
  public static boolean w;
  public static boolean x;
  private boolean aa;
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt <= 0;
  }
  
  public final String toString()
  {
    return "Auto Send";
  }
  
  private static int p()
  {
    ao[] arrayOfao = dt.g().w;
    int i = z[0];
    int j = z[0];
    while (d(j, dn.a(cw.a, ",").length))
    {
      int k = z[0];
      while (d(k, arrayOfao.length))
      {
        ao localao;
        if ((a(localao = arrayOfao[k])) && (c(localao.j.f, Integer.parseInt(dn.a(cw.a, ",")[j]))) && (f(localao.l))) {
          if (g(localao.j.c))
          {
            i += localao.u;
            "".length();
            if ("  ".length() <= 0) {
              return (65 + '' - -21 + 9 ^ 114 + 111 - 44 + 16) & (7 + 123 - 75 + 114 ^ 72 + '' - 41 + 20 ^ -" ".length());
            }
          }
          else
          {
            i++;
          }
        }
        k++;
        "".length();
        if ("   ".length() <= ((0xBD ^ 0xAB) & (0x72 ^ 0x64 ^ 0xFFFFFFFF))) {
          return (0xE1 ^ 0xB0) & (0x3E ^ 0x6F ^ 0xFFFFFFFF);
        }
      }
      j++;
      "".length();
      if ("  ".length() <= ((0x42 ^ 0x13) & (0x97 ^ 0xC6 ^ 0xFFFFFFFF))) {
        return (0x78 ^ 0x57) & (0x39 ^ 0x16 ^ 0xFFFFFFFF);
      }
    }
    return i;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public ab(int paramInt1, int paramInt2, String paramString)
  {
    super.a();
    this.aa = z[0];
    this.d = paramInt1;
    this.f = paramInt2;
    this.y = paramString;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt != 0;
  }
  
  public final void b()
  {
    if (e(dt.g().ef))
    {
      r.a(z[1]);
      return;
    }
    int i;
    if ((c(this.d, et.o)) && (c(this.f, et.b)))
    {
      if (f(this.aa))
      {
        x.v = z[0];
        w = z[0];
        x = z[0];
        if (g(cw.a.equals("")))
        {
          fn.a("Hãy Thêm Item Cần Giao Dịch!");
          dn.o();
          return;
        }
        do
        {
          int j;
          ao localao;
          if ((e(p())) && (d(q())))
          {
            i = z[0];
            while (d(i, dn.a(cw.a, ",").length))
            {
              fn.j().h(z[2]);
              j = z[0];
              while (d(j, dt.g().ea.length))
              {
                if ((a(localao = dt.g().ea[j])) && (c(localao.j.f, Integer.parseInt(dn.a(cw.a, ",")[i]))) && (f(localao.l))) {
                  dl.ae().aj(localao.n);
                }
                j++;
                "".length();
                if ("   ".length() < 0) {
                  return;
                }
              }
              i++;
              "".length();
              if ("  ".length() == (0x7A ^ 0x7E)) {
                return;
              }
            }
          }
          r.a(1000L);
          ey.a(this.y);
          if (e(p()))
          {
            if (!d(q())) {
              break;
            }
            i = z[0];
            while (d(i, dn.a(cw.a, ",").length))
            {
              fn.j().h(z[2]);
              j = z[0];
              while (d(j, dt.g().ea.length))
              {
                if ((a(localao = dt.g().ea[j])) && (c(localao.j.f, Integer.parseInt(dn.a(cw.a, ",")[i]))) && (f(localao.l))) {
                  dl.ae().aj(localao.n);
                }
                j++;
                "".length();
                if (-" ".length() > 0) {
                  return;
                }
              }
              i++;
              "".length();
              if (((0xE1 ^ 0xA8) & (0x7 ^ 0x4E ^ 0xFFFFFFFF)) > "  ".length()) {
                return;
              }
            }
          }
          if (!f(x)) {
            break;
          }
          if (g(w))
          {
            fn.a("Hành trang đối phương không còn đủ chỗ trống!");
            "".length();
            if (-" ".length() < "   ".length()) {
              break;
            }
            return;
          }
          i = z[0];
          while (d(i, z[3]))
          {
            r.a(null.nextInt(z[4]) + z[5]);
            fn.a("Chờ " + (z[3] - i) + " s để gd tiếp !");
            i++;
            "".length();
            if (null != null) {
              return;
            }
          }
          "".length();
        } while ("  ".length() != 0);
        return;
        if (f(w)) {
          fn.a("Đã hết vp cần gd trong hành trang, Hoặc đối phương k có trong khu vực này ! !");
        }
        this.aa = z[1];
        return;
      }
      if (e(bc.b().get(z[6]), ey.x)) {
        dn.o();
      }
    }
    else
    {
      if ((!f(p() + q(), z[7])) || ((c(this.d, et.o)) && (c(this.f, et.b))))
      {
        dn.o();
        i = z[0];
        while (d(i, dn.a(ey.y, ",").length))
        {
          dl.ae().b(dn.a(ey.y, ",")[i], "Chưa có đồ em ơi !");
          i++;
          "".length();
          if (" ".length() < 0) {
            return;
          }
        }
        return;
      }
      a(this.d, this.f, z[8], z[8]);
    }
  }
  
  private static int q()
  {
    ao[] arrayOfao = dt.g().ea;
    int i = z[0];
    int j = z[0];
    while (d(j, dn.a(cw.a, ",").length))
    {
      int k = z[0];
      while (d(k, arrayOfao.length))
      {
        ao localao;
        if ((a(localao = arrayOfao[k])) && (c(localao.j.f, Integer.parseInt(dn.a(cw.a, ",")[j]))) && (f(localao.l))) {
          if (g(localao.j.c))
          {
            i += localao.u;
            "".length();
            if (((0xAB ^ 0x8B) & (0x30 ^ 0x10 ^ 0xFFFFFFFF)) != 0) {
              return "   ".length() & ("   ".length() ^ 0xFFFFFFFF);
            }
          }
          else
          {
            i++;
          }
        }
        k++;
        "".length();
        if (((0xB4 ^ 0xAC ^ 0x73 ^ 0x63) & (0xF0 ^ 0xA2 ^ 0x3C ^ 0x66 ^ -" ".length())) > " ".length()) {
          return ("   ".length() ^ 0x6A ^ 0x2C) & (0x8D ^ 0x84 ^ 0x6 ^ 0x4A ^ -" ".length());
        }
      }
      j++;
      "".length();
      if ((126 + '' - 145 + 64 ^ '' + 40 - 32 + 55) < " ".length()) {
        return (97 + 68 - 139 + 103 ^ 35 + 77 - 25 + 47) & ('' + 38 - 146 + 131 ^ 61 + '' - 103 + 67 ^ -" ".length());
      }
    }
    return i;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(23);
    c();
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static void r()
  {
    z = new int[9];
    z[0] = ((0xB9 ^ 0x9B) & (0x27 ^ 0x5 ^ 0xFFFFFFFF));
    z[1] = " ".length();
    z[2] = (0x6C ^ 0x68);
    z[3] = (100 + 9 - 38 + 101 ^ 87 + 27 - 40 + 104);
    z[4] = (-(0xEBF6 & 0x7F4F) & 0xFFFFFFF7 & 0x6FFD);
    z[5] = (0xF3FB & 0xFEC);
    z[6] = (0x6 ^ 0xA);
    z[7] = "  ".length();
    z[8] = (-" ".length());
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ab.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */