package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.km */
/* loaded from: classes6.dex */
public final class C20213km {
    @NotNull

    /* renamed from: a */
    private final EnumC21045tr f50853a;
    @NotNull

    /* renamed from: b */
    private final String f50854b;
    @NotNull

    /* renamed from: c */
    private final EnumC21177we f50855c;
    @NotNull

    /* renamed from: d */
    private final String f50856d;

    public C20213km(@NotNull EnumC21045tr recordType, @NotNull String advertiserBundleId, @NotNull EnumC21177we adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f50853a = recordType;
        this.f50854b = advertiserBundleId;
        this.f50855c = adProvider;
        this.f50856d = adInstanceId;
    }

    @NotNull
    /* renamed from: a */
    public final C21291z2 m57629a(@NotNull InterfaceC19778dl<C20213km, C21291z2> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo53929a(this);
    }

    @NotNull
    /* renamed from: b */
    public final EnumC21177we m57628b() {
        return this.f50855c;
    }

    @NotNull
    /* renamed from: c */
    public final String m57627c() {
        return this.f50854b;
    }

    @NotNull
    /* renamed from: d */
    public final EnumC21045tr m57626d() {
        return this.f50853a;
    }

    @NotNull
    /* renamed from: a */
    public final String m57630a() {
        return this.f50856d;
    }
}
