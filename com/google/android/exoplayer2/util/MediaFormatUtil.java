package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.ColorInfo;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class MediaFormatUtil {
    public static final String KEY_MAX_BIT_RATE = "max-bitrate";
    public static final String KEY_PCM_ENCODING_EXTENDED = "exo-pcm-encoding-int";
    public static final String KEY_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";

    private MediaFormatUtil() {
    }

    /* renamed from: a */
    private static boolean m72596a(int i) {
        if (i == 2 || i == 1 || i == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m72595b(int i) {
        if (i == 2 || i == 1 || i == 6 || i == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m72594c(int i) {
        if (i != 3 && i != 6 && i != 7 && i != -1) {
            return false;
        }
        return true;
    }

    @SuppressLint({"InlinedApi"})
    public static MediaFormat createMediaFormatFromFormat(Format format) {
        MediaFormat mediaFormat = new MediaFormat();
        maybeSetInteger(mediaFormat, MediaFile.BITRATE, format.bitrate);
        maybeSetInteger(mediaFormat, "max-bitrate", format.peakBitrate);
        maybeSetInteger(mediaFormat, "channel-count", format.channelCount);
        maybeSetColorInfo(mediaFormat, format.colorInfo);
        maybeSetString(mediaFormat, "mime", format.sampleMimeType);
        maybeSetString(mediaFormat, "codecs-string", format.codecs);
        maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        maybeSetInteger(mediaFormat, "width", format.width);
        maybeSetInteger(mediaFormat, "height", format.height);
        setCsdBuffers(mediaFormat, format.initializationData);
        m72593d(mediaFormat, format.pcmEncoding);
        maybeSetString(mediaFormat, "language", format.language);
        maybeSetInteger(mediaFormat, "max-input-size", format.maxInputSize);
        maybeSetInteger(mediaFormat, "sample-rate", format.sampleRate);
        maybeSetInteger(mediaFormat, "caption-service-number", format.accessibilityChannel);
        mediaFormat.setInteger("rotation-degrees", format.rotationDegrees);
        int i = format.selectionFlags;
        m72591f(mediaFormat, "is-autoselect", i & 4);
        m72591f(mediaFormat, "is-default", i & 1);
        m72591f(mediaFormat, "is-forced-subtitle", i & 2);
        mediaFormat.setInteger("encoder-delay", format.encoderDelay);
        mediaFormat.setInteger("encoder-padding", format.encoderPadding);
        m72592e(mediaFormat, format.pixelWidthHeightRatio);
        return mediaFormat;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: d */
    private static void m72593d(MediaFormat mediaFormat, int i) {
        int i2;
        if (i == -1) {
            return;
        }
        maybeSetInteger(mediaFormat, "exo-pcm-encoding-int", i);
        if (i != 0) {
            if (i != 536870912) {
                if (i != 805306368) {
                    i2 = 2;
                    if (i != 2) {
                        i2 = 3;
                        if (i != 3) {
                            i2 = 4;
                            if (i != 4) {
                                return;
                            }
                        }
                    }
                } else {
                    i2 = 22;
                }
            } else {
                i2 = 21;
            }
        } else {
            i2 = 0;
        }
        mediaFormat.setInteger("pcm-encoding", i2);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: e */
    private static void m72592e(MediaFormat mediaFormat, float f) {
        int i;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f);
        int i2 = 1073741824;
        if (f < 1.0f) {
            i2 = (int) (f * 1073741824);
            i = 1073741824;
        } else if (f > 1.0f) {
            i = (int) (1073741824 / f);
        } else {
            i2 = 1;
            i = 1;
        }
        mediaFormat.setInteger("sar-width", i2);
        mediaFormat.setInteger("sar-height", i);
    }

    /* renamed from: f */
    private static void m72591f(MediaFormat mediaFormat, String str, int i) {
        int i2;
        if (i != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        mediaFormat.setInteger(str, i2);
    }

    public static byte[] getArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Nullable
    public static ColorInfo getColorInfo(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int integer3;
        byte[] bArr;
        if (Util.SDK_INT >= 29) {
            integer = mediaFormat.getInteger("color-standard", -1);
            integer2 = mediaFormat.getInteger("color-range", -1);
            integer3 = mediaFormat.getInteger("color-transfer", -1);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            if (byteBuffer != null) {
                bArr = getArray(byteBuffer);
            } else {
                bArr = null;
            }
            if (!m72595b(integer)) {
                integer = -1;
            }
            if (!m72596a(integer2)) {
                integer2 = -1;
            }
            if (!m72594c(integer3)) {
                integer3 = -1;
            }
            if (integer == -1 && integer2 == -1 && integer3 == -1 && bArr == null) {
                return null;
            }
            return new ColorInfo(integer, integer2, integer3, bArr);
        }
        return null;
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, @Nullable ColorInfo colorInfo) {
        if (colorInfo != null) {
            maybeSetInteger(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            maybeSetInteger(mediaFormat, "color-standard", colorInfo.colorSpace);
            maybeSetInteger(mediaFormat, "color-range", colorInfo.colorRange);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void maybeSetString(MediaFormat mediaFormat, String str, @Nullable String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
