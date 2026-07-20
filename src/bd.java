import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

public final class bd
  implements CommandListener
{
  public static String a;
  private gn c = new gn("Auto Chát KTG !");
  private TextField d = new TextField("Nội Dung Chát KTG", a, m[2], m[3]);
  private static ByteArrayInputStream e;
  private Command f = new Command("Hủy", m[5], m[3]);
  private static ByteArrayOutputStream g;
  private static DataOutputStream h;
  private static RecordStore i;
  private Command j = new Command("Lưu", m[4], m[3]);
  private static DataInputStream k;
  public static long b;
  private TextField l = new TextField("Quãng nghỉ (milisecond)", b, m[0], m[1]);
  private static int[] m;
  
  /* Error */
  public static void a()
  {
    // Byte code:
    //   0: invokestatic 56	bd:d	()V
    //   3: ldc2_w 34
    //   6: putstatic 37	bd:b	J
    //   9: ldc 10
    //   11: getstatic 48	bd:m	[I
    //   14: iconst_3
    //   15: iaload
    //   16: invokestatic 61	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   19: dup
    //   20: putstatic 44	bd:i	Ljavax/microedition/rms/RecordStore;
    //   23: invokevirtual 90	javax/microedition/rms/RecordStore:getNumRecords	()I
    //   26: invokestatic 52	bd:a	(I)Z
    //   29: ifeq +53 -> 82
    //   32: new 19	java/io/ByteArrayInputStream
    //   35: dup
    //   36: getstatic 44	bd:i	Ljavax/microedition/rms/RecordStore;
    //   39: getstatic 48	bd:m	[I
    //   42: iconst_3
    //   43: iaload
    //   44: invokevirtual 91	javax/microedition/rms/RecordStore:getRecord	(I)[B
    //   47: invokespecial 64	java/io/ByteArrayInputStream:<init>	([B)V
    //   50: putstatic 40	bd:e	Ljava/io/ByteArrayInputStream;
    //   53: new 21	java/io/DataInputStream
    //   56: dup
    //   57: getstatic 40	bd:e	Ljava/io/ByteArrayInputStream;
    //   60: invokespecial 68	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   63: dup
    //   64: putstatic 46	bd:k	Ljava/io/DataInputStream;
    //   67: invokevirtual 69	java/io/DataInputStream:readLong	()J
    //   70: putstatic 37	bd:b	J
    //   73: getstatic 46	bd:k	Ljava/io/DataInputStream;
    //   76: invokevirtual 70	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   79: putstatic 36	bd:a	Ljava/lang/String;
    //   82: getstatic 44	bd:i	Ljavax/microedition/rms/RecordStore;
    //   85: invokevirtual 89	javax/microedition/rms/RecordStore:closeRecordStore	()V
    //   88: return
    //   89: ldc 1
    //   91: invokevirtual 79	java/lang/String:length	()I
    //   94: pop2
    //   95: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   89	1	0	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   9	88	89	java/lang/Exception
  }
  
  static
  {
    cs.a(137);
    a();
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static void a(Displayable paramDisplayable)
  {
    gb.a(bv.d).a(paramDisplayable);
  }
  
  /* Error */
  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield 45	bd:j	Ljavax/microedition/lcdui/Command;
    //   5: invokestatic 53	bd:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   8: ifeq +230 -> 238
    //   11: aload_0
    //   12: getfield 47	bd:l	Ljavax/microedition/lcdui/TextField;
    //   15: invokevirtual 87	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   18: invokestatic 77	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   21: putstatic 37	bd:b	J
    //   24: aload_0
    //   25: getfield 39	bd:d	Ljavax/microedition/lcdui/TextField;
    //   28: invokevirtual 87	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   31: putstatic 36	bd:a	Ljava/lang/String;
    //   34: new 20	java/io/ByteArrayOutputStream
    //   37: dup
    //   38: invokespecial 65	java/io/ByteArrayOutputStream:<init>	()V
    //   41: putstatic 42	bd:g	Ljava/io/ByteArrayOutputStream;
    //   44: new 22	java/io/DataOutputStream
    //   47: dup
    //   48: getstatic 42	bd:g	Ljava/io/ByteArrayOutputStream;
    //   51: invokespecial 71	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   54: dup
    //   55: putstatic 43	bd:h	Ljava/io/DataOutputStream;
    //   58: getstatic 37	bd:b	J
    //   61: invokevirtual 74	java/io/DataOutputStream:writeLong	(J)V
    //   64: getstatic 43	bd:h	Ljava/io/DataOutputStream;
    //   67: getstatic 36	bd:a	Ljava/lang/String;
    //   70: invokevirtual 75	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   73: getstatic 43	bd:h	Ljava/io/DataOutputStream;
    //   76: invokevirtual 73	java/io/DataOutputStream:flush	()V
    //   79: getstatic 43	bd:h	Ljava/io/DataOutputStream;
    //   82: invokevirtual 72	java/io/DataOutputStream:close	()V
    //   85: getstatic 42	bd:g	Ljava/io/ByteArrayOutputStream;
    //   88: invokevirtual 76	java/io/OutputStream:flush	()V
    //   91: ldc 10
    //   93: getstatic 48	bd:m	[I
    //   96: iconst_3
    //   97: iaload
    //   98: invokestatic 61	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   101: putstatic 44	bd:i	Ljavax/microedition/rms/RecordStore;
    //   104: getstatic 42	bd:g	Ljava/io/ByteArrayOutputStream;
    //   107: invokevirtual 66	java/io/ByteArrayOutputStream:close	()V
    //   110: getstatic 44	bd:i	Ljavax/microedition/rms/RecordStore;
    //   113: invokevirtual 90	javax/microedition/rms/RecordStore:getNumRecords	()I
    //   116: invokestatic 55	bd:b	(I)Z
    //   119: ifeq +56 -> 175
    //   122: getstatic 44	bd:i	Ljavax/microedition/rms/RecordStore;
    //   125: getstatic 42	bd:g	Ljava/io/ByteArrayOutputStream;
    //   128: invokevirtual 67	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   131: getstatic 48	bd:m	[I
    //   134: bipush 6
    //   136: iaload
    //   137: getstatic 42	bd:g	Ljava/io/ByteArrayOutputStream;
    //   140: invokevirtual 67	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   143: arraylength
    //   144: invokevirtual 88	javax/microedition/rms/RecordStore:addRecord	([BII)I
    //   147: ldc 1
    //   149: invokevirtual 79	java/lang/String:length	()I
    //   152: pop2
    //   153: ldc 1
    //   155: invokevirtual 79	java/lang/String:length	()I
    //   158: pop
    //   159: sipush 136
    //   162: sipush 140
    //   165: ixor
    //   166: ldc 2
    //   168: invokevirtual 79	java/lang/String:length	()I
    //   171: if_icmpgt +34 -> 205
    //   174: return
    //   175: getstatic 44	bd:i	Ljavax/microedition/rms/RecordStore;
    //   178: getstatic 48	bd:m	[I
    //   181: iconst_3
    //   182: iaload
    //   183: getstatic 42	bd:g	Ljava/io/ByteArrayOutputStream;
    //   186: invokevirtual 67	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   189: getstatic 48	bd:m	[I
    //   192: bipush 6
    //   194: iaload
    //   195: getstatic 42	bd:g	Ljava/io/ByteArrayOutputStream;
    //   198: invokevirtual 67	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   201: arraylength
    //   202: invokevirtual 92	javax/microedition/rms/RecordStore:setRecord	(I[BII)V
    //   205: getstatic 44	bd:i	Ljavax/microedition/rms/RecordStore;
    //   208: invokevirtual 89	javax/microedition/rms/RecordStore:closeRecordStore	()V
    //   211: ldc 1
    //   213: invokevirtual 79	java/lang/String:length	()I
    //   216: pop
    //   217: bipush 31
    //   219: bipush 26
    //   221: ixor
    //   222: ineg
    //   223: iflt +10 -> 233
    //   226: return
    //   227: ldc 1
    //   229: invokevirtual 79	java/lang/String:length	()I
    //   232: pop2
    //   233: ldc 7
    //   235: invokestatic 50	aw:a	(Ljava/lang/String;)V
    //   238: invokestatic 58	dm:d	()Ldm;
    //   241: invokestatic 54	bd:a	(Ljavax/microedition/lcdui/Displayable;)V
    //   244: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	245	0	this	bd
    //   0	245	1	paramCommand	Command
    //   0	245	2	paramDisplayable	Displayable
    //   227	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   34	211	227	java/lang/Exception
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private static void d()
  {
    m = new int[7];
    m[0] = (-(0xD7FD & 0x2A0B) & 0xA7FD & 0x5BFE);
    m[1] = "  ".length();
    m[2] = (-(0x63 ^ 0x33) & 0xBF7F & 0x67DF);
    m[3] = " ".length();
    m[4] = (69 + 113 - 177 + 139 ^ 20 + 103 - 114 + 139);
    m[5] = (0x55 ^ 0xC ^ 0x9 ^ 0x57);
    m[6] = ((0xCE ^ 0xAA ^ 0x7D ^ 0x35) & (0xAD ^ 0xB9 ^ 0x4A ^ 0x72 ^ -" ".length()) & ((0xB7 ^ 0xAA ^ 0x8A ^ 0x83) & (0x11 ^ 0x27 ^ 0x30 ^ 0x12 ^ -" ".length()) ^ -" ".length()));
  }
  
  public final void b()
  {
    "".length();
    "".length();
    this.c.addCommand(this.j);
    this.c.addCommand(this.f);
    this.c.setCommandListener(this);
    a(this.c);
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bd.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */