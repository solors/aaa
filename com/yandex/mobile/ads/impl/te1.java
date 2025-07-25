package com.yandex.mobile.ads.impl;

import androidx.media3.common.Timeline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class te1 {
    @NotNull

    /* renamed from: a */
    private final Timeline.Period f85630a;
    @NotNull

    /* renamed from: b */
    private Timeline f85631b;

    /* renamed from: c */
    private boolean f85632c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ te1() {
        /*
            r3 = this;
            androidx.media3.common.Timeline$Period r0 = new androidx.media3.common.Timeline$Period
            r0.<init>()
            androidx.media3.common.Timeline r1 = androidx.media3.common.Timeline.EMPTY
            java.lang.String r2 = "EMPTY"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.te1.<init>():void");
    }

    @NotNull
    /* renamed from: a */
    public final Timeline.Period m29203a() {
        return this.f85630a;
    }

    @NotNull
    /* renamed from: b */
    public final Timeline m29200b() {
        return this.f85631b;
    }

    /* renamed from: c */
    public final boolean m29199c() {
        return this.f85632c;
    }

    /* renamed from: a */
    public final void m29201a(boolean z) {
        this.f85632c = z;
    }

    /* renamed from: a */
    public final void m29202a(@NotNull Timeline timeline) {
        Intrinsics.checkNotNullParameter(timeline, "<set-?>");
        this.f85631b = timeline;
    }

    public te1(@NotNull Timeline.Period period, @NotNull Timeline timeline, boolean z) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        this.f85630a = period;
        this.f85631b = timeline;
        this.f85632c = z;
    }
}
