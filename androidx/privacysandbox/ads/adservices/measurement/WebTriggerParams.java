package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebTriggerParams.kt */
@RequiresApi(33)
@Metadata
/* loaded from: classes2.dex */
public final class WebTriggerParams {
    private final boolean debugKeyAllowed;
    @NotNull
    private final Uri registrationUri;

    public WebTriggerParams(@NotNull Uri registrationUri, boolean z) {
        Intrinsics.checkNotNullParameter(registrationUri, "registrationUri");
        this.registrationUri = registrationUri;
        this.debugKeyAllowed = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerParams)) {
            return false;
        }
        WebTriggerParams webTriggerParams = (WebTriggerParams) obj;
        if (Intrinsics.m17075f(this.registrationUri, webTriggerParams.registrationUri) && this.debugKeyAllowed == webTriggerParams.debugKeyAllowed) {
            return true;
        }
        return false;
    }

    public final boolean getDebugKeyAllowed() {
        return this.debugKeyAllowed;
    }

    @NotNull
    public final Uri getRegistrationUri() {
        return this.registrationUri;
    }

    public int hashCode() {
        return (this.registrationUri.hashCode() * 31) + Boolean.hashCode(this.debugKeyAllowed);
    }

    @NotNull
    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.registrationUri + ", DebugKeyAllowed=" + this.debugKeyAllowed + " }";
    }
}
