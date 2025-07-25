package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.yr */
/* loaded from: classes6.dex */
public final class C21278yr {
    @NotNull

    /* renamed from: a */
    private final String f54675a;
    @NotNull

    /* renamed from: b */
    private final String f54676b;

    public C21278yr(@NotNull String identifier, @NotNull String baseConst) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.f54675a = identifier;
        this.f54676b = baseConst;
    }

    @NotNull
    /* renamed from: a */
    public final String m53939a() {
        return this.f54675a + '_' + this.f54676b;
    }
}
