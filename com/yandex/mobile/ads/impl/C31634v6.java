package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.v6 */
/* loaded from: classes8.dex */
public final class C31634v6 {

    /* renamed from: a */
    private final int f86573a;

    /* renamed from: b */
    private final boolean f86574b;

    /* renamed from: c */
    private final boolean f86575c;
    @NotNull

    /* renamed from: d */
    private final Map<AdQualityVerifiableNetwork, C29996b7> f86576d;
    @NotNull

    /* renamed from: e */
    private final Set<String> f86577e;

    public C31634v6(int i, boolean z, boolean z2, @NotNull LinkedHashMap adNetworksCustomParameters, @NotNull Set enabledAdUnits) {
        Intrinsics.checkNotNullParameter(adNetworksCustomParameters, "adNetworksCustomParameters");
        Intrinsics.checkNotNullParameter(enabledAdUnits, "enabledAdUnits");
        this.f86573a = i;
        this.f86574b = z;
        this.f86575c = z2;
        this.f86576d = adNetworksCustomParameters;
        this.f86577e = enabledAdUnits;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31634v6)) {
            return false;
        }
        C31634v6 c31634v6 = (C31634v6) obj;
        if (this.f86573a == c31634v6.f86573a && this.f86574b == c31634v6.f86574b && this.f86575c == c31634v6.f86575c && Intrinsics.m17075f(this.f86576d, c31634v6.f86576d) && Intrinsics.m17075f(this.f86577e, c31634v6.f86577e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int m29848a = C31331s6.m29848a(this.f86575c, C31331s6.m29848a(this.f86574b, Integer.hashCode(this.f86573a) * 31, 31), 31);
        return this.f86577e.hashCode() + ((this.f86576d.hashCode() + m29848a) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f86573a;
        boolean z = this.f86574b;
        boolean z2 = this.f86575c;
        Map<AdQualityVerifiableNetwork, C29996b7> map = this.f86576d;
        Set<String> set = this.f86577e;
        return "AdQualityVerificationPolicy(usagePercent=" + i + ", enabled=" + z + ", blockAdOnInternalError=" + z2 + ", adNetworksCustomParameters=" + map + ", enabledAdUnits=" + set + ")";
    }
}
