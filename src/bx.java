import java.util.Vector;

public final class bx
  extends r
{
  private int v;
  private int w;
  private boolean[] x;
  private static int[] y;
  
  private static boolean d(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(51);
    c();
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt > 0;
  }
  
  public final String toString()
  {
    return "Hang 9x Lvl " + this.v;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean h(int paramInt)
  {
    return paramInt == 0;
  }
  
  public bx()
  {
    super.a();
    this.d = y[0];
    this.h = y[1];
    this.f = y[2];
    this.w = y[3];
    this.v = y[4];
    this.x = new boolean[y[5]];
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public final void b()
  {
    if (f(r.k()))
    {
      r.a(y[1]);
      return;
    }
    if (g(this.d, et.o))
    {
      a(this.d, this.f, this.t, this.o);
      return;
    }
    dt localdt = dt.g();
    if (h(r.i()))
    {
      Object localObject1 = localdt.ab;
      Object localObject4;
      int i;
      Object localObject2;
      int m;
      if ((!b(localdt.ab)) || (!f(((e)localObject1).j)) || (!f(((e)localObject1).s)) || (g(a(System.currentTimeMillis() - this.u, 5000L))))
      {
        bx localbx = this;
        localObject4 = fn.bv;
        i = y[4];
        do
        {
          if (e(i, ((Vector)localObject4).size()))
          {
            localObject2 = null;
            "".length();
            if (" ".length() != 0) {
              break;
            }
            return;
          }
          if ((b(localObject2 = (e)((ci)localObject4).elementAt(i))) && (g(((e)localObject2).x)) && (f(((e)localObject2).j)) && (g(((e)localObject2).j, y[1])) && (h(((e)localObject2).v, localbx.w)) && (h(((e)localObject2).t, localbx.v)))
          {
            "".length();
            if ("  ".length() < (0x6B ^ 0x53 ^ 0x12 ^ 0x2E)) {
              break;
            }
            return;
          }
          i++;
          "".length();
        } while (((0x9 ^ 0x13 ^ 0x57 ^ 0x19) & (0xB ^ 0x0 ^ 0x14 ^ 0x4B ^ -" ".length())) <= 0);
        return;
        localObject1 = localObject2;
        if ((a(localObject2)) && (g(a(System.currentTimeMillis() - this.u, 1000L))) && (h(g())))
        {
          localObject4 = fn.bv;
          i = y[4];
          do
          {
            if (e(i, ((Vector)localObject4).size()))
            {
              m = y[1];
              "".length();
              if (-" ".length() <= 0) {
                break;
              }
              return;
            }
            if ((b(localObject2 = (e)((ci)localObject4).elementAt(i))) && (g(((e)localObject2).x)) && (f(((e)localObject2).j)) && (g(((e)localObject2).j, y[1])))
            {
              m = y[4];
              "".length();
              if (-" ".length() < " ".length()) {
                break;
              }
              return;
            }
            i++;
            "".length();
          } while (" ".length() < (0x1A ^ 0x73 ^ 0xCC ^ 0xA1));
          return;
          if (f(m))
          {
            this.x[(this.w - y[6])] = y[1];
            if ((f(this.x[y[4]])) && (f(this.x[y[1]])) && (f(this.x[y[7]])))
            {
              dn.o();
              "".length();
              if ((17 + 100 - 40 + 59 ^ 34 + 12 - -9 + 85) > 0) {
                break label2761;
              }
              return;
            }
          }
        }
      }
      switch (this.w)
      {
      case 198: 
        this.w = y[3];
        this.d = y[0];
        if (h(this.v))
        {
          this.v = y[8];
          "".length();
          if ("  ".length() <= (" ".length() & (" ".length() ^ 0xFFFFFFFF))) {
            return;
          }
        }
        break;
      case 199: 
        this.w = y[9];
        this.d = y[10];
        "".length();
        if (" ".length() >= "   ".length()) {
          return;
        }
        break;
      case 200: 
        this.w = y[6];
        this.d = y[11];
      default: 
        "".length();
        if (-" ".length() >= " ".length())
        {
          return;
          int k;
          Object localObject6;
          if ((f(dt.gj)) && (g(fn.ax.size())) && (h(localdt.bs.b, y[12])) && (g(localdt.ef)))
          {
            m = y[4];
            while (d(m, localdt.az.size())) {
              if ((b(localObject4 = (fy)localdt.az.elementAt(m))) && (h(((fy)localObject4).a.b, y[8])))
              {
                if (h(((fy)localObject4).c())) {
                  k = y[4];
                }
              }
              else {
                for (;;)
                {
                  if (d(k, fn.ax.size()))
                  {
                    if ((g((localObject2 = (bk)fn.ax.elementAt(k)).g, localdt.fy)) && (b(((bk)localObject2).f)) && (d(((bk)localObject2).f.ef))) {
                      try
                      {
                        localObject6 = ((bk)localObject2).f;
                        if ((!c(Math.abs(localdt.eg - ((dt)localObject6).eg), y[13])) || (f(Math.abs(localdt.ey - ((dt)localObject6).ey), y[13]))) {
                          "".length();
                        }
                        Thread.sleep(500L);
                        dl.ae().ao(((bk)localObject2).g);
                        ((fy)localObject4).e = System.currentTimeMillis();
                        ((fy)localObject4).k = y[1];
                        localdt.a(fn.dc[localObject4.a.e], y[4]);
                        Thread.sleep(1000L);
                        "".length();
                        if (null == null) {
                          break label2761;
                        }
                        return;
                      }
                      catch (InterruptedException localInterruptedException1)
                      {
                        (localObject6 = localInterruptedException1).printStackTrace();
                      }
                    }
                    k++;
                    "".length();
                    if ("   ".length() <= 0)
                    {
                      return;
                      m++;
                      "".length();
                      if (-" ".length() < 0) {
                        break;
                      }
                      return;
                    }
                  }
                }
              }
            }
          }
          if ((b(r.m)) && (b(localObject1)) && (f(((e)localObject1).s)) && (h(((e)localObject1).v, this.w)) && (h(((e)localObject1).t, this.v)))
          {
            Object localObject5 = r.m;
            Object localObject3;
            if ((f(r.m.c())) && (f(dt.ec)))
            {
              i = y[4];
              while (d(i, localdt.az.size()))
              {
                if ((b(localObject4 = (fy)localdt.az.elementAt(i))) && (e(a(System.currentTimeMillis() - ((fy)localObject4).e, ((fy)localObject4).l - 300L)))) {
                  try
                  {
                    if (h(((fy)localObject4).a.b, y[7]))
                    {
                      if (((a(localdt.m)) && (!h(dt.eb))) || (((e(((fy)localObject4).a.e, y[14])) && (!f(((fy)localObject4).a.e, y[15]))) || ((h(dt.df)) && (!g(((fy)localObject4).a.e, y[16]))) || ((h(((fy)localObject4).a.e, y[17])) && (e(localdt.ef, localdt.cw * dt.d / y[18])))))
                      {
                        "".length();
                        if ("  ".length() >= -" ".length()) {
                          break label2206;
                        }
                        return;
                      }
                      k = (int)(System.currentTimeMillis() / 1000L);
                      int j = y[4];
                      while (d(j, localdt.be.size()))
                      {
                        if ((b(localObject6 = (bt)localdt.be.elementAt(j))) && ((!g(((bt)localObject6).a.c, ((fy)localObject4).a.g)) || ((h(((fy)localObject4).a.e, y[19])) && (h(((bt)localObject6).a.a, y[20])))) && (e(((bt)localObject6).b - (k - ((bt)localObject6).d), y[7])))
                        {
                          "".length();
                          if ("   ".length() == "   ".length()) {
                            break label2206;
                          }
                          return;
                        }
                        j++;
                        "".length();
                        if (-" ".length() > -" ".length()) {
                          return;
                        }
                      }
                      "".length();
                      if ("  ".length() < "   ".length()) {}
                    }
                    else if ((h(((fy)localObject4).a.b, y[5])) && (h(((e)localObject1).t)) && (f(((e)localObject1).x, ((e)localObject1).h / y[7])))
                    {
                      if ((h(((fy)localObject4).a.e, y[8])) && ((!f(dt.ff)) || (e(localdt.ef, localdt.cw * dt.d / y[18]))))
                      {
                        "".length();
                        if (((0x5C ^ 0x11 ^ 0xAE ^ 0xBE) & (95 + 83 - 154 + 129 ^ 63 + 'Á' - 129 + 69 ^ -" ".length())) == 0) {
                          break label2206;
                        }
                      }
                    }
                    else if (((g(((fy)localObject4).a.e, y[20])) && (g(((fy)localObject4).a.e, y[21])) && (g(((fy)localObject4).a.e, y[22])) && (g(((fy)localObject4).a.e, y[23])) && (!h(((fy)localObject4).a.e, y[24]))) || ((h(((e)localObject1).t)) && (!e(((e)localObject1).x, ((e)localObject1).h / y[7]))) || (((g(((fy)localObject4).a.e, y[20])) && (!h(((fy)localObject4).a.e, y[21]))) || ((!h(((e)localObject1).m)) || (((g(((fy)localObject4).a.e, y[22])) && (!h(((fy)localObject4).a.e, y[23]))) || ((!f(((e)localObject1).q)) || ((h(((fy)localObject4).a.e, y[24])) && (h(((e)localObject1).g))))))))
                    {
                      "".length();
                      if (" ".length() == " ".length()) {
                        break label2206;
                      }
                      return;
                    }
                    localObject5 = localObject4;
                    Thread.sleep(500L);
                    "".length();
                    if ("  ".length() >= 0) {
                      break;
                    }
                    return;
                  }
                  catch (InterruptedException localInterruptedException2)
                  {
                    (localObject3 = localInterruptedException2).printStackTrace();
                  }
                }
                label2206:
                i++;
                "".length();
                if ("   ".length() >= (0x23 ^ 0x35 ^ 0x86 ^ 0x94)) {
                  return;
                }
              }
            }
            if (((!g(((fy)localObject5).a.b, y[1])) || (h(((fy)localObject5).a.b, y[5]))) && ((!c(bc.a(localdt.eg - ((e)localObject1).n), ((fy)localObject5).c)) || (f(bc.a(localdt.ey - ((e)localObject1).d), ((fy)localObject5).g)))) {
              c((e)localObject1);
            }
            dl.ae().l(((fy)localObject5).a.e);
            if (h(((fy)localObject5).a.b, y[7]))
            {
              dl.ae().v();
              "".length();
              if (" ".length() < "   ".length()) {}
            }
            else
            {
              r.e.removeAllElements();
              r.l.removeAllElements();
              if (b(localObject1))
              {
                r.e.addElement(localObject1);
                i = y[4];
                while ((d(i, fn.bv.size())) && (d(r.e.size() + r.l.size(), ((fy)localObject5).i)))
                {
                  if ((f((localObject3 = (e)fn.bv.elementAt(i)).j)) && (g(((e)localObject3).j, y[1])) && (h(localObject3.equals(localObject1))) && (c(((e)localObject1).n - y[18], ((e)localObject3).n)) && (c(((e)localObject3).n, ((e)localObject1).n + y[18])) && (c(((e)localObject1).d - y[13], ((e)localObject3).d)) && (c(((e)localObject3).d, ((e)localObject1).d + y[13]))) {
                    r.e.addElement(localObject3);
                  }
                  i++;
                  "".length();
                  if ((0x77 ^ 0x73) < 0) {
                    return;
                  }
                }
              }
              dl.ae().a(r.e, r.l, y[1]);
            }
            if (e(a(System.currentTimeMillis() - ((fy)localObject5).e, ((fy)localObject5).l)))
            {
              ((fy)localObject5).e = System.currentTimeMillis();
              ((fy)localObject5).k = y[1];
              if (h(dn.ae)) {
                localdt.a(fn.dc[localObject5.a.e], y[4]);
              }
            }
            this.u = System.currentTimeMillis();
            if (h(((fy)localObject5).a.e, y[17])) {
              try
              {
                Thread.sleep(2000L);
                "".length();
                if (-(0x1 ^ 0x5) > 0) {
                  return;
                }
              }
              catch (InterruptedException localInterruptedException3)
              {
                (localObject3 = localInterruptedException3).printStackTrace();
              }
            }
          }
        }
        break;
      }
    }
    label2761:
    c(y[25]);
  }
  
  private static boolean g(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static void p()
  {
    y = new int[26];
    y[0] = ((0x8C ^ 0xB2) + (81 + 23 - 15 + 64) - ('' + 6 - 66 + 84) + (0xA2 ^ 0xC7));
    y[1] = " ".length();
    y[2] = (-"  ".length());
    y[3] = ('¬' + 113 - 181 + 95);
    y[4] = ((0x83 ^ 0xAE) & (0x74 ^ 0x59 ^ 0xFFFFFFFF));
    y[5] = "   ".length();
    y[6] = (97 + 113 - 12 + 0);
    y[7] = "  ".length();
    y[8] = (0x53 ^ 0x2 ^ 0x56 ^ 0x3);
    y[9] = (63 + 8 - -35 + 86 + (0xA ^ 0x7B) - (0x6A ^ 0x11) + (0x68 ^ 0x7A));
    y[10] = ('' + 52 - 76 + 28 + (60 + 54 - 37 + 78) - (82 + '' - 177 + 190) + (0xF4 ^ 0xBA));
    y[11] = ((0x31 ^ 0x22) + ('' + 118 - 135 + 26) - (89 + 56 - 35 + 33) + (77 + 73 - 147 + 135));
    y[12] = (0x94 ^ 0x92);
    y[13] = (0x93 ^ 0xA1);
    y[14] = (0x38 ^ 0x5F ^ 0x3B ^ 0x1F);
    y[15] = (0x7F ^ 0x37);
    y[16] = (0xEB ^ 0x89 ^ 0xEA ^ 0x97);
    y[17] = (0xA4 ^ 0xAB);
    y[18] = (109 + 56 - 95 + 144 ^ 115 + 71 - 111 + 103);
    y[19] = (0xF5 ^ 0xAD ^ 0x7C ^ 0x1E);
    y[20] = (0x1E ^ 0x19);
    y[21] = (54 + 46 - -8 + 104 ^ 14 + 48 - 65407 + 5);
    y[22] = ('' + 53 - 190 + 169 ^ '£' + '' - 192 + 43);
    y[23] = (0x63 ^ 0x41);
    y[24] = (0x3C ^ 0x3A ^ 0xEA ^ 0xC7);
    y[25] = (-" ".length());
  }
  
  private static boolean h(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bx.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */