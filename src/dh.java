public final class dh
  implements Runnable
{
  private final int a;
  private static int[] b;
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static void c()
  {
    b = new int[12];
    b[0] = (0xDC ^ 0xBA ^ 0x1 ^ 0x6A);
    b[1] = (-" ".length());
    b[2] = (0x58 ^ 0x57);
    b[3] = (20 + 70 - 17 + 71 ^ 39 + 59 - 31 + 67);
    b[4] = ('á' + 'Ë' - 332 + 148 ^ 111 + 103 - 182 + 119);
    b[5] = (0x7D ^ 0x6D ^ 0xFD ^ 0x8A);
    b[6] = (45 + 42 - 11 + 58);
    b[7] = (" ".length() + (0x54 ^ 0x5) - -(0xB2 ^ 0x81) + "  ".length());
    b[8] = (30 + 87 - -17 + 2);
    b[9] = ((0x9A ^ 0x8A) + (0xE6 ^ 0xC4) - (0x77 ^ 0x7B) + (0x2B ^ 0x48));
    b[10] = ('' + 60 - 155 + 118 ^ 17 + 69 - 36 + 82);
    b[11] = (0x5E ^ 0x75 ^ 0x2C ^ 0x24);
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public dh(int paramInt)
  {
    this.a = paramInt;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(13);
    a();
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt < 0;
  }
  
  public final void run()
  {
    Object localObject = fn.g(b[0]);
    int i = b[1];
    if ((a(localObject)) && (c(((dt)localObject).ee, b[2])))
    {
      if ((!b(Math.abs(((dt)localObject).eg - dt.g().eg), b[3])) || (a(Math.abs(((dt)localObject).ey - dt.g().ey), b[3])))
      {
        "".length();
        "".length();
        if ("   ".length() >= ((0x1D ^ 0x7E) & (0x53 ^ 0x30 ^ 0xFFFFFFFF))) {}
      }
    }
    else
    {
      if ((c(et.o, b[4])) && (c(et.o, b[5])) && (c(et.o, b[6])) && (c(et.o, b[7])) && (c(et.o, b[8])) && (c(et.o, b[9]))) {
        return;
      }
      if ((a(i = dt.d(b[10]))) && (a(i = dt.d(b[11])))) {
        return;
      }
    }
    dl.ae().b(this.a, i);
    et.d();
    try
    {
      Thread.sleep(100L);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      (localObject = localInterruptedException).printStackTrace();
    }
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\dh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */