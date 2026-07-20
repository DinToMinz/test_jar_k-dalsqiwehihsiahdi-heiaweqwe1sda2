import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.TextBox;

public class gm
  extends TextBox
{
  private gj a;
  
  public void setCommandListener(CommandListener paramCommandListener)
  {
    this.a.a(paramCommandListener);
  }
  
  public gm(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    super(paramString1, paramString2, paramInt1, paramInt2);
    addCommand(gj.a);
    super.setCommandListener(this.a = new gj());
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gm.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */