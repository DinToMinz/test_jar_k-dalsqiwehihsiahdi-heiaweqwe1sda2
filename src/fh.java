public final class fh
  implements Runnable
{
  private au a;
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  public fh(au paramau)
  {
    this.a = paramau;
  }
  
  public final void run()
  {
    do
    {
      try
      {
        aw.m();
        this.a.c();
        Thread.sleep(5000L);
        this.a.a(au.n, au.e);
        bv.e = au.c;
        dl.ae().b(de.h, de.j, "1.8.8");
        au.a(10000L);
        dl.ae().d(fz.o);
        au.a(5000L);
        "".length();
        if (-" ".length() != -" ".length()) {
          return;
        }
      }
      catch (InterruptedException localInterruptedException2)
      {
        InterruptedException localInterruptedException1;
        (localInterruptedException1 = localInterruptedException2).printStackTrace();
      }
    } while ((a(au.j)) && (!a(aw.ai, fn.eq)));
  }
  
  public static void a() {}
  
  static
  {
    cs.a(131);
    a();
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */