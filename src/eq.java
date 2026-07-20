import java.io.DataInputStream;
import java.io.PrintStream;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class eq
{
  private byte l;
  private static int[] m;
  public byte[][] a;
  public int b;
  public int c;
  public boolean d;
  private boolean n;
  public byte[] e;
  public byte[] f;
  private long o;
  public int g;
  private byte p;
  public dq[] h;
  private boolean q;
  private byte r;
  public ci i = new ci();
  public short j;
  public long k;
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public eq()
  {
    new ci();
    this.a = new byte[m[0]][];
    new ci();
    this.j = m[1];
    this.r = m[1];
    this.e = new byte[m[0]];
    new ci();
  }
  
  /* Error */
  public final void a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 95	eq:b	(Ljava/lang/Object;)Z
    //   4: ifeq +987 -> 991
    //   7: aconst_null
    //   8: astore_2
    //   9: aload_0
    //   10: getfield 56	eq:i	Lci;
    //   13: invokevirtual 79	ci:removeAllElements	()V
    //   16: aload_0
    //   17: aconst_null
    //   18: putfield 55	eq:h	[Ldq;
    //   21: new 20	java/io/DataInputStream
    //   24: dup
    //   25: new 19	java/io/ByteArrayInputStream
    //   28: dup
    //   29: aload_1
    //   30: invokespecial 104	java/io/ByteArrayInputStream:<init>	([B)V
    //   33: invokespecial 105	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   36: dup
    //   37: astore_2
    //   38: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   41: istore_1
    //   42: aload_0
    //   43: iload_1
    //   44: anewarray 14	dq
    //   47: putfield 55	eq:h	[Ldq;
    //   50: getstatic 60	eq:m	[I
    //   53: iconst_1
    //   54: iaload
    //   55: istore_3
    //   56: iload_3
    //   57: iload_1
    //   58: invokestatic 87	eq:a	(II)Z
    //   61: ifeq +64 -> 125
    //   64: aload_0
    //   65: getfield 55	eq:h	[Ldq;
    //   68: astore 4
    //   70: aload_2
    //   71: invokevirtual 111	java/io/DataInputStream:readUnsignedByte	()I
    //   74: ldc 1
    //   76: invokevirtual 114	java/lang/String:length	()I
    //   79: pop2
    //   80: new 14	dq
    //   83: dup
    //   84: aload_2
    //   85: invokevirtual 111	java/io/DataInputStream:readUnsignedByte	()I
    //   88: aload_2
    //   89: invokevirtual 111	java/io/DataInputStream:readUnsignedByte	()I
    //   92: aload_2
    //   93: invokevirtual 111	java/io/DataInputStream:readUnsignedByte	()I
    //   96: aload_2
    //   97: invokevirtual 111	java/io/DataInputStream:readUnsignedByte	()I
    //   100: invokespecial 84	dq:<init>	(IIII)V
    //   103: astore 5
    //   105: aload 4
    //   107: iload_3
    //   108: aload 5
    //   110: aastore
    //   111: iinc 3 1
    //   114: ldc 1
    //   116: invokevirtual 114	java/lang/String:length	()I
    //   119: pop
    //   120: aconst_null
    //   121: ifnull -65 -> 56
    //   124: return
    //   125: getstatic 60	eq:m	[I
    //   128: iconst_1
    //   129: iaload
    //   130: istore_3
    //   131: aload_2
    //   132: invokevirtual 110	java/io/DataInputStream:readShort	()S
    //   135: istore 4
    //   137: getstatic 60	eq:m	[I
    //   140: iconst_1
    //   141: iaload
    //   142: istore 5
    //   144: iload 5
    //   146: iload 4
    //   148: invokestatic 87	eq:a	(II)Z
    //   151: ifeq +239 -> 390
    //   154: aload_2
    //   155: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   158: istore_1
    //   159: new 10	ci
    //   162: dup
    //   163: invokespecial 76	ci:<init>	()V
    //   166: astore 6
    //   168: new 10	ci
    //   171: dup
    //   172: invokespecial 76	ci:<init>	()V
    //   175: astore 7
    //   177: getstatic 60	eq:m	[I
    //   180: iconst_1
    //   181: iaload
    //   182: istore 8
    //   184: iload 8
    //   186: iload_1
    //   187: invokestatic 87	eq:a	(II)Z
    //   190: ifeq +124 -> 314
    //   193: new 18	i
    //   196: dup
    //   197: aload_2
    //   198: invokevirtual 110	java/io/DataInputStream:readShort	()S
    //   201: aload_2
    //   202: invokevirtual 110	java/io/DataInputStream:readShort	()S
    //   205: aload_2
    //   206: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   209: invokespecial 103	i:<init>	(III)V
    //   212: dup
    //   213: astore 9
    //   215: aload_2
    //   216: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   219: putfield 70	i:e	B
    //   222: aload 9
    //   224: aload_2
    //   225: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   228: putfield 68	i:c	B
    //   231: aload 9
    //   233: getfield 68	i:c	B
    //   236: invokestatic 99	eq:d	(I)Z
    //   239: ifeq +21 -> 260
    //   242: aload 6
    //   244: aload 9
    //   246: invokevirtual 77	ci:addElement	(Ljava/lang/Object;)V
    //   249: ldc 1
    //   251: invokevirtual 114	java/lang/String:length	()I
    //   254: pop
    //   255: aconst_null
    //   256: ifnull +11 -> 267
    //   259: return
    //   260: aload 7
    //   262: aload 9
    //   264: invokevirtual 77	ci:addElement	(Ljava/lang/Object;)V
    //   267: iload_3
    //   268: aload 9
    //   270: getfield 66	i:a	S
    //   273: invokestatic 73	bc:a	(I)I
    //   276: invokestatic 87	eq:a	(II)Z
    //   279: ifeq +12 -> 291
    //   282: aload 9
    //   284: getfield 66	i:a	S
    //   287: invokestatic 73	bc:a	(I)I
    //   290: istore_3
    //   291: iinc 8 1
    //   294: ldc 1
    //   296: invokevirtual 114	java/lang/String:length	()I
    //   299: pop
    //   300: ldc 3
    //   302: invokevirtual 114	java/lang/String:length	()I
    //   305: ldc 3
    //   307: invokevirtual 114	java/lang/String:length	()I
    //   310: if_icmple -126 -> 184
    //   313: return
    //   314: aload_0
    //   315: getfield 56	eq:i	Lci;
    //   318: new 11	cr
    //   321: dup
    //   322: aload 6
    //   324: aload 7
    //   326: invokespecial 80	cr:<init>	(Lci;Lci;)V
    //   329: invokevirtual 77	ci:addElement	(Ljava/lang/Object;)V
    //   332: iinc 5 1
    //   335: ldc 1
    //   337: invokevirtual 114	java/lang/String:length	()I
    //   340: pop
    //   341: bipush 24
    //   343: iconst_0
    //   344: iadd
    //   345: iconst_1
    //   346: isub
    //   347: bipush 108
    //   349: iadd
    //   350: sipush 132
    //   353: sipush 136
    //   356: iadd
    //   357: sipush 148
    //   360: isub
    //   361: bipush 24
    //   363: iadd
    //   364: ixor
    //   365: sipush 201
    //   368: sipush 140
    //   371: ixor
    //   372: bipush 25
    //   374: bipush 79
    //   376: ixor
    //   377: ixor
    //   378: ldc 2
    //   380: invokevirtual 114	java/lang/String:length	()I
    //   383: ineg
    //   384: ixor
    //   385: iand
    //   386: ifeq -242 -> 144
    //   389: return
    //   390: aload_0
    //   391: aload_0
    //   392: getfield 55	eq:h	[Ldq;
    //   395: getstatic 60	eq:m	[I
    //   398: iconst_1
    //   399: iaload
    //   400: aaload
    //   401: getfield 38	dq:d	S
    //   404: putfield 49	eq:b	I
    //   407: aload_0
    //   408: iload_3
    //   409: i2s
    //   410: putfield 50	eq:c	I
    //   413: aload_2
    //   414: invokevirtual 111	java/io/DataInputStream:readUnsignedByte	()I
    //   417: i2s
    //   418: istore 5
    //   420: aload_0
    //   421: iload 5
    //   423: newarray <illegal type>
    //   425: putfield 53	eq:f	[B
    //   428: getstatic 60	eq:m	[I
    //   431: iconst_1
    //   432: iaload
    //   433: istore 6
    //   435: iload 6
    //   437: iload 5
    //   439: invokestatic 87	eq:a	(II)Z
    //   442: ifeq +29 -> 471
    //   445: aload_0
    //   446: getfield 53	eq:f	[B
    //   449: iload 6
    //   451: aload_2
    //   452: invokevirtual 110	java/io/DataInputStream:readShort	()S
    //   455: i2b
    //   456: bastore
    //   457: iinc 6 1
    //   460: ldc 1
    //   462: invokevirtual 114	java/lang/String:length	()I
    //   465: pop
    //   466: aconst_null
    //   467: ifnull -32 -> 435
    //   470: return
    //   471: aload_2
    //   472: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   475: ldc 1
    //   477: invokevirtual 114	java/lang/String:length	()I
    //   480: pop2
    //   481: aload_2
    //   482: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   485: istore 7
    //   487: aload_0
    //   488: getfield 48	eq:a	[[B
    //   491: getstatic 60	eq:m	[I
    //   494: iconst_1
    //   495: iaload
    //   496: iload 7
    //   498: newarray <illegal type>
    //   500: aastore
    //   501: getstatic 60	eq:m	[I
    //   504: iconst_1
    //   505: iaload
    //   506: istore 6
    //   508: iload 6
    //   510: iload 7
    //   512: invokestatic 87	eq:a	(II)Z
    //   515: ifeq +34 -> 549
    //   518: aload_0
    //   519: getfield 48	eq:a	[[B
    //   522: getstatic 60	eq:m	[I
    //   525: iconst_1
    //   526: iaload
    //   527: aaload
    //   528: iload 6
    //   530: aload_2
    //   531: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   534: bastore
    //   535: iinc 6 1
    //   538: ldc 1
    //   540: invokevirtual 114	java/lang/String:length	()I
    //   543: pop
    //   544: aconst_null
    //   545: ifnull -37 -> 508
    //   548: return
    //   549: aload_2
    //   550: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   553: istore 7
    //   555: aload_0
    //   556: getfield 48	eq:a	[[B
    //   559: getstatic 60	eq:m	[I
    //   562: iconst_2
    //   563: iaload
    //   564: iload 7
    //   566: newarray <illegal type>
    //   568: aastore
    //   569: getstatic 60	eq:m	[I
    //   572: iconst_1
    //   573: iaload
    //   574: istore 6
    //   576: iload 6
    //   578: iload 7
    //   580: invokestatic 87	eq:a	(II)Z
    //   583: ifeq +55 -> 638
    //   586: aload_0
    //   587: getfield 48	eq:a	[[B
    //   590: getstatic 60	eq:m	[I
    //   593: iconst_2
    //   594: iaload
    //   595: aaload
    //   596: iload 6
    //   598: aload_2
    //   599: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   602: bastore
    //   603: iinc 6 1
    //   606: ldc 1
    //   608: invokevirtual 114	java/lang/String:length	()I
    //   611: pop
    //   612: ldc 4
    //   614: invokevirtual 114	java/lang/String:length	()I
    //   617: bipush 60
    //   619: bipush 71
    //   621: ixor
    //   622: bipush 123
    //   624: bipush 41
    //   626: iadd
    //   627: bipush 109
    //   629: isub
    //   630: bipush 72
    //   632: iadd
    //   633: ixor
    //   634: if_icmpne -58 -> 576
    //   637: return
    //   638: aload_2
    //   639: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   642: istore 7
    //   644: aload_0
    //   645: getfield 48	eq:a	[[B
    //   648: getstatic 60	eq:m	[I
    //   651: iconst_3
    //   652: iaload
    //   653: iload 7
    //   655: newarray <illegal type>
    //   657: aastore
    //   658: getstatic 60	eq:m	[I
    //   661: iconst_1
    //   662: iaload
    //   663: istore 6
    //   665: iload 6
    //   667: iload 7
    //   669: invokestatic 87	eq:a	(II)Z
    //   672: ifeq +48 -> 720
    //   675: aload_0
    //   676: getfield 48	eq:a	[[B
    //   679: getstatic 60	eq:m	[I
    //   682: iconst_3
    //   683: iaload
    //   684: aaload
    //   685: iload 6
    //   687: aload_2
    //   688: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   691: bastore
    //   692: iinc 6 1
    //   695: ldc 1
    //   697: invokevirtual 114	java/lang/String:length	()I
    //   700: pop
    //   701: bipush 110
    //   703: bipush 37
    //   705: ixor
    //   706: sipush 237
    //   709: sipush 166
    //   712: ixor
    //   713: iconst_m1
    //   714: ixor
    //   715: iand
    //   716: ifeq -51 -> 665
    //   719: return
    //   720: aload_0
    //   721: getstatic 60	eq:m	[I
    //   724: iconst_2
    //   725: iaload
    //   726: putfield 61	eq:n	Z
    //   729: aload_0
    //   730: getfield 52	eq:e	[B
    //   733: getstatic 60	eq:m	[I
    //   736: iconst_1
    //   737: iaload
    //   738: aload_0
    //   739: getfield 48	eq:a	[[B
    //   742: getstatic 60	eq:m	[I
    //   745: iconst_1
    //   746: iaload
    //   747: aaload
    //   748: arraylength
    //   749: getstatic 60	eq:m	[I
    //   752: iconst_4
    //   753: iaload
    //   754: isub
    //   755: i2b
    //   756: bastore
    //   757: aload_0
    //   758: getfield 52	eq:e	[B
    //   761: getstatic 60	eq:m	[I
    //   764: iconst_2
    //   765: iaload
    //   766: aload_0
    //   767: getfield 48	eq:a	[[B
    //   770: getstatic 60	eq:m	[I
    //   773: iconst_2
    //   774: iaload
    //   775: aaload
    //   776: arraylength
    //   777: getstatic 60	eq:m	[I
    //   780: iconst_4
    //   781: iaload
    //   782: isub
    //   783: i2b
    //   784: bastore
    //   785: aload_0
    //   786: getfield 52	eq:e	[B
    //   789: getstatic 60	eq:m	[I
    //   792: iconst_5
    //   793: iaload
    //   794: aload_0
    //   795: getfield 48	eq:a	[[B
    //   798: getstatic 60	eq:m	[I
    //   801: iconst_3
    //   802: iaload
    //   803: aaload
    //   804: arraylength
    //   805: getstatic 60	eq:m	[I
    //   808: iconst_4
    //   809: iaload
    //   810: isub
    //   811: i2b
    //   812: bastore
    //   813: aload_0
    //   814: getfield 52	eq:e	[B
    //   817: getstatic 60	eq:m	[I
    //   820: iconst_3
    //   821: iaload
    //   822: aload_0
    //   823: getfield 48	eq:a	[[B
    //   826: getstatic 60	eq:m	[I
    //   829: iconst_3
    //   830: iaload
    //   831: aaload
    //   832: arraylength
    //   833: getstatic 60	eq:m	[I
    //   836: iconst_4
    //   837: iaload
    //   838: isub
    //   839: i2b
    //   840: bastore
    //   841: ldc 1
    //   843: invokevirtual 114	java/lang/String:length	()I
    //   846: pop
    //   847: aconst_null
    //   848: ifnull +10 -> 858
    //   851: return
    //   852: ldc 1
    //   854: invokevirtual 114	java/lang/String:length	()I
    //   857: pop2
    //   858: aload_0
    //   859: getfield 52	eq:e	[B
    //   862: getstatic 60	eq:m	[I
    //   865: iconst_1
    //   866: iaload
    //   867: aload_2
    //   868: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   871: bastore
    //   872: aload_0
    //   873: getfield 52	eq:e	[B
    //   876: getstatic 60	eq:m	[I
    //   879: iconst_2
    //   880: iaload
    //   881: aload_2
    //   882: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   885: bastore
    //   886: aload_0
    //   887: getfield 52	eq:e	[B
    //   890: getstatic 60	eq:m	[I
    //   893: iconst_5
    //   894: iaload
    //   895: aload_2
    //   896: invokevirtual 109	java/io/DataInputStream:readByte	()B
    //   899: bastore
    //   900: aload_0
    //   901: getfield 52	eq:e	[B
    //   904: getstatic 60	eq:m	[I
    //   907: iconst_3
    //   908: iaload
    //   909: aload_0
    //   910: getfield 52	eq:e	[B
    //   913: getstatic 60	eq:m	[I
    //   916: iconst_5
    //   917: iaload
    //   918: baload
    //   919: bastore
    //   920: aload_2
    //   921: invokevirtual 107	java/io/DataInputStream:close	()V
    //   924: return
    //   925: ldc 1
    //   927: invokevirtual 114	java/lang/String:length	()I
    //   930: pop2
    //   931: return
    //   932: ldc 1
    //   934: invokevirtual 114	java/lang/String:length	()I
    //   937: pop2
    //   938: aload_2
    //   939: invokevirtual 107	java/io/DataInputStream:close	()V
    //   942: return
    //   943: ldc 1
    //   945: invokevirtual 114	java/lang/String:length	()I
    //   948: pop2
    //   949: return
    //   950: astore_1
    //   951: aload_2
    //   952: invokevirtual 107	java/io/DataInputStream:close	()V
    //   955: ldc 1
    //   957: invokevirtual 114	java/lang/String:length	()I
    //   960: pop
    //   961: ldc 2
    //   963: invokevirtual 114	java/lang/String:length	()I
    //   966: ldc 2
    //   968: invokevirtual 114	java/lang/String:length	()I
    //   971: ldc 2
    //   973: invokevirtual 114	java/lang/String:length	()I
    //   976: ineg
    //   977: ixor
    //   978: iand
    //   979: ifeq +10 -> 989
    //   982: return
    //   983: ldc 1
    //   985: invokevirtual 114	java/lang/String:length	()I
    //   988: pop2
    //   989: aload_1
    //   990: athrow
    //   991: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	992	0	this	eq
    //   0	992	1	paramArrayOfByte	byte[]
    //   8	944	2	localDataInputStream	DataInputStream
    //   55	354	3	i1	int
    //   68	38	4	arrayOfdq	dq[]
    //   135	12	4	i2	int
    //   103	6	5	localdq	dq
    //   142	296	5	i3	int
    //   166	157	6	localci1	ci
    //   433	253	6	i4	int
    //   175	150	7	localci2	ci
    //   485	183	7	i5	int
    //   182	110	8	i6	int
    //   213	70	9	locali	i
    //   852	1	14	localException1	Exception
    //   925	1	15	localException2	Exception
    //   932	1	16	localException3	Exception
    //   943	1	17	localException4	Exception
    //   983	1	18	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   729	841	852	java/lang/Exception
    //   920	924	925	java/lang/Exception
    //   9	920	932	java/lang/Exception
    //   938	942	943	java/lang/Exception
    //   9	920	950	finally
    //   951	955	983	java/lang/Exception
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public eq(short paramShort, long paramLong, int paramInt)
  {
    new ci();
    this.a = new byte[m[0]][];
    new ci();
    this.j = m[1];
    this.r = m[1];
    this.e = new byte[m[0]];
    new ci();
    this.j = paramShort;
    this.k = paramLong;
    this.g = paramInt;
    f();
    if (d(a(paramLong, -1L)))
    {
      this.r = m[3];
      return;
    }
    if (d(a(paramLong, 0L)))
    {
      this.r = m[2];
      return;
    }
    this.r = m[5];
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private boolean d()
  {
    if (a(this.n)) {
      return m[2];
    }
    f();
    return m[1];
  }
  
  private static void e()
  {
    m = new int[6];
    m[0] = (0x75 ^ 0x71);
    m[1] = ((28 + '' - -10 + 12 ^ 70 + 88 - -3 + 2) & ('' + '' - 288 + 138 ^ '' + 72 - 61 + 11 ^ -" ".length()));
    m[2] = " ".length();
    m[3] = "   ".length();
    m[4] = (0x7D ^ 0x4B ^ 0x95 ^ 0xA4);
    m[5] = "  ".length();
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public final void a(cf paramcf, int paramInt1, int paramInt2)
  {
    try
    {
      if ((a(d())) && (d(this.q)) && (a(this.l, this.i.size())))
      {
        localObject = ((cr)this.i.elementAt(this.l)).a;
        int i1 = m[1];
        while (a(i1, ((Vector)localObject).size()))
        {
          i locali = (i)((ci)localObject).elementAt(i1);
          dq localdq = this.h[locali.b];
          p localp;
          if ((b(localp = dd.a(this.j))) && (b(localp.b)))
          {
            int i3 = locali.d;
            int i4 = localdq.d;
            int i5 = localdq.c;
            int i6 = localdq.e;
            int i2 = localdq.a;
            if (b(i6, localp.b.getWidth())) {
              i6 = m[1];
            }
            if (b(i2, localp.b.getHeight())) {
              i2 = m[1];
            }
            if (b(i6 + i4, localp.b.getWidth())) {
              i4 = localp.b.getWidth() - i6;
            }
            if (b(i2 + i5, localp.b.getHeight())) {
              i5 = localp.b.getHeight() - i2;
            }
            if (c(locali.e, m[2]))
            {
              "".length();
              if (null == null) {
                break label323;
              }
            }
            label323:
            localp.b.a(i6, i2, i4, i5, m[5], m[1], paramInt1 + i3, paramInt2 + locali.a, m[1]);
          }
          i1++;
          "".length();
          if ((0xB6 ^ 0xB2) == 0) {
            return;
          }
        }
      }
      return;
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
      System.err.println("Err DataSkillEff  paintBottomEff:" + this.j);
    }
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt > 0;
  }
  
  public final void b(cf paramcf, int paramInt1, int paramInt2)
  {
    try
    {
      if ((a(d())) && (d(this.q)) && (a(this.l, this.i.size())))
      {
        localObject = ((cr)this.i.elementAt(this.l)).b;
        int i1 = m[1];
        while (a(i1, ((Vector)localObject).size()))
        {
          i locali = (i)((ci)localObject).elementAt(i1);
          dq localdq = this.h[locali.b];
          p localp;
          if ((b(localp = dd.a(this.j))) && (b(localp.b)))
          {
            int i3 = locali.d;
            int i4 = localdq.d;
            int i5 = localdq.c;
            int i6 = localdq.e;
            int i2 = localdq.a;
            if (b(i6, localp.b.getWidth())) {
              i6 = m[1];
            }
            if (b(i2, localp.b.getHeight())) {
              i2 = m[1];
            }
            if (b(i6 + i4, localp.b.getWidth())) {
              i4 = localp.b.getWidth() - i6;
            }
            if (b(i2 + i5, localp.b.getHeight())) {
              i5 = localp.b.getHeight() - i2;
            }
            if (c(locali.e, m[2]))
            {
              "".length();
              if ("   ".length() == "   ".length()) {
                break label332;
              }
            }
            label332:
            localp.b.a(i6, i2, i4, i5, m[5], m[1], paramInt1 + i3, paramInt2 + locali.a, m[1]);
          }
          i1++;
          "".length();
          if (-"  ".length() >= 0) {
            return;
          }
        }
      }
      return;
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
      System.err.println("Err DataSkillEff  paintBottomEff:" + this.j);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (c(this.g))
    {
      this.q = paramBoolean;
      if (a(this.q)) {
        this.o = (System.currentTimeMillis() + this.g);
      }
    }
    else
    {
      this.q = m[1];
    }
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  private void f()
  {
    try
    {
      if (a(localObject = (eg)dd.a.get(this.j)))
      {
        if (b(localObject = bc.a("/effdata/" + this.j)))
        {
          byte[] arrayOfByte = new byte[(short)((DataInputStream)localObject).available()];
          "".length();
          a(arrayOfByte);
          "".length();
          if (((3 + 125 - 75 + 104 ^ 82 + 2 - 36 + 138) & (78 + 21 - 21 + 71 ^ 22 + 120 - 26 + 62 ^ -" ".length())) >= 0) {}
        }
        else
        {
          "".length();
          "".length();
          if ("   ".length() < (0x53 ^ 0x57)) {
            return;
          }
        }
      }
      else if ((b(localObject)) && (a(((eg)localObject).a)))
      {
        this.i = ((eg)localObject).g;
        this.h = ((eg)localObject).h;
        this.b = ((eg)localObject).d;
        this.c = ((eg)localObject).e;
        this.f = ((eg)localObject).c;
        this.e = ((eg)localObject).b;
        this.a = ((eg)localObject).f;
        this.n = ((eg)localObject).a;
      }
      return;
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
      "".length();
    }
  }
  
  private static int b(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(4);
    a();
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	eq:i	Lci;
    //   4: invokevirtual 121	java/util/Vector:size	()I
    //   7: invokestatic 96	eq:c	(I)Z
    //   10: ifeq +379 -> 389
    //   13: aload_0
    //   14: getfield 64	eq:q	Z
    //   17: invokestatic 99	eq:d	(I)Z
    //   20: ifeq +334 -> 354
    //   23: aload_0
    //   24: getfield 65	eq:r	B
    //   27: tableswitch	default:+326->353, 0:+29->56, 1:+91->118, 2:+153->180, 3:+264->291
    //   56: aload_0
    //   57: dup
    //   58: getfield 63	eq:p	B
    //   61: getstatic 60	eq:m	[I
    //   64: iconst_2
    //   65: iaload
    //   66: iadd
    //   67: i2b
    //   68: putfield 63	eq:p	B
    //   71: aload_0
    //   72: getfield 63	eq:p	B
    //   75: aload_0
    //   76: getfield 53	eq:f	[B
    //   79: arraylength
    //   80: invokestatic 93	eq:b	(II)Z
    //   83: ifeq +21 -> 104
    //   86: aload_0
    //   87: getstatic 60	eq:m	[I
    //   90: iconst_2
    //   91: iaload
    //   92: putfield 51	eq:d	Z
    //   95: aload_0
    //   96: getstatic 60	eq:m	[I
    //   99: iconst_1
    //   100: iaload
    //   101: putfield 63	eq:p	B
    //   104: aload_0
    //   105: aload_0
    //   106: getfield 53	eq:f	[B
    //   109: aload_0
    //   110: getfield 63	eq:p	B
    //   113: baload
    //   114: putfield 59	eq:l	B
    //   117: return
    //   118: aload_0
    //   119: dup
    //   120: getfield 63	eq:p	B
    //   123: getstatic 60	eq:m	[I
    //   126: iconst_2
    //   127: iaload
    //   128: iadd
    //   129: i2b
    //   130: putfield 63	eq:p	B
    //   133: aload_0
    //   134: getfield 63	eq:p	B
    //   137: aload_0
    //   138: getfield 53	eq:f	[B
    //   141: arraylength
    //   142: invokestatic 93	eq:b	(II)Z
    //   145: ifeq +21 -> 166
    //   148: aload_0
    //   149: getstatic 60	eq:m	[I
    //   152: iconst_1
    //   153: iaload
    //   154: putfield 63	eq:p	B
    //   157: aload_0
    //   158: getstatic 60	eq:m	[I
    //   161: iconst_2
    //   162: iaload
    //   163: putfield 51	eq:d	Z
    //   166: aload_0
    //   167: aload_0
    //   168: getfield 53	eq:f	[B
    //   171: aload_0
    //   172: getfield 63	eq:p	B
    //   175: baload
    //   176: putfield 59	eq:l	B
    //   179: return
    //   180: aload_0
    //   181: dup
    //   182: getfield 63	eq:p	B
    //   185: getstatic 60	eq:m	[I
    //   188: iconst_2
    //   189: iaload
    //   190: iadd
    //   191: i2b
    //   192: putfield 63	eq:p	B
    //   195: aload_0
    //   196: getfield 63	eq:p	B
    //   199: aload_0
    //   200: getfield 53	eq:f	[B
    //   203: arraylength
    //   204: getstatic 60	eq:m	[I
    //   207: iconst_2
    //   208: iaload
    //   209: isub
    //   210: i2b
    //   211: invokestatic 97	eq:c	(II)Z
    //   214: ifeq +30 -> 244
    //   217: aload_0
    //   218: getfield 58	eq:k	J
    //   221: invokestatic 119	java/lang/System:currentTimeMillis	()J
    //   224: lsub
    //   225: lconst_0
    //   226: invokestatic 94	eq:b	(JJ)I
    //   229: invokestatic 92	eq:b	(I)Z
    //   232: ifeq +12 -> 244
    //   235: aload_0
    //   236: getstatic 60	eq:m	[I
    //   239: iconst_2
    //   240: iaload
    //   241: putfield 51	eq:d	Z
    //   244: aload_0
    //   245: getfield 63	eq:p	B
    //   248: aload_0
    //   249: getfield 53	eq:f	[B
    //   252: arraylength
    //   253: invokestatic 93	eq:b	(II)Z
    //   256: ifeq +21 -> 277
    //   259: aload_0
    //   260: getstatic 60	eq:m	[I
    //   263: iconst_1
    //   264: iaload
    //   265: putfield 63	eq:p	B
    //   268: aload_0
    //   269: getstatic 60	eq:m	[I
    //   272: iconst_2
    //   273: iaload
    //   274: invokespecial 90	eq:a	(Z)V
    //   277: aload_0
    //   278: aload_0
    //   279: getfield 53	eq:f	[B
    //   282: aload_0
    //   283: getfield 63	eq:p	B
    //   286: baload
    //   287: putfield 59	eq:l	B
    //   290: return
    //   291: aload_0
    //   292: dup
    //   293: getfield 63	eq:p	B
    //   296: getstatic 60	eq:m	[I
    //   299: iconst_2
    //   300: iaload
    //   301: iadd
    //   302: i2b
    //   303: putfield 63	eq:p	B
    //   306: aload_0
    //   307: getfield 63	eq:p	B
    //   310: aload_0
    //   311: getfield 53	eq:f	[B
    //   314: arraylength
    //   315: invokestatic 93	eq:b	(II)Z
    //   318: ifeq +21 -> 339
    //   321: aload_0
    //   322: getstatic 60	eq:m	[I
    //   325: iconst_1
    //   326: iaload
    //   327: putfield 63	eq:p	B
    //   330: aload_0
    //   331: getstatic 60	eq:m	[I
    //   334: iconst_2
    //   335: iaload
    //   336: invokespecial 90	eq:a	(Z)V
    //   339: aload_0
    //   340: aload_0
    //   341: getfield 53	eq:f	[B
    //   344: aload_0
    //   345: getfield 63	eq:p	B
    //   348: baload
    //   349: putfield 59	eq:l	B
    //   352: return
    //   353: return
    //   354: aload_0
    //   355: getfield 62	eq:o	J
    //   358: invokestatic 119	java/lang/System:currentTimeMillis	()J
    //   361: lsub
    //   362: lconst_0
    //   363: invokestatic 94	eq:b	(JJ)I
    //   366: invokestatic 92	eq:b	(I)Z
    //   369: ifeq +13 -> 382
    //   372: aload_0
    //   373: getstatic 60	eq:m	[I
    //   376: iconst_1
    //   377: iaload
    //   378: invokespecial 90	eq:a	(Z)V
    //   381: return
    //   382: return
    //   383: ldc 1
    //   385: invokevirtual 114	java/lang/String:length	()I
    //   388: pop2
    //   389: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	390	0	this	eq
    //   383	1	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   13	117	383	java/lang/Exception
    //   118	179	383	java/lang/Exception
    //   180	290	383	java/lang/Exception
    //   291	352	383	java/lang/Exception
    //   354	381	383	java/lang/Exception
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\eq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */