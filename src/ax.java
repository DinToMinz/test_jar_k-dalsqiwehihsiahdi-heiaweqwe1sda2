import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class ax
{
  public static ax a;
  public static ax b;
  public static ax c;
  public static ax d;
  private int u;
  public static ax e;
  public static ax f;
  public static ax g;
  public static ax h;
  private String v;
  private static String w;
  public static ax i;
  public static ax j;
  public static ax k;
  public static ax l;
  public static ax m;
  private Image x;
  private static int[] y;
  public static ax n;
  public static ax o;
  public static ax p;
  private String z;
  public static ax q;
  public static ax r;
  private int aa;
  public static ax s;
  private int[][] ab;
  public static ax t;
  
  /* Error */
  private ax(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 96	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield 68	ax:v	Ljava/lang/String;
    //   9: aload_0
    //   10: iload 4
    //   12: putfield 46	ax:aa	I
    //   15: aload_0
    //   16: aload_2
    //   17: putfield 72	ax:z	Ljava/lang/String;
    //   20: aload_0
    //   21: invokevirtual 79	ax:b	()V
    //   24: new 37	java/io/DataInputStream
    //   27: dup
    //   28: aload_0
    //   29: invokevirtual 97	java/lang/Object:getClass	()Ljava/lang/Class;
    //   32: aload_3
    //   33: invokevirtual 95	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   36: invokespecial 92	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   39: astore_1
    //   40: aload_0
    //   41: aload_1
    //   42: invokevirtual 94	java/io/DataInputStream:readShort	()S
    //   45: anewarray 31	[I
    //   48: putfield 47	ax:ab	[[I
    //   51: getstatic 71	ax:y	[I
    //   54: iconst_0
    //   55: iaload
    //   56: istore_2
    //   57: iload_2
    //   58: aload_0
    //   59: getfield 47	ax:ab	[[I
    //   62: arraylength
    //   63: invokestatic 83	ax:c	(II)Z
    //   66: ifeq +123 -> 189
    //   69: aload_0
    //   70: getfield 47	ax:ab	[[I
    //   73: iload_2
    //   74: getstatic 71	ax:y	[I
    //   77: iconst_1
    //   78: iaload
    //   79: newarray <illegal type>
    //   81: aastore
    //   82: aload_0
    //   83: getfield 47	ax:ab	[[I
    //   86: iload_2
    //   87: aaload
    //   88: getstatic 71	ax:y	[I
    //   91: iconst_0
    //   92: iaload
    //   93: aload_1
    //   94: invokevirtual 94	java/io/DataInputStream:readShort	()S
    //   97: iastore
    //   98: aload_0
    //   99: getfield 47	ax:ab	[[I
    //   102: iload_2
    //   103: aaload
    //   104: getstatic 71	ax:y	[I
    //   107: iconst_2
    //   108: iaload
    //   109: aload_1
    //   110: invokevirtual 94	java/io/DataInputStream:readShort	()S
    //   113: iastore
    //   114: aload_0
    //   115: getfield 47	ax:ab	[[I
    //   118: iload_2
    //   119: aaload
    //   120: getstatic 71	ax:y	[I
    //   123: iconst_3
    //   124: iaload
    //   125: aload_1
    //   126: invokevirtual 94	java/io/DataInputStream:readShort	()S
    //   129: iastore
    //   130: aload_0
    //   131: getfield 47	ax:ab	[[I
    //   134: iload_2
    //   135: aaload
    //   136: getstatic 71	ax:y	[I
    //   139: iconst_4
    //   140: iaload
    //   141: aload_1
    //   142: invokevirtual 94	java/io/DataInputStream:readShort	()S
    //   145: iastore
    //   146: aload_0
    //   147: getfield 47	ax:ab	[[I
    //   150: iload_2
    //   151: aaload
    //   152: getstatic 71	ax:y	[I
    //   155: iconst_4
    //   156: iaload
    //   157: iaload
    //   158: istore_3
    //   159: aload_0
    //   160: iload_3
    //   161: putfield 67	ax:u	I
    //   164: iinc 2 1
    //   167: ldc 1
    //   169: invokevirtual 102	java/lang/String:length	()I
    //   172: pop
    //   173: bipush 42
    //   175: bipush 99
    //   177: ixor
    //   178: bipush 16
    //   180: bipush 93
    //   182: ixor
    //   183: ixor
    //   184: ifge -127 -> 57
    //   187: aconst_null
    //   188: athrow
    //   189: aload_1
    //   190: invokevirtual 93	java/io/DataInputStream:close	()V
    //   193: ldc 1
    //   195: invokevirtual 102	java/lang/String:length	()I
    //   198: pop
    //   199: ldc 4
    //   201: invokevirtual 102	java/lang/String:length	()I
    //   204: ifge +17 -> 221
    //   207: aconst_null
    //   208: athrow
    //   209: ldc 1
    //   211: invokevirtual 102	java/lang/String:length	()I
    //   214: pop2
    //   215: return
    //   216: dup
    //   217: astore_1
    //   218: invokevirtual 109	java/lang/Throwable:printStackTrace	()V
    //   221: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	222	0	this	ax
    //   0	222	1	paramString1	String
    //   0	222	2	paramString2	String
    //   0	222	3	paramString3	String
    //   0	222	4	paramInt	int
    //   209	1	5	localException1	Exception
    //   216	1	6	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   24	193	209	java/lang/Exception
    //   4	215	216	java/lang/Exception
  }
  
  public final void a()
  {
    this.x = null;
  }
  
  public final void b()
  {
    this.x = aw.c(this.z);
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public final ci a(String paramString, int paramInt)
  {
    ci localci = new ci();
    String str = "";
    int i1 = y[0];
    while (c(i1, paramString.length()))
    {
      if (b(paramString.charAt(i1), y[7]))
      {
        localci.addElement(str);
        str = "";
        "".length();
        if ("   ".length() != "   ".length()) {
          return null;
        }
      }
      else
      {
        str = str + paramString.charAt(i1);
        if (d(a(str), paramInt))
        {
          int i2 = str.length() - y[2];
          while ((c(i2)) && (a(str.charAt(i2), y[8])))
          {
            i2--;
            "".length();
            if ("  ".length() <= 0) {
              return null;
            }
          }
          if (b(i2)) {
            i2 = str.length() - y[2];
          }
          localci.addElement(str.substring(y[0], i2));
          i1 = i1 - (str.length() - i2) + y[2];
          str = "";
        }
        if ((b(i1, paramString.length() - y[2])) && (a(str.trim().equals("")))) {
          localci.addElement(str);
        }
      }
      i1++;
      "".length();
      if ("   ".length() <= ((0xAA ^ 0x83 ^ 0xB0 ^ 0xBC) & (0x37 ^ 0x18 ^ 0x89 ^ 0x83 ^ -" ".length()))) {
        return null;
      }
    }
    return localci;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public final String[] b(String paramString, int paramInt)
  {
    paramInt = new String[(paramString = a(paramString, paramInt)).size()];
    int i1 = y[0];
    while (c(i1, paramString.size()))
    {
      paramInt[i1] = paramString.elementAt(i1).toString();
      i1++;
      "".length();
      if ("   ".length() < "  ".length()) {
        return null;
      }
    }
    return paramInt;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public final int c()
  {
    return this.u;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static void d()
  {
    f();
    w = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
    g = new ax(w, "/font/tahoma_7b_red.png", "/font/tahoma_7b", y[0]);
    a = new ax(w, "/font/tahoma_7b_blue.png", "/font/tahoma_7b", y[0]);
    k = new ax(w, "/font/tahoma_7b_purple.png", "/font/tahoma_7b", y[0]);
    h = new ax(w, "/font/tahoma_7b_yellow.png", "/font/tahoma_7b", y[0]);
    n = new ax(w, "/font/tahoma_7b_white.png", "/font/tahoma_7b", y[0]);
    s = new ax(w, "/font/tahoma_7b_green.png", "/font/tahoma_7b", y[0]);
    q = new ax(w, "/font/tahoma_7.png", "/font/tahoma_7", y[0]);
    o = new ax(w, "/font/tahoma_7_blue1.png", "/font/tahoma_7", y[0]);
    t = new ax(w, "/font/tahoma_7_white.png", "/font/tahoma_7", y[0]);
    l = new ax(w, "/font/tahoma_7_yellow.png", "/font/tahoma_7", y[0]);
    p = new ax(w, "/font/tahoma_7_grey.png", "/font/tahoma_7", y[0]);
    r = new ax(w, "/font/tahoma_7_red.png", "/font/tahoma_7", y[0]);
    b = new ax(w, "/font/tahoma_7_blue.png", "/font/tahoma_7", y[0]);
    m = new ax(w, "/font/tahoma_7_green.png", "/font/tahoma_7", y[0]);
    c = new ax(w, "/font/tahoma_8b.png", "/font/tahoma_8b", y[5]);
    j = new ax(" 0123456789+-", "/font/number_yellow.png", "/font/number", y[0]);
    i = new ax(" 0123456789+-", "/font/number_red.png", "/font/number", y[0]);
    d = new ax(" 0123456789+-", "/font/number_green.png", "/font/number", y[0]);
    e = new ax(" 0123456789+-", "/font/number_white.png", "/font/number", y[0]);
    f = new ax(" 0123456789+-", "/font/number_orange.png", "/font/number", y[0]);
  }
  
  static
  {
    cs.a(140);
    d();
  }
  
  public final int a(String paramString)
  {
    int i1 = y[0];
    int i2 = y[0];
    while (c(i2, paramString.length()))
    {
      int i3;
      if (b(i3 = this.v.indexOf(paramString.charAt(i2)), y[5])) {
        i3 = y[0];
      }
      i1 += this.ab[i3][y[3]] + this.aa;
      i2++;
      "".length();
      if (((0xA1 ^ 0xAD) & (0xAC ^ 0xA0 ^ 0xFFFFFFFF)) != 0) {
        return "   ".length() & ("   ".length() ^ 0xFFFFFFFF);
      }
    }
    return i1;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public final void a(cf paramcf, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramString.length();
    if (a(paramInt3))
    {
      paramInt3 = paramInt1;
      "".length();
      if (-"   ".length() < 0) {}
    }
    else if (b(paramInt3, y[2]))
    {
      paramInt3 = paramInt1 - a(paramString);
      "".length();
      if (" ".length() > -" ".length()) {}
    }
    else
    {
      paramInt3 = paramInt1 - (a(paramString) >> y[2]);
    }
    int i2 = y[0];
    while (c(i2, i1))
    {
      if (b(paramInt1 = this.v.indexOf(paramString.charAt(i2)), y[5])) {
        paramInt1 = y[0];
      }
      if (c(paramInt1)) {
        paramcf.a(this.x, this.ab[paramInt1][y[0]], this.ab[paramInt1][y[2]], this.ab[paramInt1][y[3]], this.ab[paramInt1][y[4]], y[0], paramInt3, paramInt2, y[6]);
      }
      paramInt3 += this.ab[paramInt1][y[3]] + this.aa;
      i2++;
      "".length();
      if ("   ".length() <= " ".length()) {}
    }
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static void f()
  {
    y = new int[9];
    y[0] = ((0x66 ^ 0x24) & (0x72 ^ 0x30 ^ 0xFFFFFFFF));
    y[1] = (0xE ^ 0xA);
    y[2] = " ".length();
    y[3] = "  ".length();
    y[4] = "   ".length();
    y[5] = (-" ".length());
    y[6] = ('' + '' - 146 + 26 ^ 91 + '' - 197 + 116);
    y[7] = (0x53 ^ 0x19 ^ 0x5A ^ 0x1A);
    y[8] = (0xB4 ^ 0x8E ^ 0x65 ^ 0x7F);
  }
  
  public final void a(cf paramcf, String paramString, int paramInt1, int paramInt2, int paramInt3, ax paramax)
  {
    int i1 = paramString.length();
    if (a(paramInt3))
    {
      paramInt3 = paramInt1;
      "".length();
      if ("  ".length() < "   ".length()) {}
    }
    else if (b(paramInt3, y[2]))
    {
      paramInt3 = paramInt1 - a(paramString);
      "".length();
      if ((0xEA ^ 0x84 ^ 0x3F ^ 0x55) <= (69 + 51 - -17 + 2 ^ 57 + '' - 173 + 118)) {}
    }
    else
    {
      paramInt3 = paramInt1 - (a(paramString) >> y[2]);
    }
    int i2 = y[0];
    while (c(i2, i1))
    {
      if (b(paramInt1 = this.v.indexOf(paramString.charAt(i2)), y[5])) {
        paramInt1 = y[0];
      }
      if (c(paramInt1))
      {
        paramcf.a(paramax.x, this.ab[paramInt1][y[0]], this.ab[paramInt1][y[2]], this.ab[paramInt1][y[3]], this.ab[paramInt1][y[4]], y[0], paramInt3 + y[2], paramInt2, y[6]);
        paramcf.a(paramax.x, this.ab[paramInt1][y[0]], this.ab[paramInt1][y[2]], this.ab[paramInt1][y[3]], this.ab[paramInt1][y[4]], y[0], paramInt3, paramInt2 + y[2], y[6]);
        paramcf.a(this.x, this.ab[paramInt1][y[0]], this.ab[paramInt1][y[2]], this.ab[paramInt1][y[3]], this.ab[paramInt1][y[4]], y[0], paramInt3, paramInt2, y[6]);
      }
      paramInt3 += this.ab[paramInt1][y[3]] + this.aa;
      i2++;
      "".length();
      if (-(0x68 ^ 0x6C) > 0) {}
    }
  }
  
  public static void e() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ax.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */