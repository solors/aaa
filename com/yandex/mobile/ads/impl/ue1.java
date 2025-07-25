package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ue1 {
    @NotNull

    /* renamed from: a */
    private final Timeline.Period f86238a;
    @NotNull

    /* renamed from: b */
    private Timeline f86239b;

    /* renamed from: c */
    private boolean f86240c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ue1() {
        /*
            r3 = this;
            com.google.android.exoplayer2.Timeline$Period r0 = new com.google.android.exoplayer2.Timeline$Period
            r0.<init>()
            com.google.android.exoplayer2.Timeline r1 = com.google.android.exoplayer2.Timeline.EMPTY
            java.lang.String r2 = "EMPTY"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ue1.<init>():void");
    }

    @NotNull
    /* renamed from: a */
    public final Timeline.Period m28804a() {
        return this.f86238a;
    }

    @NotNull
    /* renamed from: b */
    public final Timeline m28801b() {
        return this.f86239b;
    }

    /* renamed from: c */
    public final boolean m28800c() {
        return this.f86240c;
    }

    /* renamed from: a */
    public final void m28802a(boolean z) {
        this.f86240c = z;
    }

    /* renamed from: a */
    public final void m28803a(@NotNull Timeline timeline) {
        Intrinsics.checkNotNullParameter(timeline, "<set-?>");
        this.f86239b = timeline;
    }

    public ue1(@NotNull Timeline.Period period, @NotNull Timeline timeline, boolean z) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        this.f86238a = period;
        this.f86239b = timeline;
        this.f86240c = z;
    }
}
