import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;

public final class cw
  implements CommandListener
{
  private TextField c;
  private TextField d;
  private final gn e = new gn("Setting Gom Đồ!");
  private TextField f;
  public static String a;
  public static String b;
  private TextField g;
  private TextField h;
  private static int[] i;
  private Command j;
  private TextField k;
  private TextField l;
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private static void a(Displayable paramDisplayable)
  {
    gb.a(bv.d).a(paramDisplayable);
  }
  
  public static void a()
  {
    d();
    a = "";
    b = "454,455,456,457";
  }
  
  static
  {
    cs.a(172);
    a();
  }
  
  /* Error */
  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield 48	cw:j	Ljavax/microedition/lcdui/Command;
    //   5: invokestatic 61	cw:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   8: ifeq +114 -> 122
    //   11: aload_0
    //   12: getfield 49	cw:k	Ljavax/microedition/lcdui/TextField;
    //   15: invokevirtual 79	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   18: putstatic 54	ey:y	Ljava/lang/String;
    //   21: aload_0
    //   22: getfield 41	cw:c	Ljavax/microedition/lcdui/TextField;
    //   25: invokevirtual 79	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   28: putstatic 39	cw:a	Ljava/lang/String;
    //   31: aload_0
    //   32: getfield 42	cw:d	Ljavax/microedition/lcdui/TextField;
    //   35: invokevirtual 79	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   38: putstatic 40	cw:b	Ljava/lang/String;
    //   41: aload_0
    //   42: getfield 46	cw:h	Ljavax/microedition/lcdui/TextField;
    //   45: invokevirtual 79	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   48: invokestatic 70	java/lang/Byte:parseByte	(Ljava/lang/String;)B
    //   51: putstatic 52	ey:w	B
    //   54: aload_0
    //   55: getfield 50	cw:l	Ljavax/microedition/lcdui/TextField;
    //   58: invokevirtual 79	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   61: invokestatic 70	java/lang/Byte:parseByte	(Ljava/lang/String;)B
    //   64: putstatic 53	ey:x	B
    //   67: aload_0
    //   68: getfield 45	cw:g	Ljavax/microedition/lcdui/TextField;
    //   71: invokevirtual 79	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   74: invokestatic 71	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   77: putstatic 55	ey:z	I
    //   80: aload_0
    //   81: getfield 44	cw:f	Ljavax/microedition/lcdui/TextField;
    //   84: invokevirtual 79	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   87: invokestatic 70	java/lang/Byte:parseByte	(Ljava/lang/String;)B
    //   90: putstatic 51	ey:v	B
    //   93: ldc 1
    //   95: invokevirtual 73	java/lang/String:length	()I
    //   98: pop
    //   99: ldc 4
    //   101: invokevirtual 73	java/lang/String:length	()I
    //   104: ifgt +10 -> 114
    //   107: return
    //   108: ldc 1
    //   110: invokevirtual 73	java/lang/String:length	()I
    //   113: pop2
    //   114: ldc 14
    //   116: invokestatic 56	aw:a	(Ljava/lang/String;)V
    //   119: invokestatic 65	ey:c	()V
    //   122: invokestatic 64	dm:d	()Ldm;
    //   125: invokestatic 62	cw:a	(Ljavax/microedition/lcdui/Displayable;)V
    //   128: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	this	cw
    //   0	129	1	paramCommand	Command
    //   0	129	2	paramDisplayable	Displayable
    //   108	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   41	93	108	java/lang/Exception
  }
  
  public cw()
  {
    if (a(ey.y))
    {
      "".length();
      if (null == null) {
        break label48;
      }
      throw null;
    }
    label48:
    int m = i[1];
    TextField tmp53_50 = new javax/microedition/lcdui/TextField;
    if (a(m))
    {
      "".length();
      if (-" ".length() < (0x34 ^ 0x68 ^ 0xD1 ^ 0x89)) {
        break label98;
      }
      throw null;
    }
    label98:
    "Name nhận đồ".<init>("vth", ey.y, i[2], i[1]);
    tmp53_50.k = tmp53_50;
    TextField tmp118_115 = new javax/microedition/lcdui/TextField;
    if (a(m))
    {
      "".length();
      if (null == null) {
        break label148;
      }
      throw null;
    }
    label148:
    "Giờ nhận đồ".<init>("0", String.valueOf(ey.w), i[3], i[3]);
    tmp118_115.h = tmp118_115;
    this.c = new TextField("Item GD <Mỗi ID cách nhau bằng dấu phảy > Nhập id item", a, i[4], i[1]);
    this.d = new TextField("Item Cất <Mỗi ID cách nhau bằng dấu phảy > Nhập id item", b, i[4], i[1]);
    TextField tmp220_217 = new javax/microedition/lcdui/TextField;
    if (a(m))
    {
      "".length();
      if ((0x85 ^ 0x9C ^ 0x7D ^ 0x60) > 0) {
        break label262;
      }
      throw null;
    }
    label262:
    "Phút nhận đồ".<init>("0", String.valueOf(ey.x), i[3], i[3]);
    tmp220_217.l = tmp220_217;
    TextField tmp282_279 = new javax/microedition/lcdui/TextField;
    if (a(m))
    {
      "".length();
      if (null == null) {
        break label312;
      }
      throw null;
    }
    label312:
    "Map nhận đồ".<init>("22", String.valueOf(ey.z), i[5], i[3]);
    tmp282_279.g = tmp282_279;
    TextField tmp332_329 = new javax/microedition/lcdui/TextField;
    if (a(m))
    {
      "".length();
      if ("  ".length() != -" ".length()) {
        break label372;
      }
      throw null;
    }
    label372:
    "Khun Vực nhận".<init>("20", String.valueOf(ey.v), i[6], i[3]);
    tmp332_329.f = tmp332_329;
    this.j = new Command("Lưu", i[5], i[1]);
  }
  
  public final void b()
  {
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    "".length();
    this.e.addCommand(this.j);
    this.e.addCommand(new Command("Thoát", i[7], i[1]));
    this.e.setCommandListener(this);
    a(this.e);
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static void d()
  {
    i = new int[8];
    i[0] = " ".length();
    i[1] = ((0x44 ^ 0x8) & (0x1E ^ 0x52 ^ 0xFFFFFFFF));
    i[2] = (0xB772 & 0x6F9D);
    i[3] = "  ".length();
    i[4] = (0x9BF8 & 0x67EF);
    i[5] = (0x54 ^ 0x6 ^ 0x7A ^ 0x2C);
    i[6] = "   ".length();
    i[7] = (0x7 ^ 0x6D ^ 0x33 ^ 0x5E);
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\cw.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */