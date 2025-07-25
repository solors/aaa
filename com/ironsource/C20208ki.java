package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.ki */
/* loaded from: classes6.dex */
public final class C20208ki implements InterfaceC19817eh {
    @NotNull

    /* renamed from: a */
    private final C21108v2 f50849a;
    @NotNull

    /* renamed from: b */
    private final C20052hi f50850b;

    public C20208ki(@NotNull C21108v2 adapterConfig, @NotNull C20052hi adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f50849a = adapterConfig;
        this.f50850b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC21163w2
    /* renamed from: a */
    public boolean mo53947a() {
        return !this.f50849a.m54530j();
    }

    @Override // com.ironsource.InterfaceC21163w2
    @NotNull
    /* renamed from: b */
    public String mo53946b() {
        String m54539a = this.f50849a.m54539a();
        Intrinsics.checkNotNullExpressionValue(m54539a, "adapterConfig.adSourceNameForEvents");
        return m54539a;
    }

    @Override // com.ironsource.InterfaceC21163w2
    @NotNull
    /* renamed from: c */
    public EnumC19990gh mo53945c() {
        return EnumC19990gh.f50254b.m58356a(this.f50849a.m54536d());
    }

    @Override // com.ironsource.InterfaceC21163w2
    /* renamed from: d */
    public boolean mo53944d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC20783s
    /* renamed from: e */
    public long mo53943e() {
        return this.f50850b.m58138e();
    }

    @Override // com.ironsource.InterfaceC21163w2
    @NotNull
    /* renamed from: f */
    public String mo53942f() {
        String m54534f = this.f50849a.m54534f();
        Intrinsics.checkNotNullExpressionValue(m54534f, "adapterConfig.providerName");
        return m54534f;
    }
}
