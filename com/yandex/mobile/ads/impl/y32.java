package com.yandex.mobile.ads.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p552ot.pubsub.p553a.C26484a;
import com.smaato.sdk.core.SmaatoSdk;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.ConstantsUtil;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* loaded from: classes8.dex */
public final class y32 {

    /* renamed from: a */
    public static final int f88010a;

    /* renamed from: b */
    public static final String f88011b;

    /* renamed from: c */
    public static final String f88012c;

    /* renamed from: d */
    public static final String f88013d;

    /* renamed from: e */
    public static final String f88014e;

    /* renamed from: f */
    public static final byte[] f88015f;

    /* renamed from: g */
    private static final Pattern f88016g;

    /* renamed from: h */
    private static final Pattern f88017h;
    @Nullable

    /* renamed from: i */
    private static HashMap<String, String> f88018i;

    /* renamed from: j */
    private static final String[] f88019j;

    /* renamed from: k */
    private static final String[] f88020k;

    /* renamed from: l */
    private static final int[] f88021l;

    /* renamed from: m */
    private static final int[] f88022m;

    static {
        int i = Build.VERSION.SDK_INT;
        f88010a = i;
        String str = Build.DEVICE;
        f88011b = str;
        String str2 = Build.MANUFACTURER;
        f88012c = str2;
        String str3 = Build.MODEL;
        f88013d = str3;
        f88014e = str + ", " + str3 + ", " + str2 + ", " + i;
        f88015f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f88016g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f88017h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f88019j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", SmaatoSdk.KEY_GEO_LOCATION, "ka", "ice", "is", C26484a.f69185B, KeyConstants.Response.KEY_MK, "mao", ConstantsUtil.HOST, "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f88020k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f88021l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f88022m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, ErrorCode.CODE_INIT_UNKNOWN_ERROR, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, ErrorCode.CODE_NOT_TRACK_STATUS, 159, 138, ErrorCode.CODE_INIT_DEVICE_ERROR, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: a */
    public static long m27089a(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: b */
    public static /* synthetic */ Thread m27057b(String str, Runnable runnable) {
        return m27074a(str, runnable);
    }

    /* renamed from: c */
    public static int m27054c(int i) {
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

    /* renamed from: d */
    public static String m27050d(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i >= 10000) {
                    return "custom (" + i + ")";
                }
                return "?";
        }
    }

    /* renamed from: e */
    public static boolean m27047e(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    @Nullable
    /* renamed from: f */
    public static String m27045f(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 * 2);
        StringBuilder sb2 = new StringBuilder(i4);
        Matcher matcher = f88016g.matcher(str);
        while (i2 > 0 && matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            sb2.append((CharSequence) str, i, matcher.start());
            sb2.append((char) Integer.parseInt(group, 16));
            i = matcher.end();
            i2--;
        }
        if (i < length) {
            sb2.append((CharSequence) str, i, length);
        }
        if (sb2.length() != i4) {
            return null;
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public static <T> T m27077a(@Nullable T t) {
        return t;
    }

    /* renamed from: b */
    public static int m27063b(int i) {
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

    /* renamed from: c */
    public static Point m27053c(Context context) {
        String m27058b;
        DisplayManager displayManager;
        int i = f88010a;
        Display display = (i < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m27049d(context)) {
            if (i < 28) {
                m27058b = m27058b("sys.display-size");
            } else {
                m27058b = m27058b("vendor.display-size");
            }
            if (!TextUtils.isEmpty(m27058b)) {
                try {
                    String[] split = m27058b.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                gq0.m33795b("Util", "Invalid display size: " + m27058b);
            }
            if ("Sony".equals(f88012c) && f88013d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i2 = f88010a;
        if (i2 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        } else if (i2 >= 17) {
            display.getRealSize(point);
            return point;
        } else {
            display.getSize(point);
            return point;
        }
    }

    /* renamed from: d */
    public static boolean m27049d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: e */
    public static String m27046e(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m32278b = C30784lf.m32278b(str);
        int i = 0;
        String str2 = m32278b.split("-", 2)[0];
        if (f88018i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f88019j.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f88019j;
                if (i2 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            }
            f88018i = hashMap;
        }
        String str4 = f88018i.get(str2);
        if (str4 != null) {
            m32278b = str4 + m32278b.substring(str2.length());
            str2 = str4;
        }
        if (!SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return m32278b;
        }
        while (true) {
            String[] strArr2 = f88020k;
            if (i >= strArr2.length) {
                return m32278b;
            }
            if (m32278b.startsWith(strArr2[i])) {
                return strArr2[i + 1] + m32278b.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: a */
    public static boolean m27076a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m27056b(long[] jArr, long j, boolean z) {
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
    public static int m27067a(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i = binarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            binarySearch = i;
        }
        return z ? binarySearch : i;
    }

    /* renamed from: d */
    public static ExecutorService m27048d(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.yandex.mobile.ads.impl.c13
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return y32.m27057b(str, runnable);
            }
        });
    }

    /* renamed from: d */
    public static String[] m27051d() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = f88010a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{m27072a(configuration.locale)};
        for (int i = 0; i < split.length; i++) {
            split[i] = m27046e(split[i]);
        }
        return split;
    }

    /* renamed from: a */
    public static int m27079a(iq0 iq0Var, long j) {
        int m33153a = iq0Var.m33153a() - 1;
        int i = 0;
        while (i <= m33153a) {
            int i2 = (i + m33153a) >>> 1;
            if (iq0Var.m33152a(i2) < j) {
                i = i2 + 1;
            } else {
                m33153a = i2 - 1;
            }
        }
        int i3 = m33153a + 1;
        if (i3 >= iq0Var.m33153a() || iq0Var.m33152a(i3) != j) {
            if (m33153a == -1) {
                return 0;
            }
            return m33153a;
        }
        return i3;
    }

    /* renamed from: b */
    public static Handler m27064b() {
        return m27059b((Handler.Callback) null);
    }

    /* renamed from: b */
    public static String m27060b(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C30784lf.m32277c(networkCountryIso);
            }
        }
        return C30784lf.m32277c(Locale.getDefault().getCountry());
    }

    /* renamed from: a */
    public static int m27073a(List list, Long l, boolean z) {
        int i;
        int binarySearch = Collections.binarySearch(list, l);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            while (true) {
                int i2 = binarySearch - 1;
                if (i2 < 0 || ((Comparable) list.get(i2)).compareTo(l) != 0) {
                    break;
                }
                binarySearch = i2;
            }
            i = binarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: a */
    public static int m27069a(int[] iArr, int i, boolean z, boolean z2) {
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

    /* renamed from: b */
    public static int m27062b(int i, int i2) {
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

    /* renamed from: b */
    public static long m27061b(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: b */
    public static Handler m27059b(@Nullable Handler.Callback callback) {
        return new Handler(m27055c(), callback);
    }

    /* renamed from: a */
    public static int m27093a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: a */
    public static void m27078a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Nullable
    /* renamed from: b */
    private static String m27058b(String str) {
        try {
            Class<?> cls = Class.forName(KiwiConstants.f2713ar);
            return (String) cls.getMethod(KiwiConstants.f2714as, String.class).invoke(cls, str);
        } catch (Exception e) {
            gq0.m33797a("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* renamed from: a */
    public static float m27095a(float f) {
        return Math.max(0.0f, Math.min(f, 0.95f));
    }

    /* renamed from: a */
    public static int m27091a(int i, byte[] bArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = f88021l[((i2 >>> 24) ^ (bArr[i3] & 255)) & 255] ^ (i2 << 8);
        }
        return i2;
    }

    /* renamed from: a */
    public static int m27092a(int i, int i2, byte[] bArr) {
        int i3 = 0;
        while (i < i2) {
            i3 = f88022m[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: a */
    public static Handler m27096a() {
        return m27084a((Handler.Callback) null);
    }

    @RequiresApi(21)
    /* renamed from: a */
    public static int m27087a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: a */
    public static int m27094a(int i) {
        if (i == 12) {
            return f88010a >= 32 ? 743676 : 0;
        }
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
                int i2 = f88010a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static int m27075a(@Nullable String str) {
        String[] split;
        int length;
        if (str != null && (length = (split = str.split("_", -1)).length) >= 2) {
            String str2 = split[length - 1];
            boolean z = length >= 3 && "neg".equals(split[length - 2]);
            try {
                str2.getClass();
                int parseInt = Integer.parseInt(str2);
                return z ? -parseInt : parseInt;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static byte[] m27052c(String str) {
        return str.getBytes(C30572in.f80564c);
    }

    /* renamed from: a */
    public static int m27085a(Uri uri, @Nullable String str) {
        int i;
        char c = 65535;
        if (str != null) {
            switch (str.hashCode()) {
                case -979127466:
                    if (str.equals("application/x-mpegURL")) {
                        c = 0;
                        break;
                    }
                    break;
                case -156749520:
                    if (str.equals("application/vnd.ms-sstr+xml")) {
                        c = 1;
                        break;
                    }
                    break;
                case 64194685:
                    if (str.equals("application/dash+xml")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1154777587:
                    if (str.equals("application/x-rtsp")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return 2;
                case 1:
                    return 1;
                case 2:
                    return 0;
                case 3:
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || !C30784lf.m32279a(scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String m32278b = C30784lf.m32278b(lastPathSegment.substring(lastIndexOf + 1));
                m32278b.getClass();
                switch (m32278b.hashCode()) {
                    case 104579:
                        if (m32278b.equals("ism")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 108321:
                        if (m32278b.equals("mpd")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3242057:
                        if (m32278b.equals("isml")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3299913:
                        if (m32278b.equals("m3u8")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 2:
                        i = 1;
                        break;
                    case 1:
                        i = 0;
                        break;
                    case 3:
                        i = 2;
                        break;
                    default:
                        i = 4;
                        break;
                }
                if (i != 4) {
                    return i;
                }
            }
            Pattern pattern = f88017h;
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = pattern.matcher(path);
            if (matcher.matches()) {
                String group = matcher.group(2);
                if (group != null) {
                    if (group.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (group.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                }
                return 1;
            }
            return 4;
        }
        return 3;
    }

    /* renamed from: c */
    public static Looper m27055c() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: a */
    public static boolean m27080a(cc1 cc1Var, cc1 cc1Var2, @Nullable Inflater inflater) {
        if (cc1Var.m35299a() <= 0) {
            return false;
        }
        if (cc1Var2.m35293b() < cc1Var.m35299a()) {
            cc1Var2.m35298a(cc1Var.m35299a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(cc1Var.m35291c(), cc1Var.m35289d(), cc1Var.m35299a());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(cc1Var2.m35291c(), i, cc1Var2.m35293b() - i);
                if (inflater.finished()) {
                    cc1Var2.m35288d(i);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                } else if (i == cc1Var2.m35293b()) {
                    cc1Var2.m35298a(cc1Var2.m35293b() * 2);
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
    public static <T> T[] m27065a(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    /* renamed from: a */
    public static Object[] m27090a(int i, Object[] objArr) {
        if (i <= objArr.length) {
            return Arrays.copyOf(objArr, i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static Object[] m27066a(Object[] objArr, int i) {
        if (i <= objArr.length) {
            return Arrays.copyOfRange(objArr, 1, i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static void m27083a(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: a */
    public static boolean m27081a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static long m27088a(long j, long j2, long j3) {
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
    public static void m27068a(long[] jArr, long j) {
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
    public static boolean m27086a(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    /* renamed from: a */
    public static Handler m27084a(@Nullable Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return new Handler(myLooper, callback);
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static Handler m27082a(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: a */
    public static /* synthetic */ Thread m27074a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: a */
    public static String m27072a(Locale locale) {
        if (f88010a >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    /* renamed from: a */
    public static String m27071a(byte[] bArr) {
        return new String(bArr, C30572in.f80564c);
    }

    /* renamed from: a */
    public static String m27070a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, C30572in.f80564c);
    }
}
