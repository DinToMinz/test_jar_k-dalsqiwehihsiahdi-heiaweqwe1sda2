public class gc
{
  public static Class a(String paramString)
  {
    return a("a.", paramString);
  }
  
  public static Class b(String paramString)
  {
    return a("b.", paramString);
  }
  
  public static Class c(String paramString)
  {
    return a("c.", paramString);
  }
  
  public static Class d(String paramString)
  {
    return a("d.", paramString);
  }
  
  public static Class e(String paramString)
  {
    return a("e.", paramString);
  }
  
  public static Class f(String paramString)
  {
    return a("f.", paramString);
  }
  
  public static Class g(String paramString)
  {
    return a("g.", paramString);
  }
  
  public static Class h(String paramString)
  {
    return a("h.", paramString);
  }
  
  public static Class i(String paramString)
  {
    return a("i.", paramString);
  }
  
  public static Class j(String paramString)
  {
    return a("j.", paramString);
  }
  
  public static Class k(String paramString)
  {
    return a("k.", paramString);
  }
  
  public static Class l(String paramString)
  {
    return a("l.", paramString);
  }
  
  public static Class m(String paramString)
  {
    return a("m.", paramString);
  }
  
  public static Class n(String paramString)
  {
    return a("n.", paramString);
  }
  
  public static Class o(String paramString)
  {
    return a("o.", paramString);
  }
  
  public static Class p(String paramString)
  {
    return a("p.", paramString);
  }
  
  public static Class q(String paramString)
  {
    return a("q.", paramString);
  }
  
  public static Class r(String paramString)
  {
    return a("r.", paramString);
  }
  
  public static Class s(String paramString)
  {
    return a("s.", paramString);
  }
  
  public static Class t(String paramString)
  {
    return a("t.", paramString);
  }
  
  public static Class u(String paramString)
  {
    return a("u.", paramString);
  }
  
  public static Class v(String paramString)
  {
    return a("v.", paramString);
  }
  
  public static Class w(String paramString)
  {
    return a("w.", paramString);
  }
  
  public static Class x(String paramString)
  {
    return a("x.", paramString);
  }
  
  public static Class y(String paramString)
  {
    return a("y.", paramString);
  }
  
  public static Class z(String paramString)
  {
    return a("z.", paramString);
  }
  
  public static Class a(String paramString1, String paramString2)
  {
    try
    {
      return Class.forName(paramString1 + paramString2);
    }
    catch (ClassNotFoundException localClassNotFoundException1)
    {
      try
      {
        return Class.forName(paramString2);
      }
      catch (ClassNotFoundException localClassNotFoundException2) {}
    }
    return null;
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gc.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */