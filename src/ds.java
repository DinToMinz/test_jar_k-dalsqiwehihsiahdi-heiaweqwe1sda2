import java.util.Calendar;

public final class ds
  extends r
{
  public static int v;
  public int w;
  public static boolean x;
  private int z = ac[0];
  public static long y;
  private long aa;
  private int ab = ac[0];
  private static int[] ac;
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public final String toString()
  {
    if ((d(this.w)) && (d(this.w, e.r.length))) {
      return "Tàn sát " + e.r[this.w].b;
    }
    return "Tàn sát";
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final void b()
  {
    Calendar localCalendar;
    int j = (localCalendar = bc.b()).get(ac[1]);
    int i = localCalendar.get(ac[2]);
    if ((!c(this.d, ac[3])) || (!c(this.d, ac[4])) || (!c(this.d, ac[5])) || (e(this.d, ac[6]))) {
      v = this.d;
    }
    if (g(r.k()))
    {
      if (g(dt.aq)) {
        r.a(ac[7]);
      }
    }
    else
    {
      if ((e(r.p)) && (g(dt.g().aa)))
      {
        e();
        return;
      }
      if (((g(aq.a)) && (e(j, aq.f)) && (!c(i, aq.g))) || ((g(dn.ax)) && (d(a(System.currentTimeMillis() - y, 5000L)))))
      {
        if (c(et.o, ac[8]))
        {
          if (g(x))
          {
            dn.c();
            r.a(1000L);
            r.a(ac[7]);
            x = ac[9];
          }
          a(ac[8], ac[0], ac[0], ac[0]);
          return;
        }
        fn.c(ac[10], ac[9], ac[1]);
        r.a(1000L);
        y = System.currentTimeMillis();
        fn.a("Điểm danh xong rồi!,nghỉ ngơi 1 phút rồi úp tiếp !");
        r.a(60000L);
        dn.ax = ac[9];
        return;
      }
      if (g(aw.ai instanceof fn)) {
        if ((!e(this.ab, dt.g().eg)) || (c(this.z, dt.g().ey)))
        {
          this.ab = dt.g().eg;
          this.z = dt.g().ey;
          this.aa = System.currentTimeMillis();
          "".length();
          if ("   ".length() > "  ".length()) {}
        }
        else if ((a(dt.g().ab)) && (f(a(System.currentTimeMillis() - this.aa, 2000L))) && (e(r.k())))
        {
          this.aa = System.currentTimeMillis();
          dl.ae().i(dt.g().eg, dt.g().ey - ac[11]);
          r.a(250L);
          dl.ae().i(dt.g().eg, dt.g().ey);
          "".length();
          if ((0x6F ^ 0x22 ^ 0x3E ^ 0x76) != 0) {}
        }
        else if ((f(a(System.currentTimeMillis() - this.aa, 8000L))) && (e(r.k())))
        {
          this.aa = System.currentTimeMillis();
          aw.p();
          fn.j().af();
          dm.b.c.c(ac[0]);
          r.a(250L);
          dm.b.c.b(ac[0]);
          r.a(500L);
        }
      }
      if ((e(this.d, et.o)) && ((!e(this.h)) || (e(this.f, et.b))))
      {
        if ((g(dt.z)) && (g(dn.k())) && (d(dt.f(), ac[12])) && (e(et.n(et.o))))
        {
          r.n();
          return;
        }
        b(this.w, a(dt.bb, dt.h, dt.dj));
        c(ac[0]);
        return;
      }
      a(this.d, this.f, this.t, this.o);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    super.a();
    this.d = paramInt2;
    this.f = paramInt3;
    this.h = et.f(paramInt2);
    this.w = paramInt1;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static void c()
  {
    p();
    v = ac[3];
  }
  
  static
  {
    cs.a(78);
    c();
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static void p()
  {
    ac = new int[13];
    ac[0] = (-" ".length());
    ac[1] = (0xB1 ^ 0xBA);
    ac[2] = (108 + 57 - 75 + 61 ^ '' + 12 - 96 + 100);
    ac[3] = (126 + 13 - 24 + 19);
    ac[4] = ((0x9 ^ 0x20) + (0xF4 ^ 0xAF) - (0xDF ^ 0xBF) + (0x7D ^ 0x1E));
    ac[5] = ((0xA0 ^ 0x87) + (86 + 110 - 128 + 60) - (0x75 ^ 0x27) + (0x13 ^ 0x20));
    ac[6] = (60 + 122 - 92 + 47);
    ac[7] = " ".length();
    ac[8] = (87 + 64 - 103 + 103 ^ 105 + 43 - 39 + 20);
    ac[9] = (('' + '' - 138 + 24 ^ 76 + 99 - 145 + 153) & (0x2 ^ 0x25 ^ 0x35 ^ 0xD ^ -" ".length()));
    ac[10] = (0x95 ^ 0xB0);
    ac[11] = (0x6D ^ 0x75);
    ac[12] = (0x75 ^ 0x70);
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ds.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */