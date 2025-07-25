package com.applovin.impl;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicc2iiccc.C32573coo2iico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.pubnative.lite.sdk.models.Protocol;

/* renamed from: com.applovin.impl.md */
/* loaded from: classes2.dex */
public abstract class AbstractC4828md {

    /* renamed from: a */
    private static final Pattern f7942a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap f7943b = new HashMap();

    /* renamed from: c */
    private static int f7944c = -1;

    /* renamed from: com.applovin.impl.md$b */
    /* loaded from: classes2.dex */
    public static final class C4830b {

        /* renamed from: a */
        public final String f7945a;

        /* renamed from: b */
        public final boolean f7946b;

        /* renamed from: c */
        public final boolean f7947c;

        public C4830b(String str, boolean z, boolean z2) {
            this.f7945a = str;
            this.f7946b = z;
            this.f7947c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C4830b.class) {
                return false;
            }
            C4830b c4830b = (C4830b) obj;
            if (TextUtils.equals(this.f7945a, c4830b.f7945a) && this.f7946b == c4830b.f7946b && this.f7947c == c4830b.f7947c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = (this.f7945a.hashCode() + 31) * 31;
            int i2 = 1231;
            if (this.f7946b) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = (hashCode + i) * 31;
            if (!this.f7947c) {
                i2 = 1237;
            }
            return i3 + i2;
        }
    }

    /* renamed from: com.applovin.impl.md$c */
    /* loaded from: classes2.dex */
    public static class C4831c extends Exception {
        private C4831c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.applovin.impl.md$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4832d {
        /* renamed from: a */
        int mo97508a();

        /* renamed from: a */
        MediaCodecInfo mo97507a(int i);

        /* renamed from: a */
        boolean mo97506a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo97505b();

        /* renamed from: b */
        boolean mo97504b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    /* renamed from: com.applovin.impl.md$e */
    /* loaded from: classes2.dex */
    public static final class C4833e implements InterfaceC4832d {
        private C4833e() {
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: a */
        public boolean mo97506a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: b */
        public boolean mo97505b() {
            return false;
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: a */
        public MediaCodecInfo mo97507a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: b */
        public boolean mo97504b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: a */
        public int mo97508a() {
            return MediaCodecList.getCodecCount();
        }
    }

    /* renamed from: com.applovin.impl.md$f */
    /* loaded from: classes2.dex */
    public static final class C4834f implements InterfaceC4832d {

        /* renamed from: a */
        private final int f7948a;

        /* renamed from: b */
        private MediaCodecInfo[] f7949b;

        public C4834f(boolean z, boolean z2) {
            int i;
            if (!z && !z2) {
                i = 0;
            } else {
                i = 1;
            }
            this.f7948a = i;
        }

        /* renamed from: c */
        private void m97503c() {
            if (this.f7949b == null) {
                this.f7949b = new MediaCodecList(this.f7948a).getCodecInfos();
            }
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: a */
        public int mo97508a() {
            m97503c();
            return this.f7949b.length;
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: b */
        public boolean mo97505b() {
            return true;
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: b */
        public boolean mo97504b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: a */
        public MediaCodecInfo mo97507a(int i) {
            m97503c();
            return this.f7949b[i];
        }

        @Override // com.applovin.impl.AbstractC4828md.InterfaceC4832d
        /* renamed from: a */
        public boolean mo97506a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }
    }

    /* renamed from: com.applovin.impl.md$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC4835g {
        /* renamed from: a */
        int mo94357a(Object obj);
    }

    /* renamed from: a */
    private static int m97550a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    private static int m97533b(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: g */
    private static int m97511g(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return i != 3 ? -1 : 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: h */
    private static boolean m97509h(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    /* renamed from: a */
    private static Integer m97541a(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals(Protocol.VAST_4_1)) {
                    c = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals(Protocol.VAST_4_1_WRAPPER)) {
                    c = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals(Protocol.VAST_4_2)) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            case '\n':
                return 1024;
            case 11:
                return 2048;
            case '\f':
                return 4096;
            default:
                return null;
        }
    }

    /* renamed from: b */
    private static Integer m97530b(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            default:
                return null;
        }
    }

    /* renamed from: c */
    private static int m97527c(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    /* renamed from: d */
    private static int m97522d(int i) {
        if (i != 66) {
            if (i != 77) {
                if (i != 88) {
                    if (i != 100) {
                        if (i != 110) {
                            if (i != 122) {
                                return i != 244 ? -1 : 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: e */
    private static int m97518e(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: f */
    private static int m97514f(int i) {
        if (i != 10) {
            if (i != 11) {
                if (i != 20) {
                    if (i != 21) {
                        if (i != 30) {
                            if (i != 31) {
                                if (i != 40) {
                                    if (i != 41) {
                                        if (i != 50) {
                                            if (i != 51) {
                                                switch (i) {
                                                    case 60:
                                                        return 2048;
                                                    case 61:
                                                        return 4096;
                                                    case 62:
                                                        return 8192;
                                                    default:
                                                        return -1;
                                                }
                                            }
                                            return 512;
                                        }
                                        return 256;
                                    }
                                    return 128;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: g */
    private static boolean m97510g(MediaCodecInfo mediaCodecInfo) {
        if (AbstractC5863xp.f12151a >= 29) {
            return m97509h(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    /* renamed from: c */
    private static Pair m97523c(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f7942a.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer m97530b = m97530b(group);
        if (m97530b == null) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer m97541a = m97541a(str2);
        if (m97541a == null) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
            return null;
        }
        return new Pair(m97530b, m97541a);
    }

    /* renamed from: d */
    private static Pair m97519d(String str, String[] strArr) {
        if (strArr.length < 4) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f7942a.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
            i = 2;
        }
        String str2 = strArr[3];
        Integer m97524c = m97524c(str2);
        if (m97524c == null) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown HEVC level string: " + str2);
            return null;
        }
        return new Pair(Integer.valueOf(i), m97524c);
    }

    /* renamed from: e */
    private static Pair m97515e(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int m97511g = m97511g(parseInt);
            if (m97511g == -1) {
                AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int m97514f = m97514f(parseInt2);
            if (m97514f == -1) {
                AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
                return null;
            }
            return new Pair(Integer.valueOf(m97511g), Integer.valueOf(m97514f));
        } catch (NumberFormatException unused) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* renamed from: f */
    private static boolean m97513f(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    /* renamed from: b */
    private static Pair m97528b(String str, String[] strArr) {
        int parseInt;
        int i;
        if (strArr.length < 2) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i = parseInt2;
            } else {
                AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int m97522d = m97522d(i);
            if (m97522d == -1) {
                AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown AVC profile: " + i);
                return null;
            }
            int m97533b = m97533b(parseInt);
            if (m97533b == -1) {
                AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown AVC level: " + parseInt);
                return null;
            }
            return new Pair(Integer.valueOf(m97522d), Integer.valueOf(m97533b));
        } catch (NumberFormatException unused) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m97517e(MediaCodecInfo mediaCodecInfo) {
        if (AbstractC5863xp.f12151a >= 29) {
            return m97513f(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    /* renamed from: c */
    private static Integer m97524c(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return 256;
            case '\n':
                return 2048;
            case 11:
                return 8192;
            case '\f':
                return 32768;
            case '\r':
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private static Pair m97538a(String str, String[] strArr) {
        int m97518e;
        if (strArr.length != 3) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(AbstractC4524hf.m98702a(Integer.parseInt(strArr[1], 16))) && (m97518e = m97518e(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(m97518e), 0);
            }
        } catch (NumberFormatException unused) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m97521d(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    /* renamed from: a */
    private static Pair m97537a(String str, String[] strArr, C5235r3 c5235r3) {
        int i;
        if (strArr.length < 4) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i2 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            } else if (parseInt3 != 8 && parseInt3 != 10) {
                AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            } else {
                if (parseInt3 != 8) {
                    i2 = (c5235r3 == null || !(c5235r3.f9303d != null || (i = c5235r3.f9302c) == 7 || i == 6)) ? 2 : 4096;
                }
                int m97550a = m97550a(parseInt2);
                if (m97550a == -1) {
                    AbstractC5063oc.m96800d("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
                    return null;
                }
                return new Pair(Integer.valueOf(i2), Integer.valueOf(m97550a));
            }
        } catch (NumberFormatException unused) {
            AbstractC5063oc.m96800d("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m97532b(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    /* renamed from: b */
    public static /* synthetic */ int m97531b(C4647jd c4647jd) {
        return c4647jd.f7138a.startsWith("OMX.google") ? 1 : 0;
    }

    /* renamed from: b */
    public static synchronized List m97529b(String str, boolean z, boolean z2) {
        InterfaceC4832d c4833e;
        synchronized (AbstractC4828md.class) {
            C4830b c4830b = new C4830b(str, z, z2);
            HashMap hashMap = f7943b;
            List list = (List) hashMap.get(c4830b);
            if (list != null) {
                return list;
            }
            int i = AbstractC5863xp.f12151a;
            if (i >= 21) {
                c4833e = new C4834f(z, z2);
            } else {
                c4833e = new C4833e();
            }
            ArrayList m97543a = m97543a(c4830b, c4833e);
            if (z && m97543a.isEmpty() && 21 <= i && i <= 23) {
                m97543a = m97543a(c4830b, new C4833e());
                if (!m97543a.isEmpty()) {
                    AbstractC5063oc.m96800d("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C4647jd) m97543a.get(0)).f7138a);
                }
            }
            m97540a(str, m97543a);
            List unmodifiableList = Collections.unmodifiableList(m97543a);
            hashMap.put(c4830b, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: a */
    private static String m97548a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m97526c(MediaCodecInfo mediaCodecInfo) {
        if (AbstractC5863xp.f12151a >= 29) {
            return m97521d(mediaCodecInfo);
        }
        return !m97517e(mediaCodecInfo);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0077, code lost:
        if (r3.equals("av01") == false) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair m97546a(com.applovin.impl.C4310e9 r6) {
        /*
            java.lang.String r0 = r6.f5810j
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f5813m
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1e
            java.lang.String r6 = r6.f5810j
            android.util.Pair r6 = m97523c(r6, r0)
            return r6
        L1e:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3004662: goto L71;
                case 3006243: goto L66;
                case 3006244: goto L5b;
                case 3199032: goto L50;
                case 3214780: goto L45;
                case 3356560: goto L3a;
                case 3624515: goto L2e;
                default: goto L2c;
            }
        L2c:
            r2 = r5
            goto L7a
        L2e:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L38
            goto L2c
        L38:
            r2 = 6
            goto L7a
        L3a:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L43
            goto L2c
        L43:
            r2 = 5
            goto L7a
        L45:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4e
            goto L2c
        L4e:
            r2 = 4
            goto L7a
        L50:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L59
            goto L2c
        L59:
            r2 = 3
            goto L7a
        L5b:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L64
            goto L2c
        L64:
            r2 = 2
            goto L7a
        L66:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6f
            goto L2c
        L6f:
            r2 = 1
            goto L7a
        L71:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L7a
            goto L2c
        L7a:
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L93;
                case 2: goto L93;
                case 3: goto L8c;
                case 4: goto L8c;
                case 5: goto L85;
                case 6: goto L7e;
                default: goto L7d;
            }
        L7d:
            return r1
        L7e:
            java.lang.String r6 = r6.f5810j
            android.util.Pair r6 = m97515e(r6, r0)
            return r6
        L85:
            java.lang.String r6 = r6.f5810j
            android.util.Pair r6 = m97538a(r6, r0)
            return r6
        L8c:
            java.lang.String r6 = r6.f5810j
            android.util.Pair r6 = m97519d(r6, r0)
            return r6
        L93:
            java.lang.String r6 = r6.f5810j
            android.util.Pair r6 = m97528b(r6, r0)
            return r6
        L9a:
            java.lang.String r1 = r6.f5810j
            com.applovin.impl.r3 r6 = r6.f5825y
            android.util.Pair r6 = m97537a(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC4828md.m97546a(com.applovin.impl.e9):android.util.Pair");
    }

    /* renamed from: b */
    public static int m97534b() {
        if (f7944c == -1) {
            int i = 0;
            C4647jd m97539a = m97539a("video/avc", false, false);
            if (m97539a != null) {
                MediaCodecInfo.CodecProfileLevel[] m98257a = m97539a.m98257a();
                int length = m98257a.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m97527c(m98257a[i].level), i2);
                    i++;
                }
                i = Math.max(i2, AbstractC5863xp.f12151a >= 21 ? 345600 : 172800);
            }
            f7944c = i;
        }
        return f7944c;
    }

    /* renamed from: a */
    public static C4647jd m97539a(String str, boolean z, boolean z2) {
        List m97529b = m97529b(str, z, z2);
        if (m97529b.isEmpty()) {
            return null;
        }
        return (C4647jd) m97529b.get(0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(4:(2:72|73)|53|(9:56|57|58|59|60|61|62|64|65)|9)|32|33|34|36|9) */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0080, code lost:
        if (r1.f7946b == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00a5, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x00a6, code lost:
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0102 A[Catch: Exception -> 0x0150, TRY_ENTER, TryCatch #1 {Exception -> 0x0150, blocks: (B:179:0x0009, B:181:0x001c, B:236:0x0121, B:184:0x002e, B:187:0x0039, B:230:0x00fa, B:233:0x0102, B:235:0x0108, B:237:0x012b, B:238:0x014e), top: B:245:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x012b A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList m97543a(com.applovin.impl.AbstractC4828md.C4830b r24, com.applovin.impl.AbstractC4828md.InterfaceC4832d r25) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC4828md.m97543a(com.applovin.impl.md$b, com.applovin.impl.md$d):java.util.ArrayList");
    }

    /* renamed from: a */
    private static boolean m97547a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = AbstractC5863xp.f12151a;
        if (i >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                String str3 = AbstractC5863xp.f12152b;
                if ("a70".equals(str3) || (C32573coo2iico.c2oc2o.equals(AbstractC5863xp.f12153c) && str3.startsWith("HM"))) {
                    return false;
                }
            }
            if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                String str4 = AbstractC5863xp.f12152b;
                if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                    return false;
                }
            }
            if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                String str5 = AbstractC5863xp.f12152b;
                if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                    return false;
                }
            }
            if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC5863xp.f12153c))) {
                String str6 = AbstractC5863xp.f12152b;
                if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                    return false;
                }
            }
            if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC5863xp.f12153c)) {
                String str7 = AbstractC5863xp.f12152b;
                if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                    return false;
                }
            }
            if (i <= 19 && AbstractC5863xp.f12152b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
                return false;
            }
            return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ int m97544a(C4647jd c4647jd) {
        String str = c4647jd.f7138a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (AbstractC5863xp.f12151a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* renamed from: a */
    public static /* synthetic */ int m97545a(C4310e9 c4310e9, C4647jd c4647jd) {
        try {
            return c4647jd.m98242b(c4310e9) ? 1 : 0;
        } catch (C4831c unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m97542a(InterfaceC4835g interfaceC4835g, Object obj, Object obj2) {
        return interfaceC4835g.mo94357a(obj2) - interfaceC4835g.mo94357a(obj);
    }

    /* renamed from: a */
    private static void m97535a(List list, final InterfaceC4835g interfaceC4835g) {
        Collections.sort(list, new Comparator() { // from class: com.applovin.impl.qz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m97542a;
                m97542a = AbstractC4828md.m97542a(interfaceC4835g, obj, obj2);
                return m97542a;
            }
        });
    }

    /* renamed from: a */
    public static C4647jd m97551a() {
        return m97539a("audio/raw", false, false);
    }

    /* renamed from: a */
    public static List m97536a(List list, final C4310e9 c4310e9) {
        ArrayList arrayList = new ArrayList(list);
        m97535a(arrayList, new InterfaceC4835g() { // from class: com.applovin.impl.tz
            @Override // com.applovin.impl.AbstractC4828md.InterfaceC4835g
            /* renamed from: a */
            public final int mo94357a(Object obj) {
                int m97545a;
                m97545a = AbstractC4828md.m97545a(c4310e9, (C4647jd) obj);
                return m97545a;
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    private static void m97540a(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (AbstractC5863xp.f12151a < 26 && AbstractC5863xp.f12152b.equals("R9") && list.size() == 1 && ((C4647jd) list.get(0)).f7138a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C4647jd.m98246a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m97535a(list, new InterfaceC4835g() { // from class: com.applovin.impl.rz
                @Override // com.applovin.impl.AbstractC4828md.InterfaceC4835g
                /* renamed from: a */
                public final int mo94357a(Object obj) {
                    int m97544a;
                    m97544a = AbstractC4828md.m97544a((C4647jd) obj);
                    return m97544a;
                }
            });
        }
        int i = AbstractC5863xp.f12151a;
        if (i < 21 && list.size() > 1) {
            String str2 = ((C4647jd) list.get(0)).f7138a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m97535a(list, new InterfaceC4835g() { // from class: com.applovin.impl.sz
                    @Override // com.applovin.impl.AbstractC4828md.InterfaceC4835g
                    /* renamed from: a */
                    public final int mo94357a(Object obj) {
                        int m97531b;
                        m97531b = AbstractC4828md.m97531b((C4647jd) obj);
                        return m97531b;
                    }
                });
            }
        }
        if (i >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C4647jd) list.get(0)).f7138a)) {
            return;
        }
        list.add((C4647jd) list.remove(0));
    }

    /* renamed from: a */
    private static boolean m97549a(MediaCodecInfo mediaCodecInfo) {
        return AbstractC5863xp.f12151a >= 29 && m97532b(mediaCodecInfo);
    }
}
