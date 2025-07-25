package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.videoplayer.model.VastAd */
/* loaded from: classes7.dex */
public final class VastDataModel {
    @NotNull
    private final String adType;
    @Nullable
    private final VastAdContent content;
    @Nullable

    /* renamed from: id */
    private final String f61729id;
    @Nullable
    private final Integer sequence;

    public VastDataModel(@Nullable String str, @Nullable Integer num, @NotNull String adType, @Nullable VastAdContent vastAdContent) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f61729id = str;
        this.sequence = num;
        this.adType = adType;
        this.content = vastAdContent;
    }

    public static /* synthetic */ VastDataModel copy$default(VastDataModel vastDataModel, String str, Integer num, String str2, VastAdContent vastAdContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vastDataModel.f61729id;
        }
        if ((i & 2) != 0) {
            num = vastDataModel.sequence;
        }
        if ((i & 4) != 0) {
            str2 = vastDataModel.adType;
        }
        if ((i & 8) != 0) {
            vastAdContent = vastDataModel.content;
        }
        return vastDataModel.copy(str, num, str2, vastAdContent);
    }

    @Nullable
    public final String component1() {
        return this.f61729id;
    }

    @Nullable
    public final Integer component2() {
        return this.sequence;
    }

    @NotNull
    public final String component3() {
        return this.adType;
    }

    @Nullable
    public final VastAdContent component4() {
        return this.content;
    }

    @NotNull
    public final VastDataModel copy(@Nullable String str, @Nullable Integer num, @NotNull String adType, @Nullable VastAdContent vastAdContent) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new VastDataModel(str, num, adType, vastAdContent);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastDataModel) {
                VastDataModel vastDataModel = (VastDataModel) obj;
                if (!Intrinsics.m17075f(this.f61729id, vastDataModel.f61729id) || !Intrinsics.m17075f(this.sequence, vastDataModel.sequence) || !Intrinsics.m17075f(this.adType, vastDataModel.adType) || !Intrinsics.m17075f(this.content, vastDataModel.content)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final String getAdType() {
        return this.adType;
    }

    @Nullable
    public final VastAdContent getContent() {
        return this.content;
    }

    @Nullable
    public final String getId() {
        return this.f61729id;
    }

    @Nullable
    public final Integer getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f61729id;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        Integer num = this.sequence;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str2 = this.adType;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        VastAdContent vastAdContent = this.content;
        if (vastAdContent != null) {
            i4 = vastAdContent.hashCode();
        }
        return i7 + i4;
    }

    @NotNull
    public String toString() {
        return "VastAd(id=" + this.f61729id + ", sequence=" + this.sequence + ", adType=" + this.adType + ", content=" + this.content + ")";
    }
}
