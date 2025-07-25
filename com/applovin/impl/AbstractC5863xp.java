package com.applovin.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.C4310e9;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p552ot.pubsub.p553a.C26484a;
import com.smaato.sdk.core.SmaatoSdk;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.ConstantsUtil;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* renamed from: com.applovin.impl.xp */
/* loaded from: classes2.dex */
public abstract class AbstractC5863xp {

    /* renamed from: a */
    public static final int f12151a;

    /* renamed from: b */
    public static final String f12152b;

    /* renamed from: c */
    public static final String f12153c;

    /* renamed from: d */
    public static final String f12154d;

    /* renamed from: e */
    public static final String f12155e;

    /* renamed from: f */
    public static final byte[] f12156f;

    /* renamed from: g */
    private static final Pattern f12157g;

    /* renamed from: h */
    private static final Pattern f12158h;

    /* renamed from: i */
    private static final Pattern f12159i;

    /* renamed from: j */
    private static final Pattern f12160j;

    /* renamed from: k */
    private static HashMap f12161k;

    /* renamed from: l */
    private static final String[] f12162l;

    /* renamed from: m */
    private static final String[] f12163m;

    /* renamed from: n */
    private static final int[] f12164n;

    /* renamed from: o */
    private static final int[] f12165o;

    static {
        int i = Build.VERSION.SDK_INT;
        f12151a = i;
        String str = Build.DEVICE;
        f12152b = str;
        String str2 = Build.MANUFACTURER;
        f12153c = str2;
        String str3 = Build.MODEL;
        f12154d = str3;
        f12155e = str + ", " + str3 + ", " + str2 + ", " + i;
        f12156f = new byte[0];
        f12157g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f12158h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f12159i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f12160j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f12162l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", SmaatoSdk.KEY_GEO_LOCATION, "ka", "ice", "is", C26484a.f69185B, KeyConstants.Response.KEY_MK, "mao", ConstantsUtil.HOST, "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f12163m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f12164n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f12165o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, ErrorCode.CODE_INIT_UNKNOWN_ERROR, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, ErrorCode.CODE_NOT_TRACK_STATUS, 159, 138, ErrorCode.CODE_INIT_DEVICE_ERROR, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: a */
    public static int m93036a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: b */
    public static /* synthetic */ Thread m92985b(String str, Runnable runnable) {
        return m93014a(str, runnable);
    }

    /* renamed from: c */
    public static Point m92973c(Context context) {
        DisplayManager displayManager;
        Display display = (f12151a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) AbstractC4100b1.m100583a((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return m93033a(context, display);
    }

    /* renamed from: d */
    public static int m92969d(int i) {
        if (i != 8) {
            if (i != 16) {
                if (i != 24) {
                    return i != 32 ? 0 : 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    /* renamed from: e */
    public static int m92964e(int i) {
        if (i != 13) {
            switch (i) {
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
                default:
                    return 3;
            }
        }
        return 1;
    }

    /* renamed from: f */
    public static boolean m92961f(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: g */
    public static boolean m92959g(int i) {
        if (i != 3 && i != 2 && i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m92958h(int i) {
        if (i != 10 && i != 13) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static long m92957i(int i) {
        return i & 4294967295L;
    }

    /* renamed from: a */
    public static long m93035a(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    /* renamed from: b */
    public static int m92995b(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i != 10) {
            if (i != 7) {
                if (i != 8) {
                    switch (i) {
                        case 15:
                            return 6003;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }
                return 6003;
            }
            return 6005;
        }
        return 6004;
    }

    /* renamed from: d */
    public static long m92968d(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* renamed from: e */
    public static ExecutorService m92963e(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.applovin.impl.t80
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC5863xp.m92985b(str, runnable);
            }
        });
    }

    /* renamed from: f */
    public static String m92960f(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = m92984b(lowerCase, "-")[0];
        if (f12161k == null) {
            f12161k = m92978c();
        }
        String str3 = (String) f12161k.get(str2);
        if (str3 != null) {
            lowerCase = str3 + lowerCase.substring(str2.length());
            str2 = str3;
        }
        return (SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? m92966d(lowerCase) : lowerCase;
    }

    /* renamed from: a */
    public static Object m93017a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static long m92992b(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: d */
    public static boolean m92967d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: e */
    public static String[] m92965e() {
        String[] m92962f = m92962f();
        for (int i = 0; i < m92962f.length; i++) {
            m92962f[i] = m92960f(m92962f[i]);
        }
        return m92962f;
    }

    /* renamed from: a */
    public static Object[] m93000a(Object[] objArr) {
        return objArr;
    }

    /* renamed from: b */
    public static int m92983b(List list, Comparable comparable, boolean z, boolean z2) {
        int i;
        int i2;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                i = binarySearch - 1;
                if (i < 0 || ((Comparable) list.get(i)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i;
            }
            i2 = z ? binarySearch : i;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    /* renamed from: a */
    public static boolean m93016a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: d */
    private static String m92966d(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f12163m;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: a */
    public static int m93009a(List list, Comparable comparable, boolean z, boolean z2) {
        int i;
        int i2;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                i = binarySearch + 1;
                if (i >= size || ((Comparable) list.get(i)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i;
            }
            i2 = z ? binarySearch : i;
        }
        return z2 ? Math.min(list.size() - 1, i2) : i2;
    }

    /* renamed from: b */
    public static int m92980b(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                i = binarySearch - 1;
                if (i < 0 || jArr[i] != j) {
                    break;
                }
                binarySearch = i;
            }
            i2 = z ? binarySearch : i;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    /* renamed from: c */
    private static void m92972c(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: d */
    public static Looper m92970d() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: a */
    public static int m93001a(long[] jArr, long j, boolean z, boolean z2) {
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

    /* renamed from: b */
    public static long m92990b(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: c */
    public static String m92977c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    /* renamed from: b */
    public static int m92981b(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f12165o[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: c */
    public static byte[] m92971c(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    /* renamed from: b */
    public static Handler m92996b() {
        return m92988b((Handler.Callback) null);
    }

    /* renamed from: c */
    public static long m92974c(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i >= 0 || j2 % j3 != 0) {
            return (long) (j * (j2 / j3));
        }
        return j * (j2 / j3);
    }

    /* renamed from: a */
    public static int m93021a(C5178qc c5178qc, long j, boolean z, boolean z2) {
        int i;
        int m96394a = c5178qc.m96394a() - 1;
        int i2 = 0;
        while (i2 <= m96394a) {
            int i3 = (i2 + m96394a) >>> 1;
            if (c5178qc.m96393a(i3) < j) {
                i2 = i3 + 1;
            } else {
                m96394a = i3 - 1;
            }
        }
        if (z && (i = m96394a + 1) < c5178qc.m96394a() && c5178qc.m96393a(i) == j) {
            return i;
        }
        if (z2 && m96394a == -1) {
            return 0;
        }
        return m96394a;
    }

    /* renamed from: b */
    public static String m92989b(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    /* renamed from: f */
    private static String[] m92962f() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f12151a >= 24 ? m93031a(configuration) : new String[]{m93008a(configuration.locale)};
    }

    /* renamed from: a */
    public static int m93003a(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                i2 = binarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
            i3 = z ? binarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    /* renamed from: c */
    public static long m92976c(int i, int i2) {
        return m92957i(i2) | (m92957i(i) << 32);
    }

    /* renamed from: b */
    private static void m92987b(Display display, Point point) {
        display.getRealSize(point);
    }

    /* renamed from: c */
    public static long m92975c(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: a */
    public static int m93040a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: b */
    private static String m92982b(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: c */
    private static HashMap m92978c() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(iSOLanguages.length + f12162l.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f12162l;
            if (i >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: a */
    public static void m93022a(InterfaceC4509h5 interfaceC4509h5) {
        if (interfaceC4509h5 != null) {
            try {
                interfaceC4509h5.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m92994b(int i, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 268435456) {
                        if (i == 536870912) {
                            return i2 * 3;
                        }
                        if (i != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i2 * 4;
            }
            return i2;
        }
        return i2 * 2;
    }

    /* renamed from: a */
    public static void m93020a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static long m92991b(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    /* renamed from: a */
    public static float m93042a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: b */
    public static String[] m92984b(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: a */
    public static int m93039a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: b */
    public static Handler m92988b(Handler.Callback callback) {
        return m93027a(m92970d(), callback);
    }

    /* renamed from: a */
    public static int m93005a(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f12164n[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: b */
    public static String m92979b(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb2.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static Handler m93043a() {
        return m93029a((Handler.Callback) null);
    }

    /* renamed from: a */
    public static int m93034a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: a */
    public static int m93041a(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f12151a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static int m93010a(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* renamed from: b */
    public static C4310e9 m92993b(int i, int i2, int i3) {
        return new C4310e9.C4312b().m99606f("audio/raw").m99617c(i2).m99591n(i3).m99599j(i).m99632a();
    }

    /* renamed from: a */
    public static Point m93033a(Context context, Display display) {
        String m92986b;
        if (display.getDisplayId() == 0 && m92967d(context)) {
            if (f12151a < 28) {
                m92986b = m92986b("sys.display-size");
            } else {
                m92986b = m92986b("vendor.display-size");
            }
            if (!TextUtils.isEmpty(m92986b)) {
                try {
                    String[] m93013a = m93013a(m92986b.trim(), "x");
                    if (m93013a.length == 2) {
                        int parseInt = Integer.parseInt(m93013a[0]);
                        int parseInt2 = Integer.parseInt(m93013a[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC5063oc.m96805b("Util", "Invalid display size: " + m92986b);
            }
            if ("Sony".equals(f12153c) && f12154d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i = f12151a;
        if (i >= 23) {
            m92972c(display, point);
        } else if (i >= 17) {
            m92987b(display, point);
        } else {
            m93024a(display, point);
        }
        return point;
    }

    /* renamed from: b */
    private static String m92986b(String str) {
        try {
            Class<?> cls = Class.forName(KiwiConstants.f2713ar);
            return (String) cls.getMethod(KiwiConstants.f2714as, String.class).invoke(cls, str);
        } catch (Exception e) {
            AbstractC5063oc.m96808a("Util", "Failed to read system property " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    private static void m93024a(Display display, Point point) {
        display.getSize(point);
    }

    /* renamed from: a */
    public static int m93015a(String str) {
        String[] m93013a;
        int length;
        if (str != null && (length = (m93013a = m93013a(str, "_")).length) >= 2) {
            String str2 = m93013a[length - 1];
            boolean z = length >= 3 && "neg".equals(m93013a[length - 2]);
            try {
                int parseInt = Integer.parseInt((String) AbstractC4100b1.m100583a((Object) str2));
                return z ? -parseInt : parseInt;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static long m93037a(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    /* renamed from: a */
    public static long m93038a(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public static String m93011a(StringBuilder sb2, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb2.setLength(0);
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    /* renamed from: a */
    private static String[] m93031a(Configuration configuration) {
        return m93013a(configuration.getLocales().toLanguageTags(), ",");
    }

    /* renamed from: a */
    public static String m93032a(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + RemoteSettings.FORWARD_SLASH_STRING + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.1";
    }

    /* renamed from: a */
    public static boolean m93023a(C4066ah c4066ah, C4066ah c4066ah2, Inflater inflater) {
        if (c4066ah.m100797a() <= 0) {
            return false;
        }
        if (c4066ah2.m100789b() < c4066ah.m100797a()) {
            c4066ah2.m100795a(c4066ah.m100797a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c4066ah.m100787c(), c4066ah.m100785d(), c4066ah.m100797a());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(c4066ah2.m100787c(), i, c4066ah2.m100789b() - i);
                if (inflater.finished()) {
                    c4066ah2.m100782e(i);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                } else if (i == c4066ah2.m100789b()) {
                    c4066ah2.m100795a(c4066ah2.m100789b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m93030a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: a */
    public static int m93004a(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Object[] m92997a(Object[] objArr, Object[] objArr2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
        return copyOf;
    }

    /* renamed from: a */
    public static Object[] m92999a(Object[] objArr, int i) {
        AbstractC4100b1.m100580a(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: a */
    public static Object[] m92998a(Object[] objArr, int i, int i2) {
        AbstractC4100b1.m100580a(i >= 0);
        AbstractC4100b1.m100580a(i2 <= objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    /* renamed from: a */
    public static boolean m93028a(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m93026a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static void m93002a(long[] jArr, long j, long j2) {
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
        } else if (i < 0 && j % j2 == 0) {
            long j4 = j / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
        } else {
            double d = j / j2;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d);
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static String[] m93013a(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: a */
    public static byte[] m93019a(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: a */
    public static CharSequence m93018a(CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    /* renamed from: a */
    public static void m93025a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static Handler m93029a(Handler.Callback callback) {
        return m93027a((Looper) AbstractC4100b1.m100578b(Looper.myLooper()), callback);
    }

    /* renamed from: a */
    public static Handler m93027a(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m93014a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: a */
    public static String m93008a(Locale locale) {
        return f12151a >= 21 ? m92982b(locale) : locale.toString();
    }

    /* renamed from: a */
    public static String m93007a(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    /* renamed from: a */
    public static String m93006a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charsets.UTF_8);
    }

    /* renamed from: a */
    public static String m93012a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }
}
