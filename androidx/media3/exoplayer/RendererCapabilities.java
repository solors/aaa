package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public interface RendererCapabilities {
    public static final int ADAPTIVE_NOT_SEAMLESS = 8;
    public static final int ADAPTIVE_NOT_SUPPORTED = 0;
    public static final int ADAPTIVE_SEAMLESS = 16;
    public static final int ADAPTIVE_SUPPORT_MASK = 24;
    public static final int AUDIO_OFFLOAD_GAPLESS_SUPPORTED = 1024;
    public static final int AUDIO_OFFLOAD_NOT_SUPPORTED = 0;
    public static final int AUDIO_OFFLOAD_SPEED_CHANGE_SUPPORTED = 2048;
    public static final int AUDIO_OFFLOAD_SUPPORTED = 512;
    public static final int AUDIO_OFFLOAD_SUPPORT_MASK = 3584;
    public static final int DECODER_SUPPORT_FALLBACK = 0;
    public static final int DECODER_SUPPORT_FALLBACK_MIMETYPE = 256;
    public static final int DECODER_SUPPORT_MASK = 384;
    public static final int DECODER_SUPPORT_PRIMARY = 128;
    @Deprecated
    public static final int FORMAT_EXCEEDS_CAPABILITIES = 3;
    @Deprecated
    public static final int FORMAT_HANDLED = 4;
    public static final int FORMAT_SUPPORT_MASK = 7;
    @Deprecated
    public static final int FORMAT_UNSUPPORTED_DRM = 2;
    @Deprecated
    public static final int FORMAT_UNSUPPORTED_SUBTYPE = 1;
    @Deprecated
    public static final int FORMAT_UNSUPPORTED_TYPE = 0;
    public static final int HARDWARE_ACCELERATION_NOT_SUPPORTED = 0;
    public static final int HARDWARE_ACCELERATION_SUPPORTED = 64;
    public static final int HARDWARE_ACCELERATION_SUPPORT_MASK = 64;
    public static final int TUNNELING_NOT_SUPPORTED = 0;
    public static final int TUNNELING_SUPPORTED = 32;
    public static final int TUNNELING_SUPPORT_MASK = 32;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AdaptiveSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface AudioOffloadSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Capabilities {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface DecoderSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface FormatSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface HardwareAccelerationSupport {
    }

    /* loaded from: classes2.dex */
    public interface Listener {
        void onRendererCapabilitiesChanged(Renderer renderer);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface TunnelingSupport {
    }

    @SuppressLint({"WrongConstant"})
    static int create(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    @SuppressLint({"WrongConstant"})
    static int getAdaptiveSupport(int i) {
        return i & 24;
    }

    @SuppressLint({"WrongConstant"})
    static int getAudioOffloadSupport(int i) {
        return i & AUDIO_OFFLOAD_SUPPORT_MASK;
    }

    @SuppressLint({"WrongConstant"})
    static int getDecoderSupport(int i) {
        return i & 384;
    }

    @SuppressLint({"WrongConstant"})
    static int getFormatSupport(int i) {
        return i & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int getHardwareAccelerationSupport(int i) {
        return i & 64;
    }

    @SuppressLint({"WrongConstant"})
    static int getTunnelingSupport(int i) {
        return i & 32;
    }

    String getName();

    int getTrackType();

    int supportsFormat(Format format) throws ExoPlaybackException;

    int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException;

    static int create(int i) {
        return create(i, 0, 0, 0);
    }

    static int create(int i, int i2, int i3) {
        return create(i, i2, i3, 0, 128, 0);
    }

    static int create(int i, int i2, int i3, int i4) {
        return create(i, i2, i3, 0, 128, i4);
    }

    static int create(int i, int i2, int i3, int i4, int i5) {
        return create(i, i2, i3, i4, i5, 0);
    }

    default void clearListener() {
    }

    default void setListener(Listener listener) {
    }
}
