import java.util.Vector;

public abstract class go
{
  private final Vector a;
  
  protected go(Vector paramVector)
  {
    this.a = paramVector;
  }
  
  public void a()
  {
    synchronized (this.a)
    {
      int i = this.a.size();
      for (int j = 0; j < i; j++) {
        try
        {
          c(((Integer)this.a.elementAt(j)).intValue());
          System.gc();
        }
        catch (Throwable localThrowable) {}
      }
      return;
    }
  }
  
  public void b()
  {
    synchronized (this.a)
    {
      int i = this.a.size();
      for (int j = 0; j < i; j++) {
        try
        {
          b(((Integer)this.a.elementAt(j)).intValue());
        }
        catch (Throwable localThrowable) {}
      }
      return;
    }
  }
  
  protected abstract void b(int paramInt);
  
  protected abstract void c(int paramInt);
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\go.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */