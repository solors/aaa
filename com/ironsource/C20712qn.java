package com.ironsource;

import com.ironsource.InterfaceC21175wd;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.qn */
/* loaded from: classes6.dex */
public final class C20712qn implements InterfaceC21175wd, InterfaceC21175wd.InterfaceC21176a {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20197k9 f52616a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC20520ne f52617b;
    @NotNull

    /* renamed from: c */
    private final Map<String, C20650pn> f52618c;

    public C20712qn(@NotNull InterfaceC20197k9 currentTimeProvider, @NotNull InterfaceC20520ne repository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f52616a = currentTimeProvider;
        this.f52617b = repository;
        this.f52618c = new LinkedHashMap();
    }

    @Override // com.ironsource.InterfaceC21175wd
    @NotNull
    /* renamed from: a */
    public C19902f8 mo54349a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C20650pn c20650pn = this.f52618c.get(identifier);
        if (c20650pn != null && m55598a(c20650pn, identifier)) {
            return new C19902f8(true, EnumC20037h8.Pacing);
        }
        return new C19902f8(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC21175wd.InterfaceC21176a
    /* renamed from: b */
    public void mo54347b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (this.f52618c.get(identifier) == null) {
            return;
        }
        this.f52617b.mo55449a(this.f52616a.mo57675a(), identifier);
    }

    @Override // com.ironsource.InterfaceC21175wd.InterfaceC21176a
    @NotNull
    /* renamed from: a */
    public Object mo54348a(@NotNull String identifier, @NotNull EnumC20037h8 cappingType, @NotNull InterfaceC21075ud cappingConfig) {
        Object m14540a;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object mo54023b = cappingConfig.mo54023b();
        if (Result.m14543h(mo54023b)) {
            C20650pn c20650pn = (C20650pn) mo54023b;
            if (c20650pn != null) {
                this.f52618c.put(identifier, c20650pn);
            }
        } else {
            Throwable m14546e = Result.m14546e(mo54023b);
            if (m14546e != null) {
                m14540a = C38508r.m14540a(m14546e);
                return Result.m14549b(m14540a);
            }
        }
        m14540a = Unit.f99208a;
        return Result.m14549b(m14540a);
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, C20650pn> m55599a() {
        return this.f52618c;
    }

    /* renamed from: a */
    private final boolean m55598a(C20650pn c20650pn, String str) {
        Long mo55448a = this.f52617b.mo55448a(str);
        if (mo55448a != null) {
            mo55448a.longValue();
            return this.f52616a.mo57675a() - mo55448a.longValue() < c20650pn.m55775a();
        }
        return false;
    }
}
