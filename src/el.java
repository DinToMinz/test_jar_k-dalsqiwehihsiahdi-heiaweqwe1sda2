import java.util.Vector;

public final class el
{
  public long a = 0L;
  public int b;
  public String c;
  public ci d = new ci();
  private static int[] e;
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static void c()
  {
    e = new int[4];
    e[0] = ((0xD9 ^ 0x8B ^ 0x73 ^ 0x35) & (0x37 ^ 0x46 ^ 0x10 ^ 0x75 ^ -" ".length()));
    e[1] = " ".length();
    e[2] = ((0x44 ^ 0x69) + (0x5C ^ 0x1C) - -(0x2D ^ 0x8) + (0x3 ^ 0xD));
    e[3] = (0xF2 ^ 0xC0);
  }
  
  private void d()
  {
    while (c(this.d.size(), e[3]))
    {
      this.d.removeElementAt(e[1]);
      "".length();
      if (((0x2 ^ 0x20) & (0x39 ^ 0x1B ^ 0xFFFFFFFF)) > "   ".length()) {}
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public el(String paramString, int paramInt)
  {
    this.c = paramString;
    this.b = paramInt;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    int i = e[0];
    if ((a(fn.ab)) && (a(bl.c().f(), this)) && (a(fn.by, this.d.size() - e[1]))) {
      i = e[1];
    }
    this.d.addElement("c3@".concat(String.valueOf(paramString1)));
    paramString1 = ax.t.a(paramString2, e[2]);
    paramString2 = e[0];
    while (b(paramString2, paramString1.size()))
    {
      this.d.addElement("c0" + paramString1.elementAt(paramString2));
      paramString2++;
      "".length();
      if ("   ".length() < 0) {
        return;
      }
    }
    if (a(i)) {
      fn.j().aa();
    }
    d();
  }
  
  public static void a() {}
  
  static
  {
    cs.a(47);
    a();
  }
  
  public final void a(String paramString)
  {
    int i = e[0];
    if ((a(fn.ab)) && (a(bl.c().f(), this)) && (a(fn.by, this.d.size() - e[1]))) {
      i = e[1];
    }
    paramString = ax.t.a(paramString, e[2]);
    int j = e[0];
    while (b(j, paramString.size()))
    {
      this.d.addElement(paramString.elementAt(j));
      j++;
      "".length();
      if (" ".length() != " ".length()) {
        return;
      }
    }
    if (a(i)) {
      fn.j().aa();
    }
    d();
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\el.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */