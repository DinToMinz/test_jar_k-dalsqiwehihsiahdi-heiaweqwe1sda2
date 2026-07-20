import java.util.Calendar;
import java.util.Vector;

public final class o
  extends r
{
  private static int[] v;
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public final void a()
  {
    super.a();
    this.d = et.o;
    this.f = et.b;
    this.t = dt.g().eg;
    this.o = dt.g().ey;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public final void b()
  {
    Calendar localCalendar;
    int j = (localCalendar = bc.b()).get(v[0]);
    int i = localCalendar.get(v[1]);
    if ((!c(this.d, v[2])) || (!c(this.d, v[3])) || (!c(this.d, v[4])) || (d(this.d, v[5]))) {
      ds.v = this.d;
    }
    if (e(r.k()))
    {
      if (e(dt.aq)) {
        r.a(v[6]);
      }
    }
    else
    {
      if ((g(r.p)) && (e(dt.g().aa)))
      {
        e();
        return;
      }
      if (((e(aq.a)) && (d(j, aq.f)) && (!c(i, aq.g))) || ((e(dn.ax)) && (f(a(System.currentTimeMillis() - ds.y, 5000L)))))
      {
        if (c(et.o, v[7]))
        {
          if (e(ds.x))
          {
            dn.c();
            r.a(1000L);
            r.a(v[6]);
            ds.x = v[8];
          }
          a(v[7], v[9], v[9], v[9]);
          return;
        }
        fn.c(v[10], v[8], v[0]);
        r.a(1000L);
        ds.y = System.currentTimeMillis();
        fn.a("Điểm danh xong rồi!,nghỉ ngơi 1 phút rồi úp tiếp !");
        r.a(60000L);
        dn.ax = v[8];
        return;
      }
      if ((d(this.d, et.o)) && ((!g(this.h)) || (d(this.f, et.b))))
      {
        c(v[9]);
        b(v[9], v[9]);
        return;
      }
      if (e(dt.aq)) {
        a(this.d, this.f, this.t, this.o);
      }
    }
  }
  
  private static void p()
  {
    v = new int[11];
    v[0] = (0x2F ^ 0x24);
    v[1] = (0x67 ^ 0x6B);
    v[2] = (49 + 52 - 74 + 107);
    v[3] = ((0x52 ^ 0x5A) + (0x8 ^ 0x40) - (0xA5 ^ 0x86) + (0x7D ^ 0x27));
    v[4] = (54 + 58 - 91 + 115);
    v[5] = ((0xFB ^ 0xA9) + (0x4B ^ 0x63) - (0x9B ^ 0x92) + (0x2B ^ 0x33));
    v[6] = " ".length();
    v[7] = (0x4F ^ 0x59);
    v[8] = ((0xB ^ 0x29) & (0x3D ^ 0x1F ^ 0xFFFFFFFF));
    v[9] = (-" ".length());
    v[10] = (0x5E ^ 0x68 ^ 0x2B ^ 0x38);
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final String toString()
  {
    return "Tự đánh";
  }
  
  protected final e a(dt paramdt1, int paramInt1, int paramInt2, dt paramdt2, boolean paramBoolean)
  {
    if ((e(dn.l)) && (d(dn.aj.size())))
    {
      a(paramInt2, paramBoolean);
      return r.a(paramdt1.eg, paramdt1.ey);
    }
    return r.a(paramdt1.eg, paramdt1.ey);
  }
  
  public static void c() {}
  
  static
  {
    cs.a(75);
    c();
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\o.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */