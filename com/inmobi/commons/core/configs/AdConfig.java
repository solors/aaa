package com.inmobi.commons.core.configs;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.inmobi.media.AbstractC18975J3;
import com.inmobi.media.AbstractC19225c2;
import com.inmobi.media.C18885Cb;
import com.inmobi.media.C19168Y;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.C38513v;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class AdConfig extends Config {
    @NotNull
    private static final String ALLOWED_CONTENT_TYPE = "allowedContentType";
    @NotNull
    public static final C18840b Companion = new C18840b();
    public static final long DEFAULT_AD_LOAD_RETRY_INTERVAL = 1000;
    public static final boolean DEFAULT_AD_QUALITY_KILL_SWITCH = true;
    public static final int DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE = 153600;
    public static final int DEFAULT_AD_QUALITY_MAX_RETRIES = 3;
    public static final int DEFAULT_AD_QUALITY_RESIZE_PERCENTAGE = 100;
    public static final int DEFAULT_AD_QUALITY_RETRY_INTERVAL = 5000;
    public static final boolean DEFAULT_AD_REPORT_KILL_SWITCH = true;
    public static final int DEFAULT_AD_REPORT_LIST_SIZE = 10;
    @NotNull
    public static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    public static final boolean DEFAULT_CCT_ENABLED = false;
    public static final int DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME = 86400;
    public static final int DEFAULT_CONTEXTUAL_DATA_MAX_RECORDS = 1;
    @NotNull
    private static final List<String> DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS;
    public static final int DEFAULT_MAX_POOL_SIZE = 10;
    public static final int DEFAULT_MINIMUM_AUDIO_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MIN_VOLUME_AUDIO_REQUEST = 30;
    public static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
    public static final int DEFAULT_REFRESH_INTERVAL = 60;
    public static final int DEFAULT_TOUCH_RESET_TIME = 4;
    public static final boolean DEFAULT_WATERMARK_KILL_SWITCH = true;
    @NotNull
    private static final String GESTURE_LIST = "gestures";
    public static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
    public static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
    public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
    @NotNull
    private static final String SKIP_FIELDS = "skipFields";
    @NotNull
    private AdQualityConfig adQuality;
    @NotNull
    private AdReportConfig adReport;
    @Nullable
    private C19168Y adReqDeprecateChecker;
    private boolean applyGzipReq;
    @NotNull
    private AssetCacheConfig assetCache;
    @NotNull
    private AudioConfig audio;
    @NotNull
    private Map<String, CacheConfig> cache;
    private boolean cctEnabled;
    @NotNull
    private ContextualDataConfig contextualData;
    private int defaultRefreshInterval;
    @Nullable
    private String deprecate;
    @NotNull
    private ImaiConfig imai;
    private int maxPoolSize;
    private int minimumRefreshInterval;
    @NotNull
    private MraidConfig mraid;
    @NotNull
    private RenderingConfig rendering;
    private boolean skipNetCheckHB;
    @NotNull
    private C18885Cb timeouts;
    @NotNull
    private String url;
    @NotNull
    private VastVideoConfig vastVideo;
    @NotNull
    private ViewabilityConfig viewability;
    private boolean watermarkEnabled;
    @NotNull
    private WebAssetCacheConfig webAssetCache;

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class AdQualityConfig {
        private boolean enabled = true;
        private int maxRetries = 3;
        private int retryInterval = 5000;
        private int maxImageSize = AdConfig.DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE;
        private final int resizedPercentage = 100;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxImageSize() {
            return this.maxImageSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getResizedPercentage() {
            return this.resizedPercentage;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final boolean isValid() {
            if (this.maxRetries >= 0 && this.retryInterval >= 0 && this.maxImageSize >= 1 && this.resizedPercentage <= 100) {
                return true;
            }
            return false;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setEnableAdQuality(boolean z) {
            this.enabled = z;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setMaxImageSize(int i) {
            this.maxImageSize = i;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class AdReportConfig {
        private boolean enabled = true;
        private int cridls = 10;

        public final int getCridls() {
            return this.cridls;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final void setCridls(int i) {
            this.cridls = i;
        }

        public final void setEnabled(boolean z) {
            this.enabled = z;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class AssetCacheConfig {
        private int maxRetries = 3;
        private int retryInterval = 1;
        private long maxCacheSize = 104857600;
        private long timeToLive = CrashConfig.DEFAULT_EVENT_TTL_SEC;

        public final long getMaxCacheSize() {
            return this.maxCacheSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            if (getRetryInterval() >= 0 && getTimeToLive() >= 0 && getMaxCacheSize() >= 0 && getMaxRetries() >= 0) {
                return true;
            }
            return false;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class AudioConfig {
        private boolean isAudioEnabled = true;
        private int minDeviceVolume = 30;
        private int minRefreshInterval = 20;

        public final int getMinDeviceVolume() {
            return this.minDeviceVolume;
        }

        public final int getMinRefreshInterval() {
            return this.minRefreshInterval;
        }

        public final boolean isAudioEnabled() {
            return this.isAudioEnabled;
        }

        public final boolean isValid() {
            if (this.minDeviceVolume > 0 && this.minRefreshInterval > 0) {
                return true;
            }
            return false;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setAudioEnabled(boolean z) {
            this.isAudioEnabled = z;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setMinDeviceVolume(int i) {
            this.minDeviceVolume = i;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setMinRefreshInterval(int i) {
            this.minRefreshInterval = i;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class AudioViewabilityConfig {
        private byte impressionType = 1;
        private int impressionMinPercentageViewed = 90;
        private int impressionMinTimeViewed = 2000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionMinPercentageViewed(int i) {
            this.impressionMinPercentageViewed = i;
        }

        public final void setImpressionMinTimeViewed(int i) {
            this.impressionMinTimeViewed = i;
        }

        public final void setImpressionType(byte b) {
            this.impressionType = b;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class BannerImpressionTypeConfig {
        private byte impressionType;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b) {
            this.impressionType = b;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class BitRateConfig {
        private boolean bitrate_mandatory;
        private int headerTimeout = 2000;

        public final int getHeaderTimeout() {
            return this.headerTimeout;
        }

        public final boolean isBitRateMandatory() {
            return this.bitrate_mandatory;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class CacheConfig {
        private long timeToLive = 3300;

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            if (this.timeToLive >= 0) {
                return true;
            }
            return false;
        }

        public final void setTimeToLive(long j) {
            this.timeToLive = j;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class ContextualDataConfig {
        private int expiryTime;
        private int maxAdRecords = 1;
        @NotNull
        private List<String> skipFields;

        public ContextualDataConfig() {
            AdConfig.Companion.getClass();
            this.skipFields = AdConfig.DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS;
            this.expiryTime = AdConfig.DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME;
        }

        public final int getExpiryTime() {
            return this.expiryTime;
        }

        public final int getMaxAdRecords() {
            return this.maxAdRecords;
        }

        @NotNull
        public final List<String> getSkipFields() {
            return this.skipFields;
        }

        public final boolean isValid() {
            if (this.maxAdRecords >= 0 && this.expiryTime >= 0) {
                return true;
            }
            return false;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class ImaiConfig {
        private int maxRetries = 3;
        private int pingInterval = 60;
        private int pingTimeout = 120;
        private int maxDbEvents = 500;
        private int maxEventBatch = 10;
        private long pingCacheExpiry = 10800;

        public final int getMaxDbEvents() {
            return this.maxDbEvents;
        }

        public final int getMaxEventBatch() {
            return this.maxEventBatch;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final long getPingCacheExpiry() {
            return this.pingCacheExpiry;
        }

        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final int getPingTimeout() {
            return this.pingTimeout;
        }

        public final boolean isValid() {
            if (getMaxDbEvents() >= 0 && getMaxEventBatch() >= 0 && getMaxRetries() >= 0 && getPingInterval() >= 0 && getPingTimeout() > 0 && getPingCacheExpiry() > 0) {
                return true;
            }
            return false;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class InterstitialImpressionTypeConfig {
        private byte impressionType = 1;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b) {
            this.impressionType = b;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class MraidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        @NotNull
        private String url = "https://supply.inmobicdn.net/sdk/sdk/1075/android/mraid.js";

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            if (getExpiry() >= 0 && getRetryInterval() >= 0 && getMaxRetries() >= 0 && !AbstractC18975J3.m60997a(this.url)) {
                return true;
            }
            return false;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class OmidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        @NotNull
        private String partnerKey = "Inmobi";
        @NotNull
        private String url = "https://supply.inmobicdn.net/javascript/1.3.37/omsdk-service.js";
        private boolean omidEnabled = true;
        private long webViewRetainTime = 1000;

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final boolean getOmidEnabled() {
            return this.omidEnabled;
        }

        @NotNull
        public final String getPartnerKey() {
            return this.partnerKey;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final long getWebViewRetainTime() {
            return this.webViewRetainTime;
        }

        public final boolean isOmidEnabled() {
            return this.omidEnabled;
        }

        public final boolean isValid() {
            String url;
            CharSequence m16571b1;
            if (getMaxRetries() >= 0 && getRetryInterval() >= 0 && (url = getUrl()) != null) {
                m16571b1 = C37690r.m16571b1(url);
                String obj = m16571b1.toString();
                if (obj != null && AbstractC19225c2.m60400a(obj) && !TextUtils.isEmpty(getPartnerKey())) {
                    return true;
                }
            }
            return false;
        }

        public final void setOmidEnabled(boolean z) {
            this.omidEnabled = z;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class RenderingConfig {
        private boolean enableDomStorage;
        private boolean enableImmersive;
        private boolean enablePubMuteControl;
        @NotNull
        private List<Integer> gestures;
        private boolean shouldRenderPopup;
        @NotNull
        private String webviewBackground = "#00000000";
        private boolean autoRedirectionEnforcement = true;
        private long userTouchResetTime = 4;
        private int bannerNetworkLoadsLimit = 50;
        private int audioNetworkLoadsLimit = 50;
        private int otherNetworkLoadsLimit = -1;

        public RenderingConfig() {
            List<Integer> m17160s;
            m17160s = C37563v.m17160s(0, 1, 2, 3, 4, 5);
            this.gestures = m17160s;
        }

        public final int getAudioNetworkLoadsLimit() {
            return this.audioNetworkLoadsLimit;
        }

        public final boolean getAutoRedirectionEnforcement() {
            return this.autoRedirectionEnforcement;
        }

        public final int getBannerNetworkLoadsLimit() {
            return this.bannerNetworkLoadsLimit;
        }

        public final boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        public final boolean getEnableImmersive() {
            return this.enableImmersive;
        }

        public final boolean getEnablePubMuteControl() {
            return this.enablePubMuteControl;
        }

        public final int getOtherNetworkLoadsLimit() {
            return this.otherNetworkLoadsLimit;
        }

        @NotNull
        public final List<Integer> getSupportedGestures() {
            return this.gestures;
        }

        public final long getUserTouchResetTime() {
            return this.userTouchResetTime * 1000;
        }

        public final int getWebviewBackgroundColor() {
            try {
                return parseColor();
            } catch (IllegalArgumentException unused) {
                return Color.parseColor("#00000000");
            }
        }

        public final boolean isValid() {
            CharSequence m16571b1;
            String str = this.webviewBackground;
            if (str != null) {
                m16571b1 = C37690r.m16571b1(str);
                String obj = m16571b1.toString();
                if ((obj == null || obj.length() != 0) && getUserTouchResetTime() >= 0 && !getSupportedGestures().isEmpty()) {
                    try {
                        parseColor();
                        return true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            return false;
        }

        public final int parseColor() throws IllegalArgumentException {
            return Color.parseColor(this.webviewBackground);
        }

        public final boolean shouldRenderPopup() {
            return this.shouldRenderPopup;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class VastVideoConfig {
        @NotNull
        private List<String> allowedContentType;
        private int maxWrapperLimit = 3;
        private long optimalVastVideoSize = 3145728;
        private long vastMaxAssetSize = 31457280;
        @NotNull
        private BitRateConfig bitRate = new BitRateConfig();

        public VastVideoConfig() {
            List<String> m17160s;
            m17160s = C37563v.m17160s("video/mp4", "video/3gp", "video/3gpp", "video/webm", "image/jpeg", "image/jpg", "image/gif", "image/png");
            this.allowedContentType = m17160s;
        }

        @NotNull
        public final List<String> getAllowedContentType() {
            return this.allowedContentType;
        }

        @NotNull
        public final BitRateConfig getBitRate() {
            return this.bitRate;
        }

        public final int getMaxWrapperLimit() {
            return this.maxWrapperLimit;
        }

        public final long getOptimalVastVideoSize() {
            return this.optimalVastVideoSize;
        }

        public final long getVastMaxAssetSize() {
            return this.vastMaxAssetSize;
        }

        public final boolean isValid() {
            if (getOptimalVastVideoSize() <= 31457280 && getOptimalVastVideoSize() > 0 && getMaxWrapperLimit() >= 0 && getVastMaxAssetSize() > 0 && getVastMaxAssetSize() <= 31457280) {
                return true;
            }
            return false;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class VideoViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 2000;
        private int videoMinPercentagePlay = 50;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getVideoMinPercentagePlay() {
            return this.videoMinPercentagePlay;
        }

        public final void setImpressionMinPercentageViewed(int i) {
            this.impressionMinPercentageViewed = i;
        }

        public final void setImpressionMinTimeViewed(int i) {
            this.impressionMinTimeViewed = i;
        }

        public final void setVideoMinPercentagePlay(int i) {
            this.videoMinPercentagePlay = i;
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class ViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int visibilityThrottleMillis = 100;
        private int impressionPollIntervalMillis = 250;
        private int displayMinPercentageAnimate = 67;
        @NotNull
        private VideoViewabilityConfig video = new VideoViewabilityConfig();
        @NotNull
        private AudioViewabilityConfig audio = new AudioViewabilityConfig();
        @NotNull
        private WebViewabilityConfig web = new WebViewabilityConfig();
        @NotNull
        private OmidConfig omidConfig = new OmidConfig();
        @NotNull
        private BannerImpressionTypeConfig banner = new BannerImpressionTypeConfig();
        @NotNull

        /* renamed from: int */
        private InterstitialImpressionTypeConfig f119450int = new InterstitialImpressionTypeConfig();

        public final int getAudioImpressionMinPercentageViewed() {
            return this.audio.getImpressionMinPercentageViewed();
        }

        public final int getAudioImpressionMinTimeViewed() {
            return this.audio.getImpressionMinTimeViewed();
        }

        public final byte getAudioImpressionType() {
            return this.audio.getImpressionType();
        }

        public final byte getBannerImpressionType() {
            return this.banner.getImpressionType();
        }

        public final int getDisplayMinPercentageAnimate() {
            return this.displayMinPercentageAnimate;
        }

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final byte getInterstitialImpressionType() {
            return this.f119450int.getImpressionType();
        }

        @NotNull
        public final OmidConfig getOmidConfig() {
            return this.omidConfig;
        }

        public final int getVideoImpressionMinPercentageViewed() {
            return this.video.getImpressionMinPercentageViewed();
        }

        public final int getVideoImpressionMinTimeViewed() {
            return this.video.getImpressionMinTimeViewed();
        }

        public final int getVideoMinPercentagePlay() {
            return this.video.getVideoMinPercentagePlay();
        }

        public final int getVisibilityThrottleMillis() {
            return this.visibilityThrottleMillis;
        }

        public final int getWebImpressionMinPercentageViewed() {
            return this.web.getImpressionMinPercentageViewed();
        }

        public final int getWebImpressionMinTimeViewed() {
            return this.web.getImpressionMinTimeViewed();
        }

        public final int getWebVisibilityThrottleMillis() {
            return this.web.getImpressionPollIntervalMillis();
        }

        public final boolean isValid() {
            if (getImpressionMinPercentageViewed() > 0 && getImpressionMinPercentageViewed() <= 100 && getImpressionMinTimeViewed() >= 0 && getDisplayMinPercentageAnimate() > 0 && getDisplayMinPercentageAnimate() <= 100 && getVideoImpressionMinPercentageViewed() > 0 && getVideoImpressionMinPercentageViewed() <= 100 && getWebImpressionMinPercentageViewed() > 0 && getWebImpressionMinPercentageViewed() <= 100 && getWebVisibilityThrottleMillis() > 0 && getWebImpressionMinTimeViewed() >= 0 && getVideoImpressionMinTimeViewed() >= 0 && getVideoMinPercentagePlay() > 0 && getVideoMinPercentagePlay() <= 100 && getVisibilityThrottleMillis() >= 50 && getVisibilityThrottleMillis() * 5 <= getImpressionMinTimeViewed() && getImpressionPollIntervalMillis() >= 50 && getImpressionPollIntervalMillis() * 4 <= getImpressionMinTimeViewed() && this.omidConfig.isValid()) {
                return true;
            }
            return false;
        }

        public final void setOmidConfig(@NotNull OmidConfig omidConfig) {
            Intrinsics.checkNotNullParameter(omidConfig, "<set-?>");
            this.omidConfig = omidConfig;
        }

        public final void setVideoImpressionMinTimeViewed(int i) {
            this.video.setImpressionMinTimeViewed(i);
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class WebAssetCacheConfig {
        @NotNull
        public static final C18841c Companion = new C18841c();
        private static final int DEFAULT_CACHE_SIZE_MB = 15;
        private static final int DEFAULT_CACHE_SIZE_TO_DISK_SPACE_PERCENT = 10;
        private static final int DEFAULT_MAX_RETRIES = 1;
        private static final int DEFAULT_MIN_AVAILABLE_DISK_SPACE = 50;
        private static final int DEFAULT_TIMEOUT_MS = 5000;
        private final int cacheSize;
        private final int cacheSizeToDiskSpaceMaxPercent;
        private final int maxRetries;
        private final int minAvailableDiskSpace;
        private final int timeout;

        public WebAssetCacheConfig() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public static /* synthetic */ WebAssetCacheConfig copy$default(WebAssetCacheConfig webAssetCacheConfig, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = webAssetCacheConfig.cacheSize;
            }
            if ((i6 & 2) != 0) {
                i2 = webAssetCacheConfig.timeout;
            }
            int i7 = i2;
            if ((i6 & 4) != 0) {
                i3 = webAssetCacheConfig.maxRetries;
            }
            int i8 = i3;
            if ((i6 & 8) != 0) {
                i4 = webAssetCacheConfig.minAvailableDiskSpace;
            }
            int i9 = i4;
            if ((i6 & 16) != 0) {
                i5 = webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
            }
            return webAssetCacheConfig.copy(i, i7, i8, i9, i5);
        }

        public final int component1() {
            return this.cacheSize;
        }

        public final int component2() {
            return this.timeout;
        }

        public final int component3() {
            return this.maxRetries;
        }

        public final int component4() {
            return this.minAvailableDiskSpace;
        }

        public final int component5() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        @NotNull
        public final WebAssetCacheConfig copy(int i, int i2, int i3, int i4, int i5) {
            return new WebAssetCacheConfig(i, i2, i3, i4, i5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebAssetCacheConfig)) {
                return false;
            }
            WebAssetCacheConfig webAssetCacheConfig = (WebAssetCacheConfig) obj;
            if (this.cacheSize == webAssetCacheConfig.cacheSize && this.timeout == webAssetCacheConfig.timeout && this.maxRetries == webAssetCacheConfig.maxRetries && this.minAvailableDiskSpace == webAssetCacheConfig.minAvailableDiskSpace && this.cacheSizeToDiskSpaceMaxPercent == webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent) {
                return true;
            }
            return false;
        }

        public final int getCacheSize() {
            return this.cacheSize;
        }

        public final int getCacheSizeToDiskSpaceMaxPercent() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getMinAvailableDiskSpace() {
            return this.minAvailableDiskSpace;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.timeout);
            int hashCode2 = Integer.hashCode(this.maxRetries);
            int hashCode3 = Integer.hashCode(this.minAvailableDiskSpace);
            return Integer.hashCode(this.cacheSizeToDiskSpaceMaxPercent) + ((hashCode3 + ((hashCode2 + ((hashCode + (Integer.hashCode(this.cacheSize) * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "WebAssetCacheConfig(cacheSize=" + this.cacheSize + ", timeout=" + this.timeout + ", maxRetries=" + this.maxRetries + ", minAvailableDiskSpace=" + this.minAvailableDiskSpace + ", cacheSizeToDiskSpaceMaxPercent=" + this.cacheSizeToDiskSpaceMaxPercent + ')';
        }

        public WebAssetCacheConfig(int i, int i2, int i3, int i4, int i5) {
            this.cacheSize = i;
            this.timeout = i2;
            this.maxRetries = i3;
            this.minAvailableDiskSpace = i4;
            this.cacheSizeToDiskSpaceMaxPercent = i5;
        }

        public /* synthetic */ WebAssetCacheConfig(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? 15 : i, (i6 & 2) != 0 ? 5000 : i2, (i6 & 4) != 0 ? 1 : i3, (i6 & 8) != 0 ? 50 : i4, (i6 & 16) != 0 ? 10 : i5);
        }
    }

    @Keep
    @Metadata
    /* loaded from: classes6.dex */
    public static final class WebViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int impressionPollIntervalMillis = 1000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i) {
            this.impressionMinPercentageViewed = i;
        }

        public final void setImpressionMinTimeViewed(int i) {
            this.impressionMinTimeViewed = i;
        }

        public final void setImpressionPollIntervalMillis(int i) {
            this.impressionPollIntervalMillis = i;
        }
    }

    static {
        List<String> m17166m;
        m17166m = C37563v.m17166m();
        DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS = m17166m;
    }

    public AdConfig(@Nullable String str) {
        super(str);
        Map<String, CacheConfig> m17279o;
        this.maxPoolSize = 10;
        this.url = DEFAULT_AD_SERVER_URL;
        this.minimumRefreshInterval = 20;
        this.defaultRefreshInterval = 60;
        this.watermarkEnabled = true;
        C18885Cb.Companion.getClass();
        C18885Cb c18885Cb = new C18885Cb();
        c18885Cb.m61197a0();
        this.timeouts = c18885Cb;
        this.imai = new ImaiConfig();
        this.rendering = new RenderingConfig();
        this.mraid = new MraidConfig();
        this.viewability = new ViewabilityConfig();
        this.vastVideo = new VastVideoConfig();
        this.assetCache = new AssetCacheConfig();
        this.contextualData = new ContextualDataConfig();
        this.adQuality = new AdQualityConfig();
        this.adReport = new AdReportConfig();
        this.audio = new AudioConfig();
        this.webAssetCache = new WebAssetCacheConfig(0, 0, 0, 0, 0, 31, null);
        m17279o = C37559r0.m17279o(C38513v.m14532a("base", new CacheConfig()), C38513v.m14532a("banner", new CacheConfig()), C38513v.m14532a("audio", new CacheConfig()), C38513v.m14532a("int", new CacheConfig()), C38513v.m14532a("native", new CacheConfig()));
        this.cache = m17279o;
    }

    @NotNull
    public final AdQualityConfig getAdQuality() {
        return this.adQuality;
    }

    @NotNull
    public final AdReportConfig getAdReport() {
        return this.adReport;
    }

    @Nullable
    public final C19168Y getAdReqDeprecateChecker() {
        if (this.adReqDeprecateChecker == null) {
            String str = this.deprecate;
            C19168Y c19168y = null;
            if (str != null) {
                if (!AbstractC19225c2.m60400a(str)) {
                    str = null;
                }
                if (str != null) {
                    c19168y = new C19168Y(str);
                }
            }
            this.adReqDeprecateChecker = c19168y;
        }
        return this.adReqDeprecateChecker;
    }

    public final boolean getApplyGzipReq() {
        return this.applyGzipReq;
    }

    @NotNull
    public final AssetCacheConfig getAssetCacheConfig() {
        return this.assetCache;
    }

    @NotNull
    public final AudioConfig getAudio() {
        return this.audio;
    }

    @NotNull
    public final CacheConfig getCacheConfig(@NotNull String adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        CacheConfig cacheConfig = this.cache.get(adType);
        if (cacheConfig == null) {
            CacheConfig cacheConfig2 = this.cache.get("base");
            if (cacheConfig2 == null) {
                return new CacheConfig();
            }
            return cacheConfig2;
        }
        return cacheConfig;
    }

    @NotNull
    public final ContextualDataConfig getContextualData() {
        return this.contextualData;
    }

    public final int getDefaultRefreshInterval() {
        return this.defaultRefreshInterval;
    }

    @NotNull
    public final ImaiConfig getImaiConfig() {
        return this.imai;
    }

    public final int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public final int getMinimumRefreshInterval() {
        return this.minimumRefreshInterval;
    }

    @NotNull
    public final MraidConfig getMraidConfig() {
        return this.mraid;
    }

    @NotNull
    public final RenderingConfig getRendering() {
        return this.rendering;
    }

    public final boolean getSkipNetCheckHB() {
        return this.skipNetCheckHB;
    }

    @NotNull
    public final C18885Cb getTimeouts() {
        return this.timeouts;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public String getType() {
        return BaseCampaignUnit.JSON_KEY_ADS;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final VastVideoConfig getVastVideo() {
        return this.vastVideo;
    }

    @NotNull
    public final ViewabilityConfig getViewability() {
        return this.viewability;
    }

    public final boolean getWatermarkEnabled() {
        return this.watermarkEnabled;
    }

    @NotNull
    public final WebAssetCacheConfig getWebAssetCache() {
        return this.webAssetCache;
    }

    public final boolean isCCTEnabled() {
        return this.cctEnabled;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        int i;
        int i2;
        if (this.maxPoolSize <= 0 || AbstractC18975J3.m60997a(this.url) || (i = this.minimumRefreshInterval) < 0 || (i2 = this.defaultRefreshInterval) < 0 || i > i2) {
            return false;
        }
        for (Map.Entry<String, CacheConfig> entry : this.cache.entrySet()) {
            if (!entry.getValue().isValid()) {
                return false;
            }
        }
        this.timeouts.m61197a0();
        if (!this.contextualData.isValid() || !this.adQuality.isValid() || !this.imai.isValid() || !this.mraid.isValid() || !this.timeouts.m61199Z() || !this.rendering.isValid() || !this.vastVideo.isValid() || !this.assetCache.isValid() || !this.viewability.isValid() || !this.audio.isValid()) {
            return false;
        }
        return true;
    }

    public final void setAdQuality(@NotNull AdQualityConfig adQualityConfig) {
        Intrinsics.checkNotNullParameter(adQualityConfig, "<set-?>");
        this.adQuality = adQualityConfig;
    }

    public final void setAdReport(@NotNull AdReportConfig adReportConfig) {
        Intrinsics.checkNotNullParameter(adReportConfig, "<set-?>");
        this.adReport = adReportConfig;
    }

    public final void setAdReqDeprecateChecker(@Nullable C19168Y c19168y) {
        this.adReqDeprecateChecker = c19168y;
    }

    public final void setApplyGzipReq(boolean z) {
        this.applyGzipReq = z;
    }

    public final void setAudio(@NotNull AudioConfig audioConfig) {
        Intrinsics.checkNotNullParameter(audioConfig, "<set-?>");
        this.audio = audioConfig;
    }

    public final void setContextualData(@NotNull ContextualDataConfig contextualDataConfig) {
        Intrinsics.checkNotNullParameter(contextualDataConfig, "<set-?>");
        this.contextualData = contextualDataConfig;
    }

    public final void setDefaultRefreshInterval(int i) {
        this.defaultRefreshInterval = i;
    }

    public final void setMinimumRefreshInterval(int i) {
        this.minimumRefreshInterval = i;
    }

    public final void setRendering(@NotNull RenderingConfig renderingConfig) {
        Intrinsics.checkNotNullParameter(renderingConfig, "<set-?>");
        this.rendering = renderingConfig;
    }

    public final void setSkipNetCheckHB(boolean z) {
        this.skipNetCheckHB = z;
    }

    public final void setTimeouts(@NotNull C18885Cb c18885Cb) {
        Intrinsics.checkNotNullParameter(c18885Cb, "<set-?>");
        this.timeouts = c18885Cb;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setVastVideo(@NotNull VastVideoConfig vastVideoConfig) {
        Intrinsics.checkNotNullParameter(vastVideoConfig, "<set-?>");
        this.vastVideo = vastVideoConfig;
    }

    public final void setViewability(@NotNull ViewabilityConfig viewabilityConfig) {
        Intrinsics.checkNotNullParameter(viewabilityConfig, "<set-?>");
        this.viewability = viewabilityConfig;
    }

    public final void setWebAssetCache(@NotNull WebAssetCacheConfig webAssetCacheConfig) {
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "<set-?>");
        this.webAssetCache = webAssetCacheConfig;
    }

    @Override // com.inmobi.commons.core.configs.Config
    @NotNull
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject m60031a = C18840b.m61280a().m60031a(this);
        if (m60031a == null) {
            Intrinsics.checkNotNullExpressionValue("AdConfig", "access$getTAG$p(...)");
            return new JSONObject();
        }
        return m60031a;
    }
}
