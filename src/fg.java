public final class fg
  implements Runnable
{
  private static int[] a;
  private final ao b;
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static void c()
  {
    a = new int[5];
    a[0] = (-(0xB675 & 0x5DBB) & 0xBFF6 & 0x55FF);
    a[1] = (81 + 124 - 169 + 133 ^ 34 + '²' - 209 + 186);
    a[2] = " ".length();
    a[3] = (8 + 82 - 64 + 147 ^ 41 + 14 - 0 + 126);
    a[4] = ((18 + 46 - -45 + 114 ^ 116 + '' - 214 + 105) & (0x46 ^ 0x54 ^ 0xF7 ^ 0xA8 ^ -" ".length()));
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 42	fn:j	()Lfn;
    //   3: invokevirtual 41	fn:ai	()V
    //   6: getstatic 23	fg:a	[I
    //   9: iconst_0
    //   10: iaload
    //   11: invokestatic 35	dt:j	(I)Lci;
    //   14: dup
    //   15: astore_1
    //   16: invokevirtual 45	java/util/Vector:size	()I
    //   19: istore_2
    //   20: aload_0
    //   21: getfield 24	fg:b	Lao;
    //   24: putstatic 25	fn:bt	Lao;
    //   27: iload_2
    //   28: getstatic 23	fg:a	[I
    //   31: iconst_1
    //   32: iaload
    //   33: invokestatic 38	fg:b	(II)Z
    //   36: ifeq +153 -> 189
    //   39: getstatic 23	fg:a	[I
    //   42: iconst_2
    //   43: iaload
    //   44: putstatic 26	fn:cb	Z
    //   47: getstatic 23	fg:a	[I
    //   50: iconst_3
    //   51: iaload
    //   52: anewarray 4	ao
    //   55: putstatic 27	fn:cr	[Lao;
    //   58: getstatic 23	fg:a	[I
    //   61: iconst_4
    //   62: iaload
    //   63: istore_2
    //   64: getstatic 23	fg:a	[I
    //   67: iconst_4
    //   68: iaload
    //   69: istore_3
    //   70: iload_3
    //   71: getstatic 23	fg:a	[I
    //   74: iconst_1
    //   75: iaload
    //   76: invokestatic 37	fg:a	(II)Z
    //   79: ifeq +77 -> 156
    //   82: aload_1
    //   83: aload_1
    //   84: invokevirtual 45	java/util/Vector:size	()I
    //   87: getstatic 23	fg:a	[I
    //   90: iconst_2
    //   91: iaload
    //   92: isub
    //   93: invokevirtual 28	ci:elementAt	(I)Ljava/lang/Object;
    //   96: checkcast 4	ao
    //   99: astore 4
    //   101: getstatic 27	fn:cr	[Lao;
    //   104: iload_2
    //   105: iinc 2 1
    //   108: aload 4
    //   110: aastore
    //   111: invokestatic 34	dt:g	()Ldt;
    //   114: getfield 22	dt:w	[Lao;
    //   117: aload 4
    //   119: getfield 19	ao:n	I
    //   122: aconst_null
    //   123: aastore
    //   124: aload_1
    //   125: aload_1
    //   126: invokevirtual 45	java/util/Vector:size	()I
    //   129: getstatic 23	fg:a	[I
    //   132: iconst_2
    //   133: iaload
    //   134: isub
    //   135: invokevirtual 29	ci:removeElementAt	(I)V
    //   138: iinc 3 1
    //   141: ldc 1
    //   143: invokevirtual 44	java/lang/String:length	()I
    //   146: pop
    //   147: ldc 2
    //   149: invokevirtual 44	java/lang/String:length	()I
    //   152: ifne -82 -> 70
    //   155: return
    //   156: invokestatic 31	dl:ae	()Ldl;
    //   159: getstatic 25	fn:bt	Lao;
    //   162: getstatic 27	fn:cr	[Lao;
    //   165: invokevirtual 32	dl:c	(Lao;[Lao;)V
    //   168: invokestatic 31	dl:ae	()Ldl;
    //   171: invokestatic 34	dt:g	()Ldt;
    //   174: getfield 21	dt:cs	Ldt;
    //   177: getfield 20	dt:ci	Ljava/lang/String;
    //   180: invokevirtual 33	dl:r	(Ljava/lang/String;)V
    //   183: ldc2_w 17
    //   186: invokestatic 46	r:a	(J)V
    //   189: return
    //   190: ldc 1
    //   192: invokevirtual 44	java/lang/String:length	()I
    //   195: pop2
    //   196: ldc 3
    //   198: invokestatic 40	fn:a	(Ljava/lang/String;)V
    //   201: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	fg
    //   15	111	1	localci	ci
    //   19	86	2	i	int
    //   69	70	3	j	int
    //   99	19	4	localao	ao
    //   190	1	5	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	189	190	java/lang/Exception
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(50);
    a();
  }
  
  fg(ao paramao)
  {
    this.b = paramao;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\fg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */