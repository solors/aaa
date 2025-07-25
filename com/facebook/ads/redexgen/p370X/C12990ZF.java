package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.p405ad.utils.error.ErrorCode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ZF */
/* loaded from: assets/audience_network.dex */
public final class C12990ZF<T> implements InterfaceC114159C<T> {
    public static byte[] A06;
    public static String[] A07 = {"EKA8QeB4steRJ5RPBpFUjw3mjvi5", "fve4ITv79qbm2xvzEK1yqXI", "ABPapESs8CyLRtVNwfFPA7A05iROvZsV", "0Lyphf8QRYP2FOEDF4CKVyWqrMlG", "sjHSRvprFPL1Hzs2shXil", "0UuY0i89chpuUt8804PTKlfzEuvvqf4a", "FkeetCIpWmPLoPieiedf1X3IWnyHYH7Q", "bw9eqk6z"};
    public C1140794 A00;
    public C1140794 A01;
    public List<C12990ZF<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C1140693 A04;
    public final C114229J A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {68, 102, 105, 39, 104, 105, 107, 126, 39, 99, 98, 107, 98, 115, 98, 39, 100, 114, 117, 116, 104, 117, 116, 39, 119, 104, 110, 105, 115, 110, 105, 96, 39, 102, 115, 39, 115, 111, 98, 39, 99, 102, 115, 102, 101, 102, 116, 98, 39, 116, 115, 102, 117, 115, 87, 97, 102, 103, 123, 102, 52, 100, 123, 103, 125, 96, 125, 123, 122, 52, 125, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, 61, 56, 52, 117, 122, 112, 52, 102, 113, 119, 123, 102, 112, 52, 114, 125, 120, 113, 52, 103, 113, 101, 97, 113, 122, 119, 113, 52, 103, 96, 117, 102, 96, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, 61, 46, 52, 112, 117, 96, 117, 52, 124, 117, 103, 52, 100, 102, 123, 118, 117, 118, 120, 109, 52, 118, 113, 113, 122, 52, 120, 123, 103, 96, 28, 42, 45, 44, 48, 45, Byte.MAX_VALUE, 47, 48, 44, 54, 43, 54, 48, 49, Byte.MAX_VALUE, 54, 44, Byte.MAX_VALUE, 62, 43, Byte.MAX_VALUE, 119, 122, 59, 115, 122, 59, 118, 115, Byte.MAX_VALUE, 61, 42, 43, Byte.MAX_VALUE, 45, 58, 60, 48, 45, 59, Byte.MAX_VALUE, 57, 54, 51, 58, Byte.MAX_VALUE, 44, 58, 46, 42, 58, 49, 60, 58, Byte.MAX_VALUE, 48, 49, 51, 38, Byte.MAX_VALUE, 55, 62, 44, Byte.MAX_VALUE, 57, 54, 51, 58, Byte.MAX_VALUE, 122, 59, 101, Byte.MAX_VALUE, 59, 62, 43, 62, Byte.MAX_VALUE, 55, 62, 44, Byte.MAX_VALUE, 47, 45, 48, 61, 62, 61, 51, 38, Byte.MAX_VALUE, 61, 58, 58, 49, Byte.MAX_VALUE, 51, 48, 44, 43, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 70, 67, 67, 7, 67, 70, 83, 70, 7, 83, 72, 7, 75, 72, SignedBytes.MAX_POWER_OF_TWO, 8, 47, 39, 34, 43, 42, 110, 58, 33, 110, 45, 34, 43, 47, 60, 110, 42, 47, 58, 47, 44, 47, 61, 43, 11, 44, 36, 33, 40, 41, 109, 57, 34, 109, 43, 40, 57, 46, 37, 109, 41, 44, 57, 44, 109, 43, 63, 34, 32, 109, 33, 34, 42, 102, 65, 73, 76, 69, 68, 0, 84, 79, 0, 71, 69, 84, 0, 82, 69, 67, 79, 82, 68, 0, 67, 79, 85, 78, 84, 73, 110, 102, 99, 106, 107, 47, 123, 96, 47, 122, Byte.MAX_VALUE, 107, 110, 123, 106, 47, 105, 102, 99, 106, 47, 124, 106, 126, 122, 106, 97, 108, 106, 48, 7, 1, 13, 16, 6, 36, 11, 14, 7, 32, 3, 17, 7, 6, 48, 7, 1, 13, 16, 6, 38, 3, 22, 3, 0, 3, 17, 7, 66, 1, 14, 13, 17, 7, 6, 119, SignedBytes.MAX_POWER_OF_TWO, 70, 74, 87, 65, 99, 76, 73, SignedBytes.MAX_POWER_OF_TWO, 103, 68, 86, SignedBytes.MAX_POWER_OF_TWO, 65, 119, SignedBytes.MAX_POWER_OF_TWO, 70, 74, 87, 65, 97, 68, 81, 68, 71, 68, 86, SignedBytes.MAX_POWER_OF_TWO, 5, 76, 86, 5, 70, 73, 74, 86, SignedBytes.MAX_POWER_OF_TWO, 65, 119, 76, 73, 76, 77, 85, 76, 2, 112, 71, 65, 77, 80, 70, 100, 75, 78, 71, 96, 67, 81, 71, 70, 112, 71, 65, 77, 80, 70, 102, 67, 86, 67, SignedBytes.MAX_POWER_OF_TWO, 67, 81, 71, 2, 68, 71, 86, 65, 74, 70, 80, 87, 86, 74, 87, 26, 31, 10, 31};
        if (A07[6].charAt(28) == 'd') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "G0nCZJj0prSQWtMWq2fjymNjpmI3wJ1o";
        strArr[2] = "hmxAaa3VGXWJOtMylrC9mnhyviZ0JnjG";
        A06 = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/ZF<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(C12991ZG c12991zg) {
        if (this.A02.remove(c12991zg)) {
            if (c12991zg.A62() > 0 && c12991zg.A01().A02.A05(c12991zg.A01().A01).equals(this.A01)) {
                this.A01 = c12991zg.A00().A02;
            }
            return true;
        }
        return false;
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public C12990ZF(C1141299 c1141299, InterfaceC114209H interfaceC114209H) throws IOException {
        this.A05 = new C114229J(c1141299.A04(A00(IronSourceConstants.SDK_INIT_FAILED, 4, 103)), interfaceC114209H);
        this.A04 = new C1140693(new File(c1141299.A05(), A00(509, 6, 60)));
        this.A00 = this.A04.A03();
        A05(interfaceC114209H);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i, int i2) throws IOException {
        this.A00 = new C1140794(i, i2);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/ZF<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(C12991ZG c12991zg) throws C114249L {
        if (!this.A03) {
            if (A06(c12991zg)) {
                if (c12991zg.A62() == 0) {
                    return;
                }
                if (this.A00.A04(c12991zg.A00().A02) == 0) {
                    try {
                        for (C114199G c114199g : c12991zg.A00) {
                            if (c114199g.A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), c12991zg.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e) {
                        throw new C114249L(A00(361, 30, 22), e);
                    }
                }
                throw new C114249L(A00(0, 54, 30));
            }
            throw new C114249L(A00(466, 43, 59));
        }
        throw new C114249L(A00(427, 39, 60));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(com.facebook.ads.redexgen.p370X.InterfaceC114209H r13) throws java.io.IOException {
        /*
            r12 = this;
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            int r0 = r0.A06()
            r5 = 0
            com.facebook.ads.redexgen.X.94 r3 = new com.facebook.ads.redexgen.X.94
            r3.<init>(r0, r5)
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r3.A04(r0)
            r4 = 3
            r11 = 2
            r10 = 1
            if (r0 <= 0) goto L5c
            java.util.Locale r7 = java.util.Locale.US
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A02()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A03()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A02()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A03()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 4
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r5] = r9
            r6[r10] = r8
            r6[r11] = r2
            r6[r4] = r1
            r2 = 54
            r1 = 102(0x66, float:1.43E-43)
            r0 = 13
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r13.AFj(r0)
            r12.A00 = r3
        L5b:
            return
        L5c:
            int r1 = r3.A02()
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A02()
            if (r1 >= r0) goto L5b
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L7c
            com.facebook.ads.redexgen.X.94 r3 = new com.facebook.ads.redexgen.X.94
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            int r0 = r0.A06()
            r3.<init>(r0, r5)
            goto L5c
        L7c:
            java.util.Locale r7 = java.util.Locale.US
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A02()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            int r0 = r0.A03()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r2
            r6[r10] = r1
            r6[r11] = r0
            r2 = 156(0x9c, float:2.19E-43)
            r1 = 101(0x65, float:1.42E-43)
            r0 = 70
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r13.AFj(r0)
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            int r2 = r0.A06()
            com.facebook.ads.redexgen.X.9J r0 = r12.A05
            int r1 = r0.A07()
            com.facebook.ads.redexgen.X.94 r0 = new com.facebook.ads.redexgen.X.94
            r0.<init>(r2, r1)
            r12.A00 = r0
            com.facebook.ads.redexgen.X.93 r1 = r12.A04
            com.facebook.ads.redexgen.X.94 r0 = r12.A00
            r1.A04(r0)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12990ZF.A05(com.facebook.ads.redexgen.X.9H):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZG != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC114159C
    public final synchronized InterfaceC114149B A61(byte[] bArr, int[] iArr) throws C114249L {
        C12990ZF<T>.RecordFileBasedFetch c12991zg;
        if (!this.A03) {
            int i = 0;
            int i2 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    C1141097 A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i, iArr, i2);
                    int A00 = A0A.A01().A00();
                    int storageOffset = A0A.A01().A01();
                    int i3 = A00 - storageOffset;
                    int storageOffset2 = A0A.A01().A02();
                    i += storageOffset2;
                    i2 += i3;
                    if (A0A.A01().A03() == EnumC1140895.A03) {
                        arrayList.add(A0A);
                    }
                    if (A0A.A01().A03() == EnumC1140895.A04) {
                        break;
                    } else if (A0A.A01().A03() == EnumC1140895.A05) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new C1140794(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i3);
                    }
                }
                c12991zg = new C12991ZG(this, arrayList, mayHaveMoreData);
                this.A02.add(c12991zg);
                if (!arrayList.isEmpty()) {
                    C1140794 c1140794 = c12991zg.A01().A02;
                    int storageOffset6 = c12991zg.A01().A01;
                    this.A01 = c1140794.A05(storageOffset6);
                }
            } catch (IOException e) {
                throw new C114249L(A00(ErrorCode.CODE_SHOW_RESOURCE_ERROR, 29, 84), e);
            }
        } else {
            throw new C114249L(A00(391, 36, 123));
        }
        return c12991zg;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC114159C
    public final synchronized int A8B() throws C114249L {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                int A02 = this.A00.A02();
                int count = this.A05.A06();
                if (A02 == count) {
                    int count2 = this.A00.A03();
                    A09 -= count2;
                }
            } catch (IOException e) {
                throw new C114249L(A00(335, 26, 57), e);
            }
        } else {
            throw new C114249L(A00(427, 39, 60));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC114159C
    public final synchronized void AH3(byte[] bArr) throws C114249L {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e) {
                throw new C114249L(A00(257, 25, 62), e);
            }
        } else {
            throw new C114249L(A00(427, 39, 60));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC114159C
    public final synchronized void clear() throws C114249L {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e) {
            throw new C114249L(A00(282, 24, 87), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZF != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
