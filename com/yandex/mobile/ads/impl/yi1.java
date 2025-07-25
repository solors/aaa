package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sa2;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class yi1 implements l72 {
    @NotNull

    /* renamed from: a */
    private final sa2 f88227a;
    @NotNull

    /* renamed from: b */
    private final List<C31900a> f88228b;

    /* renamed from: com.yandex.mobile.ads.impl.yi1$a */
    /* loaded from: classes8.dex */
    private static final class C31900a {
        @NotNull

        /* renamed from: a */
        private final sa2.EnumC31344a f88229a;

        /* renamed from: b */
        private final float f88230b;

        public C31900a(@NotNull sa2.EnumC31344a trackerQuartile, float f) {
            Intrinsics.checkNotNullParameter(trackerQuartile, "trackerQuartile");
            this.f88229a = trackerQuartile;
            this.f88230b = f;
        }

        /* renamed from: a */
        public final float m26891a() {
            return this.f88230b;
        }

        @NotNull
        /* renamed from: b */
        public final sa2.EnumC31344a m26890b() {
            return this.f88229a;
        }
    }

    public yi1(@NotNull ta2 videoTracker) {
        List<C31900a> m17160s;
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f88227a = videoTracker;
        m17160s = C37563v.m17160s(new C31900a(sa2.EnumC31344a.f85162b, 0.25f), new C31900a(sa2.EnumC31344a.f85163c, 0.5f), new C31900a(sa2.EnumC31344a.f85164d, 0.75f));
        this.f88228b = m17160s;
    }

    @Override // com.yandex.mobile.ads.impl.l72
    /* renamed from: a */
    public final void mo26256a(long j, long j2) {
        if (j != 0) {
            Iterator<C31900a> it = this.f88228b.iterator();
            while (it.hasNext()) {
                C31900a next = it.next();
                if (next.m26891a() * ((float) j) <= ((float) j2)) {
                    this.f88227a.mo29042a(next.m26890b());
                    it.remove();
                }
            }
        }
    }
}
