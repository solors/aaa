package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* renamed from: com.facebook.ads.redexgen.X.d0 */
/* loaded from: assets/audience_network.dex */
public final class C13220d0 implements InterfaceC1086400 {
    public static byte[] A09;
    public static String[] A0A = {"jhQijRHeS2b3DC", "TrxlLGPRt74PJqIyPQ202SRMEezA", "IB0ZY9fOXgD7jLe6Y4PRk3dCNjPCK6", "H6fabJXG57DAkPtsQTSNUghzavXSaH69", "ufMT47zQTczJDi2Vdc2LdI1YLyWR3nOe", "Lk9ILhYpp3cxsVDBevZ7UGW4HuH86l", "wl", "vesbJwqYWy5viKlOFyHJIQca6g"};
    public static final String A0B;
    public final int A00;
    public final int A01;
    public final C1087208 A02;
    public final InterfaceC108850L A04;
    public final C113257j A05;
    public final boolean A08;
    public final Map<String, File> A06 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Semaphore> A07 = new HashMap();
    public final C108740A A03 = new C108740A();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0126: INVOKE  
      (r10v1 ?? I:com.facebook.ads.redexgen.X.0L)
      (r11 I:java.lang.String)
      (r12 I:int)
      (r13 I:java.lang.String)
      (r14 I:java.lang.Long)
      (r15 I:java.lang.Long)
      (r16 I:com.facebook.ads.redexgen.X.06)
     type: INTERFACE call: com.facebook.ads.redexgen.X.0L.AEs(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void, block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0141: INVOKE  
      (r10v0 ?? I:com.facebook.ads.redexgen.X.0L)
      (r11 I:java.lang.String)
      (r12 I:int)
      (r13 I:java.lang.String)
      (r14 I:java.lang.Long)
      (r15 I:java.lang.Long)
      (r16 I:com.facebook.ads.redexgen.X.06)
     type: INTERFACE call: com.facebook.ads.redexgen.X.0L.AEs(java.lang.String, int, java.lang.String, java.lang.Long, java.lang.Long, com.facebook.ads.redexgen.X.06):void, block:B:49:0x0135 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0124: MOVE  (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x011a */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x013f: MOVE  (r16 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0135 */
    private File A02(C1087006 c1087006, String str, String str2, int i, C1087309 c1087309) {
        C1087006 c10870062;
        String AEs;
        C1087006 c10870063;
        String AEs2;
        String A03 = A03(222, 22, 17);
        try {
            String str3 = str;
            long currentTimeMillis = System.currentTimeMillis();
            File file = new File(A01(this.A05), str2);
            C13216cw c13216cw = new C13216cw(file, new C11895HM(C11979Im.A0P(this.A05)));
            if (c13216cw.A09()) {
                if (this.A08) {
                    String str4 = A03(49, 22, 36) + c13216cw.A00.getName();
                }
                this.A06.put(str3, file);
                c13216cw.A06();
                this.A04.AEt(str3, true, c1087006);
                return file;
            }
            if (this.A08) {
                String str5 = A03(71, 26, 76) + c13216cw.A00.getName();
            }
            if (c1087309.A04()) {
                this.A04.AEt(str3, false, c1087006);
                for (int i2 = 0; i2 < this.A00; i2++) {
                    try {
                        C113257j c113257j = this.A05;
                        if (A0A[3].charAt(31) != '9') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0A;
                        strArr[2] = "QJ6lhIf3SMnJsUHWjUzyv1yZJIRdgp";
                        strArr[5] = "f1TQksdEGnGezGtACwRIsNgGsb1lS2";
                        str3 = str3;
                        try {
                            A05(c113257j, c13216cw, str3, i, i2, currentTimeMillis);
                            break;
                        } catch (C108810H e) {
                            e = e;
                            if (i2 == this.A00 - 1) {
                                A06(c13216cw);
                                if (e instanceof C13217cx) {
                                    throw ((C13217cx) e);
                                }
                                if (e instanceof C13214cu) {
                                    throw ((C13214cu) e);
                                }
                            }
                        }
                    } catch (C108810H e2) {
                        e = e2;
                    }
                }
                int A032 = c13216cw.A03();
                c13216cw.A06();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                c1087309.A00().A4q(file, this.A04);
                this.A06.put(str3, file);
                this.A04.AEs(str3, IronSourceConstants.IS_CALLBACK_AD_DISPLAYED, null, Long.valueOf(A032), Long.valueOf(currentTimeMillis2), c1087006);
                return file;
            }
            return null;
        } catch (C13214cu e3) {
            this.A04.AEs(AEs2, IronSourceConstants.IS_CALLBACK_AD_CLOSED, e3.toString(), null, null, c10870063);
            if (this.A08) {
                Log.e(A0B, A03, e3);
                return null;
            }
            return null;
        } catch (C13217cx e4) {
            this.A04.AEs(AEs, 2119, e4.toString(), null, null, c10870062);
            if (this.A08) {
                Log.e(A0B, A03, e4);
                return null;
            }
            return null;
        }
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-95, -23, -30, -12, -95, -29, -26, -26, -17, -95, -22, -17, -11, -26, -13, -13, -10, -15, -11, -26, -27, -81, UnsignedBytes.MAX_POWER_OF_TWO, 116, -70, -67, -64, -71, 116, -73, -64, -71, -75, -62, -71, -72, -114, 116, -52, -66, -33, 18, 18, 3, 11, 14, 18, -40, -66, -103, -73, -71, -66, -65, -60, -67, 118, -68, -65, -62, -69, 118, -71, -59, -61, -58, -62, -69, -54, -69, 118, -63, -33, -31, -26, -25, -20, -27, -98, -28, -25, -22, -29, -98, -20, -19, -14, -98, -31, -19, -21, -18, -22, -29, -14, -29, -98, -87, -57, -55, -50, -49, -44, -51, -122, -43, -52, -122, -121, -91, -78, 107, -72, 100, -89, -80, -77, -73, -87, 100, -89, -91, -89, -84, -87, 100, -86, -83, -80, -87, 114, -61, -31, -18, -89, -12, -96, -14, -27, -31, -28, -96, -31, -13, -13, -27, -12, -13, -82, -63, -33, -20, -91, -14, -98, -16, -29, -33, -30, -98, -22, -29, -20, -27, -14, -26, -98, -19, -28, -98, -124, -91, -84, -91, -76, -87, -82, -89, 96, -93, -95, -93, -88, -91, 96, -90, -87, -84, -91, 96, -95, -90, -76, -91, -78, 96, -91, -72, -93, -91, -91, -92, -87, -82, -89, 96, -78, -91, -76, -78, -71, 96, -95, -76, -76, -91, -83, -80, -76, -77, 122, 96, -120, -75, -75, -78, -75, 99, -90, -92, -90, -85, -84, -79, -86, 99, -73, -85, -88, 99, -87, -84, -81, -88, -89, -44, -44, -47, -44, -126, -59, -50, -57, -61, -48, -53, -48, -55, -126, -56, -53, -50, -57, -23, 22, 22, 19, 22, -60, 7, 16, 19, 23, 13, 18, 11, -60, 23, 19, 25, 22, 7, 9, -39, -2, -13, -1, -3, 0, -4, -11, 4, -11, -80, 2, -11, 3, 0, -1, -2, 3, -11, -66, 2, 32, 39, 23, 28, 21, -50, 34, 29, -50, 32, 19, 15, 18, -50, -31, -28, -18, -9, -83, -26, -23, -20, -27, -83, -29, -31, -29, -24, -27, -50, -32, -32, -46, -31, -89, -100, -100, -100, -77, -74, -71, -78, -121, 124, 124, 124, -82, -69, -79, -65, -68, -74, -79, -84, -82, -64, -64, -78, -63, 124};
    }

    static {
        A04();
        A0B = C13220d0.class.getSimpleName();
    }

    public C13220d0(C113257j c113257j, C1087208 c1087208, InterfaceC108850L interfaceC108850L) {
        this.A05 = c113257j;
        this.A08 = c1087208.A02();
        this.A00 = c1087208.A00();
        this.A04 = interfaceC108850L;
        this.A01 = c1087208.A01();
        this.A02 = c1087208;
    }

    public static C13218cy A00(Context context, String str) throws C108810H {
        try {
            InputStream open = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr, 0, bArr.length);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return new C13218cy(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (IOException e) {
            throw new C108810H(A03(131, 18, 78), e);
        }
    }

    public static File A01(Context context) {
        return new File(context.getCacheDir(), A03(318, 15, 78));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144 A[Catch: 0H -> 0x015f, all -> 0x01c6, TRY_LEAVE, TryCatch #14 {0H -> 0x015f, all -> 0x01c6, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:111:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148 A[Catch: 0H -> 0x009a, all -> 0x01fa, TRY_ENTER, TryCatch #15 {0H -> 0x009a, all -> 0x01fa, blocks: (B:9:0x0051, B:17:0x008b, B:54:0x0151, B:59:0x0162, B:51:0x0148, B:53:0x014e, B:45:0x0130, B:46:0x0137), top: B:109:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157 A[Catch: 0H -> 0x015f, all -> 0x01c6, TRY_ENTER, TRY_LEAVE, TryCatch #14 {0H -> 0x015f, all -> 0x01c6, blocks: (B:12:0x007c, B:40:0x00f8, B:42:0x0100, B:50:0x0144, B:56:0x0157, B:48:0x013e), top: B:111:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(android.content.Context r24, com.facebook.ads.redexgen.p370X.C13216cw r25, java.lang.String r26, int r27, int r28, long r29) throws com.facebook.ads.redexgen.p370X.C108810H {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C13220d0.A05(android.content.Context, com.facebook.ads.redexgen.X.cw, java.lang.String, int, int, long):void");
    }

    private void A06(C13216cw c13216cw) {
        try {
            File A04 = c13216cw.A04();
            if (A04.exists()) {
                c13216cw.A06();
                boolean delete = A04.delete();
                if (this.A08) {
                    Log.i(A0B, A03(170, 52, 14) + delete);
                }
            }
        } catch (Exception e) {
            if (A0A[0].length() != 14) {
                throw new RuntimeException();
            }
            A0A[3] = "fJTJjiotuyJvZrF72L8221tI8VUznJb9";
            if (this.A08) {
                Log.e(A0B, A03(108, 23, 18), e);
            }
        }
    }

    private boolean A07(C13216cw c13216cw) {
        try {
            c13216cw.A05();
            if (A0A[4].charAt(27) != 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "zmS4hUlvHkaHxqc9Vg18exvolw";
            strArr[6] = "qC";
            return true;
        } catch (C13214cu e) {
            if (this.A08) {
                Log.e(A0B, A03(244, 19, 48), e);
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<T> */
    public final <T> C1086602<T> A08(C1087006 c1087006, C1087309<T> c1087309) {
        Semaphore semaphore;
        if (c1087309.A03()) {
            File file = this.A06.get(c1087006.A09);
            if (file != null) {
                this.A04.AEt(c1087006.A09, true, c1087006);
                return c1087309.A00().A3i(file, this.A04);
            }
            this.A04.AEt(c1087006.A09, false, c1087006);
            return new C1086602<>(false, null);
        }
        String str = c1087006.A09;
        String str2 = c1087006.A04;
        StringBuilder sb2 = new StringBuilder();
        String baseUrl = this.A03.A03(str);
        String extension = sb2.append(baseUrl).append(str2).toString();
        synchronized (this.A07) {
            semaphore = this.A07.get(extension);
            if (semaphore == null) {
                semaphore = new Semaphore(1);
                this.A07.put(extension, semaphore);
            }
            try {
            } catch (Throwable th) {
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                    throw th;
                }
            }
        }
        try {
            semaphore.acquire();
            File A02 = A02(c1087006, str, extension, this.A01, c1087309);
            if (A02 != null) {
                C1086602<T> A3i = c1087309.A00().A3i(A02, this.A04);
                semaphore.release();
                synchronized (this.A07) {
                    this.A07.remove(extension);
                }
                return A3i;
            }
            C1086602<T> c1086602 = new C1086602<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
            }
            return c1086602;
        } catch (InterruptedException unused) {
            if (this.A08) {
                StringBuilder sb3 = new StringBuilder();
                String baseUrl2 = A03(97, 11, 52);
                StringBuilder append = sb3.append(baseUrl2).append(str);
                String baseUrl3 = A03(0, 22, 79);
                append.append(baseUrl3).toString();
            }
            C1086602<T> c10866022 = new C1086602<>(false, null);
            semaphore.release();
            synchronized (this.A07) {
                this.A07.remove(extension);
                return c10866022;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1086400
    public final C1086602<Bitmap> AFl(C1087006 c1087006, boolean z) {
        return A08(c1087006, new C1087309(new C13223d3(c1087006.A01, c1087006.A00, this.A02.A04(), this.A02.A03(), z)));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.io.File> */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1086400
    public final File AFm(C1087006 c1087006) {
        C1087309 c1087309 = new C1087309(new C13222d2());
        c1087309.A01(true);
        c1087309.A02(false);
        return (File) A08(c1087006, c1087309).A00();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1086400
    public final String AFn(C1087006 c1087006) {
        return (String) A08(c1087006, new C1087309(new C13221d1())).A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.09 != com.facebook.ads.cache.config.CacheRequestConfig<java.lang.String> */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1086400
    public final String AFo(C1087006 c1087006) {
        C1087309 c1087309 = new C1087309(new C13221d1());
        c1087309.A01(true);
        c1087309.A02(false);
        return (String) A08(c1087006, c1087309).A00();
    }
}
