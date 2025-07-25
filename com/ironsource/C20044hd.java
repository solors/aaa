package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.hd */
/* loaded from: classes6.dex */
public final class C20044hd implements InterfaceC20094id {

    /* renamed from: a */
    private final long f50450a;
    @NotNull

    /* renamed from: b */
    private final EnumC20260ld f50451b;

    public C20044hd(long j, @NotNull EnumC20260ld recoveryStrategy) {
        Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.f50450a = j;
        this.f50451b = recoveryStrategy;
    }

    @Override // com.ironsource.InterfaceC20094id
    /* renamed from: a */
    public long mo57985a() {
        return this.f50450a;
    }

    @Override // com.ironsource.InterfaceC20094id
    @NotNull
    /* renamed from: b */
    public EnumC20260ld mo57984b() {
        return this.f50451b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20044hd(@NotNull C20202kd feature) {
        this(feature.mo57649a(), feature.mo57648b());
        Intrinsics.checkNotNullParameter(feature, "feature");
    }
}
