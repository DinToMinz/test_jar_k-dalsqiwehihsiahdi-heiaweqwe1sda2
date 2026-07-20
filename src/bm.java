import java.util.Vector;

public final class bm
  extends r
{
  public int v;
  private fb y;
  private static int[] z;
  public static boolean w;
  public static long x;
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    super.a();
    this.y = null;
    this.v = paramInt2;
    this.d = paramInt1;
    if ((f(et.o, paramInt1)) && (g(et.b % z[1])))
    {
      this.f = et.b;
      return;
    }
    this.f = z[1];
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public final void b()
  {
    if ((!d(this.d)) || ((f(this.i instanceof ej)) && (d(a(System.currentTimeMillis() - this.b, 3600000L)))))
    {
      dn.o();
      return;
    }
    int i;
    if (f(r.k()))
    {
      if ((f(dt.gj)) && (f(et.o, this.d)) && (f(et.b, this.f)) && (a(dt.g().ab)) && (d(dt.g().ab.x, dt.g().ab.h / z[3])))
      {
        i = z[2];
        while (d(i, fn.ax.size()))
        {
          bk localbk;
          if ((a((localbk = (bk)fn.ax.elementAt(i)).f)) && (e(localbk.f.ef)))
          {
            i = z[0];
            "".length();
            if ((0x94 ^ 0x90) >= "   ".length()) {
              break label234;
            }
            return;
          }
          i++;
          "".length();
          if (null != null) {
            return;
          }
        }
      }
      i = z[2];
      label234:
      if (g(i)) {
        r.a(z[0]);
      }
    }
    else
    {
      if ((!f(et.o, this.d)) || (g(et.b, this.f)))
      {
        a(this.d, this.f, this.t, this.o);
        return;
      }
      if ((a(this.y)) && (e(this.y.g, this.y.e)))
      {
        fn.a("Xong Tà Thú");
        dn.o();
        return;
      }
      int j;
      if (f(dt.g().ci.equals(dn.as)))
      {
        if ((a(dt.g().ab)) && (d(dt.g().ab.x, dt.g().ab.h / z[4])))
        {
          if (g(cn.ai()))
          {
            dl.ae().n("waitGr");
            cn.b(200000L);
            dl.ae().n("notifyGr");
          }
          i = z[2];
          "".length();
          if ((0xA7 ^ 0xA3) >= (0x9F ^ 0x9B)) {}
        }
        else
        {
          i = z[2];
          "".length();
          if ("  ".length() > 0) {}
        }
      }
      else
      {
        if ((f(w)) && (e(a(System.currentTimeMillis() - x, 120000L)))) {
          w = z[2];
        }
        j = w;
      }
      if (g(j)) {
        b(this.v, z[5]);
      }
      if (d(dt.g().y, dt.g().en * dt.gd / z[6])) {
        "".length();
      }
      if (d(dt.g().ef, dt.g().cw * dt.d / z[6]))
      {
        int k = (int)(System.currentTimeMillis() / 1000L);
        int m = z[2];
        while (d(m, dt.g().be.size()))
        {
          bt localbt;
          if ((f((localbt = (bt)dt.g().be.elementAt(m)).a.b, z[8])) && (e(localbt.b - (k - localbt.d), z[9]))) {
            return;
          }
          m++;
          "".length();
          if (null != null) {
            return;
          }
        }
        "".length();
        return;
      }
    }
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt >= 0;
  }
  
  public final void a()
  {
    super.a();
    this.y = dt.k(z[0]);
    if (a(this.y))
    {
      this.v = this.y.b;
      this.d = this.y.f;
      if ((f(et.o, this.y.f)) && (g(et.b % z[1])))
      {
        this.f = et.b;
        return;
      }
    }
    this.f = z[1];
    w = z[2];
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt > 0;
  }
  
  public final void m()
  {
    this.y = dt.k(z[0]);
    super.m();
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static void p()
  {
    z = new int[11];
    z[0] = " ".length();
    z[1] = (0x85 ^ 0x80);
    z[2] = ((0x37 ^ 0x65) & (0xFD ^ 0xAF ^ 0xFFFFFFFF));
    z[3] = (0xBA ^ 0xAE);
    z[4] = (0x20 ^ 0x2A);
    z[5] = (0x87 ^ 0xBA ^ 0x28 ^ 0x1D);
    z[6] = (0x77 ^ 0x13);
    z[7] = (48 + 20 - -4 + 56 ^ 110 + 35 - 76 + 76);
    z[8] = (0x1C ^ 0x4C ^ 0xEC ^ 0xA9);
    z[9] = "  ".length();
    z[10] = (0x2C ^ 0x3C);
  }
  
  public static void c() {}
  
  static
  {
    cs.a(53);
    c();
  }
  
  public final String toString()
  {
    return "Auto Tà Thú";
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean g(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */