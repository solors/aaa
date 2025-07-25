package androidx.privacysandbox.ads.adservices.common;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdData.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AdData {
    @NotNull
    private final String metadata;
    @NotNull
    private final Uri renderUri;

    public AdData(@NotNull Uri renderUri, @NotNull String metadata) {
        Intrinsics.checkNotNullParameter(renderUri, "renderUri");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.renderUri = renderUri;
        this.metadata = metadata;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) obj;
        if (Intrinsics.m17075f(this.renderUri, adData.renderUri) && Intrinsics.m17075f(this.metadata, adData.metadata)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        return (this.renderUri.hashCode() * 31) + this.metadata.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdData: renderUri=" + this.renderUri + ", metadata='" + this.metadata + '\'';
    }
}
