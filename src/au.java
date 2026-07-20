import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.microedition.io.Connection;
import javax.microedition.io.SocketConnection;

public final class au
  implements c
{
  private ai q = new ai(this);
  public DataOutputStream a;
  private Thread r;
  private static int[] s;
  private w t = new w(this);
  private byte u;
  public int b;
  public static byte c;
  public boolean d;
  public static int e;
  public boolean f;
  public static au g;
  private Thread v;
  public int h;
  public ac i;
  private byte w;
  public static boolean j;
  public SocketConnection k;
  public DataInputStream l;
  private long x;
  public long m;
  private Thread y;
  private boolean z;
  private Thread aa;
  public static String n;
  public byte[] o = null;
  public String p = "";
  private static Object ab;
  
  private byte a(byte paramByte)
  {
    byte[] arrayOfByte = this.o;
    int i1 = this.u;
    this.u = ((byte)(i1 + s[3]));
    paramByte = (byte)(arrayOfByte[i1] & s[38] ^ paramByte & s[38]);
    if (a(this.u, this.o.length)) {
      this.u = ((byte)(this.u % this.o.length));
    }
    return paramByte;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static void a(au paramau, Thread paramThread)
  {
    paramau.aa = paramThread;
  }
  
  public static void a(au paramau, long paramLong)
  {
    paramau.x = paramLong;
  }
  
  public static byte a(au paramau, byte paramByte)
  {
    byte[] arrayOfByte = paramau.o;
    int i1 = paramau.w;
    paramau.w = ((byte)(i1 + s[3]));
    paramByte = (byte)(arrayOfByte[i1] & s[38] ^ paramByte & s[38]);
    if (a(paramau.w, paramau.o.length)) {
      paramau.w = ((byte)(paramau.w % paramau.o.length));
    }
    return paramByte;
  }
  
  public static au a()
  {
    return g;
  }
  
  public static Thread a(au paramau)
  {
    return paramau.r;
  }
  
  public static void b()
  {
    "".length();
    synchronized (ab)
    {
      ab.notifyAll();
      return;
    }
  }
  
  public static boolean b(au paramau)
  {
    return paramau.z;
  }
  
  public final void c()
  {
    dn.e();
    f();
  }
  
  static void c(au paramau)
  {
    paramau.z = s[3];
  }
  
  public final void a(bj parambj)
  {
    this.q.a(parambj);
  }
  
  public static void b(au paramau, Thread paramThread)
  {
    paramau.y = paramThread;
  }
  
  static long d(au paramau)
  {
    return paramau.x;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  public static Thread e(au paramau)
  {
    return paramau.aa;
  }
  
  private synchronized void b(bj parambj)
  {
    Object localObject = (localObject = parambj).b.toByteArray();
    try
    {
      if (b(this.z))
      {
        this.a.writeByte(a(parambj.d));
        "".length();
        if (-" ".length() <= "  ".length()) {}
      }
      else
      {
        this.a.writeByte(parambj.d);
      }
      if (a(localObject))
      {
        int i1 = localObject.length;
        if ((c(parambj.d, s[37])) && (b(this.z)))
        {
          parambj = a((byte)(i1 >> s[17]));
          this.a.writeByte(parambj);
          parambj = a((byte)i1);
          this.a.writeByte(parambj);
          "".length();
          if ("  ".length() > ((0xE ^ 0x22) & (0x1F ^ 0x33 ^ 0xFFFFFFFF))) {}
        }
        else
        {
          this.a.writeShort(i1);
        }
        if (b(this.z))
        {
          parambj = s[1];
          while (b(parambj, localObject.length))
          {
            localObject[parambj] = a(localObject[parambj]);
            parambj++;
            "".length();
            if (" ".length() == 0) {
              return;
            }
          }
        }
        this.a.write((byte[])localObject);
        this.b += s[11] + localObject.length;
        "".length();
        if (-" ".length() <= " ".length()) {}
      }
      else
      {
        this.a.writeShort(s[1]);
        this.b += s[11];
      }
      this.a.flush();
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }
  
  public static void a(au paramau, bj parambj)
  {
    paramau.b(parambj);
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return paramObject1 != paramObject2;
  }
  
  public final void a(String paramString, int paramInt)
  {
    String str = new String(new char[] { s[2], s[4], s[6], s[8], s[10], s[12], s[14], s[16], s[16], s[19] }) + paramString + new String(new char[] { s[14], s[19] }) + paramInt;
    if (b(aw.aj)) {
      if (a(aw.ah))
      {
        str = str + new String(new char[] { s[21], s[22], s[23], s[12], s[10], s[24], s[25], s[26], s[6], s[10], s[27], s[29], s[22], s[25], s[22] });
        "".length();
        if ("   ".length() < (0xE ^ 0x60 ^ 0xC0 ^ 0xAA)) {}
      }
      else
      {
        str = str + new String(new char[] { s[21], s[34], s[10], s[35], s[22], s[6], s[10], s[2], s[22], s[34], s[10], s[27], s[12], s[24], s[36], s[10] });
      }
    }
    System.out.println(new String(new char[] { s[6], s[4], s[23], s[23], s[10], s[6], s[12], s[19], s[12], s[4], s[19], s[19] }) + str + new String(new char[] { s[19], s[14], s[19], s[19] }) + bv.e);
    if ((a(this.d)) && (a(this.f)))
    {
      this.z = s[1];
      this.k = null;
      this.r = new Thread(new db(this, this));
      this.r.start();
      n = paramString;
      e = paramInt;
      c = bv.e;
    }
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static Thread f(au paramau)
  {
    return paramau.y;
  }
  
  public static void d()
  {
    h();
    g = new au();
    ab = new Object();
  }
  
  static
  {
    cs.a(5);
    d();
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static void c(au paramau, Thread paramThread)
  {
    paramau.v = paramThread;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public static w g(au paramau)
  {
    return paramau.t;
  }
  
  /* Error */
  public static void a(long paramLong)
  {
    // Byte code:
    //   0: getstatic 31	au:ab	Ljava/lang/Object;
    //   3: ldc 1
    //   5: invokevirtual 97	java/lang/String:length	()I
    //   8: pop2
    //   9: getstatic 31	au:ab	Ljava/lang/Object;
    //   12: dup
    //   13: astore_2
    //   14: monitorenter
    //   15: getstatic 31	au:ab	Ljava/lang/Object;
    //   18: lload_0
    //   19: invokevirtual 95	java/lang/Object:wait	(J)V
    //   22: ldc 1
    //   24: invokevirtual 97	java/lang/String:length	()I
    //   27: pop
    //   28: ldc 2
    //   30: invokevirtual 97	java/lang/String:length	()I
    //   33: ineg
    //   34: ifle +10 -> 44
    //   37: return
    //   38: ldc 1
    //   40: invokevirtual 97	java/lang/String:length	()I
    //   43: pop2
    //   44: aload_2
    //   45: monitorexit
    //   46: return
    //   47: astore_0
    //   48: aload_2
    //   49: monitorexit
    //   50: aload_0
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	paramLong	long
    //   13	36	2	Ljava/lang/Object;	Object
    //   38	1	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   15	22	38	java/lang/Exception
    //   15	46	47	finally
  }
  
  public final void e()
  {
    if (a(aw.ai, aw.au)) {
      aw.t.e();
    }
    if (b(j))
    {
      b();
      return;
    }
    j = s[3];
    new Thread(new fh(this)).start();
  }
  
  public final void f()
  {
    this.z = s[1];
    this.d = s[1];
    this.f = s[1];
    this.o = null;
    this.w = s[1];
    this.u = s[1];
    this.q.a();
    try
    {
      if (a(this.k))
      {
        this.k.close();
        this.k = null;
      }
      if (a(this.a))
      {
        this.a.close();
        this.a = null;
      }
      if (a(this.l))
      {
        this.l.close();
        this.l = null;
      }
      if (a(this.y))
      {
        if (b(this.y.isAlive())) {
          this.y.interrupt();
        }
        this.y = null;
      }
      if (a(this.r))
      {
        if (b(this.r.isAlive())) {
          this.r.interrupt();
        }
        this.r = null;
      }
      if (a(this.v))
      {
        if (b(this.v.isAlive())) {
          this.v.interrupt();
        }
        this.v = null;
      }
      if (a(this.aa))
      {
        if (b(this.aa.isAlive())) {
          this.aa.interrupt();
        }
        this.aa = null;
      }
      System.gc();
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static void h()
  {
    s = new int[39];
    s[0] = (0x5B ^ 0x36 ^ 0xDE ^ 0xB9);
    s[1] = ((0x0 ^ 0x2E) & (0x6E ^ 0x40 ^ 0xFFFFFFFF));
    s[2] = ('¡' + 76 - 145 + 123 ^ '' + 89 - 75 + 6);
    s[3] = " ".length();
    s[4] = (0xC0 ^ 0x85 ^ 0x92 ^ 0xB8);
    s[5] = "  ".length();
    s[6] = (0x24 ^ 0x47);
    s[7] = "   ".length();
    s[8] = ('³' + 43 - 52 + 26 ^ 12 + 67 - -20 + 76);
    s[9] = (0x8A ^ 0x8E);
    s[10] = (0x29 ^ 0x4C);
    s[11] = (0x80 ^ 0x85);
    s[12] = (0x7F ^ 0xB);
    s[13] = (0xC2 ^ 0xC4);
    s[14] = (0x59 ^ 0x72 ^ 0xD0 ^ 0xC1);
    s[15] = (126 + 75 - 155 + 87 ^ 2 + 12 - -7 + 109);
    s[16] = (0x5F ^ 0x70);
    s[17] = (0xB ^ 0x22 ^ 0xBD ^ 0x9C);
    s[18] = (0xEB ^ 0x8F ^ 0x7F ^ 0x12);
    s[19] = (92 + 11 - 24 + 108 ^ 83 + 112 - 91 + 51);
    s[20] = (0xCA ^ 0xC5);
    s[21] = (0x4B ^ 0x7C ^ 0x44 ^ 0x48);
    s[22] = (0x11 ^ 0x78);
    s[23] = (0xEF ^ 0xAF ^ 0x14 ^ 0x3A);
    s[24] = (0xB ^ 0x79);
    s[25] = (0x7D ^ 0x64 ^ 106 + 109 - 108 + 20);
    s[26] = (0x35 ^ 0x48 ^ 0x64 ^ 0x78);
    s[27] = (0x42 ^ 0x7F);
    s[28] = (0x73 ^ 0x78);
    s[29] = ('®' + 41 - 201 + 181 ^ 85 + 17 - 67 + 145);
    s[30] = (0xBA ^ 0xB6);
    s[31] = (0x87 ^ 0x8A);
    s[32] = (0x15 ^ 0x1B);
    s[33] = (0x6F ^ 0x7F);
    s[34] = (0x8F ^ 0xAB ^ 0x61 ^ 0x21);
    s[35] = ('Ô' + '' - 346 + 228 ^ 40 + 0 - -13 + 76);
    s[36] = (25 + 16 - 65378 + 8 ^ 29 + '¶' - 134 + 109);
    s[37] = (-(0x11 ^ 0x5A ^ 0x7E ^ 0x2A));
    s[38] = ('' + 104 - 157 + 101 + (0x99 ^ 0xC2) - (24 + 14 - -60 + 30) + (0x45 ^ 0x34));
  }
  
  public static Thread h(au paramau)
  {
    return paramau.v;
  }
  
  public static ai i(au paramau)
  {
    return paramau.q;
  }
  
  public static void g() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\au.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */