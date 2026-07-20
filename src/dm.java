import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public final class dm
  extends gq
  implements Runnable
{
  public static boolean a;
  public static dm b;
  public fa c;
  private static int[] h;
  private int i = h[0];
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: ldc2_w 18
    //   3: invokestatic 49	java/lang/Thread:sleep	(J)V
    //   6: ldc 1
    //   8: invokevirtual 47	java/lang/String:length	()I
    //   11: pop
    //   12: ldc 2
    //   14: invokevirtual 47	java/lang/String:length	()I
    //   17: ifge +10 -> 27
    //   20: return
    //   21: ldc 1
    //   23: invokevirtual 47	java/lang/String:length	()I
    //   26: pop2
    //   27: getstatic 26	dm:h	[I
    //   30: iconst_0
    //   31: iaload
    //   32: putstatic 23	dm:a	Z
    //   35: getstatic 23	dm:a	Z
    //   38: invokestatic 36	dm:d	(I)Z
    //   41: ifeq +159 -> 200
    //   44: invokestatic 48	java/lang/System:currentTimeMillis	()J
    //   47: lstore_1
    //   48: aload_0
    //   49: getfield 25	dm:c	Lfa;
    //   52: invokevirtual 38	fa:a	()V
    //   55: invokestatic 48	java/lang/System:currentTimeMillis	()J
    //   58: lload_1
    //   59: lsub
    //   60: lstore_3
    //   61: lload_3
    //   62: getstatic 28	dt:da	I
    //   65: i2l
    //   66: invokestatic 33	dm:a	(JJ)I
    //   69: invokestatic 35	dm:c	(I)Z
    //   72: ifeq +26 -> 98
    //   75: getstatic 28	dt:da	I
    //   78: i2l
    //   79: lload_3
    //   80: lsub
    //   81: ldc 1
    //   83: invokevirtual 47	java/lang/String:length	()I
    //   86: pop
    //   87: sipush 172
    //   90: sipush 168
    //   93: ixor
    //   94: ifne +5 -> 99
    //   97: return
    //   98: lconst_1
    //   99: invokestatic 49	java/lang/Thread:sleep	(J)V
    //   102: ldc 1
    //   104: invokevirtual 47	java/lang/String:length	()I
    //   107: pop
    //   108: ldc 2
    //   110: invokevirtual 47	java/lang/String:length	()I
    //   113: ldc 2
    //   115: invokevirtual 47	java/lang/String:length	()I
    //   118: ineg
    //   119: if_icmpgt -84 -> 35
    //   122: return
    //   123: ldc 1
    //   125: invokevirtual 47	java/lang/String:length	()I
    //   128: pop2
    //   129: ldc 1
    //   131: invokevirtual 47	java/lang/String:length	()I
    //   134: pop
    //   135: ldc 4
    //   137: invokevirtual 47	java/lang/String:length	()I
    //   140: ineg
    //   141: iflt -106 -> 35
    //   144: return
    //   145: ldc 1
    //   147: invokevirtual 47	java/lang/String:length	()I
    //   150: pop2
    //   151: ldc2_w 20
    //   154: invokestatic 49	java/lang/Thread:sleep	(J)V
    //   157: ldc 1
    //   159: invokevirtual 47	java/lang/String:length	()I
    //   162: pop
    //   163: ldc 3
    //   165: invokevirtual 47	java/lang/String:length	()I
    //   168: ifgt -133 -> 35
    //   171: return
    //   172: ldc 1
    //   174: invokevirtual 47	java/lang/String:length	()I
    //   177: pop2
    //   178: ldc 1
    //   180: invokevirtual 47	java/lang/String:length	()I
    //   183: pop
    //   184: ldc 2
    //   186: invokevirtual 47	java/lang/String:length	()I
    //   189: ineg
    //   190: ldc 2
    //   192: invokevirtual 47	java/lang/String:length	()I
    //   195: ineg
    //   196: if_icmpeq -161 -> 35
    //   199: return
    //   200: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	this	dm
    //   47	12	1	l1	long
    //   21	1	3	localInterruptedException1	InterruptedException
    //   60	20	3	l2	long
    //   123	1	4	localInterruptedException2	InterruptedException
    //   145	1	5	localException	Exception
    //   172	1	6	localInterruptedException3	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   0	6	21	java/lang/InterruptedException
    //   61	102	123	java/lang/InterruptedException
    //   44	129	145	java/lang/Exception
    //   151	157	172	java/lang/InterruptedException
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(89);
    a();
  }
  
  public final int b()
  {
    if (a(this.i, h[0])) {
      return getHeight();
    }
    return h[1];
  }
  
  protected final void a(int paramInt)
  {
    this.c.b(paramInt);
  }
  
  protected final void pointerDragged(int paramInt1, int paramInt2)
  {
    paramInt1 /= this.i;
    paramInt2 /= this.i;
    this.c.c(paramInt1, paramInt2);
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  protected final void b(int paramInt)
  {
    this.c.c(paramInt);
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt < 0;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static void f()
  {
    h = new int[2];
    h[0] = " ".length();
    h[1] = ((0x57 ^ 0x31 ^ 0x49 ^ 0x74) & (0x60 ^ 0xD ^ 0x2E ^ 0x18 ^ -" ".length()));
  }
  
  protected final void pointerPressed(int paramInt1, int paramInt2)
  {
    paramInt1 /= this.i;
    paramInt2 /= this.i;
    this.c.d(paramInt1, paramInt2);
  }
  
  protected final void pointerReleased(int paramInt1, int paramInt2)
  {
    paramInt1 /= this.i;
    paramInt2 /= this.i;
    this.c.b(paramInt1, paramInt2);
  }
  
  public dm()
  {
    setFullScreenMode(h[0]);
    cf.c = this.i = h[0];
  }
  
  public final int c()
  {
    if (a(this.i, h[0])) {
      return getWidth();
    }
    return h[1];
  }
  
  public static dm d()
  {
    if (a(b)) {
      b = new dm();
    }
    return b;
  }
  
  protected final void a(Graphics paramGraphics)
  {
    this.c.a(paramGraphics);
  }
  
  public static void e() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\dm.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */