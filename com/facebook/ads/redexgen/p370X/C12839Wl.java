package com.facebook.ads.redexgen.p370X;

import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Wl */
/* loaded from: assets/audience_network.dex */
public final class C12839Wl implements InterfaceC11898HP {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"a", "OPKdUZ", "FA3afr", "VpzN4TRMQVrL1VTjAcAjDBVhYJ", "1", "v", "FJC", "ewZDjNMmwL0Ej173ZiyKA"};
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC12841Wn A02;
    public final C11906HX A03;
    public final File A04;
    public final HashMap<String, ArrayList<InterfaceC11897HO>> A05;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{14, 33, 32, 59, 39, 42, 61, 111, 28, 38, 34, 63, 35, 42, 12, 46, 44, 39, 42, 111, 38, 33, 60, 59, 46, 33, 44, 42, 111, 58, 60, 42, 60, 111, 59, 39, 42, 111, 41, 32, 35, 43, 42, 61, 117, 111, 115, 73, 77, 80, 76, 69, 99, 65, 67, 72, 69, 9, 51, 55, 42, 54, 63, 25, 59, 57, 50, 63, 116, 51, 52, 51, 46, 51, 59, 54, 51, 32, 63, 114, 115, 123, 92, 71, 90, 65, 70, 79, 8, 65, 70, 76, 77, 80, 8, 78, 65, 68, 77, 8, 78, 73, 65, 68, 77, 76, 37, 39, 37, 46, 35, 34, 25, 37, 41, 40, 50, 35, 40, 50, 25, 47, 40, 34, 35, 62, 104, 35, 62, 47};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized void A4j(File file) throws C11896HN {
        AbstractC11914Hf.A04(!this.A01);
        C12838Wk A00 = C12838Wk.A00(file, this.A03);
        AbstractC11914Hf.A04(A00 != null);
        C11905HW A092 = this.A03.A09(A00.A04);
        AbstractC11914Hf.A01(A092);
        AbstractC11914Hf.A04(A092.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long A002 = AbstractC11909Ha.A00(A092.A05());
            if (A002 != -1) {
                AbstractC11914Hf.A04(A00.A02 + A00.A01 <= A002);
            }
            A0A(A00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized NavigableSet<C11902HT> A6f(String str) {
        C11905HW A092;
        AbstractC11914Hf.A04(!this.A01);
        A092 = this.A03.A09(str);
        return (A092 == null || A092.A0C()) ? new TreeSet() : new TreeSet((Collection) A092.A08());
    }

    static {
        A06();
        A09 = new HashSet<>();
    }

    public C12839Wl(File file, InterfaceC12841Wn interfaceC12841Wn) {
        this(file, interfaceC12841Wn, null, false);
    }

    public C12839Wl(File file, InterfaceC12841Wn interfaceC12841Wn, C11906HX c11906hx) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC12841Wn;
            this.A03 = c11906hx;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new C11911Hc(this, A03(57, 24, 14), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 27) + file);
    }

    public C12839Wl(File file, InterfaceC12841Wn interfaceC12841Wn, byte[] bArr, boolean z) {
        this(file, interfaceC12841Wn, new C11906HX(file, bArr, z));
    }

    private C12838Wk A00(String str, long j) throws C11896HN {
        C12838Wk span;
        C11905HW A092 = this.A03.A09(str);
        if (A092 == null) {
            return C12838Wk.A02(str, j);
        }
        while (true) {
            span = A092.A06(j);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    /* renamed from: A01 */
    public final synchronized C12838Wk AGw(String str, long j) throws InterruptedException, C11896HN {
        C12838Wk span;
        while (true) {
            span = AGx(str, j);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    /* renamed from: A02 */
    public final synchronized C12838Wk AGx(String str, long j) throws C11896HN {
        AbstractC11914Hf.A04(!this.A01);
        C12838Wk A00 = A00(str, j);
        if (A00.A05) {
            C12838Wk cacheSpan = this.A03.A09(str).A07(A00);
            A0C(A00, cacheSpan);
            return cacheSpan;
        }
        C11905HW A0A = this.A03.A0A(str);
        if (A0A.A0D()) {
            return null;
        }
        A0A.A0B(true);
        return A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] listFiles = this.A04.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.getName().equals(A03(106, 24, 18))) {
                C12838Wk A00 = file.length() > 0 ? C12838Wk.A00(file, this.A03) : null;
                if (A00 != null) {
                    A0A(A00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (C11896HN e) {
            Log.e(A03(46, 11, 116), A03(81, 25, 124), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05() throws com.facebook.ads.redexgen.p370X.C11896HN {
        /*
            r6 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.facebook.ads.redexgen.X.HX r0 = r6.A03
            java.util.Collection r0 = r0.A0D()
            java.util.Iterator r5 = r0.iterator()
        Lf:
            boolean r4 = r5.hasNext()
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12839Wl.A08
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb3
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12839Wl.A08
            java.lang.String r1 = "8RyyWH2sXbvtcybyvpgGuaSQPyMb"
            r0 = 7
            r2[r0] = r1
            if (r4 == 0) goto L72
            java.lang.Object r4 = r5.next()
            com.facebook.ads.redexgen.X.HW r4 = (com.facebook.ads.redexgen.p370X.C11905HW) r4
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12839Wl.A08
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb3
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12839Wl.A08
            java.lang.String r1 = "W"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "2"
            r0 = 0
            r2[r0] = r1
            java.util.TreeSet r0 = r4.A08()
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf
            java.lang.Object r2 = r0.next()
            com.facebook.ads.redexgen.X.HT r2 = (com.facebook.ads.redexgen.p370X.C11902HT) r2
            java.io.File r1 = r2.A03
            boolean r1 = r1.exists()
            if (r1 != 0) goto L5a
            r3.add(r2)
            goto L5a
        L72:
            r4 = 0
        L73:
            int r5 = r3.size()
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C12839Wl.A08
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12839Wl.A08
            java.lang.String r1 = "axYd4LGkVmpVYJMnCXpGOxz9igUktz"
            r0 = 6
            r2[r0] = r1
            if (r4 >= r5) goto La8
        L8c:
            java.lang.Object r1 = r3.get(r4)
            com.facebook.ads.redexgen.X.HT r1 = (com.facebook.ads.redexgen.p370X.C11902HT) r1
            r0 = 0
            r6.A08(r1, r0)
            int r4 = r4 + 1
            goto L73
        L99:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12839Wl.A08
            java.lang.String r1 = "FKJgoO"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "R9ON5m"
            r0 = 2
            r2[r0] = r1
            if (r4 >= r5) goto La8
            goto L8c
        La8:
            com.facebook.ads.redexgen.X.HX r0 = r6.A03
            r0.A0F()
            com.facebook.ads.redexgen.X.HX r0 = r6.A03
            r0.A0G()
            return
        Lb3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12839Wl.A05():void");
    }

    private void A07(C11902HT c11902ht) {
        ArrayList<InterfaceC11897HO> arrayList = this.A05.get(c11902ht.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ADf(this, c11902ht);
            }
        }
        this.A02.ADf(this, c11902ht);
    }

    private void A08(C11902HT c11902ht, boolean z) throws C11896HN {
        C11905HW A092 = this.A03.A09(c11902ht.A04);
        if (A092 == null || !A092.A0E(c11902ht)) {
            return;
        }
        long j = this.A00;
        String[] strArr = A08;
        if (strArr[4].length() != strArr[3].length()) {
            A08[7] = "C0qeCah7HNN5stexeGpu3wCMBFxC7Qm";
            this.A00 = j - c11902ht.A01;
            if (z) {
                try {
                    this.A03.A0H(A092.A03);
                    this.A03.A0G();
                } catch (Throwable th) {
                    A07(c11902ht);
                    throw th;
                }
            }
            A07(c11902ht);
            if (A08[7].length() != 7) {
                String[] strArr2 = A08;
                strArr2[1] = "Fhpc7L";
                strArr2[2] = "T7IVuP";
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0A(C12838Wk c12838Wk) {
        this.A03.A0A(c12838Wk.A04).A09(c12838Wk);
        this.A00 += c12838Wk.A01;
        A0B(c12838Wk);
    }

    private void A0B(C12838Wk c12838Wk) {
        ArrayList<InterfaceC11897HO> arrayList = this.A05.get(c12838Wk.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ADe(this, c12838Wk);
            }
        }
        this.A02.ADe(this, c12838Wk);
    }

    private void A0C(C12838Wk c12838Wk, C11902HT c11902ht) {
        ArrayList<InterfaceC11897HO> arrayList = this.A05.get(c12838Wk.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).ADg(this, c12838Wk, c11902ht);
            }
        }
        this.A02.ADg(this, c12838Wk, c11902ht);
    }

    public static synchronized boolean A0D(File file) {
        synchronized (C12839Wl.class) {
            if (A06) {
                return true;
            }
            return A09.add(file.getAbsoluteFile());
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized void A3w(String str, C11910Hb c11910Hb) throws C11896HN {
        AbstractC11914Hf.A04(!this.A01);
        this.A03.A0I(str, c11910Hb);
        this.A03.A0G();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized long A6d() {
        AbstractC11914Hf.A04(!this.A01);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized long A6e(String str, long j, long j2) {
        C11905HW cachedContent;
        AbstractC11914Hf.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized long A6u(String str) {
        return AbstractC11909Ha.A00(A6v(str));
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized InterfaceC11908HZ A6v(String str) {
        AbstractC11914Hf.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized void AF2(C11902HT c11902ht) {
        AbstractC11914Hf.A04(!this.A01);
        C11905HW A092 = this.A03.A09(c11902ht.A04);
        AbstractC11914Hf.A01(A092);
        AbstractC11914Hf.A04(A092.A0D());
        A092.A0B(false);
        this.A03.A0H(A092.A03);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized void AFc(C11902HT c11902ht) throws C11896HN {
        AbstractC11914Hf.A04(!this.A01);
        A08(c11902ht, true);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized void AGN(String str, long j) throws C11896HN {
        C11910Hb mutations = new C11910Hb();
        AbstractC11909Ha.A05(mutations, j);
        A3w(str, mutations);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11898HP
    public final synchronized File AGu(String str, long j, long j2) throws C11896HN {
        C11905HW A092;
        AbstractC11914Hf.A04(!this.A01);
        A092 = this.A03.A09(str);
        AbstractC11914Hf.A01(A092);
        AbstractC11914Hf.A04(A092.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ADh(this, str, j, j2);
        return C12838Wk.A04(this.A04, A092.A02, j, System.currentTimeMillis());
    }
}
