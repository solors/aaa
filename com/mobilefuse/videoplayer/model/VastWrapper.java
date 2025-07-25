package com.mobilefuse.videoplayer.model;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastWrapper implements VastAdContent {
    @Nullable
    private final Boolean allowMultipleAds;
    @Nullable
    private final Boolean fallbackOnNoAd;
    @Nullable
    private final Boolean followAdditionalWrappers;
    @Nullable
    private final String vastAdTagUri;
    @NotNull
    private final VastAdContent vastInline;

    public VastWrapper(@NotNull VastAdContent vastInline, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(vastInline, "vastInline");
        this.vastInline = vastInline;
        this.followAdditionalWrappers = bool;
        this.allowMultipleAds = bool2;
        this.fallbackOnNoAd = bool3;
        this.vastAdTagUri = str;
    }

    public static /* synthetic */ VastWrapper copy$default(VastWrapper vastWrapper, VastAdContent vastAdContent, Boolean bool, Boolean bool2, Boolean bool3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            vastAdContent = vastWrapper.vastInline;
        }
        if ((i & 2) != 0) {
            bool = vastWrapper.followAdditionalWrappers;
        }
        Boolean bool4 = bool;
        if ((i & 4) != 0) {
            bool2 = vastWrapper.allowMultipleAds;
        }
        Boolean bool5 = bool2;
        if ((i & 8) != 0) {
            bool3 = vastWrapper.fallbackOnNoAd;
        }
        Boolean bool6 = bool3;
        if ((i & 16) != 0) {
            str = vastWrapper.vastAdTagUri;
        }
        return vastWrapper.copy(vastAdContent, bool4, bool5, bool6, str);
    }

    @NotNull
    public final VastAdContent component1() {
        return this.vastInline;
    }

    @Nullable
    public final Boolean component2() {
        return this.followAdditionalWrappers;
    }

    @Nullable
    public final Boolean component3() {
        return this.allowMultipleAds;
    }

    @Nullable
    public final Boolean component4() {
        return this.fallbackOnNoAd;
    }

    @Nullable
    public final String component5() {
        return this.vastAdTagUri;
    }

    @NotNull
    public final VastWrapper copy(@NotNull VastAdContent vastInline, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(vastInline, "vastInline");
        return new VastWrapper(vastInline, bool, bool2, bool3, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastWrapper) {
                VastWrapper vastWrapper = (VastWrapper) obj;
                if (!Intrinsics.m17075f(this.vastInline, vastWrapper.vastInline) || !Intrinsics.m17075f(this.followAdditionalWrappers, vastWrapper.followAdditionalWrappers) || !Intrinsics.m17075f(this.allowMultipleAds, vastWrapper.allowMultipleAds) || !Intrinsics.m17075f(this.fallbackOnNoAd, vastWrapper.fallbackOnNoAd) || !Intrinsics.m17075f(this.vastAdTagUri, vastWrapper.vastAdTagUri)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdServingId() {
        return this.vastInline.getAdServingId();
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdSystem() {
        return this.vastInline.getAdSystem();
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdTitle() {
        return this.vastInline.getAdTitle();
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdvertiser() {
        return this.vastInline.getAdvertiser();
    }

    @Nullable
    public final Boolean getAllowMultipleAds() {
        return this.allowMultipleAds;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @NotNull
    public List<VastCreative> getCreativeList() {
        return this.vastInline.getCreativeList();
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getDescription() {
        return this.vastInline.getDescription();
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents() {
        return this.vastInline.getEvents();
    }

    @Nullable
    public final Boolean getFallbackOnNoAd() {
        return this.fallbackOnNoAd;
    }

    @Nullable
    public final Boolean getFollowAdditionalWrappers() {
        return this.followAdditionalWrappers;
    }

    @Nullable
    public final String getVastAdTagUri() {
        return this.vastAdTagUri;
    }

    @NotNull
    public final VastAdContent getVastInline() {
        return this.vastInline;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @NotNull
    public List<VastVerification> getVerificationList() {
        return this.vastInline.getVerificationList();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        VastAdContent vastAdContent = this.vastInline;
        int i5 = 0;
        if (vastAdContent != null) {
            i = vastAdContent.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Boolean bool = this.followAdditionalWrappers;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Boolean bool2 = this.allowMultipleAds;
        if (bool2 != null) {
            i3 = bool2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        Boolean bool3 = this.fallbackOnNoAd;
        if (bool3 != null) {
            i4 = bool3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str = this.vastAdTagUri;
        if (str != null) {
            i5 = str.hashCode();
        }
        return i9 + i5;
    }

    @NotNull
    public String toString() {
        return "VastWrapper(vastInline=" + this.vastInline + ", followAdditionalWrappers=" + this.followAdditionalWrappers + ", allowMultipleAds=" + this.allowMultipleAds + ", fallbackOnNoAd=" + this.fallbackOnNoAd + ", vastAdTagUri=" + this.vastAdTagUri + ")";
    }

    public /* synthetic */ VastWrapper(VastAdContent vastAdContent, Boolean bool, Boolean bool2, Boolean bool3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vastAdContent, bool, bool2, bool3, (i & 16) != 0 ? null : str);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return this.vastInline.getEvents(eventType);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return this.vastInline.getEvents(eventType, str);
    }
}
