import java.util.Vector;

public final class al
  extends bg
{
  private ci[] a;
  private int b = g[5];
  private static int[] g;
  private ci h = new ci();
  private int i;
  private int j;
  private d k;
  private long l;
  private int m;
  private int[] n = { g[2], g[4] };
  private boolean o = g[3];
  private boolean p;
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static void d()
  {
    g = new int[16];
    g[0] = "  ".length();
    g[1] = ((0x67 ^ 0x5E) & (0xAB ^ 0x92 ^ 0xFFFFFFFF));
    g[2] = (-"   ".length() & 0xFCFF & 0xFCFFFF);
    g[3] = " ".length();
    g[4] = (0xF7FD & 0xAABFFE);
    g[5] = (0x14 ^ 0x6A ^ 0x57 ^ 0x2E);
    g[6] = (76 + 11 - -90 + 16 ^ 2 + 43 - 26 + 146);
    g[7] = (0x38 ^ 0xA);
    g[8] = (-" ".length());
    g[9] = (0x9B ^ 0x94);
    g[10] = (70 + 85 - 64 + 58 ^ 15 + 26 - -9 + 109);
    g[11] = (0x2E ^ 0x57 ^ 0x53 ^ 0x2F);
    g[12] = (107 + 39 - 24 + 19 ^ 116 + 73 - 122 + 86);
    g[13] = ((0x32 ^ 0x62) + (0xD4 ^ 0xB1) - (0xE0 ^ 0x8B) + (0x3D ^ 0x57));
    g[14] = "   ".length();
    g[15] = (" ".length() ^ 0x2A ^ 0x27);
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt >= 0;
  }
  
  public static void b() {}
  
  static
  {
    cs.a(1);
    b();
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 29	al:k	Ld;
    //   4: invokestatic 52	al:b	(Ljava/lang/Object;)Z
    //   7: ifeq +11 -> 18
    //   10: getstatic 36	bg:c	Lci;
    //   13: aload_0
    //   14: invokevirtual 71	ci:addElement	(Ljava/lang/Object;)V
    //   17: return
    //   18: getstatic 35	aw:ap	I
    //   21: getstatic 25	al:g	[I
    //   24: iconst_0
    //   25: iaload
    //   26: irem
    //   27: getstatic 25	al:g	[I
    //   30: iconst_3
    //   31: iaload
    //   32: invokestatic 58	al:e	(II)Z
    //   35: ifeq +267 -> 302
    //   38: aload_0
    //   39: getfield 29	al:k	Ld;
    //   42: getstatic 25	al:g	[I
    //   45: bipush 8
    //   47: iaload
    //   48: putfield 41	d:d	B
    //   51: aload_0
    //   52: getfield 29	al:k	Ld;
    //   55: getstatic 25	al:g	[I
    //   58: bipush 8
    //   60: iaload
    //   61: putfield 40	d:c	S
    //   64: getstatic 25	al:g	[I
    //   67: iconst_1
    //   68: iaload
    //   69: istore_1
    //   70: iload_1
    //   71: aload_0
    //   72: getfield 26	al:h	Lci;
    //   75: invokevirtual 80	java/util/Vector:size	()I
    //   78: invokestatic 54	al:c	(II)Z
    //   81: ifeq +49 -> 130
    //   84: aload_0
    //   85: getfield 26	al:h	Lci;
    //   88: iload_1
    //   89: invokevirtual 72	ci:elementAt	(I)Ljava/lang/Object;
    //   92: checkcast 14	d
    //   95: dup
    //   96: astore_2
    //   97: getstatic 25	al:g	[I
    //   100: bipush 8
    //   102: iaload
    //   103: putfield 40	d:c	S
    //   106: aload_2
    //   107: getstatic 25	al:g	[I
    //   110: bipush 8
    //   112: iaload
    //   113: putfield 41	d:d	B
    //   116: iinc 1 1
    //   119: ldc 3
    //   121: invokevirtual 77	java/lang/String:length	()I
    //   124: pop
    //   125: aconst_null
    //   126: ifnull -56 -> 70
    //   129: return
    //   130: aload_0
    //   131: getfield 34	al:p	Z
    //   134: invokestatic 56	al:d	(I)Z
    //   137: ifeq +97 -> 234
    //   140: aload_0
    //   141: getfield 33	al:o	Z
    //   144: invokestatic 56	al:d	(I)Z
    //   147: ifeq +87 -> 234
    //   150: aload_0
    //   151: getfield 26	al:h	Lci;
    //   154: invokevirtual 80	java/util/Vector:size	()I
    //   157: getstatic 25	al:g	[I
    //   160: iconst_3
    //   161: iaload
    //   162: invokestatic 57	al:d	(II)Z
    //   165: ifeq +69 -> 234
    //   168: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   171: ldc2_w 19
    //   174: ldiv
    //   175: aload_0
    //   176: getfield 30	al:l	J
    //   179: lsub
    //   180: ldc2_w 21
    //   183: invokestatic 46	al:a	(JJ)I
    //   186: invokestatic 44	al:a	(I)Z
    //   189: ifeq +45 -> 234
    //   192: aload_0
    //   193: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   196: ldc2_w 19
    //   199: ldiv
    //   200: putfield 30	al:l	J
    //   203: aload_0
    //   204: aload_0
    //   205: getfield 26	al:h	Lci;
    //   208: getstatic 25	al:g	[I
    //   211: iconst_1
    //   212: iaload
    //   213: invokevirtual 72	ci:elementAt	(I)Ljava/lang/Object;
    //   216: checkcast 14	d
    //   219: putfield 29	al:k	Ld;
    //   222: aload_0
    //   223: getfield 26	al:h	Lci;
    //   226: getstatic 25	al:g	[I
    //   229: iconst_1
    //   230: iaload
    //   231: invokevirtual 74	ci:removeElementAt	(I)V
    //   234: aload_0
    //   235: aload_0
    //   236: getfield 26	al:h	Lci;
    //   239: aload_0
    //   240: getfield 29	al:k	Ld;
    //   243: aload_0
    //   244: getfield 34	al:p	Z
    //   247: invokespecial 47	al:a	(Lci;Ld;Z)V
    //   250: aload_0
    //   251: getfield 28	al:j	I
    //   254: getstatic 25	al:g	[I
    //   257: bipush 14
    //   259: iaload
    //   260: invokestatic 57	al:d	(II)Z
    //   263: ifeq +25 -> 288
    //   266: aload_0
    //   267: getstatic 25	al:g	[I
    //   270: iconst_5
    //   271: iaload
    //   272: putfield 24	al:b	I
    //   275: getstatic 37	bg:f	Lci;
    //   278: aload_0
    //   279: invokevirtual 73	ci:removeElement	(Ljava/lang/Object;)Z
    //   282: ldc 3
    //   284: invokevirtual 77	java/lang/String:length	()I
    //   287: pop2
    //   288: aload_0
    //   289: dup
    //   290: getfield 28	al:j	I
    //   293: getstatic 25	al:g	[I
    //   296: iconst_3
    //   297: iaload
    //   298: iadd
    //   299: putfield 28	al:j	I
    //   302: return
    //   303: ldc 3
    //   305: invokevirtual 77	java/lang/String:length	()I
    //   308: pop2
    //   309: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	310	0	this	al
    //   69	48	1	i1	int
    //   96	11	2	locald	d
    //   303	1	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   18	302	303	java/lang/Exception
  }
  
  private static boolean c(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt != 0;
  }
  
  public static void a(ci paramci, d paramd, int paramInt)
  {
    al localal;
    (localal = new al()).n[g[3]] = paramInt;
    paramInt = g[1];
    while (c(paramInt, paramci.size()))
    {
      d locald;
      if ((a(locald = (d)paramci.elementAt(paramInt))) && ((!c(bc.a(locald.e - paramd.e), g[6])) || (b(bc.a(locald.b - paramd.b), g[7])))) {
        paramci.removeElementAt(paramInt);
      }
      paramInt++;
      "".length();
      if (((0xB9 ^ 0xB4) & (0x65 ^ 0x68 ^ 0xFFFFFFFF)) >= "  ".length()) {
        return;
      }
    }
    localal.a(paramci, paramd, g[3]);
    bg.f.addElement(localal);
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private void a(ci paramci, d paramd, boolean paramBoolean)
  {
    if (d(paramci.size()))
    {
      this.p = paramBoolean;
      ci localci3;
      d locald5;
      if (c(paramBoolean))
      {
        ci localci1 = paramci;
        i3 = paramci.size();
        int i4 = g[1];
        while (c(i4, i3 - g[3]))
        {
          Object localObject = (d)localci1.elementAt(i4);
          localci3 = i4 + g[3];
          while (c(localci3, i3))
          {
            locald5 = (d)localci1.elementAt(localci3);
            if (d(((d)localObject).e, locald5.e))
            {
              localci1.setElementAt(localObject, localci3);
              localci1.setElementAt(locald5, i4);
              localObject = locald5;
            }
            localci3++;
            "".length();
            if ((0x36 ^ 0x32) != (0x77 ^ 0x73)) {
              return;
            }
          }
          i4++;
          "".length();
          if (((0x2D ^ 0x4C ^ 70 + 71 - 29 + 15) & (0x3D ^ 0x4F ^ 0x40 ^ 0x2C ^ -" ".length())) != 0) {
            return;
          }
        }
      }
      this.h = paramci;
      this.k = paramd;
      this.a = new ci[paramci.size()];
      int i1 = g[1];
      while (c(i1, this.a.length))
      {
        this.a[i1] = new ci();
        i1++;
        "".length();
        if ("  ".length() < -" ".length()) {
          return;
        }
      }
      paramd.d = g[8];
      this.a[g[1]].addElement(paramd);
      i1 = g[8];
      int i3 = g[1];
      int i9;
      label639:
      int i14;
      int i8;
      int i12;
      int i13;
      if (c(i3, paramci.size()))
      {
        i9 = paramd.e;
        int i15 = paramd.b;
        if ((d(paramBoolean)) && (a(i1, g[8])))
        {
          d locald2;
          i9 = (locald2 = (d)paramci.elementAt(i1)).e;
          i15 = locald2.b;
        }
        if (d(paramBoolean))
        {
          i1 += g[3];
          "".length();
          if (-" ".length() < 0) {}
        }
        else
        {
          ci localci2 = paramci;
          i5 = g[1];
          int i6 = g[1];
          while (c(i6, localci2.size()))
          {
            if (e(((d)localci2.elementAt(i6)).c, g[8])) {
              i5++;
            }
            i6++;
            "".length();
            if (" ".length() == 0) {
              return;
            }
          }
          if (d(i5))
          {
            i5 = bc.c(i5);
            i6 = g[1];
            localci3 = g[1];
            while (c(localci3, localci2.size()))
            {
              if (e((locald5 = (d)localci2.elementAt(localci3)).c, g[8]))
              {
                if (e(i5, i6))
                {
                  locald5.c = g[1];
                  localci2 = localci3;
                  "".length();
                  if (null == null) {
                    break label639;
                  }
                  return;
                }
                i6++;
              }
              localci3++;
              "".length();
              if (-"  ".length() > 0) {
                return;
              }
            }
          }
          i2 = g[8];
        }
        int i2 = i2;
        int i5 = this.a[i2].size() - g[3];
        d locald4;
        localci3 = bc.a((locald4 = (d)paramci.elementAt(i2)).e - i9, -(locald4.b - i15));
        i14 = bc.c(g[9]) + g[10];
        i8 = g[1];
        do
        {
          int i10 = g[1];
          if (d(i8)) {
            i10 = localci3 - g[11] + bc.c(g[10]);
          }
          i10 = bc.d(i10);
          i12 = i14 * i8 * bc.f(i10) >> g[10];
          i13 = -(i14 * i8 * bc.b(i10)) >> g[10];
          d locald6 = new d(i9 + i12, i15 + i13, i5++);
          this.a[i2].addElement(locald6);
          if (b(bc.a(i9, i15, i9 + i12, i15 + i13), bc.a(i9, i15, locald4.e, locald4.b) - g[12]))
          {
            i3++;
            "".length();
            if ((0xEA ^ 0xB1 ^ 0xE8 ^ 0xB7) >= "   ".length()) {
              break;
            }
            return;
          }
          i8++;
          "".length();
        } while ("   ".length() > 0);
        return;
      }
      i3 = g[1];
      while (c(i3, this.a.length))
      {
        i9 = this.a[i3].size();
        d locald7;
        (locald7 = (d)paramci.elementAt(i3)).d = ((byte)(this.a[i3].size() - g[3]));
        locald7.c = g[8];
        d locald3;
        (locald3 = new d(locald7.e, locald7.b, locald7.d)).c = g[8];
        this.a[i3].addElement(locald3);
        int i7 = g[3];
        while (c(i7, i9))
        {
          d locald1 = (d)this.a[i3].elementAt(i7);
          i14 = bc.c(g[0]);
          i8 = g[1];
          while (c(i8, i14))
          {
            int i11 = g[13] + bc.c(g[13]);
            i13 = (i12 = g[11] + bc.c(g[10])) * bc.f(bc.d(i11)) >> g[10];
            i11 = -(i12 * bc.b(bc.d(i11))) >> g[10];
            (paramd = new d(locald1.e + i13, locald1.b + i11, i7)).c = g[1];
            this.a[i3].addElement(paramd);
            i8++;
            "".length();
            if (-(0x18 ^ 0x1C) >= 0) {
              return;
            }
          }
          i7++;
          "".length();
          if ("  ".length() == " ".length()) {
            return;
          }
        }
        i3++;
        "".length();
        if ("   ".length() > "   ".length()) {}
      }
    }
  }
  
  public final void a(cf paramcf)
  {
    this.m = g[1];
    this.i += g[3];
    if (b(this.i, g[15])) {
      this.i = g[1];
    }
    if (a(this.a))
    {
      int i1 = g[1];
      while (c(i1, this.a.length))
      {
        int i2 = g[1];
        while (c(i2, this.a[i1].size()))
        {
          d locald2;
          if ((b((locald2 = (d)this.a[i1].elementAt(i2)).d)) && (c(locald2.d, this.a[i1].size())))
          {
            d locald3 = (d)this.a[i1].elementAt(locald2.d);
            if ((d(aw.e(locald2.e, locald2.b))) && (d(aw.e(locald3.e, locald3.b))))
            {
              paramcf.a(this.n[g[1]]);
              paramcf.d(locald2.e, locald2.b, locald3.e, locald3.b);
              if (e(locald2.c, g[8]))
              {
                paramcf.a(this.n[g[3]]);
                paramcf.d(locald2.e - g[3], locald2.b, locald3.e - g[3], locald3.b);
                if ((d(this.p)) && (d(this.o))) {
                  paramcf.d(locald2.e + g[3], locald2.b, locald3.e + g[3], locald3.b);
                }
              }
            }
            if ((d(this.p)) && (d(this.o)))
            {
              this.m += g[3];
              if (b(this.m, this.b))
              {
                this.b += g[5];
                return;
              }
            }
          }
          i2++;
          "".length();
          if (-(0x8D ^ 0x89) > 0) {
            return;
          }
        }
        d tmp456_453 = ((d)this.h.elementAt(i1));
        d locald1;
        tmp456_453.a = ((byte)((locald1 = tmp456_453).a + g[3]));
        if (b(locald1.a, g[15])) {
          locald1.a = g[1];
        }
        i1++;
        "".length();
        if (("   ".length() & ("   ".length() ^ -" ".length())) != 0) {}
      }
    }
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 > paramInt2;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject == null;
  }
  
  public static void c() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\al.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */