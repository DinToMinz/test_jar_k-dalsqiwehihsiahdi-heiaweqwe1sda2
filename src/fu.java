import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;

public final class fu
  extends gn
  implements CommandListener
{
  private final TextField a;
  private final TextField b;
  private final TextField c;
  private final TextField d = new TextField("Khu chờ PK:", String.valueOf(dn.at), e[0], e[0]);
  private static int[] e;
  private final TextField f;
  private final Command g;
  private final TextField h;
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(32);
    a();
  }
  
  private static void d()
  {
    e = new int[7];
    e[0] = "  ".length();
    e[1] = (-" ".length());
    e[2] = "   ".length();
    e[3] = (0x7D ^ 0x57 ^ 0xA2 ^ 0x81);
    e[4] = (0x82 ^ 0x86);
    e[5] = ((68 + '·' - 65 + 64 ^ 59 + 19 - -9 + 91) & (0xE4 ^ 0x9A ^ 0xB9 ^ 0x8F ^ -" ".length()));
    e[6] = (0xC0 ^ 0xC7);
  }
  
  /* Error */
  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield 59	fu:g	Ljavax/microedition/lcdui/Command;
    //   5: invokestatic 68	fu:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   8: ifeq +227 -> 235
    //   11: aload_0
    //   12: getfield 56	fu:d	Ljavax/microedition/lcdui/TextField;
    //   15: invokevirtual 89	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   18: invokestatic 75	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   21: putstatic 47	dn:at	I
    //   24: aload_0
    //   25: getfield 58	fu:f	Ljavax/microedition/lcdui/TextField;
    //   28: invokevirtual 89	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   31: invokestatic 75	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   34: putstatic 45	dn:an	I
    //   37: aload_0
    //   38: getfield 55	fu:c	Ljavax/microedition/lcdui/TextField;
    //   41: invokevirtual 89	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   44: invokestatic 75	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   47: putstatic 49	dn:v	I
    //   50: aload_0
    //   51: getfield 53	fu:a	Ljavax/microedition/lcdui/TextField;
    //   54: invokevirtual 89	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   57: invokestatic 75	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   60: putstatic 44	dn:a	I
    //   63: aload_0
    //   64: getfield 54	fu:b	Ljavax/microedition/lcdui/TextField;
    //   67: invokevirtual 89	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   70: invokestatic 75	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   73: putstatic 48	dn:u	I
    //   76: aload_0
    //   77: getfield 60	fu:h	Ljavax/microedition/lcdui/TextField;
    //   80: invokevirtual 89	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   83: invokestatic 76	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   86: putstatic 46	dn:aq	J
    //   89: ldc 22
    //   91: new 38	java/lang/StringBuffer
    //   94: dup
    //   95: invokespecial 80	java/lang/StringBuffer:<init>	()V
    //   98: getstatic 47	dn:at	I
    //   101: invokevirtual 82	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   104: ldc 9
    //   106: invokevirtual 83	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   109: getstatic 45	dn:an	I
    //   112: invokevirtual 82	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   115: ldc 9
    //   117: invokevirtual 83	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   120: getstatic 49	dn:v	I
    //   123: invokevirtual 82	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   126: ldc 9
    //   128: invokevirtual 83	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   131: getstatic 44	dn:a	I
    //   134: invokevirtual 82	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   137: ldc 9
    //   139: invokevirtual 83	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   142: getstatic 48	dn:u	I
    //   145: invokevirtual 82	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   148: ldc 9
    //   150: invokevirtual 83	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   153: getstatic 46	dn:aq	J
    //   156: l2i
    //   157: invokevirtual 82	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   160: invokevirtual 84	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   163: invokestatic 63	df:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   166: ldc 16
    //   168: invokestatic 61	aw:a	(Ljava/lang/String;)V
    //   171: ldc 1
    //   173: invokevirtual 77	java/lang/String:length	()I
    //   176: pop
    //   177: bipush 123
    //   179: bipush 22
    //   181: ixor
    //   182: sipush 196
    //   185: sipush 185
    //   188: ixor
    //   189: ixor
    //   190: sipush 147
    //   193: bipush 27
    //   195: iadd
    //   196: bipush 99
    //   198: isub
    //   199: bipush 116
    //   201: iadd
    //   202: bipush 119
    //   204: sipush 172
    //   207: iadd
    //   208: sipush 249
    //   211: isub
    //   212: sipush 133
    //   215: iadd
    //   216: ixor
    //   217: ldc 2
    //   219: invokevirtual 77	java/lang/String:length	()I
    //   222: ineg
    //   223: ixor
    //   224: iand
    //   225: ifeq +10 -> 235
    //   228: return
    //   229: ldc 1
    //   231: invokevirtual 77	java/lang/String:length	()I
    //   234: pop2
    //   235: getstatic 43	bv:d	Lbv;
    //   238: invokestatic 70	gb:a	(Lgl;)Lgb;
    //   241: invokestatic 64	dm:d	()Ldm;
    //   244: invokevirtual 71	gb:a	(Ljavax/microedition/lcdui/Displayable;)V
    //   247: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	fu
    //   0	248	1	paramCommand	Command
    //   0	248	2	paramDisplayable	Displayable
    //   229	1	3	localNumberFormatException	NumberFormatException
    // Exception table:
    //   from	to	target	type
    //   11	171	229	java/lang/NumberFormatException
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public fu()
  {
    super("Cài khu chờ pk và đánh pk");
    "".length();
    this.f = new TextField("Khu đánh PK:", String.valueOf(dn.an), e[0], e[0]);
    "".length();
    TextField tmp91_88 = new javax/microedition/lcdui/TextField;
    if (a(dn.v, e[1]))
    {
      "".length();
      if (null == null) {
        break label149;
      }
      throw null;
    }
    label149:
    ("ID map PK - (map hiện tại: " + et.o + ")").<init>(String.valueOf(dn.v), "70", e[2], e[0]);
    tmp91_88.c = tmp91_88;
    "".length();
    TextField tmp180_177 = new javax/microedition/lcdui/TextField;
    if (a(dn.a, e[1]))
    {
      "".length();
      if (((0x7B ^ 0x5F) & (0x95 ^ 0xB1 ^ 0xFFFFFFFF)) < "  ".length()) {
        break label260;
      }
      throw null;
    }
    label260:
    ("Vị trí X - (vt hiện tại: " + dt.g().eg + ")").<init>(String.valueOf(dn.a), "1500", e[3], e[0]);
    tmp180_177.a = tmp180_177;
    "".length();
    TextField tmp291_288 = new javax/microedition/lcdui/TextField;
    if (a(dn.u, e[1]))
    {
      "".length();
      if (null == null) {
        break label352;
      }
      throw null;
    }
    label352:
    ("Vị trí Y - (vt hiện tại: " + dt.g().ey + ")").<init>(String.valueOf(dn.u), "528", e[3], e[0]);
    tmp291_288.b = tmp291_288;
    "".length();
    "".length();
    this.h = new TextField("Bao nhiêu % thì auto UpPK:", String.valueOf(dn.aq), e[0], e[0]);
    "".length();
    "".length();
    addCommand(this.g = new Command("Save", e[4], e[5]));
    addCommand(new Command("Cancel", e[6], e[5]));
    setCommandListener(this);
  }
  
  public final void b()
  {
    gb.a(bv.d).a(this);
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */