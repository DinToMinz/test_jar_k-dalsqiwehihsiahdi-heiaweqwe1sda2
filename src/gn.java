import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;

public class gn
  extends Form
{
  private gj a;
  
  public void setCommandListener(CommandListener paramCommandListener)
  {
    this.a.a(paramCommandListener);
  }
  
  private void a()
  {
    addCommand(gj.a);
    super.setCommandListener(this.a = new gj());
  }
  
  public gn(String paramString)
  {
    super(paramString);
    a();
  }
  
  public gn(String paramString, Item[] paramArrayOfItem)
  {
    super(paramString, paramArrayOfItem);
    a();
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gn.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */