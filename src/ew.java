public final class ew
  extends r
{
  private static long v;
  private static int[] w;
  private long x;
  
  public static void c() {}
  
  static
  {
    cs.a(146);
    c();
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt > 0;
  }
  
  public final String toString()
  {
    return "Auto đánh pk";
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt != 0;
  }
  
  public final void d()
  {
    super.a();
    if ((!d(dn.v, w[0])) || (!d(dn.a, w[0])) || (c(dn.u, w[0])))
    {
      dn.v = w[1];
      dn.a = w[2];
      dn.u = w[3];
    }
    this.d = dn.v;
    this.f = dn.an;
    this.h = et.f(dn.v);
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: invokestatic 83	r:k	()Z
    //   3: invokestatic 69	ew:e	(I)Z
    //   6: ifeq +25 -> 31
    //   9: getstatic 43	ew:w	[I
    //   12: iconst_4
    //   13: iaload
    //   14: invokestatic 82	r:a	(Z)V
    //   17: ldc2_w 27
    //   20: invokestatic 77	java/lang/Thread:sleep	(J)V
    //   23: return
    //   24: ldc 1
    //   26: invokevirtual 75	java/lang/String:length	()I
    //   29: pop2
    //   30: return
    //   31: aload_0
    //   32: getfield 47	r:d	I
    //   35: getstatic 41	et:o	S
    //   38: invokestatic 66	ew:c	(II)Z
    //   41: ifeq +446 -> 487
    //   44: aload_0
    //   45: getfield 48	r:f	I
    //   48: getstatic 40	et:b	B
    //   51: invokestatic 66	ew:c	(II)Z
    //   54: ifeq +433 -> 487
    //   57: invokestatic 62	dt:g	()Ldt;
    //   60: getfield 37	dt:eg	I
    //   63: getstatic 31	dn:a	I
    //   66: invokestatic 66	ew:c	(II)Z
    //   69: ifeq +18 -> 87
    //   72: invokestatic 62	dt:g	()Ldt;
    //   75: getfield 38	dt:ey	I
    //   78: getstatic 34	dn:u	I
    //   81: invokestatic 68	ew:d	(II)Z
    //   84: ifeq +100 -> 184
    //   87: getstatic 31	dn:a	I
    //   90: getstatic 43	ew:w	[I
    //   93: iconst_0
    //   94: iaload
    //   95: invokestatic 68	ew:d	(II)Z
    //   98: ifeq +54 -> 152
    //   101: getstatic 34	dn:u	I
    //   104: getstatic 43	ew:w	[I
    //   107: iconst_0
    //   108: iaload
    //   109: invokestatic 68	ew:d	(II)Z
    //   112: ifeq +40 -> 152
    //   115: getstatic 31	dn:a	I
    //   118: getstatic 34	dn:u	I
    //   121: invokestatic 61	dt:b	(II)Z
    //   124: ldc 1
    //   126: invokevirtual 75	java/lang/String:length	()I
    //   129: pop2
    //   130: ldc 1
    //   132: invokevirtual 75	java/lang/String:length	()I
    //   135: pop
    //   136: sipush 170
    //   139: sipush 174
    //   142: ixor
    //   143: ldc 2
    //   145: invokevirtual 75	java/lang/String:length	()I
    //   148: if_icmpge +22 -> 170
    //   151: return
    //   152: invokestatic 62	dt:g	()Ldt;
    //   155: getfield 37	dt:eg	I
    //   158: putstatic 31	dn:a	I
    //   161: invokestatic 62	dt:g	()Ldt;
    //   164: getfield 38	dt:ey	I
    //   167: putstatic 34	dn:u	I
    //   170: ldc2_w 25
    //   173: invokestatic 77	java/lang/Thread:sleep	(J)V
    //   176: return
    //   177: ldc 1
    //   179: invokevirtual 75	java/lang/String:length	()I
    //   182: pop2
    //   183: return
    //   184: invokestatic 76	java/lang/System:currentTimeMillis	()J
    //   187: getstatic 42	ew:v	J
    //   190: lsub
    //   191: ldc2_w 23
    //   194: invokestatic 64	ew:a	(JJ)I
    //   197: invokestatic 71	ew:f	(I)Z
    //   200: ifeq +242 -> 442
    //   203: new 7	ci
    //   206: dup
    //   207: invokespecial 53	ci:<init>	()V
    //   210: astore_1
    //   211: getstatic 43	ew:w	[I
    //   214: iconst_5
    //   215: iaload
    //   216: istore_2
    //   217: iload_2
    //   218: getstatic 45	fn:ep	Lci;
    //   221: invokevirtual 78	java/util/Vector:size	()I
    //   224: invokestatic 72	ew:f	(II)Z
    //   227: ifeq +215 -> 442
    //   230: getstatic 45	fn:ep	Lci;
    //   233: iload_2
    //   234: invokevirtual 55	ci:elementAt	(I)Ljava/lang/Object;
    //   237: checkcast 11	dt
    //   240: dup
    //   241: astore_3
    //   242: getfield 36	dt:ef	I
    //   245: invokestatic 67	ew:d	(I)Z
    //   248: ifeq +170 -> 418
    //   251: aload_3
    //   252: getfield 39	dt:fm	B
    //   255: getstatic 43	ew:w	[I
    //   258: bipush 6
    //   260: iaload
    //   261: invokestatic 66	ew:c	(II)Z
    //   264: ifeq +154 -> 418
    //   267: invokestatic 62	dt:g	()Ldt;
    //   270: getfield 37	dt:eg	I
    //   273: aload_3
    //   274: getfield 37	dt:eg	I
    //   277: isub
    //   278: invokestatic 74	java/lang/Math:abs	(I)I
    //   281: getstatic 43	ew:w	[I
    //   284: bipush 7
    //   286: iaload
    //   287: invokestatic 70	ew:e	(II)Z
    //   290: ifeq +128 -> 418
    //   293: invokestatic 62	dt:g	()Ldt;
    //   296: getfield 38	dt:ey	I
    //   299: aload_3
    //   300: getfield 38	dt:ey	I
    //   303: isub
    //   304: invokestatic 74	java/lang/Math:abs	(I)I
    //   307: getstatic 43	ew:w	[I
    //   310: bipush 7
    //   312: iaload
    //   313: invokestatic 70	ew:e	(II)Z
    //   316: ifeq +102 -> 418
    //   319: aload_1
    //   320: invokevirtual 78	java/util/Vector:size	()I
    //   323: getstatic 50	r:m	Lfy;
    //   326: getfield 46	fy:i	I
    //   329: invokestatic 70	ew:e	(II)Z
    //   332: ifeq +86 -> 418
    //   335: aload_1
    //   336: aload_3
    //   337: invokevirtual 54	ci:addElement	(Ljava/lang/Object;)V
    //   340: aload_3
    //   341: getfield 36	dt:ef	I
    //   344: invokestatic 67	ew:d	(I)Z
    //   347: ifeq +71 -> 418
    //   350: aload_3
    //   351: getfield 39	dt:fm	B
    //   354: getstatic 43	ew:w	[I
    //   357: bipush 6
    //   359: iaload
    //   360: invokestatic 66	ew:c	(II)Z
    //   363: ifeq +55 -> 418
    //   366: invokestatic 62	dt:g	()Ldt;
    //   369: getfield 37	dt:eg	I
    //   372: aload_3
    //   373: getfield 37	dt:eg	I
    //   376: isub
    //   377: invokestatic 74	java/lang/Math:abs	(I)I
    //   380: getstatic 43	ew:w	[I
    //   383: bipush 7
    //   385: iaload
    //   386: invokestatic 70	ew:e	(II)Z
    //   389: ifeq +29 -> 418
    //   392: invokestatic 58	dl:ae	()Ldl;
    //   395: new 7	ci
    //   398: dup
    //   399: invokespecial 53	ci:<init>	()V
    //   402: aload_1
    //   403: getstatic 43	ew:w	[I
    //   406: bipush 8
    //   408: iaload
    //   409: invokevirtual 57	dl:a	(Lci;Lci;I)V
    //   412: invokestatic 76	java/lang/System:currentTimeMillis	()J
    //   415: putstatic 42	ew:v	J
    //   418: iinc 2 1
    //   421: ldc 1
    //   423: invokevirtual 75	java/lang/String:length	()I
    //   426: pop
    //   427: ldc 2
    //   429: invokevirtual 75	java/lang/String:length	()I
    //   432: ineg
    //   433: ldc 2
    //   435: invokevirtual 75	java/lang/String:length	()I
    //   438: if_icmplt -221 -> 217
    //   441: return
    //   442: invokestatic 60	dn:l	()V
    //   445: invokestatic 76	java/lang/System:currentTimeMillis	()J
    //   448: aload_0
    //   449: getfield 44	ew:x	J
    //   452: lsub
    //   453: ldc2_w 29
    //   456: invokestatic 64	ew:a	(JJ)I
    //   459: invokestatic 71	ew:f	(I)Z
    //   462: ifeq +45 -> 507
    //   465: getstatic 33	dn:e	Ldn;
    //   468: ldc 1
    //   470: invokevirtual 75	java/lang/String:length	()I
    //   473: pop2
    //   474: ldc 6
    //   476: invokestatic 59	dn:d	(Ljava/lang/String;)V
    //   479: aload_0
    //   480: invokestatic 76	java/lang/System:currentTimeMillis	()J
    //   483: putfield 44	ew:x	J
    //   486: return
    //   487: aload_0
    //   488: aload_0
    //   489: getfield 47	r:d	I
    //   492: aload_0
    //   493: getfield 48	r:f	I
    //   496: aload_0
    //   497: getfield 52	r:t	I
    //   500: aload_0
    //   501: getfield 51	r:o	I
    //   504: invokevirtual 81	r:a	(IIII)V
    //   507: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	508	0	this	ew
    //   210	193	1	localci	ci
    //   216	203	2	i	int
    //   241	132	3	localdt	dt
    //   24	1	4	localInterruptedException1	InterruptedException
    //   177	1	5	localInterruptedException2	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   17	23	24	java/lang/InterruptedException
    //   170	176	177	java/lang/InterruptedException
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static void q()
  {
    w = new int[9];
    w[0] = (-" ".length());
    w[1] = (0xDA ^ 0x9C);
    w[2] = (0x8FDC & 0x75FF);
    w[3] = (-(0xFBFF & 0x7C6F) & 0xFBFE & 0x7E7F);
    w[4] = " ".length();
    w[5] = ((0x61 ^ 0x5B ^ 0x41 ^ 0x46) & (0x52 ^ 0x60 ^ 0x5F ^ 0x50 ^ -" ".length()));
    w[6] = "   ".length();
    w[7] = (0xEE ^ 0x8C ^ 0x67 ^ 0x37);
    w[8] = "  ".length();
  }
  
  public static void p() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ew.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */