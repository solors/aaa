package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.Service;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C2100C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21059u3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p552ot.pubsub.p553a.C26484a;
import com.smaato.sdk.core.SmaatoSdk;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.ConstantsUtil;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* loaded from: classes2.dex */
public final class Util {
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;
    @UnstableApi
    public static final String DEVICE;
    @UnstableApi
    public static final String DEVICE_DEBUG_INFO;
    @UnstableApi
    public static final byte[] EMPTY_BYTE_ARRAY;
    @UnstableApi
    public static final long[] EMPTY_LONG_ARRAY;
    private static final Pattern ESCAPED_CHARACTER_PATTERN;
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final Pattern ISM_PATH_PATTERN;
    @UnstableApi
    public static final String MANUFACTURER;
    @UnstableApi
    public static final String MODEL;
    @UnstableApi
    public static final int SDK_INT;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN;
    private static final Pattern XS_DURATION_PATTERN;
    private static final String[] additionalIsoLanguageReplacements;
    private static final String[] isoLegacyTagReplacements;
    @Nullable
    private static HashMap<String, String> languageTagReplacementMap;

    @RequiresApi(21)
    /* loaded from: classes2.dex */
    private static final class Api21 {
        private Api21() {
        }

        @DoNotInline
        public static Drawable getDrawable(Context context, Resources resources, @DrawableRes int i) {
            return resources.getDrawable(i, context.getTheme());
        }
    }

    @RequiresApi(29)
    /* loaded from: classes2.dex */
    public static class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static void startForeground(Service service, int i, Notification notification, int i2, String str) {
            try {
                service.startForeground(i, notification, i2);
            } catch (RuntimeException e) {
                Log.m104568e(Util.TAG, "The service must be declared with a foregroundServiceType that includes " + str);
                throw e;
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        SDK_INT = i;
        String str = Build.DEVICE;
        DEVICE = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        String str3 = Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + ", " + str3 + ", " + str2 + ", " + i;
        EMPTY_BYTE_ARRAY = new byte[0];
        EMPTY_LONG_ARRAY = new long[0];
        XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_PATH_PATTERN = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        additionalIsoLanguageReplacements = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", SmaatoSdk.KEY_GEO_LOCATION, "ka", "ice", "is", C26484a.f69185B, KeyConstants.Response.KEY_MK, "mao", ConstantsUtil.HOST, "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, ErrorCode.CODE_INIT_UNKNOWN_ERROR, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, ErrorCode.CODE_NOT_TRACK_STATUS, 159, 138, ErrorCode.CODE_INIT_DEVICE_ERROR, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    private Util() {
    }

    @UnstableApi
    public static long addWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j + j2;
        if (((j ^ j4) & (j2 ^ j4)) < 0) {
            return j3;
        }
        return j4;
    }

    @UnstableApi
    public static boolean areEqual(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    @UnstableApi
    public static int binarySearchCeil(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= iArr.length) {
                    break;
                }
            } while (iArr[binarySearch] == i);
            i2 = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(iArr.length - 1, i2) : i2;
    }

    @UnstableApi
    public static int binarySearchFloor(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    @UnstableApi
    public static int ceilDivide(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItemArr) {
        if (SDK_INT < 24) {
            return true;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (isTrafficRestricted(localConfiguration.uri)) {
                    return false;
                }
                for (int i = 0; i < mediaItem.localConfiguration.subtitleConfigurations.size(); i++) {
                    if (isTrafficRestricted(mediaItem.localConfiguration.subtitleConfigurations.get(i).uri)) {
                        return false;
                    }
                }
                continue;
            }
        }
        return true;
    }

    @UnstableApi
    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @UnstableApi
    public static int compareLong(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    @UnstableApi
    public static int constrainValue(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    @UnstableApi
    public static boolean contains(Object[] objArr, @Nullable Object obj) {
        for (Object obj2 : objArr) {
            if (areEqual(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @UnstableApi
    public static int crc32(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = CRC32_BYTES_MSBF[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    @UnstableApi
    public static int crc8(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = CRC8_BYTES_MSBF[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    @UnstableApi
    public static Handler createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + additionalIsoLanguageReplacements.length);
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
            String[] strArr = additionalIsoLanguageReplacements;
            if (i < strArr.length) {
                hashMap.put(strArr[i], strArr[i + 1]);
                i += 2;
            } else {
                return hashMap;
            }
        }
    }

    @UnstableApi
    public static ByteBuffer createReadOnlyByteBuffer(ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
    }

    @UnstableApi
    public static File createTempDirectory(Context context, String str) throws IOException {
        File createTempFile = createTempFile(context, str);
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    @UnstableApi
    public static File createTempFile(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) Assertions.checkNotNull(context.getCacheDir()));
    }

    @UnstableApi
    public static long durationUsToSampleCount(long j, int i) {
        return scaleLargeValue(j, i, 1000000L, RoundingMode.CEILING);
    }

    @UnstableApi
    public static String escapeFileName(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (shouldEscapeCharacter(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((i2 * 2) + length);
        while (i2 > 0) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (shouldEscapeCharacter(charAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(charAt));
                i2--;
            } else {
                sb2.append(charAt);
            }
            i = i4;
        }
        if (i < length) {
            sb2.append((CharSequence) str, i, length);
        }
        return sb2.toString();
    }

    @UnstableApi
    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = ISM_PATH_PATTERN.matcher(path);
        if (matcher.matches() && matcher.group(1) == null) {
            return Uri.withAppendedPath(uri, "Manifest");
        }
        return uri;
    }

    @UnstableApi
    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @UnstableApi
    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    @RequiresApi(21)
    @UnstableApi
    public static int generateAudioSessionIdV21(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    @Nullable
    public static String getAdaptiveMimeTypeForContentType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return "application/x-mpegURL";
            }
            return "application/vnd.ms-sstr+xml";
        }
        return "application/dash+xml";
    }

    @UnstableApi
    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i) {
        if (i == 20) {
            return 30;
        }
        if (i != 30) {
            if (i != 805306368) {
                switch (i) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case 6:
                        return 21;
                    case 7:
                    case 8:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return 28;
                    default:
                        switch (i) {
                            case 14:
                                return 25;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                                return 28;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
            }
            return 31;
        }
        return 34;
    }

    @UnstableApi
    @Deprecated
    public static int getAudioContentTypeForStreamType(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1 || i == 2 || i == 4 || i == 5 || i == 8) {
            return 4;
        }
        return 2;
    }

    @RequiresApi(21)
    @UnstableApi
    public static AudioFormat getAudioFormat(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @SuppressLint({"InlinedApi"})
    @UnstableApi
    public static int getAudioTrackChannelConfig(int i) {
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
                break;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (SDK_INT >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
        return 6396;
    }

    @UnstableApi
    public static int getAudioUsageForStreamType(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            if (i != 2) {
                int i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5) {
                        if (i != 8) {
                            return 1;
                        }
                        return 3;
                    }
                }
                return i2;
            }
            return 6;
        }
        return 13;
    }

    @UnstableApi
    public static Player.Commands getAvailableCommands(Player player, Player.Commands commands) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean isPlayingAd = player.isPlayingAd();
        boolean isCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean hasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean hasNextMediaItem = player.hasNextMediaItem();
        boolean isCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean isCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean isEmpty = player.getCurrentTimeline().isEmpty();
        Player.Commands.Builder addIf = new Player.Commands.Builder().addAll(commands).addIf(4, !isPlayingAd);
        boolean z7 = false;
        if (isCurrentMediaItemSeekable && !isPlayingAd) {
            z = true;
        } else {
            z = false;
        }
        Player.Commands.Builder addIf2 = addIf.addIf(5, z);
        if (hasPreviousMediaItem && !isPlayingAd) {
            z2 = true;
        } else {
            z2 = false;
        }
        Player.Commands.Builder addIf3 = addIf2.addIf(6, z2);
        if (!isEmpty && ((hasPreviousMediaItem || !isCurrentMediaItemLive || isCurrentMediaItemSeekable) && !isPlayingAd)) {
            z3 = true;
        } else {
            z3 = false;
        }
        Player.Commands.Builder addIf4 = addIf3.addIf(7, z3);
        if (hasNextMediaItem && !isPlayingAd) {
            z4 = true;
        } else {
            z4 = false;
        }
        Player.Commands.Builder addIf5 = addIf4.addIf(8, z4);
        if (!isEmpty && ((hasNextMediaItem || (isCurrentMediaItemLive && isCurrentMediaItemDynamic)) && !isPlayingAd)) {
            z5 = true;
        } else {
            z5 = false;
        }
        Player.Commands.Builder addIf6 = addIf5.addIf(9, z5).addIf(10, !isPlayingAd);
        if (isCurrentMediaItemSeekable && !isPlayingAd) {
            z6 = true;
        } else {
            z6 = false;
        }
        Player.Commands.Builder addIf7 = addIf6.addIf(11, z6);
        if (isCurrentMediaItemSeekable && !isPlayingAd) {
            z7 = true;
        }
        return addIf7.addIf(12, z7).build();
    }

    @UnstableApi
    public static int getBigEndianInt(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
            return Integer.reverseBytes(i2);
        }
        return i2;
    }

    @UnstableApi
    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    @UnstableApi
    public static int getCodecCountOfType(@Nullable String str, int i) {
        int i2 = 0;
        for (String str2 : splitCodecs(str)) {
            if (i == MimeTypes.getTrackTypeOfCodec(str2)) {
                i2++;
            }
        }
        return i2;
    }

    @Nullable
    @UnstableApi
    public static String getCodecsOfType(@Nullable String str, int i) {
        String[] splitCodecs = splitCodecs(str);
        if (splitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : splitCodecs) {
            if (i == MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() <= 0) {
            return null;
        }
        return sb2.toString();
    }

    @UnstableApi
    public static String getCommaDelimitedSimpleClassNames(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb2.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    @UnstableApi
    public static String getCountryCode(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    @UnstableApi
    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager;
        Display display = (SDK_INT < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) Assertions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    @UnstableApi
    public static Looper getCurrentOrMainLooper() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            return Looper.getMainLooper();
        }
        return myLooper;
    }

    @UnstableApi
    public static Uri getDataUriForString(String str, String str2) {
        return Uri.parse("data:" + str + ";base64," + Base64.encodeToString(str2.getBytes(), 2));
    }

    @UnstableApi
    public static Locale getDefaultDisplayLocale() {
        if (SDK_INT >= 24) {
            return Locale.getDefault(Locale.Category.DISPLAY);
        }
        return Locale.getDefault();
    }

    private static void getDisplaySizeV16(Display display, Point point) {
        display.getSize(point);
    }

    @RequiresApi(17)
    private static void getDisplaySizeV17(Display display, Point point) {
        display.getRealSize(point);
    }

    @RequiresApi(23)
    private static void getDisplaySizeV23(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    @UnstableApi
    public static Drawable getDrawable(Context context, Resources resources, @DrawableRes int i) {
        if (SDK_INT >= 21) {
            return Api21.getDrawable(context, resources, i);
        }
        return resources.getDrawable(i);
    }

    @Nullable
    public static UUID getDrmUuid(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1860423953:
                if (lowerCase.equals("playready")) {
                    c = 0;
                    break;
                }
                break;
            case -1400551171:
                if (lowerCase.equals("widevine")) {
                    c = 1;
                    break;
                }
                break;
            case 790309106:
                if (lowerCase.equals("clearkey")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C2100C.PLAYREADY_UUID;
            case 1:
                return C2100C.WIDEVINE_UUID;
            case 2:
                return C2100C.CLEARKEY_UUID;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    @UnstableApi
    public static int getErrorCodeForMediaDrmErrorCode(int i) {
        if (i != 2 && i != 4) {
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
        return 6005;
    }

    @UnstableApi
    public static int getErrorCodeFromPlatformDiagnosticsInfo(@Nullable String str) {
        String[] split;
        int length;
        boolean z;
        if (str == null || (length = (split = split(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z = true;
        } else {
            z = false;
        }
        try {
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(str2));
            if (z) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @UnstableApi
    public static String getFormatSupportString(int i) {
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

    @UnstableApi
    public static int getIntegerCodeForString(String str) {
        boolean z;
        int length = str.length();
        if (length <= 4) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) | str.charAt(i2);
        }
        return i;
    }

    @UnstableApi
    public static String getLocaleLanguageTag(Locale locale) {
        if (SDK_INT >= 21) {
            return getLocaleLanguageTagV21(locale);
        }
        return locale.toString();
    }

    @RequiresApi(21)
    private static String getLocaleLanguageTagV21(Locale locale) {
        return locale.toLanguageTag();
    }

    @UnstableApi
    public static int getMaxPendingFramesCountForMediaCodecDecoders(Context context) {
        if (isFrameDropAllowedOnSurfaceInput(context)) {
            return 1;
        }
        return 5;
    }

    @UnstableApi
    public static long getMediaDurationForPlayoutDuration(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(j * f);
    }

    @UnstableApi
    public static long getNowUnixTimeMs(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + android.os.SystemClock.elapsedRealtime();
    }

    @UnstableApi
    public static int getPcmEncoding(int i) {
        if (i != 8) {
            if (i != 16) {
                if (i != 24) {
                    if (i != 32) {
                        return 0;
                    }
                    return 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    @UnstableApi
    public static Format getPcmFormat(int i, int i2, int i3) {
        return new Format.Builder().setSampleMimeType("audio/raw").setChannelCount(i2).setSampleRate(i3).setPcmEncoding(i).build();
    }

    @UnstableApi
    public static int getPcmFrameSize(int i, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 268435456) {
                        if (i != 536870912) {
                            if (i != 805306368) {
                                if (i != 1342177280) {
                                    if (i != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                        return i2 * 3;
                    }
                }
                return i2 * 4;
            }
            return i2;
        }
        return i2 * 2;
    }

    @UnstableApi
    public static long getPlayoutDurationForMediaDuration(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        return Math.round(j / f);
    }

    @UnstableApi
    public static int getStreamTypeForAudioUsage(int i) {
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

    @UnstableApi
    public static String getStringForTime(StringBuilder sb2, Formatter formatter, long j) {
        String str;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        if (j < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb2.setLength(0);
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    @UnstableApi
    public static String[] getSystemLanguageCodes() {
        String[] systemLocales = getSystemLocales();
        for (int i = 0; i < systemLocales.length; i++) {
            systemLocales[i] = normalizeLanguageCode(systemLocales[i]);
        }
        return systemLocales;
    }

    private static String[] getSystemLocales() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return SDK_INT >= 24 ? getSystemLocalesV24(configuration) : new String[]{getLocaleLanguageTag(configuration.locale)};
    }

    @RequiresApi(24)
    private static String[] getSystemLocalesV24(Configuration configuration) {
        return split(configuration.getLocales().toLanguageTags(), ",");
    }

    @Nullable
    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName(KiwiConstants.f2713ar);
            return (String) cls.getMethod(KiwiConstants.f2714as, String.class).invoke(cls, str);
        } catch (Exception e) {
            Log.m104567e(TAG, "Failed to read system property " + str, e);
            return null;
        }
    }

    @UnstableApi
    public static String getTrackTypeString(int i) {
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

    @UnstableApi
    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + RemoteSettings.FORWARD_SLASH_STRING + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + MediaLibraryInfo.VERSION_SLASHY;
    }

    @UnstableApi
    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    @UnstableApi
    public static byte[] gzip(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean handlePauseButtonAction(@Nullable Player player) {
        if (player != null && player.isCommandAvailable(1)) {
            player.pause();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean handlePlayButtonAction(@androidx.annotation.Nullable androidx.media3.common.Player r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.getPlaybackState()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.isCommandAvailable(r3)
            if (r3 == 0) goto L17
            r4.prepare()
        L15:
            r0 = r2
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.isCommandAvailable(r3)
            if (r1 == 0) goto L24
            r4.seekToDefaultPosition()
            goto L15
        L24:
            boolean r1 = r4.isCommandAvailable(r2)
            if (r1 == 0) goto L2e
            r4.play()
            goto L2f
        L2e:
            r2 = r0
        L2f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.handlePlayButtonAction(androidx.media3.common.Player):boolean");
    }

    public static boolean handlePlayPauseButtonAction(@Nullable Player player) {
        return handlePlayPauseButtonAction(player, true);
    }

    @UnstableApi
    @Deprecated
    public static int inferContentType(Uri uri, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return inferContentType(uri);
        }
        return inferContentTypeForExtension(str);
    }

    public static int inferContentTypeForExtension(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case 104579:
                if (lowerCase.equals("ism")) {
                    c = 0;
                    break;
                }
                break;
            case 108321:
                if (lowerCase.equals("mpd")) {
                    c = 1;
                    break;
                }
                break;
            case 3242057:
                if (lowerCase.equals("isml")) {
                    c = 2;
                    break;
                }
                break;
            case 3299913:
                if (lowerCase.equals("m3u8")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, @Nullable String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        char c = 65535;
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

    @UnstableApi
    public static boolean inflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, @Nullable Inflater inflater) {
        if (parsableByteArray.bytesLeft() <= 0) {
            return false;
        }
        if (parsableByteArray2.capacity() < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(parsableByteArray2.getData(), i, parsableByteArray2.capacity() - i);
                if (inflater.finished()) {
                    parsableByteArray2.setLimit(i);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                } else if (i == parsableByteArray2.capacity()) {
                    parsableByteArray2.ensureCapacity(parsableByteArray2.capacity() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    @UnstableApi
    public static String intToStringMaxRadix(int i) {
        return Integer.toString(i, 36);
    }

    private static boolean isAppSpecificStorageFileUri(Activity activity, Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                return false;
            }
            String canonicalPath = new File(path).getCanonicalPath();
            String canonicalPath2 = activity.getFilesDir().getCanonicalPath();
            String str = null;
            File externalFilesDir = activity.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                str = externalFilesDir.getCanonicalPath();
            }
            if (!canonicalPath.startsWith(canonicalPath2)) {
                if (str == null) {
                    return false;
                }
                if (!canonicalPath.startsWith(str)) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @UnstableApi
    public static boolean isAutomotive(Context context) {
        if (SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public static boolean isEncodingHighResolutionPcm(int i) {
        if (i != 536870912 && i != 1342177280 && i != 805306368 && i != 1610612736 && i != 4) {
            return false;
        }
        return true;
    }

    @UnstableApi
    public static boolean isEncodingLinearPcm(int i) {
        if (i != 3 && i != 2 && i != 268435456 && i != 536870912 && i != 1342177280 && i != 805306368 && i != 1610612736 && i != 4) {
            return false;
        }
        return true;
    }

    @UnstableApi
    public static boolean isFrameDropAllowedOnSurfaceInput(Context context) {
        int i = SDK_INT;
        if (i >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i == 30) {
                String str = MODEL;
                if (Ascii.equalsIgnoreCase(str, "moto g(20)") || Ascii.equalsIgnoreCase(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    @UnstableApi
    public static boolean isLinebreak(int i) {
        if (i != 10 && i != 13) {
            return false;
        }
        return true;
    }

    @UnstableApi
    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            return false;
        }
        return true;
    }

    private static boolean isMediaStoreExternalContentUri(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.isEmpty()) {
            return false;
        }
        String str = pathSegments.get(0);
        if (!C21059u3.f53751e.equals(str) && !"external_primary".equals(str)) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 23)
    private static boolean isReadStoragePermissionRequestNeeded(Activity activity, Uri uri) {
        if (SDK_INT < 23) {
            return false;
        }
        if (isLocalFileUri(uri)) {
            return !isAppSpecificStorageFileUri(activity, uri);
        }
        if (!isMediaStoreExternalContentUri(uri)) {
            return false;
        }
        return true;
    }

    @UnstableApi
    public static boolean isRunningOnEmulator() {
        String lowerCase = Ascii.toLowerCase(DEVICE);
        if (!lowerCase.contains("emulator") && !lowerCase.contains("emu64a") && !lowerCase.contains("generic")) {
            return false;
        }
        return true;
    }

    @RequiresApi(api = 24)
    private static boolean isTrafficRestricted(Uri uri) {
        if ("http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) Assertions.checkNotNull(uri.getHost()))) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public static boolean isWear(Context context) {
        if (SDK_INT >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Thread lambda$newSingleThreadExecutor$3(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static /* synthetic */ Thread lambda$newSingleThreadScheduledExecutor$4(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static /* synthetic */ void lambda$postOrRunWithCompletion$0(SettableFuture settableFuture, Runnable runnable, Object obj) {
        try {
            if (settableFuture.isCancelled()) {
                return;
            }
            runnable.run();
            settableFuture.set(obj);
        } catch (Throwable th) {
            settableFuture.setException(th);
        }
    }

    public static /* synthetic */ void lambda$transformFutureAsync$1(SettableFuture settableFuture, ListenableFuture listenableFuture) {
        if (settableFuture.isCancelled()) {
            listenableFuture.cancel(false);
        }
    }

    public static /* synthetic */ void lambda$transformFutureAsync$2(ListenableFuture listenableFuture, SettableFuture settableFuture, AsyncFunction asyncFunction) {
        try {
            try {
                settableFuture.setFuture(asyncFunction.apply(Futures.getDone(listenableFuture)));
            } catch (Throwable th) {
                settableFuture.setException(th);
            }
        } catch (Error e) {
            e = e;
            settableFuture.setException(e);
        } catch (CancellationException unused) {
            settableFuture.cancel(false);
        } catch (RuntimeException e2) {
            e = e2;
            settableFuture.setException(e);
        } catch (ExecutionException e3) {
            e = e3;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            settableFuture.setException(e);
        }
    }

    @UnstableApi
    public static int linearSearch(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @UnstableApi
    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            return fromUtf8Bytes(toByteArray(inputStream));
        } finally {
            closeQuietly(inputStream);
        }
    }

    @RequiresApi(18)
    @UnstableApi
    public static long maxValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            long j = Long.MIN_VALUE;
            for (int i = 0; i < sparseLongArray.size(); i++) {
                j = Math.max(j, sparseLongArray.valueAt(i));
            }
            return j;
        }
        throw new NoSuchElementException();
    }

    private static String maybeReplaceLegacyLanguageTags(String str) {
        int i = 0;
        while (true) {
            String[] strArr = isoLegacyTagReplacements;
            if (i < strArr.length) {
                if (str.startsWith(strArr[i])) {
                    return strArr[i + 1] + str.substring(strArr[i].length());
                }
                i += 2;
            } else {
                return str;
            }
        }
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (maybeRequestReadStoragePermission(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static boolean maybeRequestReadStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (maybeRequestReadStoragePermission(activity, localConfiguration.uri)) {
                    return true;
                }
                ImmutableList<MediaItem.SubtitleConfiguration> immutableList = mediaItem.localConfiguration.subtitleConfigurations;
                for (int i = 0; i < immutableList.size(); i++) {
                    if (maybeRequestReadStoragePermission(activity, immutableList.get(i).uri)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    @RequiresApi(18)
    @UnstableApi
    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() != 0) {
            long j = Long.MAX_VALUE;
            for (int i = 0; i < sparseLongArray.size(); i++) {
                j = Math.min(j, sparseLongArray.valueAt(i));
            }
            return j;
        }
        throw new NoSuchElementException();
    }

    @UnstableApi
    public static <T> void moveItems(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    @UnstableApi
    public static long msToUs(long j) {
        if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            return j * 1000;
        }
        return j;
    }

    @UnstableApi
    public static ExecutorService newSingleThreadExecutor(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.l
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$newSingleThreadExecutor$3;
                lambda$newSingleThreadExecutor$3 = Util.lambda$newSingleThreadExecutor$3(str, runnable);
                return lambda$newSingleThreadExecutor$3;
            }
        });
    }

    @UnstableApi
    public static ScheduledExecutorService newSingleThreadScheduledExecutor(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: androidx.media3.common.util.m
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$newSingleThreadScheduledExecutor$4;
                lambda$newSingleThreadScheduledExecutor$4 = Util.lambda$newSingleThreadScheduledExecutor$4(str, runnable);
                return lambda$newSingleThreadScheduledExecutor$4;
            }
        });
    }

    @UnstableApi
    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = splitAtFirst(lowerCase, "-")[0];
        if (languageTagReplacementMap == null) {
            languageTagReplacementMap = createIsoLanguageReplacementMap();
        }
        String str3 = languageTagReplacementMap.get(str2);
        if (str3 != null) {
            lowerCase = str3 + lowerCase.substring(str2.length());
            str2 = str3;
        }
        if (SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            return maybeReplaceLegacyLanguageTags(lowerCase);
        }
        return lowerCase;
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t;
        return (T[]) castNonNullTypeArray(copyOf);
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i) {
        boolean z;
        if (i <= tArr.length) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    @UnstableApi
    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (i2 > tArr.length) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        return (T[]) Arrays.copyOfRange(tArr, i, i2);
    }

    @UnstableApi
    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
        boolean z;
        if (list.size() == tArr.length) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        list.toArray(tArr);
    }

    @UnstableApi
    public static long parseXsDateTime(String str) throws ParserException {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i != 0) {
                return timeInMillis - (i * 60000);
            }
            return timeInMillis;
        }
        throw ParserException.createForMalformedContainer("Invalid date/time format: " + str, null);
    }

    @UnstableApi
    public static long parseXsDuration(String str) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d6 = 0.0d;
            if (group != null) {
                d = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d2 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d2 = 0.0d;
            }
            double d7 = d + d2;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d3 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d3 = 0.0d;
            }
            double d8 = d7 + d3;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d4 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d4 = 0.0d;
            }
            double d9 = d8 + d4;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d5 = Double.parseDouble(group5) * 60.0d;
            } else {
                d5 = 0.0d;
            }
            double d10 = d9 + d5;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d6 = Double.parseDouble(group6);
            }
            long j = (long) ((d10 + d6) * 1000.0d);
            if (isEmpty) {
                return -j;
            }
            return j;
        }
        return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    @UnstableApi
    public static boolean postOrRun(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    @UnstableApi
    public static <T> ListenableFuture<T> postOrRunWithCompletion(Handler handler, final Runnable runnable, final T t) {
        final SettableFuture create = SettableFuture.create();
        postOrRun(handler, new Runnable() { // from class: androidx.media3.common.util.i
            @Override // java.lang.Runnable
            public final void run() {
                Util.lambda$postOrRunWithCompletion$0(create, runnable, t);
            }
        });
        return create;
    }

    @UnstableApi
    public static boolean readBoolean(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public static void recursiveDelete(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    @Nullable
    @UnstableApi
    public static Intent registerReceiverNotExported(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        if (SDK_INT >= 33) {
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, 4);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }

    @UnstableApi
    public static <T> void removeRange(List<T> list, int i, int i2) {
        if (i >= 0 && i2 <= list.size() && i <= i2) {
            if (i != i2) {
                list.subList(i, i2).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @RequiresApi(api = 23)
    private static boolean requestExternalStoragePermission(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    @RequiresApi(api = 33)
    private static boolean requestReadMediaPermissions(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
        return true;
    }

    @UnstableApi
    public static long sampleCountToDurationUs(long j, int i) {
        return scaleLargeValue(j, 1000000L, i, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static long scaleLargeTimestamp(long j, long j2, long j3) {
        return scaleLargeValue(j, j2, j3, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static long[] scaleLargeTimestamps(List<Long> list, long j, long j2) {
        return scaleLargeValues(list, j, j2, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static void scaleLargeTimestampsInPlace(long[] jArr, long j, long j2) {
        scaleLargeValuesInPlace(jArr, j, j2, RoundingMode.FLOOR);
    }

    @UnstableApi
    public static long scaleLargeValue(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return LongMath.divide(j, LongMath.divide(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i < 0 && j2 % j3 == 0) {
            return LongMath.saturatedMultiply(j, LongMath.divide(j2, j3, RoundingMode.UNNECESSARY));
        }
        int i2 = (j3 > j ? 1 : (j3 == j ? 0 : -1));
        if (i2 >= 0 && j3 % j == 0) {
            return LongMath.divide(j2, LongMath.divide(j3, j, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i2 < 0 && j % j3 == 0) {
            return LongMath.saturatedMultiply(j2, LongMath.divide(j, j3, RoundingMode.UNNECESSARY));
        }
        return scaleLargeValueFallback(j, j2, j3, roundingMode);
    }

    private static long scaleLargeValueFallback(long j, long j2, long j3, RoundingMode roundingMode) {
        long saturatedMultiply = LongMath.saturatedMultiply(j, j2);
        if (saturatedMultiply != Long.MAX_VALUE && saturatedMultiply != Long.MIN_VALUE) {
            return LongMath.divide(saturatedMultiply, j3, roundingMode);
        }
        long gcd = LongMath.gcd(Math.abs(j2), Math.abs(j3));
        long divide = LongMath.divide(j2, gcd, RoundingMode.UNNECESSARY);
        long divide2 = LongMath.divide(j3, gcd, RoundingMode.UNNECESSARY);
        long gcd2 = LongMath.gcd(Math.abs(j), Math.abs(divide2));
        long divide3 = LongMath.divide(j, gcd2, RoundingMode.UNNECESSARY);
        long divide4 = LongMath.divide(divide2, gcd2, RoundingMode.UNNECESSARY);
        long saturatedMultiply2 = LongMath.saturatedMultiply(divide3, divide);
        if (saturatedMultiply2 != Long.MAX_VALUE && saturatedMultiply2 != Long.MIN_VALUE) {
            return LongMath.divide(saturatedMultiply2, divide4, roundingMode);
        }
        double d = divide3 * (divide / divide4);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return DoubleMath.roundToLong(d, roundingMode);
    }

    @UnstableApi
    public static long[] scaleLargeValues(List<Long> list, long j, long j2, RoundingMode roundingMode) {
        int i;
        int size = list.size();
        long[] jArr = new long[size];
        if (j == 0) {
            return jArr;
        }
        int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        int i3 = 0;
        if (i2 >= 0 && j2 % j == 0) {
            long divide = LongMath.divide(j2, j, RoundingMode.UNNECESSARY);
            while (i3 < size) {
                jArr[i3] = LongMath.divide(list.get(i3).longValue(), divide, roundingMode);
                i3++;
            }
            return jArr;
        } else if (i2 < 0 && j % j2 == 0) {
            long divide2 = LongMath.divide(j, j2, RoundingMode.UNNECESSARY);
            while (i3 < size) {
                jArr[i3] = LongMath.saturatedMultiply(list.get(i3).longValue(), divide2);
                i3++;
            }
            return jArr;
        } else {
            int i4 = 0;
            while (i4 < size) {
                long longValue = list.get(i4).longValue();
                if (longValue != 0) {
                    int i5 = (j2 > longValue ? 1 : (j2 == longValue ? 0 : -1));
                    if (i5 >= 0 && j2 % longValue == 0) {
                        jArr[i4] = LongMath.divide(j, LongMath.divide(j2, longValue, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i5 < 0 && longValue % j2 == 0) {
                        jArr[i4] = LongMath.saturatedMultiply(j, LongMath.divide(longValue, j2, RoundingMode.UNNECESSARY));
                    } else {
                        i = i4;
                        jArr[i] = scaleLargeValueFallback(longValue, j, j2, roundingMode);
                        i4 = i + 1;
                    }
                }
                i = i4;
                i4 = i + 1;
            }
            return jArr;
        }
    }

    @UnstableApi
    public static void scaleLargeValuesInPlace(long[] jArr, long j, long j2, RoundingMode roundingMode) {
        if (j == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j2 % j == 0) {
            long divide = LongMath.divide(j2, j, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = LongMath.divide(jArr[i2], divide, roundingMode);
                i2++;
            }
        } else if (i < 0 && j % j2 == 0) {
            long divide2 = LongMath.divide(j, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = LongMath.saturatedMultiply(jArr[i2], divide2);
                i2++;
            }
        } else {
            for (int i3 = 0; i3 < jArr.length; i3++) {
                long j3 = jArr[i3];
                if (j3 != 0) {
                    if (j2 >= j3 && j2 % j3 == 0) {
                        jArr[i3] = LongMath.divide(j, LongMath.divide(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (j2 < j3 && j3 % j2 == 0) {
                        jArr[i3] = LongMath.saturatedMultiply(j, LongMath.divide(j3, j2, RoundingMode.UNNECESSARY));
                    } else {
                        jArr[i3] = scaleLargeValueFallback(j3, j, j2, roundingMode);
                    }
                }
            }
        }
    }

    @UnstableApi
    public static void setForegroundServiceNotification(Service service, int i, Notification notification, int i2, String str) {
        if (SDK_INT >= 29) {
            Api29.startForeground(service, i, notification, i2, str);
        } else {
            service.startForeground(i, notification);
        }
    }

    private static boolean shouldEscapeCharacter(char c) {
        if (c != '\"' && c != '%' && c != '*' && c != '/' && c != ':' && c != '<' && c != '\\' && c != '|' && c != '>' && c != '?') {
            return false;
        }
        return true;
    }

    public static boolean shouldShowPlayButton(@Nullable Player player) {
        return shouldShowPlayButton(player, true);
    }

    @UnstableApi
    public static void sneakyThrow(Throwable th) {
        sneakyThrowInternal(th);
    }

    @UnstableApi
    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    @UnstableApi
    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    @UnstableApi
    public static String[] splitCodecs(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return split(str.trim(), "(\\s*,\\s*)");
    }

    @Nullable
    @UnstableApi
    public static ComponentName startForegroundService(Context context, Intent intent) {
        ComponentName startForegroundService;
        if (SDK_INT >= 26) {
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
        return context.startService(intent);
    }

    @UnstableApi
    public static long subtractWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j - j2;
        if (((j ^ j4) & (j2 ^ j)) < 0) {
            return j3;
        }
        return j4;
    }

    @UnstableApi
    public static long sum(long... jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        return j;
    }

    @UnstableApi
    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
        if (DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public static byte[] toByteArray(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    @UnstableApi
    public static float toFloat(byte[] bArr) {
        boolean z;
        if (bArr.length == 4) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        return Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
    }

    @UnstableApi
    public static String toHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb2.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return sb2.toString();
    }

    @UnstableApi
    public static int toInteger(byte[] bArr) {
        boolean z;
        if (bArr.length == 4) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        return bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8);
    }

    @UnstableApi
    public static long toLong(int i, int i2) {
        return toUnsignedLong(i2) | (toUnsignedLong(i) << 32);
    }

    @UnstableApi
    public static long toUnsignedLong(int i) {
        return i & 4294967295L;
    }

    @UnstableApi
    public static <T, U> ListenableFuture<T> transformFutureAsync(final ListenableFuture<U> listenableFuture, final AsyncFunction<U, T> asyncFunction) {
        final SettableFuture create = SettableFuture.create();
        create.addListener(new Runnable() { // from class: androidx.media3.common.util.j
            @Override // java.lang.Runnable
            public final void run() {
                Util.lambda$transformFutureAsync$1(create, listenableFuture);
            }
        }, MoreExecutors.directExecutor());
        listenableFuture.addListener(new Runnable() { // from class: androidx.media3.common.util.k
            @Override // java.lang.Runnable
            public final void run() {
                Util.lambda$transformFutureAsync$2(listenableFuture, create, asyncFunction);
            }
        }, MoreExecutors.directExecutor());
        return create;
    }

    @Nullable
    @UnstableApi
    public static String unescapeFileName(String str) {
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
        Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i2 > 0 && matcher.find()) {
            sb2.append((CharSequence) str, i, matcher.start());
            sb2.append((char) Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 16));
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

    @UnstableApi
    public static long usToMs(long j) {
        if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            return j / 1000;
        }
        return j;
    }

    @UnstableApi
    public static void writeBoolean(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    @UnstableApi
    public static long ceilDivide(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    @UnstableApi
    public static long constrainValue(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    @UnstableApi
    public static Handler createHandlerForCurrentLooper(@Nullable Handler.Callback callback) {
        return createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), callback);
    }

    @UnstableApi
    public static Handler createHandlerForCurrentOrMainLooper(@Nullable Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    @UnstableApi
    public static String fromUtf8Bytes(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charsets.UTF_8);
    }

    @UnstableApi
    public static boolean handlePlayPauseButtonAction(@Nullable Player player, boolean z) {
        if (shouldShowPlayButton(player, z)) {
            return handlePlayButtonAction(player);
        }
        return handlePauseButtonAction(player);
    }

    @UnstableApi
    public static boolean shouldShowPlayButton(@Nullable Player player, boolean z) {
        if (player == null || !player.getPlayWhenReady() || player.getPlaybackState() == 1 || player.getPlaybackState() == 4) {
            return true;
        }
        return z && player.getPlaybackSuppressionReason() != 0;
    }

    @UnstableApi
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
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

    @UnstableApi
    public static float constrainValue(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    @UnstableApi
    public static <T> boolean contains(SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    @UnstableApi
    public static int linearSearch(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] == j) {
                return i;
            }
        }
        return -1;
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        return maybeRequestReadStoragePermission(activity, mediaItemArr);
    }

    @UnstableApi
    public static int binarySearchCeil(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    @UnstableApi
    public static int binarySearchFloor(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static int inferContentType(Uri uri) {
        int inferContentTypeForExtension;
        String scheme = uri.getScheme();
        if (scheme == null || !Ascii.equalsIgnoreCase("rtsp", scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf < 0 || (inferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(lastIndexOf + 1))) == 4) {
                Matcher matcher = ISM_PATH_PATTERN.matcher((CharSequence) Assertions.checkNotNull(uri.getPath()));
                if (matcher.matches()) {
                    String group = matcher.group(2);
                    if (group != null) {
                        if (group.contains(ISM_DASH_FORMAT_EXTENSION)) {
                            return 0;
                        }
                        if (group.contains(ISM_HLS_FORMAT_EXTENSION)) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 4;
            }
            return inferContentTypeForExtension;
        }
        return 3;
    }

    @UnstableApi
    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i = 0;
        for (int i2 : iArr) {
            byte[] byteArray = toByteArray(i2);
            int i3 = i + 1;
            bArr[i] = byteArray[0];
            int i4 = i3 + 1;
            bArr[i3] = byteArray[1];
            int i5 = i4 + 1;
            bArr[i4] = byteArray[2];
            i = i5 + 1;
            bArr[i5] = byteArray[3];
        }
        return bArr;
    }

    @UnstableApi
    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t) == 0);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(list.size() - 1, i) : i;
    }

    @UnstableApi
    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t) == 0);
            i = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    @UnstableApi
    public static Point getCurrentDisplayModeSize(Context context, Display display) {
        String systemProperty;
        if (display.getDisplayId() == 0 && isTv(context)) {
            if (SDK_INT < 28) {
                systemProperty = getSystemProperty("sys.display-size");
            } else {
                systemProperty = getSystemProperty("vendor.display-size");
            }
            if (!TextUtils.isEmpty(systemProperty)) {
                try {
                    String[] split = split(systemProperty.trim(), "x");
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.m104568e(TAG, "Invalid display size: " + systemProperty);
            }
            if ("Sony".equals(MANUFACTURER) && MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i = SDK_INT;
        if (i >= 23) {
            getDisplaySizeV23(display, point);
        } else if (i >= 17) {
            getDisplaySizeV17(display, point);
        } else {
            getDisplaySizeV16(display, point);
        }
        return point;
    }

    private static boolean maybeRequestReadStoragePermission(Activity activity, Uri uri) {
        if (isReadStoragePermissionRequestNeeded(activity, uri)) {
            if (SDK_INT < 33) {
                return requestExternalStoragePermission(activity);
            }
            return requestReadMediaPermissions(activity);
        }
        return false;
    }

    @UnstableApi
    public static int binarySearchFloor(LongArray longArray, long j, boolean z, boolean z2) {
        int i;
        int size = longArray.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (longArray.get(i3) < j) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        if (z && (i = size + 1) < longArray.size() && longArray.get(i) == j) {
            return i;
        }
        if (z2 && size == -1) {
            return 0;
        }
        return size;
    }

    @UnstableApi
    public static byte[] toByteArray(float f) {
        return toByteArray(Float.floatToIntBits(f));
    }

    @UnstableApi
    @Deprecated
    public static int inferContentType(String str) {
        return inferContentType(Uri.parse("file:///" + str));
    }

    @UnstableApi
    public static <T> T castNonNull(@Nullable T t) {
        return t;
    }

    @UnstableApi
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th) throws Throwable {
        throw th;
    }
}
