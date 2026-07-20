import java.util.Vector;

public final class bf
  extends bg
{
  private int a;
  private int b;
  private int g;
  private int h = j[0];
  private dt i;
  private static int[] j;
  private long k = 0L;
  private dc l;
  private short m = j[1];
  
  public final void a(cf paramcf)
  {
    if (a(this.i))
    {
      this.b = this.i.eg;
      this.g = this.i.ey;
    }
    int n = this.b + this.l.a[this.a].c * this.h;
    int i1 = this.g + this.l.a[this.a].b;
    if (d(aw.e(n, i1)))
    {
      if (b(this.h, j[0]))
      {
        "".length();
        if (((0xBD ^ 0xC4 ^ 0x21 ^ 0x1B) & (7 + ' ' - 66 + 151 ^ '¾' + 31 - 69 + 39 ^ -" ".length())) >= (" ".length() & (" ".length() ^ -" ".length()))) {
          break label208;
        }
      }
      label208:
      dq.a(this.l.a[this.a].a, n, i1, j[1], j[2], j[3]);
    }
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static void d()
  {
    j = new int[6];
    j[0] = " ".length();
    j[1] = ((0xF8 ^ 0xB5) & (0x38 ^ 0x75 ^ 0xFFFFFFFF));
    j[2] = "  ".length();
    j[3] = "   ".length();
    j[4] = (0xE3 ^ 0x9B);
    j[5] = (0xB8 ^ 0xB3);
  }
  
  public static void b() {}
  
  static
  {
    cs.a(142);
    b();
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    bf localbf;
    (localbf = new bf()).l = fn.fg[paramInt1];
    localbf.b = paramInt2;
    localbf.g = paramInt3;
    localbf.m = ((short)paramInt4);
    bg.f.addElement(localbf);
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 != paramObject2;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public static void a(int paramInt1, dt paramdt, int paramInt2)
  {
    bf localbf;
    (localbf = new bf()).l = fn.fg[paramInt1];
    localbf.i = paramdt;
    localbf.m = ((short)paramInt2);
    bg.f.addElement(localbf);
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt != 0;
  }
  
  public final void a()
  {
    if (d(a(0L, 0L)))
    {
      this.a += j[0];
      if (a(this.a, this.l.a.length)) {
        this.a = j[1];
      }
      if (a(a(System.currentTimeMillis(), 0L)))
      {
        if (b(this.l.b, j[4])) {
          aw.d = j[1];
        }
        "".length();
        "".length();
        if ((0x31 ^ 0x35) >= "   ".length()) {}
      }
    }
    else
    {
      this.a += j[0];
      if (a(this.a, this.l.a.length))
      {
        this.m = ((short)(this.m - j[0]));
        if (c(this.m))
        {
          if (b(this.l.b, j[4])) {
            aw.d = j[1];
          }
          "".length();
          "".length();
          if (-" ".length() >= -" ".length()) {}
        }
        else
        {
          this.a = j[1];
        }
      }
    }
    if ((b(aw.ap % j[5])) && (a(this.i)) && (a(this.i, dt.g())) && (b(fn.ep.contains(this.i)))) {
      "".length();
    }
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte)
  {
    bf localbf;
    (localbf = new bf()).l = fn.fg[paramInt1];
    localbf.b = paramInt2;
    localbf.g = paramInt3;
    localbf.m = ((short)paramInt4);
    localbf.h = paramByte;
    bg.f.addElement(localbf);
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */