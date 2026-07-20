import javax.microedition.lcdui.Image;

public final class dq
{
  private static Image[] f;
  public short a;
  private static ex g;
  public static int[][] b;
  public short c;
  public short d;
  public short e;
  private static int[] h;
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static int b(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public dq(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e = ((short)paramInt1);
    this.a = ((short)paramInt2);
    this.d = ((short)paramInt3);
    this.c = ((short)paramInt4);
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void a()
  {
    h();
    g = new ex();
  }
  
  static
  {
    cs.a(52);
    a();
  }
  
  public dq()
  {
    g();
  }
  
  public static void a(int paramInt, byte[] paramArrayOfByte)
  {
    dz localdz;
    if (b(localdz = (dz)g.get(String.valueOf(paramInt))))
    {
      localdz = new dz();
      "".length();
    }
    localdz.c = paramInt;
    localdz.e = cu.a(paramArrayOfByte);
    if (a(bv.j, h[2])) {
      df.a(String.valueOf(paramInt), paramArrayOfByte);
    }
  }
  
  /* Error */
  public static void b()
  {
    // Byte code:
    //   0: getstatic 48	dq:g	Lex;
    //   3: invokevirtual 99	java/util/Hashtable:keys	()Ljava/util/Enumeration;
    //   6: astore_0
    //   7: aload_0
    //   8: invokeinterface 103 1 0
    //   13: invokestatic 77	dq:e	(I)Z
    //   16: ifeq +73 -> 89
    //   19: aload_0
    //   20: invokeinterface 104 1 0
    //   25: checkcast 29	java/lang/String
    //   28: astore_1
    //   29: getstatic 48	dq:g	Lex;
    //   32: aload_1
    //   33: invokevirtual 82	ex:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast 23	dz
    //   39: astore_2
    //   40: invokestatic 97	java/lang/System:currentTimeMillis	()J
    //   43: aload_2
    //   44: getfield 51	dz:b	J
    //   47: lsub
    //   48: ldc2_w 37
    //   51: invokestatic 73	dq:c	(JJ)I
    //   54: invokestatic 71	dq:c	(I)Z
    //   57: ifeq +16 -> 73
    //   60: getstatic 48	dq:g	Lex;
    //   63: aload_1
    //   64: invokevirtual 84	ex:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   67: ldc 2
    //   69: invokevirtual 90	java/lang/String:length	()I
    //   72: pop2
    //   73: ldc 2
    //   75: invokevirtual 90	java/lang/String:length	()I
    //   78: pop
    //   79: ldc 3
    //   81: invokevirtual 90	java/lang/String:length	()I
    //   84: ineg
    //   85: iflt -78 -> 7
    //   88: return
    //   89: return
    //   90: ldc 2
    //   92: invokevirtual 90	java/lang/String:length	()I
    //   95: pop2
    //   96: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   6	14	0	localEnumeration	java.util.Enumeration
    //   28	36	1	str	String
    //   39	5	2	localdz	dz
    //   90	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	89	90	java/lang/Exception
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  /* Error */
  private static void g()
  {
    // Byte code:
    //   0: new 26	java/io/DataInputStream
    //   3: dup
    //   4: new 25	java/io/ByteArrayInputStream
    //   7: dup
    //   8: ldc 13
    //   10: invokestatic 60	df:b	(Ljava/lang/String;)[B
    //   13: invokespecial 85	java/io/ByteArrayInputStream:<init>	([B)V
    //   16: invokespecial 86	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   19: dup
    //   20: astore_0
    //   21: invokevirtual 87	java/io/DataInputStream:readShort	()S
    //   24: dup
    //   25: istore_1
    //   26: getstatic 49	dq:h	[I
    //   29: iconst_0
    //   30: iaload
    //   31: multianewarray 14 2
    //   35: putstatic 43	dq:b	[[I
    //   38: getstatic 49	dq:h	[I
    //   41: iconst_1
    //   42: iaload
    //   43: istore_2
    //   44: iload_2
    //   45: iload_1
    //   46: invokestatic 68	dq:b	(II)Z
    //   49: ifeq +117 -> 166
    //   52: getstatic 43	dq:b	[[I
    //   55: iload_2
    //   56: aaload
    //   57: getstatic 49	dq:h	[I
    //   60: iconst_1
    //   61: iaload
    //   62: aload_0
    //   63: invokevirtual 88	java/io/DataInputStream:readUnsignedByte	()I
    //   66: iastore
    //   67: getstatic 43	dq:b	[[I
    //   70: iload_2
    //   71: aaload
    //   72: getstatic 49	dq:h	[I
    //   75: iconst_2
    //   76: iaload
    //   77: aload_0
    //   78: invokevirtual 87	java/io/DataInputStream:readShort	()S
    //   81: iastore
    //   82: getstatic 43	dq:b	[[I
    //   85: iload_2
    //   86: aaload
    //   87: getstatic 49	dq:h	[I
    //   90: iconst_3
    //   91: iaload
    //   92: aload_0
    //   93: invokevirtual 87	java/io/DataInputStream:readShort	()S
    //   96: iastore
    //   97: getstatic 43	dq:b	[[I
    //   100: iload_2
    //   101: aaload
    //   102: getstatic 49	dq:h	[I
    //   105: iconst_4
    //   106: iaload
    //   107: aload_0
    //   108: invokevirtual 87	java/io/DataInputStream:readShort	()S
    //   111: iastore
    //   112: getstatic 43	dq:b	[[I
    //   115: iload_2
    //   116: aaload
    //   117: getstatic 49	dq:h	[I
    //   120: iconst_5
    //   121: iaload
    //   122: aload_0
    //   123: invokevirtual 87	java/io/DataInputStream:readShort	()S
    //   126: iastore
    //   127: iinc 2 1
    //   130: ldc 2
    //   132: invokevirtual 90	java/lang/String:length	()I
    //   135: pop
    //   136: bipush 110
    //   138: bipush 19
    //   140: iadd
    //   141: bipush 52
    //   143: isub
    //   144: bipush 115
    //   146: iadd
    //   147: sipush 130
    //   150: sipush 175
    //   153: iadd
    //   154: sipush 191
    //   157: isub
    //   158: bipush 82
    //   160: iadd
    //   161: ixor
    //   162: ifge -118 -> 44
    //   165: return
    //   166: return
    //   167: ldc 2
    //   169: invokevirtual 90	java/lang/String:length	()I
    //   172: pop2
    //   173: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   20	103	0	localDataInputStream	java.io.DataInputStream
    //   25	21	1	i	int
    //   43	85	2	j	int
    //   167	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	166	167	java/lang/Exception
  }
  
  private static int c(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  /* Error */
  public static void a(cf paramcf, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    // Byte code:
    //   0: getstatic 43	dq:b	[[I
    //   3: invokestatic 70	dq:b	(Ljava/lang/Object;)Z
    //   6: ifeq +4 -> 10
    //   9: return
    //   10: iload_1
    //   11: getstatic 43	dq:b	[[I
    //   14: arraylength
    //   15: invokestatic 68	dq:b	(II)Z
    //   18: ifeq +216 -> 234
    //   21: getstatic 43	dq:b	[[I
    //   24: iload_1
    //   25: aaload
    //   26: getstatic 49	dq:h	[I
    //   29: iconst_2
    //   30: iaload
    //   31: iaload
    //   32: getstatic 47	dq:f	[Ljavax/microedition/lcdui/Image;
    //   35: getstatic 43	dq:b	[[I
    //   38: iload_1
    //   39: aaload
    //   40: getstatic 49	dq:h	[I
    //   43: iconst_1
    //   44: iaload
    //   45: iaload
    //   46: aaload
    //   47: invokevirtual 102	javax/microedition/lcdui/Image:getWidth	()I
    //   50: invokestatic 68	dq:b	(II)Z
    //   53: ifeq +181 -> 234
    //   56: getstatic 43	dq:b	[[I
    //   59: iload_1
    //   60: aaload
    //   61: getstatic 49	dq:h	[I
    //   64: iconst_4
    //   65: iaload
    //   66: iaload
    //   67: getstatic 47	dq:f	[Ljavax/microedition/lcdui/Image;
    //   70: getstatic 43	dq:b	[[I
    //   73: iload_1
    //   74: aaload
    //   75: getstatic 49	dq:h	[I
    //   78: iconst_1
    //   79: iaload
    //   80: iaload
    //   81: aaload
    //   82: invokevirtual 102	javax/microedition/lcdui/Image:getWidth	()I
    //   85: invokestatic 68	dq:b	(II)Z
    //   88: ifeq +146 -> 234
    //   91: getstatic 43	dq:b	[[I
    //   94: iload_1
    //   95: aaload
    //   96: getstatic 49	dq:h	[I
    //   99: iconst_3
    //   100: iaload
    //   101: iaload
    //   102: getstatic 47	dq:f	[Ljavax/microedition/lcdui/Image;
    //   105: getstatic 43	dq:b	[[I
    //   108: iload_1
    //   109: aaload
    //   110: getstatic 49	dq:h	[I
    //   113: iconst_1
    //   114: iaload
    //   115: iaload
    //   116: aaload
    //   117: invokevirtual 101	javax/microedition/lcdui/Image:getHeight	()I
    //   120: invokestatic 68	dq:b	(II)Z
    //   123: ifeq +111 -> 234
    //   126: getstatic 43	dq:b	[[I
    //   129: iload_1
    //   130: aaload
    //   131: getstatic 49	dq:h	[I
    //   134: iconst_5
    //   135: iaload
    //   136: iaload
    //   137: getstatic 47	dq:f	[Ljavax/microedition/lcdui/Image;
    //   140: getstatic 43	dq:b	[[I
    //   143: iload_1
    //   144: aaload
    //   145: getstatic 49	dq:h	[I
    //   148: iconst_1
    //   149: iaload
    //   150: iaload
    //   151: aaload
    //   152: invokevirtual 101	javax/microedition/lcdui/Image:getHeight	()I
    //   155: invokestatic 68	dq:b	(II)Z
    //   158: ifeq +76 -> 234
    //   161: aload_0
    //   162: getstatic 47	dq:f	[Ljavax/microedition/lcdui/Image;
    //   165: getstatic 43	dq:b	[[I
    //   168: iload_1
    //   169: aaload
    //   170: getstatic 49	dq:h	[I
    //   173: iconst_1
    //   174: iaload
    //   175: iaload
    //   176: aaload
    //   177: getstatic 43	dq:b	[[I
    //   180: iload_1
    //   181: aaload
    //   182: getstatic 49	dq:h	[I
    //   185: iconst_2
    //   186: iaload
    //   187: iaload
    //   188: getstatic 43	dq:b	[[I
    //   191: iload_1
    //   192: aaload
    //   193: getstatic 49	dq:h	[I
    //   196: iconst_3
    //   197: iaload
    //   198: iaload
    //   199: getstatic 43	dq:b	[[I
    //   202: iload_1
    //   203: aaload
    //   204: getstatic 49	dq:h	[I
    //   207: iconst_4
    //   208: iaload
    //   209: iaload
    //   210: getstatic 43	dq:b	[[I
    //   213: iload_1
    //   214: aaload
    //   215: getstatic 49	dq:h	[I
    //   218: iconst_5
    //   219: iaload
    //   220: iaload
    //   221: getstatic 49	dq:h	[I
    //   224: iconst_1
    //   225: iaload
    //   226: iload_2
    //   227: iload_3
    //   228: iload 4
    //   230: invokevirtual 56	cf:a	(Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   233: return
    //   234: getstatic 48	dq:g	Lex;
    //   237: new 30	java/lang/StringBuffer
    //   240: dup
    //   241: invokespecial 92	java/lang/StringBuffer:<init>	()V
    //   244: iload_1
    //   245: invokevirtual 94	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   248: invokevirtual 96	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   251: invokevirtual 82	ex:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   254: checkcast 23	dz
    //   257: dup
    //   258: astore 5
    //   260: invokestatic 70	dq:b	(Ljava/lang/Object;)Z
    //   263: ifeq +218 -> 481
    //   266: new 23	dz
    //   269: dup
    //   270: invokespecial 80	dz:<init>	()V
    //   273: dup
    //   274: astore 5
    //   276: iload_1
    //   277: putfield 52	dz:c	I
    //   280: getstatic 48	dq:g	Lex;
    //   283: new 30	java/lang/StringBuffer
    //   286: dup
    //   287: invokespecial 92	java/lang/StringBuffer:<init>	()V
    //   290: aload 5
    //   292: getfield 52	dz:c	I
    //   295: invokevirtual 94	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   298: invokevirtual 96	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   301: aload 5
    //   303: invokevirtual 83	ex:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   306: ldc 2
    //   308: invokevirtual 90	java/lang/String:length	()I
    //   311: pop2
    //   312: new 30	java/lang/StringBuffer
    //   315: dup
    //   316: ldc 12
    //   318: invokespecial 93	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   321: getstatic 41	cf:c	I
    //   324: invokevirtual 94	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   327: ldc 6
    //   329: invokevirtual 95	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   332: iload_1
    //   333: invokevirtual 94	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   336: invokevirtual 96	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   339: astore 6
    //   341: new 23	dz
    //   344: dup
    //   345: invokespecial 80	dz:<init>	()V
    //   348: astore 7
    //   350: getstatic 48	dq:g	Lex;
    //   353: new 30	java/lang/StringBuffer
    //   356: dup
    //   357: invokespecial 92	java/lang/StringBuffer:<init>	()V
    //   360: iload_1
    //   361: invokevirtual 94	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   364: invokevirtual 96	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   367: aload 7
    //   369: invokevirtual 83	ex:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   372: ldc 2
    //   374: invokevirtual 90	java/lang/String:length	()I
    //   377: pop2
    //   378: aload 7
    //   380: aload 6
    //   382: invokestatic 55	aw:c	(Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   385: putfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   388: aload 5
    //   390: aload 7
    //   392: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   395: putfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   398: aload 5
    //   400: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   403: invokestatic 70	dq:b	(Ljava/lang/Object;)Z
    //   406: ifeq +54 -> 460
    //   409: aload 5
    //   411: new 30	java/lang/StringBuffer
    //   414: dup
    //   415: invokespecial 92	java/lang/StringBuffer:<init>	()V
    //   418: iload_1
    //   419: invokevirtual 94	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   422: invokevirtual 96	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   425: invokestatic 60	df:b	(Ljava/lang/String;)[B
    //   428: invokestatic 58	cu:a	([B)Ljavax/microedition/lcdui/Image;
    //   431: putfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   434: aload 5
    //   436: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   439: invokestatic 70	dq:b	(Ljava/lang/Object;)Z
    //   442: ifeq +18 -> 460
    //   445: aload 5
    //   447: invokestatic 97	java/lang/System:currentTimeMillis	()J
    //   450: putfield 53	dz:d	J
    //   453: invokestatic 61	dl:ae	()Ldl;
    //   456: iload_1
    //   457: invokevirtual 62	dl:b	(I)V
    //   460: ldc 2
    //   462: invokevirtual 90	java/lang/String:length	()I
    //   465: pop
    //   466: ldc 3
    //   468: invokevirtual 90	java/lang/String:length	()I
    //   471: ineg
    //   472: ldc 3
    //   474: invokevirtual 90	java/lang/String:length	()I
    //   477: if_icmplt +51 -> 528
    //   480: return
    //   481: aload 5
    //   483: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   486: invokestatic 70	dq:b	(Ljava/lang/Object;)Z
    //   489: ifeq +39 -> 528
    //   492: invokestatic 97	java/lang/System:currentTimeMillis	()J
    //   495: aload 5
    //   497: getfield 53	dz:d	J
    //   500: lsub
    //   501: ldc2_w 35
    //   504: invokestatic 69	dq:b	(JJ)I
    //   507: invokestatic 71	dq:c	(I)Z
    //   510: ifeq +18 -> 528
    //   513: aload 5
    //   515: invokestatic 97	java/lang/System:currentTimeMillis	()J
    //   518: putfield 53	dz:d	J
    //   521: invokestatic 61	dl:ae	()Ldl;
    //   524: iload_1
    //   525: invokevirtual 62	dl:b	(I)V
    //   528: aload 5
    //   530: invokestatic 70	dq:b	(Ljava/lang/Object;)Z
    //   533: ifeq +4 -> 537
    //   536: return
    //   537: aload 5
    //   539: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   542: invokestatic 67	dq:a	(Ljava/lang/Object;)Z
    //   545: ifeq +180 -> 725
    //   548: aload 5
    //   550: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   553: invokevirtual 101	javax/microedition/lcdui/Image:getHeight	()I
    //   556: getstatic 49	dq:h	[I
    //   559: bipush 7
    //   561: iaload
    //   562: invokestatic 75	dq:d	(II)Z
    //   565: ifeq +116 -> 681
    //   568: aload 5
    //   570: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   573: invokevirtual 102	javax/microedition/lcdui/Image:getWidth	()I
    //   576: istore_1
    //   577: aload 5
    //   579: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   582: invokevirtual 101	javax/microedition/lcdui/Image:getHeight	()I
    //   585: getstatic 49	dq:h	[I
    //   588: iconst_4
    //   589: iaload
    //   590: idiv
    //   591: istore 6
    //   593: getstatic 39	aw:ap	I
    //   596: getstatic 49	dq:h	[I
    //   599: bipush 8
    //   601: iaload
    //   602: irem
    //   603: invokestatic 74	dq:d	(I)Z
    //   606: ifeq +26 -> 632
    //   609: aload 5
    //   611: aload 5
    //   613: getfield 50	dz:a	B
    //   616: getstatic 49	dq:h	[I
    //   619: iconst_2
    //   620: iaload
    //   621: iadd
    //   622: getstatic 49	dq:h	[I
    //   625: iconst_4
    //   626: iaload
    //   627: irem
    //   628: i2b
    //   629: putfield 50	dz:a	B
    //   632: aload_0
    //   633: aload 5
    //   635: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   638: getstatic 49	dq:h	[I
    //   641: iconst_1
    //   642: iaload
    //   643: aload 5
    //   645: getfield 50	dz:a	B
    //   648: iload 6
    //   650: imul
    //   651: iload_1
    //   652: iload 6
    //   654: getstatic 49	dq:h	[I
    //   657: iconst_1
    //   658: iaload
    //   659: iload_2
    //   660: iload_3
    //   661: iload 4
    //   663: invokevirtual 56	cf:a	(Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   666: ldc 2
    //   668: invokevirtual 90	java/lang/String:length	()I
    //   671: pop
    //   672: bipush 75
    //   674: bipush 79
    //   676: ixor
    //   677: ifgt +48 -> 725
    //   680: return
    //   681: aload_0
    //   682: aload 5
    //   684: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   687: getstatic 49	dq:h	[I
    //   690: iconst_1
    //   691: iaload
    //   692: getstatic 49	dq:h	[I
    //   695: iconst_1
    //   696: iaload
    //   697: aload 5
    //   699: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   702: invokevirtual 102	javax/microedition/lcdui/Image:getWidth	()I
    //   705: aload 5
    //   707: getfield 54	dz:e	Ljavax/microedition/lcdui/Image;
    //   710: invokevirtual 101	javax/microedition/lcdui/Image:getHeight	()I
    //   713: getstatic 49	dq:h	[I
    //   716: iconst_1
    //   717: iaload
    //   718: iload_2
    //   719: iload_3
    //   720: iload 4
    //   722: invokevirtual 56	cf:a	(Ljavax/microedition/lcdui/Image;IIIIIIII)V
    //   725: aload 5
    //   727: invokestatic 97	java/lang/System:currentTimeMillis	()J
    //   730: putfield 51	dz:b	J
    //   733: return
    //   734: ldc 2
    //   736: invokevirtual 90	java/lang/String:length	()I
    //   739: pop2
    //   740: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	741	0	paramcf	cf
    //   0	741	1	paramInt1	int
    //   0	741	2	paramInt2	int
    //   0	741	3	paramInt3	int
    //   0	741	4	paramInt4	int
    //   258	468	5	localdz1	dz
    //   339	42	6	str	String
    //   591	62	6	i	int
    //   348	43	7	localdz2	dz
    //   734	1	9	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	9	734	java/lang/Exception
    //   10	233	734	java/lang/Exception
    //   234	536	734	java/lang/Exception
    //   537	733	734	java/lang/Exception
  }
  
  public static void a(cf paramcf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((b(paramInt1, b.length)) && (b(b[paramInt1][h[2]], f[b[paramInt1][h[1]]].getWidth())) && (b(b[paramInt1][h[4]], f[b[paramInt1][h[1]]].getWidth())) && (b(b[paramInt1][h[3]], f[b[paramInt1][h[1]]].getHeight())) && (b(b[paramInt1][h[5]], f[b[paramInt1][h[1]]].getHeight())))
    {
      paramcf.a(f[b[paramInt1][h[1]]], b[paramInt1][h[2]], b[paramInt1][h[3]], b[paramInt1][h[4]], b[paramInt1][h[5]], paramInt4, paramInt2, paramInt3, paramInt5);
      return;
    }
    dz localdz;
    if (b(localdz = (dz)g.get(String.valueOf(paramInt1))))
    {
      (localdz = new dz()).c = paramInt1;
      "".length();
      localdz.e = cu.a(df.b(String.valueOf(paramInt1)));
      if (b(localdz.e))
      {
        localdz.d = System.currentTimeMillis();
        dl.ae().b(paramInt1);
        "".length();
        if (" ".length() != 0) {}
      }
    }
    else if ((b(localdz.e)) && (c(a(System.currentTimeMillis() - localdz.d, 60000L))))
    {
      localdz.d = System.currentTimeMillis();
      dl.ae().b(paramInt1);
    }
    if (a(localdz))
    {
      if (a(localdz.e)) {
        paramcf.a(localdz.e, h[1], h[1], localdz.e.getWidth(), localdz.e.getHeight(), paramInt4, paramInt2, paramInt3, paramInt5);
      }
      localdz.b = System.currentTimeMillis();
    }
  }
  
  public static void c()
  {
    new dq();
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static void h()
  {
    h = new int[9];
    h[0] = (0x86 ^ 0x83);
    h[1] = ((40 + '' - 66 + 58 ^ '' + '' - 202 + 52) & (0x54 ^ 0x58 ^ 0x76 ^ 0x5F ^ -" ".length()));
    h[2] = " ".length();
    h[3] = "  ".length();
    h[4] = "   ".length();
    h[5] = (50 + 17 - -27 + 35 ^ 18 + 108 - 20 + 27);
    h[6] = (-(-(0xFBF5 & 0x5FFF) & 0xDBFE & 0x78007FF5));
    h[7] = (0xBA ^ 0x99);
    h[8] = (0x31 ^ 0x37);
  }
  
  private static int d(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public static void d()
  {
    f = null;
    System.gc();
    f = new Image[] { aw.c("/img/Big0.png"), aw.c("/img/Big1.png"), aw.c("/img/Big2.png"), aw.c("/img/Big3.png"), aw.c("/img/Big4.png") };
    "".length();
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static boolean a(int paramInt)
  {
    if ((!b(paramInt, b.length)) || (!b(b[paramInt][h[2]], f[b[paramInt][h[1]]].getWidth())) || (!b(b[paramInt][h[4]], f[b[paramInt][h[1]]].getWidth())) || (!b(b[paramInt][h[3]], f[b[paramInt][h[1]]].getHeight())) || (c(b[paramInt][h[5]], f[b[paramInt][h[1]]].getHeight())))
    {
      dz localdz;
      if (b(localdz = (dz)g.get(String.valueOf(paramInt))))
      {
        (localdz = new dz()).c = paramInt;
        "".length();
        localdz.e = cu.a(df.b(String.valueOf(paramInt)));
        if (b(localdz.e))
        {
          localdz.d = System.currentTimeMillis();
          dl.ae().b(paramInt);
        }
        return h[1];
      }
      if (a(localdz.e)) {
        return h[2];
      }
      if ((b(localdz.e)) && (c(d(System.currentTimeMillis() - localdz.d, 60000L))))
      {
        localdz.d = System.currentTimeMillis();
        dl.ae().b(paramInt);
        return h[1];
      }
    }
    return h[2];
  }
  
  public static int b(int paramInt)
  {
    return b[paramInt][h[5]];
  }
  
  public static void e()
  {
    f = null;
    System.gc();
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public static void f() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\dq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */