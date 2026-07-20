import java.io.DataInputStream;
import java.io.IOException;

public final class w
  implements Runnable
{
  private au a;
  private static int[] b;
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static int a(long paramLong1, long paramLong2)
  {
    return paramLong1 < paramLong2;
  }
  
  w(au paramau)
  {
    this.a = paramau;
  }
  
  private static void c()
  {
    b = new int[12];
    b[0] = (-(0x33 ^ 0x75 ^ 0x67 ^ 0x1));
    b[1] = (63 + '¿' - 207 + 155 + (0x11 ^ 0x67) - (93 + 63 - 148 + 128) + (0x4F ^ 0x8));
    b[2] = (" ".length() ^ 0x1D ^ 0x4);
    b[3] = (0xF6 ^ 0xC1 ^ 0x52 ^ 0x75);
    b[4] = (81 + 26 - 64 + 101 ^ 5 + 32 - -20 + 95);
    b[5] = ((0x2A ^ 0x42 ^ 0x4A ^ 0x34) & (0x15 ^ 0x7C ^ 30 + 98 - 109 + 108 ^ -" ".length()));
    b[6] = (-" ".length());
    b[7] = (0x77 ^ 0x4E ^ 0xA6 ^ 0x9A);
    b[8] = (0xF684 & 0xD7B);
    b[9] = (0x67 ^ 0x1);
    b[10] = (-(0xA2 ^ 0xB9));
    b[11] = " ".length();
  }
  
  private static boolean a(int paramInt)
  {
    return paramInt > 0;
  }
  
  private static boolean b(int paramInt)
  {
    return paramInt != 0;
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	w:a	Lau;
    //   4: getfield 24	au:d	Z
    //   7: invokestatic 60	w:b	(I)Z
    //   10: ifeq +688 -> 698
    //   13: aload_0
    //   14: getfield 34	w:a	Lau;
    //   17: getfield 28	au:l	Ljava/io/DataInputStream;
    //   20: invokevirtual 44	java/io/DataInputStream:readByte	()B
    //   23: istore_1
    //   24: aload_0
    //   25: getfield 34	w:a	Lau;
    //   28: invokestatic 37	au:b	(Lau;)Z
    //   31: invokestatic 60	w:b	(I)Z
    //   34: ifeq +12 -> 46
    //   37: aload_0
    //   38: getfield 34	w:a	Lau;
    //   41: iload_1
    //   42: invokestatic 36	au:a	(Lau;B)B
    //   45: istore_1
    //   46: iload_1
    //   47: getstatic 35	w:b	[I
    //   50: iconst_0
    //   51: iaload
    //   52: invokestatic 56	w:a	(II)Z
    //   55: ifeq +177 -> 232
    //   58: aload_0
    //   59: getfield 34	w:a	Lau;
    //   62: getfield 28	au:l	Ljava/io/DataInputStream;
    //   65: invokevirtual 44	java/io/DataInputStream:readByte	()B
    //   68: istore_1
    //   69: aload_0
    //   70: getfield 34	w:a	Lau;
    //   73: invokestatic 37	au:b	(Lau;)Z
    //   76: invokestatic 60	w:b	(I)Z
    //   79: ifeq +12 -> 91
    //   82: aload_0
    //   83: getfield 34	w:a	Lau;
    //   86: iload_1
    //   87: invokestatic 36	au:a	(Lau;B)B
    //   90: istore_1
    //   91: aload_0
    //   92: getfield 34	w:a	Lau;
    //   95: aload_0
    //   96: getfield 34	w:a	Lau;
    //   99: getfield 28	au:l	Ljava/io/DataInputStream;
    //   102: invokevirtual 44	java/io/DataInputStream:readByte	()B
    //   105: invokestatic 36	au:a	(Lau;B)B
    //   108: istore_2
    //   109: aload_0
    //   110: getfield 34	w:a	Lau;
    //   113: aload_0
    //   114: getfield 34	w:a	Lau;
    //   117: getfield 28	au:l	Ljava/io/DataInputStream;
    //   120: invokevirtual 44	java/io/DataInputStream:readByte	()B
    //   123: invokestatic 36	au:a	(Lau;B)B
    //   126: istore_3
    //   127: aload_0
    //   128: getfield 34	w:a	Lau;
    //   131: aload_0
    //   132: getfield 34	w:a	Lau;
    //   135: getfield 28	au:l	Ljava/io/DataInputStream;
    //   138: invokevirtual 44	java/io/DataInputStream:readByte	()B
    //   141: invokestatic 36	au:a	(Lau;B)B
    //   144: istore 4
    //   146: aload_0
    //   147: getfield 34	w:a	Lau;
    //   150: aload_0
    //   151: getfield 34	w:a	Lau;
    //   154: getfield 28	au:l	Ljava/io/DataInputStream;
    //   157: invokevirtual 44	java/io/DataInputStream:readByte	()B
    //   160: invokestatic 36	au:a	(Lau;B)B
    //   163: istore 5
    //   165: iload_2
    //   166: getstatic 35	w:b	[I
    //   169: iconst_1
    //   170: iaload
    //   171: iand
    //   172: getstatic 35	w:b	[I
    //   175: iconst_2
    //   176: iaload
    //   177: ishl
    //   178: iload_3
    //   179: getstatic 35	w:b	[I
    //   182: iconst_1
    //   183: iaload
    //   184: iand
    //   185: getstatic 35	w:b	[I
    //   188: iconst_3
    //   189: iaload
    //   190: ishl
    //   191: ior
    //   192: iload 4
    //   194: getstatic 35	w:b	[I
    //   197: iconst_1
    //   198: iaload
    //   199: iand
    //   200: getstatic 35	w:b	[I
    //   203: iconst_4
    //   204: iaload
    //   205: ishl
    //   206: ior
    //   207: iload 5
    //   209: getstatic 35	w:b	[I
    //   212: iconst_1
    //   213: iaload
    //   214: iand
    //   215: ior
    //   216: istore_2
    //   217: ldc 1
    //   219: invokevirtual 47	java/lang/String:length	()I
    //   222: pop
    //   223: ldc 2
    //   225: invokevirtual 47	java/lang/String:length	()I
    //   228: ifgt +101 -> 329
    //   231: return
    //   232: aload_0
    //   233: getfield 34	w:a	Lau;
    //   236: invokestatic 37	au:b	(Lau;)Z
    //   239: invokestatic 60	w:b	(I)Z
    //   242: ifeq +76 -> 318
    //   245: aload_0
    //   246: getfield 34	w:a	Lau;
    //   249: getfield 28	au:l	Ljava/io/DataInputStream;
    //   252: invokevirtual 44	java/io/DataInputStream:readByte	()B
    //   255: istore_2
    //   256: aload_0
    //   257: getfield 34	w:a	Lau;
    //   260: getfield 28	au:l	Ljava/io/DataInputStream;
    //   263: invokevirtual 44	java/io/DataInputStream:readByte	()B
    //   266: istore_3
    //   267: aload_0
    //   268: getfield 34	w:a	Lau;
    //   271: iload_2
    //   272: invokestatic 36	au:a	(Lau;B)B
    //   275: getstatic 35	w:b	[I
    //   278: iconst_1
    //   279: iaload
    //   280: iand
    //   281: getstatic 35	w:b	[I
    //   284: iconst_4
    //   285: iaload
    //   286: ishl
    //   287: aload_0
    //   288: getfield 34	w:a	Lau;
    //   291: iload_3
    //   292: invokestatic 36	au:a	(Lau;B)B
    //   295: getstatic 35	w:b	[I
    //   298: iconst_1
    //   299: iaload
    //   300: iand
    //   301: ior
    //   302: istore_2
    //   303: ldc 1
    //   305: invokevirtual 47	java/lang/String:length	()I
    //   308: pop
    //   309: ldc 3
    //   311: invokevirtual 47	java/lang/String:length	()I
    //   314: ifgt +15 -> 329
    //   317: return
    //   318: aload_0
    //   319: getfield 34	w:a	Lau;
    //   322: getfield 28	au:l	Ljava/io/DataInputStream;
    //   325: invokevirtual 45	java/io/DataInputStream:readUnsignedShort	()I
    //   328: istore_2
    //   329: iload_2
    //   330: newarray <illegal type>
    //   332: astore 4
    //   334: getstatic 35	w:b	[I
    //   337: iconst_5
    //   338: iaload
    //   339: istore 5
    //   341: getstatic 35	w:b	[I
    //   344: iconst_5
    //   345: iaload
    //   346: istore_3
    //   347: iload_3
    //   348: getstatic 35	w:b	[I
    //   351: bipush 6
    //   353: iaload
    //   354: invokestatic 61	w:b	(II)Z
    //   357: ifeq +163 -> 520
    //   360: iload 5
    //   362: iload_2
    //   363: invokestatic 63	w:c	(II)Z
    //   366: ifeq +154 -> 520
    //   369: aload_0
    //   370: getfield 34	w:a	Lau;
    //   373: getfield 28	au:l	Ljava/io/DataInputStream;
    //   376: aload 4
    //   378: iload 5
    //   380: iload_2
    //   381: iload 5
    //   383: isub
    //   384: invokevirtual 43	java/io/DataInputStream:read	([BII)I
    //   387: dup
    //   388: istore_3
    //   389: invokestatic 55	w:a	(I)Z
    //   392: ifeq -45 -> 347
    //   395: iload 5
    //   397: iload_3
    //   398: iadd
    //   399: istore 5
    //   401: aload_0
    //   402: getfield 34	w:a	Lau;
    //   405: dup
    //   406: astore 6
    //   408: dup
    //   409: getfield 25	au:h	I
    //   412: iload 5
    //   414: getstatic 35	w:b	[I
    //   417: bipush 7
    //   419: iaload
    //   420: iadd
    //   421: iadd
    //   422: putfield 25	au:h	I
    //   425: aload_0
    //   426: getfield 34	w:a	Lau;
    //   429: getfield 25	au:h	I
    //   432: aload_0
    //   433: getfield 34	w:a	Lau;
    //   436: getfield 23	au:b	I
    //   439: iadd
    //   440: istore 6
    //   442: aload_0
    //   443: getfield 34	w:a	Lau;
    //   446: new 17	java/lang/StringBuffer
    //   449: dup
    //   450: invokespecial 48	java/lang/StringBuffer:<init>	()V
    //   453: iload 6
    //   455: getstatic 35	w:b	[I
    //   458: bipush 8
    //   460: iaload
    //   461: idiv
    //   462: invokevirtual 49	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   465: ldc 5
    //   467: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   470: iload 6
    //   472: getstatic 35	w:b	[I
    //   475: bipush 8
    //   477: iaload
    //   478: irem
    //   479: getstatic 35	w:b	[I
    //   482: bipush 9
    //   484: iaload
    //   485: idiv
    //   486: invokevirtual 49	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   489: ldc 6
    //   491: invokevirtual 50	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   494: invokevirtual 51	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   497: putfield 31	au:p	Ljava/lang/String;
    //   500: ldc 1
    //   502: invokevirtual 47	java/lang/String:length	()I
    //   505: pop
    //   506: ldc 2
    //   508: invokevirtual 47	java/lang/String:length	()I
    //   511: ldc 4
    //   513: invokevirtual 47	java/lang/String:length	()I
    //   516: if_icmpne -169 -> 347
    //   519: return
    //   520: aload_0
    //   521: getfield 34	w:a	Lau;
    //   524: invokestatic 37	au:b	(Lau;)Z
    //   527: invokestatic 60	w:b	(I)Z
    //   530: ifeq +69 -> 599
    //   533: getstatic 35	w:b	[I
    //   536: iconst_5
    //   537: iaload
    //   538: istore 6
    //   540: iload 6
    //   542: aload 4
    //   544: arraylength
    //   545: invokestatic 63	w:c	(II)Z
    //   548: ifeq +51 -> 599
    //   551: aload 4
    //   553: iload 6
    //   555: aload_0
    //   556: getfield 34	w:a	Lau;
    //   559: aload 4
    //   561: iload 6
    //   563: baload
    //   564: invokestatic 36	au:a	(Lau;B)B
    //   567: bastore
    //   568: iinc 6 1
    //   571: ldc 1
    //   573: invokevirtual 47	java/lang/String:length	()I
    //   576: pop
    //   577: ldc 3
    //   579: invokevirtual 47	java/lang/String:length	()I
    //   582: bipush 83
    //   584: bipush 109
    //   586: ixor
    //   587: bipush 8
    //   589: bipush 54
    //   591: ixor
    //   592: iconst_m1
    //   593: ixor
    //   594: iand
    //   595: if_icmpge -55 -> 540
    //   598: return
    //   599: aload_0
    //   600: getfield 34	w:a	Lau;
    //   603: invokestatic 52	java/lang/System:currentTimeMillis	()J
    //   606: putfield 29	au:m	J
    //   609: new 9	bj
    //   612: dup
    //   613: iload_1
    //   614: aload 4
    //   616: invokespecial 41	bj:<init>	(B[B)V
    //   619: dup
    //   620: astore 6
    //   622: getfield 33	bj:d	B
    //   625: getstatic 35	w:b	[I
    //   628: bipush 10
    //   630: iaload
    //   631: invokestatic 56	w:a	(II)Z
    //   634: ifeq +20 -> 654
    //   637: aload_0
    //   638: aload 6
    //   640: invokespecial 58	w:a	(Lbj;)V
    //   643: ldc 1
    //   645: invokevirtual 47	java/lang/String:length	()I
    //   648: pop
    //   649: aconst_null
    //   650: ifnull -650 -> 0
    //   653: return
    //   654: aload_0
    //   655: getfield 34	w:a	Lau;
    //   658: getfield 26	au:i	Lac;
    //   661: aload 6
    //   663: invokeinterface 65 2 0
    //   668: ldc 1
    //   670: invokevirtual 47	java/lang/String:length	()I
    //   673: pop
    //   674: sipush 196
    //   677: sipush 174
    //   680: ixor
    //   681: sipush 207
    //   684: sipush 161
    //   687: ixor
    //   688: ixor
    //   689: ldc 4
    //   691: invokevirtual 47	java/lang/String:length	()I
    //   694: if_icmpge -694 -> 0
    //   697: return
    //   698: return
    //   699: ldc 1
    //   701: invokevirtual 47	java/lang/String:length	()I
    //   704: pop2
    //   705: aload_0
    //   706: getfield 34	w:a	Lau;
    //   709: getfield 24	au:d	Z
    //   712: invokestatic 60	w:b	(I)Z
    //   715: ifeq +84 -> 799
    //   718: aload_0
    //   719: getfield 34	w:a	Lau;
    //   722: getfield 27	au:k	Ljavax/microedition/io/SocketConnection;
    //   725: invokestatic 59	w:a	(Ljava/lang/Object;)Z
    //   728: ifeq +10 -> 738
    //   731: aload_0
    //   732: getfield 34	w:a	Lau;
    //   735: invokevirtual 40	au:f	()V
    //   738: aload_0
    //   739: getfield 34	w:a	Lau;
    //   742: getfield 26	au:i	Lac;
    //   745: invokestatic 59	w:a	(Ljava/lang/Object;)Z
    //   748: ifeq +51 -> 799
    //   751: invokestatic 52	java/lang/System:currentTimeMillis	()J
    //   754: aload_0
    //   755: getfield 34	w:a	Lau;
    //   758: invokestatic 39	au:d	(Lau;)J
    //   761: lsub
    //   762: ldc2_w 21
    //   765: invokestatic 57	w:a	(JJ)I
    //   768: invokestatic 55	w:a	(I)Z
    //   771: ifeq +16 -> 787
    //   774: aload_0
    //   775: getfield 34	w:a	Lau;
    //   778: getfield 26	au:i	Lac;
    //   781: invokeinterface 66 1 0
    //   786: return
    //   787: aload_0
    //   788: getfield 34	w:a	Lau;
    //   791: getfield 26	au:i	Lac;
    //   794: invokeinterface 64 1 0
    //   799: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	800	0	this	w
    //   23	591	1	b1	byte
    //   108	164	2	i	int
    //   302	82	2	j	int
    //   126	166	3	k	int
    //   346	53	3	m	int
    //   144	56	4	n	int
    //   332	283	4	arrayOfByte	byte[]
    //   163	258	5	i1	int
    //   406	1	6	localau	au
    //   440	129	6	i2	int
    //   620	42	6	localbj	bj
    //   699	1	12	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   0	698	699	java/lang/Exception
  }
  
  private void a(bj parambj)
  {
    try
    {
      bj localbj;
      int i = (localbj = parambj).a.readByte();
      this.a.o = new byte[i];
      int j = b[5];
      while (c(j, i))
      {
        this.a.o[j] = (localbj = parambj).a.readByte();
        j++;
        "".length();
        if (" ".length() < " ".length()) {
          return;
        }
      }
      j = b[5];
      while (c(j, this.a.o.length - b[11]))
      {
        int tmp122_121 = (j + b[11]);
        byte[] tmp122_113 = (parambj = this.a.o);
        tmp122_113[tmp122_121] = ((byte)(tmp122_113[tmp122_121] ^ this.a.o[j]));
        j++;
        "".length();
        if ("   ".length() == " ".length()) {
          return;
        }
      }
      au.c(this.a);
      return;
    }
    catch (IOException localIOException2)
    {
      IOException localIOException1;
      (localIOException1 = localIOException2).printStackTrace();
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  private static boolean b(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  public static void a() {}
  
  static
  {
    cs.a(110);
    a();
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public static void b() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\w.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */