package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastEventOwner;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastVerification implements VastEventOwner {
    @NotNull
    private final Set<VastEvent> events;
    @Nullable
    private final VastBaseVerificationResource resource;
    @Nullable
    private final String vendor;
    @Nullable
    private final String verificationParameters;

    public VastVerification(@Nullable String str, @NotNull Set<VastEvent> events, @Nullable VastBaseVerificationResource vastBaseVerificationResource, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.vendor = str;
        this.events = events;
        this.resource = vastBaseVerificationResource;
        this.verificationParameters = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastVerification copy$default(VastVerification vastVerification, String str, Set set, VastBaseVerificationResource vastBaseVerificationResource, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vastVerification.vendor;
        }
        if ((i & 2) != 0) {
            set = vastVerification.getEvents();
        }
        if ((i & 4) != 0) {
            vastBaseVerificationResource = vastVerification.resource;
        }
        if ((i & 8) != 0) {
            str2 = vastVerification.verificationParameters;
        }
        return vastVerification.copy(str, set, vastBaseVerificationResource, str2);
    }

    @Nullable
    public final String component1() {
        return this.vendor;
    }

    @NotNull
    public final Set<VastEvent> component2() {
        return getEvents();
    }

    @Nullable
    public final VastBaseVerificationResource component3() {
        return this.resource;
    }

    @Nullable
    public final String component4() {
        return this.verificationParameters;
    }

    @NotNull
    public final VastVerification copy(@Nullable String str, @NotNull Set<VastEvent> events, @Nullable VastBaseVerificationResource vastBaseVerificationResource, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new VastVerification(str, events, vastBaseVerificationResource, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastVerification) {
                VastVerification vastVerification = (VastVerification) obj;
                if (!Intrinsics.m17075f(this.vendor, vastVerification.vendor) || !Intrinsics.m17075f(getEvents(), vastVerification.getEvents()) || !Intrinsics.m17075f(this.resource, vastVerification.resource) || !Intrinsics.m17075f(this.verificationParameters, vastVerification.verificationParameters)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType);
    }

    @Nullable
    public final VastBaseVerificationResource getResource() {
        return this.resource;
    }

    @Nullable
    public final String getVendor() {
        return this.vendor;
    }

    @Nullable
    public final String getVerificationParameters() {
        return this.verificationParameters;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.vendor;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        Set<VastEvent> events = getEvents();
        if (events != null) {
            i2 = events.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        VastBaseVerificationResource vastBaseVerificationResource = this.resource;
        if (vastBaseVerificationResource != null) {
            i3 = vastBaseVerificationResource.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.verificationParameters;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i7 + i4;
    }

    @NotNull
    public String toString() {
        return "VastVerification(vendor=" + this.vendor + ", events=" + getEvents() + ", resource=" + this.resource + ", verificationParameters=" + this.verificationParameters + ")";
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType, str);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents() {
        return this.events;
    }
}
