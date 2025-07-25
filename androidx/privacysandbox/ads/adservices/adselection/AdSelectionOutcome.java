package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdSelectionOutcome.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AdSelectionOutcome {
    private final long adSelectionId;
    @NotNull
    private final Uri renderUri;

    public AdSelectionOutcome(long j, @NotNull Uri renderUri) {
        Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        this.adSelectionId = j;
        this.renderUri = renderUri;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionOutcome)) {
            return false;
        }
        AdSelectionOutcome adSelectionOutcome = (AdSelectionOutcome) obj;
        if (this.adSelectionId == adSelectionOutcome.adSelectionId && Intrinsics.m17075f(this.renderUri, adSelectionOutcome.renderUri)) {
            return true;
        }
        return false;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    @NotNull
    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        return (Long.hashCode(this.adSelectionId) * 31) + this.renderUri.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.adSelectionId + ", renderUri=" + this.renderUri;
    }
}
