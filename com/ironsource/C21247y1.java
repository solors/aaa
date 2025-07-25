package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.y1 */
/* loaded from: classes6.dex */
public final class C21247y1 {
    @NotNull

    /* renamed from: a */
    private final EnumC21045tr f54537a;
    @NotNull

    /* renamed from: b */
    private final String f54538b;
    @NotNull

    /* renamed from: c */
    private final String f54539c;
    @NotNull

    /* renamed from: d */
    private final EnumC21177we f54540d;
    @NotNull

    /* renamed from: e */
    private final String f54541e;

    public C21247y1(@NotNull EnumC21045tr recordType, @NotNull String advertiserBundleId, @NotNull String networkInstanceId, @NotNull EnumC21177we adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f54537a = recordType;
        this.f54538b = advertiserBundleId;
        this.f54539c = networkInstanceId;
        this.f54540d = adProvider;
        this.f54541e = adInstanceId;
    }

    @NotNull
    /* renamed from: a */
    public final C20213km m54056a(@NotNull InterfaceC19778dl<C21247y1, C20213km> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo53929a(this);
    }

    @NotNull
    /* renamed from: b */
    public final EnumC21177we m54055b() {
        return this.f54540d;
    }

    @NotNull
    /* renamed from: c */
    public final String m54054c() {
        return this.f54538b;
    }

    @NotNull
    /* renamed from: d */
    public final String m54053d() {
        return this.f54539c;
    }

    @NotNull
    /* renamed from: e */
    public final EnumC21045tr m54052e() {
        return this.f54537a;
    }

    @NotNull
    /* renamed from: a */
    public final String m54057a() {
        return this.f54541e;
    }
}
