package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebTriggerRegistrationRequest.kt */
@RequiresApi(33)
@Metadata
/* loaded from: classes2.dex */
public final class WebTriggerRegistrationRequest {
    @NotNull
    private final Uri destination;
    @NotNull
    private final List<WebTriggerParams> webTriggerParams;

    public WebTriggerRegistrationRequest(@NotNull List<WebTriggerParams> webTriggerParams, @NotNull Uri destination) {
        Intrinsics.checkNotNullParameter(webTriggerParams, "webTriggerParams");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.webTriggerParams = webTriggerParams;
        this.destination = destination;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerRegistrationRequest)) {
            return false;
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequest = (WebTriggerRegistrationRequest) obj;
        if (Intrinsics.m17075f(this.webTriggerParams, webTriggerRegistrationRequest.webTriggerParams) && Intrinsics.m17075f(this.destination, webTriggerRegistrationRequest.destination)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Uri getDestination() {
        return this.destination;
    }

    @NotNull
    public final List<WebTriggerParams> getWebTriggerParams() {
        return this.webTriggerParams;
    }

    public int hashCode() {
        return (this.webTriggerParams.hashCode() * 31) + this.destination.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.webTriggerParams + ", Destination=" + this.destination;
    }
}
