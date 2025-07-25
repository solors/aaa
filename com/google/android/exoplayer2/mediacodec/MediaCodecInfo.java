package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.C21114v8;
import java.util.List;

/* loaded from: classes4.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";

    /* renamed from: a */
    private final boolean f33811a;
    public final boolean adaptive;
    @Nullable
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean hardwareAccelerated;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(29)
    /* loaded from: classes4.dex */
    public static final class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints;
            boolean covers;
            supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || MediaCodecInfo.m74223a()) {
                return 0;
            }
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                covers = ((MediaCodecInfo.VideoCapabilities.PerformancePoint) supportedPerformancePoints.get(i3)).covers(performancePoint);
                if (covers) {
                    return 2;
                }
            }
            return 1;
        }
    }

    @VisibleForTesting
    MediaCodecInfo(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.name = (String) Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z;
        this.softwareOnly = z2;
        this.vendor = z3;
        this.adaptive = z4;
        this.tunneling = z5;
        this.secure = z6;
        this.f33811a = MimeTypes.isVideo(str2);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m74223a() {
        return m74204t();
    }

    /* renamed from: b */
    private static int m74222b(String str, String str2, int i) {
        int i2;
        if (i <= 1 && ((Util.SDK_INT < 26 || i <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i2 = 6;
            } else if ("audio/eac3".equals(str2)) {
                i2 = 16;
            } else {
                i2 = 30;
            }
            Log.m72602w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + C21114v8.C21123i.f54139e);
            return i2;
        }
        return i;
    }

    @RequiresApi(21)
    /* renamed from: c */
    private static Point m74221c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i, widthAlignment) * widthAlignment, Util.ceilDivide(i2, heightAlignment) * heightAlignment);
    }

    @RequiresApi(21)
    /* renamed from: d */
    private static boolean m74220d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point m74221c = m74221c(videoCapabilities, i, i2);
        int i3 = m74221c.x;
        int i4 = m74221c.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    /* renamed from: e */
    private static MediaCodecInfo.CodecProfileLevel[] m74219e(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            i = videoCapabilities.getBitrateRange().getUpper().intValue();
        } else {
            i = 0;
        }
        if (i >= 180000000) {
            i2 = 1024;
        } else if (i >= 120000000) {
            i2 = 512;
        } else if (i >= 60000000) {
            i2 = 256;
        } else if (i >= 30000000) {
            i2 = 128;
        } else if (i >= 18000000) {
            i2 = 64;
        } else if (i >= 12000000) {
            i2 = 32;
        } else if (i >= 7200000) {
            i2 = 16;
        } else if (i >= 3600000) {
            i2 = 8;
        } else if (i >= 1800000) {
            i2 = 4;
        } else if (i >= 800000) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i2;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    @RequiresApi(23)
    /* renamed from: f */
    private static int m74218f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    /* renamed from: g */
    private static boolean m74217g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Util.SDK_INT >= 19 && m74216h(codecCapabilities)) {
            return true;
        }
        return false;
    }

    @RequiresApi(19)
    /* renamed from: h */
    private static boolean m74216h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: i */
    private boolean m74215i(Format format, boolean z) {
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        if (codecProfileAndLevel == null) {
            return true;
        }
        int intValue = ((Integer) codecProfileAndLevel.first).intValue();
        int intValue2 = ((Integer) codecProfileAndLevel.second).intValue();
        if ("video/dolby-vision".equals(format.sampleMimeType)) {
            if ("video/avc".equals(this.mimeType)) {
                intValue = 8;
            } else {
                intValue = "video/hevc".equals(this.mimeType) ? 2 : 2;
            }
            intValue2 = 0;
        }
        if (!this.f33811a && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (Util.SDK_INT <= 23 && "video/x-vnd.on2.vp9".equals(this.mimeType) && profileLevels.length == 0) {
            profileLevels = m74219e(this.capabilities);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == intValue && ((codecProfileLevel.level >= intValue2 || !z) && !m74203u(this.mimeType, intValue))) {
                return true;
            }
        }
        m74208p("codec.profileLevel, " + format.codecs + ", " + this.codecMimeType);
        return false;
    }

    /* renamed from: j */
    private boolean m74214j(Format format) {
        if (!this.mimeType.equals(format.sampleMimeType) && !this.mimeType.equals(MediaCodecUtil.getAlternativeCodecMimeType(format))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private static boolean m74213k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Util.SDK_INT >= 21 && m74212l(codecCapabilities)) {
            return true;
        }
        return false;
    }

    @RequiresApi(21)
    /* renamed from: l */
    private static boolean m74212l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: m */
    private static boolean m74211m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Util.SDK_INT >= 21 && m74210n(codecCapabilities)) {
            return true;
        }
        return false;
    }

    @RequiresApi(21)
    /* renamed from: n */
    private static boolean m74210n(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (!z4 && codecCapabilities != null && m74217g(codecCapabilities) && !m74205s(str)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (codecCapabilities != null && m74211m(codecCapabilities)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z5 && (codecCapabilities == null || !m74213k(codecCapabilities))) {
            z8 = false;
        } else {
            z8 = true;
        }
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z8);
    }

    /* renamed from: o */
    private void m74209o(String str) {
        Log.m72608d("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + C21114v8.C21123i.f54139e);
    }

    /* renamed from: p */
    private void m74208p(String str) {
        Log.m72608d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + C21114v8.C21123i.f54139e);
    }

    /* renamed from: q */
    private static boolean m74207q(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: r */
    private static boolean m74206r(String str) {
        if (Util.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private static boolean m74205s(String str) {
        if (Util.SDK_INT <= 22) {
            String str2 = Util.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    private static boolean m74204t() {
        String str = Util.DEVICE;
        if (!str.equals("sabrina") && !str.equals("boreal")) {
            String str2 = Util.MODEL;
            if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u */
    private static boolean m74203u(String str, int i) {
        if ("video/hevc".equals(str) && 2 == i) {
            String str2 = Util.DEVICE;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    private static boolean m74202v(String str) {
        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Util.DEVICE)) {
            return false;
        }
        return true;
    }

    @Nullable
    @RequiresApi(21)
    public Point alignVideoSizeV21(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m74221c(videoCapabilities, i, i2);
    }

    public DecoderReuseEvaluation canReuseCodec(Format format, Format format2) {
        int i;
        int i2;
        if (!Util.areEqual(format.sampleMimeType, format2.sampleMimeType)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f33811a) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i |= 1024;
            }
            if (!this.adaptive && (format.width != format2.width || format.height != format2.height)) {
                i |= 512;
            }
            if (!Util.areEqual(format.colorInfo, format2.colorInfo)) {
                i |= 2048;
            }
            if (m74206r(this.name) && !format.initializationDataEquals(format2)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.name;
                if (format.initializationDataEquals(format2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new DecoderReuseEvaluation(str, format, format2, i2, 0);
            }
        } else {
            if (format.channelCount != format2.channelCount) {
                i |= 4096;
            }
            if (format.sampleRate != format2.sampleRate) {
                i |= 8192;
            }
            if (format.pcmEncoding != format2.pcmEncoding) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.mimeType)) {
                Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
                Pair<Integer, Integer> codecProfileAndLevel2 = MediaCodecUtil.getCodecProfileAndLevel(format2);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int intValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int intValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, format, format2, 3, 0);
                    }
                }
            }
            if (!format.initializationDataEquals(format2)) {
                i |= 32;
            }
            if (m74207q(this.mimeType)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.name, format, format2, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, format, format2, 0, i);
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Util.SDK_INT >= 23 && (codecCapabilities = this.capabilities) != null) {
            return m74218f(codecCapabilities);
        }
        return -1;
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }

    @RequiresApi(21)
    public boolean isAudioChannelCountSupportedV21(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            m74208p("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m74208p("channelCount.aCaps");
            return false;
        } else if (m74222b(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) < i) {
            m74208p("channelCount.support, " + i);
            return false;
        } else {
            return true;
        }
    }

    @RequiresApi(21)
    public boolean isAudioSampleRateSupportedV21(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            m74208p("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m74208p("sampleRate.aCaps");
            return false;
        } else if (!audioCapabilities.isSampleRateSupported(i)) {
            m74208p("sampleRate.support, " + i);
            return false;
        } else {
            return true;
        }
    }

    public boolean isFormatFunctionallySupported(Format format) {
        if (!m74214j(format) || !m74215i(format, false)) {
            return false;
        }
        return true;
    }

    public boolean isFormatSupported(Format format) throws MediaCodecUtil.DecoderQueryException {
        int i;
        boolean z = false;
        if (!m74214j(format) || !m74215i(format, true)) {
            return false;
        }
        if (this.f33811a) {
            int i2 = format.width;
            if (i2 <= 0 || (i = format.height) <= 0) {
                return true;
            }
            if (Util.SDK_INT >= 21) {
                return isVideoSizeAndRateSupportedV21(i2, i, format.frameRate);
            }
            if (i2 * i <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                z = true;
            }
            if (!z) {
                m74208p("legacyFrameSize, " + format.width + "x" + format.height);
            }
            return z;
        }
        if (Util.SDK_INT >= 21) {
            int i3 = format.sampleRate;
            if (i3 != -1 && !isAudioSampleRateSupportedV21(i3)) {
                return false;
            }
            int i4 = format.channelCount;
            if (i4 != -1 && !isAudioChannelCountSupportedV21(i4)) {
                return false;
            }
        }
        return true;
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (Util.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.mimeType)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
        if (this.f33811a) {
            return this.adaptive;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    @RequiresApi(21)
    public boolean isVideoSizeAndRateSupportedV21(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            m74208p("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m74208p("sizeAndRate.vCaps");
            return false;
        }
        if (Util.SDK_INT >= 29) {
            int areResolutionAndFrameRateCovered = Api29.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
            if (areResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (areResolutionAndFrameRateCovered == 1) {
                m74208p("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        if (!m74220d(videoCapabilities, i, i2, d)) {
            if (i < i2 && m74202v(this.name) && m74220d(videoCapabilities, i2, i, d)) {
                m74209o("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
            } else {
                m74208p("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return this.name;
    }

    @Deprecated
    public boolean isSeamlessAdaptationSupported(Format format, Format format2, boolean z) {
        if (!z && format.colorInfo != null && format2.colorInfo == null) {
            format2 = format2.buildUpon().setColorInfo(format.colorInfo).build();
        }
        int i = canReuseCodec(format, format2).result;
        return i == 2 || i == 3;
    }
}
