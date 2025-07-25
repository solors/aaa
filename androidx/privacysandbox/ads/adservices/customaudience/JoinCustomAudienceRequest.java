package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JoinCustomAudienceRequest.kt */
@Metadata
/* loaded from: classes2.dex */
public final class JoinCustomAudienceRequest {
    @NotNull
    private final CustomAudience customAudience;

    public JoinCustomAudienceRequest(@NotNull CustomAudience customAudience) {
        Intrinsics.checkNotNullParameter(customAudience, "customAudience");
        this.customAudience = customAudience;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinCustomAudienceRequest)) {
            return false;
        }
        return Intrinsics.m17075f(this.customAudience, ((JoinCustomAudienceRequest) obj).customAudience);
    }

    @NotNull
    public final CustomAudience getCustomAudience() {
        return this.customAudience;
    }

    public int hashCode() {
        return this.customAudience.hashCode();
    }

    @NotNull
    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.customAudience;
    }
}
