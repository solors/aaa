package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15116i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.C21114v8;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a */
/* loaded from: classes4.dex */
public final class C14980a {

    /* renamed from: a */
    public final String f29364a;

    /* renamed from: b */
    public final boolean f29365b;

    /* renamed from: c */
    public final boolean f29366c;

    /* renamed from: d */
    public final String f29367d;

    /* renamed from: e */
    public final MediaCodecInfo.CodecCapabilities f29368e;

    public C14980a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        boolean z2;
        str.getClass();
        this.f29364a = str;
        this.f29367d = str2;
        this.f29368e = codecCapabilities;
        boolean z3 = true;
        if (!z && codecCapabilities != null && AbstractC15133z.f29832a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f29365b = z2;
        this.f29366c = (codecCapabilities == null || AbstractC15133z.f29832a < 21 || !codecCapabilities.isFeatureSupported("tunneled-playback")) ? false : z3;
    }

    /* renamed from: a */
    public final boolean m77350a(String str) {
        String m77219a;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer valueOf;
        Integer valueOf2;
        if (str == null || this.f29367d == null || (m77219a = AbstractC15116i.m77219a(str)) == null) {
            return true;
        }
        if (!this.f29367d.equals(m77219a)) {
            m77348b("codec.mime " + str + ", " + m77219a);
            return false;
        }
        Pattern pattern = AbstractC14989j.f29408a;
        String[] split = str.split("\\.");
        String str2 = split[0];
        str2.getClass();
        int i = 2;
        char c = 65535;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 1;
                    break;
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 2;
                    break;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 3;
                    break;
                }
                break;
        }
        Pair pair = null;
        switch (c) {
            case 0:
            case 1:
                if (split.length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    break;
                } else {
                    try {
                        if (split[1].length() == 6) {
                            valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                            valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                        } else if (split.length >= 3) {
                            valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                            valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
                        } else {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                            break;
                        }
                        pair = new Pair(Integer.valueOf(AbstractC14989j.f29410c.get(valueOf.intValue())), Integer.valueOf(AbstractC14989j.f29411d.get(valueOf2.intValue())));
                        break;
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        break;
                    }
                }
            case 2:
            case 3:
                if (split.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    break;
                } else {
                    Matcher matcher = AbstractC14989j.f29408a.matcher(split[1]);
                    if (!matcher.matches()) {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                        break;
                    } else {
                        String group = matcher.group(1);
                        if ("1".equals(group)) {
                            i = 1;
                        } else if (!"2".equals(group)) {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                            break;
                        }
                        Integer num = (Integer) AbstractC14989j.f29412e.get(split[3]);
                        if (num != null) {
                            pair = new Pair(Integer.valueOf(i), num);
                            break;
                        } else {
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                            break;
                        }
                    }
                }
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29368e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        m77348b("codec.profileLevel, " + str + ", " + m77219a);
        return false;
    }

    /* renamed from: b */
    public final boolean m77349b(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29368e;
        if (codecCapabilities == null) {
            m77348b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m77348b("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            m77348b("sampleRate.support, " + i);
            return false;
        }
    }

    /* renamed from: b */
    public final void m77348b(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f29364a + ", " + this.f29367d + "] [" + AbstractC15133z.f29836e + C21114v8.C21123i.f54139e);
    }

    /* renamed from: a */
    public final boolean m77351a(int i, int i2, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29368e;
        if (codecCapabilities == null) {
            m77348b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m77348b("sizeAndRate.vCaps");
            return false;
        }
        int i3 = (d > (-1.0d) ? 1 : (d == (-1.0d) ? 0 : -1));
        if (i3 != 0 && d > 0.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i, i2, d);
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i, i2);
        }
        if (isSizeSupported) {
            return true;
        }
        if (i < i2) {
            if (i3 != 0 && d > 0.0d) {
                isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i2, i, d);
            } else {
                isSizeSupported2 = videoCapabilities.isSizeSupported(i2, i);
            }
            if (isSizeSupported2) {
                Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f29364a + ", " + this.f29367d + "] [" + AbstractC15133z.f29836e + C21114v8.C21123i.f54139e);
                return true;
            }
        }
        m77348b("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
        return false;
    }

    /* renamed from: a */
    public final Point m77352a(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29368e;
        if (codecCapabilities == null) {
            m77348b("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m77348b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = AbstractC15133z.f29832a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    /* renamed from: a */
    public final boolean m77353a(int i) {
        int i2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f29368e;
        if (codecCapabilities == null) {
            m77348b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m77348b("channelCount.aCaps");
            return false;
        }
        String str = this.f29364a;
        String str2 = this.f29367d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((AbstractC15133z.f29832a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i2 = 6;
            } else {
                i2 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i2 + C21114v8.C21123i.f54139e);
            maxInputChannelCount = i2;
        }
        if (maxInputChannelCount < i) {
            m77348b("channelCount.support, " + i);
            return false;
        }
        return true;
    }
}
