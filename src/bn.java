import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;

public final class bn
  extends gn
  implements CommandListener
{
  private TextField a = new TextField("Ngày up", "", e[0], e[1]);
  private static bn b;
  private TextField c;
  private Command d;
  private static int[] e;
  private TextField f;
  
  public final void a()
  {
    long l = dn.s / 60000L;
    this.c.setString(String.valueOf(l % 60L));
    l /= 60L;
    this.f.setString(String.valueOf(l % 60L));
    l /= 60L;
    this.a.setString(String.valueOf(l));
    gb.a(bv.d).a(this);
  }
  
  /* Error */
  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield 35	bn:d	Ljavax/microedition/lcdui/Command;
    //   5: invokestatic 43	bn:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   8: ifeq +124 -> 132
    //   11: getstatic 36	bn:e	[I
    //   14: iconst_3
    //   15: iaload
    //   16: istore_1
    //   17: getstatic 36	bn:e	[I
    //   20: iconst_3
    //   21: iaload
    //   22: istore_2
    //   23: getstatic 36	bn:e	[I
    //   26: iconst_3
    //   27: iaload
    //   28: istore_3
    //   29: aload_0
    //   30: getfield 32	bn:a	Ljavax/microedition/lcdui/TextField;
    //   33: invokevirtual 59	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   36: invokestatic 52	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   39: istore_1
    //   40: aload_0
    //   41: getfield 37	bn:f	Ljavax/microedition/lcdui/TextField;
    //   44: invokevirtual 59	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   47: invokestatic 52	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   50: istore_2
    //   51: aload_0
    //   52: getfield 34	bn:c	Ljavax/microedition/lcdui/TextField;
    //   55: invokevirtual 59	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   58: invokestatic 52	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   61: istore_3
    //   62: ldc 1
    //   64: invokevirtual 53	java/lang/String:length	()I
    //   67: pop
    //   68: iconst_2
    //   69: bipush 85
    //   71: iadd
    //   72: bipush -7
    //   74: isub
    //   75: bipush 34
    //   77: iadd
    //   78: iconst_1
    //   79: bipush 75
    //   81: iadd
    //   82: bipush -50
    //   84: isub
    //   85: bipush 6
    //   87: iadd
    //   88: ixor
    //   89: ldc 2
    //   91: invokevirtual 53	java/lang/String:length	()I
    //   94: if_icmpne +10 -> 104
    //   97: return
    //   98: ldc 1
    //   100: invokevirtual 53	java/lang/String:length	()I
    //   103: pop2
    //   104: iload_1
    //   105: getstatic 36	bn:e	[I
    //   108: iconst_5
    //   109: iaload
    //   110: imul
    //   111: iload_2
    //   112: iadd
    //   113: i2l
    //   114: ldc2_w 26
    //   117: lmul
    //   118: iload_3
    //   119: i2l
    //   120: ladd
    //   121: ldc2_w 26
    //   124: lmul
    //   125: ldc2_w 28
    //   128: lmul
    //   129: putstatic 40	dn:s	J
    //   132: getstatic 38	bv:d	Lbv;
    //   135: invokestatic 47	gb:a	(Lgl;)Lgb;
    //   138: getstatic 39	dm:b	Ldm;
    //   141: invokevirtual 48	gb:a	(Ljavax/microedition/lcdui/Displayable;)V
    //   144: getstatic 39	dm:b	Ldm;
    //   147: getstatic 36	bn:e	[I
    //   150: bipush 6
    //   152: iaload
    //   153: invokevirtual 51	gq:setFullScreenMode	(Z)V
    //   156: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	157	0	this	bn
    //   0	157	1	paramCommand	Command
    //   0	157	2	paramDisplayable	Displayable
    //   28	91	3	i	int
    //   98	1	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   29	62	98	java/lang/Exception
  }
  
  public static void b() {}
  
  static
  {
    cs.a(81);
    b();
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  public bn()
  {
    super("Cài up time - Cài all 0 để up full time");
    "".length();
    this.f = new TextField("Giờ up", "", e[0], e[1]);
    "".length();
    this.c = new TextField("Phút up", "", e[0], e[1]);
    "".length();
    addCommand(this.d = new Command("Lưu", e[2], e[3]));
    addCommand(new Command("Thoát", e[4], e[3]));
    setCommandListener(this);
  }
  
  public static bn c()
  {
    if (a(b)) {
      b = new bn();
    }
    return b;
  }
  
  private static void e()
  {
    e = new int[7];
    e[0] = "   ".length();
    e[1] = "  ".length();
    e[2] = (0x4D ^ 0x49);
    e[3] = ((0xF7 ^ 0xB2) & (0xFD ^ 0xB8 ^ 0xFFFFFFFF));
    e[4] = (0x51 ^ 0x17 ^ 0xC8 ^ 0x89);
    e[5] = (0x42 ^ 0x5A);
    e[6] = " ".length();
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bn.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */