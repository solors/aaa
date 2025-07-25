package com.facebook.ads.redexgen.p370X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.util.common.Preconditions;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ZI */
/* loaded from: assets/audience_network.dex */
public final class C12993ZI implements InterfaceC1140491 {
    public static byte[] A03;
    public static String[] A04 = {"Mm6eOmxrkeU2", "MUq44yb", "oKRPVLX0GnKoqIxxSACkHhthyeGglJDi", "kpHGdbOqKKCIQYGNabgqln8bHLF6fw56", "0pAnM9hA2pxuChyanVmC1wYC", "qxO1zNdoKC3MMUxTs0mhMJ4wGZPx", "", "oKuuJ477mGyxhVSdv1rWN1Mids3hq7ZK"};
    public static final String A05;
    public final C13028Zr A00;
    public final InterfaceC114159C<C11997J4> A01;
    public final InterfaceC114159C<C11997J4> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A04[4] = "X42DzCMkQ4HFIzVdD0OsfCNEPJzG";
            copyOfRange[i4] = (byte) (i5 - 23);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        if (A04[4].length() == 9) {
            throw new RuntimeException();
        }
        A04[4] = "UWvzDGqGj7QUhJ5x6ip4Rlib";
        A03 = new byte[]{101, 99, -78, -87, 99, -73, -68, -77, -88, 125, 99, 115, -106, 119, -88, -105, -96, -90, -123, -90, -95, -92, -109, -103, -105, -124, -105, -107, -95, -92, -106, 118, -109, -90, -109, -108, -109, -91, -105, -110, -77, -70, -77, -62, -77, -78, 110, -77, -60, -77, -68, -62, -120, 110, 112, -90, -63, -55, -52, -59, -60, UnsignedBytes.MAX_POWER_OF_TWO, -44, -49, UnsignedBytes.MAX_POWER_OF_TWO, -61, -52, -59, -63, -46, UnsignedBytes.MAX_POWER_OF_TWO, -59, -42, -59, -50, -44, -45, UnsignedBytes.MAX_POWER_OF_TWO, -45, -44, -49, -46, -63, -57, -59, 107, -122, -114, -111, -118, -119, 69, -103, -108, 69, -119, -118, -104, -118, -105, -114, -122, -111, -114, -97, -118, 69, -122, -109, 69, -118, -101, -118, -109, -103, 69, -117, -105, -108, -110, 69, -119, -122, -103, -122, -121, -122, -104, -118, 69, -74, -47, -39, -36, -43, -44, -112, -28, -33, -112, -35, -33, -26, -43, -112, -43, -26, -43, -34, -28, -29, -112, -42, -30, -33, -35, -112, -39, -34, -99, -42, -36, -39, -41, -40, -28, -112, -29, -28, -33, -30, -47, -41, -43, -112, -46, -47, -45, -37, -112, -28, -33, -112, -43, -26, -43, -34, -28, -29, -112, -44, -47, -28, -47, -46, -47, -29, -43, -40, -13, -5, -2, -9, -10, -78, 6, 1, -78, 2, -13, 4, 5, -9, -78, -13, 0, -78, -9, 8, -9, 0, 6, -78, -8, 4, 1, -1, -78, -5, 0, -65, -8, -2, -5, -7, -6, 6, -78, 5, 6, 1, 4, -13, -7, -9, 112, -117, -109, -106, -113, -114, 74, -98, -103, 74, -100, -113, -117, -114, 74, -98, -110, -113, 74, -104, -97, -105, -116, -113, -100, 74, -103, -112, 74, -113, -96, -113, -104, -98, -99, 74, -112, -100, -103, -105, 74, -114, -117, -98, -117, -116, -117, -99, -113, -121, -94, -86, -83, -90, -91, 97, -75, -80, 97, -76, -90, -77, -86, -94, -83, -86, -69, -90, 97, -94, -91, 97, -90, -73, -90, -81, -75, -64, -27, -35, -29, -32, -34, -33, -21, -92, -72, -37, -68, -19, -36, -27, -21, -54, -21, -26, -23, -40, -34, -36, -55, -36, -38, -26, -23, -37, -69, -40, -21, -40, -39, -40, -22, -36, -37, -18, -20, -8, -5, -19, -87, -19, -22, -3, -22, -21, -22, -4, -18, -87, -17, -22, -14, -11, -2, -5, -18, -87, -8, -20, -20, -2, -5, -5, -18, -19, -87, 0, -15, -18, -9, -87, -5, -18, -22, -19, -14, -9, -16, -87, -18, -1, -18, -9, -3, -4, -73, -16, 3, 3, -12, -4, -1, 3, -78, -81, -62, -81, -14, -19, -116, Byte.MAX_VALUE, 125, -119, -116, 126, 121, 126, 123, -114, 123, 124, 123, -115, Byte.MAX_VALUE, -98, -112, -98, -98, -108, -102, -103, -118, -108, -113, 7, -7, 7, 7, -3, 3, 2, -13, 8, -3, 1, -7, -68, -79, -75, -83, -22, -27, -31, -37, -28, -93, -88, -97, -108, -3, -10, -13, -10, -9, -1, -10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2 A[Catch: 9L -> 0x0138, TryCatch #5 {9L -> 0x0138, blocks: (B:33:0x00e6, B:35:0x00f2, B:36:0x0101, B:22:0x0089, B:24:0x008f, B:26:0x009b, B:27:0x00dc, B:39:0x010a, B:40:0x010e, B:42:0x0114, B:43:0x0124, B:44:0x0128, B:46:0x012e), top: B:61:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0B(int r13, java.util.Set<java.lang.String> r14, java.util.Set<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12993ZI.A0B(int, java.util.Set, java.util.Set):int");
    }

    static {
        A03();
        A05 = C12993ZI.class.getSimpleName();
    }

    public C12993ZI(C13028Zr c13028Zr) throws IOException {
        this.A00 = c13028Zr;
        this.A01 = new C12990ZF(C1141299.A00(A00(11, 28, 27), c13028Zr), new C12995ZK(this));
        this.A02 = new C12990ZF(C1141299.A00(A00(322, 37, 96), c13028Zr), new C12994ZJ(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            if (i2 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i, i2));
            } catch (JSONException jsone) {
                if (this.A00.A04().A9O()) {
                    Log.e(A05, A00(85, 45, 14), jsone);
                }
                int start = AbstractC113568E.A2P;
                A05(start, jsone);
            }
            i += i2;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i, int i2) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i, i + i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        C113578F c113578f = new C113578F(str);
        c113578f.A05(1);
        this.A00.A07().AA1(A00(425, 15, 3), i, c113578f);
    }

    private void A05(int i, Throwable th) {
        this.A00.A07().AA0(A00(425, 15, 3), i, new C113578F(th));
    }

    public static byte[] A07(C113257j c113257j, String str, C11997J4 c11997j4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(423, 2, 114), str);
            jSONObject.put(A00(466, 5, 95), c11997j4.A08());
            jSONObject.put(A00(471, 4, 24), c11997j4.A06().toString());
            jSONObject.put(A00(462, 4, 49), C12168Lu.A02(c11997j4.A04()));
            jSONObject.put(A00(450, 12, 125), C12168Lu.A02(c11997j4.A03()));
            jSONObject.put(A00(440, 10, 20), c11997j4.A07());
            jSONObject.put(A00(419, 4, 55), new JSONObject(c11997j4.A09()));
            jSONObject.put(A00(412, 7, 120), 0);
        } catch (JSONException e) {
            if (c113257j.A04().A9O()) {
                Log.e(A05, A00(294, 28, 42), e);
            }
        }
        String jSONObject2 = jSONObject.toString();
        if (A04[3].charAt(18) != '3') {
            A04[3] = "qXIRiOsc7TnqBEY389oLdIOolYF6NOqr";
            return jSONObject2.getBytes();
        }
        throw new RuntimeException();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A8B();
        } catch (C114249L e) {
            if (this.A00.A04().A9O()) {
                Log.e(A05, A00(245, 49, 19), e);
                return 0;
            }
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0053 */
    /* JADX WARN: Incorrect condition in loop: B:21:0x006d */
    /* JADX WARN: Incorrect condition in loop: B:8:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<org.json.JSONObject> A0C(int r8) {
        /*
            r7 = this;
            r6 = 0
            r0 = -1
            if (r8 != r0) goto L7
            r6 = 1
            r8 = 30
        L7:
            int[] r1 = new int[r8]
            int r0 = r8 * 1000
            byte[] r4 = new byte[r0]
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.facebook.ads.redexgen.X.9C<com.facebook.ads.redexgen.X.J4> r0 = r7.A01     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            com.facebook.ads.redexgen.X.9B r0 = r0.A61(r4, r1)     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            r3.add(r0)     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            int r2 = r0.A62()     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
        L28:
            boolean r0 = r0.AAk()     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            if (r0 == 0) goto L4b
            if (r2 < r8) goto L32
            if (r6 == 0) goto L4b
        L32:
            if (r6 == 0) goto L39
            r0 = 0
            java.util.Arrays.fill(r1, r0)     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            goto L3d
        L39:
            int r0 = r8 - r2
            int[] r1 = new int[r0]     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
        L3d:
            com.facebook.ads.redexgen.X.9C<com.facebook.ads.redexgen.X.J4> r0 = r7.A01     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            com.facebook.ads.redexgen.X.9B r0 = r0.A61(r4, r1)     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            r3.add(r0)     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            java.util.List r5 = r7.A01(r5, r4, r1)     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            goto L28
        L4b:
            java.util.Iterator r2 = r5.iterator()     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
        L4f:
            boolean r0 = r2.hasNext()     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            if (r0 == 0) goto L65
            java.lang.Object r0 = r2.next()     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            com.facebook.ads.redexgen.X.9C<com.facebook.ads.redexgen.X.J4> r1 = r7.A02     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            byte[] r0 = A09(r0)     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            r1.AH3(r0)     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            goto L4f
        L65:
            java.util.Iterator r1 = r3.iterator()     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
        L69:
            boolean r0 = r1.hasNext()     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r1.next()     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            com.facebook.ads.redexgen.X.9B r0 = (com.facebook.ads.redexgen.p370X.InterfaceC114149B) r0     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            r0.A5O()     // Catch: com.facebook.ads.redexgen.p370X.C114249L -> L79
            goto L69
        L79:
            r4 = move-exception
            com.facebook.ads.redexgen.X.Zr r0 = r7.A00
            com.facebook.ads.redexgen.X.7o r0 = r0.A04()
            boolean r0 = r0.A9O()
            if (r0 == 0) goto L95
            java.lang.String r3 = com.facebook.ads.redexgen.p370X.C12993ZI.A05
            r2 = 359(0x167, float:5.03E-43)
            r1 = 53
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            android.util.Log.e(r3, r0, r4)
        L95:
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC113568E.A2M
            r7.A05(r0, r4)
        L9a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12993ZI.A0C(int):java.util.List");
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1140491
    public final void A4f() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C114249L e) {
            if (this.A00.A04().A9O()) {
                Log.e(A05, A00(55, 30, 73), e);
            }
            A05(AbstractC113568E.A2J, e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1140491
    public final void AHh(final C11997J4 c11997j4, final AbstractC114018y<String> abstractC114018y) {
        Executor executor = ExecutorC12182M8.A07;
        final InterfaceC114159C<C11997J4> interfaceC114159C = this.A01;
        final C13028Zr c13028Zr = this.A00;
        AbstractC12179M5.A00(executor, new AsyncTask<Void, Void, String>(c11997j4, abstractC114018y, interfaceC114159C, c13028Zr) { // from class: com.facebook.ads.redexgen.X.92
            public static byte[] A05;
            public C114249L A00;
            public final C113257j A01;
            public final AbstractC114018y<String> A02;
            public final InterfaceC114159C<C11997J4> A03;
            public final C11997J4 A04;

            static {
                A02();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{20, 89, 110, 110, 115, 110, 60, 113, 121, 111, 111, 125, 123, 121, 60, Byte.MAX_VALUE, 125, 114, 114, 115, 104, 60, 126, 121, 60, 114, 105, 112, 112, 99, SignedBytes.MAX_POWER_OF_TWO, 72, 72, 70, 65, 72, 15, 74, 89, 74, 65, 91, 21, 15, 102, 113, 119, 123, 102, 112, 75, 112, 117, 96, 117, 118, 117, 103, 113};
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8y != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.9C != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = c11997j4;
                this.A03 = interfaceC114159C;
                this.A02 = abstractC114018y;
                this.A01 = c13028Zr;
            }

            private final String A01(Void... voidArr) {
                byte[] A07;
                if (AbstractC12078KQ.A02(this)) {
                    return null;
                }
                String str = null;
                try {
                    try {
                        str = UUID.randomUUID().toString();
                        this.A01.A07().A9A(this.A04.A06().toString());
                    } catch (C114249L e) {
                        this.A00 = e;
                        this.A01.A07().AA0(A00(44, 15, 24), AbstractC113568E.A2N, new C113578F(e));
                    }
                    if (TextUtils.isEmpty(this.A04.A08())) {
                        return null;
                    }
                    if (this.A01.A04().A9O()) {
                        String str2 = A00(29, 15, 35) + this.A04.A06().toString() + A00(0, 1, 56) + this.A04.A09().toString();
                    }
                    InterfaceC114159C<C11997J4> interfaceC114159C2 = this.A03;
                    A07 = C12993ZI.A07(this.A01, str, this.A04);
                    interfaceC114159C2.AH3(A07);
                    return str;
                } catch (Throwable th) {
                    AbstractC12078KQ.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) {
                if (AbstractC12078KQ.A02(this)) {
                    return;
                }
                try {
                    if (this.A00 == null) {
                        this.A02.A02(str);
                    } else {
                        this.A02.A01(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 16)));
                    }
                } catch (Throwable th) {
                    AbstractC12078KQ.A00(th, this);
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
                if (AbstractC12078KQ.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    AbstractC12078KQ.A00(th, this);
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
                if (AbstractC12078KQ.A02(this)) {
                    return;
                }
                try {
                    A03(str);
                } catch (Throwable th) {
                    AbstractC12078KQ.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}
