import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public final class dv
{
  private static ci a;
  private static int[] b;
  
  public static boolean a(String paramString)
  {
    return a.contains(paramString);
  }
  
  private static void e()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      localDataOutputStream.writeInt(a.size());
      int i = b[0];
      while (a(i, a.size()))
      {
        localDataOutputStream.writeUTF((String)a.elementAt(i));
        i++;
        "".length();
        if ("  ".length() != "  ".length()) {
          return;
        }
      }
      localDataOutputStream.flush();
      localByteArrayOutputStream.flush();
      df.a("V6PKS", localByteArrayOutputStream.toByteArray());
      return;
    }
    catch (Exception localException2)
    {
      Exception localException1;
      (localException1 = localException2).printStackTrace();
    }
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static void f()
  {
    b = new int[1];
    b[0] = ((0xD6 ^ 0x9F ^ 0x7C ^ 0x57) & (0x69 ^ 0x34 ^ 0x75 ^ 0x4A ^ -" ".length()));
  }
  
  public static ci a()
  {
    ci localci = new ci();
    int i = b[0];
    while (a(i, a.size()))
    {
      localci.addElement(i + ". " + (String)a.elementAt(i));
      i++;
      "".length();
      if ((0x7A ^ 0x7E) < 0) {
        return null;
      }
    }
    return localci;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt == 0;
  }
  
  public static void b()
  {
    a.removeAllElements();
    e();
  }
  
  public static void b(String paramString)
  {
    if (b(a.contains(paramString)))
    {
      a.addElement(paramString);
      e();
    }
  }
  
  public static void c(String paramString)
  {
    if (a(a.contains(paramString)))
    {
      "".length();
      e();
    }
  }
  
  public static void c()
  {
    f();
    (a = new ci()).removeAllElements();
    try
    {
      localObject = new ByteArrayInputStream(df.b("V6PKS"));
      DataInputStream localDataInputStream;
      int i = (localDataInputStream = new DataInputStream((InputStream)localObject)).readInt();
      int j = b[0];
      while (a(j, i))
      {
        a.addElement(localDataInputStream.readUTF());
        j++;
        "".length();
        if (((0x62 ^ 0x66) & (0xC5 ^ 0xC1 ^ 0xFFFFFFFF)) != 0) {
          return;
        }
      }
      localDataInputStream.close();
      ((ByteArrayInputStream)localObject).close();
      return;
    }
    catch (Exception localException)
    {
      Object localObject;
      (localObject = localException).printStackTrace();
    }
  }
  
  static
  {
    cs.a(30);
    c();
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\dv.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */