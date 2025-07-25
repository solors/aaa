package com.yandex.mobile.ads.impl;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.t6 */
/* loaded from: classes8.dex */
public final class C31427t6 {

    /* renamed from: a */
    private final boolean f85524a;

    /* renamed from: b */
    private final boolean f85525b;
    @NotNull

    /* renamed from: c */
    private final String f85526c;

    /* renamed from: d */
    private final long f85527d;

    /* renamed from: e */
    private final int f85528e;

    /* renamed from: f */
    private final boolean f85529f;
    @NotNull

    /* renamed from: g */
    private final Set<String> f85530g;
    @NotNull

    /* renamed from: h */
    private final Map<String, C31553u6> f85531h;

    public C31427t6(boolean z, boolean z2, @NotNull String apiKey, long j, int i, boolean z3, @NotNull Set<String> enabledAdUnits, @NotNull Map<String, C31553u6> adNetworksCustomParameters) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(enabledAdUnits, "enabledAdUnits");
        Intrinsics.checkNotNullParameter(adNetworksCustomParameters, "adNetworksCustomParameters");
        this.f85524a = z;
        this.f85525b = z2;
        this.f85526c = apiKey;
        this.f85527d = j;
        this.f85528e = i;
        this.f85529f = z3;
        this.f85530g = enabledAdUnits;
        this.f85531h = adNetworksCustomParameters;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, C31553u6> m29280a() {
        return this.f85531h;
    }

    @NotNull
    /* renamed from: b */
    public final String m29279b() {
        return this.f85526c;
    }

    /* renamed from: c */
    public final boolean m29278c() {
        return this.f85529f;
    }

    /* renamed from: d */
    public final boolean m29277d() {
        return this.f85525b;
    }

    /* renamed from: e */
    public final boolean m29276e() {
        return this.f85524a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31427t6)) {
            return false;
        }
        C31427t6 c31427t6 = (C31427t6) obj;
        if (this.f85524a == c31427t6.f85524a && this.f85525b == c31427t6.f85525b && Intrinsics.m17075f(this.f85526c, c31427t6.f85526c) && this.f85527d == c31427t6.f85527d && this.f85528e == c31427t6.f85528e && this.f85529f == c31427t6.f85529f && Intrinsics.m17075f(this.f85530g, c31427t6.f85530g) && Intrinsics.m17075f(this.f85531h, c31427t6.f85531h)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final Set<String> m29275f() {
        return this.f85530g;
    }

    /* renamed from: g */
    public final int m29274g() {
        return this.f85528e;
    }

    /* renamed from: h */
    public final long m29273h() {
        return this.f85527d;
    }

    public final int hashCode() {
        int m31189a = C31014o3.m31189a(this.f85526c, C31331s6.m29848a(this.f85525b, Boolean.hashCode(this.f85524a) * 31, 31), 31);
        int m29848a = C31331s6.m29848a(this.f85529f, nt1.m31295a(this.f85528e, (Long.hashCode(this.f85527d) + m31189a) * 31, 31), 31);
        return this.f85531h.hashCode() + ((this.f85530g.hashCode() + m29848a) * 31);
    }

    @NotNull
    public final String toString() {
        boolean z = this.f85524a;
        boolean z2 = this.f85525b;
        String str = this.f85526c;
        long j = this.f85527d;
        int i = this.f85528e;
        boolean z3 = this.f85529f;
        Set<String> set = this.f85530g;
        Map<String, C31553u6> map = this.f85531h;
        return "AdQualityVerificationConfiguration(enabled=" + z + ", debug=" + z2 + ", apiKey=" + str + ", validationTimeoutInSec=" + j + ", usagePercent=" + i + ", blockAdOnInternalError=" + z3 + ", enabledAdUnits=" + set + ", adNetworksCustomParameters=" + map + ")";
    }
}
