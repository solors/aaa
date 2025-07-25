package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.VideoEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class uh2 implements InterfaceC30118ct {
    @NotNull

    /* renamed from: a */
    private final VideoEventListener f86280a;

    /* renamed from: com.yandex.mobile.ads.impl.uh2$a */
    /* loaded from: classes8.dex */
    static final class C31587a extends Lambda implements Functions<Unit> {
        C31587a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            uh2.this.f86280a.onVideoComplete();
            return Unit.f99208a;
        }
    }

    public uh2(@NotNull VideoEventListener videoEventListener) {
        Intrinsics.checkNotNullParameter(videoEventListener, "videoEventListener");
        this.f86280a = videoEventListener;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof uh2) && Intrinsics.m17075f(((uh2) obj).f86280a, this.f86280a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f86280a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30118ct
    public final void onVideoComplete() {
        new CallbackStackTraceMarker(new C31587a());
    }
}
