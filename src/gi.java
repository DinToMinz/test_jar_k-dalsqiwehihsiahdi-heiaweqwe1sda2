import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;

public class gi
{
  public static final int a = 1;
  public static final int b = 2;
  public static final int c = 3;
  public static final Hashtable d = new Hashtable();
  
  public static DataInputStream a(String paramString)
  {
    return Connector.openDataInputStream(f(paramString));
  }
  
  public static DataOutputStream b(String paramString)
  {
    return Connector.openDataOutputStream(f(paramString));
  }
  
  public static InputStream c(String paramString)
  {
    return Connector.openInputStream(f(paramString));
  }
  
  public static OutputStream d(String paramString)
  {
    return Connector.openOutputStream(f(paramString));
  }
  
  public static Connection e(String paramString)
  {
    return Connector.open(f(paramString));
  }
  
  public static Connection a(String paramString, int paramInt)
  {
    return Connector.open(f(paramString), paramInt);
  }
  
  public static Connection a(String paramString, int paramInt, boolean paramBoolean)
  {
    return Connector.open(f(paramString), paramInt, paramBoolean);
  }
  
  private static String f(String paramString)
  {
    Object localObject;
    if (!(localObject = d).isEmpty())
    {
      if (((Hashtable)localObject).containsKey(paramString)) {
        return (String)((Hashtable)localObject).get(paramString);
      }
      Enumeration localEnumeration = ((Hashtable)localObject).keys();
      while (localEnumeration.hasMoreElements())
      {
        String str1;
        String str2 = str1 = (String)localEnumeration.nextElement();
        if ((str1.length() > 1) && (str1.endsWith("*"))) {
          if ((str1 = str1.substring(0, str1.length() - 1)).startsWith("*"))
          {
            str1 = str1.substring(1, str1.length());
            int i;
            if ((i = paramString.indexOf(str1)) > 0)
            {
              if ((localObject = (String)((Hashtable)localObject).get(str2)).startsWith("*")) {
                localObject = paramString.substring(0, i) + ((String)localObject).substring(1);
              }
              if (((String)localObject).endsWith("*")) {
                localObject = ((String)localObject).substring(0, ((String)localObject).length() - 1) + paramString.substring(i + str1.length());
              }
              return (String)localObject;
            }
          }
          else if (paramString.startsWith(str1))
          {
            String str3;
            if ((str3 = (String)((Hashtable)localObject).get(str2)).endsWith("*")) {
              return str3.substring(0, str3.length() - 1) + paramString.substring(str1.length());
            }
            return str3;
          }
        }
      }
    }
    return paramString;
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\gi.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */