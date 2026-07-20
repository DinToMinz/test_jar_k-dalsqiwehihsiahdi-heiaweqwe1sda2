import java.io.PrintStream;

public final class ap
  extends bg
{
  private int a;
  private int b;
  private static fo[] g;
  private long h = 0L;
  private static ex i;
  private short j;
  private byte k = o[0];
  private static ex l;
  private int m;
  private boolean n;
  private static int[] o;
  private int p;
  private dz q;
  
  private fo h()
  {
    return g[this.j];
  }
  
  public final void a(cf paramcf)
  {
    if ((a(this.q)) && (a(this.q.e)) && (a(h().e)))
    {
      co localco = h().a[h().e[this.b]];
      int i1 = o[0];
      while (a(i1, localco.c.length))
      {
        Object localObject = h();
        int i2 = localco.b[i1];
        localObject = localObject.d[i2];
        if (e(this.a))
        {
          paramcf.a(this.q.e, ((dp)localObject).c, ((dp)localObject).d, ((dp)localObject).b, ((dp)localObject).a, o[0], this.m + localco.c[i1], this.p + localco.a[i1] - o[1], o[3]);
          "".length();
          if ("   ".length() >= 0) {}
        }
        else
        {
          paramcf.a(this.q.e, ((dp)localObject).c, ((dp)localObject).d, ((dp)localObject).b, ((dp)localObject).a, o[4], this.m - localco.c[i1], this.p + localco.a[i1] - o[1], o[5]);
        }
        i1++;
        "".length();
        if ((0x7F ^ 0x7B) < 0) {}
      }
    }
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt <= 0;
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt < 0;
  }
  
  public static void b()
  {
    i();
    g = new fo[o[3]];
    l = new ex();
    i = new ex();
  }
  
  static
  {
    cs.a(103);
    b();
  }
  
  private static void i()
  {
    o = new int[6];
    o[0] = (('¬' + '' - 294 + 221 ^ '´' + 111 - 128 + 26) & ('Ý' + '' - 284 + 164 ^ '¹' + '¨' - 173 + 7 ^ -" ".length()));
    o[1] = " ".length();
    o[2] = (-(0xFCFF & 0x1313) & 0xDBFA & 0x37FF);
    o[3] = (0x7E ^ 0x60 ^ 0xBC ^ 0xB6);
    o[4] = "  ".length();
    o[5] = (0x75 ^ 0x6D);
  }
  
  public static void a(short paramShort, byte[] paramArrayOfByte)
  {
    if (b(((fo)i.get(String.valueOf(paramShort))).e))
    {
      new fo();
      paramArrayOfByte = a(paramArrayOfByte);
      "".length();
    }
  }
  
  public final void a()
  {
    try
    {
      g[this.j] = ((fo)i.get(String.valueOf(this.j)));
      if (b(g[this.j]))
      {
        g[this.j] = new fo();
        "".length();
        h().b = System.currentTimeMillis();
        dl.ae().a(o[1], this.j);
        "".length();
        if ((0x34 ^ 0x30) > 0) {}
      }
      else if ((b(h().e)) && (e(c(System.currentTimeMillis() - h().b, 3000L))))
      {
        h().b = System.currentTimeMillis();
        dl.ae().a(o[1], this.j);
      }
      if (a(h().e))
      {
        this.q = ((dz)l.get(String.valueOf(this.j)));
        if (b(this.q))
        {
          this.q = new dz();
          this.q.c = this.j;
          "".length();
          this.q.e = cu.a(df.b("effauto " + this.j));
          if (b(this.q.e))
          {
            this.q.d = System.currentTimeMillis();
            dl.ae().a(o[0], this.j);
            "".length();
            if ("   ".length() > " ".length()) {}
          }
        }
        else if ((b(this.q.e)) && (e(c(System.currentTimeMillis() - this.q.d, 6000L))))
        {
          this.q.d = System.currentTimeMillis();
          dl.ae().a(o[0], this.j);
        }
      }
      if ((a(this.q)) && (a(this.q.e)) && (a(h().e)))
      {
        this.b += o[1];
        if (b(this.b, h().e.length)) {
          if (a(c(this.h, -1L)))
          {
            if (b(c(this.h - System.currentTimeMillis(), 0L)))
            {
              "".length();
              "".length();
              if ((" ".length() & (" ".length() ^ 0xFFFFFFFF)) >= ((0x91 ^ 0xB9) & (0x42 ^ 0x6A ^ 0xFFFFFFFF))) {}
            }
            else
            {
              this.b = o[0];
              "".length();
              if (-" ".length() != "  ".length()) {}
            }
          }
          else
          {
            if (d(this.n))
            {
              this.k = ((byte)(this.k - o[1]));
              if (b(this.k))
              {
                "".length();
                "".length();
                if ("   ".length() > " ".length()) {
                  break label680;
                }
                return;
              }
            }
            this.b = o[0];
          }
        }
        label680:
        this.q.b = System.currentTimeMillis();
      }
      return;
    }
    catch (Exception localException)
    {
      System.out.println("Err update effauto:" + localException.toString());
    }
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void a(short paramShort1, int paramInt1, int paramInt2, byte paramByte, short paramShort2, int paramInt3)
  {
    ap localap;
    (localap = new ap()).j = paramShort1;
    localap.m = paramInt1;
    localap.p = paramInt2;
    localap.k = paramByte;
    if (c(localap.k))
    {
      localap.n = o[1];
      "".length();
      if (-" ".length() < "  ".length()) {}
    }
    else
    {
      localap.n = o[0];
    }
    if (e(paramShort2))
    {
      localap.h = (System.currentTimeMillis() + paramShort2 * o[2]);
      "".length();
      if (-"  ".length() <= 0) {}
    }
    else
    {
      localap.h = -1L;
    }
    localap.a = paramInt3;
    bg.f.addElement(localap);
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt > 0;
  }
  
  public static void a(byte paramByte, byte[] paramArrayOfByte)
  {
    dz localdz;
    if (b(localdz = (dz)l.get(String.valueOf(paramByte))))
    {
      localdz = new dz();
      "".length();
    }
    localdz.c = paramByte;
    localdz.e = cu.a(paramArrayOfByte);
    if (c(bv.j, o[1])) {
      df.a("effauto ".concat(String.valueOf(paramByte)), paramArrayOfByte);
    }
  }
  
  /* Error */
  public static void c()
  {
    // Byte code:
    //   0: getstatic 48	ap:l	Lex;
    //   3: invokevirtual 124	java/util/Hashtable:keys	()Ljava/util/Enumeration;
    //   6: astore_0
    //   7: aload_0
    //   8: invokeinterface 125 1 0
    //   13: invokestatic 74	ap:a	(I)Z
    //   16: ifeq +77 -> 93
    //   19: aload_0
    //   20: invokeinterface 126 1 0
    //   25: checkcast 25	java/lang/String
    //   28: astore_1
    //   29: getstatic 48	ap:l	Lex;
    //   32: aload_1
    //   33: invokevirtual 105	ex:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast 18	dz
    //   39: astore_2
    //   40: invokestatic 122	java/lang/System:currentTimeMillis	()J
    //   43: aload_2
    //   44: getfield 63	dz:b	J
    //   47: lsub
    //   48: ldc2_w 37
    //   51: invokestatic 76	ap:a	(JJ)I
    //   54: invokestatic 88	ap:e	(I)Z
    //   57: ifeq +16 -> 73
    //   60: getstatic 48	ap:l	Lex;
    //   63: aload_1
    //   64: invokevirtual 107	ex:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   67: ldc 1
    //   69: invokevirtual 116	java/lang/String:length	()I
    //   72: pop2
    //   73: ldc 1
    //   75: invokevirtual 116	java/lang/String:length	()I
    //   78: pop
    //   79: ldc 2
    //   81: invokevirtual 116	java/lang/String:length	()I
    //   84: ldc 3
    //   86: invokevirtual 116	java/lang/String:length	()I
    //   89: if_icmplt -82 -> 7
    //   92: return
    //   93: return
    //   94: ldc 1
    //   96: invokevirtual 116	java/lang/String:length	()I
    //   99: pop2
    //   100: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   6	14	0	localEnumeration	java.util.Enumeration
    //   28	36	1	str	String
    //   39	5	2	localdz	dz
    //   94	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	93	94	java/lang/Exception
  }
  
  /* Error */
  private static fo a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 20	fo
    //   3: dup
    //   4: invokespecial 108	fo:<init>	()V
    //   7: astore_1
    //   8: new 21	java/io/ByteArrayInputStream
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 109	java/io/ByteArrayInputStream:<init>	([B)V
    //   16: astore_0
    //   17: new 22	java/io/DataInputStream
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 110	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   25: astore_0
    //   26: aload_1
    //   27: aload_0
    //   28: invokevirtual 111	java/io/DataInputStream:readByte	()B
    //   31: anewarray 17	dp
    //   34: putfield 70	fo:d	[Ldp;
    //   37: getstatic 51	ap:o	[I
    //   40: iconst_0
    //   41: iaload
    //   42: istore_2
    //   43: iload_2
    //   44: aload_1
    //   45: getfield 70	fo:d	[Ldp;
    //   48: arraylength
    //   49: invokestatic 75	ap:a	(II)Z
    //   52: ifeq +102 -> 154
    //   55: aload_1
    //   56: getfield 70	fo:d	[Ldp;
    //   59: iload_2
    //   60: new 17	dp
    //   63: dup
    //   64: invokespecial 102	dp:<init>	()V
    //   67: aastore
    //   68: aload_0
    //   69: invokevirtual 111	java/io/DataInputStream:readByte	()B
    //   72: ldc 1
    //   74: invokevirtual 116	java/lang/String:length	()I
    //   77: pop2
    //   78: aload_1
    //   79: getfield 70	fo:d	[Ldp;
    //   82: iload_2
    //   83: aaload
    //   84: aload_0
    //   85: invokevirtual 113	java/io/DataInputStream:readUnsignedByte	()I
    //   88: putfield 61	dp:c	I
    //   91: aload_1
    //   92: getfield 70	fo:d	[Ldp;
    //   95: iload_2
    //   96: aaload
    //   97: aload_0
    //   98: invokevirtual 113	java/io/DataInputStream:readUnsignedByte	()I
    //   101: putfield 62	dp:d	I
    //   104: aload_1
    //   105: getfield 70	fo:d	[Ldp;
    //   108: iload_2
    //   109: aaload
    //   110: aload_0
    //   111: invokevirtual 113	java/io/DataInputStream:readUnsignedByte	()I
    //   114: putfield 60	dp:b	I
    //   117: aload_1
    //   118: getfield 70	fo:d	[Ldp;
    //   121: iload_2
    //   122: aaload
    //   123: aload_0
    //   124: invokevirtual 113	java/io/DataInputStream:readUnsignedByte	()I
    //   127: putfield 59	dp:a	I
    //   130: iinc 2 1
    //   133: ldc 1
    //   135: invokevirtual 116	java/lang/String:length	()I
    //   138: pop
    //   139: ldc 4
    //   141: invokevirtual 116	java/lang/String:length	()I
    //   144: ldc 4
    //   146: invokevirtual 116	java/lang/String:length	()I
    //   149: if_icmpeq -106 -> 43
    //   152: aconst_null
    //   153: areturn
    //   154: aload_1
    //   155: aload_0
    //   156: invokevirtual 112	java/io/DataInputStream:readShort	()S
    //   159: anewarray 12	co
    //   162: putfield 67	fo:a	[Lco;
    //   165: getstatic 51	ap:o	[I
    //   168: iconst_0
    //   169: iaload
    //   170: istore_2
    //   171: iload_2
    //   172: aload_1
    //   173: getfield 67	fo:a	[Lco;
    //   176: arraylength
    //   177: invokestatic 75	ap:a	(II)Z
    //   180: ifeq +166 -> 346
    //   183: aload_1
    //   184: getfield 67	fo:a	[Lco;
    //   187: iload_2
    //   188: new 12	co
    //   191: dup
    //   192: invokespecial 95	co:<init>	()V
    //   195: aastore
    //   196: aload_0
    //   197: invokevirtual 111	java/io/DataInputStream:readByte	()B
    //   200: istore 4
    //   202: aload_1
    //   203: getfield 67	fo:a	[Lco;
    //   206: iload_2
    //   207: aaload
    //   208: iload 4
    //   210: newarray <illegal type>
    //   212: putfield 58	co:c	[S
    //   215: aload_1
    //   216: getfield 67	fo:a	[Lco;
    //   219: iload_2
    //   220: aaload
    //   221: iload 4
    //   223: newarray <illegal type>
    //   225: putfield 56	co:a	[S
    //   228: aload_1
    //   229: getfield 67	fo:a	[Lco;
    //   232: iload_2
    //   233: aaload
    //   234: iload 4
    //   236: newarray <illegal type>
    //   238: putfield 57	co:b	[B
    //   241: getstatic 51	ap:o	[I
    //   244: iconst_0
    //   245: iaload
    //   246: istore_3
    //   247: iload_3
    //   248: iload 4
    //   250: invokestatic 75	ap:a	(II)Z
    //   253: ifeq +74 -> 327
    //   256: aload_1
    //   257: getfield 67	fo:a	[Lco;
    //   260: iload_2
    //   261: aaload
    //   262: getfield 58	co:c	[S
    //   265: iload_3
    //   266: aload_0
    //   267: invokevirtual 112	java/io/DataInputStream:readShort	()S
    //   270: sastore
    //   271: aload_1
    //   272: getfield 67	fo:a	[Lco;
    //   275: iload_2
    //   276: aaload
    //   277: getfield 56	co:a	[S
    //   280: iload_3
    //   281: aload_0
    //   282: invokevirtual 112	java/io/DataInputStream:readShort	()S
    //   285: sastore
    //   286: aload_1
    //   287: getfield 67	fo:a	[Lco;
    //   290: iload_2
    //   291: aaload
    //   292: getfield 57	co:b	[B
    //   295: iload_3
    //   296: aload_0
    //   297: invokevirtual 111	java/io/DataInputStream:readByte	()B
    //   300: bastore
    //   301: iinc 3 1
    //   304: ldc 1
    //   306: invokevirtual 116	java/lang/String:length	()I
    //   309: pop
    //   310: ldc 2
    //   312: invokevirtual 116	java/lang/String:length	()I
    //   315: ineg
    //   316: ldc 2
    //   318: invokevirtual 116	java/lang/String:length	()I
    //   321: ineg
    //   322: if_icmpeq -75 -> 247
    //   325: aconst_null
    //   326: areturn
    //   327: iinc 2 1
    //   330: ldc 1
    //   332: invokevirtual 116	java/lang/String:length	()I
    //   335: pop
    //   336: bipush 120
    //   338: bipush 124
    //   340: ixor
    //   341: ifge -170 -> 171
    //   344: aconst_null
    //   345: areturn
    //   346: aload_0
    //   347: invokevirtual 112	java/io/DataInputStream:readShort	()S
    //   350: istore 4
    //   352: aload_1
    //   353: iload 4
    //   355: newarray <illegal type>
    //   357: putfield 71	fo:e	[S
    //   360: getstatic 51	ap:o	[I
    //   363: iconst_0
    //   364: iaload
    //   365: istore_3
    //   366: iload_3
    //   367: iload 4
    //   369: invokestatic 75	ap:a	(II)Z
    //   372: ifeq +33 -> 405
    //   375: aload_1
    //   376: getfield 71	fo:e	[S
    //   379: iload_3
    //   380: aload_0
    //   381: invokevirtual 112	java/io/DataInputStream:readShort	()S
    //   384: sastore
    //   385: iinc 3 1
    //   388: ldc 1
    //   390: invokevirtual 116	java/lang/String:length	()I
    //   393: pop
    //   394: ldc 3
    //   396: invokevirtual 116	java/lang/String:length	()I
    //   399: ineg
    //   400: ifle -34 -> 366
    //   403: aconst_null
    //   404: areturn
    //   405: aload_1
    //   406: areturn
    //   407: ldc 1
    //   409: invokevirtual 116	java/lang/String:length	()I
    //   412: pop2
    //   413: aconst_null
    //   414: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	415	0	paramArrayOfByte	byte[]
    //   7	399	1	localfo	fo
    //   42	286	2	i1	int
    //   246	134	3	i2	int
    //   200	168	4	i3	int
    //   407	1	5	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	406	407	java/lang/Exception
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  /* Error */
  public static void d()
  {
    // Byte code:
    //   0: getstatic 45	ap:i	Lex;
    //   3: invokevirtual 124	java/util/Hashtable:keys	()Ljava/util/Enumeration;
    //   6: astore_0
    //   7: aload_0
    //   8: invokeinterface 125 1 0
    //   13: invokestatic 74	ap:a	(I)Z
    //   16: ifeq +77 -> 93
    //   19: aload_0
    //   20: invokeinterface 126 1 0
    //   25: checkcast 25	java/lang/String
    //   28: astore_1
    //   29: getstatic 45	ap:i	Lex;
    //   32: aload_1
    //   33: invokevirtual 105	ex:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast 20	fo
    //   39: astore_2
    //   40: invokestatic 122	java/lang/System:currentTimeMillis	()J
    //   43: aload_2
    //   44: getfield 69	fo:c	J
    //   47: lsub
    //   48: ldc2_w 39
    //   51: invokestatic 82	ap:b	(JJ)I
    //   54: invokestatic 88	ap:e	(I)Z
    //   57: ifeq +16 -> 73
    //   60: getstatic 45	ap:i	Lex;
    //   63: aload_1
    //   64: invokevirtual 107	ex:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   67: ldc 1
    //   69: invokevirtual 116	java/lang/String:length	()I
    //   72: pop2
    //   73: ldc 1
    //   75: invokevirtual 116	java/lang/String:length	()I
    //   78: pop
    //   79: ldc 3
    //   81: invokevirtual 116	java/lang/String:length	()I
    //   84: bipush 117
    //   86: bipush 113
    //   88: ixor
    //   89: if_icmplt -82 -> 7
    //   92: return
    //   93: return
    //   94: ldc 1
    //   96: invokevirtual 116	java/lang/String:length	()I
    //   99: pop2
    //   100: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   6	14	0	localEnumeration	java.util.Enumeration
    //   28	36	1	str	String
    //   39	5	2	localfo	fo
    //   94	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	93	94	java/lang/Exception
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject == null;
  }
  
  private static int b(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static int c(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  public static void e() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\ap.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */