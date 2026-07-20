import java.util.Random;

public final class cy
  implements Runnable
{
  private int c;
  public static int a;
  private static int[] d;
  public static long b;
  
  public final void run()
  {
    if (b(et.o, d[0]))
    {
      fn.a("Đứng ở Okaza để auto");
      fn.a("0");
      return;
    }
    int i = d[1];
    fn.c(d[2], d[1], d[1]);
    do
    {
      i++;
      dl.ae().n();
      aw.h();
      try
      {
        Thread.sleep(b);
        "".length();
        if ((0x1E ^ 0x1A) < (0xE ^ 0xA)) {
          return;
        }
      }
      catch (InterruptedException localInterruptedException2)
      {
        InterruptedException localInterruptedException1;
        (localInterruptedException1 = localInterruptedException2).printStackTrace();
      }
    } while (!a(i, this.c));
  }
  
  public static void a()
  {
    c();
    b = 10L;
    new Random();
  }
  
  static
  {
    cs.a(136);
    a();
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static void c()
  {
    d = new int[3];
    d[0] = (0x1F ^ 0x57);
    d[1] = ((0x1D ^ 0x48) & (0xD2 ^ 0x87 ^ 0xFFFFFFFF));
    d[2] = (0x8F ^ 0x91);
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  cy(int paramInt)
  {
    this.c = paramInt;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\cy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */