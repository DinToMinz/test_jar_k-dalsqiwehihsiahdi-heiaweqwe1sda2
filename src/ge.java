import javax.microedition.lcdui.AlertType;

public class ge
{
  AlertType a;
  public static final ge b = new ge(AlertType.WARNING);
  public static final ge c = new ge(AlertType.ERROR);
  public static final ge d = new ge(AlertType.ALARM);
  public static final ge e = new ge(AlertType.CONFIRMATION);
  public static final ge f = new ge(AlertType.INFO);
  
  protected ge() {}
  
  private ge(AlertType paramAlertType)
  {
    this.a = paramAlertType;
  }
  
  public boolean a(gb paramgb)
  {
    return this.a.playSound(gb.a);
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ge.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */