package com.moloco.sdk.acm.http;

import com.moloco.sdk.C24416k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.acm.http.d */
/* loaded from: classes7.dex */
public final class C23837d {
    @NotNull

    /* renamed from: a */
    public final List<C24416k.C24418b> f61865a;
    @NotNull

    /* renamed from: b */
    public final List<C24416k.C24420c> f61866b;

    public C23837d(@NotNull List<C24416k.C24418b> counts, @NotNull List<C24416k.C24420c> timers) {
        Intrinsics.checkNotNullParameter(counts, "counts");
        Intrinsics.checkNotNullParameter(timers, "timers");
        this.f61865a = counts;
        this.f61866b = timers;
    }

    @NotNull
    /* renamed from: a */
    public final List<C24416k.C24418b> m47644a() {
        return this.f61865a;
    }

    @NotNull
    /* renamed from: b */
    public final List<C24416k.C24420c> m47643b() {
        return this.f61866b;
    }
}
