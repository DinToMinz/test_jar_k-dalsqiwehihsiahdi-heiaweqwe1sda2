import java.io.PrintStream;
import javax.microedition.io.ConnectionNotFoundException;

public class bv
  extends gl
{
  private static int[] n;
  public static String a;
  public static final boolean b;
  public static int c;
  public static bv d;
  public static byte e;
  public static byte f;
  public static final String g;
  public static String h;
  public static String i;
  public static byte j;
  
  public bv()
  {
    au.a().i = cu.e();
    d = this;
    ep.b();
    i = f("agent.txt");
    f = Byte.parseByte(f("provider.txt"));
    System.out.println("AGENT: " + i + ", PROVIDER: " + f);
    dy.h = n[0];
    aw.ai = new dy();
    dm.d().c = aw.k();
    if (a(dm.a)) {
      new Thread(dm.d()).start();
    }
  }
  
  public static void a()
  {
    j();
    b = n[0];
    g = "1.8.8";
    j = n[1];
    c = n[2];
    a = "";
    f = n[0];
    e = n[0];
    h = "";
  }
  
  static
  {
    cs.a(19);
    a();
  }
  
  protected void b()
  {
    gb.a(this).a(dm.d());
  }
  
  public static void a(String paramString)
  {
    if (a(paramString.equals(""))) {
      try
      {
        "".length();
        d.g();
        return;
      }
      catch (ConnectionNotFoundException localConnectionNotFoundException)
      {
        (paramString = localConnectionNotFoundException).printStackTrace();
      }
    }
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static void j()
  {
    n = new int[3];
    n[0] = ((0x86 ^ 0x82) & (0x39 ^ 0x3D ^ 0xFFFFFFFF));
    n[1] = " ".length();
    n[2] = (-(0xC47E & 0x7F95) & 0xFD7F & 0x7EFF);
  }
  
  protected void c() {}
  
  protected void a(boolean paramBoolean) {}
  
  /* Error */
  private static String f(String paramString)
  {
    // Byte code:
    //   0: new 27	java/lang/StringBuffer
    //   3: dup
    //   4: ldc 5
    //   6: invokespecial 73	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   9: aload_0
    //   10: invokevirtual 75	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   13: invokevirtual 76	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   16: invokestatic 57	df:a	(Ljava/lang/String;)Ljava/io/InputStream;
    //   19: astore_0
    //   20: aload_0
    //   21: invokevirtual 66	java/io/InputStream:available	()I
    //   24: newarray <illegal type>
    //   26: astore_1
    //   27: aload_0
    //   28: aload_1
    //   29: invokevirtual 67	java/io/InputStream:read	([B)I
    //   32: ldc 1
    //   34: invokevirtual 72	java/lang/String:length	()I
    //   37: pop2
    //   38: new 26	java/lang/String
    //   41: dup
    //   42: aload_1
    //   43: ldc 8
    //   45: invokespecial 70	java/lang/String:<init>	([BLjava/lang/String;)V
    //   48: astore_0
    //   49: ldc 1
    //   51: invokevirtual 72	java/lang/String:length	()I
    //   54: pop
    //   55: ldc 3
    //   57: invokevirtual 72	java/lang/String:length	()I
    //   60: ldc 3
    //   62: invokevirtual 72	java/lang/String:length	()I
    //   65: if_icmpeq +14 -> 79
    //   68: aconst_null
    //   69: areturn
    //   70: ldc 1
    //   72: invokevirtual 72	java/lang/String:length	()I
    //   75: pop2
    //   76: ldc 1
    //   78: astore_0
    //   79: aload_0
    //   80: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	paramString	String
    //   26	17	1	arrayOfByte	byte[]
    //   70	1	2	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   20	49	70	java/io/IOException
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */