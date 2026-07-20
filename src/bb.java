import javax.microedition.lcdui.Image;

public final class bb
{
  public int a = f.c;
  public String[] b;
  public int c = k[0];
  public int d;
  public Image e;
  public ay f;
  public String g;
  public int h = k[0];
  private static int[] k;
  public int i = f.g;
  private boolean l = k[0];
  public Object j;
  
  public bb(String paramString, int paramInt, Object paramObject)
  {
    this.g = paramString;
    this.d = paramInt;
    this.j = paramObject;
  }
  
  public bb(String paramString, ay paramay, int paramInt, Object paramObject)
  {
    this.g = paramString;
    this.d = paramInt;
    this.f = paramay;
    this.j = paramObject;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  public bb(String paramString, int paramInt1, int paramInt2)
  {
    this.g = paramString;
    this.d = k[0];
    this.c = paramInt1;
    this.h = paramInt2;
  }
  
  public bb(String paramString, int paramInt)
  {
    this.g = paramString;
    this.d = paramInt;
  }
  
  public bb(String paramString, ay paramay, int paramInt1, int paramInt2, int paramInt3)
  {
    this.g = paramString;
    this.d = paramInt1;
    this.f = paramay;
    this.j = null;
    this.c = paramInt2;
    this.h = paramInt3;
    this.a = f.c;
    this.i = f.g;
  }
  
  private static void f()
  {
    k = new int[6];
    k[0] = ((0xFC ^ 0x9C) & (0x52 ^ 0x32 ^ 0xFFFFFFFF));
    k[1] = "  ".length();
    k[2] = "   ".length();
    k[3] = (0x23 ^ 0x7);
    k[4] = (0x9E ^ 0x98);
    k[5] = " ".length();
  }
  
  public final void a()
  {
    if ((a(this.c)) && (a(this.h)) && (b(d())))
    {
      c();
      aw.y = k[0];
      this.l = k[0];
    }
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static void b() {}
  
  static
  {
    cs.a(145);
    b();
  }
  
  public final void c()
  {
    if (a(this.d))
    {
      if (a(this.f))
      {
        this.f.a(this.d, this.j);
        return;
      }
      fn.j().b(this.d, this.j);
    }
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  public final void a(cf paramcf)
  {
    if (a(this.e))
    {
      paramcf.a(this.e, this.c + cf.a(this.e) / k[1], this.h + cf.b(this.e) / k[1], k[2]);
      return;
    }
    if (a(this.g, "")) {
      if (c(this.l))
      {
        paramcf.a(fn.ey, this.c, this.h, k[0]);
        "".length();
        if (-(0x3F ^ 0x3A) < 0) {}
      }
      else
      {
        paramcf.a(fn.t, this.c, this.h, k[0]);
      }
    }
    ax.h.a(paramcf, this.g, this.c + k[3], this.h + k[4], k[1]);
  }
  
  public final boolean d()
  {
    this.l = k[0];
    if (b(aw.b(this.c - k[2], this.h - k[2], this.a + k[4], this.i + k[4])))
    {
      if (b(aw.y)) {
        this.l = k[5];
      }
      if ((b(aw.j)) && (b(aw.as))) {
        return k[5];
      }
    }
    return k[0];
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 != paramObject2;
  }
  
  public static void e() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bb.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */