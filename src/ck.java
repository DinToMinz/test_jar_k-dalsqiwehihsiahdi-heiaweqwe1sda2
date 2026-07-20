import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

public final class ck
  implements CommandListener
{
  private static DataInputStream a;
  private static ByteArrayOutputStream b;
  private static int[] c;
  private final Command d = new Command("Hủy", c[2], c[1]);
  private final ChoiceGroup e = new ChoiceGroup("Cài Đặt Chung!!", c[3], new String[] { "Điểm Danh" }, null);
  private static RecordStore f;
  private final gn g = new gn("menu pro");
  private final Command h = new Command("Lưu", c[0], c[1]);
  private static boolean i;
  private static DataOutputStream j;
  private static ByteArrayInputStream k;
  private TextField l = new TextField("Tên dd", m, c[5], c[4]);
  private static String m;
  
  private static void a(Displayable paramDisplayable)
  {
    gb.a(bv.d).a(paramDisplayable);
  }
  
  public final void a()
  {
    "".length();
    "".length();
    this.g.addCommand(this.h);
    this.g.addCommand(this.d);
    this.g.setCommandListener(this);
    this.e.setSelectedIndex(c[4], i);
    a(this.g);
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  /* Error */
  public static void b()
  {
    // Byte code:
    //   0: invokestatic 57	ck:d	()V
    //   3: getstatic 40	ck:c	[I
    //   6: iconst_4
    //   7: iaload
    //   8: putstatic 46	ck:i	Z
    //   11: ldc 10
    //   13: putstatic 50	ck:m	Ljava/lang/String;
    //   16: ldc 11
    //   18: getstatic 40	ck:c	[I
    //   21: iconst_1
    //   22: iaload
    //   23: invokestatic 62	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   26: dup
    //   27: putstatic 43	ck:f	Ljavax/microedition/rms/RecordStore;
    //   30: invokevirtual 90	javax/microedition/rms/RecordStore:getNumRecords	()I
    //   33: invokestatic 52	ck:a	(I)Z
    //   36: ifeq +53 -> 89
    //   39: new 22	java/io/ByteArrayInputStream
    //   42: dup
    //   43: getstatic 43	ck:f	Ljavax/microedition/rms/RecordStore;
    //   46: getstatic 40	ck:c	[I
    //   49: iconst_1
    //   50: iaload
    //   51: invokevirtual 91	javax/microedition/rms/RecordStore:getRecord	(I)[B
    //   54: invokespecial 65	java/io/ByteArrayInputStream:<init>	([B)V
    //   57: putstatic 48	ck:k	Ljava/io/ByteArrayInputStream;
    //   60: new 24	java/io/DataInputStream
    //   63: dup
    //   64: getstatic 48	ck:k	Ljava/io/ByteArrayInputStream;
    //   67: invokespecial 69	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   70: dup
    //   71: putstatic 38	ck:a	Ljava/io/DataInputStream;
    //   74: invokevirtual 70	java/io/DataInputStream:readBoolean	()Z
    //   77: putstatic 46	ck:i	Z
    //   80: getstatic 38	ck:a	Ljava/io/DataInputStream;
    //   83: invokevirtual 71	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   86: putstatic 50	ck:m	Ljava/lang/String;
    //   89: getstatic 43	ck:f	Ljavax/microedition/rms/RecordStore;
    //   92: invokevirtual 89	javax/microedition/rms/RecordStore:closeRecordStore	()V
    //   95: return
    //   96: ldc 1
    //   98: invokevirtual 79	java/lang/String:length	()I
    //   101: pop2
    //   102: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   96	1	0	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   16	95	96	java/lang/Exception
  }
  
  static
  {
    cs.a(33);
    b();
  }
  
  /* Error */
  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield 45	ck:h	Ljavax/microedition/lcdui/Command;
    //   5: invokestatic 53	ck:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   8: ifeq +322 -> 330
    //   11: aload_0
    //   12: getfield 42	ck:e	Ljavax/microedition/lcdui/ChoiceGroup;
    //   15: getstatic 40	ck:c	[I
    //   18: iconst_4
    //   19: iaload
    //   20: invokevirtual 81	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   23: putstatic 46	ck:i	Z
    //   26: aload_0
    //   27: getfield 49	ck:l	Ljavax/microedition/lcdui/TextField;
    //   30: invokevirtual 87	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   33: putstatic 50	ck:m	Ljava/lang/String;
    //   36: new 23	java/io/ByteArrayOutputStream
    //   39: dup
    //   40: invokespecial 66	java/io/ByteArrayOutputStream:<init>	()V
    //   43: putstatic 39	ck:b	Ljava/io/ByteArrayOutputStream;
    //   46: new 25	java/io/DataOutputStream
    //   49: dup
    //   50: getstatic 39	ck:b	Ljava/io/ByteArrayOutputStream;
    //   53: invokespecial 72	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   56: putstatic 47	ck:j	Ljava/io/DataOutputStream;
    //   59: getstatic 47	ck:j	Ljava/io/DataOutputStream;
    //   62: getstatic 46	ck:i	Z
    //   65: invokevirtual 75	java/io/DataOutputStream:writeBoolean	(Z)V
    //   68: getstatic 47	ck:j	Ljava/io/DataOutputStream;
    //   71: getstatic 50	ck:m	Ljava/lang/String;
    //   74: invokevirtual 76	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   77: getstatic 47	ck:j	Ljava/io/DataOutputStream;
    //   80: invokevirtual 74	java/io/DataOutputStream:flush	()V
    //   83: getstatic 47	ck:j	Ljava/io/DataOutputStream;
    //   86: invokevirtual 73	java/io/DataOutputStream:close	()V
    //   89: getstatic 39	ck:b	Ljava/io/ByteArrayOutputStream;
    //   92: invokevirtual 77	java/io/OutputStream:flush	()V
    //   95: ldc 11
    //   97: getstatic 40	ck:c	[I
    //   100: iconst_1
    //   101: iaload
    //   102: invokestatic 62	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   105: putstatic 43	ck:f	Ljavax/microedition/rms/RecordStore;
    //   108: getstatic 39	ck:b	Ljava/io/ByteArrayOutputStream;
    //   111: invokevirtual 68	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   114: astore_1
    //   115: getstatic 39	ck:b	Ljava/io/ByteArrayOutputStream;
    //   118: invokevirtual 67	java/io/ByteArrayOutputStream:close	()V
    //   121: getstatic 43	ck:f	Ljavax/microedition/rms/RecordStore;
    //   124: invokevirtual 90	javax/microedition/rms/RecordStore:getNumRecords	()I
    //   127: invokestatic 56	ck:b	(I)Z
    //   130: ifeq +39 -> 169
    //   133: getstatic 43	ck:f	Ljavax/microedition/rms/RecordStore;
    //   136: aload_1
    //   137: getstatic 40	ck:c	[I
    //   140: iconst_4
    //   141: iaload
    //   142: aload_1
    //   143: arraylength
    //   144: invokevirtual 88	javax/microedition/rms/RecordStore:addRecord	([BII)I
    //   147: ldc 1
    //   149: invokevirtual 79	java/lang/String:length	()I
    //   152: pop2
    //   153: ldc 1
    //   155: invokevirtual 79	java/lang/String:length	()I
    //   158: pop
    //   159: ldc 4
    //   161: invokevirtual 79	java/lang/String:length	()I
    //   164: ineg
    //   165: iflt +23 -> 188
    //   168: return
    //   169: getstatic 43	ck:f	Ljavax/microedition/rms/RecordStore;
    //   172: getstatic 40	ck:c	[I
    //   175: iconst_1
    //   176: iaload
    //   177: aload_1
    //   178: getstatic 40	ck:c	[I
    //   181: iconst_4
    //   182: iaload
    //   183: aload_1
    //   184: arraylength
    //   185: invokevirtual 92	javax/microedition/rms/RecordStore:setRecord	(I[BII)V
    //   188: getstatic 43	ck:f	Ljavax/microedition/rms/RecordStore;
    //   191: invokevirtual 89	javax/microedition/rms/RecordStore:closeRecordStore	()V
    //   194: ldc 1
    //   196: invokevirtual 79	java/lang/String:length	()I
    //   199: pop
    //   200: bipush 68
    //   202: bipush 93
    //   204: iadd
    //   205: sipush 147
    //   208: isub
    //   209: sipush 191
    //   212: iadd
    //   213: bipush 23
    //   215: bipush 30
    //   217: iadd
    //   218: iconst_3
    //   219: isub
    //   220: bipush 90
    //   222: iadd
    //   223: ixor
    //   224: bipush 95
    //   226: bipush 42
    //   228: ixor
    //   229: bipush 82
    //   231: bipush 102
    //   233: ixor
    //   234: ixor
    //   235: ldc 2
    //   237: invokevirtual 79	java/lang/String:length	()I
    //   240: ineg
    //   241: ixor
    //   242: iand
    //   243: bipush 91
    //   245: bipush 111
    //   247: iadd
    //   248: sipush 185
    //   251: isub
    //   252: bipush 116
    //   254: iadd
    //   255: bipush 54
    //   257: sipush 145
    //   260: iadd
    //   261: bipush 96
    //   263: isub
    //   264: bipush 50
    //   266: iadd
    //   267: ixor
    //   268: bipush 51
    //   270: iconst_5
    //   271: ixor
    //   272: bipush 31
    //   274: bipush 53
    //   276: ixor
    //   277: ixor
    //   278: ldc 2
    //   280: invokevirtual 79	java/lang/String:length	()I
    //   283: ineg
    //   284: ixor
    //   285: iand
    //   286: ldc 2
    //   288: invokevirtual 79	java/lang/String:length	()I
    //   291: ineg
    //   292: ixor
    //   293: iand
    //   294: ifeq +10 -> 304
    //   297: return
    //   298: ldc 1
    //   300: invokevirtual 79	java/lang/String:length	()I
    //   303: pop2
    //   304: ldc 8
    //   306: invokestatic 51	aw:a	(Ljava/lang/String;)V
    //   309: ldc 1
    //   311: invokevirtual 79	java/lang/String:length	()I
    //   314: pop
    //   315: ldc 3
    //   317: invokevirtual 79	java/lang/String:length	()I
    //   320: ifge +10 -> 330
    //   323: return
    //   324: ldc 1
    //   326: invokevirtual 79	java/lang/String:length	()I
    //   329: pop2
    //   330: invokestatic 59	dm:d	()Ldm;
    //   333: invokestatic 54	ck:a	(Ljavax/microedition/lcdui/Displayable;)V
    //   336: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	337	0	this	ck
    //   0	337	1	paramCommand	Command
    //   0	337	2	paramDisplayable	Displayable
    //   298	1	3	localException	Exception
    //   324	1	4	localNumberFormatException	NumberFormatException
    // Exception table:
    //   from	to	target	type
    //   59	194	298	java/lang/Exception
    //   11	309	324	java/lang/NumberFormatException
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static void d()
  {
    c = new int[6];
    c[0] = (0xD7 ^ 0xC5 ^ 0x61 ^ 0x77);
    c[1] = " ".length();
    c[2] = "   ".length();
    c[3] = "  ".length();
    c[4] = ((0x9E ^ 0x90) & (0xB0 ^ 0xBE ^ 0xFFFFFFFF));
    c[5] = (0xFC35 & 0x7CA);
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ck.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */