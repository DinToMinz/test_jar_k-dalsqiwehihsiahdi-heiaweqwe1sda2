import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Image;

public class gd
  extends Alert
{
  private ge a;
  
  public gd(String paramString)
  {
    super(paramString);
  }
  
  public gd(String paramString1, String paramString2, Image paramImage, ge paramge)
  {
    super(paramString1, paramString2, paramImage, paramge.a);
  }
  
  public void a(ge paramge)
  {
    super.setType((this.a = paramge).a);
  }
  
  public ge a()
  {
    return this.a;
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gd.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */