import java.util.Calendar;
import java.util.Vector;

public final class ej
  extends r
{
  private int aa;
  public int v;
  public static boolean w;
  public int x;
  public static boolean y;
  private boolean ab;
  private long ac;
  private int ad;
  private int ae;
  private static int[] af;
  public static boolean z;
  private long ag;
  private boolean ah;
  private boolean ai;
  private int aj;
  private boolean ak;
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.a();
    this.d = paramInt2;
    this.f = paramInt3;
    this.v = paramInt1;
    this.ak = paramBoolean1;
    this.ai = paramBoolean2;
    this.x = af[0];
    this.ac = 0L;
    this.ah = af[1];
    this.ad = af[2];
    paramInt1 = bc.b();
    if (c(paramInt1.get(af[3]), af[4]))
    {
      "".length();
      if (((0x93 ^ 0xA6 ^ 0xC9 ^ 0xAA) & (0x54 ^ 0x2A ^ 0x3 ^ 0x2B ^ -" ".length())) <= (0xD ^ 0x3D ^ 0x67 ^ 0x53)) {
        break label166;
      }
    }
    label166:
    (paramInt1.get(af[5]) - af[1]).aj = paramInt1.get(af[5]);
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(156);
    c();
  }
  
  public final void m()
  {
    this.ac = 0L;
    super.m();
  }
  
  public final void d()
  {
    if (d(this.x))
    {
      this.aj = bc.b().get(af[5]);
      if (d(et.n(this.d)))
      {
        this.x = af[4];
        this.ag = System.currentTimeMillis();
        this.ae = this.d;
        this.aa = this.f;
        this.ab = this.a;
        this.ah = af[0];
        w = af[0];
        z = af[0];
      }
    }
    else
    {
      if (h(this.x, af[1]))
      {
        this.x = af[37];
        this.ag = System.currentTimeMillis();
        this.ah = af[0];
        return;
      }
      if (h(this.x, af[4]))
      {
        this.x = af[1];
        this.ag = System.currentTimeMillis();
        y = af[0];
        return;
      }
      if (h(this.x, af[37]))
      {
        this.x = af[0];
        this.ah = af[0];
        dn.f();
        return;
      }
      if (h(this.x, af[38]))
      {
        this.x = af[0];
        this.ah = af[0];
      }
    }
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public final boolean p()
  {
    if ((g(dn.ac instanceof ej)) && (h(this.x, af[4])) && (f(dt.g().ap, af[7])) && (c(dt.g().ap, af[20]))) {
      return af[1];
    }
    return af[0];
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean g(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public final void b()
  {
    if (g(r.k()))
    {
      r.a(af[1]);
      return;
    }
    Calendar localCalendar;
    int j = (localCalendar = bc.b()).get(af[5]);
    int n = localCalendar.get(af[3]);
    int i1 = localCalendar.get(af[39]);
    Object localObject1;
    label523:
    Object localObject2;
    InterruptedException localInterruptedException3;
    int i;
    switch (this.x)
    {
    case 0: 
      if ((d(this.ah)) && (f(this.ad)))
      {
        if (e(et.o, this.ad))
        {
          a(this.ad, af[40], af[2], af[2]);
          return;
        }
        fn.c(af[5], af[1], af[0]);
        if (g(cn.o()))
        {
          this.ah = af[1];
          this.d = this.ae;
          this.f = this.aa;
          this.a = this.ab;
          this.h = af[0];
          return;
        }
        return;
      }
      if ((h(this.ad)) && ((!d(et.j(et.o))) || (g(et.i(et.o))))) {
        this.ad = et.o;
      }
      if ((!e(j, this.aj)) || (!f(n, af[4])) || (c(i1, af[41])))
      {
        if ((h(this.d, et.o)) && ((!d(this.h)) || (h(this.f, et.b))))
        {
          if ((g(dt.z)) && (g(dn.k())) && (c(dt.f(), af[5])) && (d(et.n(et.o))))
          {
            r.n();
            return;
          }
          if ((d(this.ai)) && (d(this.ak)))
          {
            b(this.v, a(dt.bb, dt.h, dt.dj));
            c(af[2]);
            "".length();
            if (((0x6A ^ 0x22 ^ 0x2C ^ 0x77) & (0x79 ^ 0x19 ^ 0x64 ^ 0x17 ^ -" ".length())) < "   ".length()) {}
          }
          else
          {
            localObject1 = dt.g();
            if (f(fn.ax.size()))
            {
              "".length();
              if ((0xC ^ 0x8) >= "  ".length()) {
                break label523;
              }
            }
            localCalendar = null;
            if ((g(this.ai)) && (f(fn.ax.size())) && (h(((dt)localObject1).bs.b, af[42])))
            {
              n = af[0];
              while (c(n, ((dt)localObject1).az.size())) {
                if ((b(localObject2 = (fy)((dt)localObject1).az.elementAt(n))) && (h(((fy)localObject2).a.b, af[38])))
                {
                  if (d(((fy)localObject2).c())) {
                    n = af[0];
                  }
                }
                else {
                  for (;;)
                  {
                    if (c(n, fn.ax.size()))
                    {
                      bk localbk;
                      if ((e((localbk = (bk)fn.ax.elementAt(n)).g, ((dt)localObject1).fy)) && (b(localbk.f)) && (i(localbk.f.ef))) {
                        try
                        {
                          n = ((dt)localObject1).eg;
                          int i4 = ((dt)localObject1).ey;
                          dt localdt = localbk.f;
                          "".length();
                          Thread.sleep(500L);
                          dl.ae().ao(localbk.g);
                          ((fy)localObject2).e = System.currentTimeMillis();
                          ((fy)localObject2).k = af[1];
                          ((dt)localObject1).a(fn.dc[localObject2.a.e], af[0]);
                          Thread.sleep(1000L);
                          "".length();
                          return;
                        }
                        catch (InterruptedException localInterruptedException5)
                        {
                          InterruptedException localInterruptedException4;
                          (localInterruptedException4 = localInterruptedException5).printStackTrace();
                        }
                      }
                      n++;
                      "".length();
                      if ((0x23 ^ 0x73 ^ 0x34 ^ 0x60) < "   ".length())
                      {
                        return;
                        n++;
                        "".length();
                        if (" ".length() != "   ".length()) {
                          break;
                        }
                        return;
                      }
                    }
                  }
                }
              }
            }
            if ((g(this.ak)) && (g(j())) && (b(localCalendar)) && (h(((dt)localObject1).bs.b, af[42])))
            {
              n = af[0];
              while (c(n, ((dt)localObject1).az.size())) {
                if ((b(localObject2 = (fy)((dt)localObject1).az.elementAt(n))) && (d(((fy)localObject2).c())) && (h(((fy)localObject2).a.b, af[4])) && ((!f(((fy)localObject2).a.e, af[21])) || (g(((fy)localObject2).a.e, af[43]))) && ((!h(((fy)localObject2).a.e, af[44])) || (c(localCalendar.ef, localCalendar.cw * dt.d / af[29]))))
                {
                  try
                  {
                    int i3 = af[0];
                    while (c(i3, localCalendar.be.size()))
                    {
                      "".length();
                      "".length();
                      if ((0x95 ^ 0x91) != (0x84 ^ 0x80)) {
                        return;
                      }
                    }
                    i3 = ((dt)localObject1).eg;
                    n = ((dt)localObject1).ey;
                    "".length();
                    dl.ae().l(((fy)localObject2).a.e);
                    dl.ae().v();
                    ((fy)localObject2).e = System.currentTimeMillis();
                    ((fy)localObject2).k = af[1];
                    ((dt)localObject1).a(fn.dc[localObject2.a.e], af[0]);
                    Thread.sleep(1000L);
                    "".length();
                    "".length();
                    if (-" ".length() <= -" ".length()) {
                      break;
                    }
                    return;
                  }
                  catch (InterruptedException localInterruptedException6)
                  {
                    (localInterruptedException3 = localInterruptedException6).printStackTrace();
                  }
                }
                else
                {
                  n++;
                  "".length();
                  if (-"   ".length() >= 0) {
                    return;
                  }
                }
              }
            }
          }
          if ((f(a(System.currentTimeMillis() - this.ac, 602000L))) && (g(dt.f(), af[1])) && (b(localObject1 = dt.g(af[17]))))
          {
            dl.ae().ad(((ao)localObject1).n);
            this.ac = System.currentTimeMillis();
            return;
          }
          return;
        }
        a(this.d, this.f, this.t, this.o);
        return;
      }
      break;
    case 1: 
      if ((b(dn.as)) && (h(a(System.currentTimeMillis() - this.ag, 3600000L))))
      {
        if ((h(et.o, af[1])) && (h(et.b, af[45])))
        {
          localObject1 = dt.k(af[1]);
          i = dt.g().ci.equals(dn.as);
          if ((g(y)) && (g(i)))
          {
            d();
            dl.ae().n("sts");
            return;
          }
          if (a(localObject1))
          {
            localObject2 = fn.g(af[46]);
            "".length();
            cn.b(300000L);
            if (g(i)) {
              try
              {
                fn.c(af[46], fn.fm + af[1], af[0]);
                cn.r();
                Thread.sleep(2000L);
                return;
              }
              catch (InterruptedException localInterruptedException7)
              {
                (localInterruptedException3 = localInterruptedException7).printStackTrace();
              }
            }
            return;
          }
          if (f(((fb)localObject1).g, ((fb)localObject1).e)) {
            try
            {
              fn.c(af[46], fn.fm + af[1], af[4]);
              cn.c();
              Thread.sleep(2000L);
              return;
            }
            catch (InterruptedException localInterruptedException8)
            {
              (localObject2 = localInterruptedException8).printStackTrace();
            }
          }
          if (g(i))
          {
            localObject2 = dn.au;
            dn.au.a();
            ((r)localObject2).a = af[1];
            dn.a((r)localObject2);
            dl.ae().n("att " + ((r)localObject2).d + " " + ((r)localObject2).f + " " + ((bm)localObject2).v);
            return;
          }
          return;
        }
        a(af[1], af[45], af[2], af[2]);
        return;
      }
      d();
      return;
    case 2: 
      if ((!f(dt.g().ap, af[41])) || (e(a(System.currentTimeMillis() - this.ag, 10800000L))))
      {
        d();
        return;
      }
      if (d(this.ah))
      {
        if ((!h(et.o, af[1])) || (e(et.b, af[45])))
        {
          a(af[1], af[45], af[2], af[2]);
          return;
        }
        if (d(dt.bu, af[19]))
        {
          if (h(dt.bu, af[19]))
          {
            "".length();
            if (-(0x7E ^ 0x65 ^ 0x77 ^ 0x69) < 0) {
              break label1939;
            }
          }
          if (f(k = dt.b(af[48] + dt.bu / af[14]), af[4]))
          {
            "".length();
            if (-" ".length() != "  ".length()) {
              break label1988;
            }
          }
          int i2 = k = af[4] - k;
          int k = k;
          if (f(i2))
          {
            fn.c(af[38], af[0], af[0]);
            if (h(dt.bu, af[19]))
            {
              dl.ae().d(af[49], af[50], k);
              "".length();
              if ((0xA0 ^ 0xAC ^ 0x47 ^ 0x4E) != 0) {}
            }
            else
            {
              dl.ae().d(af[49], dt.bu / af[14], k);
            }
            cn.a();
          }
        }
        if (h(i.get(af[50]), af[4])) {
          try
          {
            fn.c(af[27], af[1], af[0]);
            Thread.sleep(2000L);
            "".length();
            if (-" ".length() > 0) {
              return;
            }
          }
          catch (InterruptedException localInterruptedException9)
          {
            InterruptedException localInterruptedException1;
            (localInterruptedException1 = localInterruptedException9).printStackTrace();
          }
        }
        this.ah = af[1];
        int m;
        if (f(m = dt.g().ap, af[34]))
        {
          cn.j();
          dn.a(new bx());
          w = af[1];
          return;
        }
        if (c(m, af[6]))
        {
          "".length();
          if (null == null) {}
        }
        else if (c(m, af[19]))
        {
          "".length();
          if (((0x3A ^ 0x5 ^ 0x4B ^ 0x68) & (81 + 62 - 132 + 135 ^ 41 + 31 - 65 + 135 ^ -" ".length())) > -" ".length()) {}
        }
        else if (c(m, af[7]))
        {
          "".length();
          if (-(27 + 35 - -84 + 26 ^ 72 + 122 - 181 + 155) < 0) {}
        }
        else if (c(m, af[20]))
        {
          "".length();
          if (-(0xC6 ^ 0xC2) <= 0) {
            break label2430;
          }
        }
        af[54].d = af[55];
        this.h = af[1];
        this.a = af[0];
        if ((f(m, af[7])) && (c(m, af[20])))
        {
          if (g(fn.ax.size(), af[1]))
          {
            dl.ae().i();
            return;
          }
          return;
        }
        if (b(dn.as)) {
          cn.j();
        }
      }
      else
      {
        if (d(w))
        {
          if (h(et.o, this.d))
          {
            b(af[2], af[2]);
            c(af[2]);
            return;
          }
          a(this.d, af[40], af[2], af[2]);
          return;
        }
        if (d(et.i(et.o))) {
          return;
        }
        fn.c(af[0], af[4], af[0]);
        dl.ae().q();
        this.ah = af[0];
        w = af[0];
        if (d(z)) {
          return;
        }
      }
      break;
    case 3: 
      if (d(this.ah))
      {
        if ((h(et.o, af[1])) && (h(et.b, af[45])))
        {
          fn.c(af[5], af[1], af[0]);
          if (g(cn.o()))
          {
            if (h(i.get(af[50]), af[4])) {
              try
              {
                fn.c(af[27], af[1], af[0]);
                Thread.sleep(2000L);
                "".length();
                if ("  ".length() <= " ".length()) {
                  return;
                }
              }
              catch (InterruptedException localInterruptedException10)
              {
                InterruptedException localInterruptedException2;
                (localInterruptedException2 = localInterruptedException10).printStackTrace();
              }
            }
            this.ah = af[1];
            return;
          }
          return;
        }
        a(af[1], af[45], af[2], af[2]);
        return;
      }
      break;
    default: 
      label1939:
      label1988:
      label2430:
      return;
    }
    d();
  }
  
  private static boolean h(int paramInt)
  {
    return paramInt < 0;
  }
  
  public final void a(String paramString)
  {
    if ((b(dn.as)) && (d(et.n(this.d))) && (g(paramString.startsWith("Thần thú đã xuất hiện tại"))))
    {
      if (g(dt.g().ci.equals(dn.as)))
      {
        int i = dt.g().ap;
        ci localci1 = new ci();
        ci localci2 = new ci();
        if ((f(i, af[6])) && (d(i, af[7])))
        {
          if (f(paramString.indexOf("Đảo Hebi")))
          {
            localci1.addElement(new Integer(af[8]));
            localci2.addElement(new Integer(af[9]));
          }
          if (f(paramString.indexOf("Hang Meiro")))
          {
            localci1.addElement(new Integer(af[10]));
            localci2.addElement(new Integer(af[9]));
          }
          if (f(paramString.indexOf("Rừng Kappa")))
          {
            localci1.addElement(new Integer(af[11]));
            localci2.addElement(new Integer(af[12]));
          }
          if (f(paramString.indexOf("Rừng Aokigahara")))
          {
            localci1.addElement(new Integer(af[13]));
            localci2.addElement(new Integer(af[14]));
          }
          if (f(paramString.indexOf("Rừng Aokigahara")))
          {
            localci1.addElement(new Integer(af[13]));
            localci2.addElement(new Integer(af[14]));
          }
          if (f(paramString.indexOf("Vách núi Ito")))
          {
            localci1.addElement(new Integer(af[15]));
            localci2.addElement(new Integer(af[14]));
          }
          if (f(paramString.indexOf("Núi Anzen")))
          {
            localci1.addElement(new Integer(af[16]));
            localci2.addElement(new Integer(af[17]));
          }
          if (f(paramString.indexOf("Thung lũng Taira")))
          {
            localci1.addElement(new Integer(af[18]));
            localci2.addElement(new Integer(af[14]));
          }
        }
        if ((f(i, af[19])) && (d(i, af[20])))
        {
          if (f(paramString.indexOf("Núi Ontake")))
          {
            localci1.addElement(new Integer(af[21]));
            localci2.addElement(new Integer(af[17]));
          }
          if (f(paramString.indexOf("Đỉnh Okama")))
          {
            localci1.addElement(new Integer(af[22]));
            localci2.addElement(new Integer(af[23]));
          }
        }
        if ((f(i, af[7])) && (d(i, af[24])))
        {
          if (f(paramString.indexOf("Khu đá đỏ Akai")))
          {
            localci1.addElement(new Integer(af[25]));
            localci2.addElement(new Integer(af[23]));
          }
          if (f(paramString.indexOf("Mũi Hone")))
          {
            localci1.addElement(new Integer(af[26]));
            localci2.addElement(new Integer(af[17]));
          }
          if (f(paramString.indexOf("Đỉnh Ichidai")))
          {
            localci1.addElement(new Integer(af[27]));
            localci2.addElement(new Integer(af[17]));
          }
          if (f(paramString.indexOf("Hang núi Kurai")))
          {
            localci1.addElement(new Integer(af[28]));
            localci2.addElement(new Integer(af[23]));
          }
        }
        if ((f(i, af[20])) && (d(i, af[29])))
        {
          if (f(paramString.indexOf("Ngôi đền Orochi")))
          {
            localci1.addElement(new Integer(af[30]));
            localci2.addElement(new Integer(af[31]));
          }
          if (f(paramString.indexOf("Đồng Kisei")))
          {
            localci1.addElement(new Integer(af[32]));
            localci2.addElement(new Integer(af[17]));
          }
          if (f(paramString.indexOf("Đền Harumoto")))
          {
            localci1.addElement(new Integer(af[33]));
            localci2.addElement(new Integer(af[23]));
          }
        }
        if (f(i, af[34]))
        {
          if (f(paramString.indexOf("Sinh Tử Kiều")))
          {
            localci1.addElement(new Integer(af[35]));
            localci2.addElement(new Integer(this.ad));
          }
          if (f(paramString.indexOf("Đoạn Sơn")))
          {
            localci1.addElement(new Integer(af[36]));
            localci2.addElement(new Integer(this.ad));
          }
        }
        if (f(localci1.size()))
        {
          dn.a(new u(localci1, localci2, this.ad));
          return;
        }
        return;
      }
      dn.a(new u(this.ad));
    }
  }
  
  public final String toString()
  {
    if ((g(this.ak)) && (g(this.ai))) {
      return "Stanima Buff HS";
    }
    if (g(this.ak)) {
      return "Stanima Buff";
    }
    if (g(this.ai)) {
      return "Stanima HS";
    }
    if ((e(this.v)) && (c(this.v, e.r.length))) {
      return "Stanima " + e.r[this.v].b;
    }
    return "Stanima";
  }
  
  private static boolean i(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static void r()
  {
    af = new int[56];
    af[0] = ((7 + '¦' - 60 + 66 ^ 93 + 127 - 195 + 103) & (0x58 ^ 0x7F ^ 0x4E ^ 0x5A ^ -" ".length()));
    af[1] = " ".length();
    af[2] = (-" ".length());
    af[3] = (0x65 ^ 0x72 ^ 0xD ^ 0x11);
    af[4] = "  ".length();
    af[5] = ("  ".length() ^ 0x2D ^ 0x2A);
    af[6] = (0x4 ^ 0x7C ^ 0x4C ^ 0x1C);
    af[7] = (0x3E ^ 0x2);
    af[8] = (0x2F ^ 0xC ^ " ".length());
    af[9] = (0x23 ^ 0x70 ^ 0x26 ^ 0x55);
    af[10] = ('' + 31 - 175 + 157 ^ 86 + 125 - 154 + 132);
    af[11] = (0x4E ^ 0x7A);
    af[12] = (0xBB ^ 0x8B ^ (0x67 ^ 0x5B) & (0x7 ^ 0x3B ^ 0xFFFFFFFF));
    af[13] = (0xC7 ^ 0xA7 ^ 0xAC ^ 0xC2);
    af[14] = (0xB7 ^ 0xBD);
    af[15] = ('' + 53 - 61 + 11 ^ 107 + 46 - 150 + 130);
    af[16] = (0xD7 ^ 0x93);
    af[17] = (0x9 ^ 0x60 ^ 0x51 ^ 0x1E);
    af[18] = (0xAA ^ 0x9B ^ 0x29 ^ 0x8);
    af[19] = (0xB4 ^ 0x86);
    af[20] = (0xA4 ^ 0xC4 ^ 0x51 ^ 0x77);
    af[21] = (0x7 ^ 0x6C ^ 0x8D ^ 0xA5);
    af[22] = (0x71 ^ 0x35 ^ 0x3F ^ 0x57);
    af[23] = (72 + 81 - 71 + 70 ^ '' + 33 - 80 + 91);
    af[24] = (0x5C ^ 0x66 ^ 0xF9 ^ 0x93);
    af[25] = (14 + 17 - 30 + 133 ^ 99 + 3 - 29 + 102);
    af[26] = (114 + 'µ' - 202 + 91 ^ 21 + 49 - 46 + 107);
    af[27] = (0xF5 ^ 0x93 ^ 0xC8 ^ 0xB6);
    af[28] = (0x3 ^ 0x2E);
    af[29] = (0x59 ^ 0x37 ^ 0x10 ^ 0x1A);
    af[30] = ('' + 124 - 119 + 8 ^ 90 + 13 - 44 + 79);
    af[31] = (0xAC ^ 0x89 ^ 0x49 ^ 0x7D);
    af[32] = (27 + 64 - 33 + 113 ^ 91 + 16 - 82 + 118);
    af[33] = (0x7C ^ 0x4A);
    af[34] = (0xEE ^ 0xC6 ^ 0x72 ^ 0x0);
    af[35] = (81 + 7 - 52 + 107);
    af[36] = (21 + 30 - 23 + 113);
    af[37] = "   ".length();
    af[38] = (8 + 78 - 46 + 114 ^ 15 + 120 - 8 + 31);
    af[39] = (0x4E ^ 0x24 ^ 0xE3 ^ 0x85);
    af[40] = (-"  ".length());
    af[41] = (0x28 ^ 0x36);
    af[42] = (0x57 ^ 0x51);
    af[43] = (0xB ^ 0x43);
    af[44] = (0x82 ^ 0xAD);
    af[45] = (0x8E ^ 0x9B ^ (0x28 ^ 0x23) & (0x1A ^ 0x11 ^ 0xFFFFFFFF));
    af[46] = (125 + 71 - 172 + 115 ^ 108 + 67 - 164 + 135);
    af[47] = (0x5C ^ 0x41);
    af[48] = (0xC ^ 0x1B);
    af[49] = (0xAE ^ 0xA7);
    af[50] = (0xBB ^ 0xBC);
    af[51] = (0x7E ^ 0x60 ^ 0x3D ^ 0x78);
    af[52] = (0x3 ^ 0x5D);
    af[53] = (0xD ^ 0x61 ^ 0x65 ^ 0x60);
    af[54] = (41 + 17 - 17 + 139 ^ 57 + '¡' - 49 + 29);
    af[55] = (0x4A ^ 0x50 ^ 0x2A ^ 0x4D);
  }
  
  private static boolean h(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  public static void q() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ej.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */