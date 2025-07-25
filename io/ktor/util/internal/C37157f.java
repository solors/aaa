package io.ktor.util.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LockFreeLinkedList.kt */
@Metadata
/* renamed from: io.ktor.util.internal.f */
/* loaded from: classes9.dex */
final class C37157f {
    @NotNull

    /* renamed from: a */
    private final String f98023a;

    public C37157f(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f98023a = symbol;
    }

    @NotNull
    public String toString() {
        return this.f98023a;
    }
}
