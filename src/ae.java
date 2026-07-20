import java.util.Vector;

public final class ae
{
  private static int a;
  private static ak b;
  private static int c;
  private static int d;
  private static int e;
  private static int[] f;
  private static ci g;
  private static int h;
  private static int i;
  
  public static void a(cf paramcf)
  {
    int j = h;
    int k = aw.av - f[0];
    int m = aw.b;
    if (a(aw.s))
    {
      if (d(aw.b, f[1]))
      {
        j = f[2];
        m = aw.b - f[3];
        "".length();
        if (-" ".length() <= 0) {}
      }
      else
      {
        j = f[4];
        m = aw.b - f[5] - f[6];
      }
      k = aw.av - f[7];
      h = j + f[8];
    }
    if ((b(b)) && ((!b(aw.u)) || (a(aw.u.e))))
    {
      paramcf.c(f[9], f[9], aw.b, aw.av);
      if (a(aw.s))
      {
        en.d(j, k - f[10], m + f[6], i + f[11], paramcf);
        "".length();
        if (" ".length() >= 0) {}
      }
      else
      {
        paramcf.a(f[9]);
        paramcf.b(j - f[8], k, m + f[8], i);
      }
      paramcf.c(j, k, m, i);
      b.b.a(paramcf, b.a, e, k + f[12], f[9]);
    }
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static boolean a()
  {
    if ((c(c, f[16])) && (b(g.size()))) {
      return f[13];
    }
    return f[9];
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static void e()
  {
    f = new int[21];
    f[0] = (0x2C ^ 0x3B);
    f[1] = (-(0xDE17 & 0x7BEA) & 0xFFFFFFDF & 0x5BE3);
    f[2] = (55 + 52 - 90 + 113);
    f[3] = (-(0xCFF7 & 0x789A) & 0xD995 & 0x6FFF);
    f[4] = (0x92 ^ 0xB1 ^ 0xC3 ^ 0xB0);
    f[5] = (6 + 60 - -2 + 92);
    f[6] = (0x4E ^ 0x55 ^ 0x70 ^ 0x61);
    f[7] = (0x54 ^ 0x68);
    f[8] = "  ".length();
    f[9] = ((0x5A ^ 0x12) & (0xDD ^ 0x95 ^ 0xFFFFFFFF));
    f[10] = (0x4D ^ 0x49);
    f[11] = (0xAE ^ 0xA6);
    f[12] = "   ".length();
    f[13] = " ".length();
    f[14] = (0x1B ^ 0xF);
    f[15] = (66 + 51 - 70 + 90 ^ 99 + '' - 137 + 46);
    f[16] = (0x66 ^ 0x63);
    f[17] = ((0xD0 ^ 0xA1) + (0x43 ^ 0x20) - (113 + 107 - 79 + 8) + (0xE5 ^ 0xA4));
    f[18] = (0xB2 ^ 0xA9 ^ 0x6C ^ 0x70);
    f[19] = (0xA2 ^ 0x92);
    f[20] = (0x6E ^ 0x57);
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  public static void a(String paramString, int paramInt, ax paramax)
  {
    if (b(b(paramString)))
    {
      if (c(aw.b, f[17])) {
        h = f[13];
      }
      if (a(g.size(), f[6])) {
        g.removeElementAt(f[9]);
      }
      g.addElement(new ak(paramString, paramax, paramInt));
    }
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public static void b()
  {
    if (b(c))
    {
      if (b((e = e + (h - e) / f[12]) - h, f[12]))
      {
        e = h + f[8];
        c = f[8];
        d = f[9];
      }
    }
    else if (c(c, f[8]))
    {
      if (a(d = d + f[13], b.c))
      {
        c = f[12];
        d = f[9];
      }
    }
    else if (c(c, f[12]))
    {
      if (b(e + a, h + aw.b - f[14]))
      {
        e -= f[15];
        "".length();
        if ("  ".length() < "   ".length()) {}
      }
      else
      {
        e -= f[8];
      }
      if (b(e + a, h))
      {
        c = f[10];
        d = f[9];
      }
    }
    else if (c(c, f[10]))
    {
      if (a(d = d + f[13], f[6]))
      {
        c = f[16];
        d = f[9];
      }
    }
    else if (c(c, f[16]))
    {
      if (c(g.size()))
      {
        ak localak = (ak)g.firstElement();
        g.removeElementAt(f[9]);
        if ((b(b)) && (a(localak.a.equals(b.a)))) {
          return;
        }
        b = localak;
        a = localak.b.a(b.a);
        d = f[9];
        c = f[9];
        e = aw.b;
        return;
      }
      b = null;
    }
  }
  
  public static void c()
  {
    e();
    g = new ci();
    c = f[16];
    h = f[8];
    i = f[14];
  }
  
  static
  {
    cs.a(139);
    c();
  }
  
  public static void a(String paramString)
  {
    if (b(b(paramString)))
    {
      if (c(aw.b, f[17])) {
        h = f[13];
      }
      if (a(g.size(), f[6])) {
        g.removeElementAt(f[9]);
      }
      g.addElement(new ak(paramString));
    }
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean b(String paramString)
  {
    if ((b(b)) && (b(b.a)) && (a(paramString.equals(b.a)))) {
      return f[13];
    }
    if ((c(g.size())) && (a(paramString.equals(((ak)g.lastElement()).a)))) {
      return f[13];
    }
    if (b(paramString.length(), f[11])) {
      return f[9];
    }
    String str1;
    String str2;
    if ((b(b)) && (b(b.a)) && (b(c, f[12])) && (d(b.a.length(), f[11])))
    {
      str1 = paramString.substring(f[9], f[11]);
      str2 = b.a.substring(f[9], f[11]);
      if (a(str1.equals(str2)))
      {
        int k = f[18];
        while ((b(k, paramString.length())) && (b(k, b.a.length())) && ((!d(paramString.charAt(k), f[19])) || (a(paramString.charAt(k), f[20]))) && (c(paramString.charAt(k), b.a.charAt(k))))
        {
          k++;
          "".length();
          if ("  ".length() >= (0x2D ^ 0x29)) {
            return (0xA7 ^ 0xA1) & (0x4E ^ 0x48 ^ 0xFFFFFFFF);
          }
        }
        str2 = paramString.substring(k, paramString.length());
        b.a = (b.a + ", " + str2);
        c = f[8];
        d = f[9];
        return f[13];
      }
    }
    if ((c(g.size())) && (d((str1 = ((ak)g.lastElement()).a).length(), f[11])))
    {
      str2 = paramString.substring(f[9], f[11]);
      String str3 = str1.substring(f[9], f[11]);
      if (a(str2.equals(str3)))
      {
        int j = f[18];
        while ((b(j, paramString.length())) && (b(j, str1.length())) && ((!d(paramString.charAt(j), f[19])) || (a(paramString.charAt(j), f[20]))) && (c(paramString.charAt(j), str1.charAt(j))))
        {
          j++;
          "".length();
          if ("  ".length() > "   ".length()) {
            return (0x18 ^ 0x1D) & (0x35 ^ 0x30 ^ 0xFFFFFFFF);
          }
        }
        paramString = paramString.substring(j, paramString.length());
        new StringBuffer(String.valueOf(str1));
        "".length();
        return f[13];
      }
    }
    return f[9];
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ae.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */