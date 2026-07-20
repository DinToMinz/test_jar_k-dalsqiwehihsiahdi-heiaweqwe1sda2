import java.util.Hashtable;

public final class ex
  extends Hashtable
{
  public final synchronized void clear()
  {
    super.clear();
  }
  
  public final synchronized Object remove(Object paramObject)
  {
    return super.remove(paramObject);
  }
  
  public final synchronized Object put(Object paramObject1, Object paramObject2)
  {
    return super.put(paramObject1, paramObject2);
  }
  
  public final synchronized Object get(Object paramObject)
  {
    return super.get(paramObject);
  }
  
  public static void a() {}
  
  static
  {
    cs.a(130);
    a();
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ex.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */