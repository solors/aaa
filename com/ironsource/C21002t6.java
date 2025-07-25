package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.t6 */
/* loaded from: classes6.dex */
public final class C21002t6 implements InterfaceC19817eh {
    @NotNull

    /* renamed from: a */
    private final C21108v2 f53549a;
    @NotNull

    /* renamed from: b */
    private final C20512n6 f53550b;

    public C21002t6(@NotNull C21108v2 adapterConfig, @NotNull C20512n6 adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f53549a = adapterConfig;
        this.f53550b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC21163w2
    /* renamed from: a */
    public boolean mo53947a() {
        return !this.f53549a.m54530j();
    }

    @Override // com.ironsource.InterfaceC21163w2
    @NotNull
    /* renamed from: b */
    public String mo53946b() {
        String m54539a = this.f53549a.m54539a();
        Intrinsics.checkNotNullExpressionValue(m54539a, "adapterConfig.adSourceNameForEvents");
        return m54539a;
    }

    @Override // com.ironsource.InterfaceC21163w2
    @NotNull
    /* renamed from: c */
    public EnumC19990gh mo53945c() {
        return EnumC19990gh.f50254b.m58356a(this.f53549a.m54536d());
    }

    @Override // com.ironsource.InterfaceC21163w2
    /* renamed from: d */
    public boolean mo53944d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC20783s
    /* renamed from: e */
    public long mo53943e() {
        return this.f53550b.m56191b();
    }

    @Override // com.ironsource.InterfaceC21163w2
    @NotNull
    /* renamed from: f */
    public String mo53942f() {
        String m54534f = this.f53549a.m54534f();
        Intrinsics.checkNotNullExpressionValue(m54534f, "adapterConfig.providerName");
        return m54534f;
    }
}
