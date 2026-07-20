public class bo
  extends r
{
  private static int[] v;
  
  public boolean e(dt paramdt)
  {
    if (d(paramdt.cj, v[0])) {
      return v[1];
    }
    return v[2];
  }
  
  private static boolean c(int paramInt1, int paramInt2)
  {
    return paramInt1 != paramInt2;
  }
  
  private static boolean d(int paramInt1, int paramInt2)
  {
    return paramInt1 >= paramInt2;
  }
  
  private static boolean a(Object paramObject)
  {
    return paramObject != null;
  }
  
  private static boolean d(int paramInt)
  {
    return paramInt == 0;
  }
  
  private static boolean e(int paramInt)
  {
    return paramInt != 0;
  }
  
  private static boolean e(int paramInt1, int paramInt2)
  {
    return paramInt1 < paramInt2;
  }
  
  public final void b()
  {
    dt localdt = dt.g();
    if (e(e(localdt)))
    {
      fn.a("Xong!");
      dn.r();
      return;
    }
    byte b1 = fn.q();
    byte b2 = fn.an();
    if (f(dt.g().ef))
    {
      r.a(v[2]);
      return;
    }
    if (b(localdt.fj))
    {
      if (c(et.o, b1))
      {
        super.a(b1, v[21], v[12], v[12]);
        return;
      }
      fn.c(b2, v[2], v[2]);
      dl.ae().l(b2, v[2]);
      cn.ac();
      this.f = v[12];
      return;
    }
    if (d(localdt.fj.e, localdt.fj.a.length - v[1]))
    {
      if (c(et.o, b1))
      {
        super.a(b1, v[21], v[12], v[12]);
        return;
      }
      fn.c(b2, v[2], v[2]);
      dl.ae().l(b2, v[2]);
      cn.ac();
      this.f = v[12];
      return;
    }
    a(localdt, b1, b2);
  }
  
  private static boolean f(int paramInt1, int paramInt2)
  {
    return paramInt1 == paramInt2;
  }
  
  public static void c() {}
  
  static
  {
    cs.a(85);
    c();
  }
  
  private static void p()
  {
    v = new int[24];
    v[0] = ('µ' + 44 - 211 + 173 ^ 25 + 115 - 53 + 91);
    v[1] = " ".length();
    v[2] = ((0x34 ^ 0x47 ^ 0x2C ^ 0x49) & (0xBD ^ 0xA1 ^ 0xB3 ^ 0xB9 ^ -" ".length()));
    v[3] = "   ".length();
    v[4] = "  ".length();
    v[5] = (0x31 ^ 0x35);
    v[6] = (0xB9 ^ 0xBC ^ "   ".length());
    v[7] = (35 + '' - 29 + 25 ^ 40 + '' - 23 + 40);
    v[8] = ('' + 1 - 140 + 210 ^ 111 + 21 - -33 + 28);
    v[9] = (122 + 59 - 115 + 79 ^ 19 + '' - 127 + 114);
    v[10] = (0x29 ^ 0x2E);
    v[11] = (0x57 ^ 0x52 ^ 0x74 ^ 0x67);
    v[12] = (-" ".length());
    v[13] = (28 + '' - 70 + 46 ^ 59 + 105 - 75 + 92);
    v[14] = (0xD4 ^ 0x9F ^ 0x4F ^ 0x11);
    v[15] = ((0xF2 ^ 0xC3) + (86 + 93 - 60 + 18) - (0xF5 ^ 0xC7) + (0x7E ^ 0x37));
    v[16] = (74 + 12 - -36 + 88);
    v[17] = (34 + 21 - -45 + 62 ^ 72 + '' - 69 + 32);
    v[18] = ((0x9 ^ 0x58) + ('' + 97 - 99 + 6) - (0x55 ^ 0x16) + (0xE9 ^ 0xA8));
    v[19] = (0x2D ^ 0x1B);
    v[20] = (0x55 ^ 0x4F);
    v[21] = (-"  ".length());
    v[22] = (0xC2 ^ 0x85);
    v[23] = (0x7B ^ 0x70);
  }
  
  private static boolean f(int paramInt)
  {
    return paramInt <= 0;
  }
  
  public void a(dt paramdt, byte paramByte1, byte paramByte2)
  {
    switch (paramdt.cj)
    {
    case 0: 
      fn.b(v[3], v[4], v[4]);
      r.a(100L);
      fn.b(v[5], v[4], v[4]);
      r.a(100L);
      fn.b(v[6], v[7], v[7]);
      r.a(100L);
      fn.b(v[8], v[9], v[9]);
      r.a(100L);
      fn.b(v[9], v[9], v[9]);
      r.a(100L);
      fn.b(v[10], v[2], v[2]);
      return;
    case 1: 
      if (d(paramdt.fj.e))
      {
        fn.c(paramByte2, v[2], v[2]);
        dl.ae().l(paramByte2, v[4]);
        dl.ae().l(paramByte2, v[1]);
        dl.ae().l(paramByte2, v[4]);
        dl.ae().l(paramByte2, v[3]);
        dl.ae().l(paramByte2, v[1]);
        cn.ac();
        return;
      }
      break;
    case 2: 
      if (d(paramdt.fj.e))
      {
        if (a(paramdt.w[v[2]])) {
          dl.ae().ad(v[2]);
        }
        cn.ac();
        return;
      }
      if (f(paramdt.fj.e, v[1]))
      {
        if (f(et.o, v[11]))
        {
          c(v[12]);
          b(v[2], v[1]);
          return;
        }
        a(v[11], v[12], v[12], v[12]);
        return;
      }
      break;
    case 3: 
      if (d(paramdt.fj.e)) {
        try
        {
          Thread.sleep(2000L);
          fn.c(v[5], v[2], v[2]);
          dl.ae().d(v[0], v[2], v[3]);
          cn.ac();
          return;
        }
        catch (InterruptedException localInterruptedException2)
        {
          (paramByte1 = localInterruptedException2).printStackTrace();
        }
      }
      if (f(paramdt.fj.e, v[1]))
      {
        if (a(paramdt.w[v[2]])) {
          dl.ae().ad(v[2]);
        }
        cn.ac();
        return;
      }
      if (f(paramdt.fj.e, v[4]))
      {
        if (f(et.o, v[13]))
        {
          c(v[12]);
          b(v[1], v[1]);
          return;
        }
        a(v[13], v[12], v[12], v[12]);
        return;
      }
      if (f(paramdt.fj.e, v[3]))
      {
        if (f(et.o, v[13]))
        {
          c(v[12]);
          b(v[4], v[1]);
          return;
        }
        a(v[13], v[12], v[12], v[12]);
        return;
      }
      break;
    case 4: 
      if (d(paramdt.fj.e))
      {
        if (f(et.o, v[14]))
        {
          c(v[12]);
          b(v[12], v[1]);
          return;
        }
        a(v[14], v[12], v[12], v[12]);
        return;
      }
      if (f(paramdt.fj.e, v[1]))
      {
        if (f(et.o, v[14]))
        {
          c(v[15]);
          b(v[3], v[1]);
          return;
        }
        a(v[14], v[12], v[12], v[12]);
        return;
      }
      if (f(paramdt.fj.e, v[4]))
      {
        if (f(et.o, v[13]))
        {
          c(v[16]);
          b(v[5], v[1]);
          return;
        }
        a(v[13], v[12], v[12], v[12]);
        return;
      }
      break;
    case 5: 
      if (d(paramdt.fj.e))
      {
        if (f(et.o, v[17]))
        {
          c(v[12]);
          b(v[3], v[1]);
          return;
        }
        a(v[17], v[12], v[12], v[12]);
        return;
      }
      if (f(paramdt.fj.e, v[1]))
      {
        if (f(et.o, v[17]))
        {
          c(v[18]);
          b(v[19], v[1]);
          return;
        }
        a(v[17], v[12], v[12], v[12]);
        return;
      }
      break;
    case 6: 
      if (d(paramdt.fj.e))
      {
        if (f(et.o, v[20]))
        {
          c(v[12]);
          b(v[12], v[1]);
          return;
        }
        a(v[20], v[12], v[12], v[12]);
        return;
      }
      if (f(paramdt.fj.e, v[1])) {
        try
        {
          super.a(v[4], v[21], v[12], v[12]);
          Thread.sleep(500L);
          return;
        }
        catch (InterruptedException localInterruptedException3)
        {
          (paramByte1 = localInterruptedException3).printStackTrace();
        }
      }
      if (f(paramdt.fj.e, v[4])) {
        try
        {
          super.a(v[22], v[21], v[12], v[12]);
          Thread.sleep(500L);
          return;
        }
        catch (InterruptedException localInterruptedException4)
        {
          (paramByte1 = localInterruptedException4).printStackTrace();
        }
      }
      if (f(paramdt.fj.e, v[3])) {
        try
        {
          super.a(v[20], v[21], v[12], v[12]);
          Thread.sleep(500L);
          return;
        }
        catch (InterruptedException localInterruptedException5)
        {
          (paramByte1 = localInterruptedException5).printStackTrace();
          return;
        }
      }
      break;
    case 7: 
      if (d(paramdt.fj.e))
      {
        if (f(et.o, v[22]))
        {
          c(v[12]);
          b(v[12], v[1]);
          return;
        }
        a(v[22], v[12], v[12], v[12]);
        return;
      }
      if (f(paramdt.fj.e, v[1]))
      {
        super.a(paramByte1, v[21], v[12], v[12]);
        fn.c(paramByte2, v[2], v[2]);
        dl.ae().l(paramByte2, v[1]);
        r.a(100L);
        dl.ae().l(paramByte2, v[2]);
        r.a(100L);
        dl.ae().l(paramByte2, v[1]);
        r.a(100L);
        dl.ae().l(paramByte2, v[1]);
        r.a(100L);
        dl.ae().l(paramByte2, v[4]);
        r.a(100L);
        dl.ae().l(paramByte2, v[4]);
        r.a(100L);
        cn.ac();
        return;
      }
      if (f(paramdt.fj.e, v[6]))
      {
        fn.c(paramByte2, v[2], v[2]);
        dl.ae().l(paramByte2, v[4]);
        r.a(100L);
        dl.ae().l(paramByte2, v[2]);
        r.a(100L);
        dl.ae().l(paramByte2, v[4]);
        r.a(100L);
        dl.ae().l(paramByte2, v[4]);
        r.a(100L);
        dl.ae().l(paramByte2, v[1]);
        r.a(100L);
        cn.ac();
        return;
      }
      if (f(paramdt.fj.e, v[23]))
      {
        fn.c(paramByte2, v[2], v[2]);
        dl.ae().l(paramByte2, v[2]);
        r.a(100L);
        dl.ae().l(paramByte2, v[1]);
        r.a(100L);
        dl.ae().l(paramByte2, v[4]);
        r.a(100L);
        dl.ae().l(paramByte2, v[4]);
        r.a(100L);
        dl.ae().l(paramByte2, v[1]);
        r.a(100L);
        cn.ac();
        return;
      }
      break;
    case 8: 
      if (d(paramdt.fj.e))
      {
        if (f(et.o, v[20]))
        {
          c(v[12]);
          b(v[12], v[1]);
          return;
        }
        a(v[20], v[12], v[12], v[12]);
        return;
      }
      super.a(paramByte1, v[21], v[12], v[12]);
      fn.b(paramByte2);
      paramByte1 = fc.gn[paramByte2];
      paramdt = v[2];
      while (e(paramdt, paramByte1.f.length))
      {
        if (e(paramByte1.f[paramdt][v[2]].equals("Nói chuyện"))) {
          try
          {
            fn.c(paramByte2, paramdt, v[2]);
            cn.ac();
            Thread.sleep(1000L);
            return;
          }
          catch (InterruptedException localInterruptedException6)
          {
            InterruptedException localInterruptedException1;
            (localInterruptedException1 = localInterruptedException6).printStackTrace();
          }
        }
        paramdt++;
        "".length();
        if (null != null) {}
      }
    }
  }
  
  public bo()
  {
    super.a();
  }
  
  private static boolean b(Object paramObject)
  {
    return paramObject == null;
  }
  
  public String toString()
  {
    return "Auto Nhiệm Vụ 10";
  }
  
  public static void d() {}
}


/* Location:              C:\Users\Admin\OneDrive\Documents\NSOv2_test.jar!\bo.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */