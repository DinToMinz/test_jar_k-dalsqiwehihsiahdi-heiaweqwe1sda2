public final class ai
  implements Runnable
{
  private static int[] a;
  private au b;
  private ci c;
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static void d()
  {
    a = new int[1];
    a[0] = ((0xF4 ^ 0x87 ^ 0x57 ^ 0x2E) & (0x64 ^ 0x6B ^ 0x91 ^ 0x94 ^ -" ".length()));
  }
  
  public ai(au paramau)
  {
    this.b = paramau;
    this.c = new ci();
  }
  
  public final void a()
  {
    this.c.removeAllElements();
  }
  
  public static void b() {}
  
  static
  {
    cs.a(163);
    b();
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt > 0;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 17	ai:b	Lau;
    //   4: getfield 19	au:d	Z
    //   7: invokestatic 20	ai:a	(I)Z
    //   10: ifeq +103 -> 113
    //   13: aload_0
    //   14: getfield 17	ai:b	Lau;
    //   17: invokestatic 25	au:b	(Lau;)Z
    //   20: invokestatic 20	ai:a	(I)Z
    //   23: ifeq +63 -> 86
    //   26: aload_0
    //   27: getfield 18	ai:c	Lci;
    //   30: invokevirtual 35	java/util/Vector:size	()I
    //   33: invokestatic 22	ai:b	(I)Z
    //   36: ifeq +50 -> 86
    //   39: aload_0
    //   40: getfield 18	ai:c	Lci;
    //   43: getstatic 16	ai:a	[I
    //   46: iconst_0
    //   47: iaload
    //   48: invokevirtual 28	ci:elementAt	(I)Ljava/lang/Object;
    //   51: checkcast 5	bj
    //   54: astore_1
    //   55: aload_0
    //   56: getfield 18	ai:c	Lci;
    //   59: getstatic 16	ai:a	[I
    //   62: iconst_0
    //   63: iaload
    //   64: invokevirtual 30	ci:removeElementAt	(I)V
    //   67: aload_0
    //   68: getfield 17	ai:b	Lau;
    //   71: aload_1
    //   72: invokestatic 24	au:a	(Lau;Lbj;)V
    //   75: ldc 1
    //   77: invokevirtual 33	java/lang/String:length	()I
    //   80: pop
    //   81: aconst_null
    //   82: ifnull -56 -> 26
    //   85: return
    //   86: ldc2_w 14
    //   89: invokestatic 34	java/lang/Thread:sleep	(J)V
    //   92: ldc 1
    //   94: invokevirtual 33	java/lang/String:length	()I
    //   97: pop
    //   98: ldc 2
    //   100: invokevirtual 33	java/lang/String:length	()I
    //   103: ineg
    //   104: bipush 78
    //   106: bipush 74
    //   108: ixor
    //   109: if_icmple -109 -> 0
    //   112: return
    //   113: return
    //   114: ldc 1
    //   116: invokevirtual 33	java/lang/String:length	()I
    //   119: pop2
    //   120: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	ai
    //   54	18	1	localbj	bj
    //   114	1	2	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   0	113	114	java/lang/InterruptedException
  }
  
  public final void a(bj parambj)
  {
    this.c.addElement(parambj);
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ai.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */