public final class cc
  extends bo
{
  private int v = dt.g().cj;
  private static int[] w;
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public final String toString()
  {
    return "Trả NV";
  }
  
  public final boolean e(dt paramdt)
  {
    if (c(paramdt.cj, this.v)) {
      return w[0];
    }
    return w[1];
  }
  
  public final void a(dt paramdt, byte paramByte1, byte paramByte2) {}
  
  private static void r()
  {
    w = new int[2];
    w[0] = " ".length();
    w[1] = ((0x16 ^ 0x44) & (0x41 ^ 0x13 ^ 0xFFFFFFFF));
  }
  
  public static void p() {}
  
  static
  {
    cs.a(125);
    p();
  }
  
  public static void q() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\cc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */