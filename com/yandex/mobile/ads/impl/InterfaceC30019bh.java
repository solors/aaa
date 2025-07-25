package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC31983zg;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.bh */
/* loaded from: classes8.dex */
public interface InterfaceC30019bh {

    /* renamed from: com.yandex.mobile.ads.impl.bh$b */
    /* loaded from: classes8.dex */
    public static final class C30021b extends Exception {

        /* renamed from: b */
        public final int f77291b;

        /* renamed from: c */
        public final boolean f77292c;

        /* renamed from: d */
        public final v90 f77293d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C30021b(int r3, int r4, int r5, int r6, com.yandex.mobile.ads.impl.v90 r7, boolean r8, @androidx.annotation.Nullable java.lang.RuntimeException r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "AudioTrack init failed "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r1 = " Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L2a
                java.lang.String r4 = " (recoverable)"
                goto L2c
            L2a:
                java.lang.String r4 = ""
            L2c:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f77291b = r3
                r2.f77292c = r8
                r2.f77293d = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.InterfaceC30019bh.C30021b.<init>(int, int, int, int, com.yandex.mobile.ads.impl.v90, boolean, java.lang.RuntimeException):void");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bh$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC30022c {
    }

    /* renamed from: com.yandex.mobile.ads.impl.bh$d */
    /* loaded from: classes8.dex */
    public static final class C30023d extends Exception {
        public C30023d(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bh$e */
    /* loaded from: classes8.dex */
    public static final class C30024e extends Exception {

        /* renamed from: b */
        public final int f77294b;

        /* renamed from: c */
        public final boolean f77295c;

        /* renamed from: d */
        public final v90 f77296d;

        public C30024e(int i, v90 v90Var, boolean z) {
            super(C31736wd.m27978a("AudioTrack write failed: ", i));
            this.f77295c = z;
            this.f77294b = i;
            this.f77296d = v90Var;
        }
    }

    /* renamed from: a */
    long mo28180a(boolean z);

    /* renamed from: a */
    void mo28194a(int i);

    /* renamed from: a */
    void mo28191a(ae1 ae1Var);

    /* renamed from: a */
    void mo28188a(C31038oh c31038oh);

    /* renamed from: a */
    void mo28187a(C31581ug c31581ug);

    /* renamed from: a */
    void mo28184a(v90 v90Var, @Nullable int[] iArr) throws C30020a;

    /* renamed from: a */
    boolean mo28195a();

    /* renamed from: a */
    boolean mo28186a(v90 v90Var);

    /* renamed from: a */
    boolean mo28181a(ByteBuffer byteBuffer, long j, int i) throws C30021b, C30024e;

    /* renamed from: b */
    int mo28176b(v90 v90Var);

    /* renamed from: b */
    void mo28179b();

    /* renamed from: b */
    void mo28174b(boolean z);

    /* renamed from: c */
    void mo28173c();

    /* renamed from: d */
    void mo28171d() throws C30024e;

    /* renamed from: e */
    boolean mo28169e();

    /* renamed from: f */
    void mo28167f();

    void flush();

    /* renamed from: g */
    void mo28165g();

    ae1 getPlaybackParameters();

    void pause();

    void play();

    void setVolume(float f);

    /* renamed from: com.yandex.mobile.ads.impl.bh$a */
    /* loaded from: classes8.dex */
    public static final class C30020a extends Exception {

        /* renamed from: b */
        public final v90 f77290b;

        public C30020a(InterfaceC31983zg.C31985b c31985b, v90 v90Var) {
            super(c31985b);
            this.f77290b = v90Var;
        }

        public C30020a(String str, v90 v90Var) {
            super(str);
            this.f77290b = v90Var;
        }
    }

    /* renamed from: a */
    default void mo28189a(@Nullable le1 le1Var) {
    }
}
