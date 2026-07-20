import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;

public final class fi
  implements CommandListener
{
  private ek a;
  private static int[] b;
  private final gm c;
  
  private static void c()
  {
    b = new int[1];
    b[0] = " ".length();
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(96);
    a();
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    if (a(paramCommand.getLabel().equals(an.nd))) {
      this.a.a(this.c.getString());
    }
    gb.a(bv.d).a(dm.b);
    dm.b.setFullScreenMode(b[0]);
    this.a.b = b[0];
  }
  
  public fi(ek paramek, gm paramgm)
  {
    this.a = paramek;
    this.c = paramgm;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */