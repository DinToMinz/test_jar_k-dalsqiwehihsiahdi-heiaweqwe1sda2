import javax.microedition.rms.RecordStore;

public class gk
{
  private static void a(char paramChar, String paramString)
  {
    RecordStore.deleteRecordStore(paramChar + paramString);
  }
  
  private static RecordStore a(char paramChar, String paramString, boolean paramBoolean)
  {
    return RecordStore.openRecordStore(paramChar + paramString, paramBoolean);
  }
  
  private static RecordStore a(char paramChar, String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return RecordStore.openRecordStore(paramChar + paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  private static String[] a(char paramChar)
  {
    Object localObject = RecordStore.listRecordStores();
    String[] arrayOfString = new String[localObject.length];
    int i = 0;
    for (int j = localObject.length - 1; j >= 0; j--) {
      if (localObject[j].charAt(0) == paramChar) {
        arrayOfString[(i++)] = localObject[j].substring(1);
      }
    }
    if (i == 0) {
      return null;
    }
    if (i == arrayOfString.length)
    {
      localObject = arrayOfString;
    }
    else
    {
      localObject = new String[i];
      System.arraycopy(arrayOfString, 0, localObject, 0, i);
    }
    return (String[])localObject;
  }
  
  public static void a(String paramString)
  {
    a('a', paramString);
  }
  
  public static void b(String paramString)
  {
    a('b', paramString);
  }
  
  public static void c(String paramString)
  {
    a('c', paramString);
  }
  
  public static void d(String paramString)
  {
    a('d', paramString);
  }
  
  public static void e(String paramString)
  {
    a('e', paramString);
  }
  
  public static void f(String paramString)
  {
    a('f', paramString);
  }
  
  public static void g(String paramString)
  {
    a('g', paramString);
  }
  
  public static void h(String paramString)
  {
    a('h', paramString);
  }
  
  public static void i(String paramString)
  {
    a('i', paramString);
  }
  
  public static void j(String paramString)
  {
    a('j', paramString);
  }
  
  public static void k(String paramString)
  {
    a('k', paramString);
  }
  
  public static void l(String paramString)
  {
    a('l', paramString);
  }
  
  public static void m(String paramString)
  {
    a('m', paramString);
  }
  
  public static void n(String paramString)
  {
    a('n', paramString);
  }
  
  public static void o(String paramString)
  {
    a('o', paramString);
  }
  
  public static void p(String paramString)
  {
    a('p', paramString);
  }
  
  public static void q(String paramString)
  {
    a('q', paramString);
  }
  
  public static void r(String paramString)
  {
    a('r', paramString);
  }
  
  public static void s(String paramString)
  {
    a('s', paramString);
  }
  
  public static void t(String paramString)
  {
    a('t', paramString);
  }
  
  public static void u(String paramString)
  {
    a('u', paramString);
  }
  
  public static void v(String paramString)
  {
    a('v', paramString);
  }
  
  public static void w(String paramString)
  {
    a('w', paramString);
  }
  
  public static void x(String paramString)
  {
    a('x', paramString);
  }
  
  public static void y(String paramString)
  {
    a('y', paramString);
  }
  
  public static void z(String paramString)
  {
    a('z', paramString);
  }
  
  public static RecordStore a(String paramString, boolean paramBoolean)
  {
    return a('a', paramString, paramBoolean);
  }
  
  public static RecordStore b(String paramString, boolean paramBoolean)
  {
    return a('b', paramString, paramBoolean);
  }
  
  public static RecordStore c(String paramString, boolean paramBoolean)
  {
    return a('c', paramString, paramBoolean);
  }
  
  public static RecordStore d(String paramString, boolean paramBoolean)
  {
    return a('d', paramString, paramBoolean);
  }
  
  public static RecordStore e(String paramString, boolean paramBoolean)
  {
    return a('e', paramString, paramBoolean);
  }
  
  public static RecordStore f(String paramString, boolean paramBoolean)
  {
    return a('f', paramString, paramBoolean);
  }
  
  public static RecordStore g(String paramString, boolean paramBoolean)
  {
    return a('g', paramString, paramBoolean);
  }
  
  public static RecordStore h(String paramString, boolean paramBoolean)
  {
    return a('h', paramString, paramBoolean);
  }
  
  public static RecordStore i(String paramString, boolean paramBoolean)
  {
    return a('i', paramString, paramBoolean);
  }
  
  public static RecordStore j(String paramString, boolean paramBoolean)
  {
    return a('j', paramString, paramBoolean);
  }
  
  public static RecordStore k(String paramString, boolean paramBoolean)
  {
    return a('k', paramString, paramBoolean);
  }
  
  public static RecordStore l(String paramString, boolean paramBoolean)
  {
    return a('l', paramString, paramBoolean);
  }
  
  public static RecordStore m(String paramString, boolean paramBoolean)
  {
    return a('m', paramString, paramBoolean);
  }
  
  public static RecordStore n(String paramString, boolean paramBoolean)
  {
    return a('n', paramString, paramBoolean);
  }
  
  public static RecordStore o(String paramString, boolean paramBoolean)
  {
    return a('o', paramString, paramBoolean);
  }
  
  public static RecordStore p(String paramString, boolean paramBoolean)
  {
    return a('p', paramString, paramBoolean);
  }
  
  public static RecordStore q(String paramString, boolean paramBoolean)
  {
    return a('q', paramString, paramBoolean);
  }
  
  public static RecordStore r(String paramString, boolean paramBoolean)
  {
    return a('r', paramString, paramBoolean);
  }
  
  public static RecordStore s(String paramString, boolean paramBoolean)
  {
    return a('s', paramString, paramBoolean);
  }
  
  public static RecordStore t(String paramString, boolean paramBoolean)
  {
    return a('t', paramString, paramBoolean);
  }
  
  public static RecordStore u(String paramString, boolean paramBoolean)
  {
    return a('u', paramString, paramBoolean);
  }
  
  public static RecordStore v(String paramString, boolean paramBoolean)
  {
    return a('v', paramString, paramBoolean);
  }
  
  public static RecordStore w(String paramString, boolean paramBoolean)
  {
    return a('w', paramString, paramBoolean);
  }
  
  public static RecordStore x(String paramString, boolean paramBoolean)
  {
    return a('x', paramString, paramBoolean);
  }
  
  public static RecordStore y(String paramString, boolean paramBoolean)
  {
    return a('y', paramString, paramBoolean);
  }
  
  public static RecordStore z(String paramString, boolean paramBoolean)
  {
    return a('z', paramString, paramBoolean);
  }
  
  public static RecordStore a(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('a', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore b(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('b', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore c(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('c', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore d(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('d', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore e(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('e', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore f(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('f', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore g(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('g', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore h(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('h', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore i(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('i', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore j(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('j', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore k(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('k', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore l(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('l', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore m(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('m', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore n(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('n', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore o(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('o', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore p(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('p', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore q(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('q', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore r(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('r', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore s(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('s', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore t(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('t', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore u(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('u', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore v(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('v', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore w(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('w', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore x(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('x', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore y(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('y', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static RecordStore z(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    return a('z', paramString, paramBoolean1, paramInt, paramBoolean2);
  }
  
  public static String[] a()
  {
    return a('a');
  }
  
  public static String[] b()
  {
    return a('b');
  }
  
  public static String[] c()
  {
    return a('c');
  }
  
  public static String[] d()
  {
    return a('d');
  }
  
  public static String[] e()
  {
    return a('e');
  }
  
  public static String[] f()
  {
    return a('f');
  }
  
  public static String[] g()
  {
    return a('g');
  }
  
  public static String[] h()
  {
    return a('h');
  }
  
  public static String[] i()
  {
    return a('i');
  }
  
  public static String[] j()
  {
    return a('j');
  }
  
  public static String[] k()
  {
    return a('k');
  }
  
  public static String[] l()
  {
    return a('l');
  }
  
  public static String[] m()
  {
    return a('m');
  }
  
  public static String[] n()
  {
    return a('n');
  }
  
  public static String[] o()
  {
    return a('o');
  }
  
  public static String[] p()
  {
    return a('p');
  }
  
  public static String[] q()
  {
    return a('q');
  }
  
  public static String[] r()
  {
    return a('r');
  }
  
  public static String[] s()
  {
    return a('s');
  }
  
  public static String[] t()
  {
    return a('t');
  }
  
  public static String[] u()
  {
    return a('u');
  }
  
  public static String[] v()
  {
    return a('v');
  }
  
  public static String[] w()
  {
    return a('w');
  }
  
  public static String[] x()
  {
    return a('x');
  }
  
  public static String[] y()
  {
    return a('y');
  }
  
  public static String[] z()
  {
    return a('z');
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gk.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */