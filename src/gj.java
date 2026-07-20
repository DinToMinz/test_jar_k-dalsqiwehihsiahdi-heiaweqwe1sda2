import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;

public class gj
  implements CommandListener
{
  public static final Command a = new Command("Menu MrQuyet", 7, 8);
  private CommandListener b;
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    if (paramCommand == a)
    {
      gb.c.a();
      return;
    }
    if (this.b != null) {
      try
      {
        this.b.commandAction(paramCommand, paramDisplayable);
        return;
      }
      catch (Throwable paramCommand)
      {
        gb.c.a(paramCommand, this.b);
      }
    }
  }
  
  public void a(CommandListener paramCommandListener)
  {
    this.b = paramCommandListener;
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gj.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */