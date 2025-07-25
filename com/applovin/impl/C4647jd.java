package com.applovin.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.ironsource.C21114v8;

/* renamed from: com.applovin.impl.jd */
/* loaded from: classes2.dex */
public final class C4647jd {

    /* renamed from: a */
    public final String f7138a;

    /* renamed from: b */
    public final String f7139b;

    /* renamed from: c */
    public final String f7140c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f7141d;

    /* renamed from: e */
    public final boolean f7142e;

    /* renamed from: f */
    public final boolean f7143f;

    /* renamed from: g */
    public final boolean f7144g;

    /* renamed from: h */
    public final boolean f7145h;

    /* renamed from: i */
    public final boolean f7146i;

    /* renamed from: j */
    public final boolean f7147j;

    /* renamed from: k */
    private final boolean f7148k;

    C4647jd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f7138a = (String) AbstractC4100b1.m100583a((Object) str);
        this.f7139b = str2;
        this.f7140c = str3;
        this.f7141d = codecCapabilities;
        this.f7145h = z;
        this.f7146i = z2;
        this.f7147j = z3;
        this.f7142e = z4;
        this.f7143f = z5;
        this.f7144g = z6;
        this.f7148k = AbstractC4524hf.m98691i(str2);
    }

    /* renamed from: a */
    private static int m98247a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((AbstractC5863xp.f12151a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        AbstractC5063oc.m96800d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + C21114v8.C21123i.f54139e);
        return i2;
    }

    /* renamed from: c */
    private static boolean m98240c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: d */
    private static boolean m98237d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC5863xp.f12151a >= 21 && m98235e(codecCapabilities);
    }

    /* renamed from: e */
    private static boolean m98235e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: f */
    private static boolean m98233f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC5863xp.f12151a >= 21 && m98231g(codecCapabilities);
    }

    /* renamed from: g */
    private static boolean m98231g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: b */
    public boolean m98244b(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7141d;
        if (codecCapabilities == null) {
            m98241b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m98241b("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            m98241b("sampleRate.support, " + i);
            return false;
        }
    }

    public String toString() {
        return this.f7138a;
    }

    /* renamed from: d */
    private static boolean m98236d(String str) {
        return AbstractC5863xp.f12154d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: e */
    private static boolean m98234e(String str) {
        if (AbstractC5863xp.f12151a <= 22) {
            String str2 = AbstractC5863xp.f12154d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static final boolean m98232f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(AbstractC5863xp.f12152b)) ? false : true;
    }

    /* renamed from: c */
    public boolean m98239c(C4310e9 c4310e9) {
        if (this.f7148k) {
            return this.f7142e;
        }
        Pair m97546a = AbstractC4828md.m97546a(c4310e9);
        return m97546a != null && ((Integer) m97546a.first).intValue() == 42;
    }

    /* renamed from: c */
    private static boolean m98238c(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: b */
    public boolean m98242b(C4310e9 c4310e9) {
        int i;
        if (m98250a(c4310e9)) {
            if (this.f7148k) {
                int i2 = c4310e9.f5818r;
                if (i2 <= 0 || (i = c4310e9.f5819s) <= 0) {
                    return true;
                }
                if (AbstractC5863xp.f12151a >= 21) {
                    return m98254a(i2, i, c4310e9.f5820t);
                }
                boolean z = i2 * i <= AbstractC4828md.m97534b();
                if (!z) {
                    m98241b("legacyFrameSize, " + c4310e9.f5818r + "x" + c4310e9.f5819s);
                }
                return z;
            }
            if (AbstractC5863xp.f12151a >= 21) {
                int i3 = c4310e9.f5795A;
                if (i3 != -1 && !m98244b(i3)) {
                    return false;
                }
                int i4 = c4310e9.f5826z;
                if (i4 != -1 && !m98256a(i4)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Point m98255a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7141d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m98252a(videoCapabilities, i, i2);
    }

    /* renamed from: b */
    public boolean m98245b() {
        if (AbstractC5863xp.f12151a >= 29 && "video/x-vnd.on2.vp9".equals(this.f7139b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m98257a()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static Point m98252a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(AbstractC5863xp.m93040a(i, widthAlignment) * widthAlignment, AbstractC5863xp.m93040a(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: b */
    private void m98241b(String str) {
        AbstractC5063oc.m96809a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f7138a + ", " + this.f7139b + "] [" + AbstractC5863xp.f12155e + C21114v8.C21123i.f54139e);
    }

    /* renamed from: b */
    private static boolean m98243b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC5863xp.f12151a >= 19 && m98240c(codecCapabilities);
    }

    /* renamed from: a */
    private static boolean m98251a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point m98252a = m98252a(videoCapabilities, i, i2);
        int i3 = m98252a.x;
        int i4 = m98252a.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    /* renamed from: a */
    public C5105p5 m98249a(C4310e9 c4310e9, C4310e9 c4310e92) {
        int i = !AbstractC5863xp.m93016a((Object) c4310e9.f5813m, (Object) c4310e92.f5813m) ? 8 : 0;
        if (this.f7148k) {
            if (c4310e9.f5821u != c4310e92.f5821u) {
                i |= 1024;
            }
            if (!this.f7142e && (c4310e9.f5818r != c4310e92.f5818r || c4310e9.f5819s != c4310e92.f5819s)) {
                i |= 512;
            }
            if (!AbstractC5863xp.m93016a(c4310e9.f5825y, c4310e92.f5825y)) {
                i |= 2048;
            }
            if (m98236d(this.f7138a) && !c4310e9.m99642a(c4310e92)) {
                i |= 2;
            }
            if (i == 0) {
                return new C5105p5(this.f7138a, c4310e9, c4310e92, c4310e9.m99642a(c4310e92) ? 3 : 2, 0);
            }
        } else {
            if (c4310e9.f5826z != c4310e92.f5826z) {
                i |= 4096;
            }
            if (c4310e9.f5795A != c4310e92.f5795A) {
                i |= 8192;
            }
            if (c4310e9.f5796B != c4310e92.f5796B) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f7139b)) {
                Pair m97546a = AbstractC4828md.m97546a(c4310e9);
                Pair m97546a2 = AbstractC4828md.m97546a(c4310e92);
                if (m97546a != null && m97546a2 != null) {
                    int intValue = ((Integer) m97546a.first).intValue();
                    int intValue2 = ((Integer) m97546a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C5105p5(this.f7138a, c4310e9, c4310e92, 3, 0);
                    }
                }
            }
            if (!c4310e9.m99642a(c4310e92)) {
                i |= 32;
            }
            if (m98238c(this.f7139b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C5105p5(this.f7138a, c4310e9, c4310e92, 1, 0);
            }
        }
        return new C5105p5(this.f7138a, c4310e9, c4310e92, 0, i);
    }

    /* renamed from: a */
    private static MediaCodecInfo.CodecProfileLevel[] m98253a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* renamed from: a */
    public MediaCodecInfo.CodecProfileLevel[] m98257a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7141d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* renamed from: a */
    public boolean m98256a(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7141d;
        if (codecCapabilities == null) {
            m98241b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m98241b("channelCount.aCaps");
            return false;
        } else if (m98247a(this.f7138a, this.f7139b, audioCapabilities.getMaxInputChannelCount()) < i) {
            m98241b("channelCount.support, " + i);
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public boolean m98250a(C4310e9 c4310e9) {
        String m98699b;
        String str = c4310e9.f5810j;
        if (str == null || this.f7139b == null || (m98699b = AbstractC4524hf.m98699b(str)) == null) {
            return true;
        }
        if (!this.f7139b.equals(m98699b)) {
            m98241b("codec.mime " + c4310e9.f5810j + ", " + m98699b);
            return false;
        }
        Pair m97546a = AbstractC4828md.m97546a(c4310e9);
        if (m97546a == null) {
            return true;
        }
        int intValue = ((Integer) m97546a.first).intValue();
        int intValue2 = ((Integer) m97546a.second).intValue();
        if (this.f7148k || intValue == 42) {
            MediaCodecInfo.CodecProfileLevel[] m98257a = m98257a();
            if (AbstractC5863xp.f12151a <= 23 && "video/x-vnd.on2.vp9".equals(this.f7139b) && m98257a.length == 0) {
                m98257a = m98253a(this.f7141d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m98257a) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                    return true;
                }
            }
            m98241b("codec.profileLevel, " + c4310e9.f5810j + ", " + m98699b);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m98254a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7141d;
        if (codecCapabilities == null) {
            m98241b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m98241b("sizeAndRate.vCaps");
            return false;
        } else if (m98251a(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i < i2 && m98232f(this.f7138a) && m98251a(videoCapabilities, i2, i, d)) {
                m98248a("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
                return true;
            }
            m98241b("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
            return false;
        }
    }

    /* renamed from: a */
    public static C4647jd m98246a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new C4647jd(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !m98243b(codecCapabilities) || m98234e(str)) ? false : true, codecCapabilities != null && m98233f(codecCapabilities), z5 || (codecCapabilities != null && m98237d(codecCapabilities)));
    }

    /* renamed from: a */
    private void m98248a(String str) {
        AbstractC5063oc.m96809a("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f7138a + ", " + this.f7139b + "] [" + AbstractC5863xp.f12155e + C21114v8.C21123i.f54139e);
    }
}
