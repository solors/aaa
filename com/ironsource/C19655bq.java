package com.ironsource;

import com.ironsource.C19727cr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.bq */
/* loaded from: classes6.dex */
public class C19655bq {
    @NotNull

    /* renamed from: a */
    private final C20164jq f49337a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19655bq(@NotNull C19655bq sdkConfig) {
        this(sdkConfig.f49337a);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    @NotNull
    /* renamed from: a */
    public final C19749d4 m59265a() {
        return this.f49337a.m57795a().m56176a().m55392c();
    }

    @NotNull
    /* renamed from: b */
    public final C21164w3 m59264b() {
        return this.f49337a.m57795a().m56176a().m55393b();
    }

    @NotNull
    /* renamed from: c */
    public final C21219xb m59263c() {
        return this.f49337a.m57794b();
    }

    @NotNull
    /* renamed from: d */
    public final C19727cr m59262d() {
        return this.f49337a.m57793c();
    }

    @NotNull
    /* renamed from: e */
    public final C21270yk m59261e() {
        return this.f49337a.m57795a().m56176a().m55390e();
    }

    @NotNull
    /* renamed from: f */
    public final C19727cr.EnumC19728a m59260f() {
        C19727cr.EnumC19728a m59036h = this.f49337a.m57793c().m59036h();
        Intrinsics.checkNotNullExpressionValue(m59036h, "sdkInitResponse.fullResponse.origin");
        return m59036h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: g */
    public final C20164jq m59259g() {
        return this.f49337a;
    }

    public C19655bq(@NotNull C20164jq sdkInitResponse) {
        Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.f49337a = sdkInitResponse;
    }
}
