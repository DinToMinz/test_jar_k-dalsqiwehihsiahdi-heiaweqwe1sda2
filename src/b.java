import com.nokia.mid.ui.DeviceControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Gauge;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public class b
  extends MIDlet
  implements ga, Runnable, CommandListener, ItemStateListener
{
  private static List d;
  private static final Command e = new Command("Phục hồi RAM", 4, 11);
  private static final Command f = new Command("Phục hồi (ON)", 4, 27);
  private static final Command g = new Command("Hủy", 4, 27);
  private static final Command h = new Command("Quay lại", 2, 10);
  private static final Command i = new Command("Chế độ ngủ (ON)", 4, 25);
  private static final Command j = new Command("Chế độ ngủ (OFF)", 4, 25);
  private static final Command k = new Command("Quay lại", 2, 26);
  private static final Command l = new Command("Lưu", 1, 21);
  private static final Command m = new Command("Xóa", 1, 19);
  private static final Command n = new Command("Sửa", 1, 20);
  private static final Command o = new Command("Thêm mới", 1, 18);
  private int p;
  private static Throwable q;
  private static Displayable r;
  private static Displayable s;
  private static Alert t;
  private static long u = 0L;
  private static int v = 30;
  private static Display w;
  private static Displayable x;
  private static List y;
  public static int a;
  private static gl[] z;
  private static a[] aa = new a[30];
  public static final PrintStream b = System.out;
  public static final Hashtable c = new Hashtable();
  private Thread ab;
  private Thread ac;
  private static String ad;
  private static String ae;
  private static String af = "/MrQuyet/MrQuyet.png";
  private static long ag = 300000L;
  private static long ah = 5000L;
  private boolean ai = true;
  private static int aj;
  private static int ak = 100;
  
  private List b(String paramString)
  {
    if (d == null)
    {
      (d = new List(paramString, 3)).setCommandListener(this);
    }
    else
    {
      String str = d.getTitle();
      d.deleteAll();
      if (str == "Thư mục lưu")
      {
        d.removeCommand(o);
        d.removeCommand(n);
        d.removeCommand(m);
        d.removeCommand(l);
        d.removeCommand(k);
      }
      else
      {
        d.removeCommand(e);
        d.removeCommand(f);
        d.removeCommand(g);
        d.removeCommand(h);
        d.removeCommand(i);
        d.removeCommand(j);
      }
      d.setTitle(paramString);
    }
    return d;
  }
  
  private void c()
  {
    r = w.getCurrent();
    List localList;
    (localList = b("Thư mục lưu")).addCommand(o);
    localList.addCommand(n);
    localList.setSelectCommand(n);
    localList.addCommand(m);
    localList.addCommand(l);
    localList.addCommand(k);
    Enumeration localEnumeration = c.keys();
    while (localEnumeration.hasMoreElements()) {
      localList.append((String)localEnumeration.nextElement(), null);
    }
    localList.setCommandListener(this);
    w.setCurrent(localList);
  }
  
  private void d()
  {
    List localList;
    (localList = b("Bộ nhớ điện thoại")).addCommand(e);
    localList.addCommand(this.ac == null ? f : g);
    localList.addCommand(h);
    localList.addCommand(this.ab == null ? i : j);
    localList.setFitPolicy(1);
    Runtime localRuntime = Runtime.getRuntime();
    localList.append("RAM:" + localRuntime.totalMemory() / 1024L + " k", null);
    localList.append("RAM trống:" + localRuntime.freeMemory() / 1024L + " k", null);
    localList.append("Mạch:" + Thread.activeCount(), null);
    if (x != null)
    {
      localList.append("Hiển thị : ", null);
      localList.append(x.toString(), null);
    }
    if (q != null)
    {
      localList.append("Exception : ", null);
      localList.append(q.toString(), null);
    }
    w.setCurrent(localList);
  }
  
  private void a(String paramString1, String paramString2)
  {
    s = w.getCurrent();
    Form localForm;
    (localForm = new Form("Sửa")).append(new TextField("Mặc định:", paramString1, 512, 0));
    localForm.append(new TextField("Mới:", paramString2, 512, 0));
    localForm.setCommandListener(this);
    localForm.addCommand(new Command("Xác nhận", 4, 22));
    localForm.addCommand(new Command("Hủy", 2, 23));
    w.setCurrent(localForm);
  }
  
  private static void e()
  {
    Hashtable localHashtable = c;
    try
    {
      RecordStore localRecordStore = RecordStore.openRecordStore("MrQuyet_rms_urlmap", true);
      if ((c.isEmpty()) && (localRecordStore.getNumRecords() > 0))
      {
        localRecordStore.setRecord(1, new byte[0], 0, 0);
        localRecordStore.closeRecordStore();
        return;
      }
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      Enumeration localEnumeration = localHashtable.keys();
      while (localEnumeration.hasMoreElements())
      {
        localObject = (String)localEnumeration.nextElement();
        localDataOutputStream.writeUTF((String)localObject);
        localDataOutputStream.writeUTF((String)localHashtable.get(localObject));
      }
      localDataOutputStream.flush();
      localDataOutputStream.close();
      Object localObject = localByteArrayOutputStream.toByteArray();
      if (localRecordStore.getNumRecords() > 0) {
        localRecordStore.setRecord(1, (byte[])localObject, 0, localObject.length);
      } else {
        localRecordStore.addRecord((byte[])localObject, 0, localObject.length);
      }
      localRecordStore.closeRecordStore();
      return;
    }
    catch (Exception localException) {}
  }
  
  private static String a(Form paramForm, int paramInt)
  {
    return ((TextField)paramForm.get(paramInt)).getString();
  }
  
  private static int a(String paramString, int paramInt)
  {
    try
    {
      return Integer.parseInt(paramString);
    }
    catch (Exception localException) {}
    return paramInt;
  }
  
  private static long a(String paramString, long paramLong)
  {
    try
    {
      return Long.parseLong(paramString);
    }
    catch (Exception localException) {}
    return paramLong;
  }
  
  private void f()
  {
    List localList = y = new List("AngelChip Menu", 3);
    if (ae == null) {
      ae = "file:///c/" + getAppProperty("MIDlet-Name") + ".db";
    }
    Object localObject;
    for (int i1 = 0; (localObject = getAppProperty(String.valueOf(i1))) != null; i1++)
    {
      localObject = a.a((String)localObject);
      aa[i1] = localObject;
      localList.append(((a)localObject).a, ((a)localObject).c);
    }
    z = new gl[y.size()];
    localList.addCommand(new Command("Chạy ứng dụng", 1, 0));
    localList.addCommand(new Command("Dừng ứng dụng", 1, 1));
    localList.addCommand(new Command("Thu nhỏ", 1, 5));
    localList.addCommand(new Command("Chỉnh độ sáng", 1, 8));
    localList.addCommand(new Command("Tùy chọn RAM", 1, 4));
    localList.addCommand(new Command("Cài đặt cơ bản", 1, 3));
    localList.addCommand(new Command("Thoát", 7, 2));
    localList.setCommandListener(this);
    w.setCurrent(y);
    if (af != null) {
      i();
    }
  }
  
  public void run()
  {
    if (aj >= 0)
    {
      try
      {
        a locala;
        gl localgl;
        if ((localgl = (locala = aa[aj]).a()) != null)
        {
          z[aj] = localgl;
          y.set(aj, locala.a, a.a(locala.c));
          localgl.f();
        }
      }
      catch (Throwable localThrowable1)
      {
        a(localThrowable1, this);
      }
      this.ai = true;
      return;
    }
    if (aj == -1) {
      try
      {
        Thread.sleep(ag);
        for (int i1 = 0; i1 < z.length; i1++) {
          if (z[i1] != null) {
            try
            {
              z[i1].g();
            }
            catch (Throwable localThrowable2) {}
          }
        }
        notifyDestroyed();
        return;
      }
      catch (Exception localException1)
      {
        return;
      }
    }
    if (ah > 0L) {
      try
      {
        for (;;)
        {
          Thread.sleep(ah);
          System.gc();
        }
        return;
      }
      catch (Exception localException2) {}
    }
  }
  
  public void a(Throwable paramThrowable, Object paramObject)
  {
    q = paramThrowable;
    a(paramObject + ": " + paramThrowable.toString());
  }
  
  public static void a(String paramString)
  {
    if (System.currentTimeMillis() - u > 1500L)
    {
      u = System.currentTimeMillis();
      t.setTimeout(-2);
      t.setString(paramString);
      w.setCurrent(t, (w.getCurrent() instanceof Alert) ? y : w.getCurrent());
    }
  }
  
  /* Error */
  private static void g()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: getstatic 123	b:ae	Ljava/lang/String;
    //   5: iconst_2
    //   6: invokestatic 250	javax/microedition/io/Connector:open	(Ljava/lang/String;I)Ljavax/microedition/io/Connection;
    //   9: checkcast 88	javax/microedition/io/file/FileConnection
    //   12: astore_0
    //   13: aload_0
    //   14: lconst_0
    //   15: invokeinterface 312 3 0
    //   20: goto +26 -> 46
    //   23: pop
    //   24: aload_0
    //   25: invokeinterface 308 1 0
    //   30: goto +16 -> 46
    //   33: astore_1
    //   34: getstatic 157	gb:c	Lga;
    //   37: aload_1
    //   38: getstatic 157	gb:c	Lga;
    //   41: invokeinterface 304 3 0
    //   46: aload_0
    //   47: invokeinterface 310 1 0
    //   52: astore_2
    //   53: goto +17 -> 70
    //   56: astore_3
    //   57: getstatic 157	gb:c	Lga;
    //   60: aload_3
    //   61: getstatic 157	gb:c	Lga;
    //   64: invokeinterface 304 3 0
    //   69: return
    //   70: invokestatic 301	javax/microedition/rms/RecordStore:listRecordStores	()[Ljava/lang/String;
    //   73: dup
    //   74: astore_3
    //   75: arraylength
    //   76: dup
    //   77: istore 4
    //   79: ifle +125 -> 204
    //   82: iconst_0
    //   83: istore 5
    //   85: iload 5
    //   87: iload 4
    //   89: if_icmpge +115 -> 204
    //   92: aload_3
    //   93: iload 5
    //   95: aaload
    //   96: astore_1
    //   97: aload_2
    //   98: aload_1
    //   99: invokevirtual 211	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   102: aload_1
    //   103: iconst_0
    //   104: invokestatic 302	javax/microedition/rms/RecordStore:openRecordStore	(Ljava/lang/String;Z)Ljavax/microedition/rms/RecordStore;
    //   107: dup
    //   108: astore 6
    //   110: aconst_null
    //   111: aconst_null
    //   112: iconst_0
    //   113: invokevirtual 297	javax/microedition/rms/RecordStore:enumerateRecords	(Ljavax/microedition/rms/RecordFilter;Ljavax/microedition/rms/RecordComparator;Z)Ljavax/microedition/rms/RecordEnumeration;
    //   116: astore_1
    //   117: aload_1
    //   118: invokeinterface 313 1 0
    //   123: ifeq +65 -> 188
    //   126: aload_1
    //   127: invokeinterface 314 1 0
    //   132: istore 7
    //   134: aload 6
    //   136: iload 7
    //   138: invokevirtual 300	javax/microedition/rms/RecordStore:getRecord	(I)[B
    //   141: astore 8
    //   143: aload_2
    //   144: iload 7
    //   146: invokevirtual 208	java/io/DataOutputStream:writeInt	(I)V
    //   149: aload 8
    //   151: ifnull +29 -> 180
    //   154: aload 8
    //   156: arraylength
    //   157: ifle +23 -> 180
    //   160: aload_2
    //   161: aload 8
    //   163: arraylength
    //   164: invokevirtual 208	java/io/DataOutputStream:writeInt	(I)V
    //   167: aload_2
    //   168: aload 8
    //   170: invokevirtual 207	java/io/DataOutputStream:write	([B)V
    //   173: aload_2
    //   174: invokevirtual 206	java/io/DataOutputStream:flush	()V
    //   177: goto -60 -> 117
    //   180: aload_2
    //   181: iconst_0
    //   182: invokevirtual 208	java/io/DataOutputStream:writeInt	(I)V
    //   185: goto -68 -> 117
    //   188: aload_2
    //   189: iconst_0
    //   190: invokevirtual 208	java/io/DataOutputStream:writeInt	(I)V
    //   193: aload 6
    //   195: invokevirtual 296	javax/microedition/rms/RecordStore:closeRecordStore	()V
    //   198: iinc 5 1
    //   201: goto -116 -> 85
    //   204: ldc 57
    //   206: invokestatic 170	b:a	(Ljava/lang/String;)V
    //   209: aload_2
    //   210: invokevirtual 206	java/io/DataOutputStream:flush	()V
    //   213: aload_2
    //   214: invokevirtual 205	java/io/DataOutputStream:close	()V
    //   217: aload_0
    //   218: invokeinterface 307 1 0
    //   223: return
    //   224: pop
    //   225: return
    //   226: astore_3
    //   227: getstatic 157	gb:c	Lga;
    //   230: aload_3
    //   231: getstatic 157	gb:c	Lga;
    //   234: invokeinterface 304 3 0
    //   239: aload_2
    //   240: invokevirtual 206	java/io/DataOutputStream:flush	()V
    //   243: aload_2
    //   244: invokevirtual 205	java/io/DataOutputStream:close	()V
    //   247: aload_0
    //   248: invokeinterface 307 1 0
    //   253: return
    //   254: pop
    //   255: return
    //   256: astore_1
    //   257: aload_2
    //   258: invokevirtual 206	java/io/DataOutputStream:flush	()V
    //   261: aload_2
    //   262: invokevirtual 205	java/io/DataOutputStream:close	()V
    //   265: aload_0
    //   266: invokeinterface 307 1 0
    //   271: goto +4 -> 275
    //   274: pop
    //   275: aload_1
    //   276: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	265	0	localFileConnection	FileConnection
    //   33	5	1	localThrowable1	Throwable
    //   96	31	1	localObject1	Object
    //   256	20	1	localObject2	Object
    //   52	210	2	localDataOutputStream	DataOutputStream
    //   56	5	3	localException1	Exception
    //   74	19	3	arrayOfString	String[]
    //   226	5	3	localThrowable2	Throwable
    //   77	13	4	i1	int
    //   83	116	5	i2	int
    //   108	86	6	localRecordStore	RecordStore
    //   132	13	7	i3	int
    //   141	28	8	arrayOfByte	byte[]
    //   23	1	13	localException2	Exception
    //   224	1	14	localException3	Exception
    //   254	1	15	localException4	Exception
    //   274	1	16	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   13	20	23	java/lang/Exception
    //   2	30	33	java/lang/Throwable
    //   46	53	56	java/lang/Exception
    //   209	223	224	java/lang/Exception
    //   70	209	226	java/lang/Throwable
    //   239	253	254	java/lang/Exception
    //   70	209	256	finally
    //   226	239	256	finally
    //   257	271	274	java/lang/Exception
  }
  
  private static void h()
  {
    Object localObject1;
    if ((localObject1 = c(ae)) == null) {
      return;
    }
    try
    {
      localObject1 = new DataInputStream(new ByteArrayInputStream((byte[])localObject1));
      byte[] arrayOfByte1 = new byte[0];
      for (;;)
      {
        try
        {
          localObject2 = ((DataInputStream)localObject1).readUTF();
        }
        catch (Exception localException)
        {
          break;
        }
        Object localObject2 = RecordStore.openRecordStore((String)localObject2, true);
        int i1;
        while ((i1 = ((DataInputStream)localObject1).readInt()) > 0)
        {
          int i2 = ((DataInputStream)localObject1).readInt();
          while (((RecordStore)localObject2).getNextRecordID() <= i1) {
            ((RecordStore)localObject2).addRecord(arrayOfByte1, 0, 0);
          }
          if (i2 > 0)
          {
            byte[] arrayOfByte2 = new byte[i2];
            ((DataInputStream)localObject1).readFully(arrayOfByte2);
            ((RecordStore)localObject2).setRecord(i1, arrayOfByte2, 0, arrayOfByte2.length);
          }
        }
        ((RecordStore)localObject2).closeRecordStore();
      }
      ((DataInputStream)localObject1).close();
      a("Đã nhập khẩu sao lư");
      return;
    }
    catch (Throwable localThrowable)
    {
      gb.c.a(localThrowable, gb.c);
    }
  }
  
  private static byte[] c(String paramString)
  {
    try
    {
      paramString = (FileConnection)Connector.open(paramString, 1);
    }
    catch (Throwable localThrowable)
    {
      gb.c.a(localThrowable, gb.c);
      return null;
    }
    try
    {
      InputStream localInputStream = paramString.openInputStream();
      int i1;
      byte[] arrayOfByte = new byte[i1 = (int)paramString.fileSize()];
      int i2 = i1;
      while (i1 > 0) {
        i1 -= localInputStream.read(arrayOfByte, i1 - i2, i1);
      }
      localInputStream.close();
      paramString.close();
      return arrayOfByte;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public void itemStateChanged(Item paramItem)
  {
    try
    {
      Form localForm = (Form)w.getCurrent();
      if ((paramItem = (Gauge)paramItem).getMaxValue() > 10)
      {
        v = paramItem.getValue();
        ((Gauge)localForm.get(1)).setValue(v / 10);
      }
      else
      {
        v = paramItem.getValue() * 10;
        ((Gauge)localForm.get(0)).setValue(v);
      }
      DeviceControl.setLights(0, v);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  private static void i()
  {
    gq.f = gq.g = null;
    System.gc();
    if ((af == null) || (af.length() <= 0)) {
      return;
    }
    Image localImage = null;
    if (!af.startsWith("/"))
    {
      byte[] arrayOfByte;
      if ((arrayOfByte = c(af)) == null) {
        return;
      }
      try
      {
        localImage = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
      }
      catch (Throwable localThrowable1) {}
    }
    else
    {
      try
      {
        localImage = Image.createImage(af);
      }
      catch (Throwable localThrowable2) {}
    }
    if (localImage != null)
    {
      int i2 = localImage.getWidth();
      int i3 = localImage.getHeight();
      int[] arrayOfInt = new int[i2 * i3];
      localImage.getRGB(arrayOfInt, 0, i2, 0, 0, i2, i3);
      int i1 = ak << 24 | 0xFFFFFF;
      for (int i4 = arrayOfInt.length - 1; i4 >= 0; i4--) {
        arrayOfInt[i4] &= i1;
      }
      gq.f = Image.createRGBImage(arrayOfInt, i2, i3, true);
      System.gc();
    }
  }
  
  public void a(gl paramgl)
  {
    w.setCurrent(y);
    gb.b.remove(paramgl);
    for (int i1 = 0; (i1 < z.length) && (paramgl != z[i1]); i1++) {}
    z[i1] = null;
    a locala = aa[i1];
    y.set(i1, locala.a, locala.c);
    x = y;
    locala.a(paramgl);
    System.gc();
  }
  
  public void a()
  {
    if (w.getCurrent() != null) {
      x = w.getCurrent();
    }
    w.setCurrent(y);
  }
  
  public void b()
  {
    w.setCurrent(x);
  }
  
  public b()
  {
    j();
    try
    {
      DeviceControl.setLights(0, v);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void startApp() {}
  
  public void pauseApp() {}
  
  public void destroyApp(boolean paramBoolean) {}
  
  public void commandAction(Command paramCommand, Displayable paramDisplayable)
  {
    Displayable localDisplayable = y == null ? 0 : y.getSelectedIndex();
    switch (paramCommand.getPriority())
    {
    case 0: 
      if (paramDisplayable == y)
      {
        paramDisplayable = localDisplayable;
        paramCommand = this;
        if ((paramDisplayable >= 0) && (paramDisplayable < z.length))
        {
          if (z[paramDisplayable] != null)
          {
            z[paramDisplayable].e();
            return;
          }
          if (paramCommand.ai)
          {
            aj = paramDisplayable;
            paramCommand.ai = false;
            new Thread(paramCommand).start();
          }
        }
        return;
      }
      break;
    case 1: 
      if (paramDisplayable == y)
      {
        paramDisplayable = localDisplayable;
        paramCommand = this;
        if ((paramDisplayable >= 0) && (paramDisplayable < z.length) && (z[paramDisplayable] != null)) {
          try
          {
            z[paramDisplayable].g();
          }
          catch (Exception paramDisplayable)
          {
            paramCommand.a(paramDisplayable, paramCommand);
          }
        } else {}
      }
      break;
    case 2: 
      for (paramCommand = 0; paramCommand < z.length; paramCommand++) {
        if (z[paramCommand] != null) {
          try
          {
            z[paramCommand].g();
          }
          catch (Throwable localThrowable) {}
        }
      }
      notifyDestroyed();
      return;
    case 9: 
      gq.e = a(a(paramCommand = (Form)paramDisplayable, 0), 42);
      gq.d = a(a(paramCommand, 1), 500L);
      ag = a(a(paramCommand, 2).concat("000"), 300000L);
      if ((localDisplayable = (paramDisplayable = a(paramCommand, 3)).indexOf('*')) > 0)
      {
        a.d = a(paramDisplayable.substring(0, localDisplayable++), 20);
        a.e = a(paramDisplayable.substring(localDisplayable), 20);
        for (paramDisplayable = 0; paramDisplayable < z.length; paramDisplayable++)
        {
          a locala;
          (locala = aa[paramDisplayable]).b();
          y.set(paramDisplayable, locala.a, z[paramDisplayable] == null ? locala.c : a.a(locala.c));
        }
      }
      paramDisplayable = af;
      int i1 = ak;
      ah = a(a(paramCommand, 4), 5000L);
      ak = a(a(paramCommand, 5), 100);
      af = a(paramCommand, 6);
      ae = a(paramCommand, 7);
      ad = a(paramCommand, 8);
      k();
      paramCommand.deleteAll();
      if (((af != null) && (af.length() > 1) && (!af.equals(paramDisplayable))) || (i1 != ak))
      {
        i();
        return;
      }
      break;
    case 3: 
      (paramCommand = new Form("Cài đặt cơ bản")).addCommand(new Command("Quay lại", 2, 10));
      paramCommand.addCommand(new Command("Lưu", 4, 9));
      paramCommand.append(new TextField("Phím thu nhỏ:", String.valueOf(gq.e), 10, 2));
      paramCommand.append(new TextField("Thời gian đáp ứng:", String.valueOf(gq.d), 10, 2));
      paramCommand.append(new TextField("Bấm giờ ngủ:", String.valueOf(ag / 1000L), 12, 2));
      paramCommand.append(new TextField("Cỡ icon (rộng * cao):", a.d + "*" + a.e, 12, 0));
      paramCommand.append(new TextField("Khoảng RAM được phục hồi:", String.valueOf(ah), 12, 2));
      paramCommand.append(new TextField("Độ trong suốt (1-255):", String.valueOf(ak), 3, 2));
      paramCommand.append(new TextField("Đường dẫn hình nền:", String.valueOf(af), 256, 0));
      paramCommand.append(new TextField("Ổ sao lưu:", ae, 256, 0));
      paramCommand.append(new TextField("Mã truy cập:", "", 20, 0));
      paramCommand.addCommand(new Command("Tạo sao lưu", 4, 6));
      paramCommand.addCommand(new Command("Nhập khẩu sao lưu", 4, 7));
      paramCommand.addCommand(new Command("Thư mục lưu", 4, 17));
      paramCommand.setCommandListener(this);
      w.setCurrent(paramCommand);
      return;
    case 4: 
      d();
      return;
    case 5: 
      w.setCurrent(null);
      notifyPaused();
      return;
    case 6: 
      g();
      return;
    case 7: 
      h();
      return;
    case 8: 
      (paramCommand = new Form("Chỉnh đèn màn hình")).setCommandListener(this);
      paramCommand.append(new Gauge("Độ sáng", true, 100, v));
      paramCommand.append(new Gauge("Độ sáng", true, 10, v / 10));
      paramCommand.setItemStateListener(this);
      paramCommand.addCommand(new Command("Quay lại", 2, 10));
      paramCommand.addCommand(new Command("Lưu", 4, 24));
      w.setCurrent(paramCommand);
      return;
    case 10: 
      r = s = null;
      w.setCurrent(y);
      return;
    case 11: 
      System.gc();
      d();
      return;
    case 15: 
      
    case 14: 
      
    case 12: 
      if (a(paramCommand = (Form)paramDisplayable, 0).equals(ad))
      {
        paramCommand.deleteAll();
        f();
        return;
      }
      a("Mật khẩu lỗi");
      return;
    case 13: 
      notifyDestroyed();
      return;
    case 16: 
      
    case 17: 
      c();
      return;
    case 18: 
      this.p = -1;
      a("", "");
      return;
    case 19: 
      paramDisplayable = (List)paramDisplayable;
      try
      {
        c.remove(paramDisplayable.getString(paramDisplayable.getSelectedIndex()));
        paramDisplayable.delete(paramDisplayable.getSelectedIndex());
        return;
      }
      catch (Exception localException1) {}
    case 20: 
      paramDisplayable = (List)paramDisplayable;
      try
      {
        this.p = paramDisplayable.getSelectedIndex();
        a(paramDisplayable.getString(this.p), (String)c.get(paramDisplayable.getString(this.p)));
        return;
      }
      catch (Exception localException2) {}
    case 21: 
      e();
      return;
    case 22: 
      Object localObject = (Form)paramDisplayable;
      paramCommand = (List)s;
      paramDisplayable = ((TextField)((Form)localObject).get(0)).getString();
      localObject = ((TextField)((Form)localObject).get(1)).getString();
      if (this.p >= 0)
      {
        c.remove(paramCommand.getString(this.p));
        paramCommand.set(this.p, paramDisplayable, null);
      }
      else
      {
        paramCommand.append(paramDisplayable, null);
      }
      c.put(paramDisplayable, localObject);
    case 23: 
      w.setCurrent(s);
      return;
    case 24: 
      k();
      return;
    case 25: 
      if (this.ab != null)
      {
        this.ab.interrupt();
        this.ab = null;
      }
      else
      {
        aj = -1;
        (this.ab = new Thread(this)).start();
      }
      d();
      return;
    case 26: 
      w.setCurrent(r);
      return;
    case 27: 
      if (this.ac != null)
      {
        this.ac.interrupt();
        this.ac = null;
      }
      else
      {
        aj = -2;
        (this.ac = new Thread(this)).start();
      }
      d();
    }
  }
  
  private void j()
  {
    gb.c = this;
    gl.k = this;
    gb.a = w = Display.getDisplay(this);
    t = new Alert("[!] Quyetdaik [!]", "", null, AlertType.INFO);
    RecordStore localRecordStore;
    Object localObject;
    try
    {
      if (((localRecordStore = RecordStore.openRecordStore("MrQuyet_rms_urlmap", false)).getNumRecords() > 0) && ((localObject = localRecordStore.getRecord(1)) != null))
      {
        localObject = new DataInputStream(new ByteArrayInputStream((byte[])localObject));
        try
        {
          for (;;)
          {
            c.put(((DataInputStream)localObject).readUTF(), ((DataInputStream)localObject).readUTF());
          }
          localRecordStore.closeRecordStore();
        }
        catch (Exception localException1)
        {
          ((DataInputStream)localObject).close();
        }
      }
    }
    catch (Exception localException2)
    {
      c.put("sms://106*", "sms://10086");
    }
    try
    {
      if ((localRecordStore = RecordStore.openRecordStore("MrQuyet_rms_setting", false)).getNumRecords() > 0)
      {
        if ((localObject = localRecordStore.getRecord(1)) == null)
        {
          f();
          localRecordStore.closeRecordStore();
          return;
        }
        gq.e = (localObject = new DataInputStream(new ByteArrayInputStream((byte[])localObject))).readInt();
        gq.d = ((DataInputStream)localObject).readInt();
        ad = ((DataInputStream)localObject).readUTF();
        ae = ((DataInputStream)localObject).readUTF();
        v = ((DataInputStream)localObject).readShort();
        ag = ((DataInputStream)localObject).readLong();
        af = ((DataInputStream)localObject).readUTF();
        ak = ((DataInputStream)localObject).readShort();
        a.d = ((DataInputStream)localObject).readShort();
        a.e = ((DataInputStream)localObject).readShort();
        ah = ((DataInputStream)localObject).readLong();
        ((DataInputStream)localObject).close();
        if (ad.length() > 0)
        {
          (localObject = new Form("Mật khẩu")).append(new TextField("Mã truy cập:", "", 20, 0));
          ((Form)localObject).setCommandListener(this);
          ((Form)localObject).addCommand(new Command("Xác nhận", 4, 12));
          ((Form)localObject).addCommand(new Command("Thoát", 7, 13));
          w.setCurrent((Displayable)localObject);
        }
        else
        {
          f();
        }
      }
      localRecordStore.closeRecordStore();
      return;
    }
    catch (Exception localException3)
    {
      f();
    }
  }
  
  private static void k()
  {
    try
    {
      RecordStore localRecordStore = RecordStore.openRecordStore("MrQuyet_rms_setting", true);
      DataOutputStream localDataOutputStream;
      (localDataOutputStream = new DataOutputStream(localObject = new ByteArrayOutputStream())).writeInt(gq.e);
      localDataOutputStream.writeInt((int)gq.d);
      localDataOutputStream.writeUTF(ad);
      localDataOutputStream.writeUTF(ae);
      localDataOutputStream.writeShort(v);
      localDataOutputStream.writeLong(ag);
      localDataOutputStream.writeUTF(af);
      localDataOutputStream.writeShort(ak);
      localDataOutputStream.writeShort(a.d);
      localDataOutputStream.writeShort(a.e);
      localDataOutputStream.writeLong(ah);
      localDataOutputStream.close();
      Object localObject = ((ByteArrayOutputStream)localObject).toByteArray();
      if (localRecordStore.getNumRecords() > 0) {
        localRecordStore.setRecord(1, (byte[])localObject, 0, localObject.length);
      } else {
        localRecordStore.addRecord((byte[])localObject, 0, localObject.length);
      }
      localRecordStore.closeRecordStore();
    }
    catch (Exception localException)
    {
      gb.c.a(localException, gb.c);
    }
    w.setCurrent(y);
  }
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\b.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       0.7.1
 */