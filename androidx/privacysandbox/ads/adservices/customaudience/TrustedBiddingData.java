package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TrustedBiddingData.kt */
@Metadata
/* loaded from: classes2.dex */
public final class TrustedBiddingData {
    @NotNull
    private final List<String> trustedBiddingKeys;
    @NotNull
    private final Uri trustedBiddingUri;

    public TrustedBiddingData(@NotNull Uri trustedBiddingUri, @NotNull List<String> trustedBiddingKeys) {
        Intrinsics.checkNotNullParameter(trustedBiddingUri, "trustedBiddingUri");
        Intrinsics.checkNotNullParameter(trustedBiddingKeys, "trustedBiddingKeys");
        this.trustedBiddingUri = trustedBiddingUri;
        this.trustedBiddingKeys = trustedBiddingKeys;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedBiddingData)) {
            return false;
        }
        TrustedBiddingData trustedBiddingData = (TrustedBiddingData) obj;
        if (Intrinsics.m17075f(this.trustedBiddingUri, trustedBiddingData.trustedBiddingUri) && Intrinsics.m17075f(this.trustedBiddingKeys, trustedBiddingData.trustedBiddingKeys)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<String> getTrustedBiddingKeys() {
        return this.trustedBiddingKeys;
    }

    @NotNull
    public final Uri getTrustedBiddingUri() {
        return this.trustedBiddingUri;
    }

    public int hashCode() {
        return (this.trustedBiddingUri.hashCode() * 31) + this.trustedBiddingKeys.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.trustedBiddingUri + " trustedBiddingKeys=" + this.trustedBiddingKeys;
    }
}
