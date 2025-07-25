package com.maticoo.sdk.utils.constant;

/* loaded from: classes6.dex */
public abstract class CommonConstants {
    public static final String ADTYPE_BANNER = "Banner";
    private static final String AD_ONLINE_HOST = "https://sdk-api.maticooads.com";
    private static final String AD_PRE_HOST = "http://47.245.107.165";
    private static final String AD_TEST_HOST = "http://sdk-server.sdk-server-test.com";
    public static final int API_VERSION = 1;
    public static final int BANNER = 1;
    public static final int BANNER_VIDEO = 12;
    public static final String CHARTSET_UTF8 = "UTF-8";
    public static final int CLICK_RANGE_TYPE_BOTTOM = 0;
    public static final int CLICK_RANGE_TYPE_CENTER = 1;
    public static final int CLOSE_BUTTON_DIAMETER = 30;
    public static final String DB_NAME = "omDB.db";
    public static final int DB_VERSION = 1;
    public static final int DELAY_TIME = 2000;
    public static final String EVENT_BI_REPORT_URL = "https://deapi.funsdata.com/v1/zmaticoo/report";
    public static final String FILE_HEADER_SUFFIX = "-header";
    public static final int INTERACT = 5;
    public static final int INTERSTITIAL = 2;
    public static final int INTERSTITIAL_BANNER = 7;
    public static final int INTERSTITIAL_VIDEO = 8;
    public static final String KEY_CACHE_CONTROL = "Cache-Control";
    public static final String KEY_CONTENT_LENGTH = "Content-Length";
    public static final String KEY_CONTENT_TYPE = "Content-Type";
    public static final String KEY_ETAG = "ETag";
    public static final String KEY_IF_MODIFIED_SINCE = "If-Modified-Since";
    public static final String KEY_IF_NONE_MATCH = "If-None-Match";
    public static final String KEY_LAST_MODIFIED = "Last-Modified";
    public static final String KEY_LOCATION = "Location";
    public static final String KEY_MAX_AGE = "max-age";
    public static final String KEY_REQUEST_TIME = "request_time";
    public static final int LANDING_TYPE_BROWSER = 1;
    public static final int LANDING_TYPE_INNER_CLICK = 2;
    public static final int LANDING_TYPE_INNER_CLICK_AND_REDIRECT = 3;
    public static final int LANDING_TYPE_INSTALL = 0;
    public static final int LOAD_TYPE_AUTO_REFRESH = 1;
    public static final int LOAD_TYPE_NORMAL = 0;
    public static final int LOAD_TYPE_PRE_LOAD = 2;
    public static final int NATIVE = 4;
    public static final String PKG_GP = "com.android.vending";
    public static final int PLAT_FORM_ANDROID = 1;
    public static final int REPORT_ACTIVE_TYPE_ALL = 3;
    public static final int REPORT_ACTIVE_TYPE_NONE = 0;
    public static final int REPORT_ACTIVE_TYPE_USER_DATA = 1;
    public static final int REPORT_ACTIVE_TYPE_USE_TIME = 2;
    public static final int REWARDED = 3;
    public static final int REWARDED_BANNER = 11;
    public static final String SDK_VERSION_NAME = "1.8.1.1";
    public static final int SPLASH = 6;
    public static final int SPLASH_BANNER = 9;
    public static final int SPLASH_VIDEO = 10;
    public static final String TYPE_BAB = "banner";
    public static final String TYPE_BAV = "banner-video";
    public static final String TYPE_INB = "interstitial-banner";
    public static final String TYPE_INV = "interstitial-video";
    public static final String TYPE_REB = "rewarded-banner";
    public static final String TYPE_REV = "video";
    public static final String TYPE_SPB = "splash-banner";
    public static final String TYPE_SPV = "splash-video";
    public static final String WEBSITE_ZMATICOO = "https://www.zmaticoo.com/";

    public static String getAdBiddingResultUrl() {
        return getHost() + "/getBiddingResult";
    }

    public static String getAdBiddingUrl() {
        return getHost() + "/bidding";
    }

    public static String getAdErrorUrl() {
        return getHost() + "/error";
    }

    public static String getAdEventUrl() {
        return getHost() + "/event";
    }

    public static String getAdLoadUrl() {
        return getHost() + "/ad";
    }

    private static String getHost() {
        return AD_ONLINE_HOST;
    }

    public static String getInitUrl() {
        return getHost() + "/init";
    }

    public static String getPrivacyProtectUrl() {
        return getHost() + "/privacyProtect";
    }

    public static String getRedirectUrl() {
        return getHost() + "/redirect";
    }

    public static String getVastErrorUrl() {
        return getHost() + "/vastError";
    }
}
