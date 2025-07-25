package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ZX */
/* loaded from: assets/audience_network.dex */
public final class C13008ZX implements InterfaceC113417z {
    public static byte[] A00;
    public static String[] A01 = {"N9cBQFuEXnMHuOhuUHmrN1NbOn9dUH6l", "t4327HI34dmOHxHgJ5Xqb1TMdgfhViRu", "W9WF83HwW2JJuxhyMa", "tDcIRbsxuTPzi4rfI85ylCxCUvgLsm3F", "qO4Uq7mg6XVWSCx2fb2lLTULAXcH9HmN", "DdhWBjv", "pI4BrYZb6jEfbOR6K30piOXwM4lgsdMH", "sO2hGyIlN5zgciGhFXZ1rYz4NH0oO9ru"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-70, -73, -54, -73, -43, -58, -56, -59, -71, -69, -55, -55, -65, -60, -67, -43, -59, -58, -54, -65, -59, -60, -55, -43, -71, -59, -53, -60, -54, -56, -49, -43, -63, -69, -49, 48, 45, SignedBytes.MAX_POWER_OF_TWO, 45, 75, 60, 62, 59, 47, 49, 63, 63, 53, 58, 51, 75, 59, 60, SignedBytes.MAX_POWER_OF_TWO, 53, 59, 58, 63, 75, 55, 49, 69, 5, 2, 21, 2, 32, 17, 19, 16, 4, 6, 20, 20, 10, 15, 8, 32, 16, 17, 21, 10, 16, 15, 20, 32, 20, 21, 2, 21, 6, 32, 12, 6, 26};
        String[] strArr = A01;
        if (strArr[6].charAt(20) == strArr[0].charAt(20)) {
            throw new RuntimeException();
        }
        A01[2] = "00h";
        A00 = bArr;
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113417z
    public final void AAq(InterfaceC113407y interfaceC113407y) {
        String[] stringArray;
        Integer integer;
        Integer integer2;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 123));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 5));
            integer2 = AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 80));
        }
        interfaceC113407y.ADY(stringArray, integer, integer2);
    }
}
