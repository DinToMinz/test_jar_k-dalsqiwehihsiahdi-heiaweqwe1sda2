import java.util.Vector;

public final class q
  extends r
{
  private boolean v;
  private boolean w;
  private long x = 0L;
  private static int[] y;
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.a();
    this.d = paramInt1;
    this.f = paramInt2;
    this.h = et.f(paramInt1);
    this.w = paramBoolean1;
    this.v = paramBoolean2;
    this.a = y[0];
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(87);
    c();
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean h(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static void p()
  {
    y = new int[16];
    y[0] = " ".length();
    y[1] = (127 + '' - 240 + 137 ^ 86 + 32 - 42 + 100);
    y[2] = ("   ".length() & ("   ".length() ^ -" ".length()));
    y[3] = (0x98 ^ 0x9C);
    y[4] = "  ".length();
    y[5] = (0x68 ^ 0x61 ^ 0xF0 ^ 0xBA);
    y[6] = (0xA3 ^ 0x85 ^ 0x3C ^ 0x52);
    y[7] = (0xA ^ 0x25);
    y[8] = (0x47 ^ 0x23);
    y[9] = (-" ".length());
    y[10] = (0x2B ^ 0x8 ^ 0x33 ^ 0x15);
    y[11] = (0xE7EB & 0x1915);
    y[12] = "   ".length();
    y[13] = (0x89 ^ 0x86 ^ 0xD ^ 0x1C);
    y[14] = (0x5 ^ 0xB);
    y[15] = (7 + 29 - 28 + 130 ^ 121 + 41 - 64 + 35);
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean g(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean h(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public final void b()
  {
    if (d(r.k()))
    {
      r.a(y[0]);
      return;
    }
    if ((d(this.d, et.o)) && ((!f(et.f(this.d))) || (d(this.f, et.b))))
    {
      dt localdt1 = dt.g();
      int i;
      Object localObject1;
      Object localObject2;
      int m;
      int k;
      if ((d(this.v)) && ((!h(fn.ax.size(), y[0])) || (h(dn.y.size()))) && (d(localdt1.bs.b, y[1])))
      {
        i = y[2];
        while (c(i, localdt1.az.size())) {
          if ((b(localObject1 = (fy)localdt1.az.elementAt(i))) && (d(((fy)localObject1).a.b, y[3])))
          {
            if (h(a(System.currentTimeMillis() - this.x, 3000L)))
            {
              i = y[2];
              while (c(i, fn.ax.size()))
              {
                if ((g((localObject2 = (bk)fn.ax.elementAt(i)).g, localdt1.fy)) && (b(((bk)localObject2).f)) && (e(((bk)localObject2).f.ef))) {
                  try
                  {
                    int j = localdt1.eg;
                    m = localdt1.ey;
                    localdt2 = ((bk)localObject2).f;
                    "".length();
                    Thread.sleep(500L);
                    if (d(r.c(localdt2)))
                    {
                      this.x = System.currentTimeMillis();
                      dl.ae().ao(((bk)localObject2).g);
                      ((fy)localObject1).e = System.currentTimeMillis();
                      ((fy)localObject1).k = y[0];
                      localdt1.a(fn.dc[localObject1.a.e], y[2]);
                      Thread.sleep(1000L);
                    }
                    "".length();
                    return;
                  }
                  catch (InterruptedException localInterruptedException2)
                  {
                    InterruptedException localInterruptedException1;
                    (localInterruptedException1 = localInterruptedException2).printStackTrace();
                  }
                }
                i++;
                "".length();
                if (((0xB4 ^ 0xAB ^ 0xBD ^ 0x8F) & (50 + 88 - 84 + 83 ^ 114 + 70 - 124 + 104 ^ -" ".length())) != 0) {
                  return;
                }
              }
              i = y[2];
            }
          }
          else {
            for (;;)
            {
              if (c(i, fn.ep.size()))
              {
                if ((b(localdt2 = (dt)fn.ep.elementAt(i))) && (d(r.c(localdt2))) && (d(dn.c(localdt2.ci)))) {
                  try
                  {
                    k = localdt1.eg;
                    m = localdt1.ey;
                    "".length();
                    Thread.sleep(500L);
                    if (d(r.c(localdt2)))
                    {
                      this.x = System.currentTimeMillis();
                      dl.ae().ao(localdt2.fy);
                      ((fy)localObject1).e = System.currentTimeMillis();
                      ((fy)localObject1).k = y[0];
                      localdt1.a(fn.dc[localObject1.a.e], y[2]);
                      Thread.sleep(1000L);
                    }
                    "".length();
                    return;
                  }
                  catch (InterruptedException localInterruptedException3)
                  {
                    (localObject2 = localInterruptedException3).printStackTrace();
                  }
                }
                i++;
                "".length();
                if (null != null)
                {
                  return;
                  i++;
                  "".length();
                  if (((0xA3 ^ 0x8F) & (0x6A ^ 0x46 ^ 0xFFFFFFFF)) <= 0) {
                    break;
                  }
                  return;
                }
              }
            }
          }
        }
      }
      if (h(fn.ax.size()))
      {
        "".length();
        if (" ".length() != (0xD8 ^ 0x88 ^ 0x25 ^ 0x71)) {
          break label751;
        }
      }
      label751:
      dt localdt2 = null;
      if ((d(this.w)) && (d(j())) && (b(localdt2)) && (d(localdt1.bs.b, y[1])))
      {
        i = y[2];
        while (c(i, localdt1.az.size()))
        {
          if ((b(localObject1 = (fy)localdt1.az.elementAt(i))) && (f(((fy)localObject1).c())) && (d(((fy)localObject1).a.b, y[4])) && ((!f(((fy)localObject1).a.e, y[5])) || (e(((fy)localObject1).a.e, y[6]))) && ((!d(((fy)localObject1).a.e, y[7])) || (c(localdt2.ef, localdt2.cw * dt.d / y[8])))) {
            try
            {
              k = y[2];
              while (c(k, localdt2.be.size()))
              {
                "".length();
                "".length();
                if (-" ".length() >= "  ".length()) {
                  return;
                }
              }
              k = localdt1.eg;
              m = localdt1.ey;
              "".length();
              dl.ae().l(((fy)localObject1).a.e);
              dl.ae().v();
              ((fy)localObject1).e = System.currentTimeMillis();
              ((fy)localObject1).k = y[0];
              localdt1.a(fn.dc[localObject1.a.e], y[2]);
              Thread.sleep(1000L);
              "".length();
              return;
            }
            catch (InterruptedException localInterruptedException4)
            {
              (localObject2 = localInterruptedException4).printStackTrace();
            }
          }
          i++;
          "".length();
          if (null != null) {
            return;
          }
        }
      }
      if (d(dn.am))
      {
        localObject2 = localdt1.cs;
        if (((!b(localdt1.cs)) || ((f(dv.a(((dt)localObject2).ci))) && (f(r.a(localdt1, (dt)localObject2))))) && (a(localObject2 = a(localdt1, y[9])))) {
          localObject2 = r.b(localdt1);
        }
        if ((b(localObject2)) && (d(dv.a(((dt)localObject2).ci))))
        {
          "".length();
          if (-(57 + 49 - 100 + 148 ^ 81 + 30 - 30 + 77) < 0) {
            break label1287;
          }
        }
        label1287:
        k = y[2];
        if ((a(localObject2)) && (d(this.n)))
        {
          dl.ae().x(y[2]);
          this.n = y[2];
        }
        if ((f(localdt1.g, y[10])) && (h(a(System.currentTimeMillis() - this.g, 5000L))))
        {
          if ((b(localObject1 = dt.g(y[11]))) && (d(((ao)localObject1).j.f, y[11]))) {
            dl.ae().ad(((ao)localObject1).n);
          }
          this.g = System.currentTimeMillis();
        }
        if ((b(localObject2)) && (b(localObject2)) && (f(r.c((dt)localObject2))) && ((!f(k)) || (d(r.a(localdt1, (dt)localObject2)))))
        {
          localObject1 = r.m;
          if (d(k))
          {
            if (((!g(((fy)localObject1).a.b, y[0])) || (d(((fy)localObject1).a.b, y[12]))) && ((!h(bc.a(localdt1.eg - ((dt)localObject2).eg), ((fy)localObject1).c + y[13])) || (e(bc.a(localdt1.ey - ((dt)localObject2).ey), ((fy)localObject1).g + y[13]))) && (h(a(System.currentTimeMillis() - this.q, 1500L))))
            {
              r.a((dt)localObject2);
              this.q = System.currentTimeMillis();
            }
            if ((g(((dt)localObject2).eh, localdt1.fy)) && (g(((dt)localObject2).fm, y[12])))
            {
              this.n = y[0];
              dl.ae().x(y[12]);
            }
          }
          k = ((fy)localObject1).c;
          m = ((fy)localObject1).g;
          r.e.removeAllElements();
          r.l.removeAllElements();
          r.l.addElement(localObject2);
          i = y[2];
          while ((c(i, fn.ep.size())) && (c(r.e.size() + r.l.size(), ((fy)localObject1).i)))
          {
            if ((h((localdt2 = (dt)fn.ep.elementAt(i)).ef)) && (g(localdt2.ee, y[14])) && (g(localdt2.ee, y[10])) && (g(localdt2.ee, y[15])) && (f(localdt2.equals(localObject2))) && ((!g(localdt2.fm, y[12])) || (!g(localdt1.fm, y[12])) || ((d(localdt2.fm, y[0])) && (!g(localdt1.fm, y[0]))) || ((g(localdt1.eh)) && (!g(localdt1.eh, localdt2.fy))) || ((g(localdt1.ai)) && (d(localdt1.ai, localdt2.fy)))) && (f(dn.f(localdt2.ci))) && (h(((dt)localObject2).eg - k, localdt2.eg)) && (h(localdt2.eg, ((dt)localObject2).eg + k)) && (h(((dt)localObject2).ey - m, localdt2.ey)) && (h(localdt2.ey, ((dt)localObject2).ey + m))) {
              r.l.addElement(localdt2);
            }
            i++;
            "".length();
            if ("  ".length() >= "   ".length()) {
              return;
            }
          }
          dl.ae().a(r.e, r.l, y[4]);
          if (g(a(System.currentTimeMillis() - ((fy)localObject1).e, ((fy)localObject1).l)))
          {
            ((fy)localObject1).e = System.currentTimeMillis();
            ((fy)localObject1).k = y[0];
            if (f(dn.ae)) {
              localdt1.a(fn.dc[localObject1.a.e], y[2]);
            }
          }
          this.u = System.currentTimeMillis();
          return;
        }
      }
      return;
    }
    a(this.d, this.f, y[9], y[9]);
  }
  
  public final String toString()
  {
    if ((d(this.w)) && (d(this.v))) {
      return "Buff HS Xa";
    }
    if (d(this.v)) {
      return "HSinh Xa";
    }
    return "Buff Xa";
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\q.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */