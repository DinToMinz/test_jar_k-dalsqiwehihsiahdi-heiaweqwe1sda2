import java.io.DataInputStream;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

public final class bc
{
  private static short[] a;
  private static int[] b;
  private static short[] c;
  private static Random d;
  private static int[] e;
  
  public static String a(long paramLong, int paramInt)
  {
    String str = "";
    long l1;
    if (k(a(l1 = (paramLong + paramInt - System.currentTimeMillis()) / 1000L, 0L))) {
      return "";
    }
    long l2 = 0L;
    long l3 = 0L;
    long l4 = l1 / 60L;
    long l5 = l1;
    if (j(a(l1, 86400L)))
    {
      l2 = l1 / 86400L;
      l3 = l1 % 86400L / 3600L;
      "".length();
      if (((47 + 73 - 70 + 133 ^ 10 + 118 - 88 + 151) & (0x8 ^ 0xC ^ 0x0 ^ 0xC ^ -" ".length())) != 0) {
        return null;
      }
    }
    else if (j(a(l1, 3600L)))
    {
      l3 = l1 / 3600L;
      l4 = l1 % 3600L / 60L;
      "".length();
      if ("   ".length() < 0) {
        return null;
      }
    }
    else if (j(a(l1, 60L)))
    {
      l5 = l1 % 60L;
      "".length();
      if ((0x50 ^ 0x5A ^ 0x3C ^ 0x32) <= "   ".length()) {
        return null;
      }
    }
    else
    {
      l5 = l1;
    }
    if (g(a(l2, 0L)))
    {
      if (j(a(l2, 10L)))
      {
        if (h(a(l3, 1L)))
        {
          new StringBuffer();
          "".length();
          if ("  ".length() == " ".length()) {
            return null;
          }
        }
        else if (h(a(l3, 10L)))
        {
          new StringBuffer();
          "".length();
          if ("   ".length() != 0) {
            break label409;
          }
          return null;
        }
        label409:
        paramLong = l2 + "d" + l3 + "h";
        "".length();
        if ((0x1B ^ 0x1F) <= "   ".length()) {
          return null;
        }
      }
      else
      {
        if (j(a(l2, 10L))) {
          return str;
        }
        if (h(a(l3, 1L)))
        {
          new StringBuffer();
          "".length();
          if (null != null) {
            return null;
          }
        }
        else if (h(a(l3, 10L)))
        {
          new StringBuffer();
          "".length();
          if ((0xFC ^ 0xA9 ^ 0x1C ^ 0x4C) != 0) {
            break label589;
          }
          return null;
        }
        label589:
        paramLong = l2 + "d" + l3 + "h";
        "".length();
        if (-"   ".length() > 0) {
          return null;
        }
      }
    }
    else if (g(a(l3, 0L)))
    {
      if (j(a(l3, 10L)))
      {
        if (h(a(l4, 1L)))
        {
          new StringBuffer();
          "".length();
          if (((109 + 125 - 76 + 35 ^ 21 + 42 - -24 + 54) & (0xD9 ^ 0x8A ^ 0x63 ^ 0x7C ^ -" ".length())) <= -" ".length()) {
            return null;
          }
        }
        else if (h(a(l4, 10L)))
        {
          new StringBuffer();
          "".length();
          if (((0x6A ^ 0x61 ^ 0x4F ^ 0x41) & (0xA2 ^ 0xA7 ^ (0xD ^ 0x4) & (0x57 ^ 0x5E ^ 0xFFFFFFFF) ^ -" ".length())) == 0) {
            break label850;
          }
          return null;
        }
        label850:
        paramLong = l3 + "h" + l4 + "m";
        "".length();
        if ("  ".length() != "  ".length()) {
          return null;
        }
      }
      else
      {
        if (j(a(l3, 10L))) {
          return str;
        }
        if (h(a(l4, 1L)))
        {
          new StringBuffer();
          "".length();
          if ("   ".length() == 0) {
            return null;
          }
        }
        else if (h(a(l4, 10L)))
        {
          new StringBuffer();
          "".length();
          if ("   ".length() > "  ".length()) {
            break label1031;
          }
          return null;
        }
        label1031:
        paramLong = l3 + "h" + l4 + "m";
        "".length();
        if (null != null) {
          return null;
        }
      }
    }
    else
    {
      if (g(a(l4, 0L)))
      {
        if (j(a(l4, 10L)))
        {
          if (j(a(l5, 10L)))
          {
            new StringBuffer();
            "".length();
            if (null != null) {
              return null;
            }
          }
          else
          {
            if (j(a(l5, 10L))) {
              return str;
            }
            new StringBuffer();
            "".length();
            if (null != null) {
              return null;
            }
          }
        }
        else
        {
          if (j(a(l4, 10L))) {
            return str;
          }
          if (j(a(l5, 10L)))
          {
            new StringBuffer();
            "".length();
            if ("   ".length() == 0) {
              return null;
            }
          }
          else
          {
            if (j(a(l5, 10L))) {
              return str;
            }
            new StringBuffer();
            "".length();
            if (null != null) {
              return null;
            }
          }
        }
      }
      else if (h(a(l5, 10L)))
      {
        new StringBuffer("0");
        "".length();
        if ((0x59 ^ 0x11 ^ 0x0 ^ 0x4C) > 0) {
          break label1395;
        }
        return null;
      }
      label1395:
      paramLong = paramLong = l5 + "s";
    }
    return paramLong;
  }
  
