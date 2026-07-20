import java.util.Vector;

public final class cb
  extends r
{
  private static int[] w;
  private boolean x;
  private String y;
  public static short v;
  
  private static boolean d(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt == 0;
  }
  
  public cb(String paramString)
  {
    super.a();
    this.y = paramString;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static void p()
  {
    w = new int[6];
    w[0] = " ".length();
    w[1] = ((26 + 33 - -67 + 3 ^ 62 + 116 - 146 + 109) & (0x5 ^ 0x39 ^ 0xBF ^ 0x8F ^ -" ".length()));
    w[2] = (0x88 ^ 0xBA);
    w[3] = (0x4E ^ 0x42);
    w[4] = "  ".length();
    w[5] = (0x60 ^ 0x7E);
  }
  
  public final String toString()
  {
    return "Auto GD";
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(151);
    c();
  }
  
  public final void b()
  {
    if (f(dt.g().ef))
    {
      r.a(w[0]);
      return;
    }
    if (i(this.x)) {
      return;
    }
    x.v = w[1];
    while (g(q()))
    {
      Object localObject1 = this.y;
      dt localdt1 = dt.g();
      int k = w[1];
      do
      {
        while (e(k, fn.ep.size()))
        {
          dt localdt2;
          int m;
          if (i((localdt2 = (dt)fn.ep.elementAt(k)).ci.equals(localObject1)))
          {
            Object localObject2 = localObject1 = localdt2;
            localObject1 = localObject1;
            if (b(localObject2))
            {
              ab.x = w[0];
              "".length();
              if ("  ".length() >= ((0x41 ^ 0x7D ^ 0x1B ^ 0xB) & (0x44 ^ 0x64 ^ 0x4 ^ 0x8 ^ -" ".length()))) {
                break label877;
              }
              return;
            }
            do
            {
              if (d(bc.a(localdt1.eg, localdt1.ey, ((dt)localObject1).eg, ((dt)localObject1).ey), w[2]))
              {
                "".length();
                r.a(1000L);
                "".length();
                if (null == null) {}
              }
              else
              {
                dl.ae().aq(((dt)localObject1).fy);
              }
            } while ((e(fn.x)) && (!i(cn.a(1000L))));
            localObject1 = new ao[w[3]];
            m = w[1];
            int n = w[1];
            while (e(n, localdt1.w.length))
            {
              ao localao = localdt1.w[n];
              if ((e(m, w[3])) && (a(localao)) && (f(localao.j.f, v)) && (e(localao.l))) {
                localObject1[(m++)] = localao;
              }
              n++;
              "".length();
              if ((0x49 ^ 0x4D) == 0) {
                return;
              }
            }
            fn.j().fq = w[1];
            fn.cr = (ao[])localObject1;
            dl.ae().a(w[1], (ao[])localObject1);
            fn.j().ee = w[0];
            long l = System.currentTimeMillis();
            while (c(fn.j().ao, w[0]))
            {
              if ((!e(x.v)) || (d(a(System.currentTimeMillis() - l, 20000L))))
              {
                dl.ae().aa();
                "".length();
                if (-" ".length() < 0) {
                  break label877;
                }
                return;
              }
              r.a(200L);
              "".length();
              if ((0x72 ^ 0x77) <= 0) {
                return;
              }
            }
            while (h(a(System.currentTimeMillis() - System.currentTimeMillis(), 5000L)))
            {
              if (!e(x.v)) {
                break label877;
              }
              r.a(200L);
              "".length();
              if (('' + 93 - 76 + 11 ^ 0 + 46 - 34 + 148) < (91 + 126 - 146 + 119 ^ 38 + '' - 99 + 117)) {
                return;
              }
            }
            dl.ae().o();
            while (c(fn.j().ao, w[4]))
            {
              if ((!e(x.v)) || (d(a(System.currentTimeMillis() - l, 5000L))))
              {
                dl.ae().aa();
                "".length();
                if ("   ".length() >= ((103 + 124 - 147 + 98 ^ 120 + 115 - 207 + 131) & (0xAB ^ 0x9D ^ 0x63 ^ 0x78 ^ -" ".length()))) {
                  break label877;
                }
                return;
              }
              r.a(200L);
              "".length();
              if ("   ".length() == 0) {
                return;
              }
            }
            if (i(cn.a(20000L)))
            {
              int j = w[1];
              while (e(j, w[3]))
              {
                if (a(localObject1[j])) {
                  dt.g().w[localObject1[j].n] = null;
                }
                j++;
                "".length();
                if (null != null) {
                  return;
                }
              }
            }
            "".length();
            if ("   ".length() == "   ".length()) {
              break label877;
            }
            return;
          }
          m++;
          "".length();
          if ("  ".length() <= " ".length()) {
            return;
          }
        }
        "".length();
      } while (-" ".length() < (0xAB ^ 0xAF));
      return;
      label877:
      if (e(ab.w)) {
        if (f(q()))
        {
          fn.a("Hết!");
          "".length();
          if (((0xBF ^ 0x9B) & (0x4E ^ 0x6A ^ 0xFFFFFFFF)) == ((0x24 ^ 0xC) & (0x89 ^ 0xA1 ^ 0xFFFFFFFF))) {
            break;
          }
        }
        else
        {
          int i = w[1];
          while (e(i, w[5]))
          {
            r.a(1000L);
            fn.a("Chờ " + (w[5] - i) + " s để gd tiếp !");
            "".length();
            if (('¥' + '' - 135 + 29 ^ 95 + 123 - 209 + 188) == 0) {
              return;
            }
          }
          "".length();
          if (null != null) {
            return;
          }
        }
      }
    }
    fn.a("Hành trang đối phương không còn đủ chỗ trống!");
    if (e(ab.w)) {
      fn.a("Đã hết vp cần gd trong hành trang, Hoặc đối phương k có trong khu vực này ! !");
    }
    this.x = w[0];
    "".length();
    dn.o();
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean h(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static int q()
  {
    ao[] arrayOfao = dt.g().w;
    int i = w[1];
    int j = w[1];
    while (e(j, arrayOfao.length))
    {
      ao localao;
      if ((a(localao = arrayOfao[j])) && (f(localao.j.f, v)) && (e(localao.l))) {
        i++;
      }
      j++;
      "".length();
      if ((0xA7 ^ 0xA3) == "   ".length()) {
        return (0x58 ^ 0x1E) & (0x5D ^ 0x1B ^ 0xFFFFFFFF);
      }
    }
    return i;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean i(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject == null;
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\cb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */