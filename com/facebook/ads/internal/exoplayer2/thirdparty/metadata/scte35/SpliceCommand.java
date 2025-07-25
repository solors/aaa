package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 35);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-77, -93, -76, -91, -115, -109, -107, UnsignedBytes.MAX_POWER_OF_TWO, -45, -48, -52, -55, -61, -59, UnsignedBytes.MAX_POWER_OF_TWO, -61, -49, -51, -51, -63, -50, -60, -102, UnsignedBytes.MAX_POWER_OF_TWO, -44, -39, -48, -59, -99};
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return A02(0, 29, 61) + getClass().getSimpleName();
    }
}