  public static int a(int paramInt)
  {
    if (g(paramInt)) {
      return paramInt;
    }
    return -paramInt;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public static final int b(int paramInt)
  {
    if ((j(paramInt = d(paramInt))) && (e(paramInt, e[2]))) {
      return c[paramInt];
    }
    if ((f(paramInt, e[2])) && (e(paramInt, e[5]))) {
      return c[(e[5] - paramInt)];
    }
    if ((f(paramInt, e[5])) && (e(paramInt, e[6]))) {
      return -c[(paramInt - e[5])];
    }
    return -c[(e[7] - paramInt)];
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public static DataInputStream a(String paramString)
  {
    DataInputStream localDataInputStream = null;
    if (a(paramString = "".getClass().getResourceAsStream(paramString))) {
      localDataInputStream = new DataInputStream(paramString);
    }
    return localDataInputStream;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static String[] a(String paramString1, String paramString2, int paramInt)
  {
    int i;
    if (j(i = paramString1.indexOf(paramString2)))
    {
      paramString2 = a(paramString1.substring(i + paramString2.length()), paramString2, paramInt + e[8]);
      "".length();
      if (null != null) {
        return null;
      }
    }
    else
    {
      paramString2 = new String[paramInt + e[8]];
      i = paramString1.length();
    }
    paramString2[paramInt] = paramString1.substring(e[1], i);
    return paramString2;
  }
  
  private static boolean h(int paramInt)
  {
    return paramInt < 0;
  }
  
  public static int c(int paramInt)
  {
    return d.nextInt(paramInt);
  }
  
  public static void a(cf paramcf)
  {
    paramcf.a(-paramcf.b(), -paramcf.c());
    paramcf.c(e[1], e[1], aw.b, aw.av);
  }
  
  private static boolean i(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public static final int d(int paramInt)
  {
    if (f(paramInt, e[7])) {
      paramInt -= 360;
    }
    if (h(paramInt)) {
      paramInt += 360;
    }
    return paramInt;
  }
  
  private static boolean j(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean k(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  public static final int a(int paramInt1, int paramInt2)
  {
    if (i(paramInt1))
    {
      if (g(paramInt2)) {
        return e[2];
      }
      return e[6];
    }
    int i = Math.abs((paramInt2 << e[4]) / paramInt1);
    int j = e[1];
    do
    {
      if (d(j, e[2]))
      {
        i = e[1];
        "".length();
        if (" ".length() != "   ".length()) {
          break;
        }
        return (0x4F ^ 0x5A) & (0x90 ^ 0x85 ^ 0xFFFFFFFF);
      }
      if (f(b[j], i))
      {
        i = j;
        "".length();
        if ("  ".length() >= "  ".length()) {
          break;
        }
        return (94 + '' - 80 + 71 ^ 82 + 31 - 32 + 117) & (0x65 ^ 0x1C ^ 0xF8 ^ 0xA4 ^ -" ".length());
      }
      j++;
      "".length();
    } while ("  ".length() == "  ".length());
    return (0xAC ^ 0xA1) & (0x46 ^ 0x4B ^ 0xFFFFFFFF);
    if ((j(paramInt2)) && (h(paramInt1))) {
      i = e[5] - i;
    }
    if ((h(paramInt2)) && (h(paramInt1))) {
      i += 180;
    }
    if ((h(paramInt2)) && (j(paramInt1))) {
      return e[7] - i;
    }
    return i;
  }
  
  private static void e()
  {
    e = new int['³'];
    e[0] = (0x65 ^ 0x3E);
    e[1] = ((0xEB ^ 0xA8) & (0xC1 ^ 0x82 ^ 0xFFFFFFFF));
    e[2] = (0x11 ^ 0x4B);
    e[3] = (0xFFFFFFFF & 0x7FFFFFFF);
    e[4] = (0x1D ^ 0x17);
    e[5] = ((0x60 ^ 0x14) + (0x56 ^ 0x63) - (0x85 ^ 0xAD) + (0x17 ^ 0x24));
    e[6] = (-(0xBE96 & 0x67FB) & 0xFFFFFFBF & 0x27DF);
    e[7] = (-(0xB76D & 0x5E9A) & 0xF77F & 0x1FEF);
    e[8] = " ".length();
    e[9] = "  ".length();
    e[10] = (0x71 ^ 0x63);
    e[11] = (0x70 ^ 0x54);
    e[12] = "   ".length();
    e[13] = (0x87 ^ 0xBA ^ 0xBB ^ 0xB0);
    e[14] = (0x33 ^ 0x24 ^ 0xB7 ^ 0xA4);
    e[15] = (0x4F ^ 0x8);
    e[16] = (0xA ^ 0xF);
    e[17] = (0x77 ^ 0x2E);
    e[18] = (0xFC ^ 0xA1 ^ 0x7A ^ 0x21);
    e[19] = (0xAB ^ 0xC0);
    e[20] = (0x63 ^ 0x64);
    e[21] = (0x34 ^ 0x49);
    e[22] = (92 + 9 - -26 + 36 ^ '' + '¥' - 175 + 47);
    e[23] = ((0x9A ^ 0xC2) + (53 + 118 - 72 + 37) - (0xDF ^ 0x83) + (0x28 ^ 0x23));
    e[24] = (0x62 ^ 0x6B);
    e[25] = (23 + 119 - 77 + 95);
    e[26] = ((0x40 ^ 0x56) + (36 + 4 - -28 + 95) - (121 + '' - 153 + 60) + (31 + 123 - 6 + 7));
    e[27] = (0xD8 ^ 0xC3 ^ 0x3E ^ 0x2E);
    e[28] = (11 + '' - -28 + 4);
    e[29] = (1 + 123 - -35 + 27 ^ '' + 71 - 169 + 130);
    e[30] = ((0x76 ^ 0xB) + (0x18 ^ 0x6C) - ('Î' + 37 - 98 + 92) + (40 + 81 - 89 + 177));
    e[31] = (0xA1 ^ 0xAC);
    e[32] = (5 + 'É' - 32 + 56);
    e[33] = (0xB7 ^ 0xAC ^ 0x61 ^ 0x74);
    e[34] = ((0x2D ^ 0x74) + (13 + 101 - 76 + 174) - (0xD9D5 & 0x272A) + (13 + '´' - 76 + 86));
    e[35] = (0xC4 ^ 0x9A ^ 0xEE ^ 0xBF);
    e[36] = (0xFFFFFFAD & 0x15B);
    e[37] = (0xD ^ 0x1D);
    e[38] = (-(0xF9EE & 0x3EB7) & 0xBDFF & 0x7BBF);
    e[39] = (0x16 ^ 0x7);
    e[40] = (0xD57F & 0x2BAB);
    e[41] = (-(0xFE43 & 0x7BFE) & 0xFFFFFFFD & 0x7B7F);
    e[42] = (101 + 46 - 22 + 3 ^ 33 + 8 - 22 + 128);
    e[43] = (0xE3DF & 0x1D6D);
    e[44] = (0x0 ^ 0x32 ^ 0x31 ^ 0x17);
    e[45] = (-(0xFED7 & 0x632A) & 0xFF5F & 0x63FF);
    e[46] = (123 + 93 - 202 + 113 ^ 0xCE ^ 0xA4);
    e[47] = (-(0xFAF5 & 0x6F9B) & 0xFFFFFFFF & 0x6BFF);
    e[48] = (64 + 36 - 82 + 114 ^ 125 + 12 - 2 + 11);
    e[49] = (-(0xE7BF & 0x7E73) & 0xFFFFFFFF & 0x67B2);
    e[50] = (0x3C ^ 0x2B);
    e[51] = (0xAFB9 & 0x51D6);
    e[52] = (0xAF ^ 0xB3 ^ 0xC0 ^ 0xC4);
    e[53] = (-(0xEFDB & 0x767F) & 0xEFFF & 0x77FA);
    e[54] = (0x6 ^ 0x1F);
    e[55] = (0xE5BF & 0x1BF1);
    e[56] = (0xB0 ^ 0xAA);
    e[57] = (-(0xF9AB & 0x4E75) & 0xCDFF & 0x7BE1);
    e[58] = (0x4A ^ 0x51);
    e[59] = (0x8DFB & 0x73D5);
    e[60] = (7 + 48 - 7 + 80 ^ 5 + 74 - -76 + 1);
    e[61] = (0xE7F9 & 0x19E7);
    e[62] = (0xAF ^ 0xB2);
    e[63] = (0xC5F5 & 0x3BFA);
    e[64] = (50 + 126 - 171 + 183 ^ 78 + '' - 124 + 65);
    e[65] = (-(0xDB38 & 0x74EF) & 0xD76F & 0x7AB7);
    e[66] = (0x3C ^ 0x23);
    e[67] = (0xA68F & 0x5B7F);
    e[68] = (75 + 60 - 131 + 163 ^ 105 + 27 - 87 + 90);
    e[69] = (-(0xF2F9 & 0x7DC7) & 0xFAFF & 0x77DF);
    e[70] = ('¨' + 66 - 186 + 181 ^ 82 + 42 - 111 + 183);
    e[71] = (-(0xBDE2 & 0x679F) & 0xFFFFFFEF & 0x27BF);
    e[72] = (0x2 ^ 0x1B ^ 0xA4 ^ 0x9F);
    e[73] = (-(0xCD13 & 0x7FED) & 0xDF3F & 0x6FFD);
    e[74] = (0x2D ^ 0xE);
    e[75] = (0xE2FB & 0x1F4F);
    e[76] = (-(0xB5AF & 0x5A56) & 0xBEDF & 0x537F);
    e[77] = (0x2A ^ 0x59 ^ 0x2E ^ 0x78);
    e[78] = (-(0xF856 & 0x7FAF) & 0xFEFD & 0x7B6F);
    e[79] = (0x5 ^ 0x23);
    e[80] = (-(0xDEFF & 0x7981) & 0xDAFE & 0x7FF7);
    e[81] = (0x1C ^ 0x3B);
    e[82] = (-(0xF16D & 0x7FFB) & 0xF7FF & 0x7BEC);
    e[83] = (0x93 ^ 0xBB);
    e[84] = (0x869E & 0x7BF3);
    e[85] = (0x46 ^ 0x6F);
    e[86] = (-(0xEF76 & 0x39CB) & 0xAFF5 & 0x7BEB);
    e[87] = (117 + 104 - 192 + 131 ^ '' + 104 - 177 + 81);
    e[88] = (-(0xFADF & 0x3D61) & 0xBEED & 0x7BFF);
    e[89] = (0x49 ^ 0x4E ^ 0xF ^ 0x23);
    e[90] = (-(0xF586 & 0x6E7B) & 0xE6BF & 0x7FFB);
    e[91] = (0xD9 ^ 0xB7 ^ 0x7B ^ 0x39);
    e[92] = (-(0xFD59 & 0x1FB7) & 0xDFD7 & 0x3FFF);
    e[93] = (0x8 ^ 0x51 ^ 0x6E ^ 0x1A);
    e[94] = (0xCFDC & 0x32F7);
    e[95] = (0xB ^ 0x25);
    e[96] = (-(0xBF9F & 0x6579) & 0xB7FD & 0x6FFB);
    e[97] = (0x48 ^ 0xD ^ 0xC1 ^ 0xAB);
    e[98] = (0xDBED & 0x26FF);
    e[99] = (0xAC ^ 0x9C);
    e[100] = (0xCBFD & 0x36FB);
    e[101] = (0x92 ^ 0x8E ^ 0x10 ^ 0x3D);
    e[102] = (-(0x977F & 0x6CC1) & 0xFFFFFFE7 & 0x75D);
    e[103] = (0x6D ^ 0x5F);
    e[104] = (-(0xE2E5 & 0x7DFB) & 0xFBFA & 0x67F5);
    e[105] = (0xAD ^ 0x9E);
    e[106] = (-(0xFE47 & 0x5DFA) & 0xDF5F & 0x7FFD);
    e[107] = (0xBB ^ 0x8F);
    e[108] = (-(0xED53 & 0x76FD) & 0xE77F & 0x7FF7);
    e[109] = (0x41 ^ 0x74);
    e[110] = (-(0xFD5E & 0x7AEB) & 0xFBFB & 0x7F7F);
    e[111] = (-(0x9FBB & 0x7CC5) & 0x9FFC & 0x7FBF);
    e[112] = (0xD7 ^ 0xA4 ^ 0x14 ^ 0x50);
    e[113] = (-(0xD69F & 0x7DF9) & 0xDFFF & 0x77DF);
    e[114] = ('ª' + 97 - 262 + 250 ^ 37 + '' - 74 + 88);
    e[115] = (-(0xDEBF & 0x79E7) & 0xDBF7 & 0x7FFF);
    e[116] = (0xF1 ^ 0x8F ^ 0xE4 ^ 0xA3);
    e[117] = (-(0xB1D5 & 0x5EAB) & 0xFBDB & 0x17FF);
    e[118] = (0x5B ^ 0x61);
    e[119] = (-" ".length() & 0x9375 & 0x6FEE);
    e[120] = (0x85 ^ 0xBE);
    e[121] = (-(0xFF02 & 0x38FF) & 0xFF7F & 0x3BEF);
    e[122] = (94 + 52 - 105 + 209 ^ 103 + 44 - 114 + 165);
    e[123] = (-(0xFF25 & 0x60DB) & 0xF7FF & 0x6B77);
    e[124] = ("   ".length() ^ 0xB3 ^ 0x8D);
    e[125] = (-(0xDC7D & 0x3FFF) & 0xFFFFFFFF & 0x1FFC);
    e[126] = (0xB9 ^ 0x98 ^ 0xAD ^ 0xB2);
    e[127] = (0xD78E & 0x2BF9);
    e[''] = (0x88 ^ 0xB7);
    e[''] = (0xEFF1 & 0x139E);
    e[''] = (0x56 ^ 0x16);
    e[''] = (0x9799 & 0x6BFE);
    e[''] = (0xC1 ^ 0x80);
    e[''] = (-(0xF44F & 0x1FFD) & 0xDFED & 0x37FE);
    e[''] = (0x36 ^ 0x74);
    e[''] = (-(0xAC93 & 0x7B7D) & 0xEBFF & 0x3FB7);
    e[''] = (30 + 49 - -105 + 18 ^ 100 + 98 - 155 + 94);
    e[''] = (0xDBBF & 0x27EF);
    e[''] = (0x55 ^ 0x11);
    e[''] = (0xEBF5 & 0x17BF);
    e[''] = (0x18 ^ 0x5D);
    e[''] = (0xBBBE & 0x47FD);
    e[''] = (0x6E ^ 0x28);
    e[''] = (-(0xD877 & 0x679D) & 0xDFF6 & 0x63DF);
    e[''] = (0x87FC & 0x7BCB);
    e[''] = (0x65 ^ 0x2D);
    e[''] = (-(0xFC77 & 0x4BBA) & 0xFFFFFFFF & 0x4BFF);
    e[''] = (0xC1 ^ 0xC4 ^ 0x12 ^ 0x5E);
    e[''] = (0xDFDB & 0x23F7);
    e[''] = (0xEF ^ 0xA5);
    e[''] = (-(0xFD7F & 0x4AA8) & 0xDFFF & 0x6BFF);
    e[''] = (0x23 ^ 0x46 ^ 0x6B ^ 0x45);
    e[''] = (-(0xDAD3 & 0x2D2D) & 0xAFFF & 0x5BDD);
    e[''] = ('¿' + 88 - 197 + 111 ^ 36 + 0 - -71 + 34);
    e[''] = (-(0xD69F & 0x3D7A) & 0xBFFF & 0x57FB);
    e[''] = (0x77 ^ 0x3A);
    e[''] = (0xB7E7 & 0x4BFE);
    e[''] = (0x51 ^ 0x58 ^ 0x66 ^ 0x21);
    e[''] = (-(0xDC3D & 0x2FD3) & 0xCFFA & 0x3FFF);
    e[''] = (0xD1 ^ 0x9E);
    e[' '] = (0x93FD & 0x6FEF);
    e['¡'] = (0x8B ^ 0xC2 ^ 0x68 ^ 0x71);
    e['¢'] = (0xE7F9 & 0x1BF6);
    e['£'] = (0x49 ^ 0x18);
    e['¤'] = (0xEBF3 & 0x17FF);
    e['¥'] = (0xFA ^ 0xA8);
    e['¦'] = (-(0xD4EA & 0x7F1F) & 0xD7FF & 0x7FFF);
    e['§'] = ('Ì' + 46 - 70 + 49 ^ 66 + 59 - 78 + 135);
    e['¨'] = (0xDBFD & 0x27FA);
    e['©'] = (0x5B ^ 0x62 ^ 0x8 ^ 0x65);
    e['ª'] = (-(0xEEA7 & 0x5D59) & 0xDFFA & 0x6FFF);
    e['«'] = (0x44 ^ 0x10 ^ " ".length());
    e['¬'] = (-(0xDCC3 & 0x6F3F) & 0xCFFE & 0x7FFF);
    e['­'] = (0x33 ^ 0x65);
    e['®'] = (-(0xAC31 & 0x7BCF) & 0xFBFF & 0x2FFE);
    e['¯'] = (0x4C ^ 0x1B);
    e['°'] = (-(0xD451 & 0x2FAF) & 0xAFFF & 0x57FF);
    e['±'] = (0xE9 ^ 0xBF ^ 0x1D ^ 0x13);
    e['²'] = (-(0xEBC3 & 0x3F7E) & 0xAFEF & 0x7F51);
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public static void a()
  {
    a = new short[e[0]];
    b = new int[e[0]];
    int i = e[1];
    while (c(i, e[2]))
    {
      a[i] = c[(e[2] - i)];
      if (i(a[i]))
      {
        b[i] = e[3];
        "".length();
        if (" ".length() < "   ".length()) {}
      }
      else
      {
        b[i] = ((c[i] << e[4]) / a[i]);
      }
      i++;
      "".length();
      if ("   ".length() <= " ".length()) {}
    }
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (int)Math.sqrt((paramInt1 - paramInt3) * (paramInt1 - paramInt3) + (paramInt2 - paramInt4) * (paramInt2 - paramInt4));
  }
  
  public static int e(int paramInt)
  {
    if (k(paramInt)) {
      return e[1];
    }
    int i = (paramInt + e[8]) / e[9];
    do
    {
      int j = i / e[9] + paramInt / (i << e[8]);
      if (c(Math.abs(i - j), e[8])) {
        return j;
      }
      i = j;
      "".length();
    } while (" ".length() != "  ".length());
    return (59 + 91 - 105 + 145 ^ 66 + 51 - 60 + 106) & (65 + '' - 141 + 97 ^ 105 + 12 - -55 + 3 ^ -" ".length());
  }
  
  public static Calendar b()
  {
    return Calendar.getInstance(TimeZone.getTimeZone("GMT+7"));
  }
  
  public static void c()
  {
    e();
    c = new short[] { e[1], e[10], e[11], e[13], e[15], e[17], e[19], e[21], e[23], e[25], e[26], e[28], e[30], e[32], e[34], e[36], e[38], e[40], e[41], e[43], e[45], e[47], e[49], e[51], e[53], e[55], e[57], e[59], e[61], e[63], e[65], e[67], e[69], e[71], e[73], e[75], e[76], e[78], e[80], e[82], e[84], e[86], e[88], e[90], e[92], e[94], e[96], e[98], e[100], e[102], e[104], e[106], e[108], e[110], e[111], e[113], e[115], e[117], e[119], e[121], e[123], e[125], e[127], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[''], e[' '], e['¢'], e['¤'], e['¦'], e['¨'], e['ª'], e['¬'], e['®'], e['°'], e['°'], e['²'], e['²'] };
    d = new Random();
  }
  
  static
  {
    cs.a(166);
    c();
  }
  
  public static final int f(int paramInt)
  {
    if ((j(paramInt = d(paramInt))) && (e(paramInt, e[2]))) {
      return a[paramInt];
    }
    if ((f(paramInt, e[2])) && (e(paramInt, e[5]))) {
      return -a[(e[5] - paramInt)];
    }
    if ((f(paramInt, e[5])) && (e(paramInt, e[6]))) {
      return -a[(paramInt - e[5])];
    }
    return a[(e[7] - paramInt)];
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if ((f(paramInt1, paramInt3)) && (e(paramInt1, paramInt3 + paramInt5)) && (f(paramInt2, paramInt4)) && (e(paramInt2, paramInt4 + paramInt6))) {
      return e[8];
    }
    return e[1];
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return paramInt1 + d.nextInt(paramInt2 - paramInt1);
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */