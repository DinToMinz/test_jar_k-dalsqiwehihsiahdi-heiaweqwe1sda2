public final class g
  extends bg
  implements ay
{
  private int g;
  private String[] h;
  private dt i;
  public bb a;
  private String[] j;
  private int k;
  public static g b;
  private int l;
  private int m;
  private int n;
  private int o = p[0];
  private static int[] p;
  private int q;
  
  private static boolean a(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void a(String paramString, dt paramdt)
  {
    if (c((paramString = bc.a(paramString, "\n", p[1])).length, p[2]))
    {
      "".length();
      return;
    }
    (b = a(paramString[p[1]], p[3], paramdt)).m = p[1];
    b.j = paramString;
    b.a = new bb(an.ik, b, p[4], null);
  }
  
  public final void a()
  {
    if (a(this.i))
    {
      this.k = this.i.eg;
      this.n = this.i.ey;
      this.g = (this.i.fp + p[5]);
    }
    if (a(this.l)) {
      this.l -= p[2];
    }
    if (d(this.q, p[2])) {
      this.q -= p[2];
    }
    if (((a(this.i)) && (a(this.i.dl)) && (!a(this.i.dl, this))) || ((a(this.i)) && (!a(this.i.dl))) || (b(this.l)))
    {
      "".length();
      "".length();
    }
  }
  
  public static g a(String paramString, int paramInt, dt paramdt)
  {
    g localg = new g();
    if (a(paramString.length(), p[5])) {
      localg.o = p[6];
    }
    if (c(aw.b, p[7])) {
      localg.o = p[7];
    }
    localg.h = ax.r.b(paramString, localg.o - p[5]);
    localg.l = paramInt;
    localg.i = paramdt;
    localg.k = paramdt.eg;
    localg.n = paramdt.ey;
    paramdt.dl = localg;
    localg.q = p[8];
    bg.f.addElement(localg);
    return localg;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public static void b() {}
  
  static
  {
    cs.a(7);
    b();
  }
  
  public final void a(cf paramcf)
  {
    int i1 = this.k;
    int i2 = this.n;
    paramcf.a(p[9]);
    paramcf.b(i1 - this.o / p[10] - p[2], i2 - this.g - p[11] + this.q - this.h.length * p[12] - p[5], this.o + p[10], (this.h.length + p[2]) * p[12] + p[2], p[12], p[12]);
    paramcf.a(p[1]);
    paramcf.a(i1 - this.o / p[10] - p[2], i2 - this.g - p[11] + this.q - this.h.length * p[12] - p[5], this.o + p[2], (this.h.length + p[2]) * p[12], p[12], p[12]);
    dq.a(paramcf, p[13], i1 - p[14], i2 - this.g - p[11] + this.q + p[10], p[1], p[15]);
    int i3 = p[1];
    while (a(i3, this.h.length))
    {
      ax.q.a(paramcf, this.h[i3], i1, i2 - this.g - p[11] + this.q + i3 * p[12] - this.h.length * p[12] - p[16], p[10]);
      i3++;
      "".length();
      if (null != null) {}
    }
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private static void d()
  {
    p = new int[17];
    p[0] = ('Ä' + 'Æ' - 288 + 121 ^ 51 + 89 - 66 + 61);
    p[1] = ((0x97 ^ 0xB0) & (0x6D ^ 0x4A ^ 0xFFFFFFFF));
    p[2] = " ".length();
    p[3] = (-(0xAE63 & 0x7D9E) & 0xEFEF & 0x3FF9);
    p[4] = (-(0xE8AF & 0x77DF) & 0xFFFFFFDE & 0x7FEF);
    p[5] = (0xAC ^ 0x90 ^ 0x61 ^ 0x57);
    p[6] = (0x2A ^ 0x1E ^ 0x5E ^ 0x2A);
    p[7] = (30 + 80 - -12 + 6);
    p[8] = (0xC1 ^ 0xC6);
    p[9] = (-" ".length() & 0xFFFFFFFF & 0xFFFFFF);
    p[10] = "  ".length();
    p[11] = (87 + 12 - 37 + 102 ^ 94 + 64 - 110 + 123);
    p[12] = (0x71 ^ 0x7D);
    p[13] = (-(0xFD5D & 0x5AA3) & 0xDBBD & 0x7FEF);
    p[14] = "   ".length();
    p[15] = (0x1A ^ 0xB);
    p[16] = (0x50 ^ 0x54);
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public final void a(int paramInt, Object paramObject)
  {
    if (c(paramInt, p[4]))
    {
      paramInt = b.m;
      paramInt++;
      if (b(paramInt, b.j.length))
      {
        b.i.dl = null;
        b = null;
        return;
      }
      (paramObject = a(b.j[paramInt], b.l, b.i)).m = paramInt;
      ((g)paramObject).j = b.j;
      ((g)paramObject).a = b.a;
      b = (g)paramObject;
    }
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */