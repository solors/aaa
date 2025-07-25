package com.inmobi.media;

import com.inmobi.commons.core.configs.SignalsConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.P8 */
/* loaded from: classes6.dex */
public final class C19061P8 {

    /* renamed from: a */
    public final String f47624a;

    /* renamed from: b */
    public final String f47625b;

    /* renamed from: c */
    public final SignalsConfig.NovatiqConfig f47626c;

    public C19061P8(String hyperId, String spHost, SignalsConfig.NovatiqConfig novatiqConfig) {
        Intrinsics.checkNotNullParameter(hyperId, "hyperId");
        Intrinsics.checkNotNullParameter("i6i", "sspId");
        Intrinsics.checkNotNullParameter(spHost, "spHost");
        Intrinsics.checkNotNullParameter("inmobi", "pubId");
        Intrinsics.checkNotNullParameter(novatiqConfig, "novatiqConfig");
        this.f47624a = hyperId;
        this.f47625b = spHost;
        this.f47626c = novatiqConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19061P8)) {
            return false;
        }
        C19061P8 c19061p8 = (C19061P8) obj;
        if (Intrinsics.m17075f(this.f47624a, c19061p8.f47624a) && Intrinsics.m17075f("i6i", "i6i") && Intrinsics.m17075f(this.f47625b, c19061p8.f47625b) && Intrinsics.m17075f("inmobi", "inmobi") && Intrinsics.m17075f(this.f47626c, c19061p8.f47626c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f47625b.hashCode();
        return this.f47626c.hashCode() + ((((hashCode + (((this.f47624a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098) * 31);
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f47624a + ", sspId=i6i, spHost=" + this.f47625b + ", pubId=inmobi, novatiqConfig=" + this.f47626c + ')';
    }
}
