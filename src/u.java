import java.util.Vector;

public final class u
  extends r
{
  private static int[] x;
  private ci y;
  public int v;
  public int w;
  private ci z;
  private long aa;
  private int ab;
  
  private static boolean d(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(169);
    c();
  }
  
  public u(int paramInt)
  {
    this.w = x[2];
    this.v = x[1];
    this.ab = paramInt;
    this.aa = System.currentTimeMillis();
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt > 0;
  }
  
  public final String toString()
  {
    return "PKBoss S";
  }
  
  public u(ci paramci1, ci paramci2, int paramInt)
  {
    this.w = x[0];
    this.v = x[1];
    this.ab = paramInt;
    this.y = paramci1;
    this.z = paramci2;
  }
  
  private static void p()
  {
    x = new int[11];
    x[0] = ((63 + 37 - -55 + 90 ^ 82 + 30 - 26 + 85) & ('' + 112 - 210 + 176 ^ 111 + 87 - 72 + 14 ^ -" ".length()));
    x[1] = (-" ".length());
    x[2] = " ".length();
    x[3] = (0x9E ^ 0xB8);
    x[4] = (0 + 12 - -87 + 65 ^ '' + 32 - 58 + 74);
    x[5] = "  ".length();
    x[6] = "   ".length();
    x[7] = (0x42 ^ 0x46);
    x[8] = (-"  ".length());
    x[9] = (0x3 ^ 0x6);
    x[10] = (0x99 ^ 0x8F);
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public final void b()
  {
    if (d(dt.g().ef))
    {
      r.a(x[2]);
      return;
    }
    switch (this.w)
    {
    case 0: 
      if ((c(et.o, x[3])) && (c(et.b, x[4])))
      {
        cn.ad();
        this.w = x[5];
        return;
      }
      a(x[3], x[4], x[1], x[1]);
      return;
    case 1: 
      if (f(a(System.currentTimeMillis() - this.aa, 180000L)))
      {
        dn.o();
        return;
      }
      if ((!c(et.o, x[3])) || (d(et.b, x[4])))
      {
        a(x[3], x[4], x[1], x[1]);
        return;
      }
      break;
    case 2: 
      if (f(this.y.size()))
      {
        int i = this.y.size() - x[2];
        this.d = ((Integer)this.y.elementAt(i)).intValue();
        this.v = ((Integer)this.z.elementAt(i)).intValue();
        this.y.removeElementAt(i);
        this.z.removeElementAt(i);
        this.w = x[6];
        dl.ae().n("pkms " + this.d + " " + this.v);
        return;
      }
      this.w = x[7];
      dl.ae().n("pkes");
      return;
    case 3: 
      if (f(this.v))
      {
        if (d(et.o, this.v))
        {
          a(this.v, x[8], x[1], x[1]);
          return;
        }
        fn.c(x[9], x[2], x[0]);
        if (g(cn.o()))
        {
          this.w = x[9];
          dn.a(new bz(this.d));
          return;
        }
      }
      break;
    case 4: 
      if (d(this.ab))
      {
        this.ab = x[10];
        return;
      }
      if (d(et.o, this.ab))
      {
        a(this.ab, x[8], x[1], x[1]);
        return;
      }
      fn.c(x[9], x[2], x[0]);
      if (g(cn.o()))
      {
        dn.o();
        return;
      }
      break;
    case 5: 
      try
      {
        Thread.sleep(10000L);
        "".length();
        if ("  ".length() < " ".length()) {
          return;
        }
      }
      catch (InterruptedException localInterruptedException2)
      {
        InterruptedException localInterruptedException1;
        (localInterruptedException1 = localInterruptedException2).printStackTrace();
        if ((a(dn.as)) && (e(dt.g().ci.equals(dn.as))))
        {
          this.w = x[2];
          this.aa = System.currentTimeMillis();
          return;
        }
        this.w = x[5];
        return;
      }
    }
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\u.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */