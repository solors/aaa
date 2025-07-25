package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetTopicsRequest.kt */
@Metadata
/* loaded from: classes2.dex */
public final class GetTopicsRequest {
    @NotNull
    private final String adsSdkName;
    private final boolean shouldRecordObservation;

    /* compiled from: GetTopicsRequest.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Builder {
        @NotNull
        private String adsSdkName = "";
        private boolean shouldRecordObservation = true;

        @NotNull
        public final GetTopicsRequest build() {
            boolean z;
            if (this.adsSdkName.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new GetTopicsRequest(this.adsSdkName, this.shouldRecordObservation);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        @NotNull
        public final Builder setAdsSdkName(@NotNull String adsSdkName) {
            Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
            this.adsSdkName = adsSdkName;
            return this;
        }

        @NotNull
        public final Builder setShouldRecordObservation(boolean z) {
            this.shouldRecordObservation = z;
            return this;
        }
    }

    public GetTopicsRequest() {
        this(null, false, 3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) obj;
        if (Intrinsics.m17075f(this.adsSdkName, getTopicsRequest.adsSdkName) && this.shouldRecordObservation == getTopicsRequest.shouldRecordObservation) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + Boolean.hashCode(this.shouldRecordObservation);
    }

    public final boolean shouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    @NotNull
    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }

    public GetTopicsRequest(@NotNull String adsSdkName, boolean z) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.adsSdkName = adsSdkName;
        this.shouldRecordObservation = z;
    }

    public /* synthetic */ GetTopicsRequest(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
