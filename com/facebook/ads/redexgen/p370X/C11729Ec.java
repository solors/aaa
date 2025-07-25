package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Ec */
/* loaded from: assets/audience_network.dex */
public final class C11729Ec implements Handler.Callback, InterfaceC12885XV, InterfaceC11860Gn, InterfaceC11747Eu, InterfaceC114439e, InterfaceC11475AB {
    public static byte[] A0V;
    public static String[] A0W = {"P6YxoLhkz5ibpkstopVZVyommDCQ", "ATQddAIWQ0owYjgYaCgc", "Qvf", "B0i3rKbSIcl8mqFdJDuay5LNvvemcw4", "y6g4Ls3CGE757uBbH2iTCdPLcyck5fnI", "NEX", "Ls5ai4PwJPSlX5bzXjpt", "Xwhc7JDkSZbpBXzUBO5xvnc0Yvh1Hw2q"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C114559q A04;
    public C11465A1 A05;
    public InterfaceC11748Ev A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public InterfaceC12985ZA[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final C12988ZD A0G;
    public final InterfaceC12986ZB A0H;
    public final InterfaceC114609w A0J;
    public final C11484AK A0L;
    public final C11485AL A0M;
    public final AbstractC11861Go A0N;
    public final C11862Gp A0O;
    public final InterfaceC11917Hi A0P;
    public final InterfaceC11927Hs A0Q;
    public final ArrayList<C114539o> A0R;
    public final boolean A0S;
    public final InterfaceC12985ZA[] A0T;
    public final InterfaceC11479AF[] A0U;
    public final C114639z A0K = new C114639z();
    public C11482AI A06 = C11482AI.A04;
    public final C114549p A0I = new C114549p();

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 90);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00ec, code lost:
        if (r8 == 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00f1, code lost:
        if (r14.A0C.length != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00f3, code lost:
        r8 = A0q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0101, code lost:
        if (com.facebook.ads.redexgen.p370X.C11729Ec.A0W[1].length() == 3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0103, code lost:
        com.facebook.ads.redexgen.p370X.C11729Ec.A0W[7] = "Pg4wdYPbV6RAArZs6bIYTAeWks45Tt58";
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x010a, code lost:
        if (r8 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0114, code lost:
        if (r8 == 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0117, code lost:
        com.facebook.ads.redexgen.p370X.C11729Ec.A0W[3] = "J56eYHViHFeMgD9oGoA5EmJCsj5r0jg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x011e, code lost:
        if (r8 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0121, code lost:
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0123, code lost:
        r14.A09 = r14.A08;
        A0N(2);
        A0H();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07() throws com.facebook.ads.redexgen.p370X.C114469h, java.io.IOException {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11729Ec.A07():void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0E() throws C114469h {
        if (this.A0K.A0P()) {
            float f = this.A0G.A85().A01;
            C114619x A0H = this.A0K.A0H();
            boolean z = true;
            for (C114619x A0G = this.A0K.A0G(); A0G != null && A0G.A06; A0G = A0G.A01) {
                if (A0G.A0I(f)) {
                    String[] strArr = A0W;
                    if (strArr[5].length() != strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A0W[6] = "6mKidZrYKow0BOAnF1OB";
                    if (z) {
                        C114619x A0G2 = this.A0K.A0G();
                        boolean A0S = this.A0K.A0S(A0G2);
                        boolean[] zArr = new boolean[this.A0T.length];
                        long A0B = A0G2.A0B(this.A05.A0A, A0S, zArr);
                        A0i(A0G2.A03, A0G2.A04);
                        if (this.A05.A00 != 4 && A0B != this.A05.A0A) {
                            this.A05 = this.A05.A04(this.A05.A04, A0B, this.A05.A01);
                            this.A0I.A04(4);
                            A0P(A0B);
                        }
                        int i = 0;
                        boolean[] zArr2 = new boolean[this.A0T.length];
                        for (int i2 = 0; i2 < this.A0T.length; i2++) {
                            InterfaceC12985ZA interfaceC12985ZA = this.A0T[i2];
                            zArr2[i2] = interfaceC12985ZA.A8P() != 0;
                            InterfaceC11769FG interfaceC11769FG = A0G2.A0A[i2];
                            if (interfaceC11769FG != null) {
                                i++;
                            }
                            if (zArr2[i2]) {
                                if (interfaceC11769FG != interfaceC12985ZA.A8S()) {
                                    A0b(interfaceC12985ZA);
                                } else if (zArr[i2]) {
                                    interfaceC12985ZA.AFr(this.A03);
                                }
                            }
                        }
                        this.A05 = this.A05.A05(A0G2.A03, A0G2.A04);
                        A0p(zArr2, i);
                    } else {
                        this.A0K.A0S(A0G);
                        if (A0G.A06) {
                            A0G.A0A(Math.max(A0G.A02.A03, A0G.A08(this.A03)), false);
                            A0i(A0G.A03, A0G.A04);
                        }
                    }
                    if (this.A05.A00 != 4) {
                        A09();
                        A0J();
                        this.A0Q.AGD(2);
                        return;
                    }
                    return;
                }
                if (A0G == A0H) {
                    z = false;
                }
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0I() throws C114469h, IOException {
        C11729Ec c11729Ec = this;
        if (c11729Ec.A07 == null) {
            return;
        }
        int i = c11729Ec.A01;
        if (A0W[0].length() == 28) {
            A0W[6] = "8D1ARm0ZBQnnZCNoomKo";
            if (i > 0) {
                c11729Ec.A07.AAo();
                return;
            }
            A0C();
            C114619x A0F = c11729Ec.A0K.A0F();
            if (A0F == null || A0F.A0H()) {
                c11729Ec.A0k(false);
            } else if (!c11729Ec.A05.A08) {
                A09();
            }
            if (!c11729Ec.A0K.A0P()) {
                return;
            }
            C114619x A0G = c11729Ec.A0K.A0G();
            C114639z c114639z = c11729Ec.A0K;
            if (A0W[3].length() != 1) {
                A0W[1] = "ouJLsfuj4L5l2nuVgaPcx";
                C114619x A0H = c114639z.A0H();
                boolean z = false;
                while (c11729Ec.A08 && A0G != A0H && c11729Ec.A03 >= A0G.A01.A00) {
                    if (z) {
                        A0A();
                    }
                    C114629y c114629y = A0G.A02;
                    if (A0W[1].length() == 3) {
                        throw new RuntimeException();
                    }
                    A0W[7] = "0M30bmT4hYz4ZuhjE8LXlv6wVKZ562xO";
                    int i2 = c114629y.A06 ? 0 : 3;
                    C114619x c114619x = A0G;
                    A0G = c11729Ec.A0K.A0C();
                    c11729Ec.A0V(c114619x);
                    c11729Ec.A05 = c11729Ec.A05.A04(A0G.A02.A04, A0G.A02.A03, A0G.A02.A00);
                    c11729Ec.A0I.A04(i2);
                    A0J();
                    z = true;
                }
                if (A0H.A02.A05) {
                    for (int i3 = 0; i3 < c11729Ec.A0T.length; i3++) {
                        InterfaceC12985ZA interfaceC12985ZA = c11729Ec.A0T[i3];
                        InterfaceC11769FG interfaceC11769FG = A0H.A0A[i3];
                        if (interfaceC11769FG != null && interfaceC12985ZA.A8S() == interfaceC11769FG) {
                            boolean A8z = interfaceC12985ZA.A8z();
                            if (A0W[7].charAt(28) == 'w') {
                                throw new RuntimeException();
                            }
                            A0W[6] = "vXr9IuCvwlwtM4B4RQ4o";
                            if (A8z) {
                                interfaceC12985ZA.AGO();
                            }
                        }
                    }
                    return;
                } else if (A0H.A01 == null) {
                    return;
                } else {
                    C114619x c114619x2 = A0H.A01;
                    if (A0W[7].charAt(28) != 'w') {
                        A0W[3] = "jJFxzY6mdlXoyZQ0oDOcGo2";
                        if (!c114619x2.A06) {
                            return;
                        }
                    } else {
                        A0W[1] = "I";
                        if (!c114619x2.A06) {
                            return;
                        }
                    }
                    int i4 = 0;
                    while (true) {
                        int length = c11729Ec.A0T.length;
                        String[] strArr = A0W;
                        if (strArr[5].length() != strArr[2].length()) {
                            break;
                        }
                        String[] strArr2 = A0W;
                        strArr2[5] = "x3P";
                        strArr2[2] = "8Ip";
                        if (i4 >= length) {
                            C11862Gp c11862Gp = A0H.A04;
                            C114619x A0D = c11729Ec.A0K.A0D();
                            C11862Gp c11862Gp2 = A0D.A04;
                            boolean z2 = A0D.A08.AEo() != -9223372036854775807L;
                            int i5 = 0;
                            while (i5 < c11729Ec.A0T.length) {
                                InterfaceC12985ZA interfaceC12985ZA2 = c11729Ec.A0T[i5];
                                if (c11862Gp.A00(i5)) {
                                    if (z2) {
                                        interfaceC12985ZA2.AGO();
                                    } else if (interfaceC12985ZA2.A9N()) {
                                        continue;
                                    } else {
                                        InterfaceC11858Gl A00 = c11862Gp2.A01.A00(i5);
                                        boolean A002 = c11862Gp2.A00(i5);
                                        boolean z3 = c11729Ec.A0U[i5].A8a() == 5;
                                        C11480AG c11480ag = c11862Gp.A03[i5];
                                        C11480AG c11480ag2 = c11862Gp2.A03[i5];
                                        if (A002) {
                                            boolean equals = c11480ag2.equals(c11480ag);
                                            if (A0W[0].length() != 28) {
                                                throw new RuntimeException();
                                            }
                                            A0W[1] = "RcCRQWS";
                                            if (equals && !z3) {
                                                interfaceC12985ZA2.AFh(A0v(A00), A0D.A0A[i5], A0D.A07());
                                            }
                                        }
                                        interfaceC12985ZA2.AGO();
                                    }
                                }
                                i5++;
                                c11729Ec = this;
                            }
                            return;
                        }
                        InterfaceC12985ZA interfaceC12985ZA3 = c11729Ec.A0T[i4];
                        InterfaceC11769FG interfaceC11769FG2 = A0H.A0A[i4];
                        if (interfaceC12985ZA3.A8S() != interfaceC11769FG2) {
                            return;
                        }
                        if (interfaceC11769FG2 != null && !interfaceC12985ZA3.A8z()) {
                            return;
                        }
                        i4++;
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    public static void A0K() {
        A0V = new byte[]{-59, -8, -17, -48, -20, -31, -7, -27, -14, -55, -19, -16, -20, -55, -18, -12, -27, -14, -18, -31, -20, -74, -23, -32, -63, -35, -46, -22, -42, -29, -70, -34, -31, -35, -70, -33, -27, -42, -29, -33, -46, -35, -85, -71, -46, -33, -43, -35, -42, -29, -85, -55, -48, -47, -44, -53, -48, -55, -126, -49, -57, -43, -43, -61, -55, -57, -43, -126, -43, -57, -48, -42, -126, -61, -56, -42, -57, -44, -126, -44, -57, -50, -57, -61, -43, -57, -112, 5, 42, 48, 33, 46, 42, 29, 40, -36, 46, 49, 42, 48, 37, 41, 33, -36, 33, 46, 46, 43, 46, -22, 23, 51, 40, SignedBytes.MAX_POWER_OF_TWO, 41, 40, 42, 50, -25, 44, 57, 57, 54, 57, -11, -17, 11, 17, 14, -1, 1, -68, 1, 14, 14, 11, 14, -54, -61, -28, -33, -32, -112, -42, -47, -39, -36, -43, -44, -98, -50, -39, -67, -39, -41, -49, -63, -39, -36, -43};
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x01e3, code lost:
        if (r6 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01e9, code lost:
        if (r9.A01() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01eb, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01ed, code lost:
        r14.A05 = r14.A05.A04(r9, A02(r9, r1), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01f9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01fa, code lost:
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0203, code lost:
        if (r6 == false) goto L87;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0S(com.facebook.ads.redexgen.p370X.C114529n r15) throws com.facebook.ads.redexgen.p370X.C114469h {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11729Ec.A0S(com.facebook.ads.redexgen.X.9n):void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0T(com.facebook.ads.redexgen.p370X.C114559q r17) throws com.facebook.ads.redexgen.p370X.C114469h {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11729Ec.A0T(com.facebook.ads.redexgen.X.9q):void");
    }

    static {
        A0K();
    }

    public C11729Ec(InterfaceC12985ZA[] interfaceC12985ZAArr, AbstractC11861Go abstractC11861Go, C11862Gp c11862Gp, InterfaceC114609w interfaceC114609w, boolean z, int i, boolean z2, Handler handler, InterfaceC12986ZB interfaceC12986ZB, InterfaceC11917Hi interfaceC11917Hi) {
        this.A0T = interfaceC12985ZAArr;
        this.A0N = abstractC11861Go;
        this.A0O = c11862Gp;
        this.A0J = interfaceC114609w;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = interfaceC12986ZB;
        this.A0P = interfaceC11917Hi;
        this.A0D = interfaceC114609w.A6T();
        this.A0S = interfaceC114609w.AFs();
        this.A05 = new C11465A1(AbstractC11486AM.A01, -9223372036854775807L, TrackGroupArray.A04, c11862Gp);
        this.A0U = new InterfaceC11479AF[interfaceC12985ZAArr.length];
        for (int i2 = 0; i2 < interfaceC12985ZAArr.length; i2++) {
            interfaceC12985ZAArr[i2].AGS(i2);
            this.A0U[i2] = interfaceC12985ZAArr[i2].A6g();
        }
        this.A0G = new C12988ZD(this, interfaceC11917Hi);
        this.A0R = new ArrayList<>();
        this.A0C = new InterfaceC12985ZA[0];
        this.A0M = new C11485AL();
        this.A0L = new C11484AK();
        abstractC11861Go.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 23), -16);
        this.A0F.start();
        this.A0Q = interfaceC11917Hi.A4y(this.A0F.getLooper(), this);
    }

    private int A00() {
        AbstractC11486AM abstractC11486AM = this.A05.A03;
        if (abstractC11486AM.A0E()) {
            return 0;
        }
        C11485AL A0B = abstractC11486AM.A0B(abstractC11486AM.A05(this.A0B), this.A0M);
        if (A0W[3].length() != 1) {
            A0W[7] = "PHJg0XpOhfW99vW7Kex5sTOYyXlu8lIY";
            return A0B.A00;
        }
        throw new RuntimeException();
    }

    private int A01(int i, AbstractC11486AM abstractC11486AM, AbstractC11486AM abstractC11486AM2) {
        int i2 = i;
        int maxIterations = -1;
        int A00 = abstractC11486AM.A00();
        for (int i3 = 0; i3 < A00 && maxIterations == -1; i3++) {
            i2 = abstractC11486AM.A03(i2, this.A0L, this.A0M, this.A02, this.A0B);
            if (i2 == -1) {
                break;
            }
            maxIterations = abstractC11486AM2.A04(abstractC11486AM.A0A(i2, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(C11746Et c11746Et, long j) throws C114469h {
        return A03(c11746Et, j, this.A0K.A0G() != this.A0K.A0H());
    }

    private long A03(C11746Et c11746Et, long j, boolean z) throws C114469h {
        A0H();
        this.A09 = false;
        A0N(2);
        C114619x A0G = this.A0K.A0G();
        C114619x c114619x = A0G;
        while (true) {
            if (c114619x == null) {
                break;
            } else if (A0t(c11746Et, j, c114619x)) {
                this.A0K.A0S(c114619x);
                break;
            } else {
                c114619x = this.A0K.A0C();
            }
        }
        if (A0G != c114619x || z) {
            for (InterfaceC12985ZA interfaceC12985ZA : this.A0C) {
                A0b(interfaceC12985ZA);
            }
            this.A0C = new InterfaceC12985ZA[0];
            A0G = null;
        }
        if (c114619x != null) {
            A0V(A0G);
            if (c114619x.A05) {
                j = c114619x.A08.AGB(j);
                c114619x.A08.A5W(j - this.A0D, this.A0S);
            }
            A0P(j);
            if (A0W[3].length() == 1) {
                throw new RuntimeException();
            }
            A0W[0] = "LTHjNlNPyjt4lBWFjaooWNRC6TUk";
            A09();
        } else {
            this.A0K.A0O(true);
            A0P(j);
        }
        this.A0Q.AGD(2);
        return j;
    }

    private Pair<Integer, Long> A04(C114559q c114559q, boolean z) {
        int A01;
        AbstractC11486AM abstractC11486AM = this.A05.A03;
        AbstractC11486AM abstractC11486AM2 = c114559q.A02;
        if (abstractC11486AM.A0E()) {
            return null;
        }
        if (abstractC11486AM2.A0E()) {
            abstractC11486AM2 = abstractC11486AM;
        }
        try {
            Pair<Integer, Long> A07 = abstractC11486AM2.A07(this.A0M, this.A0L, c114559q.A00, c114559q.A01);
            if (abstractC11486AM == abstractC11486AM2) {
                return A07;
            }
            int A04 = abstractC11486AM.A04(abstractC11486AM2.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                return Pair.create(Integer.valueOf(A04), (Long) A07.second);
            }
            if (!z || (A01 = A01(((Integer) A07.first).intValue(), abstractC11486AM2, abstractC11486AM)) == -1) {
                return null;
            }
            return A05(abstractC11486AM, abstractC11486AM.A09(A01, this.A0L).A00, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C114599v(abstractC11486AM, c114559q.A00, c114559q.A01);
        }
    }

    private Pair<Integer, Long> A05(AbstractC11486AM abstractC11486AM, int i, long j) {
        return abstractC11486AM.A07(this.A0M, this.A0L, i, j);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C114619x A0F = this.A0K.A0F();
        long nextLoadPositionUs = A0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean AGi = this.A0J.AGi(nextLoadPositionUs - A0F.A08(this.A03), this.A0G.A85().A01);
        A0k(AGi);
        if (AGi) {
            A0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i;
        boolean z;
        int i2;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            i = this.A0I.A01;
            z = this.A0I.A03;
            if (z) {
                C114549p c114549p = this.A0I;
                if (A0W[1].length() == 3) {
                    throw new RuntimeException();
                }
                A0W[1] = "RB7sIkNoTcpey07ODT8uORIhWJm";
                i2 = c114549p.A00;
            } else {
                i2 = -1;
            }
            handler.obtainMessage(0, i, i2, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C114619x A0F = this.A0K.A0F();
        C114619x A0H = this.A0K.A0H();
        if (A0F != null) {
            boolean z = A0F.A06;
            if (A0W[4].charAt(4) == 'c') {
                throw new RuntimeException();
            }
            A0W[7] = "N5Rg0nMtUPutdorU0pcWvntmMyKPkn9g";
            if (!z) {
                if (A0H != null) {
                    C114619x loadingPeriodHolder = A0H.A01;
                    if (loadingPeriodHolder != A0F) {
                        return;
                    }
                }
                for (InterfaceC12985ZA interfaceC12985ZA : this.A0C) {
                    if (!interfaceC12985ZA.A8z()) {
                        return;
                    }
                }
                A0F.A08.AAn();
            }
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C114629y A0I = this.A0K.A0I(this.A03, this.A05);
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0W[3] = "fu6rtQYuGz66gCmV8yC70qEpQFTVY";
            if (A0I == null) {
                this.A07.AAo();
                return;
            }
            InterfaceC12884XU mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A6O(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I);
            mediaPeriod.AEX(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ADK();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C114469h {
        this.A09 = false;
        this.A0G.A05();
        for (InterfaceC12985ZA interfaceC12985ZA : this.A0C) {
            interfaceC12985ZA.start();
        }
    }

    private void A0H() throws C114469h {
        this.A0G.A06();
        for (InterfaceC12985ZA interfaceC12985ZA : this.A0C) {
            A0c(interfaceC12985ZA);
        }
    }

    private void A0J() throws C114469h {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C114619x A0G = this.A0K.A0G();
        long AEo = A0G.A08.AEo();
        if (AEo != -9223372036854775807L) {
            A0P(AEo);
            if (AEo != this.A05.A0A) {
                this.A05 = this.A05.A04(this.A05.A04, AEo, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long A08 = A0G.A08(this.A03);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        C11465A1 c11465a1 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        c11465a1.A09 = A0C;
    }

    private void A0L(float f) {
        InterfaceC11858Gl[] A01;
        for (C114619x A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            C11862Gp c11862Gp = A0E.A04;
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[5] = "3Do";
            strArr2[2] = "at3";
            if (c11862Gp != null) {
                for (InterfaceC11858Gl interfaceC11858Gl : A0E.A04.A01.A01()) {
                    if (interfaceC11858Gl != null) {
                        interfaceC11858Gl.AD5(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws C114469h {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            this.A05 = this.A05.A02(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x005d, code lost:
        if (r18 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005f, code lost:
        if (r6 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0061, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:
        if (r18 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
        r13 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0O(int r17, boolean r18, int r19) throws com.facebook.ads.redexgen.p370X.C114469h {
        /*
            r16 = this;
            r3 = r16
            com.facebook.ads.redexgen.X.9z r0 = r3.A0K
            com.facebook.ads.redexgen.X.9x r4 = r0.A0G()
            com.facebook.ads.redexgen.X.ZA[] r0 = r3.A0T
            r5 = r17
            r7 = r0[r5]
            com.facebook.ads.redexgen.X.ZA[] r0 = r3.A0C
            r0[r19] = r7
            int r0 = r7.A8P()
            if (r0 != 0) goto L79
            com.facebook.ads.redexgen.X.Gp r0 = r4.A04
            com.facebook.ads.redexgen.X.AG[] r0 = r0.A03
            r8 = r0[r5]
            com.facebook.ads.redexgen.X.Gp r0 = r4.A04
            com.facebook.ads.redexgen.X.Gm r0 = r0.A01
            com.facebook.ads.redexgen.X.Gl r0 = r0.A00(r5)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r9 = A0v(r0)
            boolean r0 = r3.A08
            if (r0 == 0) goto L8b
            com.facebook.ads.redexgen.X.A1 r0 = r3.A05
            int r6 = r0.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C11729Ec.A0W
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11729Ec.A0W
            java.lang.String r1 = "QRz84tIq3wllCeb1capmh87EbVgo0fYM"
            r0 = 4
            r2[r0] = r1
            r0 = 3
            if (r6 != r0) goto L8b
            r6 = 1
        L49:
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C11729Ec.A0W
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 28
            if (r1 == r0) goto L7a
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11729Ec.A0W
            java.lang.String r1 = "nWHC8GobiUTV1BRDhLkuPrvX5"
            r0 = 1
            r2[r0] = r1
            if (r18 != 0) goto L89
        L5f:
            if (r6 == 0) goto L89
            r13 = 1
        L62:
            com.facebook.ads.redexgen.X.FG[] r0 = r4.A0A
            r10 = r0[r5]
            long r11 = r3.A03
            long r14 = r4.A07()
            r7.A5r(r8, r9, r10, r11, r13, r14)
            com.facebook.ads.redexgen.X.ZD r0 = r3.A0G
            r0.A09(r7)
            if (r6 == 0) goto L79
            r7.start()
        L79:
            return
        L7a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11729Ec.A0W
            java.lang.String r1 = "o7g"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "UGX"
            r0 = 2
            r2[r0] = r1
            if (r18 != 0) goto L89
            goto L5f
        L89:
            r13 = 0
            goto L62
        L8b:
            r6 = 0
            goto L49
        L8d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11729Ec.A0O(int, boolean, int):void");
    }

    private void A0P(long j) throws C114469h {
        if (this.A0K.A0P()) {
            j = this.A0K.A0G().A09(j);
        }
        this.A03 = j;
        this.A0G.A07(this.A03);
        for (InterfaceC12985ZA interfaceC12985ZA : this.A0C) {
            interfaceC12985ZA.AFr(this.A03);
            if (A0W[7].charAt(28) == 'w') {
                throw new RuntimeException();
            }
            A0W[6] = "Dkk1xe1nETG6SQ7gXcWE";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00bc, code lost:
        if (r5 >= r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00be, code lost:
        r0 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00c0, code lost:
        if (r0 != r4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00c6, code lost:
        if (r3.A01 > r8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00c8, code lost:
        r0 = r7.A00;
        r7.A00 = r0 + 1;
        r1 = r7.A00;
        r0 = r7.A0R.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00d6, code lost:
        if (r1 >= r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00d8, code lost:
        r1 = r7.A0R;
        r0 = r7.A00;
        r3 = r1.get(r0);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00e3, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00e5, code lost:
        if (r5 >= r4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0Q(long r8, long r10) throws com.facebook.ads.redexgen.p370X.C114469h {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11729Ec.A0Q(long, long):void");
    }

    private void A0R(long j, long j2) {
        this.A0Q.AFb(2);
        this.A0Q.AGE(2, j + j2);
    }

    public static /* synthetic */ void A0U(C11729Ec c11729Ec, C11477AD c11477ad) throws C114469h {
        c11729Ec.A0X(c11477ad);
    }

    private void A0V(C114619x c114619x) throws C114469h {
        C114619x A0G = this.A0K.A0G();
        if (A0G == null || c114619x == A0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        for (int i2 = 0; i2 < this.A0T.length; i2++) {
            InterfaceC12985ZA interfaceC12985ZA = this.A0T[i2];
            zArr[i2] = interfaceC12985ZA.A8P() != 0;
            if (A0G.A04.A00(i2)) {
                i++;
            }
            if (zArr[i2] && (!A0G.A04.A00(i2) || (interfaceC12985ZA.A9N() && interfaceC12985ZA.A8S() == c114619x.A0A[i2]))) {
                A0b(interfaceC12985ZA);
            }
        }
        this.A05 = this.A05.A05(A0G.A03, A0G.A04);
        A0p(zArr, i);
    }

    private void A0W(C11466A2 c11466a2) {
        this.A0G.AGa(c11466a2);
    }

    public void A0X(C11477AD c11477ad) throws C114469h {
        if (c11477ad.A0D()) {
            return;
        }
        try {
            c11477ad.A04().A8t(c11477ad.A00(), c11477ad.A09());
        } finally {
            c11477ad.A0A(true);
        }
    }

    private void A0Y(C11477AD c11477ad) throws C114469h {
        if (c11477ad.A02() == -9223372036854775807L) {
            A0Z(c11477ad);
            return;
        }
        if (this.A07 != null) {
            int i = this.A01;
            if (A0W[0].length() != 28) {
                throw new RuntimeException();
            }
            A0W[1] = "o1ZfKzJk47hV";
            if (i <= 0) {
                C114539o c114539o = new C114539o(c11477ad);
                if (!A0r(c114539o)) {
                    if (A0W[7].charAt(28) != 'w') {
                        A0W[3] = "aTDMkEWwCUERProrJoKbugoPR0RLmehL";
                        c11477ad.A0A(false);
                        return;
                    }
                    A0W[7] = "nEAZXjO4i2eVoKfOQOzMBl4A0pmuVndx";
                    c11477ad.A0A(false);
                    return;
                }
                ArrayList<C114539o> arrayList = this.A0R;
                if (A0W[7].charAt(28) == 'w') {
                    A0W[7] = "fj1HQu0C9Tc3paKg3KNI1jKNCUFeknU2";
                    arrayList.add(c114539o);
                    Collections.sort(this.A0R);
                    return;
                }
                A0W[6] = "0jg7HAqbvnSBdqVDarqZ";
                arrayList.add(c114539o);
                Collections.sort(this.A0R);
                return;
            }
        }
        this.A0R.add(new C114539o(c11477ad));
    }

    private void A0Z(C11477AD c11477ad) throws C114469h {
        if (c11477ad.A03().getLooper() == this.A0Q.A7j()) {
            A0X(c11477ad);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AGD(2);
                return;
            }
            return;
        }
        this.A0Q.AB1(15, c11477ad).sendToTarget();
    }

    private void A0a(final C11477AD c11477ad) {
        c11477ad.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9m
            public static byte[] A02;
            public static String[] A03 = {"vvB9T8WK7bT4nFgbnm6TlGuNwpdmRtb5", "Hfw1oyg0BzWOVhb4zu8ELKkOELcM4f2B", "gmAcFU6mn3n0PFSsnO8fNJkU01ktZa8U", "xgpG2bMc1aVEQfTVOGXM8sfGOtJMcFPH", "2GhavpyJFuEpD", "Q3SxFnadra2JweXV0TQ7pCIkPNwW6CrH", "wegMd5NqqvgJ45W9ANASZrnEtp1A2mXR", "ALPTKzTzzHlEJ12cQtwgMkt"};

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    int i5 = (copyOfRange[i4] ^ i3) ^ 5;
                    String[] strArr = A03;
                    if (strArr[3].charAt(9) != strArr[5].charAt(9)) {
                        throw new RuntimeException();
                    }
                    A03[4] = "6EUX3tXbFxVZ50ys6tGf1eJDZb";
                    copyOfRange[i4] = (byte) i5;
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{103, 90, 77, 114, 78, 67, 91, 71, 80, 107, 79, 82, 78, 107, 76, 86, 71, 80, 76, 67, 78, 70, 125, 118, 107, 99, 118, 112, 103, 118, 119, 51, 118, 97, 97, 124, 97, 51, 119, 118, Byte.MAX_VALUE, 122, 101, 118, 97, 122, 125, 116, 51, 126, 118, 96, 96, 114, 116, 118, 51, 124, 125, 51, 118, 107, 103, 118, 97, 125, 114, Byte.MAX_VALUE, 51, 103, 123, 97, 118, 114, 119, 61};
            }

            static {
                A01();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (AbstractC12078KQ.A02(this)) {
                    return;
                }
                try {
                    try {
                        C11729Ec.A0U(C11729Ec.this, c11477ad);
                    } catch (C114469h e) {
                        Log.e(A00(0, 21, 39), A00(21, 55, 22), e);
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    AbstractC12078KQ.A00(th, this);
                }
            }
        });
    }

    private void A0b(InterfaceC12985ZA interfaceC12985ZA) throws C114469h {
        this.A0G.A08(interfaceC12985ZA);
        A0c(interfaceC12985ZA);
        interfaceC12985ZA.A5U();
    }

    private void A0c(InterfaceC12985ZA interfaceC12985ZA) throws C114469h {
        if (interfaceC12985ZA.A8P() == 2) {
            interfaceC12985ZA.stop();
        }
    }

    private void A0d(C11482AI c11482ai) {
        this.A06 = c11482ai;
    }

    private void A0e(InterfaceC12884XU interfaceC12884XU) {
        if (!this.A0K.A0T(interfaceC12884XU)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(InterfaceC12884XU interfaceC12884XU) throws C114469h {
        if (!this.A0K.A0T(interfaceC12884XU)) {
            return;
        }
        C114619x A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A85().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            C114619x loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11770FH
    /* renamed from: A0g */
    public final void ABd(InterfaceC12884XU interfaceC12884XU) {
        this.A0Q.AB1(10, interfaceC12884XU).sendToTarget();
    }

    private void A0h(InterfaceC11748Ev interfaceC11748Ev, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = interfaceC11748Ev;
        A0N(2);
        interfaceC11748Ev.AEa(this.A0H, true, this);
        this.A0Q.AGD(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, C11862Gp c11862Gp) {
        this.A0J.ADq(this.A0T, trackGroupArray, c11862Gp.A01);
    }

    private void A0j(boolean z) throws C114469h {
        C11746Et c11746Et = this.A0K.A0G().A02.A04;
        long A03 = A03(c11746Et, this.A05.A0A, true);
        if (A03 != this.A05.A0A) {
            this.A05 = this.A05.A04(c11746Et, A03, this.A05.A01);
            if (z) {
                C114549p c114549p = this.A0I;
                if (A0W[7].charAt(28) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "WBZ5bLJSEJN5yb0YmqU0";
                c114549p.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws C114469h {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AGD(2);
        } else if (this.A05.A00 != 2) {
        } else {
            this.A0Q.AGD(2);
        }
    }

    private void A0m(boolean z) throws C114469h {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ADi();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        Object obj;
        long j;
        C11862Gp c11862Gp;
        this.A0Q.AFb(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (InterfaceC12985ZA interfaceC12985ZA : this.A0C) {
            try {
                A0b(interfaceC12985ZA);
            } catch (C114469h | RuntimeException e) {
                Log.e(A06(0, 21, 38), A06(138, 12, 22), e);
            }
        }
        this.A0C = new InterfaceC12985ZA[0];
        this.A0K.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(AbstractC11486AM.A01);
            Iterator<C114539o> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AbstractC11486AM abstractC11486AM = z3 ? AbstractC11486AM.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        C11746Et c11746Et = z2 ? new C11746Et(A00()) : this.A05.A04;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        TrackGroupArray trackGroupArray = z3 ? TrackGroupArray.A04 : this.A05.A05;
        if (z3) {
            c11862Gp = this.A0O;
        } else {
            c11862Gp = this.A05.A06;
        }
        this.A05 = new C11465A1(abstractC11486AM, obj, c11746Et, j, j2, i, false, trackGroupArray, c11862Gp);
        if (z) {
            InterfaceC11748Ev interfaceC11748Ev = this.A07;
            if (A0W[7].charAt(28) == 'w') {
                throw new RuntimeException();
            }
            A0W[0] = "lRj2b7Ec0CIz5iiX5eE2KmWgCFvN";
            if (interfaceC11748Ev != null) {
                this.A07.AF4(this);
                this.A07 = null;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0p(boolean[] r9, int r10) throws com.facebook.ads.redexgen.p370X.C114469h {
        /*
            r8 = this;
            com.facebook.ads.redexgen.X.ZA[] r0 = new com.facebook.ads.redexgen.p370X.InterfaceC12985ZA[r10]
            r8.A0C = r0
            r7 = 0
            com.facebook.ads.redexgen.X.9z r0 = r8.A0K
            com.facebook.ads.redexgen.X.9x r6 = r0.A0G()
            r5 = 0
        Lc:
            com.facebook.ads.redexgen.X.ZA[] r0 = r8.A0T
            int r0 = r0.length
            if (r5 >= r0) goto L3f
            com.facebook.ads.redexgen.X.Gp r0 = r6.A04
            boolean r0 = r0.A00(r5)
            if (r0 == 0) goto L36
            boolean r4 = r9[r5]
            int r3 = r7 + 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C11729Ec.A0W
            r0 = 4
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 99
            if (r1 == r0) goto L39
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11729Ec.A0W
            java.lang.String r1 = "b6AxkSDoOdacq7WM3wR6"
            r0 = 6
            r2[r0] = r1
            r8.A0O(r5, r4, r7)
            r7 = r3
        L36:
            int r5 = r5 + 1
            goto Lc
        L39:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11729Ec.A0p(boolean[], int):void");
    }

    private boolean A0q() {
        C114619x A0G = this.A0K.A0G();
        long j = A0G.A02.A01;
        if (j != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j) {
                C114619x playingPeriodHolder = A0G.A01;
                if (playingPeriodHolder != null) {
                    C114619x playingPeriodHolder2 = A0G.A01;
                    if (!playingPeriodHolder2.A06) {
                        C114619x playingPeriodHolder3 = A0G.A01;
                        if (playingPeriodHolder3.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C114539o c114539o) {
        if (c114539o.A02 == null) {
            Pair<Integer, Long> A04 = A04(new C114559q(c114539o.A03.A08(), c114539o.A03.A01(), AbstractC114409b.A00(c114539o.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            c114539o.A01(((Integer) A04.first).intValue(), ((Long) A04.second).longValue(), this.A05.A03.A0A(((Integer) A04.first).intValue(), this.A0L, true).A03);
        } else {
            int A042 = this.A05.A03.A04(c114539o.A02);
            if (A042 == -1) {
                return false;
            }
            c114539o.A00 = A042;
        }
        return true;
    }

    private boolean A0s(InterfaceC12985ZA interfaceC12985ZA) {
        C114619x A0H = this.A0K.A0H();
        C114619x readingPeriodHolder = A0H.A01;
        if (readingPeriodHolder != null) {
            C114619x readingPeriodHolder2 = A0H.A01;
            if (readingPeriodHolder2.A06 && interfaceC12985ZA.A8z()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(C11746Et c11746Et, long j, C114619x c114619x) {
        if (c11746Et.equals(c114619x.A02.A04) && c114619x.A06) {
            this.A05.A03.A09(c114619x.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j);
            if (A04 != -1) {
                int nextAdGroupIndex = (this.A0L.A09(A04) > c114619x.A02.A02 ? 1 : (this.A0L.A09(A04) == c114619x.A02.A02 ? 0 : -1));
                if (nextAdGroupIndex == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean A0u(boolean z) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z) {
            return false;
        }
        if (this.A05.A08) {
            C114619x A0F = this.A0K.A0F();
            long A0C = A0F.A0C(!A0F.A02.A05);
            if (A0C != Long.MIN_VALUE) {
                InterfaceC114609w interfaceC114609w = this.A0J;
                long A08 = A0C - A0F.A08(this.A03);
                String[] strArr = A0W;
                if (strArr[5].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0W[6] = "2cwTC9SumZz3To3yr3ji";
                if (!interfaceC114609w.AGl(A08, this.A0G.A85().A01, this.A09)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static Format[] A0v(InterfaceC11858Gl interfaceC11858Gl) {
        int length = interfaceC11858Gl != null ? interfaceC11858Gl.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            Format A7U = interfaceC11858Gl.A7U(i);
            if (A0W[3].length() == 1) {
                throw new RuntimeException();
            }
            A0W[6] = "MMfeLMq0kgXNQLSglZMb";
            formatArr[i] = A7U;
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:36:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A0x() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.facebook.ads.redexgen.X.Hs r1 = r2.A0Q     // Catch: java.lang.Throwable -> L23
            r0 = 7
            r1.AGD(r0)     // Catch: java.lang.Throwable -> L23
            r1 = 0
        Le:
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L18
            r2.wait()     // Catch: java.lang.InterruptedException -> L16 java.lang.Throwable -> L23
            goto Le
        L16:
            r1 = 1
            goto Le
        L18:
            if (r1 == 0) goto L21
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r0.interrupt()     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11729Ec.A0x():void");
    }

    public final void A0y(AbstractC11486AM abstractC11486AM, int i, long j) {
        this.A0Q.AB1(3, new C114559q(abstractC11486AM, i, j)).sendToTarget();
    }

    public final void A0z(InterfaceC11748Ev interfaceC11748Ev, boolean z, boolean z2) {
        this.A0Q.AB0(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC11748Ev).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.AAz(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.AAz(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC114439e
    public final void AD4(C11466A2 c11466a2) {
        this.A0E.obtainMessage(1, c11466a2).sendToTarget();
        A0L(c11466a2.A01);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12885XV
    public final void ADC(InterfaceC12884XU interfaceC12884XU) {
        this.A0Q.AB1(9, interfaceC12884XU).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11747Eu
    public final void ADd(InterfaceC11748Ev interfaceC11748Ev, AbstractC11486AM abstractC11486AM, Object obj) {
        this.A0Q.AB1(8, new C114529n(interfaceC11748Ev, abstractC11486AM, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11475AB
    public final synchronized void AGF(C11477AD c11477ad) {
        if (this.A0A) {
            Log.w(A06(0, 21, 38), A06(50, 37, 8));
            c11477ad.A0A(false);
            return;
        }
        this.A0Q.AB1(14, c11477ad).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 38);
        try {
            switch (message.what) {
                case 0:
                    A0h((InterfaceC11748Ev) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C114559q) message.obj);
                    break;
                case 4:
                    A0W((C11466A2) message.obj);
                    break;
                case 5:
                    A0d((C11482AI) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C114529n) message.obj);
                    break;
                case 9:
                    A0f((InterfaceC12884XU) message.obj);
                    break;
                case 10:
                    A0e((InterfaceC12884XU) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((C11477AD) message.obj);
                    break;
                case 15:
                    A0a((C11477AD) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C114469h e) {
            Log.e(A06, A06(110, 15, 109), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(A06, A06(125, 13, 66), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, C114469h.A00(e2)).sendToTarget();
            A0A();
        } catch (RuntimeException e3) {
            Log.e(A06, A06(87, 23, 98), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, C114469h.A02(e3)).sendToTarget();
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0W[4] = "bcAD6CyDV16TZBS92I3KgCtMo20e3K69";
            A0A();
        }
        return true;
    }
}
