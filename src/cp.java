public final class cp
  implements Runnable
{
  private static int[] a;
  
  private static void c()
  {
    a = new int[5];
    a[0] = ((79 + 33 - -30 + 6 ^ '«' + 53 - 152 + 107) & (46 + '' - 111 + 76 ^ 44 + 96 - 57 + 47 ^ -" ".length()));
    a[1] = (12 + 47 - 55 + 142 ^ 86 + 125 - 164 + 93);
    a[2] = (0x41 ^ 0x7 ^ 0x45 ^ 0xE);
    a[3] = (0x2C ^ 0x3A);
    a[4] = (-" ".length());
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: getstatic 20	cp:a	[I
    //   3: iconst_0
    //   4: iaload
    //   5: istore_1
    //   6: iload_1
    //   7: getstatic 20	cp:a	[I
    //   10: iconst_1
    //   11: iaload
    //   12: invokestatic 31	cp:a	(II)Z
    //   15: ifeq +251 -> 266
    //   18: getstatic 26	et:b	B
    //   21: iload_1
    //   22: invokestatic 34	cp:b	(II)Z
    //   25: ifeq +127 -> 152
    //   28: getstatic 20	cp:a	[I
    //   31: iconst_2
    //   32: iaload
    //   33: invokestatic 44	fn:g	(I)Lfc;
    //   36: dup
    //   37: astore_2
    //   38: invokestatic 32	cp:a	(Ljava/lang/Object;)Z
    //   41: ifeq +111 -> 152
    //   44: aload_2
    //   45: getfield 21	dt:eg	I
    //   48: invokestatic 42	dt:g	()Ldt;
    //   51: getfield 21	dt:eg	I
    //   54: isub
    //   55: invokestatic 45	java/lang/Math:abs	(I)I
    //   58: getstatic 20	cp:a	[I
    //   61: iconst_3
    //   62: iaload
    //   63: invokestatic 36	cp:c	(II)Z
    //   66: ifeq +28 -> 94
    //   69: aload_2
    //   70: getfield 22	dt:ey	I
    //   73: invokestatic 42	dt:g	()Ldt;
    //   76: getfield 22	dt:ey	I
    //   79: isub
    //   80: invokestatic 45	java/lang/Math:abs	(I)I
    //   83: getstatic 20	cp:a	[I
    //   86: iconst_3
    //   87: iaload
    //   88: invokestatic 37	cp:d	(II)Z
    //   91: ifeq +20 -> 111
    //   94: aload_2
    //   95: getfield 21	dt:eg	I
    //   98: aload_2
    //   99: getfield 22	dt:ey	I
    //   102: invokestatic 41	dt:b	(II)Z
    //   105: ldc 1
    //   107: invokevirtual 47	java/lang/String:length	()I
    //   110: pop2
    //   111: invokestatic 39	dl:ae	()Ldl;
    //   114: iload_1
    //   115: getstatic 20	cp:a	[I
    //   118: iconst_4
    //   119: iaload
    //   120: invokevirtual 40	dl:b	(II)V
    //   123: invokestatic 43	et:d	()V
    //   126: lconst_1
    //   127: invokestatic 48	java/lang/Thread:sleep	(J)V
    //   130: ldc 1
    //   132: invokevirtual 47	java/lang/String:length	()I
    //   135: pop
    //   136: ldc 4
    //   138: invokevirtual 47	java/lang/String:length	()I
    //   141: ineg
    //   142: iflt +10 -> 152
    //   145: return
    //   146: ldc 1
    //   148: invokevirtual 47	java/lang/String:length	()I
    //   151: pop2
    //   152: getstatic 20	cp:a	[I
    //   155: iconst_0
    //   156: iaload
    //   157: istore_2
    //   158: iload_2
    //   159: getstatic 27	fn:bv	Lci;
    //   162: invokevirtual 49	java/util/Vector:size	()I
    //   165: invokestatic 31	cp:a	(II)Z
    //   168: ifeq +75 -> 243
    //   171: getstatic 27	fn:bv	Lci;
    //   174: iload_2
    //   175: invokevirtual 28	ci:elementAt	(I)Ljava/lang/Object;
    //   178: checkcast 10	e
    //   181: dup
    //   182: astore_3
    //   183: getfield 24	e:s	Z
    //   186: invokestatic 33	cp:b	(I)Z
    //   189: ifeq +24 -> 213
    //   192: aload_3
    //   193: getfield 25	e:x	I
    //   196: invokestatic 30	cp:a	(I)Z
    //   199: ifeq +14 -> 213
    //   202: aload_3
    //   203: getfield 23	e:j	I
    //   206: invokestatic 33	cp:b	(I)Z
    //   209: ifeq +4 -> 213
    //   212: return
    //   213: iinc 2 1
    //   216: ldc 1
    //   218: invokevirtual 47	java/lang/String:length	()I
    //   221: pop
    //   222: ldc 2
    //   224: invokevirtual 47	java/lang/String:length	()I
    //   227: ineg
    //   228: bipush 81
    //   230: bipush 7
    //   232: ixor
    //   233: bipush 35
    //   235: bipush 113
    //   237: ixor
    //   238: ixor
    //   239: if_icmple -81 -> 158
    //   242: return
    //   243: iinc 1 1
    //   246: ldc 1
    //   248: invokevirtual 47	java/lang/String:length	()I
    //   251: pop
    //   252: ldc 3
    //   254: invokevirtual 47	java/lang/String:length	()I
    //   257: ldc 3
    //   259: invokevirtual 47	java/lang/String:length	()I
    //   262: if_icmpeq -256 -> 6
    //   265: return
    //   266: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	267	0	this	cp
    //   5	239	1	i	int
    //   37	62	2	localfc	fc
    //   157	57	2	j	int
    //   182	21	3	locale	e
    //   146	1	5	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   126	130	146	java/lang/InterruptedException
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(16);
    a();
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 <= paramInt2;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\cp.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */