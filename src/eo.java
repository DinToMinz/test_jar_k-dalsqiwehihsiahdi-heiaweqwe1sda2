import java.util.Vector;

public final class eo
  extends r
{
  private static int[] v;
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(10);
    c();
  }
  
  public eo()
  {
    super.a();
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public final void b()
  {
    dt localdt;
    if (d((localdt = dt.g()).ef))
    {
      r.a(v[0]);
      return;
    }
    if ((c(localdt.cj, v[1])) && (f(localdt.fj.e, localdt.fj.a.length - v[0])))
    {
      if (d(et.o, v[2]))
      {
        a(v[2], v[3], v[4], v[4]);
        return;
      }
      b(v[5], v[4]);
      c(v[6]);
      if (f(dt.g().y, dt.g().en / v[7])) {
        "".length();
      }
      if (f(dt.g().ef, dt.g().cw * v[9] / v[10]))
      {
        int i = (int)(System.currentTimeMillis() / 1000L);
        int j = v[11];
        while (f(j, dt.g().be.size()))
        {
          bt localbt;
          if ((c((localbt = (bt)dt.g().be.elementAt(j)).a.b, v[12])) && (e(localbt.b - (i - localbt.d), v[7]))) {
            return;
          }
          j++;
          "".length();
          if (((0x38 ^ 0x25) & (0x73 ^ 0x6E ^ 0xFFFFFFFF)) >= "   ".length()) {
            return;
          }
        }
        "".length();
      }
    }
    else
    {
      dn.r();
    }
  }
  
  public final String toString()
  {
    return "Đánh Heo";
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static void p()
  {
    v = new int[14];
    v[0] = " ".length();
    v[1] = (0x76 ^ 0x62);
    v[2] = (0x7B ^ 0x31);
    v[3] = (-"  ".length());
    v[4] = (-" ".length());
    v[5] = (0xBB ^ 0x9D ^ 0xA7 ^ 0xC4);
    v[6] = ('' + 'Ä' - 143 + 21);
    v[7] = "  ".length();
    v[8] = (0x51 ^ 0x40);
    v[9] = "   ".length();
    v[10] = (0x22 ^ 0x60 ^ 0x5C ^ 0x1A);
    v[11] = ((0x82 ^ 0xA2 ^ 0x7A ^ 0xD) & (55 + '¸' - 79 + 42 ^ 103 + 66 - 166 + 154 ^ -" ".length()));
    v[12] = (0x8 ^ 0x1D);
    v[13] = (0xD ^ 0x76 ^ 0xF4 ^ 0x9F);
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\eo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */