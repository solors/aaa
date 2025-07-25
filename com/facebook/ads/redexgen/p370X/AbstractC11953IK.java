package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.maticoo.sdk.utils.error.ErrorCode;
import com.mbridge.msdk.playercommon.exoplayer2.C22533C;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.IK */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11953IK {
    public static byte[] A00;
    public static String[] A01 = {"QftHiBRvElUGR", "VhoqgbC2B9SangBNTcV7FdDvnuQFXcUL", "AruVgqtw9SSJa1GbS2Jua5nx5c2z4Oqb", "CbWdg7Es3Lgq62AjK6RJTjV5Dc6KX2S1", "JszIiwF6iMwqf9Y6k9S8MdsP1aqFMohh", "IRPRX55QPzo4gZSSSU3YM96DmJAcp5Ck", "GSwfN2ajc7VUr", "HSA7qn06ePx53GJEFMmIpcMYLn0Jr4sG"};
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final Pattern A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final int[] A0A;

    public static String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A0U() {
        A00 = new byte[]{93, 85, 49, 20, 19, 8, 5, 70, 60, 19, 25, 15, 18, 20, 25, 93, 10, 7, 116, 110, 2, 105, 78, 2, 73, 31, 2, 22, 114, 84, 29, 82, 6, 82, 38, 30, 38, 30, 38, 30, 38, 30, 83, 38, 87, 82, 38, 30, 38, 30, 83, 38, 87, 82, 38, 30, 38, 30, 83, 33, 46, 14, 39, 82, 38, 30, 38, 30, 83, SignedBytes.MAX_POWER_OF_TWO, 82, 38, 30, 38, 30, 83, SignedBytes.MAX_POWER_OF_TWO, 82, 38, 30, 38, 30, 83, 82, 33, 38, 84, 86, 39, 82, 38, 30, 81, 83, 83, 69, 82, 33, 32, 0, 39, 6, 82, 82, 38, 81, 6, 38, 87, 83, 82, 38, 30, 69, 38, 30, 83, SignedBytes.MAX_POWER_OF_TWO, 69, 82, 38, 30, 38, 30, 83, 83, 83, 69, 90, 83, 119, 123, 72, 96, 37, 24, 15, 48, 12, 1, 25, 5, 18, 44, 9, 2, 79, 82, 78, 88, 78, 84, 105, 104, 122, 17, 4, 84, 34, 39, 35, 53, 90, 34, 34, 81, 58, 39, 51, 87, 32, 35, 83, 35, 53, 34, 34, 81, 58, 39, 51, 87, 32, 35, 71, 35, 53, 34, 34, 81, 58, 39, 51, 87, 32, 35, 78, 35, 53, 34, 94, 34, 34, 81, 58, 39, 51, 87, 32, 35, 66, 35, 53, 34, 34, 81, 58, 39, 51, 87, 32, 35, 71, 35, 53, 34, 34, 81, 58, 39, 51, 36, 87, 32, 35, 89, 35, 53, 35, 53, 46, 91, 84, 81, 88};
    }

    static {
        int i;
        A0U();
        if (Build.VERSION.SDK_INT == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i = 26;
        } else {
            i = Build.VERSION.SDK_INT;
        }
        A02 = i;
        A03 = Build.DEVICE;
        A05 = Build.MANUFACTURER;
        A06 = Build.MODEL;
        StringBuilder append = new StringBuilder().append(A03);
        String A0J = A0J(130, 2, 13);
        A04 = append.append(A0J).append(A06).append(A0J).append(A05).append(A0J).append(A02).toString();
        A08 = Pattern.compile(A0J(33, 95, 44));
        A09 = Pattern.compile(A0J(157, 84, 92));
        A07 = Pattern.compile(A0J(16, 17, 121));
        A0A = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static float A00(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static int A01(int i) {
        switch (i) {
            case 0:
                return 16777216;
            case 1:
                return C22533C.DEFAULT_AUDIO_BUFFER_SIZE;
            case 2:
                return 13107200;
            case 3:
                return 131072;
            case 4:
                return 131072;
            default:
                throw new IllegalStateException();
        }
    }

    public static int A02(int i) {
        switch (i) {
            case 8:
                if (A01[7].charAt(21) != 'm') {
                    String[] strArr = A01;
                    strArr[6] = "zaLvgpaTCIzVj";
                    strArr[0] = "Bie7qFZ76Fx9o";
                    return 3;
                }
                throw new RuntimeException();
            case 16:
                return 2;
            case 24:
                return Integer.MIN_VALUE;
            case 32:
                return 1073741824;
            default:
                return 0;
        }
    }

    public static int A03(int i) {
        switch (i) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int A04(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static int A05(int i, int i2) {
        switch (i) {
            case Integer.MIN_VALUE:
                return i2 * 3;
            case 2:
                return i2 * 2;
            case 3:
                return i2;
            case 4:
            case 1073741824:
                return i2 * 4;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int A06(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static int A07(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static int A08(String str) {
        int length = str.length();
        AbstractC11914Hf.A03(length <= 4);
        int result = 0;
        for (int i = 0; i < length; i++) {
            int length2 = str.charAt(i);
            result = (result << 8) | length2;
        }
        return result;
    }

    public static int A09(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int[] iArr = A0A;
            int i4 = bArr[i];
            i3 = (i3 << 8) ^ iArr[((i3 >>> 24) ^ (i4 & 255)) & 255];
            i++;
        }
        return i3;
    }

    public static int A0A(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else {
            do {
                binarySearch++;
                int index = jArr.length;
                if (binarySearch >= index) {
                    break;
                }
                i = (jArr[binarySearch] > j ? 1 : (jArr[binarySearch] == j ? 0 : -1));
                String[] strArr = A01;
                String str = strArr[4];
                String str2 = strArr[5];
                int charAt = str.charAt(20);
                int index2 = str2.charAt(20);
                if (charAt != index2) {
                    throw new RuntimeException();
                }
                A01[3] = "YtARcLQrDWG8KO1LLbO60FnHOktlNVTt";
            } while (i == 0);
            if (z) {
                binarySearch--;
            }
        }
        if (z2) {
            int index3 = jArr.length;
            return Math.min(index3 - 1, binarySearch);
        }
        return binarySearch;
    }

    public static int A0B(long[] jArr, long j, boolean z, boolean z2) {
        int index;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            int i = binarySearch + 2;
            if (A01[7].charAt(21) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "3waNTwlPhtizgxjFEukxMjxslAm3KwW9";
            strArr[5] = "hqnyJICqt4CMDpPSN8ZqMHnf2BtaEVhm";
            binarySearch = -i;
        } else {
            do {
                binarySearch--;
                String[] strArr2 = A01;
                String str = strArr2[4];
                String str2 = strArr2[5];
                int charAt = str.charAt(20);
                int index2 = str2.charAt(20);
                if (charAt != index2) {
                    A01[3] = "ZDbigrrjiU6GEpi5k5crDglebzfX2Bpv";
                    if (binarySearch < 0) {
                        break;
                    }
                    index = (jArr[binarySearch] > j ? 1 : (jArr[binarySearch] == j ? 0 : -1));
                } else {
                    String[] strArr3 = A01;
                    strArr3[1] = "McRcP118VmSFjmKreiKWRUXw8LRFXrVx";
                    strArr3[2] = "bEx19V6XMUSudWAWNmFVzJXPP33hVIRX";
                    if (binarySearch < 0) {
                        break;
                    }
                    index = (jArr[binarySearch] > j ? 1 : (jArr[binarySearch] == j ? 0 : -1));
                }
            } while (index == 0);
            if (z) {
                binarySearch++;
            }
        }
        return z2 ? Math.max(0, binarySearch) : binarySearch;
    }

    public static long A0C(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(j * f);
    }

    public static long A0D(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = j;
        double d2 = f;
        if (A01[3].charAt(29) != 'q') {
            String[] strArr = A01;
            strArr[6] = "ijgGdPqZAbRlr";
            strArr[0] = "huKgF1iCv5g4q";
            return Math.round(d / d2);
        }
        throw new RuntimeException();
    }

    public static long A0E(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static long A0F(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        String[] strArr = A01;
        if (strArr[6].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "FJO7vVSE9SSCPK1KONP1MvccmiG4XMB1";
        strArr2[5] = "coDNZYbZlo3XQiTwwuBuMhATDIBhF0mf";
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (j * (j2 / j3));
    }

    public static long A0G(long j, long j2, long j3) {
        long j4 = j + j2;
        if (((j ^ j4) & (j2 ^ j4)) < 0) {
            return j3;
        }
        return j4;
    }

    public static long A0H(long j, long j2, long j3) {
        long j4 = j - j2;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            return j3;
        }
        return j4;
    }

    public static long A0I(long minPositionUs, C11482AI c11482ai, long j, long j2) {
        if (C11482AI.A05.equals(c11482ai)) {
            return minPositionUs;
        }
        long A0H = A0H(minPositionUs, c11482ai.A01, Long.MIN_VALUE);
        long A0G = A0G(minPositionUs, c11482ai.A00, Long.MAX_VALUE);
        boolean secondSyncPositionValid = true;
        boolean z = A0H <= j && j <= A0G;
        secondSyncPositionValid = (A0H > j2 || j2 > A0G) ? false : false;
        if (z && secondSyncPositionValid) {
            long maxPositionUs = j - minPositionUs;
            long abs = Math.abs(maxPositionUs);
            long maxPositionUs2 = j2 - minPositionUs;
            if (abs <= Math.abs(maxPositionUs2)) {
                return j;
            }
            return j2;
        } else if (z) {
            return j;
        } else {
            if (secondSyncPositionValid) {
                return j2;
            }
            return A0H;
        }
    }

    public static String A0K(Context context, String str) {
        String A0J;
        try {
            A0J = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            A0J = A0J(133, 1, 9);
        }
        StringBuilder append = new StringBuilder().append(str);
        String versionName = A0J(132, 1, 49);
        StringBuilder append2 = append.append(versionName).append(A0J);
        String versionName2 = A0J(0, 16, 43);
        StringBuilder append3 = append2.append(versionName2);
        String versionName3 = Build.VERSION.RELEASE;
        StringBuilder append4 = append3.append(versionName3);
        String versionName4 = A0J(128, 2, 37);
        StringBuilder append5 = append4.append(versionName4);
        String versionName5 = A0J(134, 18, 54);
        return append5.append(versionName5).toString();
    }

    public static String A0L(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return A0M(str);
        }
    }

    public static String A0M(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String A0N(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static String A0O(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int percentCharacterCount = str.charAt(i2);
            if (percentCharacterCount == 37) {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int length2 = i * 2;
        int startOfNotEscaped = length - length2;
        StringBuilder sb2 = new StringBuilder(startOfNotEscaped);
        Matcher matcher = A07.matcher(str);
        int expectedLength = 0;
        while (i > 0 && matcher.find()) {
            int length3 = Integer.parseInt(matcher.group(1), 16);
            char c = (char) length3;
            int length4 = matcher.start();
            sb2.append((CharSequence) str, expectedLength, length4).append(c);
            expectedLength = matcher.end();
            i--;
        }
        if (expectedLength < length) {
            sb2.append((CharSequence) str, expectedLength, length);
        }
        int length5 = sb2.length();
        if (length5 != startOfNotEscaped) {
            return null;
        }
        return sb2.toString();
    }

    public static String A0P(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0Q(byte[] bArr) {
        return new String(bArr, Charset.forName(A0J(ErrorCode.CODE_NOT_TRACK_STATUS, 5, 106)));
    }

    public static String A0R(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName(A0J(ErrorCode.CODE_NOT_TRACK_STATUS, 5, 106)));
    }

    public static String A0S(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[5];
            int i2 = str.charAt(20);
            if (i2 != str2.charAt(20)) {
                throw new RuntimeException();
            }
            A01[7] = "sxBCFPymJxKmRkH4fHNNodKtIVXm4pzK";
            if (i < length) {
                sb2.append(objArr[i].getClass().getSimpleName());
                if (i < objArr.length - 1) {
                    sb2.append(A0J(130, 2, 13));
                }
                i++;
            } else {
                return sb2.toString();
            }
        }
    }

    public static ExecutorService A0T(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC11952IJ(str));
    }

    public static void A0V(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void A0W(InterfaceC11872Gz interfaceC11872Gz) {
        if (interfaceC11872Gz != null) {
            try {
                interfaceC11872Gz.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0X(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A0Y(Throwable th) {
        A0Z(th);
        throw null;
    }

    public static <T extends Throwable> void A0Z(Throwable th) throws Throwable {
        throw th;
    }

    public static void A0a(long[] jArr, long j, long j2) {
        double d;
        int i;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            int i2 = 0;
            while (true) {
                int length = jArr.length;
                String[] strArr = A01;
                if (strArr[6].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[4] = "Kaa8VHZO9LzXf3SQPwn8McNWlttqakzD";
                strArr2[5] = "zIx1Kp29sxoRWQT8356SM7Vgu8GAsquG";
                if (i2 < length) {
                    long divisionFactor = jArr[i2];
                    jArr[i2] = divisionFactor / j3;
                    i2++;
                } else {
                    return;
                }
            }
        } else if (j2 < j && j % j2 == 0) {
            long j4 = j / j2;
            for (int i3 = 0; i3 < jArr.length; i3++) {
                long multiplicationFactor = jArr[i3];
                jArr[i3] = multiplicationFactor * j4;
            }
        } else {
            double d2 = j;
            String[] strArr3 = A01;
            if (strArr3[1].charAt(10) != strArr3[2].charAt(10)) {
                d = d2 / j2;
                i = 0;
            } else {
                String[] strArr4 = A01;
                strArr4[1] = "HWsJryVEgJSZhaoZ2KYBbGnKIEi57XMH";
                strArr4[2] = "HAFtXabK7KS7qqZM6KOJORTBqTTCTr59";
                double multiplicationFactor2 = j2;
                d = d2 / multiplicationFactor2;
                i = 0;
            }
            while (i < jArr.length) {
                jArr[i] = (long) (jArr[i] * d);
                i++;
            }
        }
    }

    public static boolean A0b(int i) {
        return i == Integer.MIN_VALUE || i == 1073741824;
    }

    public static boolean A0c(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    public static boolean A0d(int i) {
        return i == 10 || i == 13;
    }

    public static boolean A0e(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String scheme2 = A0J(241, 4, 107);
            if (!scheme2.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0f(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A0g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static byte[] A0h(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            int i3 = Character.digit(str.charAt(i2), 16) << 4;
            bArr[i] = (byte) (i3 + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static byte[] A0i(String str) {
        return str.getBytes(Charset.forName(A0J(ErrorCode.CODE_NOT_TRACK_STATUS, 5, 106)));
    }

    public static int[] A0j(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            int length = list.get(i).intValue();
            iArr[i] = length;
        }
        return iArr;
    }

    public static <T> T[] A0k(T[] tArr, int i) {
        AbstractC11914Hf.A03(i <= tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        if (A01[3].charAt(29) != 'q') {
            String[] strArr = A01;
            strArr[6] = "uEnZoRg0eggbC";
            strArr[0] = "92UtUtmF7MKLi";
            return tArr2;
        }
        throw new RuntimeException();
    }

    public static String[] A0l(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A0m(String str, String str2) {
        return str.split(str2, 2);
    }
}
