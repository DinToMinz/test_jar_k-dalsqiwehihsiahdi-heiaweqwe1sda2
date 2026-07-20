import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;
import javax.microedition.rms.RecordStore;

public final class ft
  implements CommandListener
{
  private Command b;
  private int c = j[0];
  private Command d;
  private Vector e = new Vector();
  private Command f;
  private TextField g;
  private RecordStore h;
  private Command i;
  private static int[] j;
  private Command k;
  private gn l = new gn(new String(new char[] { j[3], j[5], j[7], j[9], j[11], j[13], j[15], j[17], j[11], j[20], j[5], j[23], j[25], j[27] }));
  private ByteArrayOutputStream m;
  private ByteArrayInputStream n;
  private Vector o = new Vector();
  private DataInputStream p;
  private Command q;
  private TextField r = new TextField(new String(new char[] { j[3], j[15], j[17], j[11], j[20], j[5], j[23], j[25], j[27] }), "", j[28], j[2]);
  public gp a;
  private DataOutputStream s;
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 == paramObject2;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  /* Error */
  private void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 8
    //   3: getstatic 46	ft:j	[I
    //   6: iconst_4
    //   7: iaload
    //   8: invokestatic 74	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   11: putfield 44	ft:h	Ljavax/microedition/rms/RecordStore;
    //   14: aload_0
    //   15: new 22	java/io/ByteArrayOutputStream
    //   18: dup
    //   19: invokespecial 83	java/io/ByteArrayOutputStream:<init>	()V
    //   22: putfield 49	ft:m	Ljava/io/ByteArrayOutputStream;
    //   25: aload_0
    //   26: new 24	java/io/DataOutputStream
    //   29: dup
    //   30: aload_0
    //   31: getfield 49	ft:m	Ljava/io/ByteArrayOutputStream;
    //   34: invokespecial 89	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   37: putfield 55	ft:s	Ljava/io/DataOutputStream;
    //   40: getstatic 46	ft:j	[I
    //   43: iconst_2
    //   44: iaload
    //   45: istore_1
    //   46: iload_1
    //   47: aload_0
    //   48: getfield 51	ft:o	Ljava/util/Vector;
    //   51: invokevirtual 111	java/util/Vector:size	()I
    //   54: invokestatic 68	ft:c	(II)Z
    //   57: ifeq +61 -> 118
    //   60: aload_0
    //   61: getfield 55	ft:s	Ljava/io/DataOutputStream;
    //   64: new 28	java/lang/StringBuffer
    //   67: dup
    //   68: invokespecial 101	java/lang/StringBuffer:<init>	()V
    //   71: aload_0
    //   72: getfield 51	ft:o	Ljava/util/Vector;
    //   75: iload_1
    //   76: invokevirtual 109	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   79: invokevirtual 102	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   82: ldc 7
    //   84: invokevirtual 103	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   87: aload_0
    //   88: getfield 41	ft:e	Ljava/util/Vector;
    //   91: iload_1
    //   92: invokevirtual 109	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   95: invokevirtual 102	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   98: invokevirtual 104	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   101: invokevirtual 91	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   104: iinc 1 1
    //   107: ldc 2
    //   109: invokevirtual 96	java/lang/String:length	()I
    //   112: pop
    //   113: aconst_null
    //   114: ifnull -68 -> 46
    //   117: return
    //   118: aload_0
    //   119: getfield 49	ft:m	Ljava/io/ByteArrayOutputStream;
    //   122: invokevirtual 85	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   125: astore_1
    //   126: aload_0
    //   127: getfield 44	ft:h	Ljavax/microedition/rms/RecordStore;
    //   130: invokevirtual 119	javax/microedition/rms/RecordStore:getNumRecords	()I
    //   133: invokestatic 67	ft:c	(I)Z
    //   136: ifeq +48 -> 184
    //   139: aload_0
    //   140: getfield 44	ft:h	Ljavax/microedition/rms/RecordStore;
    //   143: aload_1
    //   144: getstatic 46	ft:j	[I
    //   147: iconst_2
    //   148: iaload
    //   149: aload_1
    //   150: arraylength
    //   151: invokevirtual 118	javax/microedition/rms/RecordStore:addRecord	([BII)I
    //   154: ldc 2
    //   156: invokevirtual 96	java/lang/String:length	()I
    //   159: pop2
    //   160: ldc 2
    //   162: invokevirtual 96	java/lang/String:length	()I
    //   165: pop
    //   166: bipush 97
    //   168: bipush 55
    //   170: ixor
    //   171: sipush 239
    //   174: sipush 189
    //   177: ixor
    //   178: ixor
    //   179: ineg
    //   180: ifle +24 -> 204
    //   183: return
    //   184: aload_0
    //   185: getfield 44	ft:h	Ljavax/microedition/rms/RecordStore;
    //   188: getstatic 46	ft:j	[I
    //   191: iconst_4
    //   192: iaload
    //   193: aload_1
    //   194: getstatic 46	ft:j	[I
    //   197: iconst_2
    //   198: iaload
    //   199: aload_1
    //   200: arraylength
    //   201: invokevirtual 121	javax/microedition/rms/RecordStore:setRecord	(I[BII)V
    //   204: aload_0
    //   205: getfield 55	ft:s	Ljava/io/DataOutputStream;
    //   208: invokevirtual 90	java/io/DataOutputStream:close	()V
    //   211: aload_0
    //   212: getfield 49	ft:m	Ljava/io/ByteArrayOutputStream;
    //   215: invokevirtual 84	java/io/ByteArrayOutputStream:close	()V
    //   218: return
    //   219: ldc 2
    //   221: invokevirtual 96	java/lang/String:length	()I
    //   224: pop2
    //   225: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	226	0	this	ft
    //   45	60	1	i1	int
    //   125	75	1	arrayOfByte	byte[]
    //   219	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	218	219	java/lang/Exception
  }
  
  private static void d()
  {
    j = new int[48];
    j[0] = (-" ".length());
    j[1] = (0x96 ^ 0xAC ^ 0x65 ^ 0x51);
    j[2] = ((0x71 ^ 0x4C) & (0x23 ^ 0x1E ^ 0xFFFFFFFF));
    j[3] = ('' + 10 - -69 + 7 ^ 125 + '' - 223 + 117);
    j[4] = " ".length();
    j[5] = (0xF5 ^ 0x9D);
    j[6] = "  ".length();
    j[7] = (76 + 78 - 57 + 137);
    j[8] = "   ".length();
    j[9] = (0x1F ^ 0x72);
    j[10] = (0x7E ^ 0x7A);
    j[11] = (0x72 ^ 0x52);
    j[12] = (94 + 109 - 140 + 125 ^ '' + 62 - 182 + 167);
    j[13] = (0x39 ^ 0x4D);
    j[14] = (0x81 ^ 0x87);
    j[15] = ((0x49 ^ 0x8) + (0x6B ^ 0x64) - (0x14 ^ 0x28) + ('¬' + 50 - 132 + 114));
    j[16] = (0x16 ^ 0x11);
    j[17] = (12 + '' - -12 + 92 ^ 42 + 9 - -92 + 5);
    j[18] = (45 + 11 - -77 + 50 ^ 86 + '' - 163 + 117);
    j[19] = (0xA9 ^ 0xA0);
    j[20] = (0x1C ^ 0x2B ^ 0xCD ^ 0x91);
    j[21] = (94 + '¯' - 107 + 25 ^ 74 + 71 - 140 + 172);
    j[22] = (0x27 ^ 0x69 ^ 0x74 ^ 0x31);
    j[23] = (35 + 96 - -46 + 46 ^ 114 + 5 - 83 + 140);
    j[24] = (101 + 37 - 78 + 67 ^ 0x42 ^ 0x31);
    j[25] = (-(0xF379 & 0x6DCF) & 0xFFFFFFFF & 0x7FEB);
    j[26] = (0x4D ^ 0x44 ^ 0xAF ^ 0xAB);
    j[27] = (0x74 ^ 0x1A);
    j[28] = (0x91F5 & 0x6FFE);
    j[29] = (14 + 9 - -28 + 147 ^ 38 + 17 - 21 + 105);
    j[30] = (-(0xFFFFFFC3 & 0x617F) & 0xFFFFFFFF & 0x7FEF);
    j[31] = (0x9EAF & 0x7FF9);
    j[32] = ('' + 40 - 33 + 76 ^ 97 + 72 - 64 + 61);
    j[33] = (0xA6D0 & 0x1592F);
    j[34] = ('' + '' - 122 + 98 ^ 101 + 92 - 51 + 37);
    j[35] = (-(0xAF9B & 0x707D) & 0xBEFF & 0x7FFF);
    j[36] = (14 + 'è' - 84 + 85 ^ '' + 21 - 40 + 23);
    j[37] = ('' + 9 - 43 + 77 ^ 75 + 32 - 89 + 124);
    j[38] = (0x66 ^ 0x7);
    j[39] = (0x65 ^ 0x37 ^ " ".length());
    j[40] = (96 + 'À' - 125 + 62);
    j[41] = (0xD4 ^ 0xB7);
    j[42] = (0xA97A & 0x5795);
    j[43] = (-(0xBCF1 & 0x7B2F) & 0xBD33 & 0x7BEF);
    j[44] = (0x4F ^ 0x4 ^ 0xB0 ^ 0x9C);
    j[45] = (0xD1 ^ 0xA1);
    j[46] = (0x49 ^ 0x11);
    j[47] = (61 + 'Í' - 95 + 72);
  }
  
  /* Error */
  private void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 8
    //   3: getstatic 46	ft:j	[I
    //   6: iconst_4
    //   7: iaload
    //   8: invokestatic 74	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   11: putfield 44	ft:h	Ljavax/microedition/rms/RecordStore;
    //   14: aload_0
    //   15: getfield 44	ft:h	Ljavax/microedition/rms/RecordStore;
    //   18: invokevirtual 119	javax/microedition/rms/RecordStore:getNumRecords	()I
    //   21: getstatic 46	ft:j	[I
    //   24: iconst_4
    //   25: iaload
    //   26: invokestatic 65	ft:b	(II)Z
    //   29: ifeq +132 -> 161
    //   32: aload_0
    //   33: new 21	java/io/ByteArrayInputStream
    //   36: dup
    //   37: aload_0
    //   38: getfield 44	ft:h	Ljavax/microedition/rms/RecordStore;
    //   41: getstatic 46	ft:j	[I
    //   44: iconst_4
    //   45: iaload
    //   46: invokevirtual 120	javax/microedition/rms/RecordStore:getRecord	(I)[B
    //   49: invokespecial 81	java/io/ByteArrayInputStream:<init>	([B)V
    //   52: putfield 50	ft:n	Ljava/io/ByteArrayInputStream;
    //   55: aload_0
    //   56: new 23	java/io/DataInputStream
    //   59: dup
    //   60: aload_0
    //   61: getfield 50	ft:n	Ljava/io/ByteArrayInputStream;
    //   64: invokespecial 86	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   67: putfield 52	ft:p	Ljava/io/DataInputStream;
    //   70: aload_0
    //   71: getfield 52	ft:p	Ljava/io/DataInputStream;
    //   74: invokevirtual 88	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   77: dup
    //   78: astore_1
    //   79: ldc 2
    //   81: invokevirtual 94	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: invokestatic 67	ft:c	(I)Z
    //   87: ifeq +60 -> 147
    //   90: aload_1
    //   91: ldc 7
    //   93: invokestatic 63	ft:a	(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    //   96: astore_1
    //   97: aload_0
    //   98: getfield 51	ft:o	Ljava/util/Vector;
    //   101: aload_1
    //   102: getstatic 46	ft:j	[I
    //   105: iconst_2
    //   106: iaload
    //   107: aaload
    //   108: invokevirtual 108	java/util/Vector:addElement	(Ljava/lang/Object;)V
    //   111: aload_0
    //   112: getfield 41	ft:e	Ljava/util/Vector;
    //   115: aload_1
    //   116: getstatic 46	ft:j	[I
    //   119: iconst_4
    //   120: iaload
    //   121: aaload
    //   122: invokevirtual 108	java/util/Vector:addElement	(Ljava/lang/Object;)V
    //   125: ldc 2
    //   127: invokevirtual 96	java/lang/String:length	()I
    //   130: pop
    //   131: ldc 3
    //   133: invokevirtual 96	java/lang/String:length	()I
    //   136: ineg
    //   137: ldc 3
    //   139: invokevirtual 96	java/lang/String:length	()I
    //   142: ineg
    //   143: if_icmpeq -73 -> 70
    //   146: return
    //   147: aload_0
    //   148: getfield 52	ft:p	Ljava/io/DataInputStream;
    //   151: invokevirtual 87	java/io/DataInputStream:close	()V
    //   154: aload_0
    //   155: getfield 50	ft:n	Ljava/io/ByteArrayInputStream;
    //   158: invokevirtual 82	java/io/ByteArrayInputStream:close	()V
    //   161: return
    //   162: ldc 2
    //   164: invokevirtual 96	java/lang/String:length	()I
    //   167: pop2
    //   168: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	ft
    //   78	38	1	localObject	Object
    //   162	1	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	161	162	java/lang/Exception
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    if (a(paramCommand, this.f))
    {
      this.c = this.a.getSelectedIndex();
      if (a(this.c, j[0]))
      {
        paramCommand = String.valueOf(this.o.elementAt(this.c));
        paramDisplayable = String.valueOf(this.e.elementAt(this.c));
        df.a("acc", paramCommand);
        df.a("pass", paramDisplayable);
        gb.a(bv.d).a(dm.d());
        new Thread(new fv(paramCommand, paramDisplayable)).start();
      }
    }
    else
    {
      if (a(paramCommand, this.i))
      {
        gb.a(bv.d).a(this.l);
        return;
      }
      if (a(paramCommand, this.k))
      {
        gb.a(bv.d).a(this.a);
        this.r.setString("");
        this.g.setString("");
        return;
      }
      if (a(paramCommand, this.b))
      {
        if ((c(this.r.getString().equals(""))) && (c(this.g.getString().equals(""))))
        {
          this.o.addElement(this.r.getString());
          this.e.addElement(this.g.getString());
          c();
          new StringBuffer();
          "".length();
          gb.a(bv.d).a(this.a);
          this.r.setString("");
          this.g.setString("");
        }
      }
      else
      {
        if (a(paramCommand, this.q))
        {
          if (a(paramCommand = this.a.getSelectedIndex(), j[0]))
          {
            this.o.removeElementAt(paramCommand);
            this.e.removeElementAt(paramCommand);
            this.a.delete(paramCommand);
          }
          c();
          return;
        }
        if (a(paramCommand, this.d)) {
          gb.a(bv.d).a(dm.d());
        }
      }
    }
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt > 0;
  }
  
  public ft()
  {
    "".length();
    this.g = new TextField(new String(new char[] { j[29], j[30], j[13], j[11], j[20], j[5], j[31], j[32] }), "", j[28], j[33]);
    "".length();
    this.b = new Command(new String(new char[] { j[3], j[5], j[7], j[9] }), j[10], j[6]);
    this.l.addCommand(this.b);
    this.k = new Command(new String(new char[] { j[34], j[35], j[36] }), j[6], j[6]);
    this.l.addCommand(this.k);
    this.l.setCommandListener(this);
    e();
    this.a = new gp(new String(new char[] { j[37], j[38], j[27], j[5], j[11], j[39], j[40], j[41], j[5] }), j[8]);
    int i1 = j[2];
    while (c(i1, this.o.size()))
    {
      new StringBuffer();
      "".length();
      "".length();
      if ((0x41 ^ 0x45) < 0) {
        throw null;
      }
    }
    this.i = new Command(new String(new char[] { j[3], j[5], j[7], j[9] }), j[6], j[4]);
    this.a.addCommand(this.i);
    this.f = new Command(new String(new char[] { j[42], j[43], j[27], j[44], j[11], j[27], j[5], j[30], j[45] }), j[10], j[4]);
    this.a.addCommand(this.f);
    this.q = new Command(new String(new char[] { j[46], j[47], j[38] }), j[6], j[6]);
    this.a.addCommand(this.q);
    this.d = new Command(new String(new char[] { j[3], j[5], j[23], j[40], j[13] }), j[6], j[8]);
    this.a.addCommand(this.d);
    this.a.setCommandListener(this);
  }
  
  private static String[] a(String paramString1, String paramString2)
  {
    Vector localVector = new Vector();
    int i1 = paramString1.indexOf(paramString2);
    while (b(i1))
    {
      localVector.addElement(paramString1.substring(j[2], i1));
      i1 = (paramString1 = paramString1.substring(i1 + paramString2.length())).indexOf(paramString2);
      "".length();
      if (null != null) {
        return null;
      }
    }
    localVector.addElement(paramString1);
    String[] arrayOfString = new String[localVector.size()];
    if (a(localVector.size()))
    {
      paramString1 = j[2];
      while (c(paramString1, localVector.size()))
      {
        arrayOfString[paramString1] = ((String)localVector.elementAt(paramString1));
        paramString1++;
        "".length();
        if ((0x84 ^ 0xAA ^ 0x98 ^ 0xB2) == 0) {
          return null;
        }
      }
    }
    return arrayOfString;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt >= 0;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(144);
    a();
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ft.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */