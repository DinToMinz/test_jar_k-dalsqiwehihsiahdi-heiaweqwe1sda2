import java.util.Vector;

public final class ci
  extends Vector
{
  public final synchronized void removeAllElements()
  {
    super.removeAllElements();
  }
  
  public final synchronized void addElement(Object paramObject)
  {
    super.addElement(paramObject);
  }
  
  public final synchronized void insertElementAt(Object paramObject, int paramInt)
  {
    super.insertElementAt(paramObject, paramInt);
  }
  
  public final synchronized void removeElementAt(int paramInt)
  {
    super.removeElementAt(paramInt);
  }
  
  public static void a() {}
  
  static
  {
    cs.a(31);
    a();
  }
  
  public final synchronized boolean removeElement(Object paramObject)
  {
    return super.removeElement(paramObject);
  }
  
  public final synchronized Object elementAt(int paramInt)
  {
    return super.elementAt(paramInt);
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ci.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */