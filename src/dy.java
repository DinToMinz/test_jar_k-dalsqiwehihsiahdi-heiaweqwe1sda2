public final class dy
  extends f
{
  public static int h;
  private static int[] i;
  
  private static void j()
  {
    i = new int[2];
    i[0] = " ".length();
    i[1] = (0x36 ^ 0x7F ^ 0x6 ^ 0x4A);
  }
  
  public final void f()
  {
    int tmp3_0 = h;
    h = tmp3_0 + i[0];
    if (a(tmp3_0, i[1]))
    {
      if (b(df.c("indLanguage")))
      {
        aw.j();
        aw.au.b();
        return;
      }
      aw.j();
      aw.ar.b();
    }
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public static void h() {}
  
  static
  {
    cs.a(42);
    h();
  }
  
  public static void i() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\dy.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */