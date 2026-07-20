public final class av
  extends r
{
  private static boolean v;
  private static int[] w;
  private long x = 0L;
  private long y;
  private static boolean z;
  
  private static boolean d(int paramInt)
  {
    return paramInt >= 0;
  }
  
  public final void c()
  {
    super.a();
    z = w[0];
    v = w[0];
    this.y = System.currentTimeMillis();
  }
  
  private static void q()
  {
    w = new int[8];
    w[0] = ((0x25 ^ 0x5C ^ 0x16 ^ 0x4E) & (0x85 ^ 0x9B ^ 0x91 ^ 0xAE ^ -" ".length()));
    w[1] = (93 + 42 - 71 + 96);
    w[2] = " ".length();
    w[3] = (0x16 ^ 0x35 ^ 0x1D ^ 0x50);
    w[4] = (7 + 24 - -55 + 43);
    w[5] = ((0x1A ^ 0x72) + (0x5 ^ 0x5C) - (0xC8 ^ 0x93) + (0x29 ^ 0x6));
    w[6] = (-" ".length());
    w[7] = (0xABDD & 0x7FEE);
  }
  
  public final String toString()
  {
    return "Lôi lose";
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: invokestatic 71	r:k	()Z
    //   3: invokestatic 50	av:f	(I)Z
    //   6: ifeq +40 -> 46
    //   9: getstatic 43	et:o	S
    //   12: getstatic 33	av:w	[I
    //   15: iconst_1
    //   16: iaload
    //   17: invokestatic 48	av:d	(II)Z
    //   20: ifeq +17 -> 37
    //   23: ldc2_w 22
    //   26: invokestatic 65	java/lang/Thread:sleep	(J)V
    //   29: return
    //   30: ldc 1
    //   32: invokevirtual 63	java/lang/String:length	()I
    //   35: pop2
    //   36: return
    //   37: getstatic 33	av:w	[I
    //   40: iconst_2
    //   41: iaload
    //   42: invokestatic 70	r:a	(Z)V
    //   45: return
    //   46: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   49: aload_0
    //   50: getfield 35	av:y	J
    //   53: lsub
    //   54: ldc2_w 30
    //   57: invokestatic 44	av:a	(JJ)I
    //   60: invokestatic 47	av:d	(I)Z
    //   63: ifeq +24 -> 87
    //   66: getstatic 39	dn:e	Ldn;
    //   69: ldc 1
    //   71: invokevirtual 63	java/lang/String:length	()I
    //   74: pop2
    //   75: ldc 7
    //   77: invokestatic 56	dn:d	(Ljava/lang/String;)V
    //   80: aload_0
    //   81: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   84: putfield 35	av:y	J
    //   87: invokestatic 57	dn:l	()V
    //   90: getstatic 36	av:z	Z
    //   93: invokestatic 49	av:e	(I)Z
    //   96: ifeq +170 -> 266
    //   99: getstatic 32	av:v	Z
    //   102: invokestatic 49	av:e	(I)Z
    //   105: ifeq +161 -> 266
    //   108: getstatic 43	et:o	S
    //   111: getstatic 33	av:w	[I
    //   114: iconst_3
    //   115: iaload
    //   116: invokestatic 48	av:d	(II)Z
    //   119: ifeq +20 -> 139
    //   122: getstatic 33	av:w	[I
    //   125: iconst_2
    //   126: iaload
    //   127: putstatic 36	av:z	Z
    //   130: getstatic 33	av:w	[I
    //   133: iconst_0
    //   134: iaload
    //   135: putstatic 32	av:v	Z
    //   138: return
    //   139: getstatic 43	et:o	S
    //   142: getstatic 38	cz:l	I
    //   145: invokestatic 45	av:c	(II)Z
    //   148: ifeq +99 -> 247
    //   151: getstatic 43	et:o	S
    //   154: getstatic 33	av:w	[I
    //   157: iconst_1
    //   158: iaload
    //   159: invokestatic 45	av:c	(II)Z
    //   162: ifeq +54 -> 216
    //   165: getstatic 43	et:o	S
    //   168: getstatic 33	av:w	[I
    //   171: iconst_4
    //   172: iaload
    //   173: invokestatic 45	av:c	(II)Z
    //   176: ifeq +40 -> 216
    //   179: getstatic 43	et:o	S
    //   182: getstatic 33	av:w	[I
    //   185: iconst_5
    //   186: iaload
    //   187: invokestatic 45	av:c	(II)Z
    //   190: ifeq +26 -> 216
    //   193: aload_0
    //   194: getstatic 38	cz:l	I
    //   197: getstatic 37	cz:f	I
    //   200: getstatic 33	av:w	[I
    //   203: bipush 6
    //   205: iaload
    //   206: getstatic 33	av:w	[I
    //   209: bipush 6
    //   211: iaload
    //   212: invokevirtual 69	r:a	(IIII)V
    //   215: return
    //   216: ldc2_w 24
    //   219: invokestatic 65	java/lang/Thread:sleep	(J)V
    //   222: ldc 1
    //   224: invokevirtual 63	java/lang/String:length	()I
    //   227: pop
    //   228: bipush 33
    //   230: bipush 37
    //   232: ixor
    //   233: ifge +10 -> 243
    //   236: return
    //   237: ldc 1
    //   239: invokevirtual 63	java/lang/String:length	()I
    //   242: pop2
    //   243: invokestatic 72	r:n	()V
    //   246: return
    //   247: getstatic 42	et:b	B
    //   250: getstatic 37	cz:f	I
    //   253: invokestatic 45	av:c	(II)Z
    //   256: ifeq +318 -> 574
    //   259: getstatic 37	cz:f	I
    //   262: invokestatic 68	r:a	(I)V
    //   265: return
    //   266: getstatic 36	av:z	Z
    //   269: invokestatic 50	av:f	(I)Z
    //   272: ifeq +254 -> 526
    //   275: getstatic 32	av:v	Z
    //   278: invokestatic 49	av:e	(I)Z
    //   281: ifeq +245 -> 526
    //   284: getstatic 43	et:o	S
    //   287: getstatic 33	av:w	[I
    //   290: iconst_1
    //   291: iaload
    //   292: invokestatic 48	av:d	(II)Z
    //   295: ifeq +20 -> 315
    //   298: getstatic 33	av:w	[I
    //   301: iconst_2
    //   302: iaload
    //   303: putstatic 36	av:z	Z
    //   306: getstatic 33	av:w	[I
    //   309: iconst_2
    //   310: iaload
    //   311: putstatic 32	av:v	Z
    //   314: return
    //   315: getstatic 43	et:o	S
    //   318: getstatic 33	av:w	[I
    //   321: iconst_3
    //   322: iaload
    //   323: invokestatic 48	av:d	(II)Z
    //   326: ifeq +248 -> 574
    //   329: getstatic 33	av:w	[I
    //   332: iconst_0
    //   333: iaload
    //   334: invokestatic 62	fn:g	(I)Lfc;
    //   337: astore_1
    //   338: invokestatic 59	dt:g	()Ldt;
    //   341: getfield 40	dt:eg	I
    //   344: aload_1
    //   345: getfield 40	dt:eg	I
    //   348: invokestatic 48	av:d	(II)Z
    //   351: ifeq +118 -> 469
    //   354: invokestatic 59	dt:g	()Ldt;
    //   357: getfield 41	dt:ey	I
    //   360: aload_1
    //   361: getfield 41	dt:ey	I
    //   364: invokestatic 48	av:d	(II)Z
    //   367: ifeq +102 -> 469
    //   370: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   373: aload_0
    //   374: getfield 34	av:x	J
    //   377: lsub
    //   378: ldc2_w 26
    //   381: invokestatic 44	av:a	(JJ)I
    //   384: invokestatic 47	av:d	(I)Z
    //   387: ifeq +81 -> 468
    //   390: getstatic 33	av:w	[I
    //   393: iconst_0
    //   394: iaload
    //   395: invokestatic 60	fn:b	(I)V
    //   398: getstatic 33	av:w	[I
    //   401: iconst_0
    //   402: iaload
    //   403: getstatic 33	av:w	[I
    //   406: iconst_2
    //   407: iaload
    //   408: getstatic 33	av:w	[I
    //   411: iconst_0
    //   412: iaload
    //   413: invokestatic 61	fn:b	(III)V
    //   416: invokestatic 55	dl:ae	()Ldl;
    //   419: getstatic 33	av:w	[I
    //   422: bipush 7
    //   424: iaload
    //   425: ldc 5
    //   427: invokevirtual 54	dl:a	(SLjava/lang/String;)V
    //   430: invokestatic 52	aw:p	()V
    //   433: ldc2_w 28
    //   436: invokestatic 65	java/lang/Thread:sleep	(J)V
    //   439: ldc 1
    //   441: invokevirtual 63	java/lang/String:length	()I
    //   444: pop
    //   445: ldc 3
    //   447: invokevirtual 63	java/lang/String:length	()I
    //   450: ineg
    //   451: ifle +10 -> 461
    //   454: return
    //   455: ldc 1
    //   457: invokevirtual 63	java/lang/String:length	()I
    //   460: pop2
    //   461: aload_0
    //   462: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   465: putfield 34	av:x	J
    //   468: return
    //   469: aload_1
    //   470: getfield 40	dt:eg	I
    //   473: aload_1
    //   474: getfield 41	dt:ey	I
    //   477: invokestatic 58	dt:b	(II)Z
    //   480: ldc 1
    //   482: invokevirtual 63	java/lang/String:length	()I
    //   485: pop2
    //   486: ldc2_w 24
    //   489: invokestatic 65	java/lang/Thread:sleep	(J)V
    //   492: ldc 1
    //   494: invokevirtual 63	java/lang/String:length	()I
    //   497: pop
    //   498: ldc 4
    //   500: invokevirtual 63	java/lang/String:length	()I
    //   503: ldc 4
    //   505: invokevirtual 63	java/lang/String:length	()I
    //   508: if_icmpeq +10 -> 518
    //   511: return
    //   512: ldc 1
    //   514: invokevirtual 63	java/lang/String:length	()I
    //   517: pop2
    //   518: aload_0
    //   519: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   522: putfield 34	av:x	J
    //   525: return
    //   526: getstatic 36	av:z	Z
    //   529: invokestatic 50	av:f	(I)Z
    //   532: ifeq +42 -> 574
    //   535: getstatic 32	av:v	Z
    //   538: invokestatic 50	av:f	(I)Z
    //   541: ifeq +33 -> 574
    //   544: getstatic 43	et:o	S
    //   547: getstatic 33	av:w	[I
    //   550: iconst_1
    //   551: iaload
    //   552: invokestatic 45	av:c	(II)Z
    //   555: ifeq +19 -> 574
    //   558: getstatic 33	av:w	[I
    //   561: iconst_0
    //   562: iaload
    //   563: putstatic 36	av:z	Z
    //   566: getstatic 33	av:w	[I
    //   569: iconst_0
    //   570: iaload
    //   571: putstatic 32	av:v	Z
    //   574: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	575	0	this	av
    //   337	137	1	localfc	fc
    //   30	1	2	localInterruptedException1	InterruptedException
    //   237	1	3	localInterruptedException2	InterruptedException
    //   455	1	4	localInterruptedException3	InterruptedException
    //   512	1	5	localInterruptedException4	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   23	29	30	java/lang/InterruptedException
    //   216	222	237	java/lang/InterruptedException
    //   433	439	455	java/lang/InterruptedException
    //   486	492	512	java/lang/InterruptedException
  }
  
  public static void d()
  {
    q();
    z = w[0];
    v = w[0];
  }
  
  static
  {
    cs.a(48);
    d();
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static void p() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\av.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */