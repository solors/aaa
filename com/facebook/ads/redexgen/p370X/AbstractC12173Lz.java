package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.VideoStartReason;

/* renamed from: com.facebook.ads.redexgen.X.Lz */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12173Lz {
    public static String[] A00 = {"AGgEj", "LH3rgKkNmktwVHG5nPeK3WsWN7516Jzs", "CK3U371aKg", "MTDWSiS44OE4PV9OKyjdrXQDz2py4IOF", "ej0x21azMZ2lcGnVvFT8lesJnsiudKto", "2BAFbYQr8kMnD6mhXZkfB", "qOS", "n1iHeVYqIlmDLMhT9hH5ssiOIOX1l9w9"};

    public static EnumC12476Qs A00(VideoStartReason videoStartReason) {
        switch (videoStartReason) {
            case AUTO_STARTED:
                EnumC12476Qs enumC12476Qs = EnumC12476Qs.A02;
                if (A00[2].length() != 10) {
                    throw new RuntimeException();
                }
                String[] strArr = A00;
                strArr[5] = "lDchC145wsMmgVMbBHFb3";
                strArr[0] = "IYy0G";
                return enumC12476Qs;
            case NOT_STARTED:
                return EnumC12476Qs.A03;
            case USER_STARTED:
                return EnumC12476Qs.A04;
            default:
                return EnumC12476Qs.A03;
        }
    }
}
