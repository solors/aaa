package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.L5 */
/* loaded from: classes6.dex */
public final class C19005L5 {

    /* renamed from: a */
    public final long f47430a;

    /* renamed from: b */
    public final String f47431b;

    /* renamed from: c */
    public final String f47432c;

    /* renamed from: d */
    public final String f47433d;

    /* renamed from: e */
    public final String f47434e;

    /* renamed from: f */
    public final String f47435f;

    /* renamed from: g */
    public final boolean f47436g;

    /* renamed from: h */
    public long f47437h;

    public C19005L5(long j, String placementType, String adType, String markupType, String creativeType, String metaDataBlob, boolean z, long j2) {
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(metaDataBlob, "metaDataBlob");
        this.f47430a = j;
        this.f47431b = placementType;
        this.f47432c = adType;
        this.f47433d = markupType;
        this.f47434e = creativeType;
        this.f47435f = metaDataBlob;
        this.f47436g = z;
        this.f47437h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19005L5)) {
            return false;
        }
        C19005L5 c19005l5 = (C19005L5) obj;
        if (this.f47430a == c19005l5.f47430a && Intrinsics.m17075f(this.f47431b, c19005l5.f47431b) && Intrinsics.m17075f(this.f47432c, c19005l5.f47432c) && Intrinsics.m17075f(this.f47433d, c19005l5.f47433d) && Intrinsics.m17075f(this.f47434e, c19005l5.f47434e) && Intrinsics.m17075f(this.f47435f, c19005l5.f47435f) && this.f47436g == c19005l5.f47436g && this.f47437h == c19005l5.f47437h) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f47431b.hashCode();
        int hashCode2 = this.f47432c.hashCode();
        int hashCode3 = this.f47433d.hashCode();
        int hashCode4 = this.f47434e.hashCode();
        int hashCode5 = (this.f47435f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Long.hashCode(this.f47430a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z = this.f47436g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Long.hashCode(this.f47437h) + ((hashCode5 + i) * 31);
    }

    public final String toString() {
        return "LandingPageTelemetryMetaData(placementId=" + this.f47430a + ", placementType=" + this.f47431b + ", adType=" + this.f47432c + ", markupType=" + this.f47433d + ", creativeType=" + this.f47434e + ", metaDataBlob=" + this.f47435f + ", isRewarded=" + this.f47436g + ", startTime=" + this.f47437h + ')';
    }
}
