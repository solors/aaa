package androidx.privacysandbox.ads.adservices.adid;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdId.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AdId {
    @NotNull
    private final String adId;
    private final boolean isLimitAdTrackingEnabled;

    public AdId(@NotNull String adId, boolean z) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.adId = adId;
        this.isLimitAdTrackingEnabled = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        if (Intrinsics.m17075f(this.adId, adId.adId) && this.isLimitAdTrackingEnabled == adId.isLimitAdTrackingEnabled) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAdId() {
        return this.adId;
    }

    public int hashCode() {
        return (this.adId.hashCode() * 31) + Boolean.hashCode(this.isLimitAdTrackingEnabled);
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    @NotNull
    public String toString() {
        return "AdId: adId=" + this.adId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled;
    }

    public /* synthetic */ AdId(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
