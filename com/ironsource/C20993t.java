package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.t */
/* loaded from: classes6.dex */
public final class C20993t {
    @NotNull

    /* renamed from: a */
    private final EnumC21045tr f53513a;
    @NotNull

    /* renamed from: b */
    private final String f53514b;
    @NotNull

    /* renamed from: c */
    private final String f53515c;
    @NotNull

    /* renamed from: d */
    private final String f53516d;
    @NotNull

    /* renamed from: e */
    private final EnumC21177we f53517e;
    @NotNull

    /* renamed from: f */
    private final String f53518f;

    public C20993t(@NotNull EnumC21045tr recordType, @NotNull String advertiserBundleId, @NotNull String networkInstanceId, @NotNull String adUnitId, @NotNull EnumC21177we adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f53513a = recordType;
        this.f53514b = advertiserBundleId;
        this.f53515c = networkInstanceId;
        this.f53516d = adUnitId;
        this.f53517e = adProvider;
        this.f53518f = adInstanceId;
    }

    @NotNull
    /* renamed from: a */
    public final C21247y1 m54877a(@NotNull InterfaceC19778dl<C20993t, C21247y1> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo53929a(this);
    }

    @NotNull
    /* renamed from: b */
    public final EnumC21177we m54876b() {
        return this.f53517e;
    }

    @NotNull
    /* renamed from: c */
    public final String m54875c() {
        return this.f53516d;
    }

    @NotNull
    /* renamed from: d */
    public final String m54874d() {
        return this.f53514b;
    }

    @NotNull
    /* renamed from: e */
    public final String m54873e() {
        return this.f53515c;
    }

    @NotNull
    /* renamed from: f */
    public final EnumC21045tr m54872f() {
        return this.f53513a;
    }

    @NotNull
    /* renamed from: a */
    public final String m54878a() {
        return this.f53518f;
    }
}
