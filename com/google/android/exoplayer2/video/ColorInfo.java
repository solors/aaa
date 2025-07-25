package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ColorInfo implements Bundleable {

    /* renamed from: b */
    private int f36214b;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    @Nullable
    public final byte[] hdrStaticInfo;
    public static final ColorInfo SDR_BT709_LIMITED = new ColorInfo(1, 2, 3, null);

    /* renamed from: c */
    private static final String f36210c = Util.intToStringMaxRadix(0);

    /* renamed from: d */
    private static final String f36211d = Util.intToStringMaxRadix(1);

    /* renamed from: f */
    private static final String f36212f = Util.intToStringMaxRadix(2);

    /* renamed from: g */
    private static final String f36213g = Util.intToStringMaxRadix(3);
    public static final Bundleable.Creator<ColorInfo> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.video.a
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return ColorInfo.m72513a(bundle);
        }
    };

    public ColorInfo(int i, int i2, int i3, @Nullable byte[] bArr) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
    }

    /* renamed from: a */
    public static /* synthetic */ ColorInfo m72513a(Bundle bundle) {
        return m72512b(bundle);
    }

    /* renamed from: b */
    public static /* synthetic */ ColorInfo m72512b(Bundle bundle) {
        return new ColorInfo(bundle.getInt(f36210c, -1), bundle.getInt(f36211d, -1), bundle.getInt(f36212f, -1), bundle.getByteArray(f36213g));
    }

    public static boolean isTransferHdr(@Nullable ColorInfo colorInfo) {
        int i;
        if (colorInfo != null && (i = colorInfo.colorTransfer) != -1 && i != 3) {
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
        return 3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f36214b == 0) {
            this.f36214b = ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31) + Arrays.hashCode(this.hdrStaticInfo);
        }
        return this.f36214b;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f36210c, this.colorSpace);
        bundle.putInt(f36211d, this.colorRange);
        bundle.putInt(f36212f, this.colorTransfer);
        bundle.putByteArray(f36213g, this.hdrStaticInfo);
        return bundle;
    }

    public String toString() {
        boolean z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.colorSpace);
        sb2.append(", ");
        sb2.append(this.colorRange);
        sb2.append(", ");
        sb2.append(this.colorTransfer);
        sb2.append(", ");
        if (this.hdrStaticInfo != null) {
            z = true;
        } else {
            z = false;
        }
        sb2.append(z);
        sb2.append(")");
        return sb2.toString();
    }
}
