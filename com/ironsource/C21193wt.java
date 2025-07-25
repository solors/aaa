package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.wt */
/* loaded from: classes6.dex */
public final class C21193wt {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20197k9 f54353a;

    public C21193wt(@NotNull InterfaceC20197k9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f54353a = currentTimeProvider;
    }

    /* renamed from: a */
    public final boolean m54288a(long j, long j2) {
        long mo57675a = this.f54353a.mo57675a();
        if (j2 > 0 && j > 0 && mo57675a >= j && mo57675a - j <= j2) {
            return false;
        }
        return true;
    }
}
