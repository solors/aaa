package com.facebook.ads.redexgen.p370X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.DL */
/* loaded from: assets/audience_network.dex */
public final class C11669DL {
    public static byte[] A07;
    public static String[] A08 = {"cBoSy73h12Z", "FF287", "yiDcTrO5oiy9L", "PgfMdTSRvPG0atUIS8Pzxn3kWS0m", "yL", "cWIqYPJMJGop9q0QypPHGYzgP2IwtBiA", "5kOvwODC6jChrN9uRRfJcb98RTG4", "RfkEvBXgrQdDRXJFP9mAr4EwuLKmJYFp"};
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-52, 32, 27, -52, -89, -101, -95, -107, -48, -47, 3, 3, 5, -3, -11, -12, -35, -15, 8, -45, -8, -15, -2, -2, -11, -4, -47, -12, -6, 5, 3, 4, -3, -11, -2, 4, -54, -80, -65, -15, -15, -13, -21, -29, -30, -47, -13, -18, -18, -19, -16, -14, -98, -39, 38, 62, 61, 66, 58, 28, 72, 61, 62, 60, 34, 71, 63, 72, -65, -32, -60, -26, -31, -31, -32, -29, -27, -111, -52, 59, -9, -70, -11, 48, 51, 48, 63, 67, 56, 69, 52, -4, 63, 59, 48, 72, 49, 48, 50, 58, 63, 74, 71, 69, 76, 12, 65, 63, 78, 81, -5, 6, 3, 1, 8, -56, 16, -35, -5, 10, 13, -56, -36, -53, -48, -42, -106, -102, -50, -41, -41, -12, 8, -9, -4, 2, -62, -12, -10, -58, 60, 80, 63, 68, 74, 10, 60, 72, 77, 8, 82, 61, -40, -20, -37, -32, -26, -90, -36, -40, -38, -86, -1, 19, 2, 7, 13, -51, 4, 10, -1, 1, 33, 53, 36, 41, 47, -17, 39, -9, -15, -15, -19, 33, 44, 33, 55, 2, 22, 5, 10, 16, -48, 8, -40, -46, -46, -50, 14, 13, 2, 24, 30, 50, 33, 38, 44, -20, 36, 48, 42, -26, -6, -23, -18, -12, -76, -14, -11, -71, -26, -78, -15, -26, -7, -14, 32, 52, 35, 40, 46, -18, 44, 47, 36, 38, 46, 66, 49, 54, 60, -4, 60, 61, 66, SignedBytes.MAX_POWER_OF_TWO, -35, -15, -32, -27, -21, -85, -18, -35, -13, SignedBytes.MAX_POWER_OF_TWO, 84, 67, 72, 78, 14, 85, 78, 81, 65, 72, 82, 1, 6, -1, 12, 12, 3, 10, -31, 13, 19, 12, 18, -52, -1, -31, -1, 14, 17, 38, 43, 36, 49, 49, 40, 47, 6, 50, 56, 49, 55, -15, 38, 36, 51, 54, -44, -39, -46, -33, -33, -42, -35, -76, -32, -26, -33, -27, -97, -28, -26, -31, -31, -32, -29, -27, -99, -111, 42, 54, 43, 44, 42, -11, 52, 48, 52, 44, -25, 48, 60, 49, 50, 48, -5, 61, 63, 60, 51, 54, 57, 50, 25, 50, 67, 50, 57, -7, -19, 22, 4, 16, 19, 15, 8, -11, 4, 23, 8, -47, 4, -26, 4, 19, 22, -16, -34, -22, -19, -23, -30, -49, -34, -15, -30, -85, -32, -34, -19, -16, 31, 13, 25, 28, 24, 17, -2, 13, 32, 17, -38, 31, 33, 28, 28, 27, 30, 32, -40, -52, 33, 19, 17, 35, 32, 19, -37, 30, 26, 15, 39, 16, 15, 17, 25, 16, 6, 23, 2, -34, 11, 1, -17, -2, 17, 2, -53, 0, -2, 13, 16, 0, -10, 7, -14, -50, -5, -15, -33, -18, 1, -14, -69, -1, -4, 1, -18, 1, -14, -15, -71, -83, -31, -41, -24, -45, -81, -36, -46, -64, -49, -30, -45, -100, -31, -29, -34, -34, -35, -32, -30, -102, -114, 58, 48, 65, 44, 8, 53, 43, 25, 40, 59, 44, -11, 61, 10, 40, 55, 58, 50, 51, 44, 44, 35, 42, 35, 34, -21, 46, 42, 31, 55, 32, 31, 33, 41, 14};
    }

    static {
        A04();
    }

    public C11669DL(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.A02 = (String) AbstractC11914Hf.A01(str);
        this.A01 = str2;
        this.A00 = codecCapabilities;
        this.A04 = z;
        boolean z4 = true;
        this.A03 = (z2 || codecCapabilities == null || !A07(codecCapabilities)) ? false : true;
        this.A06 = codecCapabilities != null && A0B(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !A09(codecCapabilities))) {
            z4 = false;
        }
        this.A05 = z4;
    }

    public static int A00(String str, String str2, int i) {
        int i2;
        if (i > 1 || (AbstractC11953IK.A02 >= 26 && i > 0)) {
            return i;
        }
        if (A03(226, 10, 94).equals(str2) || A03(121, 10, 6).equals(str2) || A03(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 12, 122).equals(str2) || A03(211, 15, 36).equals(str2) || A03(255, 12, 126).equals(str2) || A03(236, 10, 108).equals(str2) || A03(246, 9, 27).equals(str2) || A03(162, 10, 61).equals(str2) || A03(172, 15, 95).equals(str2) || A03(187, 15, 64).equals(str2) || A03(202, 9, 92).equals(str2)) {
            return i;
        }
        if (A03(131, 9, 50).equals(str2)) {
            i2 = 6;
        } else if (A03(ErrorCode.CODE_NOT_TRACK_STATUS, 10, 22).equals(str2)) {
            i2 = 16;
        } else {
            i2 = 30;
        }
        Log.w(A03(54, 14, 120), A03(9, 29, 47) + str + A03(6, 3, 20) + i + A03(0, 4, 75) + i2 + A03(79, 1, 125));
        return i2;
    }

    public static C11669DL A01(String str) {
        return new C11669DL(str, null, null, true, false, false);
    }

    public static C11669DL A02(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C11669DL(str, str2, codecCapabilities, false, z, z2);
    }

    private void A05(String str) {
        StringBuilder append = new StringBuilder().append(A03(38, 16, 29)).append(str);
        String A03 = A03(80, 3, 57);
        append.append(A03).append(this.A02).append(A03(4, 2, 26)).append(this.A01).append(A03).append(AbstractC11953IK.A04).append(A03(79, 1, 125)).toString();
    }

    private void A06(String str) {
        StringBuilder append = new StringBuilder().append(A03(68, 11, 16)).append(str);
        String A03 = A03(80, 3, 57);
        append.append(A03).append(this.A02).append(A03(4, 2, 26)).append(this.A01).append(A03).append(AbstractC11953IK.A04).append(A03(79, 1, 125)).toString();
    }

    public static boolean A07(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC11953IK.A02 >= 19 && A08(codecCapabilities);
    }

    public static boolean A08(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(83, 17, 110));
    }

    public static boolean A09(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC11953IK.A02 >= 21 && A0A(codecCapabilities);
    }

    public static boolean A0A(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(406, 15, 77));
    }

    public static boolean A0B(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC11953IK.A02 >= 21 && A0C(codecCapabilities);
    }

    public static boolean A0C(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(496, 17, 93));
    }

    public static boolean A0D(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    public final Point A0E(int i, int i2) {
        if (this.A00 == null) {
            A06(A03(100, 10, 125));
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.A00.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(110, 11, 57));
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int heightAlignment2 = AbstractC11953IK.A04(i, widthAlignment);
        return new Point(heightAlignment2 * widthAlignment, AbstractC11953IK.A04(i2, heightAlignment) * heightAlignment);
    }

    public final boolean A0F(int i) {
        if (this.A00 == null) {
            A06(A03(285, 17, 98));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(267, 18, 61));
            return false;
        } else if (A00(this.A02, this.A01, audioCapabilities.getMaxInputChannelCount()) < i) {
            A06(A03(302, 22, 16) + i);
            return false;
        } else {
            return true;
        }
    }

    public final boolean A0G(int i) {
        if (this.A00 == null) {
            A06(A03(371, 15, 28));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.A00.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(355, 16, 66));
            return false;
        } else if (!audioCapabilities.isSampleRateSupported(i)) {
            A06(A03(386, 20, 75) + i);
            return false;
        } else {
            return true;
        }
    }

    public final boolean A0H(int i, int i2, double d) {
        if (this.A00 == null) {
            String[] strArr = A08;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "R4Mp3flu57xV641JioQUQmYkQ8CC";
            strArr2[3] = "NlGlgawGhreLfBWzu4zzKU5x2rIR";
            A06(A03(421, 16, 60));
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.A00.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(479, 17, 102));
            return false;
        } else if (!A0D(videoCapabilities, i, i2, d)) {
            String A03 = A03(513, 1, 53);
            if (i >= i2 || !A0D(videoCapabilities, i2, i, d)) {
                A06(A03(FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 21, 13) + i + A03 + i2 + A03 + d);
                return false;
            }
            A05(A03(437, 21, 44) + i + A03 + i2 + A03 + d);
            return true;
        } else {
            return true;
        }
    }

    public final boolean A0I(String str) {
        MediaCodecInfo.CodecProfileLevel[] A0J;
        if (str == null || this.A01 == null) {
            return true;
        }
        String A05 = AbstractC11932Hx.A05(str);
        if (A08[1].length() != 16) {
            A08[0] = "tLac0A4cWgd";
            if (A05 == null) {
                return true;
            }
            boolean equals = this.A01.equals(A05);
            String A03 = A03(4, 2, 26);
            if (!equals) {
                A06(A03(324, 11, 102) + str + A03 + A05);
                return false;
            }
            Pair<Integer, Integer> A02 = C11680DW.A02(str);
            if (A02 == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A0J()) {
                if (codecProfileLevel.profile == ((Integer) A02.first).intValue() && codecProfileLevel.level >= ((Integer) A02.second).intValue()) {
                    return true;
                }
            }
            A06(A03(335, 20, 108) + str + A03 + A05);
            return false;
        }
        throw new RuntimeException();
    }

    public final MediaCodecInfo.CodecProfileLevel[] A0J() {
        if (this.A00 == null || this.A00.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.A00.profileLevels;
    }
}
