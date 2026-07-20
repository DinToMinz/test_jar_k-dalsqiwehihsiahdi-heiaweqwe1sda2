public final class cg
  extends r
{
  private fb w;
  private static int[] x;
  private static int y;
  public static boolean v;
  private static String[] z;
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  private static void p()
  {
    x = new int[8];
    x[0] = ((0xD5 ^ 0x9A) & (0x4F ^ 0x0 ^ 0xFFFFFFFF));
    x[1] = (0x70 ^ 0x18 ^ 0x14 ^ 0x69);
    x[2] = " ".length();
    x[3] = "  ".length();
    x[4] = (0x45 ^ 0x51);
    x[5] = (0x83 ^ 0x9A);
    x[6] = "   ".length();
    x[7] = (-" ".length());
  }
  
  public final void b()
  {
    if ((c(y, x[4])) && ((!e(this.i instanceof ej)) || (f(a(System.currentTimeMillis() - this.b, 3600000L)))))
    {
      if (g(dt.g().ef))
      {
        r.a(x[0]);
        return;
      }
      if (e(et.i(et.o)))
      {
        if (a(this.w))
        {
          fn.a("Nhận NV " + (y + x[2]) + "/20");
          fn.c(x[5], fn.fm, x[0]);
          cn.r();
          this.w = dt.k(x[0]);
          return;
        }
        if (d(this.w.g, this.w.e))
        {
          if (g(dt.f()))
          {
            fn.a("Hành trang đầy");
            return;
          }
          fn.a("Hoàn thành NV " + y + "/20");
          fn.c(x[5], fn.fm, x[3]);
          this.w = null;
          return;
        }
        fn.a("Đi làm NV " + y + "/20");
        fn.c(x[5], fn.fm, x[6]);
        et.d();
        b(this.f);
        return;
      }
      if ((b(this.w)) && (e(et.o, this.w.f)))
      {
        if (d(this.w.g, this.w.e))
        {
          r.n();
          return;
        }
        b(this.w.b, x[2]);
        c(x[7]);
        if (e(v))
        {
          fn.a("Nhiệm vụ " + y + "/20: " + this.w.g + "/" + this.w.e + " " + e.r[this.w.b].b);
          v = x[0];
        }
      }
    }
    else
    {
      fn.a("Hoàn thành!");
      dn.o();
    }
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  public static void c()
  {
    p();
    v = x[0];
    z = new String[] { "Hôm nay con đã làm hết nhiệm vụ ta giao. Hãy quay lại vào ngày hôm sau.", "Đây là lần nhận nhiệm vụ thứ ", " trong ngày hôm nay. Mỗi ngày được nhận tối đa 20 lần con nhé." };
  }
  
  static
  {
    cs.a(111);
    c();
  }
  
  public final String toString()
  {
    return "Auto NVHN: " + y + "/20";
  }
  
  public final void a()
  {
    y = x[0];
    this.w = dt.k(x[0]);
    super.a();
  }
  
  /* Error */
  public static void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getstatic 41	cg:z	[Ljava/lang/String;
    //   4: getstatic 39	cg:x	[I
    //   7: iconst_0
    //   8: iaload
    //   9: aaload
    //   10: invokevirtual 78	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   13: invokestatic 61	cg:e	(I)Z
    //   16: ifeq +15 -> 31
    //   19: getstatic 39	cg:x	[I
    //   22: iconst_1
    //   23: iaload
    //   24: putstatic 40	cg:y	I
    //   27: invokestatic 66	cn:m	()V
    //   30: return
    //   31: aload_0
    //   32: getstatic 41	cg:z	[Ljava/lang/String;
    //   35: getstatic 39	cg:x	[I
    //   38: iconst_2
    //   39: iaload
    //   40: aaload
    //   41: invokevirtual 79	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   44: dup
    //   45: istore_1
    //   46: invokestatic 59	cg:d	(I)Z
    //   49: ifeq +52 -> 101
    //   52: aload_0
    //   53: iload_1
    //   54: getstatic 41	cg:z	[Ljava/lang/String;
    //   57: getstatic 39	cg:x	[I
    //   60: iconst_2
    //   61: iaload
    //   62: aaload
    //   63: invokevirtual 80	java/lang/String:length	()I
    //   66: iadd
    //   67: aload_0
    //   68: getstatic 41	cg:z	[Ljava/lang/String;
    //   71: getstatic 39	cg:x	[I
    //   74: iconst_3
    //   75: iaload
    //   76: aaload
    //   77: invokevirtual 79	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   80: invokevirtual 81	java/lang/String:substring	(II)Ljava/lang/String;
    //   83: invokevirtual 82	java/lang/String:trim	()Ljava/lang/String;
    //   86: astore_0
    //   87: aload_0
    //   88: invokestatic 77	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   91: putstatic 40	cg:y	I
    //   94: return
    //   95: ldc 1
    //   97: invokevirtual 80	java/lang/String:length	()I
    //   100: pop2
    //   101: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	paramString	String
    //   45	22	1	i	int
    //   95	1	2	localNumberFormatException	NumberFormatException
    // Exception table:
    //   from	to	target	type
    //   87	94	95	java/lang/NumberFormatException
  }
  
  public final void m()
  {
    this.w = dt.k(x[0]);
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt <= 0;
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\cg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */