public final class ar
  extends r
{
  private int v;
  private static int[] w;
  
  private static boolean d(int paramInt)
  {
    return paramInt != 0;
  }
  
  public final void b() {}
  
  private static void p()
  {
    w = new int[28];
    w[0] = (-" ".length());
    w[1] = (0x58 ^ 0x53 ^ 0x8B ^ 0xA8);
    w[2] = (0x7A ^ 0x48);
    w[3] = (0x49 ^ 0x51 ^ 0x51 ^ 0x6B);
    w[4] = (0xA0 ^ 0xAC ^ 0x63 ^ 0x4C);
    w[5] = ('' + 54 - 86 + 86 ^ 54 + 97 - 113 + 93);
    w[6] = (0x99 ^ 0x97);
    w[7] = (0xD1 ^ 0x80 ^ 0x74 ^ 0x2A);
    w[8] = ('' + 'Û' - 338 + 202 ^ '' + 43 - 39 + 19);
    w[9] = (0x3A ^ 0x2A);
    w[10] = (0xB4 ^ 0x88);
    w[11] = (115 + 11 - 44 + 163 ^ 'µ' + 'µ' - 269 + 89);
    w[12] = (0x38 ^ 0x43 ^ 0xCA ^ 0x9D);
    w[13] = (111 + '' - 137 + 96 ^ '' + 43 - 140 + 130);
    w[14] = (0x61 ^ 0x7 ^ 0x29 ^ 0x66);
    w[15] = (0x49 ^ 0x72);
    w[16] = (0x31 ^ 0x8 ^ 0x44 ^ 0x65);
    w[17] = (0x2E ^ 0x3);
    w[18] = (0x15 ^ 0x45);
    w[19] = (100 + 81 - 107 + 88 ^ 45 + 94 - 47 + 85);
    w[20] = (0xA8 ^ 0x8C);
    w[21] = (0x56 ^ 0x60);
    w[22] = (0xDE ^ 0x84);
    w[23] = (0x2D ^ 0x49);
    w[24] = ((0x4D ^ 0x18) + (0x9A ^ 0xA3) - (0x93 ^ 0x99) + (0x51 ^ 0x58));
    w[25] = (0x3F ^ 0x51);
    w[26] = ((0xF4 ^ 0x96) + (0xC0 ^ 0x8C) - (0x15 ^ 0x36) + "   ".length());
    w[27] = ((0x56 ^ 0x30) + (0xCB ^ 0xC0) - (0x52 ^ 0x38) + (122 + 25 - 81 + 70));
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public final void a(String paramString)
  {
    if (d(paramString.startsWith("Thần thú đã xuất hiện tại")))
    {
      int i = w[0];
      if ((d(this.v, w[1])) && (c(this.v, w[2])))
      {
        if (e(paramString.indexOf("Đảo Hebi"))) {
          i = w[3];
        }
        if (e(paramString.indexOf("Hang Meiro"))) {
          i = w[4];
        }
        if (e(paramString.indexOf("Rừng Kappa"))) {
          i = w[5];
        }
        if (e(paramString.indexOf("Rừng Aokigahara"))) {
          i = w[6];
        }
        if (e(paramString.indexOf("Vách núi Ito"))) {
          i = w[7];
        }
        if (e(paramString.indexOf("Núi Anzen"))) {
          i = w[8];
        }
        if (e(paramString.indexOf("Thung lũng Taira"))) {
          i = w[9];
        }
      }
      if ((d(this.v, w[2])) && (c(this.v, w[10])))
      {
        if (e(paramString.indexOf("Núi Ontake"))) {
          i = w[11];
        }
        if (e(paramString.indexOf("Đỉnh Okama"))) {
          i = w[12];
        }
      }
      if ((d(this.v, w[10])) && (c(this.v, w[13])))
      {
        if (e(paramString.indexOf("Khu đá đỏ Akai"))) {
          i = w[14];
        }
        if (e(paramString.indexOf("Mũi Hone"))) {
          i = w[15];
        }
        if (e(paramString.indexOf("Đỉnh Ichidai"))) {
          i = w[16];
        }
        if (e(paramString.indexOf("Hang núi Kurai"))) {
          i = w[17];
        }
      }
      if ((d(this.v, w[13])) && (c(this.v, w[18])))
      {
        if (e(paramString.indexOf("Ngôi đền Orochi"))) {
          i = w[19];
        }
        if (e(paramString.indexOf("Đồng Kisei"))) {
          i = w[20];
        }
        if (e(paramString.indexOf("Đền Harumoto"))) {
          i = w[21];
        }
      }
      if ((d(this.v, w[22])) && (c(this.v, w[23])) && (e(paramString.indexOf("Đoạn Sơn")))) {
        i = w[24];
      }
      if ((d(this.v, w[23])) && (c(this.v, w[25])) && (e(paramString.indexOf("Đảo Quỷ")))) {
        i = w[26];
      }
      if ((d(this.v, w[25])) && (e(paramString.indexOf("Sinh Tử Kiều")))) {
        i = w[27];
      }
      if (e(i)) {
        dn.a(new bz(i));
      }
    }
  }
  
  public final String toString()
  {
    return "Chờ boss " + this.v;
  }
  
  public ar(int paramInt)
  {
    this.v = paramInt;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(106);
    c();
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ar.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */