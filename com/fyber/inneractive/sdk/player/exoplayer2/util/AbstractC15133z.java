package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Build;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.z */
/* loaded from: classes4.dex */
public abstract class AbstractC15133z {

    /* renamed from: a */
    public static final int f29832a;

    /* renamed from: b */
    public static final String f29833b;

    /* renamed from: c */
    public static final String f29834c;

    /* renamed from: d */
    public static final String f29835d;

    /* renamed from: e */
    public static final String f29836e;

    /* renamed from: f */
    public static final Pattern f29837f;

    /* renamed from: g */
    public static final Pattern f29838g;

    /* renamed from: h */
    public static final int[] f29839h;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i = 26;
        }
        f29832a = i;
        String str = Build.DEVICE;
        f29833b = str;
        String str2 = Build.MANUFACTURER;
        f29834c = str2;
        String str3 = Build.MODEL;
        f29835d = str3;
        f29836e = str + ", " + str3 + ", " + str2 + ", " + i;
        f29837f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f29838g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f29839h = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    /* renamed from: a */
    public static int m77163a(int i) {
        if (i != 8) {
            if (i != 16) {
                if (i != 24) {
                    return i != 32 ? 0 : 1073741824;
                }
                return Integer.MIN_VALUE;
            }
            return 2;
        }
        return 3;
    }

    /* renamed from: b */
    public static byte[] m77154b(String str) {
        return str.getBytes(Charset.defaultCharset());
    }

    /* renamed from: a */
    public static boolean m77159a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public static void m77161a(InterfaceC15089h interfaceC15089h) {
        if (interfaceC15089h != null) {
            try {
                interfaceC15089h.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m77160a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m77156a(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                int i2 = binarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                binarySearch = i2;
            }
            i = binarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: a */
    public static int m77155a(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            while (true) {
                i = binarySearch + 1;
                if (i >= jArr.length || jArr[i] != j) {
                    break;
                }
                binarySearch = i;
            }
            i2 = z ? binarySearch : i;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    /* renamed from: a */
    public static long m77162a(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i >= 0 || j2 % j3 != 0) {
            return (long) (j * (j2 / j3));
        }
        return (j2 / j3) * j;
    }

    /* renamed from: a */
    public static void m77157a(long[] jArr, long j) {
        int i = (j > 1000000L ? 1 : (j == 1000000L ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j2;
                i2++;
            }
        } else if (i < 0 && 1000000 % j == 0) {
            long j3 = 1000000 / j;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j3;
                i2++;
            }
        } else {
            double d = 1000000 / j;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d);
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m77158a(String str) {
        int length = str.length();
        if (length <= 4) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i = (i << 8) | str.charAt(i2);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }
}
