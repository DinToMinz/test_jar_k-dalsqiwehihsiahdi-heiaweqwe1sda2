import javax.microedition.lcdui.Image;

public class a
{
  public String a;
  public String b;
  public Image c;
  private String f;
  private static Image g;
  private String h;
  protected static int d = 48;
  protected static int e = 48;
  
  public void a(gl paramgl) {}
  
  public static a a(String paramString)
  {
    a locala = new a();
    int i = paramString.indexOf(',');
    locala.a = paramString.substring(0, i++).trim();
    int j = paramString.indexOf(',', i);
    Image localImage;
    try
    {
      localImage = Image.createImage(paramString.substring(i, j++).trim());
    }
    catch (Exception localException)
    {
      localImage = g;
    }
    a(localImage, locala);
    i = paramString.indexOf(',', j);
    locala.b = paramString.substring(j, i++).trim();
    int k = locala.b.indexOf(".");
    String str;
    if (k != -1) {
      str = locala.b.substring(0, k);
    } else {
      str = locala.b;
    }
    if (str.length() > 1) {
      locala.h = "Static";
    } else {
      locala.h = (str + ".Static");
    }
    locala.f = paramString.substring(i).trim();
    return locala;
  }
  
  public gl a()
  {
    gl.l = this.f;
    gl localgl;
    try
    {
      go localgo;
      try
      {
        localgo = (go)Class.forName(this.h).newInstance();
      }
      catch (Throwable localThrowable2)
      {
        localgo = null;
      }
      localgl = (gl)Class.forName(this.b).newInstance();
      localgl.m = localgo;
    }
    catch (Throwable localThrowable1)
    {
      localgl = null;
      gb.c.a(localThrowable1, this);
    }
    return localgl;
  }
  
  private static void a(Image paramImage, a parama)
  {
    int i = d;
    int j = e;
    int k = paramImage.getWidth();
    int m = paramImage.getHeight();
    if (((i != k) || (m != j)) && (i > 1) && (j > 1))
    {
      int[] arrayOfInt1 = new int[k * m];
      paramImage.getRGB(arrayOfInt1, 0, k, 0, 0, k, m);
      float f1 = m / j;
      float f2 = i == 0 ? f1 : k / i;
      i = (int)(i == 0 ? k / f2 : i);
      int[] arrayOfInt2 = new int[m * i];
      int i1;
      for (int n = 0; n < m; n++) {
        for (i1 = 0; i1 < i; i1++) {
          arrayOfInt2[(n * i + i1)] = arrayOfInt1[(k * n + (int)(f2 * i1))];
        }
      }
      arrayOfInt1 = new int[i * j];
      for (n = 0; n < i; n++) {
        for (i1 = 0; i1 < j; i1++) {
          arrayOfInt1[(i * i1 + n)] = arrayOfInt2[((int)(i1 * f1) * i + n)];
        }
      }
      parama.c = Image.createRGBImage(arrayOfInt1, i, j, true);
    }
    else
    {
      parama.c = paramImage;
    }
  }
  
  public static Image a(Image paramImage)
  {
    int i = paramImage.getWidth();
    int j = paramImage.getHeight();
    int[] arrayOfInt = new int[i * j];
    paramImage.getRGB(arrayOfInt, 0, i, 0, 0, i, j);
    int k = i / 3;
    int m = j / 3;
    int n = 1;
    int i2;
    for (int i1 = j - m; n < m - 2; i1++)
    {
      for (i2 = i - k; i2 < n + i - k; i2++) {
        arrayOfInt[(i * i1 + i2)] = -16711936;
      }
      n += 2;
    }
    while (n > 0)
    {
      for (i2 = i - k; i2 < n + i - k; i2++) {
        arrayOfInt[(i * i1 + i2)] = -16711936;
      }
      n -= 2;
      i1++;
    }
    return Image.createRGBImage(arrayOfInt, i, j, true);
  }
  
  protected void b()
  {
    a(this.c, this);
  }
  
  static
  {
    try
    {
      g = Image.createImage("/MrQuyet/mid.png");
    }
    catch (Throwable localThrowable)
    {
      g = Image.createImage(20, 20);
    }
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */