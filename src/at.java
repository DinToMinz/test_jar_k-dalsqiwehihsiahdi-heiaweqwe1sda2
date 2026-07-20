public final class at
{
  public String a;
  public byte b;
  public boolean c;
  public String d;
  private static int[] j;
  public short e;
  public short f;
  public short g;
  public byte h;
  public byte i;
  
  public static void a() {}
  
  static
  {
    cs.a(155);
    a();
  }
  
  public at(short paramShort1, byte paramByte1, byte paramByte2, String paramString1, String paramString2, byte paramByte3, short paramShort2, short paramShort3, boolean paramBoolean)
  {
    this.f = paramShort1;
    this.b = paramByte1;
    this.h = paramByte2;
    this.a = paramString1;
    this.d = paramString2;
    this.i = paramByte3;
    this.g = paramShort2;
    this.e = paramShort3;
    this.c = paramBoolean;
  }
  
  public final boolean b()
  {
    if ((b(this.b, j[3])) && (a(this.b, j[4]))) {
      return j[1];
    }
    return j[2];
  }
  
  public final boolean c()
  {
    if ((a(this.b)) && (a(this.b, j[0]))) {
      return j[1];
    }
    return j[2];
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static void e()
  {
    j = new int[5];
    j[0] = (0x96 ^ 0x99);
    j[1] = " ".length();
    j[2] = ((0x3B ^ 0xE ^ 0xAF ^ 0x95) & (0x10 ^ 0x2D ^ 0xB2 ^ 0x80 ^ -" ".length()));
    j[3] = (0x5C ^ 0x78 ^ 0x87 ^ 0xB4);
    j[4] = (89 + 80 - 2 + 24 ^ '¥' + 88 - 143 + 56);
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\at.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */