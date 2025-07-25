package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastMediaFile {
    @Nullable
    private final String apiFramework;
    @Nullable
    private final Integer bitrate;
    @Nullable
    private final String codec;
    @Nullable
    private final String delivery;
    @Nullable
    private final Integer fileSize;
    @Nullable
    private final Integer height;
    @Nullable

    /* renamed from: id */
    private final String f61734id;
    @Nullable
    private final Boolean maintainAspectRatio;
    @Nullable
    private final Integer maxBitrate;
    @Nullable
    private final String mediaType;
    @Nullable
    private final Integer minBitrate;
    @Nullable
    private final String originalUrl;
    @Nullable
    private final Integer pixelsCount;
    @Nullable
    private final Boolean scalable;
    private final float sizeRatio;
    @Nullable
    private final String type;
    @Nullable
    private String url;
    @Nullable
    private final Integer width;

    public VastMediaFile(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2, @Nullable String str6, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str7, @Nullable Integer num6, @Nullable String str8, float f, @Nullable Integer num7) {
        this.f61734id = str;
        this.originalUrl = str2;
        this.url = str3;
        this.delivery = str4;
        this.type = str5;
        this.width = num;
        this.height = num2;
        this.codec = str6;
        this.bitrate = num3;
        this.minBitrate = num4;
        this.maxBitrate = num5;
        this.scalable = bool;
        this.maintainAspectRatio = bool2;
        this.apiFramework = str7;
        this.fileSize = num6;
        this.mediaType = str8;
        this.sizeRatio = f;
        this.pixelsCount = num7;
    }

    @Nullable
    public final String component1() {
        return this.f61734id;
    }

    @Nullable
    public final Integer component10() {
        return this.minBitrate;
    }

    @Nullable
    public final Integer component11() {
        return this.maxBitrate;
    }

    @Nullable
    public final Boolean component12() {
        return this.scalable;
    }

    @Nullable
    public final Boolean component13() {
        return this.maintainAspectRatio;
    }

    @Nullable
    public final String component14() {
        return this.apiFramework;
    }

    @Nullable
    public final Integer component15() {
        return this.fileSize;
    }

    @Nullable
    public final String component16() {
        return this.mediaType;
    }

    public final float component17() {
        return this.sizeRatio;
    }

    @Nullable
    public final Integer component18() {
        return this.pixelsCount;
    }

    @Nullable
    public final String component2() {
        return this.originalUrl;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final String component4() {
        return this.delivery;
    }

    @Nullable
    public final String component5() {
        return this.type;
    }

    @Nullable
    public final Integer component6() {
        return this.width;
    }

    @Nullable
    public final Integer component7() {
        return this.height;
    }

    @Nullable
    public final String component8() {
        return this.codec;
    }

    @Nullable
    public final Integer component9() {
        return this.bitrate;
    }

    @NotNull
    public final VastMediaFile copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2, @Nullable String str6, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str7, @Nullable Integer num6, @Nullable String str8, float f, @Nullable Integer num7) {
        return new VastMediaFile(str, str2, str3, str4, str5, num, num2, str6, num3, num4, num5, bool, bool2, str7, num6, str8, f, num7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastMediaFile) {
                VastMediaFile vastMediaFile = (VastMediaFile) obj;
                if (!Intrinsics.m17075f(this.f61734id, vastMediaFile.f61734id) || !Intrinsics.m17075f(this.originalUrl, vastMediaFile.originalUrl) || !Intrinsics.m17075f(this.url, vastMediaFile.url) || !Intrinsics.m17075f(this.delivery, vastMediaFile.delivery) || !Intrinsics.m17075f(this.type, vastMediaFile.type) || !Intrinsics.m17075f(this.width, vastMediaFile.width) || !Intrinsics.m17075f(this.height, vastMediaFile.height) || !Intrinsics.m17075f(this.codec, vastMediaFile.codec) || !Intrinsics.m17075f(this.bitrate, vastMediaFile.bitrate) || !Intrinsics.m17075f(this.minBitrate, vastMediaFile.minBitrate) || !Intrinsics.m17075f(this.maxBitrate, vastMediaFile.maxBitrate) || !Intrinsics.m17075f(this.scalable, vastMediaFile.scalable) || !Intrinsics.m17075f(this.maintainAspectRatio, vastMediaFile.maintainAspectRatio) || !Intrinsics.m17075f(this.apiFramework, vastMediaFile.apiFramework) || !Intrinsics.m17075f(this.fileSize, vastMediaFile.fileSize) || !Intrinsics.m17075f(this.mediaType, vastMediaFile.mediaType) || Float.compare(this.sizeRatio, vastMediaFile.sizeRatio) != 0 || !Intrinsics.m17075f(this.pixelsCount, vastMediaFile.pixelsCount)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final String getApiFramework() {
        return this.apiFramework;
    }

    @Nullable
    public final Integer getBitrate() {
        return this.bitrate;
    }

    @Nullable
    public final String getCodec() {
        return this.codec;
    }

    @Nullable
    public final String getDelivery() {
        return this.delivery;
    }

    @Nullable
    public final Integer getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getId() {
        return this.f61734id;
    }

    @Nullable
    public final Boolean getMaintainAspectRatio() {
        return this.maintainAspectRatio;
    }

    @Nullable
    public final Integer getMaxBitrate() {
        return this.maxBitrate;
    }

    @Nullable
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public final Integer getMinBitrate() {
        return this.minBitrate;
    }

    @Nullable
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @Nullable
    public final Integer getPixelsCount() {
        return this.pixelsCount;
    }

    @Nullable
    public final Boolean getScalable() {
        return this.scalable;
    }

    public final float getSizeRatio() {
        return this.sizeRatio;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str = this.f61734id;
        int i17 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i18 = i * 31;
        String str2 = this.originalUrl;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i19 = (i18 + i2) * 31;
        String str3 = this.url;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i20 = (i19 + i3) * 31;
        String str4 = this.delivery;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i21 = (i20 + i4) * 31;
        String str5 = this.type;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i22 = (i21 + i5) * 31;
        Integer num = this.width;
        if (num != null) {
            i6 = num.hashCode();
        } else {
            i6 = 0;
        }
        int i23 = (i22 + i6) * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i7 = num2.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (i23 + i7) * 31;
        String str6 = this.codec;
        if (str6 != null) {
            i8 = str6.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 31;
        Integer num3 = this.bitrate;
        if (num3 != null) {
            i9 = num3.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 31;
        Integer num4 = this.minBitrate;
        if (num4 != null) {
            i10 = num4.hashCode();
        } else {
            i10 = 0;
        }
        int i27 = (i26 + i10) * 31;
        Integer num5 = this.maxBitrate;
        if (num5 != null) {
            i11 = num5.hashCode();
        } else {
            i11 = 0;
        }
        int i28 = (i27 + i11) * 31;
        Boolean bool = this.scalable;
        if (bool != null) {
            i12 = bool.hashCode();
        } else {
            i12 = 0;
        }
        int i29 = (i28 + i12) * 31;
        Boolean bool2 = this.maintainAspectRatio;
        if (bool2 != null) {
            i13 = bool2.hashCode();
        } else {
            i13 = 0;
        }
        int i30 = (i29 + i13) * 31;
        String str7 = this.apiFramework;
        if (str7 != null) {
            i14 = str7.hashCode();
        } else {
            i14 = 0;
        }
        int i31 = (i30 + i14) * 31;
        Integer num6 = this.fileSize;
        if (num6 != null) {
            i15 = num6.hashCode();
        } else {
            i15 = 0;
        }
        int i32 = (i31 + i15) * 31;
        String str8 = this.mediaType;
        if (str8 != null) {
            i16 = str8.hashCode();
        } else {
            i16 = 0;
        }
        int hashCode = (((i32 + i16) * 31) + Float.hashCode(this.sizeRatio)) * 31;
        Integer num7 = this.pixelsCount;
        if (num7 != null) {
            i17 = num7.hashCode();
        }
        return hashCode + i17;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "VastMediaFile(id=" + this.f61734id + ", originalUrl=" + this.originalUrl + ", url=" + this.url + ", delivery=" + this.delivery + ", type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", codec=" + this.codec + ", bitrate=" + this.bitrate + ", minBitrate=" + this.minBitrate + ", maxBitrate=" + this.maxBitrate + ", scalable=" + this.scalable + ", maintainAspectRatio=" + this.maintainAspectRatio + ", apiFramework=" + this.apiFramework + ", fileSize=" + this.fileSize + ", mediaType=" + this.mediaType + ", sizeRatio=" + this.sizeRatio + ", pixelsCount=" + this.pixelsCount + ")";
    }
}
