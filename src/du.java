public final class du
  extends cj
{
  private String v;
  private boolean w;
  private static int[] x;
  
  public static void r() {}
  
  static
  {
    cs.a(12);
    r();
  }
  
  private static void t()
  {
    x = new int[5];
    x[0] = (0x2E ^ 0x28);
    x[1] = " ".length();
    x[2] = ((0x15 ^ 0x62 ^ 0xB8 ^ 0x89) & (0x1D ^ 0x51 ^ 0x12 ^ 0x18 ^ -" ".length()));
    x[3] = (0x4D ^ 0x5C);
    x[4] = "   ".length();
  }
  
  public final void a(dt paramdt, byte paramByte1, byte paramByte2)
  {
    if ((c(paramdt.cj, x[4])) && (d(this.w))) {
      try
      {
        dl.ae().s();
        dl.ae().a(this.v, "ljnkpro975", "");
        Thread.sleep(5000L);
        this.w = x[1];
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        (paramdt = localInterruptedException).printStackTrace();
        return;
      }
    }
    super.a(paramdt, paramByte1, paramByte2);
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public final boolean e(dt paramdt)
  {
    if (d(paramdt.cj, x[3])) {
      return x[1];
    }
    return x[2];
  }
  
  public du(String paramString)
  {
    super(x[0]);
    if (d(de.i()))
    {
      "".length();
      if (-(0x9D ^ 0x89 ^ 0x2A ^ 0x3A) < 0) {
        break label54;
      }
      throw null;
    }
    label54:
    x[1].w = x[2];
    this.v = paramString;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final String toString()
  {
    return "Auto Nhiệm Vụ 20S";
  }
  
  public static void s() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\du.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */