import java.io.InputStream;

public final class df
{
  public int a;
  public int b;
  public static int c;
  private static int[] l;
  public int d;
  public String e;
  public static long f;
  public int g;
  public int h;
  public at i;
  public int j;
  public static boolean k;
  
  /* Error */
  public static df a(at paramat, String paramString)
  {
    // Byte code:
    //   0: new 22	df
    //   3: dup
    //   4: invokespecial 45	df:<init>	()V
    //   7: dup
    //   8: astore_2
    //   9: aload_0
    //   10: putfield 41	df:i	Lat;
    //   13: aload_1
    //   14: ldc 2
    //   16: invokestatic 56	dn:a	(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    //   19: astore_0
    //   20: aload_2
    //   21: aload_0
    //   22: getstatic 43	df:l	[I
    //   25: iconst_0
    //   26: iaload
    //   27: aaload
    //   28: putfield 38	df:e	Ljava/lang/String;
    //   31: aload_2
    //   32: aload_0
    //   33: getstatic 43	df:l	[I
    //   36: iconst_1
    //   37: iaload
    //   38: aaload
    //   39: invokestatic 61	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   42: putfield 42	df:j	I
    //   45: aload_2
    //   46: aload_0
    //   47: getstatic 43	df:l	[I
    //   50: iconst_2
    //   51: iaload
    //   52: aaload
    //   53: invokestatic 61	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   56: putfield 36	df:b	I
    //   59: aload_2
    //   60: aload_0
    //   61: getstatic 43	df:l	[I
    //   64: iconst_3
    //   65: iaload
    //   66: aaload
    //   67: invokestatic 61	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   70: putfield 39	df:g	I
    //   73: ldc 1
    //   75: invokevirtual 67	java/lang/String:length	()I
    //   78: pop
    //   79: bipush 27
    //   81: bipush 96
    //   83: ixor
    //   84: sipush 140
    //   87: sipush 166
    //   90: ixor
    //   91: ixor
    //   92: sipush 205
    //   95: bipush 34
    //   97: iadd
    //   98: bipush 100
    //   100: isub
    //   101: bipush 87
    //   103: iadd
    //   104: sipush 135
    //   107: iconst_0
    //   108: iadd
    //   109: bipush -6
    //   111: isub
    //   112: bipush 38
    //   114: iadd
    //   115: ixor
    //   116: ldc 2
    //   118: invokevirtual 67	java/lang/String:length	()I
    //   121: ineg
    //   122: ixor
    //   123: iand
    //   124: sipush 146
    //   127: sipush 198
    //   130: ixor
    //   131: bipush 20
    //   133: bipush 117
    //   135: ixor
    //   136: ixor
    //   137: bipush 113
    //   139: bipush 109
    //   141: ixor
    //   142: bipush 103
    //   144: bipush 78
    //   146: ixor
    //   147: ixor
    //   148: ldc 2
    //   150: invokevirtual 67	java/lang/String:length	()I
    //   153: ineg
    //   154: ixor
    //   155: iand
    //   156: if_icmpeq +29 -> 185
    //   159: aconst_null
    //   160: areturn
    //   161: ldc 1
    //   163: invokevirtual 67	java/lang/String:length	()I
    //   166: pop2
    //   167: aload_2
    //   168: getstatic 43	df:l	[I
    //   171: iconst_0
    //   172: iaload
    //   173: putfield 35	df:a	I
    //   176: aload_2
    //   177: getstatic 43	df:l	[I
    //   180: iconst_0
    //   181: iaload
    //   182: putfield 40	df:h	I
    //   185: aload_2
    //   186: aload_0
    //   187: getstatic 43	df:l	[I
    //   190: iconst_4
    //   191: iaload
    //   192: aaload
    //   193: invokestatic 61	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   196: putfield 35	df:a	I
    //   199: aload_2
    //   200: aload_0
    //   201: getstatic 43	df:l	[I
    //   204: iconst_5
    //   205: iaload
    //   206: aaload
    //   207: invokestatic 61	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   210: putfield 40	df:h	I
    //   213: aload_2
    //   214: aload_0
    //   215: getstatic 43	df:l	[I
    //   218: bipush 6
    //   220: iaload
    //   221: aaload
    //   222: invokestatic 61	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   225: putfield 37	df:d	I
    //   228: ldc 1
    //   230: invokevirtual 67	java/lang/String:length	()I
    //   233: pop
    //   234: bipush 64
    //   236: bipush 69
    //   238: ixor
    //   239: ifgt +29 -> 268
    //   242: aconst_null
    //   243: areturn
    //   244: ldc 1
    //   246: invokevirtual 67	java/lang/String:length	()I
    //   249: pop2
    //   250: aload_2
    //   251: getstatic 43	df:l	[I
    //   254: iconst_0
    //   255: iaload
    //   256: putfield 35	df:a	I
    //   259: aload_2
    //   260: getstatic 43	df:l	[I
    //   263: iconst_0
    //   264: iaload
    //   265: putfield 40	df:h	I
    //   268: aload_2
    //   269: getfield 36	df:b	I
    //   272: invokestatic 51	df:b	(I)Z
    //   275: ifeq +15 -> 290
    //   278: aload_2
    //   279: getfield 40	df:h	I
    //   282: invokestatic 51	df:b	(I)Z
    //   285: ifeq +5 -> 290
    //   288: aconst_null
    //   289: areturn
    //   290: aload_2
    //   291: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	292	0	paramat	at
    //   0	292	1	paramString	String
    //   8	283	2	localdf	df
    //   161	1	3	localException1	Exception
    //   244	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   31	73	161	java/lang/Exception
    //   185	228	244	java/lang/Exception
  }
  
  public final String a()
  {
    return this.e + " " + this.j + " " + this.b + " " + this.g + " " + this.a + " " + this.h + " " + this.d;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt > 0;
  }
  
  /* Error */
  public static void a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 31	java/lang/StringBuffer
    //   3: dup
    //   4: ldc 19
    //   6: invokespecial 69	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   9: aload_0
    //   10: invokevirtual 71	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   13: invokevirtual 72	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   16: getstatic 43	df:l	[I
    //   19: iconst_1
    //   20: iaload
    //   21: invokestatic 59	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   24: dup
    //   25: astore_0
    //   26: invokevirtual 76	javax/microedition/rms/RecordStore:getNumRecords	()I
    //   29: invokestatic 46	df:a	(I)Z
    //   32: ifeq +85 -> 117
    //   35: aload_0
    //   36: getstatic 43	df:l	[I
    //   39: iconst_1
    //   40: iaload
    //   41: aload_1
    //   42: getstatic 43	df:l	[I
    //   45: iconst_0
    //   46: iaload
    //   47: aload_1
    //   48: arraylength
    //   49: invokevirtual 78	javax/microedition/rms/RecordStore:setRecord	(I[BII)V
    //   52: ldc 1
    //   54: invokevirtual 67	java/lang/String:length	()I
    //   57: pop
    //   58: ldc 4
    //   60: invokevirtual 67	java/lang/String:length	()I
    //   63: sipush 209
    //   66: sipush 153
    //   69: ixor
    //   70: sipush 150
    //   73: sipush 130
    //   76: ixor
    //   77: ixor
    //   78: bipush 56
    //   80: bipush 14
    //   82: iadd
    //   83: bipush 69
    //   85: isub
    //   86: sipush 229
    //   89: iadd
    //   90: sipush 143
    //   93: sipush 172
    //   96: iadd
    //   97: sipush 200
    //   100: isub
    //   101: bipush 71
    //   103: iadd
    //   104: ixor
    //   105: ldc 2
    //   107: invokevirtual 67	java/lang/String:length	()I
    //   110: ineg
    //   111: ixor
    //   112: iand
    //   113: if_icmpgt +22 -> 135
    //   116: return
    //   117: aload_0
    //   118: aload_1
    //   119: getstatic 43	df:l	[I
    //   122: iconst_0
    //   123: iaload
    //   124: aload_1
    //   125: arraylength
    //   126: invokevirtual 74	javax/microedition/rms/RecordStore:addRecord	([BII)I
    //   129: ldc 1
    //   131: invokevirtual 67	java/lang/String:length	()I
    //   134: pop2
    //   135: aload_0
    //   136: invokevirtual 75	javax/microedition/rms/RecordStore:closeRecordStore	()V
    //   139: return
    //   140: ldc 1
    //   142: invokevirtual 67	java/lang/String:length	()I
    //   145: pop2
    //   146: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	paramString	String
    //   0	147	1	paramArrayOfByte	byte[]
    //   140	1	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	139	140	java/lang/Exception
  }
  
  public static void b() {}
  
  static
  {
    cs.a(25);
    b();
  }
  
  private static void h()
  {
    l = new int[8];
    l[0] = ((0x81 ^ 0xAB) & (0x46 ^ 0x6C ^ 0xFFFFFFFF));
    l[1] = " ".length();
    l[2] = "  ".length();
    l[3] = "   ".length();
    l[4] = (0x75 ^ 0x71);
    l[5] = (0x3D ^ 0x38);
    l[6] = (0x8E ^ 0x88);
    l[7] = (-" ".length());
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static InputStream a(String paramString)
  {
    return "".getClass().getResourceAsStream(paramString);
  }
  
  public final int c()
  {
    if ((a(this.b)) && (b(dt.b(this.i.f), this.g))) {
      return dt.b(this.i.f) - this.g;
    }
    return l[0];
  }
  
  /* Error */
  private static void e(String paramString)
  {
    // Byte code:
    //   0: new 31	java/lang/StringBuffer
    //   3: dup
    //   4: ldc 19
    //   6: invokespecial 69	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   9: aload_0
    //   10: invokevirtual 71	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   13: invokevirtual 72	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   16: invokestatic 58	gk:b	(Ljava/lang/String;)V
    //   19: return
    //   20: ldc 1
    //   22: invokevirtual 67	java/lang/String:length	()I
    //   25: pop2
    //   26: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	paramString	String
    //   20	1	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	19	20	java/lang/Exception
  }
  
  /* Error */
  public static byte[] b(String paramString)
  {
    // Byte code:
    //   0: new 31	java/lang/StringBuffer
    //   3: dup
    //   4: ldc 19
    //   6: invokespecial 69	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   9: aload_0
    //   10: invokevirtual 71	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   13: invokevirtual 72	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   16: getstatic 43	df:l	[I
    //   19: iconst_0
    //   20: iaload
    //   21: invokestatic 59	gk:b	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   24: dup
    //   25: astore_0
    //   26: getstatic 43	df:l	[I
    //   29: iconst_1
    //   30: iaload
    //   31: invokevirtual 77	javax/microedition/rms/RecordStore:getRecord	(I)[B
    //   34: astore_1
    //   35: aload_0
    //   36: invokevirtual 75	javax/microedition/rms/RecordStore:closeRecordStore	()V
    //   39: aload_1
    //   40: areturn
    //   41: ldc 1
    //   43: invokevirtual 67	java/lang/String:length	()I
    //   46: pop2
    //   47: aconst_null
    //   48: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	paramString	String
    //   34	6	1	arrayOfByte	byte[]
    //   41	1	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	40	41	java/lang/Exception
  }
  
  public static int c(String paramString)
  {
    if (a(paramString = b(paramString))) {
      return l[7];
    }
    return paramString[l[0]];
  }
  
  public final boolean d()
  {
    if ((a(this.b)) && (b(dt.b(this.i.f), this.g))) {
      return l[1];
    }
    return l[0];
  }
  
  /* Error */
  public static void a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getstatic 43	df:l	[I
    //   4: iconst_1
    //   5: iaload
    //   6: newarray <illegal type>
    //   8: dup
    //   9: getstatic 43	df:l	[I
    //   12: iconst_0
    //   13: iaload
    //   14: iload_1
    //   15: i2b
    //   16: bastore
    //   17: invokestatic 49	df:a	(Ljava/lang/String;[B)V
    //   20: return
    //   21: ldc 1
    //   23: invokevirtual 67	java/lang/String:length	()I
    //   26: pop2
    //   27: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	paramString	String
    //   0	28	1	paramInt	int
    //   21	1	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	20	21	java/lang/Exception
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static void a(String paramString1, String paramString2)
  {
    try
    {
      a(paramString1, paramString2.getBytes("UTF-8"));
      return;
    }
    catch (Exception localException)
    {
      (paramString1 = localException).printStackTrace();
    }
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  /* Error */
  public static String d(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 53	df:b	(Ljava/lang/String;)[B
    //   4: dup
    //   5: astore_0
    //   6: invokestatic 48	df:a	(Ljava/lang/Object;)Z
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: new 30	java/lang/String
    //   17: dup
    //   18: aload_0
    //   19: ldc 5
    //   21: invokespecial 65	java/lang/String:<init>	([BLjava/lang/String;)V
    //   24: areturn
    //   25: ldc 1
    //   27: invokevirtual 67	java/lang/String:length	()I
    //   30: pop2
    //   31: new 30	java/lang/String
    //   34: dup
    //   35: aload_0
    //   36: invokespecial 64	java/lang/String:<init>	([B)V
    //   39: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	paramString	String
    //   25	1	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   14	24	25	java/lang/Exception
  }
  
  public final boolean e()
  {
    if ((a(this.h)) && (a(dt.b(this.i.f), this.d))) {
      return l[1];
    }
    return l[0];
  }
  
  public static void f()
  {
    e("nj_arrow");
    e("nj_effect");
    e("nj_image");
    e("nj_part");
    e("nj_skill");
    e("data");
    e("dataVersion");
    e("map");
    e("mapVersion");
    e("skill");
    e("killVersion");
    e("item");
    e("itemVersion");
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public static void g() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\df.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */