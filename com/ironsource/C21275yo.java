package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.yo */
/* loaded from: classes6.dex */
public final class C21275yo implements InterfaceC19817eh {
    @NotNull

    /* renamed from: a */
    private final C21108v2 f54670a;
    @NotNull

    /* renamed from: b */
    private final C20654pp f54671b;

    public C21275yo(@NotNull C21108v2 adapterConfig, @NotNull C20654pp adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f54670a = adapterConfig;
        this.f54671b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC21163w2
    /* renamed from: a */
    public boolean mo53947a() {
        return !this.f54670a.m54530j();
    }

    @Override // com.ironsource.InterfaceC21163w2
    @NotNull
    /* renamed from: b */
    public String mo53946b() {
        String m54539a = this.f54670a.m54539a();
        Intrinsics.checkNotNullExpressionValue(m54539a, "adapterConfig.adSourceNameForEvents");
        return m54539a;
    }

    @Override // com.ironsource.InterfaceC21163w2
    @NotNull
    /* renamed from: c */
    public EnumC19990gh mo53945c() {
        return EnumC19990gh.f50254b.m58356a(this.f54670a.m54536d());
    }

    @Override // com.ironsource.InterfaceC21163w2
    /* renamed from: d */
    public boolean mo53944d() {
        return true;
    }

    @Override // com.ironsource.InterfaceC20783s
    /* renamed from: e */
    public long mo53943e() {
        return this.f54671b.m55760i();
    }

    @Override // com.ironsource.InterfaceC21163w2
    @NotNull
    /* renamed from: f */
    public String mo53942f() {
        String m54534f = this.f54670a.m54534f();
        Intrinsics.checkNotNullExpressionValue(m54534f, "adapterConfig.providerName");
        return m54534f;
    }
}
