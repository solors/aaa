package com.facebook.ads.redexgen.p370X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.facebook.ads.redexgen.X.KS */
/* loaded from: assets/audience_network.dex */
public final class C12080KS implements InterfaceC12536Rq {
    public static byte[] A07;
    public static String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final String A09;
    public InterfaceC113558D A00;
    public Executor A01;
    public boolean A02;
    public C12541Rv A03;
    public final InterfaceC12546S0 A04 = new C12115L3();
    public final InterfaceC12551S5 A05;
    public final InterfaceC12552S6 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final InterfaceC12535Rp A01(AbstractC12548S2 abstractC12548S2) throws C12549S3 {
        String A072 = A07(220, 7, 86);
        HttpURLConnection httpURLConnection = null;
        InterfaceC12535Rp interfaceC12535Rp = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(abstractC12548S2.A05(), C12119L7.A04() ? A09() : null);
                A0H(A082, abstractC12548S2);
                A0G(A082, abstractC12548S2);
                if (this.A06.A9X()) {
                    this.A06.AAO(A082, abstractC12548S2.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z2 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z2 || z)) {
                    try {
                        AbstractC12553S7.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e) {
                        this.A00.AAS(A072, AbstractC113568E.A1z, new C113578F(e));
                    } catch (Exception e2) {
                        this.A00.AAS(A072, AbstractC113568E.A1y, new C113578F(e2));
                    }
                }
                if (A082.getDoOutput() && abstractC12548S2.A06() != null) {
                    A00(A082, abstractC12548S2.A06());
                }
                C12081KT A06 = A082.getDoInput() ? A06(A082) : new C12081KT(A082, null);
                if (this.A06.A9X()) {
                    this.A06.AAP(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Exception e3) {
                try {
                    C12081KT A05 = A05(null);
                    if (A08[7].length() != 19) {
                        A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
                        if (A05 == null || A05.A8R() <= 0) {
                            throw new C12549S3(e3, A05);
                        }
                        if (this.A06.A9X()) {
                            this.A06.AAP(A05);
                        }
                        if (0 != 0) {
                            httpURLConnection.disconnect();
                        }
                        return A05;
                    }
                    throw new RuntimeException();
                } catch (Exception unused) {
                    Log.e(getClass().getSimpleName(), A07(117, 13, 98), e3);
                    if (0 == 0 || interfaceC12535Rp.A8R() <= 0) {
                        throw new C12549S3(e3, null);
                    }
                    if (this.A06.A9X()) {
                        this.A06.AAP(null);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
            }
        } catch (Throwable th) {
            if (this.A06.A9X()) {
                this.A06.AAP(null);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, 14, 102, 100, 77, SignedBytes.MAX_POWER_OF_TWO, 9, 77, 79, 30, 93, 75, 76, 82, 30, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, 31, 22, 80, 75, 120, 116, 23, 0, 116, 105, 116, 55, 59, 73, 79, 59, 38, 59, 38, 42, 126, 120, 115, 99, 100, 109, 42, 94, 4, 34, 43, 38, 55, 52, 34, 35, 71, 51, 46, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, 61, 22, 7, 4, 28, 1, 24, 83, 22, 1, 1, 28, 1, 23, 22, 4, 111, 122, 22, 7, 7, 27, 30, 20, 22, 3, 30, 24, 25, 88, 15, 90, 0, 0, 0, 90, 17, 24, 5, 26, 90, 2, 5, 27, 18, 25, 20, 24, 19, 18, 19, 76, 20, 31, 22, 5, 4, 18, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, 26, 23, 81, 26, 23, 83, 120, 100, 100, 96, 62, 96, 98, Byte.MAX_VALUE, 104, 105, 88, Byte.MAX_VALUE, 99, 100, 27, 7, 7, 3, 93, 3, 1, 28, 11, 10, 35, 28, 1, 7, 41, 34, 51, 48, 40, 53, 44};
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0121, code lost:
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0127, code lost:
        if (r9.A6W() != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0129, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0149, code lost:
        r3 = r9.A6W().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0157, code lost:
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x015a, code lost:
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0163, code lost:
        if (r30.A04 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0165, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0167, code lost:
        r7.AAJ(r0, r10, 0, r2, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0182, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0183, code lost:
        r2 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.p370X.InterfaceC12535Rp A0J(com.facebook.ads.redexgen.p370X.AbstractC12548S2 r30) throws com.facebook.ads.redexgen.p370X.C12549S3 {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12080KS.A0J(com.facebook.ads.redexgen.X.S2):com.facebook.ads.redexgen.X.Rp");
    }

    static {
        A0A();
        A09 = InterfaceC12536Rq.class.getSimpleName();
    }

    public C12080KS(C12541Rv c12541Rv, InterfaceC113558D interfaceC113558D, Executor executor) {
        A0B();
        this.A03 = c12541Rv;
        this.A06 = new C12079KR(c12541Rv.A04());
        this.A05 = new AbstractC12101Kn(this.A06) { // from class: com.facebook.ads.redexgen.X.7A
            {
                C12080KS.this = this;
            }
        };
        this.A01 = executor;
        this.A00 = interfaceC113558D;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.AEJ(httpURLConnection);
            if (outputStream != null) {
                this.A05.AHj(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC12535Rp A02(AbstractC12548S2 abstractC12548S2) {
        if (this.A03.A04()) {
            A0C(abstractC12548S2);
        }
        InterfaceC12535Rp interfaceC12535Rp = null;
        try {
            interfaceC12535Rp = A01(abstractC12548S2);
            return interfaceC12535Rp;
        } catch (C12549S3 hre) {
            this.A05.ABv(hre);
            return interfaceC12535Rp;
        } catch (Exception e) {
            this.A05.ABv(new C12549S3(e, interfaceC12535Rp));
            return interfaceC12535Rp;
        }
    }

    private final InterfaceC12535Rp A03(String str, C12550S4 c12550s4, C12544Ry c12544Ry) {
        return A02(new C12096Ki(str, c12550s4, c12544Ry));
    }

    private final InterfaceC12535Rp A04(String str, String str2, byte[] bArr, C12544Ry c12544Ry) {
        return A02(new C12082KU(str, null, str2, bArr, c12544Ry));
    }

    private final C12081KT A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AEr(inputStream);
            }
            C12081KT c12081kt = new C12081KT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c12081kt;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final C12081KT A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.AEI(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AEr(inputStream);
            }
            C12081KT c12081kt = new C12081KT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return c12081kt;
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.AEH(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 27), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 1));
        String proxyAddress = System.getProperty(A07(206, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        if (!TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (C12080KS.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC12548S2 abstractC12548S2) {
        StringBuilder sb2 = new StringBuilder(A07(182, 10, 43));
        boolean equals = abstractC12548S2.A03().equals(EnumC12547S1.A06);
        String A072 = A07(41, 1, 120);
        if (equals) {
            byte[] A06 = abstractC12548S2.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (A06 != null) {
                sb2.append(A07(7, 5, 124));
                sb2.append(new String(abstractC12548S2.A06(), Charset.forName(A07(130, 5, 83))));
                sb2.append(A072);
            }
        }
        for (Map.Entry<String, String> entry : abstractC12548S2.A02().A06().entrySet()) {
            sb2.append(A07(2, 5, 87));
            sb2.append(entry.getKey());
            sb2.append(A07(66, 1, 47));
            sb2.append(entry.getValue());
            sb2.append(A072);
        }
        sb2.append(A07(0, 2, 10));
        sb2.append(abstractC12548S2.A05());
        sb2.append(A072);
        String sb3 = sb2.toString();
        A0E(sb3, 1, (sb3.length() / 4000) + 1);
    }

    private void A0D(AbstractC12548S2 abstractC12548S2, InterfaceC12537Rr interfaceC12537Rr) {
        this.A04.A6R(this, interfaceC12537Rr, this.A01).A04(abstractC12548S2);
        if (this.A03.A04()) {
            A0C(abstractC12548S2);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 47) + i + A07(65, 1, 96) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC12537Rr interfaceC12537Rr, C12544Ry c12544Ry) {
        C12082KU req = new C12082KU(str, null, str2, bArr, c12544Ry);
        A0D(req, interfaceC12537Rr);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC12548S2 abstractC12548S2) {
        Map<String, String> A06 = abstractC12548S2.A02().A06();
        InterfaceC12534Ro A05 = abstractC12548S2.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A6A = A05.A6A(this.A03.A03());
            for (String str2 : A6A.keySet()) {
                httpURLConnection.setRequestProperty(str2, A6A.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC12548S2 abstractC12548S2) throws IOException {
        C12544Ry A02 = abstractC12548S2.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.AEZ(httpURLConnection, abstractC12548S2.A03(), abstractC12548S2.A04());
    }

    private final boolean A0I(Throwable th, long j, AbstractC12548S2 abstractC12548S2) {
        C12544Ry A02 = abstractC12548S2.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j) + 10;
        if (this.A06.A9X()) {
            String str = A07(67, 15, 118) + currentTimeMillis + A07(42, 7, 69) + A02.A00() + A07(49, 7, 10) + A02.A02();
        }
        if (this.A02) {
            int i = (currentTimeMillis > A02.A02() ? 1 : (currentTimeMillis == A02.A02() ? 0 : -1));
            if (A08[4].charAt(1) != 'Y') {
                A08[7] = "tgQXMymp9cIZW";
                return i >= 0;
            }
            throw new RuntimeException();
        }
        long elapsedTime = A02.A00();
        return currentTimeMillis >= elapsedTime;
    }

    public final C12541Rv A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12536Rq
    @Deprecated
    public final InterfaceC12535Rp AER(String str, Map<String, String> parameters) {
        return A03(str, new C12550S4(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12536Rq
    @Deprecated
    public final InterfaceC12535Rp AES(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12536Rq
    public final void AET(String str, byte[] bArr, InterfaceC12537Rr interfaceC12537Rr) {
        A0F(str, A07(135, 47, 102), bArr, interfaceC12537Rr, this.A03.A00());
    }
}
