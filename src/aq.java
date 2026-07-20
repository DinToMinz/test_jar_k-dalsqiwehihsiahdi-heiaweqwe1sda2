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

public final class aq
  implements CommandListener
{
  public static boolean a;
  private final gn m = new gn("menu pro");
  private static RecordStore n;
  public static boolean b;
  private static ByteArrayOutputStream o;
  public static boolean c;
  public static String d;
  private final ChoiceGroup p = new ChoiceGroup("Cài Đặt Chung!!", t[3], new String[] { "Auto 4skill", "Hiện ID Map", "Hiện Exp/Yên Khi Up", "Hiệu Ứng Tele Quái", "Điểm Danh", "Dùng x2", "Dùng TNP", "Gom Đồ", "Cất Đồ Khi Up" }, null);
  private final Command q = new Command("Hủy", t[2], t[1]);
  private TextField r = new TextField("Phút dd", g, t[3], t[3]);
  private TextField s = new TextField("Giờ dd", f, t[3], t[3]);
  public static boolean e;
  public static int f;
  public static int g;
  private static int[] t;
  public static boolean h;
  private static DataInputStream u;
  private final Command v = new Command("Lưu", t[0], t[1]);
  public static boolean i;
  public static boolean j;
  private static ByteArrayInputStream w;
  public static boolean k;
  private static boolean x;
  private static DataOutputStream y;
  public static boolean l;
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  /* Error */
  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield 68	aq:v	Ljavax/microedition/lcdui/Command;
    //   5: invokestatic 75	aq:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   8: ifeq +484 -> 492
    //   11: aload_0
    //   12: getfield 62	aq:p	Ljavax/microedition/lcdui/ChoiceGroup;
    //   15: getstatic 66	aq:t	[I
    //   18: iconst_5
    //   19: iaload
    //   20: invokevirtual 107	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   23: putstatic 58	aq:l	Z
    //   26: aload_0
    //   27: getfield 62	aq:p	Ljavax/microedition/lcdui/ChoiceGroup;
    //   30: getstatic 66	aq:t	[I
    //   33: iconst_1
    //   34: iaload
    //   35: invokevirtual 107	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   38: putstatic 49	aq:c	Z
    //   41: aload_0
    //   42: getfield 62	aq:p	Ljavax/microedition/lcdui/ChoiceGroup;
    //   45: getstatic 66	aq:t	[I
    //   48: iconst_3
    //   49: iaload
    //   50: invokevirtual 107	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   53: putstatic 54	aq:h	Z
    //   56: aload_0
    //   57: getfield 62	aq:p	Ljavax/microedition/lcdui/ChoiceGroup;
    //   60: getstatic 66	aq:t	[I
    //   63: iconst_2
    //   64: iaload
    //   65: invokevirtual 107	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   68: putstatic 70	aq:x	Z
    //   71: aload_0
    //   72: getfield 62	aq:p	Ljavax/microedition/lcdui/ChoiceGroup;
    //   75: getstatic 66	aq:t	[I
    //   78: bipush 6
    //   80: iaload
    //   81: invokevirtual 107	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   84: putstatic 55	aq:i	Z
    //   87: aload_0
    //   88: getfield 62	aq:p	Ljavax/microedition/lcdui/ChoiceGroup;
    //   91: getstatic 66	aq:t	[I
    //   94: bipush 7
    //   96: iaload
    //   97: invokevirtual 107	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   100: putstatic 51	aq:e	Z
    //   103: aload_0
    //   104: getfield 62	aq:p	Ljavax/microedition/lcdui/ChoiceGroup;
    //   107: getstatic 66	aq:t	[I
    //   110: bipush 8
    //   112: iaload
    //   113: invokevirtual 107	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   116: putstatic 57	aq:k	Z
    //   119: aload_0
    //   120: getfield 62	aq:p	Ljavax/microedition/lcdui/ChoiceGroup;
    //   123: getstatic 66	aq:t	[I
    //   126: bipush 9
    //   128: iaload
    //   129: invokevirtual 107	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   132: putstatic 56	aq:j	Z
    //   135: aload_0
    //   136: getfield 62	aq:p	Ljavax/microedition/lcdui/ChoiceGroup;
    //   139: getstatic 66	aq:t	[I
    //   142: iconst_0
    //   143: iaload
    //   144: invokevirtual 107	javax/microedition/lcdui/ChoiceGroup:isSelected	(I)Z
    //   147: putstatic 47	aq:a	Z
    //   150: aload_0
    //   151: getfield 65	aq:s	Ljavax/microedition/lcdui/TextField;
    //   154: invokevirtual 113	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   157: invokestatic 100	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   160: putstatic 52	aq:f	I
    //   163: aload_0
    //   164: getfield 64	aq:r	Ljavax/microedition/lcdui/TextField;
    //   167: invokevirtual 113	javax/microedition/lcdui/TextField:getString	()Ljava/lang/String;
    //   170: invokestatic 100	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   173: putstatic 53	aq:g	I
    //   176: new 31	java/io/ByteArrayOutputStream
    //   179: dup
    //   180: invokespecial 88	java/io/ByteArrayOutputStream:<init>	()V
    //   183: putstatic 61	aq:o	Ljava/io/ByteArrayOutputStream;
    //   186: new 33	java/io/DataOutputStream
    //   189: dup
    //   190: getstatic 61	aq:o	Ljava/io/ByteArrayOutputStream;
    //   193: invokespecial 94	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   196: putstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   199: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   202: getstatic 58	aq:l	Z
    //   205: invokevirtual 97	java/io/DataOutputStream:writeBoolean	(Z)V
    //   208: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   211: getstatic 49	aq:c	Z
    //   214: invokevirtual 97	java/io/DataOutputStream:writeBoolean	(Z)V
    //   217: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   220: getstatic 54	aq:h	Z
    //   223: invokevirtual 97	java/io/DataOutputStream:writeBoolean	(Z)V
    //   226: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   229: getstatic 70	aq:x	Z
    //   232: invokevirtual 97	java/io/DataOutputStream:writeBoolean	(Z)V
    //   235: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   238: getstatic 55	aq:i	Z
    //   241: invokevirtual 97	java/io/DataOutputStream:writeBoolean	(Z)V
    //   244: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   247: getstatic 51	aq:e	Z
    //   250: invokevirtual 97	java/io/DataOutputStream:writeBoolean	(Z)V
    //   253: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   256: getstatic 57	aq:k	Z
    //   259: invokevirtual 97	java/io/DataOutputStream:writeBoolean	(Z)V
    //   262: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   265: getstatic 56	aq:j	Z
    //   268: invokevirtual 97	java/io/DataOutputStream:writeBoolean	(Z)V
    //   271: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   274: getstatic 47	aq:a	Z
    //   277: invokevirtual 97	java/io/DataOutputStream:writeBoolean	(Z)V
    //   280: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   283: getstatic 52	aq:f	I
    //   286: invokevirtual 98	java/io/DataOutputStream:writeInt	(I)V
    //   289: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   292: getstatic 53	aq:g	I
    //   295: invokevirtual 98	java/io/DataOutputStream:writeInt	(I)V
    //   298: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   301: invokevirtual 96	java/io/DataOutputStream:flush	()V
    //   304: getstatic 71	aq:y	Ljava/io/DataOutputStream;
    //   307: invokevirtual 95	java/io/DataOutputStream:close	()V
    //   310: getstatic 61	aq:o	Ljava/io/ByteArrayOutputStream;
    //   313: invokevirtual 99	java/io/OutputStream:flush	()V
    //   316: ldc 20
    //   318: getstatic 66	aq:t	[I
    //   321: iconst_1
    //   322: iaload
    //   323: invokestatic 84	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   326: putstatic 60	aq:n	Ljavax/microedition/rms/RecordStore;
    //   329: getstatic 61	aq:o	Ljava/io/ByteArrayOutputStream;
    //   332: invokevirtual 90	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   335: astore_1
    //   336: getstatic 61	aq:o	Ljava/io/ByteArrayOutputStream;
    //   339: invokevirtual 89	java/io/ByteArrayOutputStream:close	()V
    //   342: getstatic 60	aq:n	Ljavax/microedition/rms/RecordStore;
    //   345: invokevirtual 116	javax/microedition/rms/RecordStore:getNumRecords	()I
    //   348: invokestatic 77	aq:b	(I)Z
    //   351: ifeq +38 -> 389
    //   354: getstatic 60	aq:n	Ljavax/microedition/rms/RecordStore;
    //   357: aload_1
    //   358: getstatic 66	aq:t	[I
    //   361: iconst_5
    //   362: iaload
    //   363: aload_1
    //   364: arraylength
    //   365: invokevirtual 114	javax/microedition/rms/RecordStore:addRecord	([BII)I
    //   368: ldc 1
    //   370: invokevirtual 102	java/lang/String:length	()I
    //   373: pop2
    //   374: ldc 1
    //   376: invokevirtual 102	java/lang/String:length	()I
    //   379: pop
    //   380: ldc 3
    //   382: invokevirtual 102	java/lang/String:length	()I
    //   385: ifgt +23 -> 408
    //   388: return
    //   389: getstatic 60	aq:n	Ljavax/microedition/rms/RecordStore;
    //   392: getstatic 66	aq:t	[I
    //   395: iconst_1
    //   396: iaload
    //   397: aload_1
    //   398: getstatic 66	aq:t	[I
    //   401: iconst_5
    //   402: iaload
    //   403: aload_1
    //   404: arraylength
    //   405: invokevirtual 118	javax/microedition/rms/RecordStore:setRecord	(I[BII)V
    //   408: getstatic 60	aq:n	Ljavax/microedition/rms/RecordStore;
    //   411: invokevirtual 115	javax/microedition/rms/RecordStore:closeRecordStore	()V
    //   414: ldc 1
    //   416: invokevirtual 102	java/lang/String:length	()I
    //   419: pop
    //   420: ldc 3
    //   422: invokevirtual 102	java/lang/String:length	()I
    //   425: ineg
    //   426: iflt +10 -> 436
    //   429: return
    //   430: ldc 1
    //   432: invokevirtual 102	java/lang/String:length	()I
    //   435: pop2
    //   436: ldc 17
    //   438: invokestatic 79	aw:a	(Ljava/lang/String;)V
    //   441: ldc 1
    //   443: invokevirtual 102	java/lang/String:length	()I
    //   446: pop
    //   447: ldc 3
    //   449: invokevirtual 102	java/lang/String:length	()I
    //   452: bipush 79
    //   454: bipush 109
    //   456: ixor
    //   457: bipush 19
    //   459: bipush 122
    //   461: ixor
    //   462: ixor
    //   463: bipush 19
    //   465: bipush 69
    //   467: ixor
    //   468: bipush 79
    //   470: bipush 82
    //   472: ixor
    //   473: ixor
    //   474: ldc 2
    //   476: invokevirtual 102	java/lang/String:length	()I
    //   479: ineg
    //   480: ixor
    //   481: iand
    //   482: if_icmpgt +10 -> 492
    //   485: return
    //   486: ldc 1
    //   488: invokevirtual 102	java/lang/String:length	()I
    //   491: pop2
    //   492: invokestatic 81	dm:d	()Ldm;
    //   495: invokestatic 76	aq:a	(Ljavax/microedition/lcdui/Displayable;)V
    //   498: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	499	0	this	aq
    //   0	499	1	paramCommand	Command
    //   0	499	2	paramDisplayable	Displayable
    //   430	1	3	localException	Exception
    //   486	1	4	localNumberFormatException	NumberFormatException
    // Exception table:
    //   from	to	target	type
    //   199	414	430	java/lang/Exception
    //   11	441	486	java/lang/NumberFormatException
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
  public static void a()
  {
    // Byte code:
    //   0: invokestatic 78	aq:d	()V
    //   3: getstatic 66	aq:t	[I
    //   6: iconst_5
    //   7: iaload
    //   8: putstatic 58	aq:l	Z
    //   11: getstatic 66	aq:t	[I
    //   14: iconst_1
    //   15: iaload
    //   16: putstatic 49	aq:c	Z
    //   19: getstatic 66	aq:t	[I
    //   22: iconst_5
    //   23: iaload
    //   24: putstatic 54	aq:h	Z
    //   27: getstatic 66	aq:t	[I
    //   30: iconst_5
    //   31: iaload
    //   32: putstatic 70	aq:x	Z
    //   35: getstatic 66	aq:t	[I
    //   38: iconst_5
    //   39: iaload
    //   40: putstatic 48	aq:b	Z
    //   43: getstatic 66	aq:t	[I
    //   46: iconst_5
    //   47: iaload
    //   48: putstatic 55	aq:i	Z
    //   51: getstatic 66	aq:t	[I
    //   54: iconst_5
    //   55: iaload
    //   56: putstatic 51	aq:e	Z
    //   59: getstatic 66	aq:t	[I
    //   62: iconst_5
    //   63: iaload
    //   64: putstatic 57	aq:k	Z
    //   67: getstatic 66	aq:t	[I
    //   70: iconst_5
    //   71: iaload
    //   72: putstatic 56	aq:j	Z
    //   75: getstatic 66	aq:t	[I
    //   78: iconst_5
    //   79: iaload
    //   80: putstatic 47	aq:a	Z
    //   83: getstatic 66	aq:t	[I
    //   86: iconst_1
    //   87: iaload
    //   88: putstatic 52	aq:f	I
    //   91: getstatic 66	aq:t	[I
    //   94: bipush 10
    //   96: iaload
    //   97: putstatic 53	aq:g	I
    //   100: ldc 1
    //   102: putstatic 50	aq:d	Ljava/lang/String;
    //   105: ldc 20
    //   107: getstatic 66	aq:t	[I
    //   110: iconst_1
    //   111: iaload
    //   112: invokestatic 84	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   115: dup
    //   116: putstatic 60	aq:n	Ljavax/microedition/rms/RecordStore;
    //   119: invokevirtual 116	javax/microedition/rms/RecordStore:getNumRecords	()I
    //   122: invokestatic 74	aq:a	(I)Z
    //   125: ifeq +134 -> 259
    //   128: new 30	java/io/ByteArrayInputStream
    //   131: dup
    //   132: getstatic 60	aq:n	Ljavax/microedition/rms/RecordStore;
    //   135: getstatic 66	aq:t	[I
    //   138: iconst_1
    //   139: iaload
    //   140: invokevirtual 117	javax/microedition/rms/RecordStore:getRecord	(I)[B
    //   143: invokespecial 87	java/io/ByteArrayInputStream:<init>	([B)V
    //   146: putstatic 69	aq:w	Ljava/io/ByteArrayInputStream;
    //   149: new 32	java/io/DataInputStream
    //   152: dup
    //   153: getstatic 69	aq:w	Ljava/io/ByteArrayInputStream;
    //   156: invokespecial 91	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   159: dup
    //   160: putstatic 67	aq:u	Ljava/io/DataInputStream;
    //   163: invokevirtual 92	java/io/DataInputStream:readBoolean	()Z
    //   166: putstatic 58	aq:l	Z
    //   169: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   172: invokevirtual 92	java/io/DataInputStream:readBoolean	()Z
    //   175: putstatic 49	aq:c	Z
    //   178: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   181: invokevirtual 92	java/io/DataInputStream:readBoolean	()Z
    //   184: putstatic 54	aq:h	Z
    //   187: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   190: invokevirtual 92	java/io/DataInputStream:readBoolean	()Z
    //   193: putstatic 70	aq:x	Z
    //   196: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   199: invokevirtual 92	java/io/DataInputStream:readBoolean	()Z
    //   202: putstatic 55	aq:i	Z
    //   205: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   208: invokevirtual 92	java/io/DataInputStream:readBoolean	()Z
    //   211: putstatic 51	aq:e	Z
    //   214: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   217: invokevirtual 92	java/io/DataInputStream:readBoolean	()Z
    //   220: putstatic 57	aq:k	Z
    //   223: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   226: invokevirtual 92	java/io/DataInputStream:readBoolean	()Z
    //   229: putstatic 56	aq:j	Z
    //   232: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   235: invokevirtual 92	java/io/DataInputStream:readBoolean	()Z
    //   238: putstatic 47	aq:a	Z
    //   241: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   244: invokevirtual 93	java/io/DataInputStream:readInt	()I
    //   247: putstatic 52	aq:f	I
    //   250: getstatic 67	aq:u	Ljava/io/DataInputStream;
    //   253: invokevirtual 93	java/io/DataInputStream:readInt	()I
    //   256: putstatic 53	aq:g	I
    //   259: getstatic 60	aq:n	Ljavax/microedition/rms/RecordStore;
    //   262: invokevirtual 115	javax/microedition/rms/RecordStore:closeRecordStore	()V
    //   265: return
    //   266: ldc 1
    //   268: invokevirtual 102	java/lang/String:length	()I
    //   271: pop2
    //   272: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   266	1	0	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   105	265	266	java/lang/Exception
  }
  
  static
  {
    cs.a(17);
    a();
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  public final void b()
  {
    "".length();
    "".length();
    "".length();
    this.m.addCommand(this.v);
    this.m.addCommand(this.q);
    this.m.setCommandListener(this);
    this.p.setSelectedIndex(t[5], l);
    this.p.setSelectedIndex(t[1], c);
    this.p.setSelectedIndex(t[3], h);
    this.p.setSelectedIndex(t[2], x);
    this.p.setSelectedIndex(t[6], i);
    this.p.setSelectedIndex(t[7], e);
    this.p.setSelectedIndex(t[8], k);
    this.p.setSelectedIndex(t[9], j);
    this.p.setSelectedIndex(t[0], a);
    a(this.m);
  }
  
  private static void d()
  {
    t = new int[11];
    t[0] = (0x7D ^ 0x79);
    t[1] = " ".length();
    t[2] = "   ".length();
    t[3] = "  ".length();
    t[4] = (113 + 47 - -23 + 0 ^ 60 + 103 - 3 + 30);
    t[5] = ((0x8D ^ 0xA2 ^ 0xF8 ^ 0xC2) & ('' + '' - 168 + 56 ^ 103 + 52 - 143 + 155 ^ -" ".length()));
    t[6] = (41 + 73 - 53 + 87 ^ 40 + 126 - 62 + 41);
    t[7] = (0x3F ^ 0x39);
    t[8] = (0x84 ^ 0x83);
    t[9] = (0x92 ^ 0x9A);
    t[10] = (0x2C ^ 0x32);
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\aq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */