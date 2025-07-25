package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.google.common.primitives.SignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cb */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11623Cb {
    public static byte[] A00;
    public static String[] A01 = {"MFKZRNfE5LKgelOl5YZG5lkN79pCMSOj", "7XRJ9n3VKsznrkMad32wBzGjTyZQuAWt", "DODzeSGoEcF4lIeSgHx85i0M3f36R", "UN4uEosLC7l1uEf6nFtlcbZtnvtJNTdL", "LZW51xhWog0mzOBaK8aIWH1fPTNnB2TH", "5kk0Roeus2oZhYogqtjwPTNstKQRY8en", "saBem6mzmwGkGuCiSgbsTgInQDD10eKq", "7uf5GFKBHSfhhBvQi0nrSYO7FNHs97Sp"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final String[] A0V;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A00 = new byte[]{22, 22, 22, 22, 103, 76, 45, 110, 108, 125, 104, 97, 97, 108, 63, 44, 42, 85, 119, 125, 112, 32, 2, 8, 5, 65, 43, 0, 27, 27, 26, 56, 50, 63, 123, 11, 46, 53, 48, 92, 126, 114, 104, 110, 105, 116, 126, 123, 86, 78, 95, 72, 84, 104, 85, 89, 81, 123, 86, 78, 95, 72, 84, 91, 78, 83, 76, 95, 82, 126, 113, 122, 118, 125, 103, 22, 57, 62, 58, 50, 65, 118, 97, 110, 116, 103, 97, 114, 100, 101, 12, 47, 34, 34, 47, 42, 12, 47, 61, 61, 96, 71, 67, 86, 25, 62, 57, 52, 57, 40, 3, 13, 74, 40, 11, 4, 14, 93, 115, 126, 124, 116, 63, 82, 122, 107, 126, 115, 98, 76, 85, 69, 71, 82, 65, 83, 83, 72, 102, Byte.MAX_VALUE, 111, 121, 72, 101, 101, 126, 115, 42, 72, 107, 121, 121, 36, 20, 15, 18, 54, 9, 22, 58, 24, 27, 24, 11, 28, 13, 23, 49, 56, 32, 61, 55, 31, 52, 61, 49, 62, 57, 46, 124, 17, 41, 47, 53, 63, 85, 126, 119, 120, 101, 121, 120, 76, 103, 96, 125, 122, 124, 44, 7, 29, 6, 28, 27, 6, 14, 1, 79, 40, 14, 1, 8, 28, 27, 14, 79, 61, 14, 31, 105, 66, 88, 67, 89, 94, 67, 75, 68, 10, 120, 75, 90, 115, 88, 66, 89, 67, 68, 89, 81, 94, 16, 98, 95, 83, 91, 37, 10, 7, 21, 21, 15, 5, 70, 52, 9, 5, 13, 32, 15, 2, 16, 16, 10, 0, 2, 15, 37, 10, 19, 4, 30, 49, 40, 63, 112, 21, 50, 40, 46, 56, 17, 61, 63, 55, 54, 43, 17, 61, 60, 38, 55, 63, 34, 61, 32, 51, 32, 43, 114, 17, 58, 32, 59, 33, 38, 59, 51, 60, 113, 93, 71, 92, 70, SignedBytes.MAX_POWER_OF_TWO, 75, 103, 86, 75, 87, 87, 75, 82, 65, 86, 77, 123, 98, 122, 16, 53, 58, 55, 49, 88, 125, 114, Byte.MAX_VALUE, 121, 60, 84, 125, 112, 112, 90, Byte.MAX_VALUE, 108, 117, 105, Byte.MAX_VALUE, 104, 123, 83, 114, 118, 99, Byte.MAX_VALUE, 55, 90, 114, 99, 118, 123, SignedBytes.MAX_POWER_OF_TWO, 109, 119, 103, 107, 60, 10, 29, 25, 21, 74, 124, 123, 99, 46, 40, 46, 76, 111, 125, 125, 54, 0, 7, 31, 82, 33, 29, 30, 29, 50, 3, 19, 2, 59, 31, 13, 7, 94, 50, 23, 13, 10, 27, 16, 23, 16, 25, 80, 121, 112, 118, 97, 103, 122, 123, 124, 118, 73, 120, 100, 98, 101, 111, 66, 114, 117, 104, 42, 79, 104, 114, 116, 98, 42, 26, 29, 0, 66, 59, 10, 12, 7, 1, 0, 4, 52, 51, 46, 37, 32, 47, 34, 36, 126, 89, 81, 84, 93, 92, 24, 76, 87, 24, 72, 89, 74, 75, 93, 24, 91, 87, 85, 85, 93, 86, 76, 24, 89, 76, 76, 74, 81, 90, 77, 76, 93, 2, 24, 8, 47, 39, 34, 43, 42, 110, 58, 33, 110, 62, 47, 60, 61, 43, 110, 45, 33, 56, 43, 60, 110, 47, 60, 58, 110, 47, 58, 58, 60, 39, 44, 59, 58, 43, 111, 72, SignedBytes.MAX_POWER_OF_TWO, 69, 76, 77, 9, 93, 70, 9, 89, 72, 91, 90, 76, 9, SignedBytes.MAX_POWER_OF_TWO, 71, 77, 76, 81, 6, 74, 70, 92, 71, 93, 9, 72, 93, 93, 91, SignedBytes.MAX_POWER_OF_TWO, 75, 92, 93, 76, 19, 9, SignedBytes.MAX_POWER_OF_TWO, 103, 111, 106, 99, 98, 38, 114, 105, 38, 118, 103, 116, 117, 99, 38, 117, 114, 103, 104, 98, 103, 116, 98, 38, 97, 99, 104, 116, 99, 38, 101, 105, 98, 99, 55, 16, 24, 29, 20, 21, 81, 5, 30, 81, 1, 16, 3, 2, 20, 81, 5, 20, 9, 5, 81, 16, 5, 5, 3, 24, 19, 4, 5, 20, 75, 81, 9, 46, 38, 35, 42, 43, 111, 59, 32, 111, 63, 46, 61, 60, 42, 111, 58, 38, 33, 59, 119, 111, 46, 59, 59, 61, 38, 45, 58, 59, 42, 111, 57, 46, 35, 58, 42, 113, 86, 94, 91, 82, 83, 23, 67, 88, 23, 71, 86, 69, 68, 82, 23, 66, 94, 89, 67, 15, 23, 86, 67, 67, 69, 94, 85, 66, 67, 82, 13, 23, 41, 14, 28, 27, 79, 41, 26, 28, 6, 0, 1, 32, 9, 10, 13, 99, 74, 73, 78, 8, 119, 74, 70, 78, 101, 76, 79, 72, 79, 76, 81, 70, 85, 97, 118, 118, 96, 103, 106, Byte.MAX_VALUE, 118, 119, 68, 95, 90, 63, 12, 10, 16, 22, 23, 112, 86, 90, 82, 20, 50, 61, 52, 32, 39, 50, 80, 120, 118, 90, 114, 110, 109, 120, 113, 120, 80, 75, 87, 86, 92, 32, 8, 19, 15, 14, 4, 71, 53, 8, 4, 12, 82, 103, 96, 123, 114, 112, Byte.MAX_VALUE, 86, 69, 83, 23, 101, 88, 84, 92, 15, 38, 53, 35, 36, 40, 53, 34, 105, 68, SignedBytes.MAX_POWER_OF_TWO, 87, 88, 1, 108, 68, 85, SignedBytes.MAX_POWER_OF_TWO, 77, 124, 93, 68, 25, 124, 91, 68, 27, 60, 38, 32, 54, 1, 60, 36, 38, 60, 59, 56, 37, 36, 63, 52, 34, 48, 53, 39, 56, 34, 62, 35, 40, 74, 87, 86, 77, 70, 80, 68, 66, 83, 79, 70, 80, 80, 86, 113, 123, 118, 122, 29, 58, 48, 33, 39, 32, 38, 61, 53, 56, 63, 24, 5, 2, 4, 3, 27, 19, 24, 2, 23, 26, 52, 19, 14, 9, 15, 8, 16, 24, 19, 9, 28, 17, 93, 45, 18, 13, 120, 95, 66, 69, 67, 68, 92, 84, 95, 69, 80, 93, 17, 99, 94, 82, 90, 63, 20, 15, 15, 100, 79, 84, 84, 5, 104, 91, SignedBytes.MAX_POWER_OF_TWO, 69, 28, 38, 57, 38, 46, 17, 10, 3, 8, 1, 107, 70, 83, 78, 73, 79, 108, 46, 69, 106, 79, 103, 102, 107, 118, 99, 118, 107, 116, 103, 55, 31, 8, 31, 20, 29, 15, 31, 6, 46, 63, 42, 47, 42, 63, 42, 30, 63, 34, 39, 48, 24, 9, 28, 17, 93, 101, 
        99, 121, 115, 113, 124, 99, 76, 89, 68, 66, 67, 76, 65, 13, 107, 66, 65, 70, 83, 124, 105, 116, 107, 120, 61, 92, 112, 120, 111, 116, 126, 124, 115, 50, 25, 27, 25, 14, 12, 9, 18, 23, 113, 90, 72, 31, 126, 88, 90, 109, 70, 84, 3, 116, 66, 85, 70, 84, 117, 115, 105, Byte.MAX_VALUE, 119, 84, 92, 81, 93, 75, 5, 58, 47, 56, 43, 47, 20, 8, 5, 18, 103, 88, 91, 92, 86, 70, 121, 122, 101, 125, 54, 70, 99, 120, 125, 116, 75, 84, 91, 100, 123, 38, 77, 100, 103, 96, 56, 7, 24, 71, 46, 29, 6, 3, 96, 95, 66, 94, 16, 119, 66, 95, 95, 70, 85, 86, 105, 113, 99, 116, 38, 68, 103, 106, 106, 103, 98, 47, 13, 30, 17, 20, 12, 96, 66, 89, 93, 69, 67, 45, 15, 18, 26, 15, 24, 14, 14, 20, 11, 24, 93, 47, 18, 30, 22, 96, 67, 73, 83, 88, 81, 84, 85, 92, 89, 83, 106, 73, 67, 89, 82, 95, 94, 95, 86, 83, 89, 26, 104, 85, 89, 81, SignedBytes.MAX_POWER_OF_TWO, 101, 126, 123, 126, 91, SignedBytes.MAX_POWER_OF_TWO, 69, 14, 124, 65, 77, 69, 66, 54, 82, 42, 25, 8, 94, 109, 122, 105, 62, 9, 11, 11, 13, 9, 78, 121, 104, 110, 115, 56, 15, 28, 3, 28, 11, 6, 119, 77, 92, 81, 77, 72, 76, 70, 5, 118, 74, 80, 73, 100, 89, 85, 93, 79, 114, 126, 118, 61, 59, 61, 79, 114, 113, 113, 121, 75, 70, 89, 75, 1, 51, 63, 48, 51, 34, 16, 5, 24, 3, 20, 9, 50, 53, 45, 46, 47, 52, 63, 41, 30, 38, 44, 94, 102, 100, 125, 125, 104, 105, 45, 120, 99, 102, 99, 98, 122, 99, 45, 96, 104, 121, 108, 105, 108, 121, 108, 45, 104, 99, 121, Byte.MAX_VALUE, 116, 55, 45, 82, 109, 110, 118, 33, 75, 96, 108, 83, 108, 111, 119, 32, 82, 111, 99, 107, 123, 71, 70, 73, 92, 73, 108, 80, 74, 83, 71, 123, 97, 122, 112, 52, 87, 120, 125, 100, 39, 27, 1, 26, 16, 0, 6, 21, 23, 31, 101, 89, 67, 66, 94, 83, 68, 88, 22, 100, 89, 85, 93, 22, 53, 36, 38, 32, 61, 30, 11, 11, 13, 6, 125, 89, 71, SignedBytes.MAX_POWER_OF_TWO, 73, 19, 57, 45, 48, 40, 47, 46, 41, 35, 96, 18, 47, 35, 43, 8, 34, 54, 43, 51, 52, 53, 34, 97, 75, 92, 70, 90, 66, 93, 66, 60, 41, 36, 42, 108, 122, 104, 117, 98, 117, 123, 102, 22, 1, 13, 15, 102, 113, 125, 124, 55, 39, 49, 32, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 26, 54, 43, 54, 80, 102, 98, 119, 3, 62, 58, 47, 88, 96, 100, 123, 103, 35, 37, 52, 60, 57, 62, 34, 95, 110, 105, 117, 123, 77, 74, 86, 90, 73, 78, 82, 77, 3, 4, 24, 3, 98, 101, 101, 115, 99, 97, 100, Byte.MAX_VALUE, 120, 96, 99, 97, 100, Byte.MAX_VALUE, 120, 96, 100, 120, 101, 99, 14, 59, 52, 61, 53, 15, 62, 56, 51, 53, 52, 118, 71, 65, 74, 76, 77, 15, 107, 76, 70, 87, 81, 86, 80, 75, 67, 78, 28, 45, 58, 58, 39, 58, 60, 0, 26, 9, 27, 0, 72, 37, 13, 28, 9, 4, 101, 94, 65, 17, 5, 1, 2, 36, 55, 63, 58, 51, 36, 91, 125, 110, 97, 108, 106, 0, 38, 61, 54, 53, 56, 55, 17, 10, 19, 78, 43, 12, 19, 14, 8, 23, 15, 2, 57, 37, 50, 52, 56, 48, 57, 62, 45, 50, 51, 119, 52, 56, 33, 50, 37, 119, 54, 37, 35, 119, 49, 59, 54, 48, 36, 109, 119, Byte.MAX_VALUE, 70, 74, 72, 69, 47, 15, 28, 26, 36, 41, 39, 54, 56, 33, 55, 59, 57, 9, 5, 28, 24, 75, 88, 65, 68, 75, 78, 86, 124, 113, 107, 115, 89, 91, 80, 81, 88, 68, 83, 98, 119, 117, 11, 15, 3, 5, 7, 77, 8, 18, 7, 5, 74, 78, 66, 68, 70, 12, 83, 77, 68, 60, 41, 34, 43, 36, 40, 95, 72, 78, 95, 92, 90, SignedBytes.MAX_POWER_OF_TWO, 73, 100, 120, 118, 118, 116, 104, 102, 107, 122, 102, 104, 123, 0, 28, 16, 28, 63, 35, 34, 33, 37, 57, 37, 56, 40, 49, 44, 51, 44, 55, 55, 89, 95, 70, 121, Byte.MAX_VALUE, 102, 99, 44, 46, 43, 48, 120, 99, 105, 74, 79, 73};
    }

    static {
        A0A();
        A0A = AbstractC11953IK.A08(A09(1691, 3, 5));
        A0B = AbstractC11953IK.A08(A09(1733, 3, 109));
        A04 = AbstractC11953IK.A08(A09(1638, 3, 21));
        A0C = AbstractC11953IK.A08(A09(1652, 3, 111));
        A03 = AbstractC11953IK.A08(A09(14, 3, 62));
        A07 = AbstractC11953IK.A08(A09(1730, 3, 24));
        A02 = AbstractC11953IK.A08(A09(1635, 3, 5));
        A05 = AbstractC11953IK.A08(A09(1641, 3, 20));
        A06 = AbstractC11953IK.A08(A09(1747, 3, 125));
        A09 = AbstractC11953IK.A08(A09(1688, 3, 16));
        A08 = AbstractC11953IK.A08(A09(1659, 3, 126));
        A0F = AbstractC11953IK.A08(A09(1644, 4, 42));
        A0I = AbstractC11953IK.A08(A09(1662, 4, 118));
        A0J = AbstractC11953IK.A08(A09(1666, 3, 69));
        A0G = AbstractC11953IK.A08(A09(1655, 4, 88));
        A0S = AbstractC11953IK.A08(A09(1736, 4, 77));
        A0R = AbstractC11953IK.A08(A09(1726, 4, 28));
        A0E = AbstractC11953IK.A08(A09(1648, 4, 104));
        A0D = AbstractC11953IK.A08(A09(1631, 4, 14));
        A0Q = AbstractC11953IK.A08(A09(1718, 4, 12));
        A0M = AbstractC11953IK.A08(A09(1706, 4, 71));
        A0O = AbstractC11953IK.A08(A09(1710, 4, 73));
        A0N = AbstractC11953IK.A08(A09(1702, 4, 87));
        A0P = AbstractC11953IK.A08(A09(1714, 4, 51));
        A0L = AbstractC11953IK.A08(A09(1698, 4, 110));
        A0H = AbstractC11953IK.A08(A09(1694, 4, 111));
        A0U = AbstractC11953IK.A08(A09(IronSourceConstants.errorCode_TEST_SUITE_DISABLED, 4, 22));
        A0T = AbstractC11953IK.A08(A09(1740, 4, 24));
        A0K = AbstractC11953IK.A08(A09(0, 4, 123));
        A0V = new String[]{A09(137, 5, 74), A09(246, 12, 38), A09(309, 7, 114), A09(329, 5, 20), A09(363, 5, 68), A09(744, 4, 113), A09(791, 6, 85), A09(825, 7, 116), A09(930, 4, 53), A09(993, 5, 61), A09(IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED, 7, 127), A09(1062, 6, 120), A09(1073, 5, 32), A09(1093, 3, 100), A09(1203, 3, 80), A09(1206, 3, 56), A09(1213, 6, 44), A09(1244, 4, 118), A09(1518, 6, 27), A09(875, 10, 20), A09(57, 11, 122), A09(1284, 3, 13), A09(352, 11, 87), A09(1135, 6, 63), A09(1356, 10, 52), A09(437, 11, 47), A09(68, 7, 83), A09(1584, 8, 35), A09(1626, 5, 105), A09(934, 9, 110), A09(748, 6, 57), A09(1572, 6, 79), A09(258, 9, 35), A09(885, 12, 54), A09(17, 4, 84), A09(832, 5, 19), A09(754, 4, 119), A09(1346, 10, 84), A09(768, 6, 93), A09(IronSourceError.ERROR_RV_EXPIRED_ADS, 5, 90), A09(47, 10, 122), A09(96, 4, 14), A09(1342, 4, 127), A09(1190, 4, 80), A09(1379, 5, 5), A09(963, 10, 66), A09(897, 16, 61), A09(913, 17, 113), A09(421, 6, 76), A09(774, 6, 127), A09(344, 8, 94), A09(1524, 17, 98), A09(411, 10, 85), A09(1096, 8, 75), A09(448, 9, 1), A09(368, 5, 56), A09(1366, 13, 118), A09(281, 6, 18), A09(325, 4, 78), A09(758, 7, 19), A09(1559, 6, 113), A09(219, 13, 106), A09(1104, 8, 40), A09(947, 6, 36), A09(1018, 15, 93), A09(159, 7, 57), A09(1049, 8, 99), A09(1163, 11, 112), A09(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, 4, 76), A09(1275, 9, 26), A09(1565, 7, 22), A09(958, 5, 67), A09(1578, 6, 20), A09(30, 9, 27), A09(21, 9, 33), A09(1078, 5, 119), A09(1219, 5, 92), A09(998, 7, 80), A09(1248, 11, 93), A09(797, 9, 119), A09(714, 4, 38), A09(IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_SERVER_DATA, 9, 101), A09(1005, 13, 109), A09(1390, 5, 110), A09(703, 11, 47), A09(104, 5, 27), A09(953, 5, 103), A09(1224, 7, 42), A09(166, 6, 20), A09(128, 9, 96), A09(80, 10, 64), A09(780, 11, 39), A09(1147, 16, 61), A09(1174, 16, 122), A09(1395, 14, 0), A09(1327, 9, 64), A09(109, 8, 42), A09(192, 6, 79), A09(397, 14, 62), A09(39, 8, 93), A09(837, 6, 9), A09(1384, 6, 46), A09(185, 7, 86), A09(1068, 5, 10), A09(172, 13, 28), A09(1336, 6, 104), A09(1409, 8, 27), A09(142, 10, 74), A09(1141, 6, 112), A09(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, 11, 112), A09(1269, 6, 49), A09(1319, 8, 65), A09(267, 4, 38), A09(1513, 5, 26), A09(1264, 5, 18), A09(727, 8, 99), A09(90, 6, 14), A09(1123, 12, 70), A09(1231, 13, 101), A09(735, 9, 83), A09(393, 4, 54), A09(1194, 9, 110), A09(384, 9, 50), A09(5, 9, 77), A09(427, 10, 71), A09(334, 10, 92), A09(765, 3, 87), A09(373, 11, 78), A09(271, 10, 29), A09(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE, 8, 7), A09(1541, 6, 8), A09(870, 5, 95), A09(ErrorCode.CODE_NOT_TRACK_STATUS, 7, 38), A09(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 9, 60), A09(1083, 10, 86), A09(100, 4, 98), A09(198, 21, 47), A09(814, 11, 97), A09(117, 11, 95), A09(316, 9, 100), A09(287, 22, 18), A09(232, 14, 112), A09(973, 8, 58), A09(1259, 5, 106), A09(1547, 12, 40), A09(75, 5, 23), A09(943, 4, 22), A09(1417, 8, 114)};
    }

    public static int A00(C11939I4 c11939i4) {
        c11939i4.A0Z(4);
        int A082 = c11939i4.A08();
        int atomType = AbstractC11610CO.A0F;
        if (A082 == atomType) {
            c11939i4.A0Z(8);
            int A0E2 = c11939i4.A0E();
            if (A01[5].charAt(25) != 'K') {
                throw new RuntimeException();
            }
            A01[6] = "v3dratF8uS1bGgr8CKDg71frPtPmOQP2";
            return A0E2;
        }
        Log.w(A09(981, 12, 11), A09(633, 37, 15));
        return -1;
    }

    public static ApicFrame A01(C11939I4 c11939i4) {
        String mimeType;
        int A082 = c11939i4.A08();
        int A083 = c11939i4.A08();
        int i = AbstractC11610CO.A0F;
        String A092 = A09(981, 12, 11);
        if (A083 == i) {
            int A084 = c11939i4.A08();
            int atomType = A01[0].charAt(15);
            if (atomType != 108) {
                throw new RuntimeException();
            }
            A01[5] = "qGElklccUGYaCPiJcZ7Rg4NshKbeEBAR";
            int A002 = AbstractC11610CO.A00(A084);
            if (A002 == 13) {
                int atomType2 = A01[7].charAt(20);
                if (atomType2 != 83) {
                    throw new RuntimeException();
                }
                A01[6] = "0c2lioblnouP1EUceYfeEOePY9KxVly9";
                mimeType = A09(1669, 10, 34);
            } else {
                mimeType = A002 == 14 ? A09(1679, 9, 99) : null;
            }
            if (mimeType == null) {
                Log.w(A092, A09(1596, 30, 23) + A002);
                return null;
            }
            c11939i4.A0Z(4);
            int atomSize = A082 - 16;
            byte[] bArr = new byte[atomSize];
            int atomSize2 = bArr.length;
            c11939i4.A0c(bArr, 0, atomSize2);
            return new ApicFrame(mimeType, null, 3, bArr);
        }
        Log.w(A092, A09(492, 35, 14));
        return null;
    }

    public static CommentFrame A02(int i, C11939I4 c11939i4) {
        int A082 = c11939i4.A08();
        int atomType = c11939i4.A08();
        int atomSize = AbstractC11610CO.A0F;
        if (atomType == atomSize) {
            c11939i4.A0Z(8);
            int atomSize2 = A082 - 16;
            String A0R2 = c11939i4.A0R(atomSize2);
            return new CommentFrame(A09(1744, 3, 77), A0R2, A0R2);
        }
        Log.w(A09(981, 12, 11), A09(457, 35, 120) + AbstractC11610CO.A02(i));
        return null;
    }

    public static Id3Frame A03(int i, String str, C11939I4 c11939i4, boolean z, boolean z2) {
        int A002 = A00(c11939i4);
        if (z2) {
            A002 = Math.min(1, A002);
        }
        if (A002 >= 0) {
            if (z) {
                return new TextInformationFrame(str, null, Integer.toString(A002));
            }
            return new CommentFrame(A09(1744, 3, 77), str, Integer.toString(A002));
        }
        Log.w(A09(981, 12, 11), A09(670, 33, 119) + AbstractC11610CO.A02(i));
        return null;
    }

    public static Id3Frame A04(C11939I4 c11939i4) {
        int position = c11939i4.A06();
        int shortType = c11939i4.A08() + position;
        int typeTopByte = c11939i4.A08();
        int position2 = typeTopByte >> 24;
        int endPosition = position2 & 255;
        try {
            if (endPosition == 169 || endPosition == 65533) {
                int endPosition2 = 16777215 & typeTopByte;
                int position3 = A04;
                if (endPosition2 == position3) {
                    return A02(typeTopByte, c11939i4);
                }
                int position4 = A0A;
                if (endPosition2 != position4) {
                    int position5 = A0B;
                    if (endPosition2 != position5) {
                        int position6 = A05;
                        if (endPosition2 != position6) {
                            int position7 = A06;
                            if (endPosition2 != position7) {
                                int position8 = A0C;
                                if (endPosition2 == position8) {
                                    return A07(typeTopByte, A09(1445, 4, 35), c11939i4);
                                }
                                int position9 = A03;
                                if (endPosition2 == position9) {
                                    return A07(typeTopByte, A09(1457, 4, 114), c11939i4);
                                }
                                int position10 = A07;
                                if (endPosition2 == position10) {
                                    return A07(typeTopByte, A09(1493, 4, 118), c11939i4);
                                }
                                int position11 = A02;
                                if (endPosition2 == position11) {
                                    return A07(typeTopByte, A09(1425, 4, 40), c11939i4);
                                }
                                int position12 = A09;
                                if (endPosition2 == position12) {
                                    TextInformationFrame A072 = A07(typeTopByte, A09(1592, 4, 27), c11939i4);
                                    c11939i4.A0Y(shortType);
                                    if (A01[0].charAt(15) == 108) {
                                        A01[6] = "eyrANlZcPMjIlGp3ctz43NSDdPrpVkXq";
                                        return A072;
                                    }
                                    throw new RuntimeException();
                                }
                                int position13 = A08;
                                if (endPosition2 == position13) {
                                    return A07(typeTopByte, A09(1441, 4, 114), c11939i4);
                                }
                                int position14 = A0J;
                                if (endPosition2 == position14) {
                                    return A07(typeTopByte, A09(1449, 4, 107), c11939i4);
                                }
                                String str = A09(1287, 32, 77) + AbstractC11610CO.A02(typeTopByte);
                                c11939i4.A0Y(shortType);
                                return null;
                            }
                        }
                        return A07(typeTopByte, A09(1437, 4, 2), c11939i4);
                    }
                }
                return A07(typeTopByte, A09(1453, 4, 34), c11939i4);
            }
            int position15 = A0I;
            if (typeTopByte == position15) {
                return A08(c11939i4);
            }
            int position16 = A0G;
            if (typeTopByte == position16) {
                return A06(typeTopByte, A09(1465, 4, 116), c11939i4);
            }
            int position17 = A0S;
            if (typeTopByte == position17) {
                TextInformationFrame A062 = A06(typeTopByte, A09(1469, 4, 55), c11939i4);
                c11939i4.A0Y(shortType);
                if (A01[5].charAt(25) != 75) {
                    A01[5] = "dEL4MrWRD0Kzey4hGoWDZqcvUKARoqwc";
                    return A062;
                }
                A01[3] = "cOy0hASJa7X3hhl8ive1T2ECen89aHEG";
                return A062;
            }
            int i = A0R;
            if (A01[3].charAt(23) != 48) {
                A01[5] = "gKC5wBYBO5OKTL9rk0LJP6CrzKHysN1x";
                if (typeTopByte == i) {
                    return A03(typeTopByte, A09(1429, 4, 120), c11939i4, true, false);
                }
                if (typeTopByte == A0E) {
                    return A03(typeTopByte, A09(1433, 4, 118), c11939i4, true, true);
                }
                if (typeTopByte == A0F) {
                    return A01(c11939i4);
                }
                if (typeTopByte == A0D) {
                    return A07(typeTopByte, A09(1461, 4, 42), c11939i4);
                }
                if (typeTopByte == A0Q) {
                    return A07(typeTopByte, A09(1489, 4, 23), c11939i4);
                }
                if (typeTopByte == A0M) {
                    return A07(typeTopByte, A09(1473, 4, 45), c11939i4);
                }
                if (typeTopByte == A0O) {
                    return A07(typeTopByte, A09(1477, 4, 122), c11939i4);
                }
                if (typeTopByte == A0N) {
                    return A07(typeTopByte, A09(1485, 4, 93), c11939i4);
                }
                if (typeTopByte == A0P) {
                    return A07(typeTopByte, A09(1481, 4, 89), c11939i4);
                }
                if (typeTopByte == A0L) {
                    return A03(typeTopByte, A09(843, 14, 49), c11939i4, false, false);
                }
                if (typeTopByte == A0H) {
                    return A03(typeTopByte, A09(857, 13, 67), c11939i4, false, true);
                }
                int position18 = A0U;
                if (typeTopByte == position18) {
                    return A07(typeTopByte, A09(1503, 10, 119), c11939i4);
                }
                int position19 = A0T;
                if (typeTopByte == position19) {
                    TextInformationFrame A073 = A07(typeTopByte, A09(1497, 6, 119), c11939i4);
                    c11939i4.A0Y(shortType);
                    if (A01[2].length() == 29) {
                        A01[7] = "PHa0inyi7GEpnSXSpoRXSebHTJ1KJs15";
                        return A073;
                    }
                    throw new RuntimeException();
                }
                int position20 = A0K;
                if (typeTopByte == position20) {
                    return A05(c11939i4, shortType);
                }
                String str2 = A09(1287, 32, 77) + AbstractC11610CO.A02(typeTopByte);
                c11939i4.A0Y(shortType);
                return null;
            }
            throw new RuntimeException();
        } finally {
            c11939i4.A0Y(shortType);
        }
    }

    public static InternalFrame A05(C11939I4 c11939i4, int i) {
        String str = null;
        String str2 = null;
        int atomPosition = -1;
        int i2 = -1;
        while (c11939i4.A06() < i) {
            int atomType = c11939i4.A06();
            int atomSize = c11939i4.A08();
            int A082 = c11939i4.A08();
            c11939i4.A0Z(4);
            if (A082 == AbstractC11610CO.A0e) {
                int atomSize2 = atomSize - 12;
                String name = A01[0];
                if (name.charAt(15) != 'l') {
                    throw new RuntimeException();
                }
                A01[6] = "HO4eaJrrMSu6AjdqNxy31Do5DdGYo5fB";
                str = c11939i4.A0R(atomSize2);
            } else if (A082 == AbstractC11610CO.A0o) {
                str2 = c11939i4.A0R(atomSize - 12);
            } else {
                if (A082 == AbstractC11610CO.A0F) {
                    atomPosition = atomType;
                    i2 = atomSize;
                }
                c11939i4.A0Z(atomSize - 12);
            }
        }
        if (str == null || str2 == null || atomPosition == -1) {
            return null;
        }
        c11939i4.A0Y(atomPosition);
        c11939i4.A0Z(16);
        String name2 = c11939i4.A0R(i2 - 16);
        return new InternalFrame(str, str2, name2);
    }

    public static TextInformationFrame A06(int i, String str, C11939I4 c11939i4) {
        int A082 = c11939i4.A08();
        int atomType = c11939i4.A08();
        int atomSize = AbstractC11610CO.A0F;
        if (atomType == atomSize && A082 >= 22) {
            c11939i4.A0Z(10);
            int A0I2 = c11939i4.A0I();
            if (A0I2 > 0) {
                String str2 = A09(0, 0, 95) + A0I2;
                int count = c11939i4.A0I();
                if (count > 0) {
                    str2 = str2 + A09(4, 1, 8) + count;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        Log.w(A09(981, 12, 11), A09(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 39, 105) + AbstractC11610CO.A02(i));
        return null;
    }

    public static TextInformationFrame A07(int i, String str, C11939I4 c11939i4) {
        int A082 = c11939i4.A08();
        int atomType = c11939i4.A08();
        int atomSize = AbstractC11610CO.A0F;
        if (atomType == atomSize) {
            c11939i4.A0Z(8);
            int atomSize2 = A082 - 16;
            return new TextInformationFrame(str, null, c11939i4.A0R(atomSize2));
        }
        Log.w(A09(981, 12, 11), A09(601, 32, 49) + AbstractC11610CO.A02(i));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame A08(com.facebook.ads.redexgen.p370X.C11939I4 r4) {
        /*
            int r2 = A00(r4)
            r4 = 0
            if (r2 <= 0) goto L23
            java.lang.String[] r0 = com.facebook.ads.redexgen.p370X.AbstractC11623Cb.A0V
            int r0 = r0.length
            if (r2 > r0) goto L23
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.AbstractC11623Cb.A0V
            int r0 = r2 + (-1)
            r3 = r1[r0]
        L12:
            if (r3 == 0) goto L25
            r2 = 1441(0x5a1, float:2.019E-42)
            r1 = 4
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r1 = A09(r2, r1, r0)
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame r0 = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame
            r0.<init>(r1, r4, r3)
            return r0
        L23:
            r3 = r4
            goto L12
        L25:
            r2 = 981(0x3d5, float:1.375E-42)
            r1 = 12
            r0 = 11
            java.lang.String r3 = A09(r2, r1, r0)
            r2 = 566(0x236, float:7.93E-43)
            r1 = 35
            r0 = 70
            java.lang.String r0 = A09(r2, r1, r0)
            android.util.Log.w(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC11623Cb.A08(com.facebook.ads.redexgen.X.I4):com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame");
    }
}
