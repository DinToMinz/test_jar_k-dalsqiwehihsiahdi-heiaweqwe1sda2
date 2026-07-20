public final class m
  implements Runnable
{
  private static int[] a;
  private final ao b;
  
  public m(ao paramao)
  {
    this.b = paramao;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final void run()
  {
    try
    {
      int i = a[0];
      while ((a(i, this.b.u)) && (b(dt.f())))
      {
        if (a(aw.ai instanceof fn)) {
          return;
        }
        dl.ae().ad(this.b.n);
        Thread.sleep(1L);
        i++;
        "".length();
        if ("   ".length() != "   ".length()) {
          return;
        }
      }
      return;
    }
    catch (InterruptedException localInterruptedException2)
    {
      InterruptedException localInterruptedException1;
      (localInterruptedException1 = localInterruptedException2).printStackTrace();
    }
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static void c()
  {
    a = new int[1];
    a[0] = ((0x1 ^ 0x7) & (0x7A ^ 0x7C ^ 0xFFFFFFFF));
  }
  
  public static void a() {}
  
  static
  {
    cs.a(9);
    a();
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\m.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */