final class gg
  extends Thread
{
  private final int a;
  private final gq b;
  
  gg(gq paramgq, int paramInt)
  {
    this.b = paramgq;
    this.a = paramInt;
  }
  
  public final void run()
  {
    try
    {
      Thread.sleep(gq.d);
      gb.c.a();
    }
    catch (Exception localException)
    {
      try
      {
        this.b.b(this.a);
        this.b.a(this.a);
      }
      catch (Throwable localThrowable)
      {
        gb.c.a(localThrowable, this);
      }
    }
    gq.a(this.b, null);
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gg.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */