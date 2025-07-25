package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.mr */
/* loaded from: classes6.dex */
public abstract class AbstractC20483mr {
    @Nullable

    /* renamed from: a */
    private final C20177k0 f52075a;

    public AbstractC20483mr(@Nullable C20177k0 c20177k0) {
        this.f52075a = c20177k0;
    }

    @Nullable
    /* renamed from: a */
    public final C20177k0 m56247a() {
        return this.f52075a;
    }

    @NotNull
    /* renamed from: b */
    public abstract EnumC21045tr mo55438b();

    @NotNull
    /* renamed from: a */
    public final C20993t m56246a(@NotNull InterfaceC19778dl<AbstractC20483mr, C20993t> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo53929a(this);
    }
}
