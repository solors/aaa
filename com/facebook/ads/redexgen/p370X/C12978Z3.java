package com.facebook.ads.redexgen.p370X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import com.google.common.primitives.SignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Z3 */
/* loaded from: assets/audience_network.dex */
public final class C12978Z3 implements InterfaceC11519At {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s = {"t4Cm734G1ZBoSBzvfJuYh", "Dmy7gQRb9w8", "l4mYs0AOLGPZCQ2ag", "2Zh3YzuvljTLmHNyZBM74", "UUZ6L1FPfPRElr6W9S6mi", "GbPTI", "DRH4d", "cvuwXH0lqzE"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;
    public AudioTrack A0N;
    public C11466A2 A0O;
    public C11466A2 A0P;
    public C11498AY A0Q;
    public InterfaceC11517Ar A0R;
    public ByteBuffer A0S;
    public ByteBuffer A0T;
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public InterfaceC11506Ag[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;
    public final C11499AZ A0g;
    public final C11525Az A0h;
    public final C12981Z6 A0i;
    public final InterfaceC11528B2 A0j;
    public final C12972Yx A0k;
    public final ArrayDeque<C11530B4> A0l;
    public final boolean A0m;
    public final InterfaceC11506Ag[] A0n;
    public final InterfaceC11506Ag[] A0o;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private AudioTrack A0F(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0r, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{76, SignedBytes.MAX_POWER_OF_TWO, 7, 15, 20, SignedBytes.MAX_POWER_OF_TWO, 5, 49, 32, 45, 43, 16, 54, 37, 39, 47, 73, 100, 126, 110, 98, 99, 121, 100, 99, 120, 100, 121, 116, 45, 105, 104, 121, 104, 110, 121, 104, 105, 45, 86, 104, 117, 125, 104, 110, 121, 104, 105, 45, 33, 57, 38, 43, 38, 46, 47, 24, 14, 24, 9, 9, 20, 19, 26, 93, 14, 9, 28, 17, 17, 24, 25, 93, 28, 8, 25, 20, 18, 93, 9, 15, 28, 30, 22, 47, 20, 31, 2, 10, 31, 25, 14, 31, 30, 90, 27, 15, 30, 19, 21, 90, 31, 20, 25, 21, 30, 19, 20, 29, SignedBytes.MAX_POWER_OF_TWO, 90, 61, 6, 27, 29, 24, 24, 7, 26, 28, 13, 12, 72, 11, 0, 9, 6, 6, 13, 4, 72, 11, 7, 29, 6, 28, 82, 72, 98, 30, 23, 11, 12, 29, 10, 91, 72, 90, 72};
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x0171, code lost:
        if (r14 != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0173, code lost:
        r10.A02 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0175, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0182, code lost:
        if (r14 != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0187, code lost:
        if (r10.A0X == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0189, code lost:
        r2 = android.media.AudioTrack.getMinBufferSize(r13, r5, r10.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0190, code lost:
        if (r2 == (-2)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0192, code lost:
        com.facebook.ads.redexgen.p370X.AbstractC11914Hf.A04(r4);
        r10.A02 = com.facebook.ads.redexgen.p370X.AbstractC11953IK.A06(r2 * 4, ((int) A07(250000)) * r10.A09, (int) java.lang.Math.max(r2, A07(750000) * r10.A09));
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01ba, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01bf, code lost:
        if (r10.A08 == 5) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01c4, code lost:
        if (r10.A08 != 6) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01c6, code lost:
        r10.A02 = 20480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01ce, code lost:
        if (r10.A08 != 7) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x01d0, code lost:
        r10.A02 = 49152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01d6, code lost:
        r10.A02 = 294912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:?, code lost:
        return;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4l(int r11, int r12, int r13, int r14, int[] r15, int r16, int r17) throws com.facebook.ads.redexgen.p370X.C11515Ap {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12978Z3.A4l(int, int, int, int, int[], int, int):void");
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public C12978Z3(C11499AZ c11499az, InterfaceC11528B2 interfaceC11528B2, boolean z) {
        this.A0g = c11499az;
        this.A0j = (InterfaceC11528B2) AbstractC11914Hf.A01(interfaceC11528B2);
        this.A0m = z;
        this.A0f = new ConditionVariable(true);
        this.A0h = new C11525Az(new C12979Z4(this, null));
        this.A0i = new C12981Z6();
        this.A0k = new C12972Yx();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C12975Z0(), this.A0i, this.A0k);
        Collections.addAll(arrayList, interfaceC11528B2.A6S());
        this.A0o = (InterfaceC11506Ag[]) arrayList.toArray(new InterfaceC11506Ag[arrayList.size()]);
        this.A0n = new InterfaceC11506Ag[]{new C12977Z2()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = C11498AY.A04;
        this.A01 = 0;
        this.A0P = C11466A2.A05;
        this.A04 = -1;
        this.A0d = new InterfaceC11506Ag[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public C12978Z3(C11499AZ c11499az, InterfaceC11506Ag[] interfaceC11506AgArr) {
        this(c11499az, interfaceC11506AgArr, false);
    }

    public C12978Z3(C11499AZ c11499az, InterfaceC11506Ag[] interfaceC11506AgArr, boolean z) {
        this(c11499az, new C12980Z5(interfaceC11506AgArr), z);
    }

    public static int A00(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return AbstractC11532B6.A00(byteBuffer);
        }
        if (i == 5) {
            return AbstractC11495AV.A00();
        }
        if (i == 6) {
            return AbstractC11495AV.A03(byteBuffer);
        }
        if (i == 14) {
            int A02 = AbstractC11495AV.A02(byteBuffer);
            if (A02 == -1) {
                return 0;
            }
            int syncframeOffset = AbstractC11495AV.A04(byteBuffer, A02);
            return syncframeOffset * 16;
        }
        throw new IllegalStateException(A0I(84, 27, 82) + i);
    }

    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.A0S == null) {
            this.A0S = ByteBuffer.allocate(16);
            this.A0S.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i);
            this.A0S.putLong(8, 1000 * j);
            this.A0S.position(0);
            this.A03 = i;
        }
        int result = this.A0S.remaining();
        if (result > 0) {
            int write = audioTrack.write(this.A0S, result, 1);
            if (write < 0) {
                this.A03 = 0;
                String[] strArr = A0s;
                String str = strArr[5];
                String str2 = strArr[6];
                int length = str.length();
                int avSyncHeaderBytesRemaining = str2.length();
                if (length != avSyncHeaderBytesRemaining) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0s;
                strArr2[2] = "wdvofg3jRCjWXCeFa";
                strArr2[0] = "UgNyGUdkLeiqvUWu5ibBo";
                return write;
            } else if (write < result) {
                return 0;
            }
        }
        int A01 = A01(audioTrack, byteBuffer, i);
        if (A01 < 0) {
            this.A03 = 0;
            return A01;
        }
        int avSyncHeaderBytesRemaining2 = this.A03;
        this.A03 = avSyncHeaderBytesRemaining2 - A01;
        return A01;
    }

    public long A03() {
        if (this.A0X) {
            long j = this.A0J;
            int i = this.A0B;
            String[] strArr = A0s;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[3] = "MPJfaYuGd4augtfmCZOH8";
            strArr2[4] = "0BEM3uVvtYbq56GldupHk";
            return j / i;
        }
        return this.A0I;
    }

    public long A04() {
        return this.A0X ? this.A0L / this.A09 : this.A0K;
    }

    private long A05(long j) {
        return A08(this.A0j.A8O()) + j;
    }

    private long A06(long j) {
        C11466A2 c11466a2;
        long j2;
        long j3;
        long j4;
        C11530B4 c11530b4 = null;
        while (!this.A0l.isEmpty()) {
            C11530B4 checkpoint = this.A0l.getFirst();
            j4 = checkpoint.A01;
            if (j < j4) {
                break;
            }
            c11530b4 = this.A0l.remove();
        }
        if (c11530b4 != null) {
            c11466a2 = c11530b4.A02;
            this.A0P = c11466a2;
            j2 = c11530b4.A01;
            this.A0G = j2;
            j3 = c11530b4.A00;
            this.A0F = j3 - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A7m(j - this.A0G);
        }
        return this.A0F + AbstractC11953IK.A0C(j - this.A0G, this.A0P.A01);
    }

    private long A07(long j) {
        return (this.A0A * j) / 1000000;
    }

    private long A08(long j) {
        return (1000000 * j) / this.A0A;
    }

    private long A09(long j) {
        return (1000000 * j) / this.A06;
    }

    private AudioTrack A0D() {
        AudioAttributes A00;
        int audioSessionId;
        if (this.A0b) {
            A00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            C11498AY c11498ay = this.A0Q;
            String[] strArr = A0s;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[3] = "goXRCtH77jRt5o2HiRu2K";
            strArr2[4] = "TssJQhAfwC6lhctx3HZdA";
            A00 = c11498ay.A00();
        }
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        if (this.A01 != 0) {
            audioSessionId = this.A01;
        } else {
            audioSessionId = 0;
        }
        return new AudioTrack(A00, build, this.A02, 1, audioSessionId);
    }

    private AudioTrack A0E() throws C11516Aq {
        AudioTrack audioTrack;
        if (AbstractC11953IK.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int A03 = AbstractC11953IK.A03(this.A0Q.A03);
            int streamType = this.A01;
            if (streamType == 0) {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1, this.A01);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new C11516Aq(state, this.A0A, this.A07, this.A02);
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0J() {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.Ag[] r0 = r3.A0d
            int r0 = r0.length
            if (r2 >= r0) goto L18
            com.facebook.ads.redexgen.X.Ag[] r0 = r3.A0d
            r0 = r0[r2]
            r0.flush()
            java.nio.ByteBuffer[] r1 = r3.A0e
            java.nio.ByteBuffer r0 = r0.A7u()
            r1[r2] = r0
            int r2 = r2 + 1
            goto L1
        L18:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12978Z3.A0J():void");
    }

    private void A0K() throws C11516Aq {
        C11466A2 c11466a2;
        this.A0f.block();
        this.A0M = A0E();
        int audioSessionId = this.A0M.getAudioSessionId();
        if (A0p && AbstractC11953IK.A02 < 21) {
            if (this.A0N != null) {
                int audioSessionId2 = this.A0N.getAudioSessionId();
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        int audioSessionId3 = this.A01;
        if (audioSessionId3 != audioSessionId) {
            this.A01 = audioSessionId;
            if (this.A0R != null) {
                this.A0R.ABI(audioSessionId);
            }
        }
        if (this.A0V) {
            c11466a2 = this.A0j.A3x(this.A0P);
        } else {
            c11466a2 = C11466A2.A05;
        }
        this.A0P = c11466a2;
        A0N();
        C11525Az c11525Az = this.A0h;
        AudioTrack audioTrack = this.A0M;
        int i = this.A08;
        int i2 = this.A09;
        int audioSessionId4 = this.A02;
        c11525Az.A0G(audioTrack, i, i2, audioSessionId4);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new C11527B1(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0U()) {
            return;
        }
        if (AbstractC11953IK.A02 >= 21) {
            A0Q(this.A0M, this.A00);
        } else {
            A0R(this.A0M, this.A00);
        }
    }

    private void A0N() {
        InterfaceC11506Ag[] A0V;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC11506Ag interfaceC11506Ag : A0V()) {
            String[] strArr = A0s;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[3] = "vBclGACfTssbiJ4n8qhCW";
            strArr2[4] = "IqJQjehZlhuyKPOSbJGKP";
            if (interfaceC11506Ag.A9L()) {
                arrayList.add(interfaceC11506Ag);
            } else {
                interfaceC11506Ag.flush();
            }
        }
        int count = arrayList.size();
        this.A0d = (InterfaceC11506Ag[]) arrayList.toArray(new InterfaceC11506Ag[count]);
        this.A0e = new ByteBuffer[count];
        A0J();
    }

    private void A0P(long j) throws C11518As {
        ByteBuffer input;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                int count = i - 1;
                input = this.A0e[count];
            } else {
                input = this.A0T != null ? this.A0T : InterfaceC11506Ag.A00;
            }
            if (i == length) {
                A0S(input, j);
            } else {
                InterfaceC11506Ag interfaceC11506Ag = this.A0d[i];
                interfaceC11506Ag.AEi(input);
                ByteBuffer A7u = interfaceC11506Ag.A7u();
                this.A0e[i] = A7u;
                if (A7u.hasRemaining()) {
                    i++;
                }
            }
            if (input.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    public static void A0Q(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0R(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00a1, code lost:
        if (r0 < r2) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0S(java.nio.ByteBuffer r11, long r12) throws com.facebook.ads.redexgen.p370X.C11518As {
        /*
            r10 = this;
            r6 = r11
            boolean r0 = r6.hasRemaining()
            if (r0 != 0) goto L8
            return
        L8:
            java.nio.ByteBuffer r0 = r10.A0U
            r5 = 1
            r3 = 21
            r4 = 0
            if (r0 == 0) goto L90
            java.nio.ByteBuffer r0 = r10.A0U
            if (r0 != r6) goto L8e
            r0 = 1
        L15:
            com.facebook.ads.redexgen.p370X.AbstractC11914Hf.A03(r0)
        L18:
            int r7 = r6.remaining()
            r4 = 0
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11953IK.A02
            if (r0 >= r3) goto L6c
            com.facebook.ads.redexgen.X.Az r2 = r10.A0h
            long r0 = r10.A0L
            int r0 = r2.A0B(r0)
            if (r0 <= 0) goto L48
            int r3 = java.lang.Math.min(r7, r0)
            android.media.AudioTrack r2 = r10.A0M
            byte[] r1 = r10.A0c
            int r0 = r10.A0C
            int r4 = r2.write(r1, r0, r3)
            if (r4 <= 0) goto L48
            int r0 = r10.A0C
            int r0 = r0 + r4
            r10.A0C = r0
            int r0 = r6.position()
            int r0 = r0 + r4
            r6.position(r0)
        L48:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.A0E = r0
            if (r4 < 0) goto Lb7
            boolean r0 = r10.A0X
            if (r0 == 0) goto L5a
            long r2 = r10.A0L
            long r0 = (long) r4
            long r2 = r2 + r0
            r10.A0L = r2
        L5a:
            if (r4 != r7) goto L6b
            boolean r0 = r10.A0X
            if (r0 != 0) goto L68
            long r2 = r10.A0K
            int r0 = r10.A05
            long r0 = (long) r0
            long r2 = r2 + r0
            r10.A0K = r2
        L68:
            r0 = 0
            r10.A0U = r0
        L6b:
            return
        L6c:
            boolean r0 = r10.A0b
            if (r0 == 0) goto L87
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r12
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L85
        L7a:
            com.facebook.ads.redexgen.p370X.AbstractC11914Hf.A04(r5)
            android.media.AudioTrack r5 = r10.A0M
            r4 = r10
            int r4 = r4.A02(r5, r6, r7, r8)
            goto L48
        L85:
            r5 = 0
            goto L7a
        L87:
            android.media.AudioTrack r0 = r10.A0M
            int r4 = A01(r0, r6, r7)
            goto L48
        L8e:
            r0 = 0
            goto L15
        L90:
            r10.A0U = r6
            int r0 = com.facebook.ads.redexgen.p370X.AbstractC11953IK.A02
            if (r0 >= r3) goto L18
            int r2 = r6.remaining()
            byte[] r0 = r10.A0c
            if (r0 == 0) goto La3
            byte[] r0 = r10.A0c
            int r0 = r0.length
            if (r0 >= r2) goto La7
        La3:
            byte[] r0 = new byte[r2]
            r10.A0c = r0
        La7:
            int r1 = r6.position()
            byte[] r0 = r10.A0c
            r6.get(r0, r4, r2)
            r6.position(r1)
            r10.A0C = r4
            goto L18
        Lb7:
            com.facebook.ads.redexgen.X.As r0 = new com.facebook.ads.redexgen.X.As
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12978Z3.A0S(java.nio.ByteBuffer, long):void");
    }

    private boolean A0T() throws C11518As {
        boolean z = false;
        if (this.A04 == -1) {
            boolean audioProcessorNeedsEndOfStream = this.A0Z;
            this.A04 = audioProcessorNeedsEndOfStream ? 0 : this.A0d.length;
            z = true;
        }
        while (true) {
            int i = this.A04;
            int length = this.A0d.length;
            String[] strArr = A0s;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "dPL4LqCPelyuF995w";
            strArr2[0] = "Xq2i67i3Xt4f88z4gHihD";
            if (i < length) {
                InterfaceC11506Ag audioProcessor = this.A0d[this.A04];
                if (z) {
                    audioProcessor.AEh();
                }
                A0P(-9223372036854775807L);
                if (!audioProcessor.A9Q()) {
                    return false;
                }
                z = true;
                this.A04++;
            } else {
                if (this.A0U != null) {
                    A0S(this.A0U, -9223372036854775807L);
                    if (this.A0U != null) {
                        return false;
                    }
                }
                this.A04 = -1;
                return true;
            }
        }
    }

    private boolean A0U() {
        return this.A0M != null;
    }

    private InterfaceC11506Ag[] A0V() {
        if (this.A0a) {
            return this.A0n;
        }
        return this.A0o;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void A5V() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void A5s(int i) {
        AbstractC11914Hf.A04(AbstractC11953IK.A02 >= 21);
        if (!this.A0b || this.A01 != i) {
            this.A0b = true;
            this.A01 = i;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final long A72(boolean z) {
        if (A0U()) {
            int i = this.A0D;
            String[] strArr = A0s;
            if (strArr[2].length() != strArr[0].length()) {
                String[] strArr2 = A0s;
                strArr2[2] = "qIZGNUBvwPES78nSd";
                strArr2[0] = "zLcsMXgFzMqXbvyn8iNvP";
                if (i == 0) {
                    return Long.MIN_VALUE;
                }
                long A0C = this.A0h.A0C(z);
                long positionUs = A04();
                return this.A0H + A05(A06(Math.min(A0C, A08(positionUs))));
            }
            throw new RuntimeException();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final C11466A2 A85() {
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final boolean A8p(ByteBuffer byteBuffer, long j) throws C11516Aq, C11518As {
        AbstractC11914Hf.A03(this.A0T == null || byteBuffer == this.A0T);
        if (!A0U()) {
            A0K();
            if (this.A0Y) {
                AEV();
            }
        }
        if (this.A0h.A0L(A04())) {
            ByteBuffer byteBuffer2 = this.A0T;
            String A0I = A0I(6, 10, 108);
            if (byteBuffer2 == null) {
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                if (!this.A0X && this.A05 == 0) {
                    this.A05 = A00(this.A08, byteBuffer);
                    if (this.A05 == 0) {
                        return true;
                    }
                }
                if (this.A0O != null) {
                    if (!A0T()) {
                        return false;
                    }
                    C11466A2 c11466a2 = this.A0O;
                    this.A0O = null;
                    this.A0l.add(new C11530B4(this.A0j.A3x(c11466a2), Math.max(0L, j), A08(A04()), null));
                    A0N();
                }
                if (this.A0D == 0) {
                    this.A0H = Math.max(0L, j);
                    this.A0D = 1;
                } else {
                    long expectedPresentationTimeUs = this.A0H + A09(A03());
                    if (this.A0D == 1 && Math.abs(expectedPresentationTimeUs - j) > 200000) {
                        Log.e(A0I, A0I(16, 33, 37) + expectedPresentationTimeUs + A0I(0, 6, 72) + j + A0I(138, 1, 23));
                        this.A0D = 2;
                    }
                    if (this.A0D == 2) {
                        this.A0H += j - expectedPresentationTimeUs;
                        this.A0D = 1;
                        if (this.A0R != null) {
                            InterfaceC11517Ar interfaceC11517Ar = this.A0R;
                            String[] strArr = A0s;
                            if (strArr[3].length() != strArr[4].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0s;
                            strArr2[2] = "GNfkWkIOSoa9yovb6";
                            strArr2[0] = "Q7LeOkpUea2dWONG5VwgU";
                            interfaceC11517Ar.AD9();
                        }
                    }
                }
                if (this.A0X) {
                    this.A0J += byteBuffer.remaining();
                } else {
                    this.A0I += this.A05;
                }
                this.A0T = byteBuffer;
            }
            if (!this.A0Z) {
                A0S(this.A0T, j);
            } else {
                A0P(j);
            }
            if (!this.A0T.hasRemaining()) {
                this.A0T = null;
                return true;
            } else if (this.A0h.A0K(A04())) {
                Log.w(A0I, A0I(55, 29, 85));
                reset();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void A8s() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final boolean A8y() {
        return A0U() && this.A0h.A0J(A04());
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final boolean A9P(int i) {
        if (AbstractC11953IK.A0c(i)) {
            return i != 4 || AbstractC11953IK.A02 >= 21;
        }
        if (this.A0g != null) {
            boolean A04 = this.A0g.A04(i);
            String[] strArr = A0s;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "CXIqBidM6dH7rAKwS";
            strArr2[0] = "lSgEtHU3xwjUl8rjmAKEf";
            if (A04) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final boolean A9Q() {
        if (A0U()) {
            boolean z = this.A0W;
            String[] strArr = A0s;
            if (strArr[2].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[5] = "E9yrX";
            strArr2[6] = "x1eL6";
            if (!z || A8y()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void AEV() {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            this.A0M.play();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void AEW() throws C11518As {
        if (!this.A0W && A0U() && A0T()) {
            this.A0h.A0F(A04());
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void AEy() {
        reset();
        A0L();
        for (InterfaceC11506Ag interfaceC11506Ag : this.A0o) {
            interfaceC11506Ag.reset();
        }
        for (InterfaceC11506Ag interfaceC11506Ag2 : this.A0n) {
            interfaceC11506Ag2.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void AGI(C11498AY c11498ay) {
        if (this.A0Q.equals(c11498ay)) {
            return;
        }
        this.A0Q = c11498ay;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void AGU(InterfaceC11517Ar interfaceC11517Ar) {
        this.A0R = interfaceC11517Ar;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final C11466A2 AGa(C11466A2 c11466a2) {
        C11466A2 lastSetPlaybackParameters;
        if (A0U() && !this.A0V) {
            this.A0P = C11466A2.A05;
            return this.A0P;
        }
        if (this.A0O != null) {
            lastSetPlaybackParameters = this.A0O;
        } else if (!this.A0l.isEmpty()) {
            lastSetPlaybackParameters = this.A0l.getLast().A02;
        } else {
            lastSetPlaybackParameters = this.A0P;
        }
        if (!c11466a2.equals(lastSetPlaybackParameters)) {
            if (A0U()) {
                this.A0O = c11466a2;
            } else {
                C11466A2 lastSetPlaybackParameters2 = this.A0j.A3x(c11466a2);
                this.A0P = lastSetPlaybackParameters2;
            }
        }
        C11466A2 lastSetPlaybackParameters3 = this.A0P;
        return lastSetPlaybackParameters3;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void pause() {
        this.A0Y = false;
        if (A0U() && this.A0h.A0I()) {
            AudioTrack audioTrack = this.A0M;
            String[] strArr = A0s;
            if (strArr[1].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[5] = "Aocfm";
            strArr2[6] = "G14Pt";
            audioTrack.pause();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
        if (r7.A0h.A0H() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
        r7.A0M.pause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
        r1 = r7.A0M;
        r7.A0M = null;
        r7.A0h.A0D();
        r7.A0f.close();
        new com.facebook.ads.redexgen.p370X.C11526B0(r7, r1).start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
        if (r7.A0h.A0H() != false) goto L12;
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void reset() {
        /*
            r7 = this;
            boolean r0 = r7.A0U()
            if (r0 == 0) goto L8c
            r4 = 0
            r7.A0J = r4
            r7.A0I = r4
            r7.A0L = r4
            r7.A0K = r4
            r6 = 0
            r7.A05 = r6
            com.facebook.ads.redexgen.X.A2 r0 = r7.A0O
            r3 = 0
            if (r0 == 0) goto Lb4
            com.facebook.ads.redexgen.X.A2 r0 = r7.A0O
            r7.A0P = r0
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12978Z3.A0s
            r0 = 2
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lcc
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12978Z3.A0s
            java.lang.String r1 = "ZTIDfQpd4HDVI6hTK"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "cfHGChZk6uhr4DLomEqFb"
            r0 = 0
            r2[r0] = r1
            r7.A0O = r3
        L3c:
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.B4> r0 = r7.A0l
            r0.clear()
            r7.A0F = r4
            r7.A0G = r4
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12978Z3.A0s
            r0 = 5
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L8d
            r7.A0T = r3
            r7.A0U = r3
            r7.A0J()
            r7.A0W = r6
            r0 = -1
            r7.A04 = r0
            r7.A0S = r3
            r7.A03 = r6
            r7.A0D = r6
            com.facebook.ads.redexgen.X.Az r0 = r7.A0h
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L76
        L71:
            android.media.AudioTrack r0 = r7.A0M
            r0.pause()
        L76:
            android.media.AudioTrack r1 = r7.A0M
            r7.A0M = r3
            com.facebook.ads.redexgen.X.Az r0 = r7.A0h
            r0.A0D()
            android.os.ConditionVariable r0 = r7.A0f
            r0.close()
            com.facebook.ads.redexgen.X.B0 r0 = new com.facebook.ads.redexgen.X.B0
            r0.<init>(r7, r1)
            r0.start()
        L8c:
            return
        L8d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12978Z3.A0s
            java.lang.String r1 = "Yo69kelq6UGKf7OeAKyxx"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "oDJXE0uB3cUDHD8ob32Qx"
            r0 = 4
            r2[r0] = r1
            r7.A0T = r3
            r7.A0U = r3
            r7.A0J()
            r7.A0W = r6
            r0 = -1
            r7.A04 = r0
            r7.A0S = r3
            r7.A03 = r6
            r7.A0D = r6
            com.facebook.ads.redexgen.X.Az r0 = r7.A0h
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L76
            goto L71
        Lb4:
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.B4> r0 = r7.A0l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.B4> r0 = r7.A0l
            java.lang.Object r0 = r0.getLast()
            com.facebook.ads.redexgen.X.B4 r0 = (com.facebook.ads.redexgen.p370X.C11530B4) r0
            com.facebook.ads.redexgen.X.A2 r0 = com.facebook.ads.redexgen.p370X.C11530B4.A02(r0)
            r7.A0P = r0
            goto L3c
        Lcc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12978Z3.reset():void");
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11519At
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A0M();
        }
    }
}
