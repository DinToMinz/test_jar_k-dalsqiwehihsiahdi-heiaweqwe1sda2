import java.util.Vector;

public final class bk
{
  public String a;
  public short b;
  public int c;
  public int d;
  public boolean e;
  public dt f;
  private static int[] h;
  public int g;
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void a()
  {
    int i = h[7];
    while (a(i, fn.ax.size()))
    {
      bk localbk;
      if (c((localbk = (bk)fn.ax.elementAt(i)).g, dt.g().fy)) {
        localbk.f = fn.d(localbk.g);
      }
      i++;
      "".length();
      if (null != null) {}
    }
  }
  
  public static void a(int paramInt)
  {
    int i = h[7];
    while (a(i, fn.ax.size()))
    {
      bk localbk;
      if (b((localbk = (bk)fn.ax.elementAt(i)).g, paramInt))
      {
        localbk.f = null;
        return;
      }
      i++;
      "".length();
      if ("   ".length() != "   ".length()) {}
    }
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static void d()
  {
    h = new int[8];
    h[0] = (0xE7A7 & 0x1ADF);
    h[1] = (0xDEBF & 0x25DE);
    h[2] = (-(0xE9EF & 0x7773) & 0xE7FF & 0x7DFF);
    h[3] = (0xAEB3 & 0x53CF);
    h[4] = (-(0xFEBB & 0x7155) & 0xFE9F & 0x73F5);
    h[5] = (-(0xF871 & 0x5F8F) & 0xFFFFFFAF & 0x5AF4);
    h[6] = (-(0xF9B3 & 0x1FED) & 0xFFFFFFFF & 0x1DFF);
    h[7] = ((0x2C ^ 0x77) & (0x33 ^ 0x68 ^ 0xFFFFFFFF));
  }
  
  public bk(byte paramByte, int paramInt1, String paramString, int paramInt2)
  {
    switch (paramByte)
    {
    case 0: 
      this.b = h[0];
      "".length();
      if (-" ".length() > "  ".length()) {
        throw null;
      }
      break;
    case 1: 
      this.b = h[1];
      "".length();
      if ("   ".length() <= 0) {
        throw null;
      }
      break;
    case 2: 
      this.b = h[2];
      "".length();
      if (-" ".length() == "   ".length()) {
        throw null;
      }
      break;
    case 3: 
      this.b = h[3];
      "".length();
      if (null != null) {
        throw null;
      }
      break;
    case 4: 
      this.b = h[4];
      "".length();
      if (-"  ".length() > 0) {
        throw null;
      }
      break;
    case 5: 
      this.b = h[5];
      "".length();
      if ((0x5C ^ 0x58) <= " ".length()) {
        throw null;
      }
      break;
    case 6: 
      this.b = h[6];
    }
    this.a = paramString;
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public static void b() {}
  
  static
  {
    cs.a(133);
    b();
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public bk(int paramInt, byte paramByte, String paramString, boolean paramBoolean)
  {
    this.g = paramInt;
    this.e = paramBoolean;
    switch (paramByte)
    {
    case 0: 
      this.b = h[0];
      "".length();
      if (" ".length() == "   ".length()) {
        throw null;
      }
      break;
    case 1: 
      this.b = h[1];
      "".length();
      if (-" ".length() > "  ".length()) {
        throw null;
      }
      break;
    case 2: 
      this.b = h[2];
      "".length();
      if (null != null) {
        throw null;
      }
      break;
    case 3: 
      this.b = h[3];
      "".length();
      if (-" ".length() >= 0) {
        throw null;
      }
      break;
    case 4: 
      this.b = h[4];
      "".length();
      if ("  ".length() < 0) {
        throw null;
      }
      break;
    case 5: 
      this.b = h[5];
      "".length();
      if (-(0x43 ^ 0x47) > 0) {
        throw null;
      }
      break;
    case 6: 
      this.b = h[6];
    }
    this.a = paramString;
    if (b(paramInt, dt.g().fy))
    {
      this.f = dt.g();
      return;
    }
    this.f = fn.d(paramInt);
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */