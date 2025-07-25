package com.mobilefuse.videoplayer.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastCreative {
    @Nullable
    private final String adId;
    @Nullable
    private final String apiFramework;
    @Nullable
    private final String companionAdsRequiredMode;
    @NotNull
    private final List<VastCompanion> companionList;
    @Nullable

    /* renamed from: id */
    private final String f61732id;
    @Nullable
    private final VastLinear linear;
    @Nullable
    private final Integer sequence;
    @NotNull
    private final List<VastUniversalAdId> universalAdIdList;

    public VastCreative(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull List<VastUniversalAdId> universalAdIdList, @Nullable VastLinear vastLinear, @NotNull List<VastCompanion> companionList, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(universalAdIdList, "universalAdIdList");
        Intrinsics.checkNotNullParameter(companionList, "companionList");
        this.f61732id = str;
        this.adId = str2;
        this.sequence = num;
        this.apiFramework = str3;
        this.universalAdIdList = universalAdIdList;
        this.linear = vastLinear;
        this.companionList = companionList;
        this.companionAdsRequiredMode = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastCreative copy$default(VastCreative vastCreative, String str, String str2, Integer num, String str3, List list, VastLinear vastLinear, List list2, String str4, int i, Object obj) {
        String str5;
        String str6;
        Integer num2;
        String str7;
        List<VastUniversalAdId> list3;
        VastLinear vastLinear2;
        List<VastCompanion> list4;
        String str8;
        if ((i & 1) != 0) {
            str5 = vastCreative.f61732id;
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            str6 = vastCreative.adId;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            num2 = vastCreative.sequence;
        } else {
            num2 = num;
        }
        if ((i & 8) != 0) {
            str7 = vastCreative.apiFramework;
        } else {
            str7 = str3;
        }
        if ((i & 16) != 0) {
            list3 = vastCreative.universalAdIdList;
        } else {
            list3 = list;
        }
        if ((i & 32) != 0) {
            vastLinear2 = vastCreative.linear;
        } else {
            vastLinear2 = vastLinear;
        }
        if ((i & 64) != 0) {
            list4 = vastCreative.companionList;
        } else {
            list4 = list2;
        }
        if ((i & 128) != 0) {
            str8 = vastCreative.companionAdsRequiredMode;
        } else {
            str8 = str4;
        }
        return vastCreative.copy(str5, str6, num2, str7, list3, vastLinear2, list4, str8);
    }

    @Nullable
    public final String component1() {
        return this.f61732id;
    }

    @Nullable
    public final String component2() {
        return this.adId;
    }

    @Nullable
    public final Integer component3() {
        return this.sequence;
    }

    @Nullable
    public final String component4() {
        return this.apiFramework;
    }

    @NotNull
    public final List<VastUniversalAdId> component5() {
        return this.universalAdIdList;
    }

    @Nullable
    public final VastLinear component6() {
        return this.linear;
    }

    @NotNull
    public final List<VastCompanion> component7() {
        return this.companionList;
    }

    @Nullable
    public final String component8() {
        return this.companionAdsRequiredMode;
    }

    @NotNull
    public final VastCreative copy(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull List<VastUniversalAdId> universalAdIdList, @Nullable VastLinear vastLinear, @NotNull List<VastCompanion> companionList, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(universalAdIdList, "universalAdIdList");
        Intrinsics.checkNotNullParameter(companionList, "companionList");
        return new VastCreative(str, str2, num, str3, universalAdIdList, vastLinear, companionList, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastCreative) {
                VastCreative vastCreative = (VastCreative) obj;
                if (!Intrinsics.m17075f(this.f61732id, vastCreative.f61732id) || !Intrinsics.m17075f(this.adId, vastCreative.adId) || !Intrinsics.m17075f(this.sequence, vastCreative.sequence) || !Intrinsics.m17075f(this.apiFramework, vastCreative.apiFramework) || !Intrinsics.m17075f(this.universalAdIdList, vastCreative.universalAdIdList) || !Intrinsics.m17075f(this.linear, vastCreative.linear) || !Intrinsics.m17075f(this.companionList, vastCreative.companionList) || !Intrinsics.m17075f(this.companionAdsRequiredMode, vastCreative.companionAdsRequiredMode)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final String getApiFramework() {
        return this.apiFramework;
    }

    @Nullable
    public final String getCompanionAdsRequiredMode() {
        return this.companionAdsRequiredMode;
    }

    @NotNull
    public final List<VastCompanion> getCompanionList() {
        return this.companionList;
    }

    @Nullable
    public final String getId() {
        return this.f61732id;
    }

    @Nullable
    public final VastLinear getLinear() {
        return this.linear;
    }

    @Nullable
    public final Integer getSequence() {
        return this.sequence;
    }

    @NotNull
    public final List<VastUniversalAdId> getUniversalAdIdList() {
        return this.universalAdIdList;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = this.f61732id;
        int i8 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 31;
        String str2 = this.adId;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        Integer num = this.sequence;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        String str3 = this.apiFramework;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        List<VastUniversalAdId> list = this.universalAdIdList;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        VastLinear vastLinear = this.linear;
        if (vastLinear != null) {
            i6 = vastLinear.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        List<VastCompanion> list2 = this.companionList;
        if (list2 != null) {
            i7 = list2.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        String str4 = this.companionAdsRequiredMode;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i15 + i8;
    }

    @NotNull
    public String toString() {
        return "VastCreative(id=" + this.f61732id + ", adId=" + this.adId + ", sequence=" + this.sequence + ", apiFramework=" + this.apiFramework + ", universalAdIdList=" + this.universalAdIdList + ", linear=" + this.linear + ", companionList=" + this.companionList + ", companionAdsRequiredMode=" + this.companionAdsRequiredMode + ")";
    }
}
