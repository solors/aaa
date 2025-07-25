package androidx.privacysandbox.ads.adservices.customaudience;

import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LeaveCustomAudienceRequest.kt */
@Metadata
/* loaded from: classes2.dex */
public final class LeaveCustomAudienceRequest {
    @NotNull
    private final AdTechIdentifier buyer;
    @NotNull
    private final String name;

    public LeaveCustomAudienceRequest(@NotNull AdTechIdentifier buyer, @NotNull String name) {
        Intrinsics.checkNotNullParameter(buyer, "buyer");
        Intrinsics.checkNotNullParameter(name, "name");
        this.buyer = buyer;
        this.name = name;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveCustomAudienceRequest)) {
            return false;
        }
        LeaveCustomAudienceRequest leaveCustomAudienceRequest = (LeaveCustomAudienceRequest) obj;
        if (Intrinsics.m17075f(this.buyer, leaveCustomAudienceRequest.buyer) && Intrinsics.m17075f(this.name, leaveCustomAudienceRequest.name)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.buyer.hashCode() * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.buyer + ", name=" + this.name;
    }
}
