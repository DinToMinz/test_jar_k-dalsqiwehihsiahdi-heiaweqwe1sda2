public final class fv
  implements Runnable
{
  private static int[] a;
  private static String b;
  private static String c;
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private static void c()
  {
    a = new int[2];
    a[0] = (0xB1FD & 0x4FF6);
    a[1] = " ".length();
  }
  
  public final void run()
  {
    do
    {
      try
      {
        localObject = "Login: " + c;
        aw.h.a = a[0];
        aw.h.a((String)localObject, null, null, null);
        aw.u = aw.h;
        aw.h.b = a[1];
        au.g.c();
        Thread.sleep(1000L);
        au.g.a(au.n, au.e);
        dl.ae().b(c, b, "1.8.8");
        au.a(5000L);
        "".length();
        if ("  ".length() == 0) {
          return;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        Object localObject;
        (localObject = localInterruptedException).printStackTrace();
      }
    } while ((a(au.j)) && (!a(aw.ai, fn.eq)));
  }
  
  public static void a() {}
  
  static
  {
    cs.a(14);
    a();
  }
  
  fv(String paramString1, String paramString2)
  {
    c = paramString1;
    b = paramString2;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */