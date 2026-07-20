public final class bu
  extends r
{
  private static int[] v;
  private long w;
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: invokestatic 57	r:k	()Z
    //   3: invokestatic 40	bu:d	(I)Z
    //   6: ifeq +25 -> 31
    //   9: getstatic 21	bu:v	[I
    //   12: iconst_4
    //   13: iaload
    //   14: invokestatic 56	r:a	(Z)V
    //   17: ldc2_w 17
    //   20: invokestatic 52	java/lang/Thread:sleep	(J)V
    //   23: return
    //   24: ldc 1
    //   26: invokevirtual 50	java/lang/String:length	()I
    //   29: pop2
    //   30: return
    //   31: aload_0
    //   32: getfield 32	r:d	I
    //   35: getstatic 31	et:o	S
    //   38: invokestatic 39	bu:c	(II)Z
    //   41: ifeq +182 -> 223
    //   44: aload_0
    //   45: getfield 33	r:f	I
    //   48: getstatic 30	et:b	B
    //   51: invokestatic 39	bu:c	(II)Z
    //   54: ifeq +169 -> 223
    //   57: invokestatic 48	dt:g	()Ldt;
    //   60: getfield 28	dt:eg	I
    //   63: getstatic 23	dn:a	I
    //   66: invokestatic 39	bu:c	(II)Z
    //   69: ifeq +18 -> 87
    //   72: invokestatic 48	dt:g	()Ldt;
    //   75: getfield 29	dt:ey	I
    //   78: getstatic 26	dn:u	I
    //   81: invokestatic 41	bu:d	(II)Z
    //   84: ifeq +94 -> 178
    //   87: getstatic 23	dn:a	I
    //   90: getstatic 21	bu:v	[I
    //   93: iconst_0
    //   94: iaload
    //   95: invokestatic 41	bu:d	(II)Z
    //   98: ifeq +48 -> 146
    //   101: getstatic 26	dn:u	I
    //   104: getstatic 21	bu:v	[I
    //   107: iconst_0
    //   108: iaload
    //   109: invokestatic 41	bu:d	(II)Z
    //   112: ifeq +34 -> 146
    //   115: getstatic 23	dn:a	I
    //   118: getstatic 26	dn:u	I
    //   121: invokestatic 47	dt:b	(II)Z
    //   124: ldc 1
    //   126: invokevirtual 50	java/lang/String:length	()I
    //   129: pop2
    //   130: ldc 1
    //   132: invokevirtual 50	java/lang/String:length	()I
    //   135: pop
    //   136: bipush 57
    //   138: bipush 61
    //   140: ixor
    //   141: ineg
    //   142: ifle +22 -> 164
    //   145: return
    //   146: invokestatic 48	dt:g	()Ldt;
    //   149: getfield 28	dt:eg	I
    //   152: putstatic 23	dn:a	I
    //   155: invokestatic 48	dt:g	()Ldt;
    //   158: getfield 29	dt:ey	I
    //   161: putstatic 26	dn:u	I
    //   164: ldc2_w 15
    //   167: invokestatic 52	java/lang/Thread:sleep	(J)V
    //   170: return
    //   171: ldc 1
    //   173: invokevirtual 50	java/lang/String:length	()I
    //   176: pop2
    //   177: return
    //   178: invokestatic 46	dn:l	()V
    //   181: invokestatic 51	java/lang/System:currentTimeMillis	()J
    //   184: aload_0
    //   185: getfield 22	bu:w	J
    //   188: lsub
    //   189: ldc2_w 19
    //   192: invokestatic 37	bu:a	(JJ)I
    //   195: invokestatic 42	bu:e	(I)Z
    //   198: ifeq +45 -> 243
    //   201: getstatic 25	dn:e	Ldn;
    //   204: ldc 1
    //   206: invokevirtual 50	java/lang/String:length	()I
    //   209: pop2
    //   210: ldc 4
    //   212: invokestatic 45	dn:d	(Ljava/lang/String;)V
    //   215: aload_0
    //   216: invokestatic 51	java/lang/System:currentTimeMillis	()J
    //   219: putfield 22	bu:w	J
    //   222: return
    //   223: aload_0
    //   224: aload_0
    //   225: getfield 32	r:d	I
    //   228: aload_0
    //   229: getfield 33	r:f	I
    //   232: aload_0
    //   233: getfield 36	r:t	I
    //   236: aload_0
    //   237: getfield 35	r:o	I
    //   240: invokevirtual 55	r:a	(IIII)V
    //   243: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	this	bu
    //   24	1	1	localInterruptedException1	InterruptedException
    //   171	1	2	localInterruptedException2	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   17	23	24	java/lang/InterruptedException
    //   164	170	171	java/lang/InterruptedException
  }
  
  private static void q()
  {
    v = new int[5];
    v[0] = (-" ".length());
    v[1] = (0x90 ^ 0xC2 ^ 0x9D ^ 0x89);
    v[2] = (0xEFFD & 0x15DE);
    v[3] = (-(0xD57F & 0x3EA2) & 0xBF73 & 0x56BD);
    v[4] = " ".length();
  }
  
  public static void c() {}
  
  static
  {
    cs.a(39);
    c();
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public final void d()
  {
    super.a();
    if ((!d(dn.v, v[0])) || (!d(dn.a, v[0])) || (c(dn.u, v[0])))
    {
      dn.v = v[1];
      dn.a = v[2];
      dn.u = v[3];
    }
    this.d = dn.v;
    this.f = dn.at;
    this.h = et.f(dn.v);
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt >= 0;
  }
  
  public final String toString()
  {
    return "Auto đứng chờ pk";
  }
  
  public static void p() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bu.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */