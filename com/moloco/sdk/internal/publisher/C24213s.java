package com.moloco.sdk.internal.publisher;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.publisher.s */
/* loaded from: classes7.dex */
public final class C24213s {
    @NotNull

    /* renamed from: a */
    public final String f62708a;
    @Nullable

    /* renamed from: b */
    public final Float f62709b;

    public C24213s(@NotNull String burl, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(burl, "burl");
        this.f62708a = burl;
        this.f62709b = f;
    }

    @NotNull
    /* renamed from: a */
    public final String m46780a() {
        return this.f62708a;
    }
}
