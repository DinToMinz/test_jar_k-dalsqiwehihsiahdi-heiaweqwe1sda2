import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class bj
{
  DataInputStream a = null;
  ByteArrayOutputStream b = null;
  DataOutputStream c = null;
  public byte d;
  private ByteArrayInputStream e = null;
  
  public final DataInputStream a()
  {
    return this.a;
  }
  
  public bj() {}
  
  public bj(byte paramByte, byte[] paramArrayOfByte)
  {
    this.d = paramByte;
    this.e = new ByteArrayInputStream(paramArrayOfByte);
    this.a = new DataInputStream(this.e);
  }
  
  public bj(byte paramByte)
  {
    this.d = paramByte;
    this.b = new ByteArrayOutputStream();
    this.c = new DataOutputStream(this.b);
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  public static void b() {}
  
  static
  {
    cs.a(44);
    b();
  }
  
  /* Error */
  public final void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 11	bj:a	Ljava/io/DataInputStream;
    //   4: invokestatic 16	bj:a	(Ljava/lang/Object;)Z
    //   7: ifeq +10 -> 17
    //   10: aload_0
    //   11: getfield 11	bj:a	Ljava/io/DataInputStream;
    //   14: invokevirtual 22	java/io/DataInputStream:close	()V
    //   17: aload_0
    //   18: getfield 13	bj:c	Ljava/io/DataOutputStream;
    //   21: invokestatic 16	bj:a	(Ljava/lang/Object;)Z
    //   24: ifeq +10 -> 34
    //   27: aload_0
    //   28: getfield 13	bj:c	Ljava/io/DataOutputStream;
    //   31: invokevirtual 24	java/io/DataOutputStream:close	()V
    //   34: return
    //   35: ldc 1
    //   37: invokevirtual 26	java/lang/String:length	()I
    //   40: pop2
    //   41: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	bj
    //   35	1	1	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   0	34	35	java/io/IOException
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bj.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */