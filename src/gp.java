import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public class gp
  extends List
{
  private gj a;
  
  public void setCommandListener(CommandListener paramCommandListener)
  {
    this.a.a(paramCommandListener);
  }
  
  public gp(String paramString, int paramInt)
  {
    super(paramString, paramInt);
    a();
  }
  
  private void a()
  {
    addCommand(gj.a);
    super.setCommandListener(this.a = new gj());
  }
  
  public gp(String paramString, int paramInt, String[] paramArrayOfString, Image[] paramArrayOfImage)
  {
    super(paramString, paramInt, paramArrayOfString, paramArrayOfImage);
    a();
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gp.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */