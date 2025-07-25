package com.inmobi.media;

import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.H */
/* loaded from: classes6.dex */
public final class C18943H {
    @NotNull

    /* renamed from: a */
    private final String f47292a;

    /* renamed from: b */
    private long f47293b;
    @Nullable

    /* renamed from: c */
    private Map<String, String> f47294c;
    @Nullable

    /* renamed from: d */
    private String f47295d;
    @Nullable

    /* renamed from: e */
    private String f47296e;
    @NotNull

    /* renamed from: f */
    private final String f47297f;
    @NotNull

    /* renamed from: g */
    private String f47298g;

    /* renamed from: h */
    private boolean f47299h;
    @NotNull

    /* renamed from: i */
    private String f47300i;
    @Nullable

    /* renamed from: j */
    private String f47301j;

    public C18943H(@NotNull String mAdType) {
        Intrinsics.checkNotNullParameter(mAdType, "mAdType");
        this.f47292a = mAdType;
        this.f47293b = Long.MIN_VALUE;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f47297f = uuid;
        this.f47298g = "";
        this.f47300i = "activity";
    }

    /* renamed from: b */
    private static /* synthetic */ void m61095b() {
    }

    /* renamed from: c */
    private static /* synthetic */ void m61093c() {
    }

    @NotNull
    /* renamed from: a */
    public final C18943H m61100a(long j) {
        this.f47293b = j;
        return this;
    }

    @NotNull
    /* renamed from: d */
    public final C18943H m61091d(@NotNull String m10Context) {
        Intrinsics.checkNotNullParameter(m10Context, "m10Context");
        this.f47300i = m10Context;
        return this;
    }

    @NotNull
    /* renamed from: e */
    public final C18943H m61090e(@Nullable String str) {
        this.f47296e = str;
        return this;
    }

    @NotNull
    /* renamed from: a */
    public final C18943H m61099a(@NotNull C18971J placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f47293b = placement.m61008g();
        this.f47300i = placement.m61005j();
        this.f47294c = placement.m61009f();
        this.f47298g = placement.m61021a();
        return this;
    }

    @NotNull
    /* renamed from: b */
    public final C18943H m61094b(@Nullable String str) {
        this.f47301j = str;
        return this;
    }

    @NotNull
    /* renamed from: c */
    public final C18943H m61092c(@Nullable String str) {
        this.f47295d = str;
        return this;
    }

    @NotNull
    /* renamed from: a */
    public final C18943H m61098a(@NotNull String adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.f47298g = adSize;
        return this;
    }

    @NotNull
    /* renamed from: a */
    public final C18943H m61097a(@Nullable Map<String, String> map) {
        this.f47294c = map;
        return this;
    }

    @NotNull
    /* renamed from: a */
    public final C18943H m61096a(boolean z) {
        this.f47299h = z;
        return this;
    }

    @NotNull
    /* renamed from: a */
    public final C18971J m61101a() throws IllegalStateException {
        long j = this.f47293b;
        if (j != Long.MIN_VALUE) {
            Map<String, String> map = this.f47294c;
            C18971J c18971j = new C18971J(j, (map == null || (r0 = map.get("tp")) == null) ? "" : "", this.f47292a, this.f47296e, null);
            c18971j.f47355d = this.f47295d;
            c18971j.m61017a(this.f47294c);
            c18971j.m61018a(this.f47298g);
            c18971j.m61014b(this.f47300i);
            c18971j.f47358g = this.f47297f;
            c18971j.f47361j = this.f47299h;
            c18971j.f47362k = this.f47301j;
            return c18971j;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty".toString());
    }
}
