public final class fw
{
  public cd[] a;
  private static int[] b;
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static void c()
  {
    b = new int[6];
    b[0] = (0x7F ^ 0x77);
    b[1] = " ".length();
    b[2] = (0x3F ^ 0x2D);
    b[3] = "  ".length();
    b[4] = (0x5F ^ 0x55);
    b[5] = "   ".length();
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  public fw(int paramInt)
  {
    if (a(paramInt)) {
      this.a = new cd[b[0]];
    }
    if (a(paramInt, b[1])) {
      this.a = new cd[b[2]];
    }
    if (a(paramInt, b[3])) {
      this.a = new cd[b[4]];
    }
    if (a(paramInt, b[5])) {
      this.a = new cd[b[3]];
    }
  }
  
  public static void a() {}
  
  static
  {
    cs.a(132);
    a();
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */