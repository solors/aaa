package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* loaded from: classes8.dex */
public final class pc1 implements oc1 {

    /* renamed from: b */
    private final boolean f83821b;
    @NotNull

    /* renamed from: c */
    private final Handler f83822c;
    @NotNull

    /* renamed from: d */
    private EnumC31105b f83823d;
    @Nullable

    /* renamed from: e */
    private qc1 f83824e;
    @Nullable

    /* renamed from: f */
    private k02 f83825f;

    /* renamed from: g */
    private long f83826g;

    /* renamed from: h */
    private long f83827h;

    /* renamed from: i */
    private long f83828i;

    /* renamed from: com.yandex.mobile.ads.impl.pc1$a */
    /* loaded from: classes8.dex */
    public final class RunnableC31104a implements Runnable {
        public RunnableC31104a() {
            pc1.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            pc1.m30761b(pc1.this);
            pc1.this.m30765a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pc1$b */
    /* loaded from: classes8.dex */
    public static final class EnumC31105b {

        /* renamed from: b */
        public static final EnumC31105b f83830b;

        /* renamed from: c */
        public static final EnumC31105b f83831c;

        /* renamed from: d */
        public static final EnumC31105b f83832d;

        /* renamed from: e */
        private static final /* synthetic */ EnumC31105b[] f83833e;

        static {
            EnumC31105b enumC31105b = new EnumC31105b(0, "INVALIDATED");
            f83830b = enumC31105b;
            EnumC31105b enumC31105b2 = new EnumC31105b(1, "ACTIVE");
            f83831c = enumC31105b2;
            EnumC31105b enumC31105b3 = new EnumC31105b(2, "PAUSED");
            f83832d = enumC31105b3;
            EnumC31105b[] enumC31105bArr = {enumC31105b, enumC31105b2, enumC31105b3};
            f83833e = enumC31105bArr;
            C44401b.m3113a(enumC31105bArr);
        }

        private EnumC31105b(int i, String str) {
            super(str, i);
        }

        public static EnumC31105b valueOf(String str) {
            return (EnumC31105b) Enum.valueOf(EnumC31105b.class, str);
        }

        public static EnumC31105b[] values() {
            return (EnumC31105b[]) f83833e.clone();
        }
    }

    public pc1(boolean z, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f83821b = z;
        this.f83822c = handler;
        this.f83823d = EnumC31105b.f83830b;
    }

    /* renamed from: b */
    public static final void m30761b(pc1 pc1Var) {
        pc1Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - pc1Var.f83828i;
        pc1Var.f83828i = elapsedRealtime;
        long j2 = pc1Var.f83826g - j;
        pc1Var.f83826g = j2;
        long max = (long) Math.max(0.0d, j2);
        k02 k02Var = pc1Var.f83825f;
        if (k02Var != null) {
            k02Var.mo28719a(max, pc1Var.f83827h - max);
        }
    }

    /* renamed from: c */
    public static final void m30760c(pc1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m30765a();
    }

    /* renamed from: d */
    public static /* synthetic */ void m30759d(pc1 pc1Var) {
        m30760c(pc1Var);
    }

    @Override // com.yandex.mobile.ads.impl.oc1
    public final void invalidate() {
        EnumC31105b enumC31105b = EnumC31105b.f83830b;
        if (enumC31105b != this.f83823d) {
            this.f83823d = enumC31105b;
            this.f83824e = null;
            this.f83822c.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.oc1
    public final void pause() {
        if (EnumC31105b.f83831c == this.f83823d) {
            this.f83823d = EnumC31105b.f83832d;
            this.f83822c.removeCallbacksAndMessages(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f83828i;
            this.f83828i = elapsedRealtime;
            long j2 = this.f83826g - j;
            this.f83826g = j2;
            long max = (long) Math.max(0.0d, j2);
            k02 k02Var = this.f83825f;
            if (k02Var != null) {
                k02Var.mo28719a(max, this.f83827h - max);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.oc1
    public final void resume() {
        if (EnumC31105b.f83832d == this.f83823d) {
            m30765a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.oc1
    public final void stop() {
        invalidate();
    }

    /* renamed from: a */
    public final void m30765a() {
        this.f83823d = EnumC31105b.f83831c;
        this.f83828i = SystemClock.elapsedRealtime();
        long min = (long) Math.min(200.0d, this.f83826g);
        if (min > 0) {
            this.f83822c.postDelayed(new RunnableC31104a(), min);
            return;
        }
        qc1 qc1Var = this.f83824e;
        if (qc1Var != null) {
            qc1Var.mo25973a();
        }
        invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.oc1
    /* renamed from: a */
    public final void mo30763a(@Nullable k02 k02Var) {
        this.f83825f = k02Var;
    }

    @Override // com.yandex.mobile.ads.impl.oc1
    /* renamed from: a */
    public final void mo30764a(long j, @Nullable qc1 qc1Var) {
        invalidate();
        this.f83824e = qc1Var;
        this.f83826g = j;
        this.f83827h = j;
        if (this.f83821b) {
            this.f83822c.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.du2
                @Override // java.lang.Runnable
                public final void run() {
                    pc1.m30759d(pc1.this);
                }
            });
        } else {
            m30765a();
        }
    }
}
