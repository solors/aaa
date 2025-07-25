package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSourceRegistrationRequest.kt */
@RequiresApi(33)
@Metadata
/* loaded from: classes2.dex */
public final class WebSourceRegistrationRequest {
    @Nullable
    private final Uri appDestination;
    @Nullable
    private final InputEvent inputEvent;
    @NotNull
    private final Uri topOriginUri;
    @Nullable
    private final Uri verifiedDestination;
    @Nullable
    private final Uri webDestination;
    @NotNull
    private final List<WebSourceParams> webSourceParams;

    /* compiled from: WebSourceRegistrationRequest.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Builder {
        @Nullable
        private Uri appDestination;
        @Nullable
        private InputEvent inputEvent;
        @NotNull
        private final Uri topOriginUri;
        @Nullable
        private Uri verifiedDestination;
        @Nullable
        private Uri webDestination;
        @NotNull
        private final List<WebSourceParams> webSourceParams;

        public Builder(@NotNull List<WebSourceParams> webSourceParams, @NotNull Uri topOriginUri) {
            Intrinsics.checkNotNullParameter(webSourceParams, "webSourceParams");
            Intrinsics.checkNotNullParameter(topOriginUri, "topOriginUri");
            this.webSourceParams = webSourceParams;
            this.topOriginUri = topOriginUri;
        }

        @NotNull
        public final WebSourceRegistrationRequest build() {
            return new WebSourceRegistrationRequest(this.webSourceParams, this.topOriginUri, this.inputEvent, this.appDestination, this.webDestination, this.verifiedDestination);
        }

        @NotNull
        public final Builder setAppDestination(@Nullable Uri uri) {
            this.appDestination = uri;
            return this;
        }

        @NotNull
        public final Builder setInputEvent(@NotNull InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
            this.inputEvent = inputEvent;
            return this;
        }

        @NotNull
        public final Builder setVerifiedDestination(@Nullable Uri uri) {
            this.verifiedDestination = uri;
            return this;
        }

        @NotNull
        public final Builder setWebDestination(@Nullable Uri uri) {
            this.webDestination = uri;
            return this;
        }
    }

    public WebSourceRegistrationRequest(@NotNull List<WebSourceParams> webSourceParams, @NotNull Uri topOriginUri, @Nullable InputEvent inputEvent, @Nullable Uri uri, @Nullable Uri uri2, @Nullable Uri uri3) {
        Intrinsics.checkNotNullParameter(webSourceParams, "webSourceParams");
        Intrinsics.checkNotNullParameter(topOriginUri, "topOriginUri");
        this.webSourceParams = webSourceParams;
        this.topOriginUri = topOriginUri;
        this.inputEvent = inputEvent;
        this.appDestination = uri;
        this.webDestination = uri2;
        this.verifiedDestination = uri3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSourceRegistrationRequest)) {
            return false;
        }
        WebSourceRegistrationRequest webSourceRegistrationRequest = (WebSourceRegistrationRequest) obj;
        if (Intrinsics.m17075f(this.webSourceParams, webSourceRegistrationRequest.webSourceParams) && Intrinsics.m17075f(this.webDestination, webSourceRegistrationRequest.webDestination) && Intrinsics.m17075f(this.appDestination, webSourceRegistrationRequest.appDestination) && Intrinsics.m17075f(this.topOriginUri, webSourceRegistrationRequest.topOriginUri) && Intrinsics.m17075f(this.inputEvent, webSourceRegistrationRequest.inputEvent) && Intrinsics.m17075f(this.verifiedDestination, webSourceRegistrationRequest.verifiedDestination)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Uri getAppDestination() {
        return this.appDestination;
    }

    @Nullable
    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    @NotNull
    public final Uri getTopOriginUri() {
        return this.topOriginUri;
    }

    @Nullable
    public final Uri getVerifiedDestination() {
        return this.verifiedDestination;
    }

    @Nullable
    public final Uri getWebDestination() {
        return this.webDestination;
    }

    @NotNull
    public final List<WebSourceParams> getWebSourceParams() {
        return this.webSourceParams;
    }

    public int hashCode() {
        int hashCode = (this.webSourceParams.hashCode() * 31) + this.topOriginUri.hashCode();
        InputEvent inputEvent = this.inputEvent;
        if (inputEvent != null) {
            hashCode = (hashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.appDestination;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.webDestination;
        if (uri2 != null) {
            hashCode = (hashCode * 31) + uri2.hashCode();
        }
        int hashCode2 = (hashCode * 31) + this.topOriginUri.hashCode();
        InputEvent inputEvent2 = this.inputEvent;
        if (inputEvent2 != null) {
            hashCode2 = (hashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.verifiedDestination;
        if (uri3 != null) {
            return (hashCode2 * 31) + uri3.hashCode();
        }
        return hashCode2;
    }

    @NotNull
    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.webSourceParams + "], TopOriginUri=" + this.topOriginUri + ", InputEvent=" + this.inputEvent + ", AppDestination=" + this.appDestination + ", WebDestination=" + this.webDestination + ", VerifiedDestination=" + this.verifiedDestination) + " }";
    }

    public /* synthetic */ WebSourceRegistrationRequest(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, uri, (i & 4) != 0 ? null : inputEvent, (i & 8) != 0 ? null : uri2, (i & 16) != 0 ? null : uri3, (i & 32) != 0 ? null : uri4);
    }
}
