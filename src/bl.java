import java.util.Vector;

public final class bl
{
  public ci a = new ci();
  private static bl h;
  public static boolean b;
  public static boolean c;
  public ci d = new ci();
  public int e = i[1];
  public static boolean f;
  public static boolean g;
  private static int[] i;
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static void a()
  {
    h = null;
  }
  
  private static void i()
  {
    i = new int[5];
    i[0] = " ".length();
    i[1] = ((0xA7 ^ 0xA3) & (0x73 ^ 0x77 ^ 0xFFFFFFFF));
    i[2] = "   ".length();
    i[3] = (0xBA ^ 0xBE);
    i[4] = "  ".length();
  }
  
  public final void a(String paramString)
  {
    int j = i[1];
    while (b(j, this.a.size()))
    {
      if (b(((String)this.a.elementAt(j)).equals(paramString))) {
        return;
      }
      j++;
      "".length();
      if (null != null) {
        return;
      }
    }
    this.a.addElement(paramString);
  }
  
  public final el b(String paramString)
  {
    paramString = new el(paramString, i[4]);
    if (d(aw.s)) {
      paramString.a("c2" + an.op);
    }
    this.d.addElement(paramString);
    return paramString;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  public final el c(String paramString)
  {
    int j = i[1];
    while (b(j, this.d.size()))
    {
      el localel;
      if (b((localel = (el)this.d.elementAt(j)).c.equals(paramString))) {
        return localel;
      }
      j++;
      "".length();
      if ("  ".length() <= " ".length()) {
        return null;
      }
    }
    return null;
  }
  
  public static void b() {}
  
  static
  {
    cs.a(123);
    b();
  }
  
  public static bl c()
  {
    if (a(h)) {
      return h = new bl();
    }
    return h;
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt < 0;
  }
  
  public bl()
  {
    this.d.addElement(new el(an.ov[i[1]], i[1]));
    this.d.addElement(new el(an.fp[i[1]], i[0]));
    this.d.addElement(new el(an.cj[i[1]], i[2]));
    this.d.addElement(new el(an.en[i[1]], i[3]));
    el localel;
    (localel = c(an.cj[i[1]])).a("c8" + an.cj[i[0]]);
    localel.a("c8" + an.cj[i[4]]);
    localel.a("c8" + an.cj[i[2]]);
    c(an.fp[i[1]]).a("c8" + an.fp[i[0]]);
    c(an.en[i[1]]).a("c8" + an.en[i[0]]);
    c(an.ov[i[1]]).a("c8" + an.ov[i[0]]);
  }
  
  public final boolean d(String paramString)
  {
    int j = i[1];
    while (b(j, this.a.size()))
    {
      if (b(((String)this.a.elementAt(j)).equals(paramString))) {
        return i[0];
      }
      j++;
      "".length();
      if (-(0x9E ^ 0x9A) >= 0) {
        return (0xCA ^ 0x82) & (0xE ^ 0x46 ^ 0xFFFFFFFF);
      }
    }
    return i[1];
  }
  
  public final void a(String paramString1, String paramString2, String paramString3)
  {
    el localel;
    if (a(localel = c(paramString1))) {
      localel = b(paramString1);
    }
    localel.a(paramString2, paramString3);
  }
  
  public final void d()
  {
    this.e = (this.d.size() - i[0]);
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final void a(el paramel)
  {
    this.e = this.d.indexOf(paramel);
  }
  
  public final void e()
  {
    this.e -= i[0];
    if (c(this.e)) {
      this.e = (this.d.size() - i[0]);
    }
  }
  
  public final el f()
  {
    return (el)this.d.elementAt(this.e);
  }
  
  public final void e(String paramString)
  {
    int j = i[1];
    while (b(j, this.a.size()))
    {
      if (b(((String)this.a.elementAt(j)).equals(paramString)))
      {
        this.a.removeElementAt(j);
        return;
      }
      j++;
      "".length();
      if (null != null) {}
    }
  }
  
  public final void g()
  {
    this.e += i[0];
    if (a(this.e, this.d.size() - i[0])) {
      this.e = i[1];
    }
  }
  
  public final void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void h() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */