package io.bidmachine.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableMap;
import io.bidmachine.media3.common.MediaItem;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

@UnstableApi
/* loaded from: classes9.dex */
public final class CmcdConfiguration {
    public static final String KEY_BITRATE = "br";
    public static final String KEY_BUFFER_LENGTH = "bl";
    public static final String KEY_CMCD_OBJECT = "CMCD-Object";
    public static final String KEY_CMCD_REQUEST = "CMCD-Request";
    public static final String KEY_CMCD_SESSION = "CMCD-Session";
    public static final String KEY_CMCD_STATUS = "CMCD-Status";
    public static final String KEY_CONTENT_ID = "cid";
    public static final String KEY_MAXIMUM_REQUESTED_BITRATE = "rtp";
    public static final String KEY_SESSION_ID = "sid";
    public static final int MAX_ID_LENGTH = 64;
    @Nullable
    public final String contentId;
    public final RequestConfig requestConfig;
    @Nullable
    public final String sessionId;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface CmcdKey {
    }

    /* loaded from: classes9.dex */
    public interface Factory {
        public static final Factory DEFAULT = new Factory() { // from class: io.bidmachine.media3.exoplayer.upstream.b
            @Override // io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration.Factory
            public final CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
                CmcdConfiguration lambda$static$0;
                lambda$static$0 = CmcdConfiguration.Factory.lambda$static$0(mediaItem);
                return lambda$static$0;
            }
        };

        /* renamed from: io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration$Factory$a */
        /* loaded from: classes9.dex */
        public class C36454a implements RequestConfig {
            C36454a() {
            }

            @Override // io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig
            public /* bridge */ /* synthetic */ ImmutableMap getCustomData() {
                return super.getCustomData();
            }

            @Override // io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig
            public /* bridge */ /* synthetic */ int getRequestedMaximumThroughputKbps(int i) {
                return super.getRequestedMaximumThroughputKbps(i);
            }

            @Override // io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig
            public /* bridge */ /* synthetic */ boolean isKeyAllowed(String str) {
                return super.isKeyAllowed(str);
            }
        }

        static /* synthetic */ CmcdConfiguration lambda$static$0(MediaItem mediaItem) {
            String uuid = UUID.randomUUID().toString();
            String str = mediaItem.mediaId;
            if (str == null) {
                str = "";
            }
            return new CmcdConfiguration(uuid, str, new C36454a());
        }

        CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface HeaderKey {
    }

    /* loaded from: classes9.dex */
    public interface RequestConfig {
        default ImmutableMap<String, String> getCustomData() {
            return ImmutableMap.m69397of();
        }

        default int getRequestedMaximumThroughputKbps(int i) {
            return -2147483647;
        }

        default boolean isKeyAllowed(String str) {
            return true;
        }
    }

    public CmcdConfiguration(@Nullable String str, @Nullable String str2, RequestConfig requestConfig) {
        boolean z;
        boolean z2 = false;
        if (str != null && str.length() > 64) {
            z = false;
        } else {
            z = true;
        }
        Assertions.checkArgument(z);
        Assertions.checkArgument((str2 == null || str2.length() <= 64) ? true : z2);
        Assertions.checkNotNull(requestConfig);
        this.sessionId = str;
        this.contentId = str2;
        this.requestConfig = requestConfig;
    }

    public boolean isBitrateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("br");
    }

    public boolean isBufferLengthLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("bl");
    }

    public boolean isContentIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("cid");
    }

    public boolean isMaximumRequestThroughputLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("rtp");
    }

    public boolean isSessionIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("sid");
    }
}
