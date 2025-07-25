package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.google.common.primitives.SignedBytes;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cv */
/* loaded from: assets/audience_network.dex */
public final class C13215cv implements InterfaceC108840K {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{43, 98, 120, 43, 98, 101, Byte.MAX_VALUE, 110, 121, 121, 126, 123, Byte.MAX_VALUE, 110, 111, 33, 117, 110, 33, 102, 49, 47, 50, 46, 102, 41, 32, 32, 53, 35, 50, 102, 108, 96, 35, 47, 46, 52, 37, 46, 52, 109, 44, 37, 46, 39, 52, 40, 122, 96, 5, 20, 14, 77, 65, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 75, 77, 90, 71, 65, SignedBytes.MAX_POWER_OF_TWO, 14, 71, 93, 14, 79, 76, 93, 75, SignedBytes.MAX_POWER_OF_TWO, 90, 15, 20, 56, 57, 35, 50, 57, 35, 119, 62, 57, 49, 56, 119, 49, 56, 37, 119, 55, 24, 47, 47, 50, 47, 125, 57, 52, 46, 62, 50, 51, 51, 56, 62, 41, 52, 51, 58, 125, 21, 41, 41, 45, 8, 47, 49, 30, 50, 51, 51, 56, 62, 41, 52, 50, 51, 21, 34, 34, 63, 34, 112, 54, 53, 36, 51, 56, 57, 62, 55, 112, 57, 62, 54, 63, 112, 54, 34, 63, 61, 112, 27, 44, 44, 49, 44, 126, 49, 46, 59, 48, 55, 48, 57, 126, 61, 49, 48, 48, 59, 61, 42, 55, 49, 48, 126, 56, 49, 44, 126, 35, 20, 20, 9, 20, 70, 20, 3, 7, 2, 15, 8, 1, 70, 2, 7, 18, 7, 70, 0, 20, 9, 11, 70, 92, 96, 96, 100, 65, 102, 120, 71, 123, 97, 102, 119, 113, 111, 97, 102, 120, 41, 51, 101, 70, 74, 72, 93, SignedBytes.MAX_POWER_OF_TWO, 70, 71, 0, 63, 42, 33, 111, 44, 32, 33, 33, 42, 44, 59, 38, 32, 33, 111, 85, 102, 105, 96, 98, 109, 90, 94, 91, 31, 92, 80, 81, 75, 90, 81, 75, 31, 86, 81, 89, 80, 31, 89, 77, 80, 82, 31, 106, 93, 89, 92, 81, 86, 95, 24, 75, 87, 77, 74, 91, 93, 24, 33, 26, 26, 85, 24, 20, 27, 12, 85, 7, 16, 17, 28, 7, 16, 22, 1, 6, 79, 85, 92, 6, 28, 81, 85, 81, 89, 6, 28, 30, 5, 8, 25, 15, 65, 99};
    }

    static {
        A04();
        A07 = C13215cv.class.getSimpleName();
    }

    public C13215cv(String str) {
        this(str, C108820I.A01(str));
    }

    public C13215cv(String str, int i) {
        this(str);
        this.A00 = i;
    }

    public C13215cv(String str, String str2) {
        this.A05 = Integer.MIN_VALUE;
        this.A00 = -1;
        this.A03 = (String) AbstractC108830J.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i, int i2) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
        if (r6 != 302) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
        if (r6 != 303) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
        if (r6 != 302) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection A02(int r9, int r10) throws java.io.IOException, com.facebook.ads.redexgen.p370X.C13217cx {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C13215cv.A02(int, int):java.net.HttpURLConnection");
    }

    private void A03() throws C13217cx {
        String str = A01(255, 23, 59) + this.A03;
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnection = A02(0, 10000);
                this.A05 = httpURLConnection.getContentLength();
                this.A06 = httpURLConnection.getContentType();
                inputStream = httpURLConnection.getInputStream();
                Log.i(A07, A01(74, 18, 83) + this.A03 + A01(313, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
                C108820I.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            } catch (IOException e) {
                Log.e(A07, A01(129, 25, 84) + this.A03, e);
                C108820I.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            }
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            C108820I.A05(inputStream);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private final void A05(int i, int i2) throws C13217cx {
        try {
            this.A02 = A02(i, i2);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i, this.A02.getResponseCode());
        } catch (IOException e) {
            throw new C13217cx(A01(154, 29, 90) + this.A03 + A01(19, 13, 66) + i, e);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108840K
    public final void AEF(int i) throws C13217cx {
        A05(i, this.A00);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108840K
    public final void close() throws C13217cx {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (NullPointerException e) {
                throw new C13217cx(A01(92, 37, 89), e);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108840K
    public final synchronized int length() throws C13217cx {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108840K
    public final int read(byte[] bArr) throws C13217cx {
        InputStream inputStream = this.A01;
        String A01 = A01(183, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e) {
                throw new C11892HJ(A01(278, 15, 60) + this.A03 + A01(0, 15, 15), e);
            } catch (IOException e2) {
                throw new C13217cx(A01 + this.A03, e2);
            }
        }
        throw new C13217cx(A01 + this.A03 + A01(51, 23, 42));
    }

    public final String toString() {
        return A01(207, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
