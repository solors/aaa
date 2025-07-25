package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastAdContent;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastInline implements VastAdContent {
    @Nullable
    private final String adServingId;
    @Nullable
    private final String adSystem;
    @Nullable
    private final String adTitle;
    @Nullable
    private final String advertiser;
    @NotNull
    private final List<VastCreative> creativeList;
    @Nullable
    private final String description;
    @NotNull
    private final Set<VastEvent> events;
    @NotNull
    private final List<VastVerification> verificationList;

    public VastInline(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull Set<VastEvent> events, @NotNull List<VastCreative> creativeList, @NotNull List<VastVerification> verificationList) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(creativeList, "creativeList");
        Intrinsics.checkNotNullParameter(verificationList, "verificationList");
        this.adSystem = str;
        this.adTitle = str2;
        this.adServingId = str3;
        this.description = str4;
        this.advertiser = str5;
        this.events = events;
        this.creativeList = creativeList;
        this.verificationList = verificationList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastInline copy$default(VastInline vastInline, String str, String str2, String str3, String str4, String str5, Set set, List list, List list2, int i, Object obj) {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Set<VastEvent> set2;
        List<VastCreative> list3;
        List<VastVerification> list4;
        if ((i & 1) != 0) {
            str6 = vastInline.getAdSystem();
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            str7 = vastInline.getAdTitle();
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            str8 = vastInline.getAdServingId();
        } else {
            str8 = str3;
        }
        if ((i & 8) != 0) {
            str9 = vastInline.getDescription();
        } else {
            str9 = str4;
        }
        if ((i & 16) != 0) {
            str10 = vastInline.getAdvertiser();
        } else {
            str10 = str5;
        }
        if ((i & 32) != 0) {
            set2 = vastInline.getEvents();
        } else {
            set2 = set;
        }
        if ((i & 64) != 0) {
            list3 = vastInline.getCreativeList();
        } else {
            list3 = list;
        }
        if ((i & 128) != 0) {
            list4 = vastInline.getVerificationList();
        } else {
            list4 = list2;
        }
        return vastInline.copy(str6, str7, str8, str9, str10, set2, list3, list4);
    }

    @Nullable
    public final String component1() {
        return getAdSystem();
    }

    @Nullable
    public final String component2() {
        return getAdTitle();
    }

    @Nullable
    public final String component3() {
        return getAdServingId();
    }

    @Nullable
    public final String component4() {
        return getDescription();
    }

    @Nullable
    public final String component5() {
        return getAdvertiser();
    }

    @NotNull
    public final Set<VastEvent> component6() {
        return getEvents();
    }

    @NotNull
    public final List<VastCreative> component7() {
        return getCreativeList();
    }

    @NotNull
    public final List<VastVerification> component8() {
        return getVerificationList();
    }

    @NotNull
    public final VastInline copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull Set<VastEvent> events, @NotNull List<VastCreative> creativeList, @NotNull List<VastVerification> verificationList) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(creativeList, "creativeList");
        Intrinsics.checkNotNullParameter(verificationList, "verificationList");
        return new VastInline(str, str2, str3, str4, str5, events, creativeList, verificationList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastInline) {
                VastInline vastInline = (VastInline) obj;
                if (!Intrinsics.m17075f(getAdSystem(), vastInline.getAdSystem()) || !Intrinsics.m17075f(getAdTitle(), vastInline.getAdTitle()) || !Intrinsics.m17075f(getAdServingId(), vastInline.getAdServingId()) || !Intrinsics.m17075f(getDescription(), vastInline.getDescription()) || !Intrinsics.m17075f(getAdvertiser(), vastInline.getAdvertiser()) || !Intrinsics.m17075f(getEvents(), vastInline.getEvents()) || !Intrinsics.m17075f(getCreativeList(), vastInline.getCreativeList()) || !Intrinsics.m17075f(getVerificationList(), vastInline.getVerificationList())) {
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
        return this.adServingId;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdSystem() {
        return this.adSystem;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdTitle() {
        return this.adTitle;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @NotNull
    public List<VastCreative> getCreativeList() {
        return this.creativeList;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastAdContent.DefaultImpls.getEvents(this, eventType);
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @NotNull
    public List<VastVerification> getVerificationList() {
        return this.verificationList;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String adSystem = getAdSystem();
        int i8 = 0;
        if (adSystem != null) {
            i = adSystem.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 31;
        String adTitle = getAdTitle();
        if (adTitle != null) {
            i2 = adTitle.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        String adServingId = getAdServingId();
        if (adServingId != null) {
            i3 = adServingId.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        String description = getDescription();
        if (description != null) {
            i4 = description.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        String advertiser = getAdvertiser();
        if (advertiser != null) {
            i5 = advertiser.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        Set<VastEvent> events = getEvents();
        if (events != null) {
            i6 = events.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        List<VastCreative> creativeList = getCreativeList();
        if (creativeList != null) {
            i7 = creativeList.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        List<VastVerification> verificationList = getVerificationList();
        if (verificationList != null) {
            i8 = verificationList.hashCode();
        }
        return i15 + i8;
    }

    @NotNull
    public String toString() {
        return "VastInline(adSystem=" + getAdSystem() + ", adTitle=" + getAdTitle() + ", adServingId=" + getAdServingId() + ", description=" + getDescription() + ", advertiser=" + getAdvertiser() + ", events=" + getEvents() + ", creativeList=" + getCreativeList() + ", verificationList=" + getVerificationList() + ")";
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastAdContent.DefaultImpls.getEvents(this, eventType, str);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents() {
        return this.events;
    }
}
