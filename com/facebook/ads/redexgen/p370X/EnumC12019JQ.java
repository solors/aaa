package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.NativeAdBase;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.JQ */
/* loaded from: assets/audience_network.dex */
public enum EnumC12019JQ {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);
    
    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, UnsignedBytes.MAX_POWER_OF_TWO, UnsignedBytes.MAX_POWER_OF_TWO, -123, -122, -123, 124};
    }

    static {
        A02();
    }

    EnumC12019JQ(long j, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j;
        this.A01 = mediaCacheFlag;
    }

    @Nullable
    public static EnumC12019JQ A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC12019JQ[] values;
        for (EnumC12019JQ enumC12019JQ : values()) {
            if (enumC12019JQ.A01 == mediaCacheFlag) {
                return enumC12019JQ;
            }
        }
        return null;
    }
}
