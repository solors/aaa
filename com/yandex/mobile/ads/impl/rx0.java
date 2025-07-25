package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class rx0 {

    /* renamed from: a */
    private static final ArrayList<C31317a> f84937a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f84938b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: c */
    public static final /* synthetic */ int f84939c = 0;

    /* renamed from: com.yandex.mobile.ads.impl.rx0$a */
    /* loaded from: classes8.dex */
    private static final class C31317a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.rx0$b */
    /* loaded from: classes8.dex */
    public static final class C31318b {

        /* renamed from: a */
        public final int f84940a;

        public C31318b(int i) {
            this.f84940a = i;
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m29905a(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 165) {
                                    if (i != 166) {
                                        switch (i) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    /* renamed from: b */
    public static int m29901b(String str, @Nullable String str2) {
        C31318b m29904a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (m29904a = m29904a(str2)) == null) {
                    return 0;
                }
                int i = m29904a.f84940a;
                if (i != 2) {
                    if (i != 5) {
                        if (i != 29) {
                            if (i != 42) {
                                if (i != 22) {
                                    return i != 23 ? 0 : 15;
                                }
                                return 1073741824;
                            }
                            return 16;
                        }
                        return 12;
                    }
                    return 11;
                }
                return 10;
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    public static int m29900c(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(m29902b(str))) {
            return 1;
        }
        if ("video".equals(m29902b(str))) {
            return 2;
        }
        if (m29898e(str)) {
            return 3;
        }
        if ("image".equals(m29902b(str))) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            int size = f84937a.size();
            for (int i = 0; i < size; i++) {
                f84937a.get(i).getClass();
                if (str.equals(null)) {
                    return 0;
                }
            }
            return -1;
        }
        return 5;
    }

    /* renamed from: d */
    public static boolean m29899d(@Nullable String str) {
        return "audio".equals(m29902b(str));
    }

    /* renamed from: e */
    public static boolean m29898e(@Nullable String str) {
        if (!"text".equals(m29902b(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m29897f(@Nullable String str) {
        return "video".equals(m29902b(str));
    }

    /* renamed from: a */
    public static boolean m29903a(@Nullable String str, @Nullable String str2) {
        C31318b m29904a;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (m29904a = m29904a(str2)) == null) {
                    return false;
                }
                int i = m29904a.f84940a;
                char c2 = i != 2 ? i != 5 ? i != 29 ? i != 42 ? i != 22 ? i != 23 ? (char) 0 : (char) 15 : (char) 0 : (char) 16 : '\f' : (char) 11 : '\n';
                return (c2 == 0 || c2 == 16) ? false : true;
            default:
                return false;
        }
    }

    @Nullable
    /* renamed from: b */
    private static String m29902b(@Nullable String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: a */
    static C31318b m29904a(String str) {
        Matcher matcher = f84938b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            try {
                Integer.parseInt(group, 16);
                return new C31318b(group2 != null ? Integer.parseInt(group2) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }
}
