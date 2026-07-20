import java.util.Vector;

public final class fk
  extends r
{
  private static int[] v;
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static void e(dt paramdt)
  {
    if (b(paramdt)) {
      try
      {
        localObject = dt.g();
        "".length();
        ((dt)localObject).cs = paramdt;
        Thread.sleep(100L);
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        Object localObject;
        (localObject = localInterruptedException).printStackTrace();
      }
    }
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt > 0;
  }
  
  public final void b()
  {
    if (d(dt.g().ef))
    {
      r.a(v[0]);
      return;
    }
    if (d(et.o, v[1]))
    {
      a(v[1], this.f, v[2], v[2]);
      return;
    }
    Object localObject1;
    if ((h((localObject1 = dt.g()).cj, v[3])) && (c(((dt)localObject1).fj.e, ((dt)localObject1).fj.a.length - v[0])))
    {
      if (a(((dt)localObject1).cm)) {
        try
        {
          fn.c(v[3], v[4], v[4]);
          Thread.sleep(2000L);
          return;
        }
        catch (InterruptedException localInterruptedException2)
        {
          (localObject2 = localInterruptedException2).printStackTrace();
        }
      }
      if (e(bc.a(((dt)localObject1).eg, ((dt)localObject1).ey, ((dt)localObject1).cm.eg, ((dt)localObject1).cm.ey), v[5])) {
        e(((dt)localObject1).cm);
      }
      Object localObject2 = dt.g();
      localObject1 = r.m;
      Object localObject4;
      Object localObject6;
      if (h(dt.ec))
      {
        int i = v[4];
        while (c(i, ((dt)localObject2).az.size()))
        {
          if ((b(localObject4 = (fy)((dt)localObject2).az.elementAt(i))) && (g(((fy)localObject4).c())) && (h(((fy)localObject4).a.b, v[6])) && ((!h(((fy)localObject4).a.e, v[7])) || (c(((dt)localObject2).ef, ((dt)localObject2).cw * dt.d / v[8]))))
          {
            int m = v[4];
            int n = v[4];
            while (c(n, ((dt)localObject2).be.size())) {
              if ((b(localObject6 = (bt)((dt)localObject2).be.elementAt(n))) && (h(((bt)localObject6).a.c, ((fy)localObject4).a.g)))
              {
                m = v[0];
                "".length();
                if ((0x42 ^ 0x46) >= 0) {
                  break;
                }
              }
              else
              {
                n++;
                "".length();
                if ("   ".length() <= "  ".length()) {
                  return;
                }
              }
            }
            if (g(m)) {
              try
              {
                localObject1 = localObject4;
                Thread.sleep(500L);
                "".length();
                if (" ".length() <= "  ".length()) {
                  break;
                }
                return;
              }
              catch (InterruptedException localInterruptedException3)
              {
                InterruptedException localInterruptedException1;
                (localInterruptedException1 = localInterruptedException3).printStackTrace();
              }
            }
          }
          i++;
          "".length();
          if (" ".length() == 0) {
            return;
          }
        }
      }
      Object localObject5;
      if (h(((fy)localObject1).a.b, v[6]))
      {
        dl.ae().v();
        "".length();
        if (null == null) {}
      }
      else
      {
        int i1;
        Object localObject3;
        if (b((localObject4 = dt.g()).cm))
        {
          localObject5 = fn.ep;
          i1 = v[4];
          while (c(i1, ((Vector)localObject5).size()))
          {
            if ((b(localObject3 = (dt)((ci)localObject5).elementAt(i1))) && (d(((dt)localObject3).ee, v[9])) && (d(((dt)localObject3).ee, v[10])) && (d(((dt)localObject3).ee, v[11])) && ((!d(((dt)localObject3).fm, v[12])) || (!d(((dt)localObject4).fm, v[12])) || ((h(((dt)localObject3).fm, v[0])) && (!d(((dt)localObject4).fm, v[0]))) || ((f(((dt)localObject4).eh)) && (!d(((dt)localObject4).eh, ((dt)localObject3).fy))) || ((f(((dt)localObject4).ai)) && (h(((dt)localObject4).ai, ((dt)localObject3).fy)))) && (c(bc.a(((dt)localObject3).eg, ((dt)localObject3).ey, ((dt)localObject4).cm.eg, ((dt)localObject4).cm.ey), v[5])))
            {
              localObject6 = localObject3;
              "".length();
              if ("  ".length() != 0) {
                break label830;
              }
              return;
            }
            i1++;
            "".length();
            if (null != null) {
              return;
            }
          }
        }
        localObject6 = null;
        label830:
        if (b(localObject6))
        {
          if ((c(bc.a(((dt)localObject6).eg, ((dt)localObject6).ey, ((dt)localObject2).cm.eg, ((dt)localObject2).cm.ey), v[5])) && ((!g(bc.a(((dt)localObject2).eg - ((dt)localObject6).eg), ((fy)localObject1).c)) || (e(bc.a(((dt)localObject2).ey - ((dt)localObject6).ey), ((fy)localObject1).g)))) {
            e((dt)localObject6);
          }
          dl.ae().l(((fy)localObject1).a.e);
          r.e.removeAllElements();
          r.l.removeAllElements();
          r.l.addElement(localObject6);
          dl.ae().a(r.e, r.l, v[6]);
          "".length();
          if (((0xCA ^ 0x94) & (0x77 ^ 0x29 ^ 0xFFFFFFFF)) != (0x7C ^ 0x78)) {}
        }
        else
        {
          if (b((localObject4 = dt.g()).cm))
          {
            localObject5 = fn.bv;
            i1 = v[4];
            while (c(i1, ((Vector)localObject5).size()))
            {
              if ((b(localObject3 = (e)((ci)localObject5).elementAt(i1))) && (e(((e)localObject3).x)) && (h(((e)localObject3).j)) && (d(((e)localObject3).j, v[0])) && (c(bc.a(((e)localObject3).u, ((e)localObject3).l, ((dt)localObject4).cm.eg, ((dt)localObject4).cm.ey), v[5])))
              {
                localObject3 = localObject3;
                "".length();
                if ("  ".length() >= 0) {
                  break label1183;
                }
                return;
              }
              i1++;
              "".length();
              if (((0x1F ^ 0x16) & (0xA ^ 0x3 ^ 0xFFFFFFFF)) != 0) {
                return;
              }
            }
          }
          localObject3 = null;
          label1183:
          if (!b(localObject3)) {
            break label1391;
          }
          if ((c(bc.a(((e)localObject3).u, ((e)localObject3).l, ((dt)localObject2).cm.eg, ((dt)localObject2).cm.ey), v[5])) && ((!g(bc.a(((dt)localObject2).eg - ((e)localObject3).u), ((fy)localObject1).c)) || (e(bc.a(((dt)localObject2).ey - ((e)localObject3).l), ((fy)localObject1).g)))) {
            c((e)localObject3);
          }
          dl.ae().l(((fy)localObject1).a.e);
          r.e.removeAllElements();
          r.l.removeAllElements();
          r.e.addElement(localObject3);
          dl.ae().a(r.e, r.l, v[0]);
        }
      }
      if (f(a(System.currentTimeMillis() - ((fy)localObject1).e, ((fy)localObject1).l)))
      {
        ((fy)localObject1).e = System.currentTimeMillis();
        ((fy)localObject1).k = v[0];
        if (g(dn.ae)) {
          ((dt)localObject2).a(fn.dc[localObject1.a.e], v[4]);
        }
      }
      label1391:
      if (c(dt.g().y, dt.g().en * dt.gd / v[8])) {
        "".length();
      }
      if (c(dt.g().ef, dt.g().cw * dt.d / v[8]))
      {
        int j = (int)(System.currentTimeMillis() / 1000L);
        int k = v[4];
        while (c(k, dt.g().be.size()))
        {
          if ((h((localObject5 = (bt)dt.g().be.elementAt(k)).a.b, v[13])) && (f(((bt)localObject5).b - (j - ((bt)localObject5).d), v[6]))) {
            return;
          }
          k++;
          "".length();
          if (null != null) {
            return;
          }
        }
        "".length();
      }
      return;
    }
    dn.r();
  }
  
  public fk()
  {
    super.a();
    this.f = et.b;
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean g(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  private static boolean h(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public final String toString()
  {
    return "Dẫn trẻ";
  }
  
  private static void p()
  {
    v = new int[15];
    v[0] = " ".length();
    v[1] = ("  ".length() ^ 0x33 ^ 0x10);
    v[2] = (-" ".length());
    v[3] = (0xA9 ^ 0xB8);
    v[4] = ((0xE6 ^ 0xC0) & (0x99 ^ 0xBF ^ 0xFFFFFFFF));
    v[5] = ((0x2 ^ 0x3E) + (0x22 ^ 0x14) - (0x38 ^ 0x5F) + ('¤' + 113 - 127 + 39));
    v[6] = "  ".length();
    v[7] = (0xA4 ^ 0xAE ^ 0x73 ^ 0x56);
    v[8] = (0x84 ^ 0xB1 ^ 0x48 ^ 0x19);
    v[9] = (0x35 ^ 0x3B);
    v[10] = (0x20 ^ 0x25);
    v[11] = (0x1 ^ 0x19 ^ 0x2D ^ 0x3A);
    v[12] = "   ".length();
    v[13] = (0x0 ^ 0x77 ^ 0x53 ^ 0x31);
    v[14] = (0x9D ^ 0x8D);
  }
  
  private static boolean h(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(119);
    c();
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */