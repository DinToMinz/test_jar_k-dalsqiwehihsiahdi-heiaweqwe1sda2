import java.util.Vector;

public final class eh
  implements Runnable
{
  private static int[] a;
  private final int b;
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static void c()
  {
    a = new int[2];
    a[0] = ((0xA6 ^ 0x87 ^ 0xC9 ^ 0xA6) & (23 + 73 - 90 + 233 ^ 14 + '' - 71 + 64 ^ -" ".length()));
    a[1] = " ".length();
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public eh(int paramInt)
  {
    this.b = paramInt;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(86);
    a();
  }
  
  public final void run()
  {
    try
    {
      int i = this.b;
      if (b(this.b)) {
        i = a[0];
      }
      if (a(i, et.t.size())) {
        i = et.t.size() - a[1];
      }
      et.b(i);
      "".length();
      if (null != null) {
        return;
      }
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
      System.gc();
      if (a(au.a().d)) {
        fn.j().b();
      }
      aw.p();
      aw.x = a[0];
    }
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt < 0;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\eh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */