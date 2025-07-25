package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dg */
/* loaded from: assets/audience_network.dex */
public final class C11688Dg implements InterfaceC12884XU, InterfaceC11585Bz, InterfaceC11884HB<C12888XY>, InterfaceC11887HE, InterfaceC11768FF {
    public static byte[] A0c;
    public static String[] A0d = {"peLU6GbomQp3KTDTEO6fFbGDd5YKfbx5", "7mT0mr2NYOE5sZhPJJhz2OZpyXxRGG9d", "UXLPIbz1b38T7IFge1hDzhsuoxMK7yBR", "gCShhPyLIj5hpfUfS", "XuIiTKqZqLFDSY9gTXO0Gx3LpXWUQlMf", "5IJgqt6", "EtcMKAz9SJVscvNDduv2RLMG0vWKtUvv", "0mgYyHLWy1r45Lytf"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public InterfaceC11592C6 A07;
    public InterfaceC12885XV A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final C11742Ep A0S;
    public final InterfaceC11743Eq A0T;
    public final C11759F6 A0U;
    public final InterfaceC11864Gr A0V;
    public final InterfaceC11872Gz A0W;
    public final String A0b;
    public final C12849Wv A0X = new C12849Wv(A07(0, 27, 38));
    public final C11920Hl A0Y = new C11920Hl();
    public final Runnable A0Z = new RunnableC11740En(this);
    public final Runnable A0a = new RunnableC11741Eo(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public C12883XT[] A0K = new C12883XT[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{30, 61, 51, 54, 55, 32, 104, 23, 42, 38, 32, 51, 49, 38, 61, 32, 31, 55, 54, 59, 51, 2, 55, 32, 59, 61, 54};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long AGC(InterfaceC11858Gl[] interfaceC11858GlArr, boolean[] zArr, InterfaceC11769FG[] interfaceC11769FGArr, boolean[] zArr2, long j) {
        int i;
        int i2;
        AbstractC11914Hf.A04(this.A0F);
        int i3 = this.A01;
        int i4 = 0;
        while (true) {
            i = 0;
            if (i4 >= interfaceC11858GlArr.length) {
                break;
            }
            if (interfaceC11769FGArr[i4] != null && (interfaceC11858GlArr[i4] == null || !zArr[i4])) {
                i2 = ((C12887XX) interfaceC11769FGArr[i4]).A00;
                AbstractC11914Hf.A04(this.A0L[i2]);
                this.A01--;
                this.A0L[i2] = false;
                interfaceC11769FGArr[i4] = null;
            }
            i4++;
        }
        boolean z = !this.A0I ? j == 0 : i3 != 0;
        for (int i5 = 0; i5 < interfaceC11858GlArr.length; i5++) {
            if (interfaceC11769FGArr[i5] == null && interfaceC11858GlArr[i5] != null) {
                InterfaceC11858Gl interfaceC11858Gl = interfaceC11858GlArr[i5];
                AbstractC11914Hf.A04(interfaceC11858Gl.length() == 1);
                AbstractC11914Hf.A04(interfaceC11858Gl.A7a(0) == 0);
                int A00 = this.A09.A00(interfaceC11858Gl.A8Y());
                AbstractC11914Hf.A04(!this.A0L[A00]);
                this.A01++;
                this.A0L[A00] = true;
                interfaceC11769FGArr[i5] = new C12887XX(this, A00);
                zArr2[i5] = true;
                if (!z) {
                    C12883XT c12883xt = this.A0K[A00];
                    c12883xt.A0J();
                    z = c12883xt.A0D(j, true, true) == -1 && c12883xt.A0B() != 0;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0E = false;
            this.A0D = false;
            if (this.A0X.A08()) {
                C12883XT[] c12883xtArr = this.A0K;
                int length = c12883xtArr.length;
                while (i < length) {
                    c12883xtArr[i].A0H();
                    i++;
                }
                this.A0X.A05();
            } else {
                C12883XT[] c12883xtArr2 = this.A0K;
                int length2 = c12883xtArr2.length;
                while (i < length2) {
                    c12883xtArr2[i].A0I();
                    i++;
                }
            }
        } else if (z) {
            j = AGB(j);
            for (int i6 = 0; i6 < interfaceC11769FGArr.length; i6++) {
                if (interfaceC11769FGArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.A0I = true;
        return j;
    }

    static {
        A0B();
    }

    public C11688Dg(Uri uri, InterfaceC11872Gz interfaceC11872Gz, InterfaceC11583Bx[] interfaceC11583BxArr, int i, C11759F6 c11759f6, InterfaceC11743Eq interfaceC11743Eq, InterfaceC11864Gr interfaceC11864Gr, String str, int i2) {
        this.A0Q = uri;
        this.A0W = interfaceC11872Gz;
        this.A0O = i;
        this.A0U = c11759f6;
        this.A0T = interfaceC11743Eq;
        this.A0V = interfaceC11864Gr;
        this.A0b = str;
        this.A0P = i2;
        this.A0S = new C11742Ep(interfaceC11583BxArr, this);
        this.A00 = i == -1 ? 3 : i;
        c11759f6.A03();
    }

    private int A00() {
        int i = 0;
        for (C12883XT c12883xt : this.A0K) {
            int extractedSamplesCount = c12883xt.A0C();
            i += extractedSamplesCount;
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11884HB
    /* renamed from: A01 */
    public final int ACT(C12888XY c12888xy, long j, long j2, IOException iOException) {
        C11876H3 c11876h3;
        long j3;
        long j4;
        boolean isErrorFatal = A0N(iOException);
        C11759F6 c11759f6 = this.A0U;
        c11876h3 = c12888xy.A03;
        j3 = c12888xy.A02;
        long j5 = this.A03;
        j4 = c12888xy.A00;
        c11759f6.A0H(c11876h3, 1, -1, null, 0, null, j3, j5, j, j2, j4, iOException, isErrorFatal);
        A0E(c12888xy);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean madeProgress = A00 > this.A02;
        if (A0L(c12888xy, A00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long j = Long.MIN_VALUE;
        for (C12883XT c12883xt : this.A0K) {
            long largestQueuedTimestampUs = c12883xt.A0F();
            j = Math.max(j, largestQueuedTimestampUs);
        }
        return j;
    }

    public void A09() {
        if (this.A0G) {
            return;
        }
        boolean z = this.A0F;
        if (A0d[5].length() != 14) {
            A0d[1] = "ZlqthdC5a5V1gMLl5Bq31xGEZ23V1gO9";
            if (z || this.A07 == null || !this.A0H) {
                return;
            }
            for (C12883XT c12883xt : this.A0K) {
                if (c12883xt.A0G() == null) {
                    return;
                }
            }
            this.A0Y.A01();
            int length = this.A0K.length;
            TrackGroup[] trackGroupArr = new TrackGroup[length];
            this.A0N = new boolean[length];
            this.A0L = new boolean[length];
            this.A0M = new boolean[length];
            this.A03 = this.A07.A7F();
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i < length) {
                    Format A0G = this.A0K[i].A0G();
                    trackGroupArr[i] = new TrackGroup(A0G);
                    String str = A0G.A0O;
                    if (!AbstractC11932Hx.A0B(str)) {
                        boolean A09 = AbstractC11932Hx.A09(str);
                        String[] strArr = A0d;
                        String str2 = strArr[2];
                        String str3 = strArr[0];
                        int charAt = str2.charAt(13);
                        int trackCount = str3.charAt(13);
                        if (charAt == trackCount) {
                            break;
                        }
                        A0d[5] = "wjlt";
                        if (!A09) {
                            z2 = false;
                        }
                    }
                    this.A0N[i] = z2;
                    this.A0A |= z2;
                    i++;
                } else {
                    this.A09 = new TrackGroupArray(trackGroupArr);
                    if (this.A0O == -1) {
                        int trackCount2 = (this.A05 > (-1L) ? 1 : (this.A05 == (-1L) ? 0 : -1));
                        if (trackCount2 == 0) {
                            int trackCount3 = (this.A07.A7F() > (-9223372036854775807L) ? 1 : (this.A07.A7F() == (-9223372036854775807L) ? 0 : -1));
                            if (trackCount3 == 0) {
                                if (A0d[1].charAt(24) != 'Q') {
                                    String[] strArr2 = A0d;
                                    strArr2[7] = "bvBqSLHYyRK7T41Ph";
                                    strArr2[3] = "q1iL5o2Amc4Ds9Lvm";
                                    this.A00 = 6;
                                } else {
                                    A0d[5] = "4JTtgCqRPlniUROX";
                                    this.A00 = 6;
                                }
                            }
                        }
                    }
                    this.A0F = true;
                    this.A0T.ADc(this.A03, this.A07.A9h());
                    this.A08.ADC(this);
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    private void A0A() {
        C11876H3 c11876h3;
        long j;
        C12888XY c12888xy = new C12888XY(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            AbstractC11914Hf.A04(A0I());
            if (this.A03 != -9223372036854775807L) {
                long j2 = this.A06;
                long j3 = this.A03;
                if (A0d[5].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0d;
                strArr[4] = "EEVowzvPGAuoS8G3kXEqEFrH8fWZZ317";
                strArr[6] = "VR26HTJrPSZGT1wLH8eUhUMOdoWDO7dv";
                if (j2 >= j3) {
                    this.A0B = true;
                    this.A06 = -9223372036854775807L;
                    return;
                }
            }
            c12888xy.A04(this.A07.A8H(this.A06).A00.A00, this.A06);
            this.A06 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(c12888xy, this, this.A00);
        C11759F6 c11759f6 = this.A0U;
        c11876h3 = c12888xy.A03;
        j = c12888xy.A02;
        c11759f6.A0E(c11876h3, 1, -1, null, 0, null, j, this.A03, A04);
    }

    private void A0C(int i) {
        if (!this.A0M[i]) {
            Format A01 = this.A09.A01(i).A01(0);
            this.A0U.A06(AbstractC11932Hx.A01(A01.A0O), A01, 0, null, this.A04);
            this.A0M[i] = true;
        }
    }

    private void A0D(int i) {
        if (!this.A0E || !this.A0N[i] || this.A0K[i].A0M()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (C12883XT c12883xt : this.A0K) {
            c12883xt.A0I();
        }
        this.A08.ABd(this);
    }

    private void A0E(C12888XY c12888xy) {
        long j;
        if (this.A05 != -1) {
            return;
        }
        j = c12888xy.A01;
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11884HB
    /* renamed from: A0F */
    public final void ACS(C12888XY c12888xy, long j, long j2) {
        C11876H3 c11876h3;
        long j3;
        long j4;
        long j5;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                j5 = 0;
            } else {
                j5 = 10000 + A02;
            }
            this.A03 = j5;
            this.A0T.ADc(this.A03, this.A07.A9h());
        }
        C11759F6 c11759f6 = this.A0U;
        c11876h3 = c12888xy.A03;
        j3 = c12888xy.A02;
        long j6 = this.A03;
        j4 = c12888xy.A00;
        c11759f6.A0G(c11876h3, 1, -1, null, 0, null, j3, j6, j, j2, j4);
        A0E(c12888xy);
        this.A0B = true;
        this.A08.ABd(this);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11884HB
    /* renamed from: A0G */
    public final void ACQ(C12888XY c12888xy, long j, long j2, boolean z) {
        C11876H3 c11876h3;
        long j3;
        long j4;
        C11759F6 c11759f6 = this.A0U;
        c11876h3 = c12888xy.A03;
        j3 = c12888xy.A02;
        long j5 = this.A03;
        j4 = c12888xy.A00;
        c11759f6.A0F(c11876h3, 1, -1, null, 0, null, j3, j5, j, j2, j4);
        if (!z) {
            A0E(c12888xy);
            for (C12883XT c12883xt : this.A0K) {
                c12883xt.A0I();
            }
            if (this.A01 > 0) {
                this.A08.ABd(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j) {
        int length = this.A0K.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            C12883XT c12883xt = this.A0K[i];
            c12883xt.A0J();
            int i2 = c12883xt.A0D(j, true, false);
            if ((i2 != -1) || (!this.A0N[i] && this.A0A)) {
                i++;
            }
        }
        return false;
    }

    private boolean A0L(C12888XY c12888xy, int i) {
        if (this.A05 != -1 || (this.A07 != null && this.A07.A7F() != -9223372036854775807L)) {
            this.A02 = i;
            if (A0d[5].length() != 14) {
                A0d[1] = "skDgVB0Ht0zuzgTIxTUQ6nUZxrKrp9x6";
                return true;
            }
        } else {
            if (this.A0F && !A0J()) {
                this.A0E = true;
                return false;
            }
            this.A0D = this.A0F;
            this.A04 = 0L;
            this.A02 = 0;
            for (C12883XT c12883xt : this.A0K) {
                c12883xt.A0I();
                String[] strArr = A0d;
                if (strArr[4].charAt(26) == strArr[6].charAt(26)) {
                    String[] strArr2 = A0d;
                    strArr2[7] = "KZ8GDv2dcd7yDyxHm";
                    strArr2[3] = "atXiisDnWt347KW7D";
                }
            }
            c12888xy.A04(0L, 0L);
            return true;
        }
        throw new RuntimeException();
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof C12881XR;
    }

    public final int A0O(int i, long j) {
        int skipCount;
        if (A0J()) {
            return 0;
        }
        C12883XT c12883xt = this.A0K[i];
        if (this.A0B && j > c12883xt.A0F()) {
            skipCount = c12883xt.A0A();
        } else {
            skipCount = c12883xt.A0D(j, true, true);
            if (skipCount == -1) {
                skipCount = 0;
            }
        }
        if (skipCount > 0) {
            A0C(i);
        } else {
            A0D(i);
        }
        return skipCount;
    }

    public final int A0P(int i, C114589u c114589u, C12971Yw c12971Yw, boolean z) {
        if (A0J()) {
            return -3;
        }
        C12883XT c12883xt = this.A0K[i];
        String[] strArr = A0d;
        if (strArr[4].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A0d[1] = "CFUr7kPjUmptptxTmpAlPyDYAkhTIB3I";
        int A0E = c12883xt.A0E(c114589u, c12971Yw, z, this.A0B, this.A04);
        if (A0E == -4) {
            A0C(i);
        } else if (A0E == -3) {
            A0D(i);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (C12883XT c12883xt : this.A0K) {
                c12883xt.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i) {
        return !A0J() && (this.A0B || this.A0K[i].A0M());
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final boolean A4p(long j) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        boolean A02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            return true;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final void A5W(long j, boolean z) {
        int length = this.A0K.length;
        for (int i = 0; i < length; i++) {
            this.A0K[i].A0K(j, z, this.A0L[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11585Bz
    public final void A5u() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long A6L(long j, C11482AI c11482ai) {
        if (!this.A07.A9h()) {
            return 0L;
        }
        C11591C5 A8H = this.A07.A8H(j);
        return AbstractC11953IK.A0I(j, c11482ai, A8H.A00.A01, A8H.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long A6b() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            return this.A06;
        }
        if (this.A0A) {
            A02 = Long.MAX_VALUE;
            int i = this.A0K.length;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A0N[i2]) {
                    A02 = Math.min(A02, this.A0K[i2].A0F());
                }
            }
        } else {
            A02 = A02();
        }
        int trackCount = (A02 > Long.MIN_VALUE ? 1 : (A02 == Long.MIN_VALUE ? 0 : -1));
        if (trackCount == 0) {
            return this.A04;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long A7s() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A6b();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final TrackGroupArray A8Z() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final void AAn() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11887HE
    public final void ACX() {
        for (C12883XT c12883xt : this.A0K) {
            c12883xt.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11768FF
    public final void ADv(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final void AEX(InterfaceC12885XV interfaceC12885XV, long j) {
        this.A08 = interfaceC12885XV;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long AEo() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        if (this.A0D) {
            if (this.A0B || A00() > this.A02) {
                String[] strArr = A0d;
                if (strArr[2].charAt(13) != strArr[0].charAt(13)) {
                    String[] strArr2 = A0d;
                    strArr2[4] = "8QQskbS2Pw4utxbEv0LyYmP5VjWpvONg";
                    strArr2[6] = "uwG3ZIcw3rm7jy9KlanJYK16xJWMutQx";
                    this.A0D = false;
                    return this.A04;
                }
                throw new RuntimeException();
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final void AEu(long j) {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11585Bz
    public final void AG8(InterfaceC11592C6 interfaceC11592C6) {
        this.A07 = interfaceC11592C6;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12884XU
    public final long AGB(long j) {
        if (!this.A07.A9h()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (!A0I() && A0K(j)) {
            return j;
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        if (this.A0X.A08()) {
            C12849Wv c12849Wv = this.A0X;
            if (A0d[5].length() == 14) {
                throw new RuntimeException();
            }
            A0d[1] = "E7sj14dZL93fqj6GUgSTTa20SijXvEHd";
            c12849Wv.A05();
        } else {
            for (C12883XT c12883xt : this.A0K) {
                c12883xt.A0I();
            }
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11585Bz
    public final InterfaceC11595C9 AHA(int i, int i2) {
        int length = this.A0K.length;
        for (int i3 = 0; i3 < length; i3++) {
            int trackCount = this.A0J[i3];
            if (trackCount == i) {
                return this.A0K[i3];
            }
        }
        C12883XT c12883xt = new C12883XT(this.A0V);
        c12883xt.A0L(this);
        int trackCount2 = length + 1;
        this.A0J = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J[length] = i;
        int trackCount3 = length + 1;
        this.A0K = (C12883XT[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K[length] = c12883xt;
        return c12883xt;
    }
}
