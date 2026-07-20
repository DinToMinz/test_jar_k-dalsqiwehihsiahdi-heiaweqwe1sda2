import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public final class ey
  extends r
{
  public static byte v;
  public static byte w;
  public static byte x;
  public static String y;
  private static int[] aa;
  public static int z;
  
  private static void r()
  {
    aa = new int[9];
    aa[0] = (0x39 ^ 0x32);
    aa[1] = (0xB1 ^ 0xBD);
    aa[2] = " ".length();
    aa[3] = ((0x47 ^ 0x1A) & (0xD9 ^ 0x84 ^ 0xFFFFFFFF));
    aa[4] = (-" ".length());
    aa[5] = (110 + 9 - 52 + 78 ^ 32 + 11 - -89 + 31);
    aa[6] = (-(0xFF27 & 0x68DB) & 0xEDFE & 0x7FDF);
    aa[7] = (-(0xBDD7 & 0x662A) & 0xE7EB & 0x3FFD);
    aa[8] = "  ".length();
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void c()
  {
    Object localObject = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream((OutputStream)localObject);
    try
    {
      if (a(y))
      {
        "".length();
        if (" ".length() > ((0x20 ^ 0x37) & (0x35 ^ 0x22 ^ 0xFFFFFFFF))) {
          break label60;
        }
      }
      label60:
      "".writeUTF(y);
      if (a(cw.a))
      {
        "".length();
        if ((0x12 ^ 0x16) >= ((0x35 ^ 0x64) & (0xB ^ 0x5A ^ 0xFFFFFFFF))) {
          break label106;
        }
      }
      label106:
      "".writeUTF(cw.a);
      if (a(cw.b))
      {
        "".length();
        if (((0x3A ^ 0x4) & (0x95 ^ 0xAB ^ 0xFFFFFFFF)) == ((0xA ^ 0x4A) & (0x2D ^ 0x6D ^ 0xFFFFFFFF))) {
          break label161;
        }
      }
      label161:
      "".writeUTF(cw.b);
      localDataOutputStream.writeByte(w);
      localDataOutputStream.writeByte(x);
      localDataOutputStream.writeInt(z);
      localDataOutputStream.writeByte(v);
      localDataOutputStream.flush();
      ((OutputStream)localObject).flush();
      df.a("V6Rec", ((ByteArrayOutputStream)localObject).toByteArray());
      return;
    }
    catch (Exception localException)
    {
      (localObject = localException).printStackTrace();
    }
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public ey()
  {
    super.a();
    this.d = et.o;
    this.f = et.b;
  }
  
  public final void b()
  {
    if (g(dt.aq))
    {
      r.a(aa[2]);
      return;
    }
    if ((d(this.d, et.o)) && (d(this.f, et.b)))
    {
      "".length();
      x.v = aa[3];
      long l = System.currentTimeMillis();
      while (e(fn.j().ao, aa[2]))
      {
        if ((!f(x.v)) || (e(a(System.currentTimeMillis() - l, 20000L)))) {
          return;
        }
        r.a(200L);
        "".length();
        if (" ".length() == "  ".length()) {
          return;
        }
      }
      fn.j().fq = aa[3];
      fn.cr = new ao[aa[1]];
      dl.ae().a(aa[3], (ao[])fn.cr);
      fn.j().ee = aa[2];
      r.a(5000L);
      dl.ae().o();
      "".length();
      return;
    }
    a(this.d, this.f, aa[4], aa[4]);
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  /* Error */
  public static void d()
  {
    // Byte code:
    //   0: invokestatic 110	ey:r	()V
    //   3: new 24	java/io/ByteArrayInputStream
    //   6: dup
    //   7: ldc 7
    //   9: invokestatic 88	df:b	(Ljava/lang/String;)[B
    //   12: invokespecial 112	java/io/ByteArrayInputStream:<init>	([B)V
    //   15: astore_0
    //   16: new 26	java/io/DataInputStream
    //   19: dup
    //   20: aload_0
    //   21: invokespecial 116	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   24: dup
    //   25: astore_1
    //   26: invokevirtual 120	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   29: dup
    //   30: putstatic 71	ey:y	Ljava/lang/String;
    //   33: ldc 1
    //   35: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   38: invokestatic 109	ey:g	(I)Z
    //   41: ifeq +7 -> 48
    //   44: aconst_null
    //   45: putstatic 71	ey:y	Ljava/lang/String;
    //   48: aload_1
    //   49: invokevirtual 120	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   52: dup
    //   53: putstatic 56	cw:a	Ljava/lang/String;
    //   56: ldc 1
    //   58: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   61: invokestatic 109	ey:g	(I)Z
    //   64: ifeq +7 -> 71
    //   67: aconst_null
    //   68: putstatic 56	cw:a	Ljava/lang/String;
    //   71: aload_1
    //   72: invokevirtual 120	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   75: dup
    //   76: putstatic 57	cw:b	Ljava/lang/String;
    //   79: ldc 1
    //   81: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   84: invokestatic 109	ey:g	(I)Z
    //   87: ifeq +7 -> 94
    //   90: aconst_null
    //   91: putstatic 57	cw:b	Ljava/lang/String;
    //   94: aload_1
    //   95: invokevirtual 118	java/io/DataInputStream:readByte	()B
    //   98: putstatic 69	ey:w	B
    //   101: aload_1
    //   102: invokevirtual 118	java/io/DataInputStream:readByte	()B
    //   105: putstatic 70	ey:x	B
    //   108: aload_1
    //   109: invokevirtual 119	java/io/DataInputStream:readInt	()I
    //   112: putstatic 72	ey:z	I
    //   115: aload_1
    //   116: invokevirtual 118	java/io/DataInputStream:readByte	()B
    //   119: putstatic 68	ey:v	B
    //   122: aload_1
    //   123: invokevirtual 117	java/io/DataInputStream:close	()V
    //   126: aload_0
    //   127: invokevirtual 113	java/io/ByteArrayInputStream:close	()V
    //   130: return
    //   131: ldc 1
    //   133: invokevirtual 129	java/lang/String:length	()I
    //   136: pop2
    //   137: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   15	112	0	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   25	98	1	localDataInputStream	java.io.DataInputStream
    //   131	1	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   3	130	131	java/lang/Exception
  }
  
  static
  {
    cs.a(69);
    d();
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt < 0;
  }
  
  public final String toString()
  {
    return "Auto Nhận";
  }
  
  public static void a(String paramString)
  {
    dt localdt = dt.g();
    int j = aa[3];
    do
    {
      if (f(j, fn.ep.size()))
      {
        paramString = null;
        "".length();
        if ("   ".length() >= 0) {
          break;
        }
        return;
      }
      if (g((localObject = (dt)fn.ep.elementAt(j)).ci.equals(paramString)))
      {
        paramString = (String)localObject;
        "".length();
        if (null == null) {
          break;
        }
        return;
      }
      j++;
      "".length();
    } while ((0x6C ^ 0x50 ^ 0x1A ^ 0x22) == (0x81 ^ 0x86 ^ "   ".length()));
    return;
    Object localObject = paramString;
    if (a(paramString))
    {
      ab.x = aa[2];
      return;
    }
    do
    {
      if (f(bc.a(localdt.eg, localdt.ey, ((dt)localObject).eg, ((dt)localObject).ey), aa[5]))
      {
        "".length();
        r.a(1000L);
        "".length();
        if ((0x6B ^ 0x6F) != "   ".length()) {}
      }
      else
      {
        dl.ae().aq(((dt)localObject).fy);
      }
    } while ((f(fn.x)) && (!g(cn.a(null.nextInt(aa[6]) + aa[7]))));
    paramString = new ao[aa[1]];
    j = aa[3];
    int m = aa[3];
    while (c(m, dn.a(cw.a, ",").length))
    {
      int n = aa[3];
      while (c(n, localdt.w.length))
      {
        localObject = localdt.w[n];
        if ((c(j, aa[1])) && (b(localObject)) && (d(((ao)localObject).j.f, Integer.parseInt(dn.a(cw.a, ",")[m]))) && (f(((ao)localObject).l))) {
          paramString[(j++)] = localObject;
        }
        n++;
        "".length();
        if ((('' + 'µ' - 220 + 88 ^ 7 + 108 - 86 + 136) & ('Õ' + 'È' - 238 + 74 ^ 71 + '' - 173 + 106 ^ -" ".length())) != 0) {
          return;
        }
      }
      m++;
      "".length();
      if (-" ".length() > 0) {
        return;
      }
    }
    fn.j().fq = aa[3];
    fn.cr = paramString;
    dl.ae().a(dt.g().a, paramString);
    fn.j().ee = aa[2];
    long l = System.currentTimeMillis();
    while (e(fn.j().ao, aa[2]))
    {
      if ((!f(x.v)) || (e(b(System.currentTimeMillis() - l, 2000L))))
      {
        dl.ae().aa();
        return;
      }
      r.a(200L);
      "".length();
      if ((0x3B ^ 0x59 ^ 0x2C ^ 0x4A) <= ((7 + 57 - 9 + 77 ^ '´' + 43 - 149 + 123) & ('¤' + '­' - 152 + 63 ^ 123 + '­' - 265 + 154 ^ -" ".length()))) {
        return;
      }
    }
    l = System.currentTimeMillis();
    while (d(b(System.currentTimeMillis() - l, 2000L)))
    {
      if (g(x.v)) {
        return;
      }
      r.a(200L);
      "".length();
      if (-"  ".length() > 0) {
        return;
      }
    }
    dl.ae().o();
    l = System.currentTimeMillis();
    while (e(fn.j().ao, aa[8]))
    {
      if ((!f(x.v)) || (e(b(System.currentTimeMillis() - l, 5000L))))
      {
        dl.ae().aa();
        return;
      }
      r.a(200L);
      "".length();
      if (" ".length() > " ".length()) {
        return;
      }
    }
    if (g(cn.a(2000L)))
    {
      int k = aa[3];
      while (c(k, aa[1]))
      {
        if (b(paramString[k]))
        {
          int i = paramString[k].n;
          dt.g().w[i] = null;
        }
        k++;
        "".length();
        if (" ".length() == -" ".length()) {}
      }
    }
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean g(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static boolean p()
  {
    Calendar localCalendar;
    if ((b(y)) && (d((localCalendar = bc.b()).get(aa[0]), w)) && (d(localCalendar.get(aa[1]), x))) {
      return aa[2];
    }
    return aa[3];
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static int b(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public static void q() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ey.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */