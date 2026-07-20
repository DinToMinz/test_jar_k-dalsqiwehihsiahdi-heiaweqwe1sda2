public final class ah
  extends r
{
  private static boolean v;
  private static int[] w;
  private static boolean x;
  private long y;
  private long z;
  private long aa;
  private long ab = 0L;
  
  public final void c()
  {
    super.a();
    x = w[0];
    v = w[0];
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public final String toString()
  {
    return "Lôi win";
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static void q()
  {
    w = new int[12];
    w[0] = ((0x4 ^ 0x32 ^ 0x87 ^ 0x8E) & (0x7D ^ 0x61 ^ 0x2B ^ 0x8 ^ -" ".length()));
    w[1] = (28 + 9 - 4 + 102 + (0x27 ^ 0x5F) - (56 + 102 - 83 + 67) + (0x3 ^ 0x2C));
    w[2] = " ".length();
    w[3] = (0x5F ^ 0x31);
    w[4] = "   ".length();
    w[5] = (0xBFEB & 0x6BDF);
    w[6] = ((0x4A ^ 0x2E) + (0xC5 ^ 0x86) - (0x2E ^ 0x17) + (0x8F ^ 0x9C));
    w[7] = (109 + 116 - 144 + 68);
    w[8] = (-" ".length());
    w[9] = (0xAFFC & 0x7BCF);
    w[10] = "  ".length();
    w[11] = (0x21 ^ 0x3F);
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: invokestatic 115	r:k	()Z
    //   3: invokestatic 77	ah:d	(I)Z
    //   6: ifeq +40 -> 46
    //   9: getstatic 57	et:o	S
    //   12: getstatic 44	ah:w	[I
    //   15: iconst_1
    //   16: iaload
    //   17: invokestatic 80	ah:e	(II)Z
    //   20: ifeq +17 -> 37
    //   23: ldc2_w 29
    //   26: invokestatic 107	java/lang/Thread:sleep	(J)V
    //   29: return
    //   30: ldc 1
    //   32: invokevirtual 105	java/lang/String:length	()I
    //   35: pop2
    //   36: return
    //   37: getstatic 44	ah:w	[I
    //   40: iconst_2
    //   41: iaload
    //   42: invokestatic 114	r:a	(Z)V
    //   45: return
    //   46: getstatic 45	ah:x	Z
    //   49: invokestatic 83	ah:g	(I)Z
    //   52: ifeq +441 -> 493
    //   55: getstatic 43	ah:v	Z
    //   58: invokestatic 83	ah:g	(I)Z
    //   61: ifeq +432 -> 493
    //   64: getstatic 57	et:o	S
    //   67: getstatic 44	ah:w	[I
    //   70: iconst_3
    //   71: iaload
    //   72: invokestatic 80	ah:e	(II)Z
    //   75: ifeq +20 -> 95
    //   78: getstatic 44	ah:w	[I
    //   81: iconst_2
    //   82: iaload
    //   83: putstatic 45	ah:x	Z
    //   86: getstatic 44	ah:w	[I
    //   89: iconst_0
    //   90: iaload
    //   91: putstatic 43	ah:v	Z
    //   94: return
    //   95: getstatic 57	et:o	S
    //   98: getstatic 50	cz:l	I
    //   101: invokestatic 80	ah:e	(II)Z
    //   104: ifeq +276 -> 380
    //   107: getstatic 56	et:b	B
    //   110: getstatic 49	cz:f	I
    //   113: invokestatic 80	ah:e	(II)Z
    //   116: ifeq +264 -> 380
    //   119: getstatic 44	ah:w	[I
    //   122: iconst_0
    //   123: iaload
    //   124: invokestatic 103	fn:g	(I)Lfc;
    //   127: astore_1
    //   128: invokestatic 100	dt:g	()Ldt;
    //   131: getfield 54	dt:eg	I
    //   134: aload_1
    //   135: getfield 54	dt:eg	I
    //   138: invokestatic 80	ah:e	(II)Z
    //   141: ifeq +208 -> 349
    //   144: invokestatic 100	dt:g	()Ldt;
    //   147: getfield 55	dt:ey	I
    //   150: aload_1
    //   151: getfield 55	dt:ey	I
    //   154: invokestatic 80	ah:e	(II)Z
    //   157: ifeq +192 -> 349
    //   160: getstatic 44	ah:w	[I
    //   163: iconst_0
    //   164: iaload
    //   165: istore_1
    //   166: iload_1
    //   167: getstatic 61	fn:ep	Lci;
    //   170: invokevirtual 108	java/util/Vector:size	()I
    //   173: invokestatic 78	ah:d	(II)Z
    //   176: ifeq +172 -> 348
    //   179: getstatic 48	cz:d	Ljava/lang/String;
    //   182: ldc 5
    //   184: invokestatic 97	dn:a	(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    //   187: astore_3
    //   188: getstatic 44	ah:w	[I
    //   191: iconst_0
    //   192: iaload
    //   193: istore 4
    //   195: iload 4
    //   197: aload_3
    //   198: arraylength
    //   199: invokestatic 78	ah:d	(II)Z
    //   202: ifeq +116 -> 318
    //   205: getstatic 61	fn:ep	Lci;
    //   208: iload_1
    //   209: invokevirtual 89	ci:elementAt	(I)Ljava/lang/Object;
    //   212: checkcast 16	dt
    //   215: astore_2
    //   216: aload_3
    //   217: iload 4
    //   219: aaload
    //   220: aload_2
    //   221: getfield 52	dt:ci	Ljava/lang/String;
    //   224: invokevirtual 104	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   227: invokestatic 77	ah:d	(I)Z
    //   230: ifeq +74 -> 304
    //   233: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   236: aload_0
    //   237: getfield 46	ah:y	J
    //   240: lsub
    //   241: ldc2_w 37
    //   244: invokestatic 72	ah:a	(JJ)I
    //   247: invokestatic 81	ah:f	(I)Z
    //   250: ifeq +54 -> 304
    //   253: getstatic 44	ah:w	[I
    //   256: iconst_0
    //   257: iaload
    //   258: invokestatic 101	fn:b	(I)V
    //   261: getstatic 44	ah:w	[I
    //   264: iconst_0
    //   265: iaload
    //   266: getstatic 44	ah:w	[I
    //   269: iconst_4
    //   270: iaload
    //   271: getstatic 44	ah:w	[I
    //   274: iconst_0
    //   275: iaload
    //   276: invokestatic 102	fn:b	(III)V
    //   279: invokestatic 94	dl:ae	()Ldl;
    //   282: getstatic 44	ah:w	[I
    //   285: iconst_5
    //   286: iaload
    //   287: aload_3
    //   288: iload 4
    //   290: aaload
    //   291: invokevirtual 93	dl:a	(SLjava/lang/String;)V
    //   294: invokestatic 86	aw:p	()V
    //   297: aload_0
    //   298: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   301: putfield 46	ah:y	J
    //   304: iinc 4 1
    //   307: ldc 1
    //   309: invokevirtual 105	java/lang/String:length	()I
    //   312: pop
    //   313: aconst_null
    //   314: ifnull -119 -> 195
    //   317: return
    //   318: iinc 1 1
    //   321: ldc 1
    //   323: invokevirtual 105	java/lang/String:length	()I
    //   326: pop
    //   327: sipush 170
    //   330: sipush 177
    //   333: ixor
    //   334: sipush 173
    //   337: sipush 182
    //   340: ixor
    //   341: iconst_m1
    //   342: ixor
    //   343: iand
    //   344: ifle -178 -> 166
    //   347: return
    //   348: return
    //   349: aload_1
    //   350: getfield 54	dt:eg	I
    //   353: aload_1
    //   354: getfield 55	dt:ey	I
    //   357: invokestatic 99	dt:b	(II)Z
    //   360: ldc 1
    //   362: invokevirtual 105	java/lang/String:length	()I
    //   365: pop2
    //   366: ldc2_w 31
    //   369: invokestatic 107	java/lang/Thread:sleep	(J)V
    //   372: return
    //   373: ldc 1
    //   375: invokevirtual 105	java/lang/String:length	()I
    //   378: pop2
    //   379: return
    //   380: getstatic 57	et:o	S
    //   383: getstatic 50	cz:l	I
    //   386: invokestatic 84	ah:g	(II)Z
    //   389: ifeq +97 -> 486
    //   392: getstatic 57	et:o	S
    //   395: getstatic 44	ah:w	[I
    //   398: iconst_1
    //   399: iaload
    //   400: invokestatic 84	ah:g	(II)Z
    //   403: ifeq +56 -> 459
    //   406: getstatic 57	et:o	S
    //   409: getstatic 44	ah:w	[I
    //   412: bipush 6
    //   414: iaload
    //   415: invokestatic 84	ah:g	(II)Z
    //   418: ifeq +41 -> 459
    //   421: getstatic 57	et:o	S
    //   424: getstatic 44	ah:w	[I
    //   427: bipush 7
    //   429: iaload
    //   430: invokestatic 84	ah:g	(II)Z
    //   433: ifeq +26 -> 459
    //   436: aload_0
    //   437: getstatic 50	cz:l	I
    //   440: getstatic 49	cz:f	I
    //   443: getstatic 44	ah:w	[I
    //   446: bipush 8
    //   448: iaload
    //   449: getstatic 44	ah:w	[I
    //   452: bipush 8
    //   454: iaload
    //   455: invokevirtual 112	r:a	(IIII)V
    //   458: return
    //   459: ldc2_w 31
    //   462: invokestatic 107	java/lang/Thread:sleep	(J)V
    //   465: ldc 1
    //   467: invokevirtual 105	java/lang/String:length	()I
    //   470: pop
    //   471: aconst_null
    //   472: ifnull +10 -> 482
    //   475: return
    //   476: ldc 1
    //   478: invokevirtual 105	java/lang/String:length	()I
    //   481: pop2
    //   482: invokestatic 116	r:n	()V
    //   485: return
    //   486: getstatic 49	cz:f	I
    //   489: invokestatic 111	r:a	(I)V
    //   492: return
    //   493: getstatic 45	ah:x	Z
    //   496: invokestatic 77	ah:d	(I)Z
    //   499: ifeq +278 -> 777
    //   502: getstatic 43	ah:v	Z
    //   505: invokestatic 83	ah:g	(I)Z
    //   508: ifeq +269 -> 777
    //   511: getstatic 57	et:o	S
    //   514: getstatic 44	ah:w	[I
    //   517: iconst_1
    //   518: iaload
    //   519: invokestatic 80	ah:e	(II)Z
    //   522: ifeq +27 -> 549
    //   525: aload_0
    //   526: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   529: putfield 41	ah:aa	J
    //   532: getstatic 44	ah:w	[I
    //   535: iconst_2
    //   536: iaload
    //   537: putstatic 45	ah:x	Z
    //   540: getstatic 44	ah:w	[I
    //   543: iconst_2
    //   544: iaload
    //   545: putstatic 43	ah:v	Z
    //   548: return
    //   549: getstatic 57	et:o	S
    //   552: getstatic 44	ah:w	[I
    //   555: iconst_3
    //   556: iaload
    //   557: invokestatic 80	ah:e	(II)Z
    //   560: ifeq +810 -> 1370
    //   563: getstatic 44	ah:w	[I
    //   566: iconst_0
    //   567: iaload
    //   568: invokestatic 103	fn:g	(I)Lfc;
    //   571: astore_1
    //   572: invokestatic 100	dt:g	()Ldt;
    //   575: getfield 54	dt:eg	I
    //   578: aload_1
    //   579: getfield 54	dt:eg	I
    //   582: invokestatic 80	ah:e	(II)Z
    //   585: ifeq +19 -> 604
    //   588: invokestatic 100	dt:g	()Ldt;
    //   591: getfield 55	dt:ey	I
    //   594: aload_1
    //   595: getfield 55	dt:ey	I
    //   598: invokestatic 84	ah:g	(II)Z
    //   601: ifeq +63 -> 664
    //   604: aload_1
    //   605: getfield 54	dt:eg	I
    //   608: aload_1
    //   609: getfield 55	dt:ey	I
    //   612: invokestatic 99	dt:b	(II)Z
    //   615: ldc 1
    //   617: invokevirtual 105	java/lang/String:length	()I
    //   620: pop2
    //   621: ldc2_w 31
    //   624: invokestatic 107	java/lang/Thread:sleep	(J)V
    //   627: ldc 1
    //   629: invokevirtual 105	java/lang/String:length	()I
    //   632: pop
    //   633: bipush 104
    //   635: bipush 8
    //   637: ixor
    //   638: bipush 69
    //   640: bipush 37
    //   642: ixor
    //   643: iconst_m1
    //   644: ixor
    //   645: iand
    //   646: ifle +10 -> 656
    //   649: return
    //   650: ldc 1
    //   652: invokevirtual 105	java/lang/String:length	()I
    //   655: pop2
    //   656: aload_0
    //   657: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   660: putfield 42	ah:ab	J
    //   663: return
    //   664: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   667: aload_0
    //   668: getfield 42	ah:ab	J
    //   671: lsub
    //   672: ldc2_w 35
    //   675: invokestatic 72	ah:a	(JJ)I
    //   678: invokestatic 81	ah:f	(I)Z
    //   681: ifeq +689 -> 1370
    //   684: getstatic 44	ah:w	[I
    //   687: iconst_0
    //   688: iaload
    //   689: invokestatic 101	fn:b	(I)V
    //   692: getstatic 44	ah:w	[I
    //   695: iconst_0
    //   696: iaload
    //   697: getstatic 44	ah:w	[I
    //   700: iconst_2
    //   701: iaload
    //   702: getstatic 44	ah:w	[I
    //   705: iconst_0
    //   706: iaload
    //   707: invokestatic 102	fn:b	(III)V
    //   710: invokestatic 94	dl:ae	()Ldl;
    //   713: getstatic 44	ah:w	[I
    //   716: bipush 9
    //   718: iaload
    //   719: ldc 6
    //   721: invokevirtual 93	dl:a	(SLjava/lang/String;)V
    //   724: invokestatic 86	aw:p	()V
    //   727: ldc2_w 35
    //   730: invokestatic 107	java/lang/Thread:sleep	(J)V
    //   733: ldc 1
    //   735: invokevirtual 105	java/lang/String:length	()I
    //   738: pop
    //   739: sipush 188
    //   742: sipush 175
    //   745: ixor
    //   746: bipush 87
    //   748: bipush 68
    //   750: ixor
    //   751: iconst_m1
    //   752: ixor
    //   753: iand
    //   754: ldc 2
    //   756: invokevirtual 105	java/lang/String:length	()I
    //   759: if_icmplt +10 -> 769
    //   762: return
    //   763: ldc 1
    //   765: invokevirtual 105	java/lang/String:length	()I
    //   768: pop2
    //   769: aload_0
    //   770: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   773: putfield 42	ah:ab	J
    //   776: return
    //   777: getstatic 45	ah:x	Z
    //   780: invokestatic 77	ah:d	(I)Z
    //   783: ifeq +587 -> 1370
    //   786: getstatic 43	ah:v	Z
    //   789: invokestatic 77	ah:d	(I)Z
    //   792: ifeq +578 -> 1370
    //   795: getstatic 57	et:o	S
    //   798: getstatic 44	ah:w	[I
    //   801: iconst_1
    //   802: iaload
    //   803: invokestatic 84	ah:g	(II)Z
    //   806: ifeq +27 -> 833
    //   809: getstatic 44	ah:w	[I
    //   812: iconst_0
    //   813: iaload
    //   814: putstatic 45	ah:x	Z
    //   817: getstatic 44	ah:w	[I
    //   820: iconst_0
    //   821: iaload
    //   822: putstatic 43	ah:v	Z
    //   825: aload_0
    //   826: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   829: putfield 41	ah:aa	J
    //   832: return
    //   833: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   836: aload_0
    //   837: getfield 41	ah:aa	J
    //   840: lsub
    //   841: ldc2_w 39
    //   844: invokestatic 72	ah:a	(JJ)I
    //   847: invokestatic 81	ah:f	(I)Z
    //   850: ifeq +520 -> 1370
    //   853: aconst_null
    //   854: astore_2
    //   855: getstatic 44	ah:w	[I
    //   858: iconst_0
    //   859: iaload
    //   860: istore_1
    //   861: iload_1
    //   862: getstatic 61	fn:ep	Lci;
    //   865: invokevirtual 108	java/util/Vector:size	()I
    //   868: invokestatic 78	ah:d	(II)Z
    //   871: ifeq +125 -> 996
    //   874: getstatic 48	cz:d	Ljava/lang/String;
    //   877: ldc 5
    //   879: invokestatic 97	dn:a	(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    //   882: astore_3
    //   883: getstatic 44	ah:w	[I
    //   886: iconst_0
    //   887: iaload
    //   888: istore 4
    //   890: iload 4
    //   892: aload_3
    //   893: arraylength
    //   894: invokestatic 78	ah:d	(II)Z
    //   897: ifeq +80 -> 977
    //   900: getstatic 61	fn:ep	Lci;
    //   903: iload_1
    //   904: invokevirtual 89	ci:elementAt	(I)Ljava/lang/Object;
    //   907: checkcast 16	dt
    //   910: dup
    //   911: astore 5
    //   913: getfield 52	dt:ci	Ljava/lang/String;
    //   916: aload_3
    //   917: iload 4
    //   919: aaload
    //   920: invokevirtual 104	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   923: invokestatic 77	ah:d	(I)Z
    //   926: ifeq +21 -> 947
    //   929: aload 5
    //   931: astore_2
    //   932: ldc 1
    //   934: invokevirtual 105	java/lang/String:length	()I
    //   937: pop
    //   938: ldc 3
    //   940: invokevirtual 105	java/lang/String:length	()I
    //   943: ifne +34 -> 977
    //   946: return
    //   947: iinc 4 1
    //   950: ldc 1
    //   952: invokevirtual 105	java/lang/String:length	()I
    //   955: pop
    //   956: ldc 2
    //   958: invokevirtual 105	java/lang/String:length	()I
    //   961: ineg
    //   962: bipush 23
    //   964: bipush 76
    //   966: ixor
    //   967: bipush 70
    //   969: bipush 25
    //   971: ixor
    //   972: ixor
    //   973: if_icmplt -83 -> 890
    //   976: return
    //   977: iinc 1 1
    //   980: ldc 1
    //   982: invokevirtual 105	java/lang/String:length	()I
    //   985: pop
    //   986: ldc 4
    //   988: invokevirtual 105	java/lang/String:length	()I
    //   991: ineg
    //   992: ifle -131 -> 861
    //   995: return
    //   996: aload_2
    //   997: invokestatic 73	ah:a	(Ljava/lang/Object;)Z
    //   1000: ifeq +27 -> 1027
    //   1003: getstatic 44	ah:w	[I
    //   1006: iconst_0
    //   1007: iaload
    //   1008: putstatic 45	ah:x	Z
    //   1011: getstatic 44	ah:w	[I
    //   1014: iconst_0
    //   1015: iaload
    //   1016: putstatic 43	ah:v	Z
    //   1019: aload_0
    //   1020: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   1023: putfield 41	ah:aa	J
    //   1026: return
    //   1027: getstatic 70	r:m	Lfy;
    //   1030: invokestatic 74	ah:b	(Ljava/lang/Object;)Z
    //   1033: ifeq +337 -> 1370
    //   1036: aload_2
    //   1037: getfield 53	dt:ef	I
    //   1040: invokestatic 79	ah:e	(I)Z
    //   1043: ifeq +327 -> 1370
    //   1046: getstatic 70	r:m	Lfy;
    //   1049: astore_3
    //   1050: invokestatic 100	dt:g	()Ldt;
    //   1053: astore 4
    //   1055: aload_3
    //   1056: getfield 62	fy:a	Lev;
    //   1059: getfield 58	ev:b	I
    //   1062: getstatic 44	ah:w	[I
    //   1065: bipush 10
    //   1067: iaload
    //   1068: invokestatic 80	ah:e	(II)Z
    //   1071: ifeq +43 -> 1114
    //   1074: invokestatic 94	dl:ae	()Ldl;
    //   1077: aload_3
    //   1078: getfield 62	fy:a	Lev;
    //   1081: getfield 59	ev:e	B
    //   1084: invokevirtual 95	dl:l	(I)V
    //   1087: invokestatic 94	dl:ae	()Ldl;
    //   1090: invokevirtual 96	dl:v	()V
    //   1093: ldc 1
    //   1095: invokevirtual 105	java/lang/String:length	()I
    //   1098: pop
    //   1099: bipush 82
    //   1101: bipush 86
    //   1103: ixor
    //   1104: ldc 2
    //   1106: invokevirtual 105	java/lang/String:length	()I
    //   1109: ineg
    //   1110: if_icmpgt +181 -> 1291
    //   1113: return
    //   1114: aload_3
    //   1115: getfield 62	fy:a	Lev;
    //   1118: getfield 58	ev:b	I
    //   1121: getstatic 44	ah:w	[I
    //   1124: iconst_2
    //   1125: iaload
    //   1126: invokestatic 84	ah:g	(II)Z
    //   1129: ifeq +21 -> 1150
    //   1132: aload_3
    //   1133: getfield 62	fy:a	Lev;
    //   1136: getfield 58	ev:b	I
    //   1139: getstatic 44	ah:w	[I
    //   1142: iconst_4
    //   1143: iaload
    //   1144: invokestatic 80	ah:e	(II)Z
    //   1147: ifeq +94 -> 1241
    //   1150: aload 4
    //   1152: getfield 54	dt:eg	I
    //   1155: aload_2
    //   1156: getfield 54	dt:eg	I
    //   1159: isub
    //   1160: invokestatic 87	bc:a	(I)I
    //   1163: aload_3
    //   1164: getfield 63	fy:c	I
    //   1167: getstatic 44	ah:w	[I
    //   1170: bipush 11
    //   1172: iaload
    //   1173: iadd
    //   1174: invokestatic 82	ah:f	(II)Z
    //   1177: ifeq +33 -> 1210
    //   1180: aload 4
    //   1182: getfield 55	dt:ey	I
    //   1185: aload_2
    //   1186: getfield 55	dt:ey	I
    //   1189: isub
    //   1190: invokestatic 87	bc:a	(I)I
    //   1193: aload_3
    //   1194: getfield 65	fy:g	I
    //   1197: getstatic 44	ah:w	[I
    //   1200: bipush 11
    //   1202: iaload
    //   1203: iadd
    //   1204: invokestatic 75	ah:c	(II)Z
    //   1207: ifeq +34 -> 1241
    //   1210: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   1213: aload_0
    //   1214: getfield 47	ah:z	J
    //   1217: lsub
    //   1218: ldc2_w 33
    //   1221: invokestatic 72	ah:a	(JJ)I
    //   1224: invokestatic 79	ah:e	(I)Z
    //   1227: ifeq +14 -> 1241
    //   1230: aload_2
    //   1231: invokestatic 113	r:a	(Ldt;)V
    //   1234: aload_0
    //   1235: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   1238: putfield 47	ah:z	J
    //   1241: getstatic 68	r:e	Lci;
    //   1244: invokevirtual 90	ci:removeAllElements	()V
    //   1247: getstatic 69	r:l	Lci;
    //   1250: invokevirtual 90	ci:removeAllElements	()V
    //   1253: getstatic 69	r:l	Lci;
    //   1256: aload_2
    //   1257: invokevirtual 88	ci:addElement	(Ljava/lang/Object;)V
    //   1260: invokestatic 94	dl:ae	()Ldl;
    //   1263: aload_3
    //   1264: getfield 62	fy:a	Lev;
    //   1267: getfield 59	ev:e	B
    //   1270: invokevirtual 95	dl:l	(I)V
    //   1273: invokestatic 94	dl:ae	()Ldl;
    //   1276: getstatic 68	r:e	Lci;
    //   1279: getstatic 69	r:l	Lci;
    //   1282: getstatic 44	ah:w	[I
    //   1285: bipush 10
    //   1287: iaload
    //   1288: invokevirtual 92	dl:a	(Lci;Lci;I)V
    //   1291: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   1294: aload_3
    //   1295: getfield 64	fy:e	J
    //   1298: lsub
    //   1299: aload_3
    //   1300: getfield 67	fy:l	I
    //   1303: i2l
    //   1304: ldc2_w 27
    //   1307: ladd
    //   1308: invokestatic 72	ah:a	(JJ)I
    //   1311: invokestatic 81	ah:f	(I)Z
    //   1314: ifeq +49 -> 1363
    //   1317: aload_3
    //   1318: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   1321: putfield 64	fy:e	J
    //   1324: aload_3
    //   1325: getstatic 44	ah:w	[I
    //   1328: iconst_2
    //   1329: iaload
    //   1330: putfield 66	fy:k	Z
    //   1333: getstatic 51	dn:ae	Z
    //   1336: invokestatic 83	ah:g	(I)Z
    //   1339: ifeq +24 -> 1363
    //   1342: aload 4
    //   1344: getstatic 60	fn:dc	[Lad;
    //   1347: aload_3
    //   1348: getfield 62	fy:a	Lev;
    //   1351: getfield 59	ev:e	B
    //   1354: aaload
    //   1355: getstatic 44	ah:w	[I
    //   1358: iconst_0
    //   1359: iaload
    //   1360: invokevirtual 98	dt:a	(Lad;I)V
    //   1363: aload_0
    //   1364: invokestatic 106	java/lang/System:currentTimeMillis	()J
    //   1367: putfield 71	r:u	J
    //   1370: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1371	0	this	ah
    //   127	24	1	localfc1	fc
    //   165	189	1	i	int
    //   571	38	1	localfc2	fc
    //   860	118	1	j	int
    //   215	1042	2	localObject1	Object
    //   187	1161	3	localObject2	Object
    //   193	755	4	k	int
    //   1053	290	4	localdt1	dt
    //   911	19	5	localdt2	dt
    //   30	1	10	localInterruptedException1	InterruptedException
    //   373	1	11	localInterruptedException2	InterruptedException
    //   476	1	12	localInterruptedException3	InterruptedException
    //   650	1	13	localInterruptedException4	InterruptedException
    //   763	1	14	localInterruptedException5	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   23	29	30	java/lang/InterruptedException
    //   366	372	373	java/lang/InterruptedException
    //   459	465	476	java/lang/InterruptedException
    //   621	627	650	java/lang/InterruptedException
    //   727	733	763	java/lang/InterruptedException
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  public static void d()
  {
    q();
    x = w[0];
    v = w[0];
  }
  
  static
  {
    cs.a(21);
    d();
  }
  
  private static boolean g(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static void p() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ah.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */