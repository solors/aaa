package com.ironsource;

import com.ironsource.InterfaceC21175wd;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.ba */
/* loaded from: classes6.dex */
public final class C19627ba implements InterfaceC21175wd, InterfaceC21175wd.InterfaceC21176a {
    @NotNull

    /* renamed from: a */
    private final ConcurrentHashMap<String, C21258y9> f49264a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC21175wd
    @NotNull
    /* renamed from: a */
    public C19902f8 mo54349a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C21258y9 c21258y9 = this.f49264a.get(identifier);
        return (c21258y9 == null || c21258y9.m54015a()) ? new C19902f8(false, null, 2, null) : new C19902f8(true, EnumC20037h8.Delivery);
    }

    @Override // com.ironsource.InterfaceC21175wd.InterfaceC21176a
    /* renamed from: b */
    public void mo54347b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
    }

    @Override // com.ironsource.InterfaceC21175wd.InterfaceC21176a
    @NotNull
    /* renamed from: a */
    public Object mo54348a(@NotNull String identifier, @NotNull EnumC20037h8 cappingType, @NotNull InterfaceC21075ud cappingConfig) {
        Object m14540a;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object mo54025a = cappingConfig.mo54025a();
        if (Result.m14543h(mo54025a)) {
            C21258y9 c21258y9 = (C21258y9) mo54025a;
            if (c21258y9 != null) {
                this.f49264a.put(identifier, c21258y9);
            }
        } else {
            Throwable m14546e = Result.m14546e(mo54025a);
            if (m14546e != null) {
                m14540a = C38508r.m14540a(m14546e);
                return Result.m14549b(m14540a);
            }
        }
        m14540a = Unit.f99208a;
        return Result.m14549b(m14540a);
    }
}
