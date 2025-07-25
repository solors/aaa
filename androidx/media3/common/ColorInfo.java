package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.Bundleable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes.dex */
public final class ColorInfo implements Bundleable {
    public final int chromaBitdepth;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    @Nullable
    public final byte[] hdrStaticInfo;
    public final int lumaBitdepth;
    public static final ColorInfo SDR_BT709_LIMITED = new Builder().setColorSpace(1).setColorRange(2).setColorTransfer(3).build();
    public static final ColorInfo SRGB_BT709_FULL = new Builder().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
    private static final String FIELD_COLOR_SPACE = Util.intToStringMaxRadix(0);
    private static final String FIELD_COLOR_RANGE = Util.intToStringMaxRadix(1);
    private static final String FIELD_COLOR_TRANSFER = Util.intToStringMaxRadix(2);
    private static final String FIELD_HDR_STATIC_INFO = Util.intToStringMaxRadix(3);
    private static final String FIELD_LUMA_BITDEPTH = Util.intToStringMaxRadix(4);
    private static final String FIELD_CHROMA_BITDEPTH = Util.intToStringMaxRadix(5);
    public static final Bundleable.Creator<ColorInfo> CREATOR = new Bundleable.Creator() { // from class: androidx.media3.common.g
        @Override // androidx.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return ColorInfo.m104672a(bundle);
        }
    };

    /* loaded from: classes.dex */
    public static final class Builder {
        private int chromaBitdepth;
        private int colorRange;
        private int colorSpace;
        private int colorTransfer;
        @Nullable
        private byte[] hdrStaticInfo;
        private int lumaBitdepth;

        public ColorInfo build() {
            return new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, this.hdrStaticInfo, this.lumaBitdepth, this.chromaBitdepth);
        }

        @CanIgnoreReturnValue
        public Builder setChromaBitdepth(int i) {
            this.chromaBitdepth = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorRange(int i) {
            this.colorRange = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorSpace(int i) {
            this.colorSpace = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorTransfer(int i) {
            this.colorTransfer = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHdrStaticInfo(@Nullable byte[] bArr) {
            this.hdrStaticInfo = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLumaBitdepth(int i) {
            this.lumaBitdepth = i;
            return this;
        }

        public Builder() {
            this.colorSpace = -1;
            this.colorRange = -1;
            this.colorTransfer = -1;
            this.lumaBitdepth = -1;
            this.chromaBitdepth = -1;
        }

        private Builder(ColorInfo colorInfo) {
            this.colorSpace = colorInfo.colorSpace;
            this.colorRange = colorInfo.colorRange;
            this.colorTransfer = colorInfo.colorTransfer;
            this.hdrStaticInfo = colorInfo.hdrStaticInfo;
            this.lumaBitdepth = colorInfo.lumaBitdepth;
            this.chromaBitdepth = colorInfo.chromaBitdepth;
        }
    }

    @Deprecated
    public ColorInfo(int i, int i2, int i3, @Nullable byte[] bArr) {
        this(i, i2, i3, bArr, -1, -1);
    }

    /* renamed from: a */
    public static /* synthetic */ ColorInfo m104672a(Bundle bundle) {
        return lambda$static$0(bundle);
    }

    private static String chromaBitdepthToString(int i) {
        if (i != -1) {
            return i + "bit Chroma";
        }
        return "NA";
    }

    private static String colorRangeToString(int i) {
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return "Undefined color range";
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    private static String colorSpaceToString(int i) {
        if (i != -1) {
            if (i != 6) {
                if (i != 1) {
                    if (i != 2) {
                        return "Undefined color space";
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    private static String colorTransferToString(int i) {
        if (i != -1) {
            if (i != 10) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 7) {
                                    return "Undefined color transfer";
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean isTransferHdr(@Nullable ColorInfo colorInfo) {
        int i;
        if (colorInfo != null && ((i = colorInfo.colorTransfer) == 7 || i == 6)) {
            return true;
        }
        return false;
    }

    public static int isoColorPrimariesToColorSpace(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 9) {
            return 6;
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            return -1;
        }
        return 2;
    }

    public static int isoTransferCharacteristicsToColorTransfer(int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 13) {
                    if (i == 16) {
                        return 6;
                    }
                    if (i == 18) {
                        return 7;
                    }
                    if (i != 6 && i != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public static /* synthetic */ ColorInfo lambda$static$0(Bundle bundle) {
        return new ColorInfo(bundle.getInt(FIELD_COLOR_SPACE, -1), bundle.getInt(FIELD_COLOR_RANGE, -1), bundle.getInt(FIELD_COLOR_TRANSFER, -1), bundle.getByteArray(FIELD_HDR_STATIC_INFO), bundle.getInt(FIELD_LUMA_BITDEPTH, -1), bundle.getInt(FIELD_CHROMA_BITDEPTH, -1));
    }

    private static String lumaBitdepthToString(int i) {
        if (i != -1) {
            return i + "bit Luma";
        }
        return "NA";
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) && this.lumaBitdepth == colorInfo.lumaBitdepth && this.chromaBitdepth == colorInfo.chromaBitdepth) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31) + Arrays.hashCode(this.hdrStaticInfo)) * 31) + this.lumaBitdepth) * 31) + this.chromaBitdepth;
        }
        return this.hashCode;
    }

    public boolean isBitdepthValid() {
        if (this.lumaBitdepth != -1 && this.chromaBitdepth != -1) {
            return true;
        }
        return false;
    }

    public boolean isDataSpaceValid() {
        if (this.colorSpace != -1 && this.colorRange != -1 && this.colorTransfer != -1) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        if (!isBitdepthValid() && !isDataSpaceValid()) {
            return false;
        }
        return true;
    }

    @Override // androidx.media3.common.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_COLOR_SPACE, this.colorSpace);
        bundle.putInt(FIELD_COLOR_RANGE, this.colorRange);
        bundle.putInt(FIELD_COLOR_TRANSFER, this.colorTransfer);
        bundle.putByteArray(FIELD_HDR_STATIC_INFO, this.hdrStaticInfo);
        bundle.putInt(FIELD_LUMA_BITDEPTH, this.lumaBitdepth);
        bundle.putInt(FIELD_CHROMA_BITDEPTH, this.chromaBitdepth);
        return bundle;
    }

    public String toLogString() {
        String str;
        String str2;
        if (isDataSpaceValid()) {
            str = Util.formatInvariant("%s/%s/%s", colorSpaceToString(this.colorSpace), colorRangeToString(this.colorRange), colorTransferToString(this.colorTransfer));
        } else {
            str = "NA/NA/NA";
        }
        if (isBitdepthValid()) {
            str2 = this.lumaBitdepth + RemoteSettings.FORWARD_SLASH_STRING + this.chromaBitdepth;
        } else {
            str2 = "NA/NA";
        }
        return str + RemoteSettings.FORWARD_SLASH_STRING + str2;
    }

    public String toString() {
        boolean z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(colorSpaceToString(this.colorSpace));
        sb2.append(", ");
        sb2.append(colorRangeToString(this.colorRange));
        sb2.append(", ");
        sb2.append(colorTransferToString(this.colorTransfer));
        sb2.append(", ");
        if (this.hdrStaticInfo != null) {
            z = true;
        } else {
            z = false;
        }
        sb2.append(z);
        sb2.append(", ");
        sb2.append(lumaBitdepthToString(this.lumaBitdepth));
        sb2.append(", ");
        sb2.append(chromaBitdepthToString(this.chromaBitdepth));
        sb2.append(")");
        return sb2.toString();
    }

    @Deprecated
    public ColorInfo(int i, int i2, int i3, @Nullable byte[] bArr, int i4, int i5) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
        this.lumaBitdepth = i4;
        this.chromaBitdepth = i5;
    }
}
