package com.facebook.ads.redexgen.p370X;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.amazon.device.ads.DtbConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.newreward.player.view.floatview.FloatWebTemplateView;
import com.mobilefuse.sdk.network.client.HttpStatusCode;
import com.p551my.target.common.models.IAdLoadingError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Hk */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11919Hk {
    public static byte[] A00;
    public static String[] A01 = {"QaRNxGLOob9K4H7fRMkquel3h50VelkQ", "azTCGchk6", "mHgnG6dnf2MGZd5DpY3Fvtm9G", "tzEaWGaEvJza45cGoZVKtnbcUrArONKc", "oHJkPKeSQUNkwlTgdbaOwJQEOAFT8Z3w", "LswLHEYKeGvbNlCvRjNUSVWZKRT8D0Zx", "T5MrOQzei7G0RtN59lzfKQqgq2SafeDq", "ucBpJzW1cVnftjPi059PqZMmOpUXxZKe"};
    public static final Map<String, Integer> A02;
    public static final Pattern A03;
    public static final Pattern A04;
    public static final Pattern A05;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(30) != strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "S3cqE9iPcF9hTGsbBg8LQ82o0ngu41Kq";
            strArr2[7] = "xg2fMgkDGF8jjQwJ6jhRkufT7C75CxKJ";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
            i4++;
        }
    }

    public static void A06() {
        A00 = new byte[]{57, SignedBytes.MAX_POWER_OF_TWO, 108, 121, 124, 66, 54, 54, 66, 122, 101, 47, 50, 45, 99, 55, 50, 54, 66, 122, 101, 47, 50, 45, 99, 55, 50, 54, 66, 122, 101, 47, 50, 45, 99, 55, 66, 55, 58, 55, 27, 14, 11, 8, 53, 65, 65, 53, 13, 18, 88, 69, 90, 20, SignedBytes.MAX_POWER_OF_TWO, 69, 65, 53, 13, 18, 88, 69, 90, 20, SignedBytes.MAX_POWER_OF_TWO, 69, 65, 53, 13, 18, 88, 69, 90, 20, SignedBytes.MAX_POWER_OF_TWO, 69, 65, 53, 13, 67, 53, 71, 86, 53, 13, 67, 86, SignedBytes.MAX_POWER_OF_TWO, 53, SignedBytes.MAX_POWER_OF_TWO, 77, 52, 24, 13, 8, 11, 54, 66, 66, 54, 14, 17, 91, 70, 89, 23, 67, 70, 66, 54, 14, 17, 91, 70, 89, 23, 67, 70, 66, 54, 14, 17, 91, 70, 89, 23, 67, 70, 66, 54, 14, 17, 91, 70, 89, 23, 67, 54, 67, 78, 116, 121, 124, 118, 112, 119, 121, 96, 112, 58, 53, 47, 50, 42, 46, 62, 44, 51, 50, 47, 62, 0, 16, 20, 0, 58, 42, 46, 58, 54, 58, 41, 50, 53, 62, 44, 55, 56, 63, 40, 45, 42, 38, 40, 42, 24, 19, 9, 11, 15, 31, 71, 73, 68, 70, 78, 88, 86, 91, 84, 89, 82, 95, 94, 91, 86, 87, 85, 84, 94, 23, 25, 0, 16, 65, 79, 86, 70, 85, 74, 76, 79, 70, 87, 6, 22, 11, 19, 10, 98, 117, 114, 108, 121, 119, 111, 111, 100, 73, 75, 78, 79, 94, 72, 70, 95, 79, 95, 84, 93, 78, 72, 78, 89, 73, 79, 89, 101, 110, 105, 101, 105, 106, 103, 114, 99, 52, 56, 37, 54, 59, 68, 72, 85, 73, 65, 75, 72, 80, 66, 85, 69, 75, 82, 66, 125, 113, 108, 112, 109, 119, 114, 117, 89, 72, 83, 87, 73, 85, 84, 20, 14, 22, 25, 81, 84, 71, 94, 87, 89, SignedBytes.MAX_POWER_OF_TWO, 80, 28, 25, 10, 19, 27, 1, 25, 22, 74, 79, 92, 69, 73, 65, 66, 74, 75, SignedBytes.MAX_POWER_OF_TWO, 92, 65, 74, 0, 5, 22, 15, 3, 22, 5, 29, 62, 59, 40, 49, 61, 40, 63, 63, 52, 1, 4, 23, 14, 2, 23, 0, 28, 13, 8, 27, 2, 2, 1, 8, 2, 0, 97, 100, 119, 110, 104, 100, 98, 96, 107, 113, 100, 10, 15, 28, 5, 1, 2, 7, 24, 11, 9, 28, 11, 11, 0, 79, 74, 89, SignedBytes.MAX_POWER_OF_TWO, 68, 89, 74, 69, 76, 78, 66, 71, 84, 77, 73, 84, 69, 78, 79, 66, 104, 109, 126, 103, 126, 105, 104, Byte.MAX_VALUE, 122, 105, 112, 104, 122, 119, 118, 116, 117, 83, 86, 69, 92, 68, 82, 86, 80, 69, 82, 82, 89, 78, 75, 88, 65, 89, 70, 75, 94, 79, 72, 70, 95, 79, 30, 27, 8, 17, 9, 22, 27, 14, 31, 29, 8, 27, 3, 75, 78, 93, 68, 92, 67, 78, 91, 74, 72, 93, 74, 86, 29, 24, 11, 18, 13, 12, 11, 8, 12, 22, 16, 10, 28, 115, 118, 101, 124, 97, 126, 120, 123, 114, 99, 65, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 85, 85, 76, 75, 78, 52, 53, 53, 32, 35, 59, 41, 50, 60, 37, 53, 116, 121, 125, 119, 98, 113, 105, 46, 35, 39, 45, 56, 47, 51, 98, 105, 98, 97, 99, 116, 100, 106, 115, 99, 48, 63, 36, 51, 52, 36, 63, 53, 61, 119, 125, 126, 99, 112, 125, 102, 121, 120, 101, 116, 91, 82, 79, 88, 78, 73, 90, 79, 88, 88, 83, 51, 32, 54, 61, 38, 60, 52, 28, 26, 18, 21, 8, 25, 20, 9, 20, 89, 86, 81, 77, 74, 73, 86, 87, 74, 91, 70, 78, 77, 69, 113, 121, 122, 114, 115, 120, 100, 121, 114, 54, 35, 48, 40, 119, 98, 117, 117, 126, 67, 86, 65, 65, 74, 93, 65, 72, 72, 75, 83, 107, 126, 105, 117, 71, SignedBytes.MAX_POWER_OF_TWO, 65, 74, 86, 75, 74, 88, 69, 66, 89, 93, 68, 67, 70, 57, 62, 52, 57, 49, 62, 34, 53, 52, 14, 9, 3, 14, 0, 8, 67, 92, 69, 88, 83, 61, 62, 55, 61, 63, 14, 3, 20, 7, 12, 6, 7, 16, 72, 69, 82, 65, 74, SignedBytes.MAX_POWER_OF_TWO, 65, 86, 70, 72, 81, 87, 76, 12, 1, 23, 14, 7, 18, 5, 5, 14, 44, 37, 45, 47, 46, 35, 40, 41, 38, 38, 47, 46, 5, 0, 14, 1, 29, 11, 5, 28, 12, 124, 121, 119, 120, 100, 115, Byte.MAX_VALUE, 98, 113, 124, 40, 45, 35, 44, 48, 39, 61, 37, 42, 61, 56, 54, 57, 37, 54, 62, 61, 53, 52, 63, 35, 62, 53, 40, 52, 61, 61, 62, 38, 15, 10, 4, 11, 23, 4, 17, 2, 26, 56, 61, 51, 60, 32, 51, 38, 49, 49, 58, 117, 112, 126, 113, 109, 126, 107, 124, 96, 35, 38, 40, 39, 59, 63, 38, 33, 36, 54, 51, 61, 50, 46, 41, 59, 54, 55, 53, 52, 10, 15, 1, 14, 18, 21, 3, 7, 1, 20, 3, 3, 8, 40, 45, 35, 44, 48, 55, 47, 61, 38, 40, 49, 33, 65, 68, 74, 69, 89, 94, 65, 76, 89, 72, 74, 95, 76, 84, 72, 77, 67, 76, 80, 87, 72, 69, 80, 65, 67, 86, 65, 93, 28, 25, 23, 24, 4, 3, 4, 21, 21, 28, 18, 28, 5, 21, 10, 15, 1, 14, 18, 31, 3, 10, 10, 9, 17, 88, 93, 89, 81, 29, 24, 28, 20, 22, 3, 20, 20, 31, 15, 10, 13, 6, 13, 45, 33, 39, 37, 46, 52, 33, 27, 23, 4, 25, 25, 24, 112, 120, 121, 116, 104, 112, 124, 108, 104, 124, 112, 124, 111, 116, 115, 120, 80, 88, 89, 84, 72, 80, 95, 81, 72, 88, 41, 33, 32, 45, 49, 41, 43, 54, 39, 44, 45, 32, 69, 77, 76, 65, 93, 69, 88, 93, 90, 88, 68, 77, 118, 126, Byte.MAX_VALUE, 114, 110, 118, 104, 126, 122, 124, 105, 126, 126, 117, 14, 6, 7, 10, 22, 14, 16, 15, 2, 
        23, 6, 1, 15, 22, 6, 86, 94, 95, 82, 78, 86, 72, 75, 73, 82, 85, 92, 92, 73, 94, 94, 85, 5, 13, 12, 1, 29, 5, 28, 29, 26, 25, 29, 7, 1, 27, 13, 102, 110, 111, 98, 126, 102, 125, 98, 100, 103, 110, Byte.MAX_VALUE, 121, 110, 111, 67, 71, 74, SignedBytes.MAX_POWER_OF_TWO, 71, 73, 70, 90, 76, 66, 91, 75, 73, 77, 74, 80, 71, 86, 65, 69, 73, 110, 106, 112, 119, 122, 113, 108, 112, 102, 123, 121, 117, 117, 119, 101, Byte.MAX_VALUE, 120, 124, 115, 100, 115, 120, 125, 101, 122, 123, 102, 119, 87, 88, 79, SignedBytes.MAX_POWER_OF_TWO, 1, 2, 10, 2, 15, 13, 11, 81, 82, 87, 72, 91, 10, 9, 12, 19, 0, 1, 23, 4, 7, 38, 59, 40, 39, 46, 44, 6, 27, 8, 7, 14, 12, 27, 12, 13, 20, 9, 24, 19, 18, 31, 7, 22, 27, 18, 16, 24, 27, 19, 18, 25, 5, 24, 19, 97, 112, 125, 116, 118, 99, 116, 116, Byte.MAX_VALUE, 51, 34, 47, 38, 55, 54, 49, 50, 54, 44, 42, 48, 38, 103, 118, 123, 114, 97, 126, 120, 123, 114, 99, 101, 114, 115, 26, 11, 26, 11, 19, 11, 29, 2, 3, 26, 84, 65, 69, 71, 76, 84, 81, 66, 66, 122, 111, 120, Byte.MAX_VALUE, 36, 61, 58, 63, 122, 102, Byte.MAX_VALUE, 103, 12, 19, 11, 24, 25, 14, 30, 16, 9, 25, 82, 87, 80, 82, 78, 71, 40, 63, 56, 63, 57, 57, 59, 42, 47, 40, 42, 54, 63, 37, 50, 51, 36, 49, 52, 1, 20, 17, 18, 56, 37, 57, 51, 40, 56, 37, 61, 36, 20, 9, 31, 7, 10, 4, 10, 19, 3, 58, 40, 45, 45, 37, 44, 43, 59, 38, 62, 39, 51, 33, 44, 45, 47, 46, 112, 98, 109, 103, 122, 97, 113, 108, 116, 109, 3, 21, 17, 23, 2, 21, 21, 30, 41, 63, 59, 41, 50, 63, 54, 54, 45, 55, 59, 48, 48, 63, 29, 7, 2, 24, 11, 28, 41, 49, 35, 56, 54, 47, 63, 67, 92, 81, 68, 85, 82, 92, 69, 85, 116, 107, 102, 115, 98, 96, 117, 102, 126, 30, 1, 12, 25, 8, 10, 31, 8, 20, 112, 109, 108, 116, 105, 106, 104, 115, 116, 125, 125, 104, Byte.MAX_VALUE, Byte.MAX_VALUE, 116, 73, 78, 95, 95, 86, 88, 86, 79, 95, 79, 90, 85, 108, 125, 121, 116, 90, 70, 71, 93, 90, 66, 75, 56, 35, 33, 45, 56, 35, 105, 111, 124, 115, 110, 109, 124, 111, 120, 115, 105, 21, 20, 19, 16, 20, 14, 8, 18, 4, 92, 67, 69, 70, 79, 94, 62, 33, 44, 40, 61, 56, 39, 38, 59, 42, 108, 115, 114, 111, 126, 104, 118, 116, 112, 126, 33, 61, 52, 52, 55, 47, 25, 5, 12, 12, 15, 23, 7, 18, 5, 5, 14};
    }

    static {
        A06();
        A05 = Pattern.compile(A05(1, 38, 96));
        A04 = Pattern.compile(A05(91, 49, 20));
        A03 = Pattern.compile(A05(39, 52, 23));
        A02 = new HashMap();
        A02.put(A05(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 9, 107), -984833);
        A02.put(A05(149, 12, 37), -332841);
        A02.put(A05(161, 4, 31), -16711681);
        A02.put(A05(165, 10, 37), -8388652);
        A02.put(A05(175, 5, 51), -983041);
        A02.put(A05(180, 5, 49), -657956);
        A02.put(A05(185, 6, 4), -6972);
        A02.put(A05(191, 5, 91), Integer.valueOf((int) ViewCompat.MEASURED_STATE_MASK));
        A02.put(A05(196, 14, 68), -5171);
        A02.put(A05(210, 4, 11), -16776961);
        A02.put(A05(214, 10, 93), -7722014);
        A02.put(A05(224, 5, 26), -5952982);
        A02.put(A05(229, 9, 126), -2180985);
        A02.put(A05(238, 9, 84), -10510688);
        A02.put(A05(247, 10, 66), -8388864);
        A02.put(A05(257, 9, 120), -2987746);
        A02.put(A05(266, 5, 41), -32944);
        A02.put(A05(271, 14, 89), -10185235);
        A02.put(A05(285, 8, 96), -1828);
        A02.put(A05(293, 7, 68), -2354116);
        A02.put(A05(300, 4, 9), -16711681);
        A02.put(A05(304, 8, 75), -16777077);
        A02.put(A05(312, 8, 6), -16741493);
        A02.put(A05(320, 13, 80), -4684277);
        A02.put(A05(333, 8, 26), -5658199);
        A02.put(A05(FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 9, 36), -16751616);
        A02.put(A05(350, 8, 27), -5658199);
        A02.put(A05(358, 9, 23), -4343957);
        A02.put(A05(367, 11, 123), -7667573);
        A02.put(A05(378, 14, 16), -11179217);
        A02.put(A05(392, 10, 85), -29696);
        A02.put(A05(402, 10, 88), -6737204);
        A02.put(A05(412, 7, 114), -7667712);
        A02.put(A05(419, 10, 101), -1468806);
        A02.put(A05(HttpStatusCode.TOO_MANY_REQUESTS, 12, 73), -7357297);
        A02.put(A05(441, 13, 84), -12042869);
        A02.put(A05(454, 13, 4), -13676721);
        A02.put(A05(467, 13, 81), -13676721);
        A02.put(A05(DtbConstants.DEFAULT_PLAYER_HEIGHT, 13, 7), -16724271);
        A02.put(A05(FacebookRequestErrorClassification.ESC_APP_INACTIVE, 10, 105), -7077677);
        A02.put(A05(503, 8, 91), -60269);
        A02.put(A05(511, 11, 46), -16728065);
        A02.put(A05(522, 7, 110), -9868951);
        A02.put(A05(529, 7, 52), -9868951);
        A02.put(A05(536, 10, 120), -14774017);
        A02.put(A05(FloatWebTemplateView.FLOAT_EXPAND_VIEW, 9, 40), -5103070);
        A02.put(A05(555, 11, 111), -1296);
        A02.put(A05(566, 11, 67), -14513374);
        A02.put(A05(577, 7, 43), -65281);
        A02.put(A05(584, 9, 5), -2302756);
        A02.put(A05(593, 10, 64), -460545);
        A02.put(A05(603, 4, 95), -10496);
        A02.put(A05(607, 9, 104), -2448096);
        A02.put(A05(616, 4, 47), -8355712);
        A02.put(A05(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, 5, 110), -16744448);
        A02.put(A05(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 11, 90), -5374161);
        A02.put(A05(636, 4, 114), -8355712);
        A02.put(A05(640, 8, 81), -983056);
        A02.put(A05(648, 7, 83), -38476);
        A02.put(A05(655, 9, 46), -3318692);
        A02.put(A05(664, 6, 25), -11861886);
        A02.put(A05(670, 5, 84), -16);
        A02.put(A05(675, 5, 40), -989556);
        A02.put(A05(680, 8, 28), -1644806);
        A02.put(A05(688, 13, 90), -3851);
        A02.put(A05(701, 9, 30), -8586240);
        A02.put(A05(710, 12, 62), -1331);
        A02.put(A05(722, 9, 23), -5383962);
        A02.put(A05(731, 10, 110), -1015680);
        A02.put(A05(741, 9, 58), -2031617);
        A02.put(A05(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 20, 47), -329006);
        A02.put(A05(770, 9, 29), -2894893);
        A02.put(A05(779, 10, 42), -7278960);
        A02.put(A05(789, 9, 103), -2894893);
        A02.put(A05(798, 9, 49), -18751);
        A02.put(A05(807, 11, 36), -24454);
        A02.put(A05(818, 13, 24), -14634326);
        A02.put(A05(831, 12, 58), -7876870);
        A02.put(A05(843, 14, 83), -8943463);
        A02.put(A05(857, 14, 90), -8943463);
        A02.put(A05(871, 14, 14), -5192482);
        A02.put(A05(885, 11, 24), -32);
        A02.put(A05(896, 4, 74), -16711936);
        A02.put(A05(900, 9, 15), -13447886);
        A02.put(A05(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOSS_VALUE, 5, 29), -331546);
        A02.put(A05(914, 7, 62), -65281);
        A02.put(A05(921, 6, 8), -8388608);
        A02.put(A05(927, 16, 99), -10039894);
        A02.put(A05(943, 10, 67), -16777011);
        A02.put(A05(953, 12, 58), -4565549);
        A02.put(A05(965, 12, 86), -7114533);
        A02.put(A05(977, 14, 101), -12799119);
        A02.put(A05(991, 15, 29), -8689426);
        A02.put(A05(1006, 17, 69), -16713062);
        A02.put(A05(1023, 15, 22), -12004916);
        A02.put(A05(IronSourceError.ERROR_RV_SHOW_EXCEPTION, 15, 117), -3730043);
        A02.put(A05(1053, 12, 80), -15132304);
        A02.put(A05(1065, 9, 90), -655366);
        A02.put(A05(1074, 9, 125), -6943);
        A02.put(A05(1083, 8, 104), -6987);
        A02.put(A05(1091, 11, 108), -8531);
        A02.put(A05(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, 4, 71), -16777088);
        A02.put(A05(1106, 7, 16), -133658);
        A02.put(A05(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, 5, 64), -8355840);
        A02.put(A05(1118, 9, 27), -9728477);
        A02.put(A05(1127, 6, 55), -23296);
        A02.put(A05(1133, 9, 23), -47872);
        A02.put(A05(1142, 6, 5), -2461482);
        A02.put(A05(1148, 13, 9), -1120086);
        A02.put(A05(1161, 9, 111), -6751336);
        A02.put(A05(1170, 13, 61), -5247250);
        A02.put(A05(1183, 13, 105), -2396013);
        A02.put(A05(1196, 10, 20), -4139);
        A02.put(A05(1206, 9, 90), -9543);
        A02.put(A05(1215, 4, 116), -3308225);
        A02.put(A05(1219, 4, 42), -16181);
        A02.put(A05(1223, 4, 116), -2252579);
        A02.put(A05(1227, 10, 2), -5185306);
        A02.put(A05(1237, 6, 92), -8388480);
        A02.put(A05(1243, 13, 36), -10079335);
        A02.put(A05(1256, 3, 41), Integer.valueOf((int) SupportMenu.CATEGORY_MASK));
        A02.put(A05(1266, 9, 52), -4419697);
        A02.put(A05(1275, 9, 24), -12490271);
        A02.put(A05(1284, 11, 55), -7650029);
        A02.put(A05(1295, 6, 62), -360334);
        A02.put(A05(1301, 10, 125), -744352);
        A02.put(A05(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, 8, 14), -13726889);
        A02.put(A05(1319, 8, 36), -2578);
        A02.put(A05(1327, 6, 32), -6270419);
        A02.put(A05(1333, 6, 16), -4144960);
        A02.put(A05(1339, 7, 36), -7876885);
        A02.put(A05(1346, 9, 78), -9807155);
        A02.put(A05(1355, 9, 121), -9404272);
        A02.put(A05(1364, 9, 19), -9404272);
        A02.put(A05(1373, 4, 125), -1286);
        A02.put(A05(1377, 11, 100), -16711809);
        A02.put(A05(1388, 9, 68), -12156236);
        A02.put(A05(1397, 3, 69), -2968436);
        A02.put(A05(IronSourceConstants.RV_CAP_PLACEMENT, 4, 102), -16744320);
        A02.put(A05(IAdLoadingError.LoadErrorType.NOT_FOUND, 7, 80), -2572328);
        A02.put(A05(1411, 6, 50), -40121);
        A02.put(A05(1417, 11, 99), 0);
        A02.put(A05(1428, 9, 31), -12525360);
        A02.put(A05(1437, 6, 84), -1146130);
        A02.put(A05(1443, 5, 55), -663885);
        A02.put(A05(1448, 5, 49), -1);
        A02.put(A05(1453, 10, 101), -657931);
        A02.put(A05(1463, 6, 38), Integer.valueOf((int) InputDeviceCompat.SOURCE_ANY));
        A02.put(A05(1469, 11, 30), -6632142);
    }

    public static int A00(int i, int i2, int i3) {
        return A01(255, i, i2, i3);
    }

    public static int A01(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A02(String str) {
        return A04(str, true);
    }

    public static int A03(String str) {
        return A04(str, false);
    }

    public static int A04(String str, boolean z) {
        int parseInt;
        AbstractC11914Hf.A03(!TextUtils.isEmpty(str));
        String replace = str.replace(A05(0, 1, 103), A05(0, 0, 32));
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith(A05(1262, 4, 13))) {
            Matcher matcher = (z ? A03 : A04).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    parseInt = (int) (Float.parseFloat(matcher.group(4)) * 255.0f);
                } else {
                    parseInt = Integer.parseInt(matcher.group(4), 10);
                }
                return A01(parseInt, Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith(A05(1259, 3, 40))) {
            Matcher matcher2 = A05.matcher(replace);
            if (matcher2.matches()) {
                return A00(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer color = A02.get(AbstractC11953IK.A0M(replace));
            if (color != null) {
                return color.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
