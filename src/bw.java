import java.util.Enumeration;
import java.util.Hashtable;

public final class bw
{
  private static int[] b;
  public static ex a;
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public static at a(short paramShort)
  {
    return (at)a.get(new Short(paramShort));
  }
  
  private static void c()
  {
    b = new int[1];
    b[0] = "  ".length();
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static at a(String paramString, byte paramByte)
  {
    Enumeration localEnumeration = a.elements();
    at localat;
    do
    {
      if (a(localEnumeration.hasMoreElements())) {
        return null;
      }
    } while ((!b((localat = (at)localEnumeration.nextElement()).a.equals(paramString))) || ((a(localat.h, b[0])) && (!b(localat.h, paramByte))));
    return localat;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public static void a()
  {
    c();
    a = new ex();
  }
  
  static
  {
    cs.a(149);
    a();
  }
  
  public static void a(at paramat)
  {
    new Short(paramat.f);
    "".length();
  }
  
  public static short b(short paramShort)
  {
    return a(paramShort).g;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */