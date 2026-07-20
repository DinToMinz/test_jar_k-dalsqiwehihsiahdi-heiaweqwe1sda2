import java.util.Vector;

public final class aj
{
  private static int[] b;
  private static ci c;
  public static int a;
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  public static String a()
  {
    if (a(c.size())) {
      return "";
    }
    if ((!a(a, c.size())) || (d(a))) {
      a = b[0];
    }
    int i = a;
    do
    {
      df localdf;
      int j = (localdf = (df)c.elementAt(a = (a + b[1]) % c.size())).d();
      int k = localdf.e();
      if ((b(j)) && (b(k))) {
        return "@" + dt.g().ci + " bán " + localdf.e + " " + localdf.j + "k " + localdf.b + " cái, mua " + localdf.a + "k " + localdf.h + " cai, mua bán pm";
      }
      if (b(j)) {
        return "@" + dt.g().ci + " bán " + localdf.e + " " + localdf.j + "k " + localdf.b + " cái, mua pm";
      }
      if (b(k)) {
        return "@" + dt.g().ci + " mua " + localdf.e + " " + localdf.a + "k " + localdf.h + " cái, bán pm hoặc gd";
      }
    } while (!b(i, a));
    return "";
  }
  
  public static df a(String paramString)
  {
    int i = b[0];
    while (a(i, c.size()))
    {
      df localdf;
      if (b((localdf = (df)c.elementAt(i)).e.equals(paramString))) {
        return localdf;
      }
      i++;
      "".length();
      if ((0x20 ^ 0xF ^ 0xAC ^ 0x87) < 0) {
        return null;
      }
    }
    return null;
  }
  
  public static void a(at paramat)
  {
    int i = b[0];
    while (a(i, c.size()))
    {
      if (b(((df)c.elementAt(i)).i.f, paramat.f))
      {
        c.removeElementAt(i);
        return;
      }
      i++;
      "".length();
      if ((0x48 ^ 0x4C) <= 0) {}
    }
  }
  
  public static df a(short paramShort)
  {
    int i = b[0];
    while (a(i, c.size()))
    {
      df localdf;
      if (b((localdf = (df)c.elementAt(i)).i.f, paramShort)) {
        return localdf;
      }
      i++;
      "".length();
      if ("  ".length() != "  ".length()) {
        return null;
      }
    }
    return null;
  }
  
  private static void f()
  {
    b = new int[3];
    b[0] = ((0x7D ^ 0x25) & (0x34 ^ 0x6C ^ 0xFFFFFFFF));
    b[1] = " ".length();
    b[2] = (-" ".length());
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static void b(String paramString)
  {
    ci localci = new ci();
    int i = b[0];
    df localdf1;
    while (a(i, c.size()))
    {
      if (b((localdf1 = (df)c.elementAt(i)).d())) {
        localci.addElement(localdf1);
      }
      i++;
      "".length();
      if ("  ".length() < "  ".length()) {
        return;
      }
    }
    if (c(localci.size()))
    {
      df localdf2;
      if (b(localci.size(), b[1]))
      {
        localdf2 = (df)localci.firstElement();
        dn.d(paramString, "- Để mua hàng chat buy idvp solg hoặc mua solg idvp");
        dn.d(paramString, "     Vd mua 12 " + localdf2.i.a);
        dn.d(paramString, "     chat mua 12 " + localdf2.e + " hoặc buy " + localdf2.e + " 12");
        "".length();
        if ("  ".length() != " ".length()) {}
      }
      else
      {
        localdf2 = (df)localci.elementAt(b[0]);
        localdf1 = (df)localci.elementAt(b[1]);
        dn.d(paramString, "- Để mua hàng chat buy idvp1 solg1 idvp2 solg2.... hoặc mua solg1 idvp1 solg2 idvp2...");
        dn.d(paramString, "     Vd mua 5 " + localdf2.i.a + " 5 " + localdf1.i.a);
        dn.d(paramString, "     chat mua 5 " + localdf2.e + " 5 " + localdf1.e + " hoặc buy " + localdf2.e + " 5 " + localdf1.e + " 5");
      }
    }
    if (b(d())) {
      dn.d(paramString, "- Để bán hàng chat sell hoặc giao dịch");
    }
    dn.d(paramString, "- Để Donate chat donate. Thank");
  }
  
  public static void b()
  {
    f();
    c = new ci();
    a = b[2];
  }
  
  static
  {
    cs.a(157);
    b();
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void a(at paramat, String paramString)
  {
    if (a(paramString = df.a(paramat, paramString)))
    {
      int i = b[0];
      while (a(i, c.size()))
      {
        if (b(((df)c.elementAt(i)).i.f, paramat.f))
        {
          c.setElementAt(paramString, i);
          return;
        }
        i++;
        "".length();
        if ("  ".length() >= (0x16 ^ 0x12)) {
          return;
        }
      }
      c.addElement(paramString);
    }
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static ci c()
  {
    ci localci = new ci();
    int i = b[0];
    while (a(i, c.size()))
    {
      df localdf = (df)c.elementAt(i);
      localci.addElement(i + ". " + localdf.i.a + " id " + localdf.e);
      if (c(localdf.h)) {
        localci.addElement("Mua " + localdf.a + "k/" + localdf.h + " max " + localdf.d);
      }
      if (c(localdf.b)) {
        localci.addElement("Bán " + localdf.j + "k/" + localdf.b + " min " + localdf.g);
      }
      i++;
      "".length();
      if ("   ".length() == -" ".length()) {
        return null;
      }
    }
    return localci;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt < 0;
  }
  
  public static boolean d()
  {
    int i = b[0];
    while (a(i, c.size()))
    {
      if (b(((df)c.elementAt(i)).e())) {
        return b[1];
      }
      i++;
      "".length();
      if (-(0x53 ^ 0x57) > 0) {
        return (0xE ^ 0x29) & (0x4D ^ 0x6A ^ 0xFFFFFFFF);
      }
    }
    return b[0];
  }
  
  public static void c(String paramString)
  {
    int i = b[0];
    while (a(i, c.size()))
    {
      df localdf;
      if (a(dt.g((localdf = (df)c.elementAt(i)).i.f)))
      {
        int j = localdf.d();
        int k = localdf.e();
        if ((b(j)) && (b(k)))
        {
          dn.d(paramString, "id: " + localdf.e + " " + localdf.i.a + " bán: " + localdf.j + "k/" + localdf.b + "cái, mua: " + localdf.a + "k/" + localdf.h + " cái. Còn " + localdf.c() + " cái.");
          "".length();
          if (-" ".length() < 0) {}
        }
        else if (b(j))
        {
          dn.d(paramString, "id: " + localdf.e + " " + localdf.i.a + " bán: " + localdf.j + "k/" + localdf.b + "cái. Còn " + localdf.c() + " cái.");
          "".length();
          if (-" ".length() < 0) {}
        }
        else if (b(k))
        {
          if ((c(localdf.h)) && (a(dt.b(localdf.i.f), localdf.d)))
          {
            "".length();
            if ((0xD ^ 0x8) > 0) {
              break label427;
            }
          }
          label427:
          dn.d(new StringBuffer("id: ").append(localdf.e).append(" ").append(localdf.i.a).append(" mua: ").append(localdf.a).append("k/").append(localdf.h).append(" cái. Còn mua: "), b[0]);
        }
      }
      i++;
      "".length();
      if ("   ".length() <= " ".length()) {}
    }
  }
  
  public static void e() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\aj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */