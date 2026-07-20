import javax.microedition.lcdui.Image;

public final class t
  extends bg
{
  private byte a = j[0];
  private ci b = new ci();
  private int g = j[0];
  private static Image h;
  private static Image i;
  private static int[] j;
  private static ba k;
  private static ba l;
  
  public final void a()
  {
    fq localfq2;
    fq localfq1;
    switch (this.a)
    {
    case 1: 
      localt = this;
      n = j[0];
      while (d(n, localt.g))
      {
        (localfq1 = localfq2 = (fq)localt.b.elementAt(n)).c += j[1];
        localfq2.d += localfq2.a * j[1];
        if (a(localfq2.b += j[10], localfq2.f)) {
          localfq2.b = j[0];
        }
        if ((!e(localfq2.c / j[1], fn.dz + aw.av - (j[6] - localfq2.e) * j[5])) || (!a(localfq2.d / j[1], fn.ad - aw.aq)) || (c(localfq2.d / j[1], fn.ad + aw.b + aw.aq))) {
          localt.a(localfq2);
        }
        n++;
        "".length();
        if (((0x62 ^ 0x5E) & (0x56 ^ 0x6A ^ 0xFFFFFFFF) & ((0x46 ^ 0x1B) & (0xCE ^ 0x93 ^ 0xFFFFFFFF) ^ 0xFFFFFFFF)) != ((0xEF ^ 0xA0) & (0xC ^ 0x43 ^ 0xFFFFFFFF))) {
          return;
        }
      }
      return;
    case 2: 
    default: 
      return;
    }
    t localt = this;
    int n = j[0];
    while (d(n, localt.g))
    {
      (localfq1 = localfq2 = (fq)localt.b.elementAt(n)).c += (localfq2.e + j[10]) * j[3];
      localfq2.d += (localfq2.e + j[10] << j[10]);
      if (c(localfq2.c / j[1], fn.dz + aw.av - (j[6] - localfq2.e) * j[14])) {
        localt.a(localfq2);
      }
      int m = fn.ad * (j[8] - localfq2.e) * j[4] / j[13];
      if (d(localfq2.d / j[1] + m, fn.ad - j[1])) {
        localfq2.d += (aw.b + j[4]) * j[1];
      }
      if (c(localfq2.d / j[1] + m, fn.ad + aw.b + j[1])) {
        localfq2.d -= (aw.b + j[4]) * j[1];
      }
      n++;
      "".length();
      if (((0xA3 ^ 0xA9) & (0x90 ^ 0x9A ^ 0xFFFFFFFF)) != 0) {}
    }
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  public static void b()
  {
    d();
    h = aw.c("/u/tuyet.png");
    i = aw.c("/u/cobay.png");
  }
  
  static
  {
    cs.a(121);
    b();
  }
  
  public t(byte paramByte, int paramInt)
  {
    this.a = paramByte;
    this.g = paramInt;
    switch (paramByte)
    {
    case 1: 
      paramInt = j[1];
      if (a(l)) {
        l = new ba(i, j[2], j[1]);
      }
    case 2: 
    default: 
      "".length();
      if (-" ".length() == -" ".length()) {
        break label165;
      }
      throw null;
    }
    if (a(k)) {
      k = new ba(h, j[3], j[3]);
    }
    label165:
    int m = j[0];
    while (d(m, paramInt))
    {
      fq localfq = new fq((fn.ad - j[4] + bc.c((aw.b + j[5]) / j[3]) * j[3]) * j[1], (fn.dz - j[4] + bc.c(aw.av / j[3]) * j[3]) * j[1]);
      if (b(paramByte, j[6]))
      {
        localfq.e = bc.c(j[6]);
        "".length();
        if ("  ".length() > (0x67 ^ 0x63)) {
          throw null;
        }
      }
      else
      {
        localfq.e = bc.c(j[7]);
      }
      localfq.f = (j[2] + (bc.c(j[6]) << j[8]));
      localfq.a = bc.b(j[9], j[10]);
      localfq.b = bc.c(localfq.f);
      this.b.addElement(localfq);
      m++;
      "".length();
      if (-(0x37 ^ 0x33) >= 0) {
        throw null;
      }
    }
  }
  
  private void a(fq paramfq)
  {
    paramfq.d = ((fn.ad - j[4] + bc.c((aw.b + j[5]) / j[3]) * j[3]) * j[1]);
    paramfq.c = ((fn.dz - aw.al + bc.c(aw.av / j[3]) * j[3]) * j[1]);
    if (b(this.a, j[6]))
    {
      paramfq.e = bc.c(j[6]);
      return;
    }
    paramfq.e = bc.c(j[7]);
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  private static void d()
  {
    j = new int[15];
    j[0] = ((0x41 ^ 0x70) & (0xF3 ^ 0xC2 ^ 0xFFFFFFFF));
    j[1] = (0x7 ^ 0x75 ^ 0x69 ^ 0x11);
    j[2] = (0x57 ^ 0x47);
    j[3] = (0xAD ^ 0xA8);
    j[4] = (0x7E ^ 0x6A);
    j[5] = (0x10 ^ 0x0 ^ 0xAC ^ 0x94);
    j[6] = "   ".length();
    j[7] = (0xB9 ^ 0xAD ^ 0x2A ^ 0x3A);
    j[8] = "  ".length();
    j[9] = (-" ".length());
    j[10] = " ".length();
    j[11] = (-((0xCD ^ 0xB4) + (0xFF ^ 0x93) - ('' + 6 - 84 + 92) + (102 + 80 - 58 + 6)));
    j[12] = ((0x3B ^ 0x23) + (0xDA ^ 0xB0) - (0x2B ^ 0x4F) + (17 + '' - 61 + 75));
    j[13] = (0x71 ^ 0x9);
    j[14] = (26 + 20 - 15 + 133 ^ 32 + 71 - 1 + 84);
  }
  
  public final void a(cf paramcf)
  {
    paramcf.a(-paramcf.b(), -paramcf.c());
    paramcf.c(j[0], j[11], aw.b, j[12] + aw.av);
    fq localfq;
    switch (this.a)
    {
    case 1: 
      m = j[0];
      while (d(m, this.g))
      {
        localfq = (fq)this.b.elementAt(m);
        l.a(localfq.b / (localfq.f / j[7]), localfq.d / j[1] - fn.ad, localfq.c / j[1] - fn.dz, j[0], j[6], paramcf);
        m++;
        "".length();
        if ("  ".length() == -" ".length()) {
          return;
        }
      }
      return;
    case 2: 
    default: 
      return;
    }
    int m = j[0];
    while (d(m, this.g))
    {
      if (a((localfq = (fq)this.b.elementAt(m)).e))
      {
        int n = ce.b().b * (j[8] - localfq.e) * j[4] / j[13] - fn.ad;
        k.a(localfq.e, n + localfq.d / j[1], localfq.c / j[1] - fn.dz, j[8], j[0], paramcf);
      }
      m++;
      "".length();
      if (((0x8D ^ 0x86) & (0xC ^ 0x7 ^ 0xFFFFFFFF)) > 0) {}
    }
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\t.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */