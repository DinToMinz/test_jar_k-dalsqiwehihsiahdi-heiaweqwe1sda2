import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import javax.microedition.io.Connection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;

public final class ep
{
  public static byte[] a;
  public static int[] b;
  public static int[] c;
  public static String[] d;
  private static int[] f;
  private static String g;
  public static String[] e;
  
  private static void e()
  {
    f = new int[59];
    f[0] = ((0x2B ^ 0x5A) + (114 + 109 - 63 + 36) - (70 + 60 - -49 + 7) + (0xE1 ^ 0xAC));
    f[1] = (0xA9ED & 0x5712);
    f[2] = (-" ".length());
    f[3] = ((0x22 ^ 0x40 ^ 0xCB ^ 0xAF) & (0xC3 ^ 0x81 ^ 0x71 ^ 0x35 ^ -" ".length()));
    f[4] = (0xDF ^ 0xAC ^ 0x33 ^ 0x66);
    f[5] = (0xFC ^ 0xAB ^ 0x3A ^ 0x5);
    f[6] = " ".length();
    f[7] = ('é' + 'µ' - 303 + 128 ^ 126 + 77 - 92 + 44);
    f[8] = "  ".length();
    f[9] = "   ".length();
    f[10] = (0xFC ^ 0x8C);
    f[11] = (0xCD ^ 0x8F ^ 0x16 ^ 0x50);
    f[12] = (0x20 ^ 0x1A);
    f[13] = (7 + 106 - 39 + 121 ^ 72 + 123 - 131 + 134);
    f[14] = (0xA5 ^ 0x8A);
    f[15] = (0x9A ^ 0x9C);
    f[16] = (0x4A ^ 0x61 ^ 0x80 ^ 0xAC);
    f[17] = (0x66 ^ 0x43 ^ 0x37 ^ 0x71);
    f[18] = (0x72 ^ 0x7A);
    f[19] = (53 + 82 - 95 + 180 ^ '' + 74 - 68 + 33);
    f[20] = (17 + 76 - 84 + 122 ^ 15 + 40 - -29 + 54);
    f[21] = (0xE ^ 0x61);
    f[22] = (0x47 ^ 0x4D);
    f[23] = (0x74 ^ 0x1A);
    f[24] = (0x6F ^ 0x64);
    f[25] = (13 + 72 - 53 + 95 ^ 0x5 ^ 0x1D);
    f[26] = (0xEE ^ 0x8E ^ 0xE9 ^ 0x85);
    f[27] = (0x24 ^ 0x4F);
    f[28] = ("  ".length() ^ 0xAE ^ 0xA1);
    f[29] = (0x7E ^ 0x4F ^ 0x88 ^ 0xB7);
    f[30] = (0x66 ^ 0x7B ^ 0x71 ^ 0x63);
    f[31] = (0x83 ^ 0xA0 ^ 0xC1 ^ 0x8B);
    f[32] = (0x75 ^ 0x65);
    f[33] = (0xE7 ^ 0x86);
    f[34] = (0x74 ^ 0x65);
    f[35] = (0x6B ^ 0x79);
    f[36] = (0x75 ^ 0x5B);
    f[37] = (0xB8 ^ 0xAB);
    f[38] = (0x2D ^ 0x39);
    f[39] = (0xD2 ^ 0xB6);
    f[40] = (0xB5 ^ 0xA0);
    f[41] = (0x33 ^ 0x25);
    f[42] = (0x52 ^ 0x1C ^ 0x2D ^ 0x15);
    f[43] = (0x22 ^ 0x53 ^ 0x5A ^ 0x3C);
    f[44] = (0x57 ^ 0x4F);
    f[45] = (0x2F ^ 0x70 ^ 0x85 ^ 0xC3);
    f[46] = (0x3F ^ 0xA ^ 0x82 ^ 0xAD);
    f[47] = (0x60 ^ 0x13);
    f[48] = (0xB4 ^ 0xAF);
    f[49] = ('' + 114 - 202 + 180 ^ '¥' + '' - 177 + 66);
    f[50] = ('¨' + '' - 189 + 53 ^ 2 + '¡' - 25 + 42);
    f[51] = (0x9E ^ 0x80);
    f[52] = (0x3A ^ 0x25);
    f[53] = (0x92 ^ 0xB2);
    f[54] = (0x4 ^ 0x66 ^ 0xF7 ^ 0xB4);
    f[55] = (0x49 ^ 0x34 ^ 0x5A ^ 0x5);
    f[56] = (0x87 ^ 0xA4);
    f[57] = (0x2E ^ 0x69 ^ 0x6E ^ 0xD);
    f[58] = (37 + 78 - 11 + 27 ^ 63 + 79 - 70 + 94);
  }
  
  private static String a(String paramString)
  {
    Object localObject = new StringBuffer();
    HttpConnection localHttpConnection = null;
    InputStream localInputStream = null;
    InputStreamReader localInputStreamReader = null;
    try
    {
      if (a((localHttpConnection = (HttpConnection)gi.e(paramString)).getResponseCode(), f[0])) {
        throw new IOException(localHttpConnection.getResponseMessage());
      }
      localInputStream = localHttpConnection.openInputStream();
      localInputStreamReader = new InputStreamReader(localInputStream, "UTF-8");
      char[] arrayOfChar = new char[f[1]];
      while (a(paramString = localInputStreamReader.read(arrayOfChar), f[2]))
      {
        "".length();
        "".length();
        if ("   ".length() <= -" ".length()) {
          return null;
        }
      }
      try
      {
        localInputStreamReader.close();
        if (a(localInputStream)) {
          localInputStream.close();
        }
        if (a(localHttpConnection)) {
          localHttpConnection.close();
        }
        "".length();
        if ((0x2E ^ 0x2A) > -" ".length()) {
          break label342;
        }
        return null;
      }
      catch (IOException localIOException1)
      {
        (paramString = localIOException1).printStackTrace();
        "".length();
        if (-" ".length() < 0) {
          break label342;
        }
      }
      return null;
    }
    catch (Exception localException)
    {
      try
      {
        if (a(localInputStreamReader)) {
          localInputStreamReader.close();
        }
        if (a(localInputStream)) {
          localInputStream.close();
        }
        if (a(localHttpConnection)) {
          localHttpConnection.close();
        }
        "".length();
        if (-" ".length() > 0) {
          return null;
        }
      }
      catch (IOException localIOException2)
      {
        (paramString = localIOException2).printStackTrace();
      }
      return null;
    }
    finally
    {
      try
      {
        if (a(localInputStreamReader)) {
          localInputStreamReader.close();
        }
        if (a(localInputStream)) {
          localInputStream.close();
        }
        if (a(localHttpConnection)) {
          localHttpConnection.close();
        }
        "".length();
        if (" ".length() == 0) {
          return null;
        }
      }
      catch (IOException localIOException3)
      {
        (localObject = localIOException3).printStackTrace();
      }
    }
    label342:
    return ((StringBuffer)localObject).toString();
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static void f()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      int i = e.length;
      localDataOutputStream.writeInt(i);
      int j = f[3];
      while (b(j, i))
      {
        localDataOutputStream.writeUTF(d[j]);
        localDataOutputStream.writeUTF(e[j]);
        localDataOutputStream.writeInt(c[j]);
        localDataOutputStream.writeByte(a[j]);
        j++;
        "".length();
        if (-"   ".length() > 0) {
          return;
        }
      }
      localDataOutputStream.flush();
      localByteArrayOutputStream.flush();
      df.a("abcdip", localByteArrayOutputStream.toByteArray());
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static String[] a(String paramString1, String paramString2, int paramInt)
  {
    int i;
    if (c(i = paramString1.indexOf(paramString2)))
    {
      paramString2 = a(paramString1.substring(i + paramString2.length()), paramString2, paramInt + f[6]);
      "".length();
      if (-" ".length() >= "   ".length()) {
        return null;
      }
    }
    else
    {
      paramString2 = new String[paramInt + f[6]];
      i = paramString1.length();
    }
    paramString2[paramInt] = paramString1.substring(f[3], i);
    return paramString2;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static void a()
  {
    e();
    g = "Trường Học Ninja:127.0.0.1:0:0";
  }
  
  static
  {
    cs.a(18);
    a();
  }
  
  /* Error */
  public static void b()
  {
    // Byte code:
    //   0: new 14	java/io/ByteArrayInputStream
    //   3: dup
    //   4: ldc 9
    //   6: invokestatic 42	df:b	(Ljava/lang/String;)[B
    //   9: invokespecial 55	java/io/ByteArrayInputStream:<init>	([B)V
    //   12: astore_0
    //   13: new 16	java/io/DataInputStream
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 60	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   21: astore_1
    //   22: aload_0
    //   23: invokevirtual 56	java/io/ByteArrayInputStream:available	()I
    //   26: invokestatic 49	ep:b	(I)Z
    //   29: ifeq +119 -> 148
    //   32: aload_1
    //   33: invokevirtual 63	java/io/DataInputStream:readInt	()I
    //   36: dup
    //   37: istore_2
    //   38: anewarray 27	java/lang/String
    //   41: putstatic 36	ep:d	[Ljava/lang/String;
    //   44: iload_2
    //   45: anewarray 27	java/lang/String
    //   48: putstatic 37	ep:e	[Ljava/lang/String;
    //   51: iload_2
    //   52: newarray <illegal type>
    //   54: putstatic 35	ep:c	[I
    //   57: iload_2
    //   58: newarray <illegal type>
    //   60: putstatic 33	ep:a	[B
    //   63: iload_2
    //   64: newarray <illegal type>
    //   66: putstatic 34	ep:b	[I
    //   69: getstatic 38	ep:f	[I
    //   72: iconst_3
    //   73: iaload
    //   74: istore_3
    //   75: iload_3
    //   76: iload_2
    //   77: invokestatic 50	ep:b	(II)Z
    //   80: ifeq +59 -> 139
    //   83: getstatic 36	ep:d	[Ljava/lang/String;
    //   86: iload_3
    //   87: aload_1
    //   88: invokevirtual 64	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   91: aastore
    //   92: getstatic 37	ep:e	[Ljava/lang/String;
    //   95: iload_3
    //   96: aload_1
    //   97: invokevirtual 64	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   100: aastore
    //   101: getstatic 35	ep:c	[I
    //   104: iload_3
    //   105: aload_1
    //   106: invokevirtual 63	java/io/DataInputStream:readInt	()I
    //   109: iastore
    //   110: getstatic 33	ep:a	[B
    //   113: iload_3
    //   114: aload_1
    //   115: invokevirtual 62	java/io/DataInputStream:readByte	()B
    //   118: bastore
    //   119: getstatic 34	ep:b	[I
    //   122: iload_3
    //   123: iload_3
    //   124: iastore
    //   125: iinc 3 1
    //   128: ldc 1
    //   130: invokevirtual 81	java/lang/String:length	()I
    //   133: pop
    //   134: aconst_null
    //   135: ifnull -60 -> 75
    //   138: return
    //   139: aload_0
    //   140: invokevirtual 57	java/io/ByteArrayInputStream:close	()V
    //   143: aload_1
    //   144: invokevirtual 61	java/io/DataInputStream:close	()V
    //   147: return
    //   148: ldc 1
    //   150: invokevirtual 81	java/lang/String:length	()I
    //   153: pop
    //   154: ldc 4
    //   156: invokevirtual 81	java/lang/String:length	()I
    //   159: iconst_0
    //   160: bipush 59
    //   162: ixor
    //   163: sipush 255
    //   166: sipush 192
    //   169: ixor
    //   170: ixor
    //   171: if_icmplt +10 -> 181
    //   174: return
    //   175: ldc 1
    //   177: invokevirtual 81	java/lang/String:length	()I
    //   180: pop2
    //   181: getstatic 39	ep:g	Ljava/lang/String;
    //   184: invokevirtual 84	java/lang/String:trim	()Ljava/lang/String;
    //   187: ldc 5
    //   189: getstatic 38	ep:f	[I
    //   192: iconst_3
    //   193: iaload
    //   194: invokestatic 48	ep:a	(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;
    //   197: dup
    //   198: astore_0
    //   199: arraylength
    //   200: anewarray 27	java/lang/String
    //   203: putstatic 36	ep:d	[Ljava/lang/String;
    //   206: aload_0
    //   207: arraylength
    //   208: anewarray 27	java/lang/String
    //   211: putstatic 37	ep:e	[Ljava/lang/String;
    //   214: aload_0
    //   215: arraylength
    //   216: newarray <illegal type>
    //   218: putstatic 35	ep:c	[I
    //   221: aload_0
    //   222: arraylength
    //   223: newarray <illegal type>
    //   225: putstatic 33	ep:a	[B
    //   228: aload_0
    //   229: arraylength
    //   230: newarray <illegal type>
    //   232: putstatic 34	ep:b	[I
    //   235: getstatic 38	ep:f	[I
    //   238: iconst_3
    //   239: iaload
    //   240: istore_1
    //   241: iload_1
    //   242: aload_0
    //   243: arraylength
    //   244: invokestatic 50	ep:b	(II)Z
    //   247: ifeq +97 -> 344
    //   250: aload_0
    //   251: iload_1
    //   252: aaload
    //   253: invokevirtual 84	java/lang/String:trim	()Ljava/lang/String;
    //   256: ldc 6
    //   258: getstatic 38	ep:f	[I
    //   261: iconst_3
    //   262: iaload
    //   263: invokestatic 48	ep:a	(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;
    //   266: astore_2
    //   267: getstatic 36	ep:d	[Ljava/lang/String;
    //   270: iload_1
    //   271: aload_2
    //   272: getstatic 38	ep:f	[I
    //   275: iconst_3
    //   276: iaload
    //   277: aaload
    //   278: aastore
    //   279: getstatic 37	ep:e	[Ljava/lang/String;
    //   282: iload_1
    //   283: aload_2
    //   284: getstatic 38	ep:f	[I
    //   287: bipush 6
    //   289: iaload
    //   290: aaload
    //   291: aastore
    //   292: getstatic 35	ep:c	[I
    //   295: iload_1
    //   296: aload_2
    //   297: getstatic 38	ep:f	[I
    //   300: bipush 8
    //   302: iaload
    //   303: aaload
    //   304: invokestatic 77	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   307: iastore
    //   308: getstatic 33	ep:a	[B
    //   311: iload_1
    //   312: aload_2
    //   313: getstatic 38	ep:f	[I
    //   316: bipush 9
    //   318: iaload
    //   319: aaload
    //   320: invokestatic 76	java/lang/Byte:parseByte	(Ljava/lang/String;)B
    //   323: bastore
    //   324: getstatic 34	ep:b	[I
    //   327: iload_1
    //   328: iload_1
    //   329: iastore
    //   330: iinc 1 1
    //   333: ldc 1
    //   335: invokevirtual 81	java/lang/String:length	()I
    //   338: pop
    //   339: aconst_null
    //   340: ifnull -99 -> 241
    //   343: return
    //   344: invokestatic 53	ep:f	()V
    //   347: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   12	239	0	localObject	Object
    //   21	123	1	localDataInputStream	java.io.DataInputStream
    //   240	89	1	i	int
    //   37	40	2	j	int
    //   266	47	2	arrayOfString	String[]
    //   74	52	3	k	int
    //   175	1	6	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	147	175	java/lang/Exception
  }
  
  public static boolean c()
  {
    Object localObject;
    if (a((localObject = a(new String(new char[] { f[5], f[7], f[7], f[10], f[12], f[14], f[14], f[17], f[19], f[21], f[23], f[25], f[27], f[21], f[25], f[31], f[33], f[19], f[36], f[31], f[39], f[36], f[42], f[23], f[14], f[23], f[47], f[21], f[14], f[31], f[10], f[7], f[19], f[21], f[31], f[7], f[5], f[21] }))).equals(""))) {
      return f[3];
    }
    d = new String[(localObject = a(((String)localObject).trim(), ",", f[3])).length];
    e = new String[localObject.length];
    c = new int[localObject.length];
    a = new byte[localObject.length];
    b = new int[localObject.length];
    int i = f[3];
    while (b(i, localObject.length))
    {
      String[] arrayOfString = a(localObject[i].trim(), ":", f[3]);
      d[i] = arrayOfString[f[3]];
      e[i] = arrayOfString[f[6]];
      c[i] = Integer.parseInt(arrayOfString[f[8]]);
      a[i] = Byte.parseByte(arrayOfString[f[9]]);
      b[i] = i;
      i++;
      "".length();
      if (-" ".length() > ((0xF0 ^ 0x80 ^ 0x5E ^ 0x68) & (0xED ^ 0x99 ^ 0x11 ^ 0x23 ^ -" ".length()))) {
        return (0x60 ^ 0x27 ^ 0x76 ^ 0x1D) & (101 + 76 - 161 + 169 ^ 32 + 77 - 97 + 137 ^ -" ".length());
      }
    }
    f();
    return f[6];
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ep.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */