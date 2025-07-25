package com.amazon.aps.ads.util.adview;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ApsAdViewConstants.kt */
@Metadata
/* loaded from: classes2.dex */
public interface ApsAdViewConstants {
    @NotNull
    public static final String ADDITIONAL_WEBVIEW_METRICS = "additional_webview_metric";
    @NotNull
    public static final String AD_INFO_FEATURE = "webviewAdInfo_feature";
    public static final int AD_INFO_MATCHER_NUMBER = 4;
    @NotNull
    public static final String AD_INFO_PATTERN = "amzn.dtb.loadAd\\(\\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\".*isv: (\\w+)";
    @NotNull
    public static final String AMAZON_AD_INFO = "amazon_ad_info";
    @NotNull
    public static final String AMAZON_BRIDGE = "amzn_bridge";
    @NotNull
    public static final String AMAZON_INFO = "{bidID:'%s',aaxHost:'%s',pricePoint:'%s'}";
    @NotNull
    public static final String BID_HTML = "bid_html_template";
    @NotNull
    public static final String BID_IDENTIFIER = "bid_identifier";
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    @NotNull
    public static final String ENV_TEMPLATE = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true,mobileDeviceInfo:%s};";
    @NotNull
    public static final String ENV_TEMPLATE_INFO = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true,mobileDeviceInfo:%s};";
    @NotNull
    public static final String EVENT_JSON_SUBTYPE = "subtype";
    @NotNull
    public static final String EVENT_SERVER_PARAMETER = "event_server_parameter";
    @NotNull
    public static final String EXPECTED_HEIGHT = "expected_height";
    @NotNull
    public static final String EXPECTED_WIDTH = "expected_width";
    @NotNull
    public static final String HOSTNAME_IDENTIFIER = "hostname_identifier";
    @NotNull
    public static final String MOBILE_DEVICE_INFO = "{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}";
    @NotNull
    public static final String MRAID_IDENTIFIER = "MRAID_ENV";
    @NotNull
    public static final String ON_DISPLAY_AD_FAILED_TO_LOAD = "onAdFailedToLoad";
    @NotNull
    public static final String ON_DISPLAY_AD_LOADED = "onAdLoaded";
    @NotNull
    public static final String ON_END_CARD_CLOSED = "END_CARD_VIDEO_CLOSED";
    @NotNull
    public static final String ON_END_CARD_COMPANION_AD_START = "END_CARD_COMPANION_AD_START";
    @NotNull
    public static final String ON_VIDEO_AD_FAILED_TO_LOAD = "AD_FAILED_TO_LOAD";
    @NotNull
    public static final String ON_VIDEO_AD_LOADED = "AD_LOADED";
    @NotNull
    public static final String REQUEST_QUEUE = "amazon_request_queue";
    @NotNull
    public static final String SMARTBANNER_STATE = "smart_banner_state";
    @NotNull
    public static final String START_LOAD_TIME = "start_load_time";
    @NotNull
    public static final String VIDEO = "video_flag";
    @NotNull
    public static final String VIDEO_CLICK_EVENT = "AD_VIDEO_PLAYER_CLICKED";
    @NotNull
    public static final String VIDEO_COMPLETE_EVENT = "AD_VIDEO_PLAYER_COMPLETED";
    @NotNull
    public static final String VIDEO_EVENT_JS_COMMAND_TYPE = "apsvid";

    /* compiled from: ApsAdViewConstants.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        public static final String ADDITIONAL_WEBVIEW_METRICS = "additional_webview_metric";
        @NotNull
        public static final String AD_INFO_FEATURE = "webviewAdInfo_feature";
        public static final int AD_INFO_MATCHER_NUMBER = 4;
        @NotNull
        public static final String AD_INFO_PATTERN = "amzn.dtb.loadAd\\(\\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\".*isv: (\\w+)";
        @NotNull
        public static final String AMAZON_AD_INFO = "amazon_ad_info";
        @NotNull
        public static final String AMAZON_BRIDGE = "amzn_bridge";
        @NotNull
        public static final String AMAZON_INFO = "{bidID:'%s',aaxHost:'%s',pricePoint:'%s'}";
        @NotNull
        public static final String BID_HTML = "bid_html_template";
        @NotNull
        public static final String BID_IDENTIFIER = "bid_identifier";
        @NotNull
        public static final String ENV_TEMPLATE = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true,mobileDeviceInfo:%s};";
        @NotNull
        public static final String ENV_TEMPLATE_INFO = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true,mobileDeviceInfo:%s};";
        @NotNull
        public static final String EVENT_JSON_SUBTYPE = "subtype";
        @NotNull
        public static final String EVENT_SERVER_PARAMETER = "event_server_parameter";
        @NotNull
        public static final String EXPECTED_HEIGHT = "expected_height";
        @NotNull
        public static final String EXPECTED_WIDTH = "expected_width";
        @NotNull
        public static final String HOSTNAME_IDENTIFIER = "hostname_identifier";
        @NotNull
        public static final String MOBILE_DEVICE_INFO = "{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}";
        @NotNull
        public static final String MRAID_IDENTIFIER = "MRAID_ENV";
        @NotNull
        public static final String ON_DISPLAY_AD_FAILED_TO_LOAD = "onAdFailedToLoad";
        @NotNull
        public static final String ON_DISPLAY_AD_LOADED = "onAdLoaded";
        @NotNull
        public static final String ON_END_CARD_CLOSED = "END_CARD_VIDEO_CLOSED";
        @NotNull
        public static final String ON_END_CARD_COMPANION_AD_START = "END_CARD_COMPANION_AD_START";
        @NotNull
        public static final String ON_VIDEO_AD_FAILED_TO_LOAD = "AD_FAILED_TO_LOAD";
        @NotNull
        public static final String ON_VIDEO_AD_LOADED = "AD_LOADED";
        @NotNull
        public static final String REQUEST_QUEUE = "amazon_request_queue";
        @NotNull
        public static final String SMARTBANNER_STATE = "smart_banner_state";
        @NotNull
        public static final String START_LOAD_TIME = "start_load_time";
        @NotNull
        public static final String VIDEO = "video_flag";
        @NotNull
        public static final String VIDEO_CLICK_EVENT = "AD_VIDEO_PLAYER_CLICKED";
        @NotNull
        public static final String VIDEO_COMPLETE_EVENT = "AD_VIDEO_PLAYER_COMPLETED";
        @NotNull
        public static final String VIDEO_EVENT_JS_COMMAND_TYPE = "apsvid";

        private Companion() {
        }
    }
}
