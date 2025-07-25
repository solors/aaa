package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wp */
/* loaded from: assets/audience_network.dex */
public final class C12843Wp implements InterfaceC11872Gz {
    public static byte[] A0L;
    public static String[] A0M = {"UrMCnkXccBalFC8HN9WCBLbox3X", "dRv2Z9", "bDdSrUcUzo1kmxfMgj3oH3iXU8Cz", "fEcMQ3SzKJYU9tWNHDoWDVYLkgWB8X3t", "PaXpl3O9a7f217zDSW3nSwn08nRWKu6e", "5K8mm", "Bluxfawih5IcbVckq", "oeBNeOrgZeyvX0HRTMFnCChFZXWKqMG2"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC11872Gz A07;
    public C11902HT A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC11872Gz A0D;
    public final InterfaceC11872Gz A0E;
    public final InterfaceC11872Gz A0F;
    public final InterfaceC11898HP A0G;
    public final InterfaceC11900HR A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0M[7].charAt(18) == 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[5] = "1vZeu";
            strArr[1] = "9LB3fH";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            int i5 = (copyOfRange[i4] - i3) - 75;
            String[] strArr2 = A0M;
            if (strArr2[5].length() == strArr2[1].length()) {
                throw new RuntimeException();
            }
            A0M[2] = "cFY8xftPDAVu85oO173navidMiHt";
            copyOfRange[i4] = (byte) i5;
            i4++;
        }
    }

    public static void A06() {
        A0L = new byte[]{-51, -52, -95, -65, -63, -58, -61, -62, -96, -41, -46, -61, -47, -80, -61, -65, -62};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final long AEE(C11876H3 c11876h3) throws IOException {
        try {
            this.A09 = AbstractC11904HV.A02(c11876h3);
            this.A06 = c11876h3.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = c11876h3.A00;
            this.A03 = c11876h3.A03;
            this.A0B = A00(c11876h3) != -1;
            boolean z = this.A0B;
            if (c11876h3.A02 != -1 || this.A0B) {
                this.A01 = c11876h3.A02;
            } else {
                this.A01 = this.A0G.A6u(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= c11876h3.A03;
                    if (this.A01 <= 0) {
                        throw new C11873H0(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    static {
        A06();
    }

    public C12843Wp(InterfaceC11898HP interfaceC11898HP, InterfaceC11872Gz interfaceC11872Gz, InterfaceC11872Gz interfaceC11872Gz2, InterfaceC11870Gx interfaceC11870Gx, int i, InterfaceC11900HR interfaceC11900HR) {
        this.A0G = interfaceC11898HP;
        this.A0D = interfaceC11872Gz2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = interfaceC11872Gz;
        if (interfaceC11870Gx != null) {
            this.A0E = new C12846Ws(interfaceC11872Gz, interfaceC11870Gx);
        } else {
            this.A0E = null;
        }
        this.A0H = interfaceC11900HR;
    }

    private int A00(C11876H3 c11876h3) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && c11876h3.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC11898HP interfaceC11898HP, String str, Uri uri) {
        InterfaceC11908HZ contentMetadata = interfaceC11898HP.A6v(str);
        Uri A01 = AbstractC11909Ha.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    private void A03() throws IOException {
        if (this.A07 == null) {
            return;
        }
        try {
            this.A07.close();
            this.A07 = null;
            if (A0M[0].length() == 24) {
                throw new RuntimeException();
            }
            A0M[6] = "QoSQ";
            this.A0A = false;
            if (this.A08 != null) {
                this.A0G.AF2(this.A08);
                this.A08 = null;
            }
        } catch (Throwable th) {
            this.A07 = null;
            this.A0A = false;
            if (this.A08 != null) {
                this.A0G.AF2(this.A08);
                this.A08 = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A6d();
            throw new NullPointerException(A02(0, 17, 19));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AGN(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof C11896HN)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z) throws IOException {
        C11902HT AGw;
        long j;
        C11876H3 c11876h3;
        InterfaceC11872Gz nextDataSource;
        long j2;
        if (this.A0B) {
            AGw = null;
        } else if (this.A0I) {
            try {
                AGw = this.A0G.AGw(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            AGw = this.A0G.AGx(this.A09, this.A03);
        }
        if (AGw == null) {
            nextDataSource = this.A0F;
            c11876h3 = new C11876H3(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (AGw.A05) {
            Uri fromFile = Uri.fromFile(AGw.A03);
            long j3 = this.A03 - AGw.A02;
            long j4 = AGw.A01 - j3;
            if (this.A01 != -1) {
                j4 = Math.min(j4, this.A01);
            }
            c11876h3 = new C11876H3(fromFile, this.A03, j3, j4, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (AGw.A02()) {
                j = this.A01;
            } else {
                j = AGw.A01;
                if (this.A01 != -1) {
                    long length = this.A01;
                    j = Math.min(j, length);
                }
            }
            c11876h3 = new C11876H3(this.A06, this.A03, j, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AF2(AGw);
                AGw = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            long j5 = this.A03;
            if (A0M[6].length() != 12) {
                A0M[6] = "p5EQIcrIdk611KGKEjqGxcWasTL";
                j2 = j5 + 102400;
            }
            throw new RuntimeException();
        }
        j2 = Long.MAX_VALUE;
        this.A02 = j2;
        if (z) {
            AbstractC11914Hf.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th) {
                if (AGw.A01()) {
                    this.A0G.AF2(AGw);
                }
                throw th;
            }
        }
        if (AGw != null && AGw.A01()) {
            this.A08 = AGw;
        }
        this.A07 = nextDataSource;
        this.A0A = c11876h3.A02 == -1;
        long AEE = nextDataSource.AEE(c11876h3);
        C11910Hb mutations = new C11910Hb();
        if (this.A0A && AEE != -1) {
            this.A01 = AEE;
            long length2 = this.A03;
            if (A0M[2].length() == 28) {
                String[] strArr = A0M;
                strArr[3] = "FVh5FgWCovtJ16SB4dV0NFQsQCOStobl";
                strArr[4] = "W34lmKPADTxVjAICliDlMevzRY7gU29F";
                AbstractC11909Ha.A05(mutations, length2 + this.A01);
            }
            throw new RuntimeException();
        }
        if (A0B()) {
            this.A05 = this.A07.A8c();
            if (true ^ this.A06.equals(this.A05)) {
                AbstractC11909Ha.A06(mutations, this.A05);
            } else {
                AbstractC11909Ha.A04(mutations);
            }
        }
        boolean isRedirected = A0C();
        if (isRedirected) {
            this.A0G.A3w(this.A09, mutations);
        }
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0D(java.io.IOException r1) {
        /*
        L0:
            if (r1 == 0) goto L14
            boolean r0 = r1 instanceof com.facebook.ads.redexgen.p370X.C11873H0
            if (r0 == 0) goto Lf
            r0 = r1
            com.facebook.ads.redexgen.X.H0 r0 = (com.facebook.ads.redexgen.p370X.C11873H0) r0
            int r0 = r0.A00
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12843Wp.A0D(java.io.IOException):boolean");
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final Uri A8c() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int read = this.A07.read(bArr, i, i2);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                if (this.A01 != -1) {
                    this.A01 -= read;
                }
            } else if (this.A0A) {
                A05();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A03();
                A08(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.A0A) {
                boolean A0D = A0D(e);
                String[] strArr = A0M;
                if (strArr[5].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                A0M[6] = "d45piyjFs6M";
                if (A0D) {
                    A05();
                    return -1;
                }
            }
            A07(e);
            throw e;
        }
    }
}
