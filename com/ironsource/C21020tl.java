package com.ironsource;

import com.ironsource.C19950g2;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.tl */
/* loaded from: classes6.dex */
public final class C21020tl extends C20667q0 {
    @Nullable

    /* renamed from: t */
    private final String f53569t;
    @Nullable

    /* renamed from: u */
    private final List<NetworkSettings> f53570u;
    @NotNull

    /* renamed from: v */
    private final C20157jl f53571v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21020tl(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C20157jl configs) {
        super(IronSource.AD_UNIT.NATIVE_AD, str, list, configs.m57814d(), configs.m57820b(), (int) (configs.m57816c() / 1000), configs.m57828a(), configs.m57811f(), -1, new C19950g2(C19950g2.EnumC19951a.MANUAL, configs.m57814d().m58289j(), configs.m57814d().m58297b(), -1L), new C19612b2(-1L), configs.m57809h(), configs.m57808i(), configs.m57807j(), configs.m57805l(), configs.m57806k(), false, 65536, null);
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.f53569t = str;
        this.f53570u = list;
        this.f53571v = configs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C21020tl m54787a(C21020tl c21020tl, String str, List list, C20157jl c20157jl, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c21020tl.mo53975p();
        }
        if ((i & 2) != 0) {
            list = c21020tl.mo53976k();
        }
        if ((i & 4) != 0) {
            c20157jl = c21020tl.f53571v;
        }
        return c21020tl.m54786a(str, list, c20157jl);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21020tl)) {
            return false;
        }
        C21020tl c21020tl = (C21020tl) obj;
        if (Intrinsics.m17075f(mo53975p(), c21020tl.mo53975p()) && Intrinsics.m17075f(mo53976k(), c21020tl.mo53976k()) && Intrinsics.m17075f(this.f53571v, c21020tl.f53571v)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        if (mo53975p() == null) {
            hashCode = 0;
        } else {
            hashCode = mo53975p().hashCode();
        }
        int i2 = hashCode * 31;
        if (mo53976k() != null) {
            i = mo53976k().hashCode();
        }
        return ((i2 + i) * 31) + this.f53571v.hashCode();
    }

    @Override // com.ironsource.C20667q0
    @Nullable
    /* renamed from: k */
    public List<NetworkSettings> mo53976k() {
        return this.f53570u;
    }

    @Override // com.ironsource.C20667q0
    @Nullable
    /* renamed from: p */
    public String mo53975p() {
        return this.f53569t;
    }

    @Nullable
    /* renamed from: t */
    public final String m54785t() {
        return mo53975p();
    }

    @NotNull
    public String toString() {
        return "NativeAdManagerData(userId=" + mo53975p() + ", providerList=" + mo53976k() + ", configs=" + this.f53571v + ')';
    }

    @Nullable
    /* renamed from: u */
    public final List<NetworkSettings> m54784u() {
        return mo53976k();
    }

    @NotNull
    /* renamed from: v */
    public final C20157jl m54783v() {
        return this.f53571v;
    }

    @NotNull
    /* renamed from: w */
    public final C20157jl m54782w() {
        return this.f53571v;
    }

    @NotNull
    /* renamed from: a */
    public final C21020tl m54786a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C20157jl configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C21020tl(str, list, configs);
    }
}
