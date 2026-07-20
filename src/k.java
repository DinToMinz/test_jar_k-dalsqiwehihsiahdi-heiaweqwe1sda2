public final class k
  implements ay
{
  private static int[] h;
  private static k i;
  private long j = 0L;
  public String a;
  public bb b = null;
  public ek c = new ek();
  public cq d;
  public boolean e = h[0];
  public bb f = new bb(an.ng, this, h[3], aw.b - h[4], aw.av - f.g + h[2]);
  public bb g = new bb(an.g, this, h[1], h[2], aw.av - f.g + h[2]);
  
  private static boolean a(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  protected k()
  {
    this.c.c = "chat";
    this.c.a = h[5];
    this.c.h = (dm.b.c() - h[6]);
    this.c.k = (f.d + h[7]);
    this.c.e = h[2];
    this.c.a(h[8]);
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  public final void a(cf paramcf)
  {
    if (b(this.e)) {
      this.c.b(paramcf);
    }
  }
  
  public final void a(int paramInt, cq paramcq, String paramString)
  {
    this.f.g = an.qt;
    this.a = paramString;
    "".length();
    if ((c(this.c.a().equals(""))) && (b(aw.u)))
    {
      this.d = paramcq;
      this.e = h[2];
    }
    this.c.j = paramString;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(70);
    a();
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 8000: 
      if (a(this.d))
      {
        long l;
        if (a(a((l = System.currentTimeMillis()) - this.j, 1000L))) {
          return;
        }
        this.j = l;
        this.d.a(this.c.a(), this.a);
        this.c.a("");
        this.f.g = an.qt;
        return;
      }
      break;
    case 8001: 
      this.c.b();
      if (b(this.c.a().equals("")))
      {
        this.e = h[0];
        this.d.a();
      }
      break;
    }
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public final void a(String paramString)
  {
    this.f.g = an.qt;
    this.a = paramString;
    if (b(aw.u))
    {
      this.e = h[2];
      if (b(aw.s)) {
        this.c.c();
      }
    }
    this.c.j = paramString;
  }
  
  private static void d()
  {
    h = new int[9];
    h[0] = ((0x86 ^ 0x8D) & (0x81 ^ 0x8A ^ 0xFFFFFFFF));
    h[1] = (-(0xFAFB & 0x65BF) & 0xFFFFFFFA & 0x7FFF);
    h[2] = " ".length();
    h[3] = (-(0xE4DD & 0x7BAF) & 0xFFFFFFDD & 0x7FEF);
    h[4] = (114 + 13 - 12 + 49 ^ 56 + 47 - 70 + 112);
    h[5] = (0xBF ^ 0xAF);
    h[6] = (0x66 ^ 0x4F ^ 0x23 ^ 0x2A);
    h[7] = "  ".length();
    h[8] = (0x36 ^ 0x1E);
  }
  
  public static k b()
  {
    if (b(i)) {
      return i = new k();
    }
    return i;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject == null;
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */