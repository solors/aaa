package androidx.media3.common;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.InlineMe;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

/* renamed from: androidx.media3.common.C */
/* loaded from: classes.dex */
public final class C2100C {
    public static final int ALLOW_CAPTURE_BY_ALL = 1;
    public static final int ALLOW_CAPTURE_BY_NONE = 3;
    public static final int ALLOW_CAPTURE_BY_SYSTEM = 2;
    public static final int AUDIO_CONTENT_TYPE_MOVIE = 3;
    public static final int AUDIO_CONTENT_TYPE_MUSIC = 2;
    public static final int AUDIO_CONTENT_TYPE_SONIFICATION = 4;
    public static final int AUDIO_CONTENT_TYPE_SPEECH = 1;
    public static final int AUDIO_CONTENT_TYPE_UNKNOWN = 0;
    @UnstableApi
    public static final int AUDIO_SESSION_ID_UNSET = 0;
    @UnstableApi
    public static final int BITS_PER_BYTE = 8;
    @UnstableApi
    @Deprecated
    public static final int BUFFER_FLAG_DECODE_ONLY = Integer.MIN_VALUE;
    @UnstableApi
    public static final int BUFFER_FLAG_ENCRYPTED = 1073741824;
    @UnstableApi
    public static final int BUFFER_FLAG_END_OF_STREAM = 4;
    @UnstableApi
    public static final int BUFFER_FLAG_FIRST_SAMPLE = 134217728;
    @UnstableApi
    public static final int BUFFER_FLAG_HAS_SUPPLEMENTAL_DATA = 268435456;
    @UnstableApi
    public static final int BUFFER_FLAG_KEY_FRAME = 1;
    @UnstableApi
    public static final int BUFFER_FLAG_LAST_SAMPLE = 536870912;
    @UnstableApi
    public static final int BYTES_PER_FLOAT = 4;
    @UnstableApi
    public static final String CENC_TYPE_cbc1 = "cbc1";
    @UnstableApi
    public static final String CENC_TYPE_cbcs = "cbcs";
    @UnstableApi
    public static final String CENC_TYPE_cenc = "cenc";
    @UnstableApi
    public static final String CENC_TYPE_cens = "cens";
    @UnstableApi
    public static final int COLOR_RANGE_FULL = 1;
    @UnstableApi
    public static final int COLOR_RANGE_LIMITED = 2;
    @UnstableApi
    public static final int COLOR_SPACE_BT2020 = 6;
    @UnstableApi
    public static final int COLOR_SPACE_BT601 = 2;
    @UnstableApi
    public static final int COLOR_SPACE_BT709 = 1;
    @UnstableApi
    public static final int COLOR_TRANSFER_GAMMA_2_2 = 10;
    @UnstableApi
    public static final int COLOR_TRANSFER_HLG = 7;
    @UnstableApi
    public static final int COLOR_TRANSFER_LINEAR = 1;
    @UnstableApi
    public static final int COLOR_TRANSFER_SDR = 3;
    @UnstableApi
    public static final int COLOR_TRANSFER_SRGB = 2;
    @UnstableApi
    public static final int COLOR_TRANSFER_ST2084 = 6;
    public static final int CONTENT_TYPE_DASH = 0;
    public static final int CONTENT_TYPE_HLS = 2;
    @UnstableApi
    @Deprecated
    public static final int CONTENT_TYPE_MOVIE = 3;
    @UnstableApi
    @Deprecated
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_OTHER = 4;
    public static final int CONTENT_TYPE_RTSP = 3;
    @UnstableApi
    @Deprecated
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    @UnstableApi
    @Deprecated
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_SS = 1;
    @UnstableApi
    @Deprecated
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    @UnstableApi
    public static final int CRYPTO_MODE_AES_CBC = 2;
    @UnstableApi
    public static final int CRYPTO_MODE_AES_CTR = 1;
    @UnstableApi
    public static final int CRYPTO_MODE_UNENCRYPTED = 0;
    public static final int CRYPTO_TYPE_CUSTOM_BASE = 10000;
    public static final int CRYPTO_TYPE_FRAMEWORK = 2;
    public static final int CRYPTO_TYPE_NONE = 0;
    public static final int CRYPTO_TYPE_UNSUPPORTED = 1;
    @UnstableApi
    public static final int DATA_TYPE_AD = 6;
    @UnstableApi
    public static final int DATA_TYPE_CUSTOM_BASE = 10000;
    @UnstableApi
    public static final int DATA_TYPE_DRM = 3;
    @UnstableApi
    public static final int DATA_TYPE_MANIFEST = 4;
    @UnstableApi
    public static final int DATA_TYPE_MEDIA = 1;
    @UnstableApi
    public static final int DATA_TYPE_MEDIA_INITIALIZATION = 2;
    @UnstableApi
    public static final int DATA_TYPE_MEDIA_PROGRESSIVE_LIVE = 7;
    @UnstableApi
    public static final int DATA_TYPE_TIME_SYNCHRONIZATION = 5;
    @UnstableApi
    public static final int DATA_TYPE_UNKNOWN = 0;
    @UnstableApi
    public static final int DEFAULT_BUFFER_SEGMENT_SIZE = 65536;
    public static final long DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS = 3000;
    public static final long DEFAULT_SEEK_BACK_INCREMENT_MS = 5000;
    public static final long DEFAULT_SEEK_FORWARD_INCREMENT_MS = 15000;
    @UnstableApi
    public static final int ENCODING_AAC_ELD = 15;
    @UnstableApi
    public static final int ENCODING_AAC_ER_BSAC = 1073741824;
    @UnstableApi
    public static final int ENCODING_AAC_HE_V1 = 11;
    @UnstableApi
    public static final int ENCODING_AAC_HE_V2 = 12;
    @UnstableApi
    public static final int ENCODING_AAC_LC = 10;
    @UnstableApi
    public static final int ENCODING_AAC_XHE = 16;
    @UnstableApi
    public static final int ENCODING_AC3 = 5;
    @UnstableApi
    public static final int ENCODING_AC4 = 17;
    @UnstableApi
    public static final int ENCODING_DOLBY_TRUEHD = 14;
    @UnstableApi
    public static final int ENCODING_DTS = 7;
    @UnstableApi
    public static final int ENCODING_DTS_HD = 8;
    @UnstableApi
    public static final int ENCODING_DTS_UHD_P2 = 30;
    @UnstableApi
    public static final int ENCODING_E_AC3 = 6;
    @UnstableApi
    public static final int ENCODING_E_AC3_JOC = 18;
    @UnstableApi
    public static final int ENCODING_INVALID = 0;
    @UnstableApi
    public static final int ENCODING_MP3 = 9;
    @UnstableApi
    public static final int ENCODING_OPUS = 20;
    @UnstableApi
    public static final int ENCODING_PCM_16BIT = 2;
    @UnstableApi
    public static final int ENCODING_PCM_16BIT_BIG_ENDIAN = 268435456;
    @UnstableApi
    public static final int ENCODING_PCM_24BIT = 536870912;
    @UnstableApi
    public static final int ENCODING_PCM_24BIT_BIG_ENDIAN = 1342177280;
    @UnstableApi
    public static final int ENCODING_PCM_32BIT = 805306368;
    @UnstableApi
    public static final int ENCODING_PCM_32BIT_BIG_ENDIAN = 1610612736;
    @UnstableApi
    public static final int ENCODING_PCM_8BIT = 3;
    @UnstableApi
    public static final int ENCODING_PCM_FLOAT = 4;
    @UnstableApi
    public static final int FIRST_FRAME_NOT_RENDERED = 1;
    @UnstableApi
    public static final int FIRST_FRAME_NOT_RENDERED_AFTER_STREAM_CHANGE = 2;
    @UnstableApi
    public static final int FIRST_FRAME_NOT_RENDERED_ONLY_ALLOWED_IF_STARTED = 0;
    @UnstableApi
    public static final int FIRST_FRAME_RENDERED = 3;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    @UnstableApi
    public static final int FORMAT_EXCEEDS_CAPABILITIES = 3;
    @UnstableApi
    public static final int FORMAT_HANDLED = 4;
    @UnstableApi
    public static final int FORMAT_UNSUPPORTED_DRM = 2;
    @UnstableApi
    public static final int FORMAT_UNSUPPORTED_SUBTYPE = 1;
    @UnstableApi
    public static final int FORMAT_UNSUPPORTED_TYPE = 0;
    public static final int INDEX_UNSET = -1;
    public static final String LANGUAGE_UNDETERMINED = "und";
    public static final int LENGTH_UNSET = -1;
    @UnstableApi
    public static final int MEDIA_CODEC_PRIORITY_NON_REALTIME = 1;
    @UnstableApi
    public static final int MEDIA_CODEC_PRIORITY_REALTIME = 0;
    @UnstableApi
    public static final long MICROS_PER_SECOND = 1000000;
    @UnstableApi
    public static final long MILLIS_PER_SECOND = 1000;
    @UnstableApi
    public static final long NANOS_PER_SECOND = 1000000000;
    @UnstableApi
    public static final int NETWORK_TYPE_2G = 3;
    @UnstableApi
    public static final int NETWORK_TYPE_3G = 4;
    @UnstableApi
    public static final int NETWORK_TYPE_4G = 5;
    @UnstableApi
    public static final int NETWORK_TYPE_5G_NSA = 10;
    @UnstableApi
    public static final int NETWORK_TYPE_5G_SA = 9;
    @UnstableApi
    public static final int NETWORK_TYPE_CELLULAR_UNKNOWN = 6;
    @UnstableApi
    public static final int NETWORK_TYPE_ETHERNET = 7;
    @UnstableApi
    public static final int NETWORK_TYPE_OFFLINE = 1;
    @UnstableApi
    public static final int NETWORK_TYPE_OTHER = 8;
    @UnstableApi
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    @UnstableApi
    public static final int NETWORK_TYPE_WIFI = 2;
    @UnstableApi
    public static final int PERCENTAGE_UNSET = -1;
    @UnstableApi
    @Deprecated
    public static final int POSITION_UNSET = -1;
    @UnstableApi
    public static final int PRIORITY_DOWNLOAD = -1000;
    @UnstableApi
    public static final int PRIORITY_PLAYBACK = 0;
    @UnstableApi
    public static final int PROJECTION_CUBEMAP = 2;
    @UnstableApi
    public static final int PROJECTION_EQUIRECTANGULAR = 1;
    @UnstableApi
    public static final int PROJECTION_MESH = 3;
    @UnstableApi
    public static final int PROJECTION_RECTANGULAR = 0;
    public static final float RATE_UNSET = -3.4028235E38f;
    @UnstableApi
    public static final int RATE_UNSET_INT = -2147483647;
    @UnstableApi
    public static final int RESULT_BUFFER_READ = -4;
    @UnstableApi
    public static final int RESULT_END_OF_INPUT = -1;
    @UnstableApi
    public static final int RESULT_FORMAT_READ = -5;
    @UnstableApi
    public static final int RESULT_MAX_LENGTH_EXCEEDED = -2;
    @UnstableApi
    public static final int RESULT_NOTHING_READ = -3;
    public static final int ROLE_FLAG_ALTERNATE = 2;
    public static final int ROLE_FLAG_CAPTION = 64;
    public static final int ROLE_FLAG_COMMENTARY = 8;
    public static final int ROLE_FLAG_DESCRIBES_MUSIC_AND_SOUND = 1024;
    public static final int ROLE_FLAG_DESCRIBES_VIDEO = 512;
    public static final int ROLE_FLAG_DUB = 16;
    public static final int ROLE_FLAG_EASY_TO_READ = 8192;
    public static final int ROLE_FLAG_EMERGENCY = 32;
    public static final int ROLE_FLAG_ENHANCED_DIALOG_INTELLIGIBILITY = 2048;
    public static final int ROLE_FLAG_MAIN = 1;
    public static final int ROLE_FLAG_SIGN = 256;
    public static final int ROLE_FLAG_SUBTITLE = 128;
    public static final int ROLE_FLAG_SUPPLEMENTARY = 4;
    public static final int ROLE_FLAG_TRANSCRIBES_DIALOG = 4096;
    public static final int ROLE_FLAG_TRICK_PLAY = 16384;
    @UnstableApi
    public static final String SANS_SERIF_NAME = "sans-serif";
    public static final int SELECTION_FLAG_AUTOSELECT = 4;
    public static final int SELECTION_FLAG_DEFAULT = 1;
    public static final int SELECTION_FLAG_FORCED = 2;
    @UnstableApi
    public static final int SELECTION_REASON_ADAPTIVE = 3;
    @UnstableApi
    public static final int SELECTION_REASON_CUSTOM_BASE = 10000;
    @UnstableApi
    public static final int SELECTION_REASON_INITIAL = 1;
    @UnstableApi
    public static final int SELECTION_REASON_MANUAL = 2;
    @UnstableApi
    public static final int SELECTION_REASON_TRICK_PLAY = 4;
    @UnstableApi
    public static final int SELECTION_REASON_UNKNOWN = 0;
    @UnstableApi
    public static final String SERIF_NAME = "serif";
    public static final int SPATIALIZATION_BEHAVIOR_AUTO = 0;
    public static final int SPATIALIZATION_BEHAVIOR_NEVER = 1;
    @UnstableApi
    public static final String SSAI_SCHEME = "ssai";
    @UnstableApi
    public static final int STEREO_MODE_LEFT_RIGHT = 2;
    @UnstableApi
    public static final int STEREO_MODE_MONO = 0;
    @UnstableApi
    public static final int STEREO_MODE_STEREO_MESH = 3;
    @UnstableApi
    public static final int STEREO_MODE_TOP_BOTTOM = 1;
    @UnstableApi
    public static final int STREAM_TYPE_ALARM = 4;
    @UnstableApi
    public static final int STREAM_TYPE_DEFAULT = 3;
    @UnstableApi
    public static final int STREAM_TYPE_DTMF = 8;
    @UnstableApi
    public static final int STREAM_TYPE_MUSIC = 3;
    @UnstableApi
    public static final int STREAM_TYPE_NOTIFICATION = 5;
    @UnstableApi
    public static final int STREAM_TYPE_RING = 2;
    @UnstableApi
    public static final int STREAM_TYPE_SYSTEM = 1;
    @UnstableApi
    public static final int STREAM_TYPE_VOICE_CALL = 0;
    public static final long TIME_END_OF_SOURCE = Long.MIN_VALUE;
    public static final long TIME_UNSET = -9223372036854775807L;
    public static final int TRACK_TYPE_AUDIO = 1;
    public static final int TRACK_TYPE_CAMERA_MOTION = 6;
    public static final int TRACK_TYPE_CUSTOM_BASE = 10000;
    public static final int TRACK_TYPE_DEFAULT = 0;
    public static final int TRACK_TYPE_IMAGE = 4;
    public static final int TRACK_TYPE_METADATA = 5;
    public static final int TRACK_TYPE_NONE = -2;
    public static final int TRACK_TYPE_TEXT = 3;
    public static final int TRACK_TYPE_UNKNOWN = -1;
    public static final int TRACK_TYPE_VIDEO = 2;
    @UnstableApi
    @Deprecated
    public static final int TYPE_DASH = 0;
    @UnstableApi
    @Deprecated
    public static final int TYPE_HLS = 2;
    @UnstableApi
    @Deprecated
    public static final int TYPE_OTHER = 4;
    @UnstableApi
    @Deprecated
    public static final int TYPE_RTSP = 3;
    @UnstableApi
    @Deprecated
    public static final int TYPE_SS = 1;
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    @UnstableApi
    public static final int VIDEO_CHANGE_FRAME_RATE_STRATEGY_OFF = Integer.MIN_VALUE;
    @UnstableApi
    public static final int VIDEO_CHANGE_FRAME_RATE_STRATEGY_ONLY_IF_SEAMLESS = 0;
    @UnstableApi
    public static final int VIDEO_OUTPUT_MODE_NONE = -1;
    @UnstableApi
    public static final int VIDEO_OUTPUT_MODE_SURFACE_YUV = 1;
    @UnstableApi
    public static final int VIDEO_OUTPUT_MODE_YUV = 0;
    @UnstableApi
    public static final int VIDEO_SCALING_MODE_DEFAULT = 1;
    @UnstableApi
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    @UnstableApi
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    public static final int VOLUME_FLAG_ALLOW_RINGER_MODES = 2;
    public static final int VOLUME_FLAG_PLAY_SOUND = 4;
    public static final int VOLUME_FLAG_REMOVE_SOUND_AND_VIBRATE = 8;
    public static final int VOLUME_FLAG_SHOW_UI = 1;
    public static final int VOLUME_FLAG_VIBRATE = 16;
    public static final int WAKE_MODE_LOCAL = 1;
    public static final int WAKE_MODE_NETWORK = 2;
    public static final int WAKE_MODE_NONE = 0;
    public static final UUID UUID_NIL = new UUID(0, 0);
    public static final UUID COMMON_PSSH_UUID = new UUID(1186680826959645954L, -5988876978535335093L);
    public static final UUID CLEARKEY_UUID = new UUID(-2129748144642739255L, 8654423357094679310L);
    public static final UUID WIDEVINE_UUID = new UUID(-1301668207276963122L, -6645017420763422227L);
    public static final UUID PLAYREADY_UUID = new UUID(-7348484286925749626L, -6083546864340672619L);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$AudioAllowedCapturePolicy */
    /* loaded from: classes.dex */
    public @interface AudioAllowedCapturePolicy {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$AudioContentType */
    /* loaded from: classes.dex */
    public @interface AudioContentType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$AudioFlags */
    /* loaded from: classes.dex */
    public @interface AudioFlags {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$AudioUsage */
    /* loaded from: classes.dex */
    public @interface AudioUsage {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$BufferFlags */
    /* loaded from: classes.dex */
    public @interface BufferFlags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$ColorRange */
    /* loaded from: classes.dex */
    public @interface ColorRange {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$ColorSpace */
    /* loaded from: classes.dex */
    public @interface ColorSpace {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$ColorTransfer */
    /* loaded from: classes.dex */
    public @interface ColorTransfer {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$ContentType */
    /* loaded from: classes.dex */
    public @interface ContentType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$CryptoMode */
    /* loaded from: classes.dex */
    public @interface CryptoMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$CryptoType */
    /* loaded from: classes.dex */
    public @interface CryptoType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$DataType */
    /* loaded from: classes.dex */
    public @interface DataType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$Encoding */
    /* loaded from: classes.dex */
    public @interface Encoding {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$FirstFrameState */
    /* loaded from: classes.dex */
    public @interface FirstFrameState {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$FormatSupport */
    /* loaded from: classes.dex */
    public @interface FormatSupport {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$NetworkType */
    /* loaded from: classes.dex */
    public @interface NetworkType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$PcmEncoding */
    /* loaded from: classes.dex */
    public @interface PcmEncoding {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$Projection */
    /* loaded from: classes.dex */
    public @interface Projection {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$RoleFlags */
    /* loaded from: classes.dex */
    public @interface RoleFlags {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$SelectionFlags */
    /* loaded from: classes.dex */
    public @interface SelectionFlags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$SelectionReason */
    /* loaded from: classes.dex */
    public @interface SelectionReason {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$SpatializationBehavior */
    /* loaded from: classes.dex */
    public @interface SpatializationBehavior {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$StereoMode */
    /* loaded from: classes.dex */
    public @interface StereoMode {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @SuppressLint({"UniqueConstants"})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$StreamType */
    /* loaded from: classes.dex */
    public @interface StreamType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$TrackType */
    /* loaded from: classes.dex */
    public @interface TrackType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$VideoChangeFrameRateStrategy */
    /* loaded from: classes.dex */
    public @interface VideoChangeFrameRateStrategy {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$VideoOutputMode */
    /* loaded from: classes.dex */
    public @interface VideoOutputMode {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @SuppressLint({"UniqueConstants"})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    /* renamed from: androidx.media3.common.C$VideoScalingMode */
    /* loaded from: classes.dex */
    public @interface VideoScalingMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$VolumeFlags */
    /* loaded from: classes.dex */
    public @interface VolumeFlags {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.C$WakeMode */
    /* loaded from: classes.dex */
    public @interface WakeMode {
    }

    private C2100C() {
    }

    @Deprecated
    @InlineMe(imports = {"androidx.media3.common.util.Util"}, replacement = "Util.generateAudioSessionIdV21(context)")
    @RequiresApi(21)
    @UnstableApi
    public static int generateAudioSessionIdV21(Context context) {
        return Util.generateAudioSessionIdV21(context);
    }

    @InlineMe(imports = {"androidx.media3.common.util.Util"}, replacement = "Util.getErrorCodeForMediaDrmErrorCode(mediaDrmErrorCode)")
    @UnstableApi
    @Deprecated
    public static int getErrorCodeForMediaDrmErrorCode(int i) {
        return Util.getErrorCodeForMediaDrmErrorCode(i);
    }

    @InlineMe(imports = {"androidx.media3.common.util.Util"}, replacement = "Util.getFormatSupportString(formatSupport)")
    @UnstableApi
    @Deprecated
    public static String getFormatSupportString(int i) {
        return Util.getFormatSupportString(i);
    }

    @InlineMe(imports = {"androidx.media3.common.util.Util"}, replacement = "Util.msToUs(timeMs)")
    @UnstableApi
    @Deprecated
    public static long msToUs(long j) {
        return Util.msToUs(j);
    }

    @InlineMe(imports = {"androidx.media3.common.util.Util"}, replacement = "Util.usToMs(timeUs)")
    @UnstableApi
    @Deprecated
    public static long usToMs(long j) {
        return Util.usToMs(j);
    }
}
