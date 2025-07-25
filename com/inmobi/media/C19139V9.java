package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.V9 */
/* loaded from: classes6.dex */
public final class C19139V9 {

    /* renamed from: a */
    public final C18971J f47860a;

    /* renamed from: b */
    public final String f47861b;

    /* renamed from: c */
    public final String f47862c;

    /* renamed from: d */
    public final int f47863d;

    /* renamed from: e */
    public final String f47864e;

    /* renamed from: f */
    public final String f47865f;

    /* renamed from: g */
    public final boolean f47866g;

    /* renamed from: h */
    public final int f47867h;

    /* renamed from: i */
    public final C19517x0 f47868i;

    /* renamed from: j */
    public final C19178Y9 f47869j;

    public C19139V9(C18971J placement, String markupType, String telemetryMetadataBlob, int i, String creativeType, String creativeId, boolean z, int i2, C19517x0 adUnitTelemetryData, C19178Y9 renderViewTelemetryData) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(adUnitTelemetryData, "adUnitTelemetryData");
        Intrinsics.checkNotNullParameter(renderViewTelemetryData, "renderViewTelemetryData");
        this.f47860a = placement;
        this.f47861b = markupType;
        this.f47862c = telemetryMetadataBlob;
        this.f47863d = i;
        this.f47864e = creativeType;
        this.f47865f = creativeId;
        this.f47866g = z;
        this.f47867h = i2;
        this.f47868i = adUnitTelemetryData;
        this.f47869j = renderViewTelemetryData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19139V9)) {
            return false;
        }
        C19139V9 c19139v9 = (C19139V9) obj;
        if (Intrinsics.m17075f(this.f47860a, c19139v9.f47860a) && Intrinsics.m17075f(this.f47861b, c19139v9.f47861b) && Intrinsics.m17075f(this.f47862c, c19139v9.f47862c) && this.f47863d == c19139v9.f47863d && Intrinsics.m17075f(this.f47864e, c19139v9.f47864e) && Intrinsics.m17075f(this.f47865f, c19139v9.f47865f) && this.f47866g == c19139v9.f47866g && this.f47867h == c19139v9.f47867h && Intrinsics.m17075f(this.f47868i, c19139v9.f47868i) && Intrinsics.m17075f(this.f47869j, c19139v9.f47869j)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f47861b.hashCode();
        int hashCode2 = this.f47862c.hashCode();
        int hashCode3 = Integer.hashCode(this.f47863d);
        int hashCode4 = this.f47864e.hashCode();
        int hashCode5 = (this.f47865f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f47860a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z = this.f47866g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode6 = Integer.hashCode(this.f47867h);
        int hashCode7 = this.f47868i.hashCode();
        return Integer.hashCode(this.f47869j.f48018a) + ((hashCode7 + ((hashCode6 + ((hashCode5 + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.f47860a + ", markupType=" + this.f47861b + ", telemetryMetadataBlob=" + this.f47862c + ", internetAvailabilityAdRetryCount=" + this.f47863d + ", creativeType=" + this.f47864e + ", creativeId=" + this.f47865f + ", isRewarded=" + this.f47866g + ", adIndex=" + this.f47867h + ", adUnitTelemetryData=" + this.f47868i + ", renderViewTelemetryData=" + this.f47869j + ')';
    }
}
