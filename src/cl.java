import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

public final class cl
{
  private static Random a;
  private static int[] b;
  
  public static void a(String paramString, short paramShort)
  {
    aa.a(paramString, "sms://".concat(String.valueOf(paramShort)), new bb("", aw.k(), b[8], null), new bb("", aw.k(), b[9], null));
  }
  
  public static int a()
  {
    return b[1] + a.nextInt(b[2]);
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt >= 0;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static String a(String paramString)
  {
    String str1 = "";
    String str2 = "";
    if (e(paramString.equals(""))) {
      return str1;
    }
    if (c(paramString.charAt(b[4]), b[5]))
    {
      str2 = "-";
      paramString = paramString.substring(b[6]);
    }
    int i = paramString.length() - b[6];
    while (c(i))
    {
      if ((b((paramString.length() - b[6] - i) % b[7])) && (d(paramString.length() - b[6] - i)))
      {
        str1 = paramString.charAt(i) + "." + str1;
        "".length();
        if (null != null) {
          return null;
        }
      }
      else
      {
        str1 = paramString.charAt(i) + str1;
      }
      i--;
      "".length();
      if (" ".length() <= 0) {
        return null;
      }
    }
    return str2 + str1;
  }
  
  public static void b()
  {
    e();
    a = new Random();
  }
  
  static
  {
    cs.a(3);
    b();
  }
  
  private static void e()
  {
    b = new int[12];
    b[0] = (0x1B ^ 0x3C ^ 0xA6 ^ 0x88);
    b[1] = (-(0x1D ^ 0x1A));
    b[2] = (0x95 ^ 0x9B);
    b[3] = (-" ".length());
    b[4] = ((86 + 9 - 83 + 174 ^ 76 + 31 - 29 + 93) & (79 + '¡' - 122 + 55 ^ '¥' + 94 - 175 + 104 ^ -" ".length()));
    b[5] = (0x8F ^ 0xA2);
    b[6] = " ".length();
    b[7] = "   ".length();
    b[8] = (-(0xA1B7 & 0x5F4D) & 0xFFFFFFFF & 0x15BFF);
    b[9] = (0xFFFFFFFC & 0x15AFF);
    b[10] = (0x83 ^ 0xA4 ^ 0x98 ^ 0x83);
    b[11] = (0xE ^ 0x16);
  }
  
  public static String a(int paramInt)
  {
    int i = b[4];
    if (a(paramInt, b[10]))
    {
      i = paramInt / b[10];
      paramInt %= b[10];
    }
    int j = b[4];
    if (a(i, b[10]))
    {
      j = i / b[10];
      i %= b[10];
    }
    int k = b[4];
    if (a(j, b[11]))
    {
      k = j / b[11];
      j %= b[11];
    }
    String str = "";
    if (d(k))
    {
      str = str + k;
      str = str + "d";
      str = str + j + "h";
      "".length();
      if ((0x50 ^ 0x54) < 0) {
        return null;
      }
    }
    else if (d(j))
    {
      str = str + j;
      str = str + "h";
      str = str + i + "'";
      "".length();
      if (((0x81 ^ 0xBF) & (0x2A ^ 0x14 ^ 0xFFFFFFFF)) == (0x96 ^ 0x92)) {
        return null;
      }
    }
    else
    {
      if (a(i, b[0]))
      {
        str = str + i;
        "".length();
        if (-" ".length() >= 0) {
          return null;
        }
      }
      else
      {
        str = str + "0" + i;
      }
      str = str + ":";
      if (a(paramInt, b[0]))
      {
        str = str + paramInt;
        "".length();
        if (((0x8A ^ 0xBB) & (0xA3 ^ 0x92 ^ 0xFFFFFFFF)) >= (0x2D ^ 0x29)) {
          return null;
        }
      }
      else
      {
        str = str + "0" + paramInt;
      }
    }
    return str;
  }
  
  public static String[] a(String paramString1, String paramString2)
  {
    ci localci = new ci();
    int i = paramString1.indexOf(paramString2);
    while (c(i))
    {
      localci.addElement(paramString1.substring(b[4], i));
      i = (paramString1 = paramString1.substring(i + paramString2.length())).indexOf(paramString2);
      "".length();
      if (" ".length() > (0x7C ^ 0x78)) {
        return null;
      }
    }
    localci.addElement(paramString1);
    String[] arrayOfString = new String[localci.size()];
    if (d(localci.size()))
    {
      paramString1 = b[4];
      while (d(paramString1, localci.size()))
      {
        arrayOfString[paramString1] = ((String)localci.elementAt(paramString1));
        paramString1++;
        "".length();
        if ((43 + 65 - 84 + 113 ^ 12 + 98 - 19 + 49) == 0) {
          return null;
        }
      }
    }
    return arrayOfString;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  public static int c()
  {
    return a.nextInt(b[0]);
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  /* Error */
  public static byte[] a(bj parambj)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 33	bj:a	Ljava/io/DataInputStream;
    //   4: invokevirtual 57	java/io/DataInputStream:readInt	()I
    //   7: newarray <illegal type>
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 33	bj:a	Ljava/io/DataInputStream;
    //   14: aload_1
    //   15: invokevirtual 56	java/io/DataInputStream:read	([B)I
    //   18: ldc 3
    //   20: invokevirtual 62	java/lang/String:length	()I
    //   23: pop2
    //   24: aload_1
    //   25: areturn
    //   26: ldc 3
    //   28: invokevirtual 62	java/lang/String:length	()I
    //   31: pop2
    //   32: aconst_null
    //   33: areturn
    //   34: dup
    //   35: astore_1
    //   36: invokevirtual 71	java/lang/Throwable:printStackTrace	()V
    //   39: aconst_null
    //   40: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	parambj	bj
    //   9	27	1	localObject	Object
    //   26	1	2	localEOFException	java.io.EOFException
    //   34	1	3	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   0	25	26	java/io/EOFException
    //   0	25	34	java/io/IOException
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static byte[] b(bj parambj)
  {
    try
    {
      bj localbj = parambj;
      localObject = new byte[parambj.a.readInt()];
      localbj = parambj;
      "".length();
      return (byte[])localObject;
    }
    catch (IOException localIOException)
    {
      Object localObject;
      (localObject = localIOException).printStackTrace();
    }
    return null;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public static byte[] a(DataInputStream paramDataInputStream)
  {
    try
    {
      localObject = new byte[paramDataInputStream.readInt()];
      "".length();
      return (byte[])localObject;
    }
    catch (IOException localIOException)
    {
      Object localObject;
      (localObject = localIOException).printStackTrace();
    }
    return null;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i;
    while (b(i = paramString1.indexOf(paramString2), b[3]))
    {
      new StringBuffer();
      "".length();
      paramString1 = paramString1.substring(i + paramString2.length());
      "".length();
      if (-" ".length() != -" ".length()) {
        return null;
      }
    }
    "".length();
    return localStringBuffer.toString();
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void b(String paramString)
  {
    try
    {
      "".length();
      return;
    }
    catch (Exception localException) {}finally
    {
      bv.d.g();
    }
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\cl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */