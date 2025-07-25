package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VungleError.kt */
@Metadata
/* renamed from: com.vungle.ads.l2 */
/* loaded from: classes7.dex */
public abstract class AbstractC29537l2 extends Exception {
    public static final int AD_ALREADY_FAILED = 206;
    public static final int AD_ALREADY_LOADED = 204;
    public static final int AD_CLOSED_MISSING_HEARTBEAT = 318;
    public static final int AD_CLOSED_TEMPLATE_ERROR = 317;
    public static final int AD_CONSUMED = 202;
    public static final int AD_EXPIRED = 304;
    public static final int AD_EXPIRED_ON_PLAY = 307;
    public static final int AD_FAILED_TO_DOWNLOAD = 10011;
    public static final int AD_HTML_FAILED_TO_LOAD = 310;
    public static final int AD_IS_LOADING = 203;
    public static final int AD_IS_PLAYING = 205;
    public static final int AD_LOAD_FAIL_RETRY_AFTER = 221;
    public static final int AD_MARKUP_INVALID = 10040;
    public static final int AD_NOT_LOADED = 210;
    public static final int AD_RENDER_NETWORK_ERROR = 10038;
    public static final int AD_RESPONSE_EMPTY = 215;
    public static final int AD_RESPONSE_INVALID_TEMPLATE_TYPE = 216;
    public static final int AD_RESPONSE_RETRY_AFTER = 220;
    public static final int AD_RESPONSE_TIMED_OUT = 217;
    public static final int AD_UNABLE_TO_PLAY = 10010;
    public static final int AD_WIN_NOTIFICATION_ERROR = 308;
    public static final int ALREADY_INITIALIZED = 4;
    public static final int ALREADY_PLAYING_ANOTHER_AD = 10015;
    public static final int API_FAILED_STATUS_CODE = 104;
    public static final int API_REQUEST_ERROR = 101;
    public static final int API_RESPONSE_DATA_ERROR = 102;
    public static final int API_RESPONSE_DECODE_ERROR = 103;
    public static final int ASSET_DOWNLOAD_ERROR = 10024;
    public static final int ASSET_FAILED_INSUFFICIENT_SPACE = 126;
    public static final int ASSET_FAILED_MAX_SPACE_EXCEEDED = 127;
    public static final int ASSET_FAILED_STATUS_CODE = 117;
    public static final int ASSET_FAILED_TO_DELETE = 309;
    public static final int ASSET_REQUEST_ERROR = 112;
    public static final int ASSET_RESPONSE_DATA_ERROR = 113;
    public static final int ASSET_WRITE_ERROR = 114;
    public static final int BANNER_VIEW_INVALID_SIZE = 500;
    public static final int CONCURRENT_PLAYBACK_UNSUPPORTED = 400;
    public static final int CONFIGURATION_ERROR = 10003;
    public static final int CREATIVE_ERROR = 10041;
    public static final int CURRENTLY_INITIALIZING = 3;
    @NotNull
    public static final C29538a Companion = new C29538a(null);
    public static final int DEEPLINK_OPEN_FAILED = 312;
    public static final int DEFAULT = 10000;
    public static final int EMPTY_TPAT_ERROR = 129;
    public static final int EVALUATE_JAVASCRIPT_FAILED = 313;
    @NotNull
    private static final Map<Integer, String> EXCEPTION_CODE_TO_MESSAGE_MAP;
    public static final int GENERATE_JSON_DATA_ERROR = 316;
    public static final int GZIP_ENCODE_ERROR = 116;
    public static final int HEARTBEAT_ERROR = 10043;
    public static final int INVALID_ADS_ENDPOINT = 122;
    public static final int INVALID_ADUNIT_BID_PAYLOAD = 213;
    public static final int INVALID_AD_STATE = 10042;
    public static final int INVALID_APP_ID = 2;
    public static final int INVALID_ASSET_URL = 111;
    public static final int INVALID_BID_PAYLOAD = 208;
    public static final int INVALID_CONFIG_RESPONSE = 135;
    public static final int INVALID_CTA_URL = 110;
    public static final int INVALID_EVENT_ID_ERROR = 200;
    public static final int INVALID_GZIP_BID_PAYLOAD = 214;
    public static final int INVALID_IFA_STATUS = 302;
    public static final int INVALID_INDEX_URL = 115;
    public static final int INVALID_JSON_BID_PAYLOAD = 209;
    public static final int INVALID_LOG_ERROR_ENDPOINT = 124;
    public static final int INVALID_METRICS_ENDPOINT = 125;
    public static final int INVALID_PLACEMENT_ID = 201;
    public static final int INVALID_REQUEST_BUILDER_ERROR = 106;
    public static final int INVALID_RI_ENDPOINT = 123;
    public static final int INVALID_SIZE = 10028;
    public static final int INVALID_TEMPLATE_URL = 105;
    public static final int INVALID_TPAT_KEY = 128;
    public static final int INVALID_WATERFALL_PLACEMENT = 222;
    public static final int JSON_ENCODE_ERROR = 119;
    public static final int JSON_PARAMS_ENCODE_ERROR = 315;
    public static final int LINK_COMMAND_OPEN_FAILED = 314;
    public static final int MRAID_BRIDGE_ERROR = 305;
    public static final int MRAID_DOWNLOAD_JS_ERROR = 130;
    public static final int MRAID_ERROR = 301;
    public static final int MRAID_JS_CALL_EMPTY = 311;
    public static final int MRAID_JS_COPY_FAILED = 219;
    public static final int MRAID_JS_DOES_NOT_EXIST = 218;
    public static final int MRAID_JS_WRITE_FAILED = 131;
    public static final int NATIVE_ASSET_ERROR = 600;
    public static final int NETWORK_ERROR = 10020;
    public static final int NETWORK_PERMISSIONS_NOT_GRANTED = 10034;
    public static final int NETWORK_TIMEOUT = 10047;
    public static final int NETWORK_UNREACHABLE = 10033;
    public static final int NO_SERVE = 10001;
    public static final int NO_SPACE_TO_DOWNLOAD_ASSETS = 10019;
    public static final int OMSDK_COPY_ERROR = 2003;
    public static final int OMSDK_DOWNLOAD_JS_ERROR = 132;
    public static final int OMSDK_JS_WRITE_FAILED = 133;
    public static final int OUT_OF_MEMORY = 3001;
    public static final int PLACEMENT_AD_TYPE_MISMATCH = 207;
    public static final int PLACEMENT_NOT_FOUND = 10013;
    public static final int PLACEMENT_SLEEP = 212;
    public static final int PRIVACY_URL_ERROR = 136;
    public static final int PROTOBUF_SERIALIZATION_ERROR = 118;
    public static final int REACHABILITY_INITIALIZATION_FAILED = 2005;
    public static final int SDK_NOT_INITIALIZED = 6;
    public static final int SDK_VERSION_BELOW_REQUIRED_VERSION = 10035;
    public static final int SERVER_RETRY_ERROR = 10014;
    public static final int STORE_KIT_LOAD_ERROR = 2002;
    public static final int STORE_OVERLAY_LOAD_ERROR = 2004;
    public static final int STORE_REGION_CODE_ERROR = 134;
    public static final int TEMPLATE_UNZIP_ERROR = 109;
    public static final int TPAT_ERROR = 121;
    public static final int TPAT_RETRY_FAILED = 137;
    public static final int UNKNOWN_ERROR = 0;
    public static final int UNKNOWN_EXCEPTION_CODE = 10048;
    public static final int UNKNOWN_RADIO_ACCESS_TECHNOLOGY = 2006;
    public static final int UNRECOGNIZED = -1;
    public static final int USER_AGENT_ERROR = 7;
    public static final int WEBVIEW_RENDER_UNRESPONSIVE = 10032;
    public static final int WEB_CRASH = 10031;
    public static final int WEB_VIEW_FAILED_NAVIGATION = 2001;
    public static final int WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE = 2000;
    private final int code;
    @Nullable
    private String creativeId;
    @NotNull
    private final String errorMessage;
    @Nullable
    private String eventId;
    @Nullable
    private final Sdk$SDKError.EnumC29425b loggableReason;
    @Nullable
    private String placementId;

    /* compiled from: VungleError.kt */
    @Metadata
    /* renamed from: com.vungle.ads.l2$a */
    /* loaded from: classes7.dex */
    public static final class C29538a {
        private C29538a() {
        }

        public /* synthetic */ C29538a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Sdk$SDKError.EnumC29425b codeToLoggableReason(int i) {
            Sdk$SDKError.EnumC29425b forNumber = Sdk$SDKError.EnumC29425b.forNumber(i);
            Intrinsics.checkNotNullExpressionValue(forNumber, "forNumber(errorCode)");
            return forNumber;
        }

        @NotNull
        public final String getLocalizedMessage(int i) {
            String str = (String) AbstractC29537l2.EXCEPTION_CODE_TO_MESSAGE_MAP.get(Integer.valueOf(i));
            if (str == null) {
                new C29150i2("No adequate description for exceptionCode=" + i).logErrorNoReturnValue$vungle_ads_release();
            }
            if (str == null) {
                return "Unknown Exception Code: " + i;
            }
            return str;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(10000, "");
        hashMap.put(Integer.valueOf((int) CONFIGURATION_ERROR), "Configuration Error Occurred. Please check your appID and placementIDs, and try again when network connectivity is available.");
        hashMap.put(10001, "No advertisements are available for your current bid. Please try again later.");
        hashMap.put(0, "Unknown Error Occurred.");
        hashMap.put(304, "The advertisement in the cache has expired and can no longer be played. Please load another ad");
        hashMap.put(3, "There is already an ongoing operation for the action you requested. Please wait until the operation finished before starting another.");
        hashMap.put(6, "Vungle is not initialized/no longer initialized. Please call Vungle.init() to reinitialize.");
        hashMap.put(Integer.valueOf((int) AD_UNABLE_TO_PLAY), "Unable to play advertisement");
        hashMap.put(Integer.valueOf((int) AD_FAILED_TO_DOWNLOAD), "Advertisement failed to download");
        hashMap.put(Integer.valueOf((int) PLACEMENT_NOT_FOUND), "Placement is not valid");
        hashMap.put(Integer.valueOf((int) SERVER_RETRY_ERROR), "Remote Server responded with http Retry-After, SDK will retry this request.");
        hashMap.put(Integer.valueOf((int) ALREADY_PLAYING_ANOTHER_AD), "Vungle is already playing different ad.");
        hashMap.put(Integer.valueOf((int) NO_SPACE_TO_DOWNLOAD_ASSETS), "There is not enough file system size on a device to download assets for an ad.");
        hashMap.put(Integer.valueOf((int) NETWORK_ERROR), "Network error. Try again later");
        hashMap.put(Integer.valueOf((int) ASSET_DOWNLOAD_ERROR), "Assets download failed.");
        hashMap.put(Integer.valueOf((int) INVALID_SIZE), "Ad size is invalid");
        hashMap.put(Integer.valueOf((int) WEB_CRASH), "Android web view has crashed");
        hashMap.put(Integer.valueOf((int) WEBVIEW_RENDER_UNRESPONSIVE), "Android web view render became unresponsive, please clean-up your Webview process if any");
        hashMap.put(Integer.valueOf((int) NETWORK_UNREACHABLE), "Network error. Please check if network is available and permission for network access is granted.");
        hashMap.put(Integer.valueOf((int) NETWORK_PERMISSIONS_NOT_GRANTED), "Network permissions not granted. Please check manifest for android.permission.INTERNET and android.permission.ACCESS_NETWORK_STATE");
        hashMap.put(Integer.valueOf((int) SDK_VERSION_BELOW_REQUIRED_VERSION), "The SDK minimum version should not be overridden. Will not work as expected.");
        hashMap.put(Integer.valueOf((int) AD_RENDER_NETWORK_ERROR), "Ad rendering failed due to network connectivity issue");
        hashMap.put(3001, "Out of memory");
        hashMap.put(Integer.valueOf((int) AD_MARKUP_INVALID), "Invalid ad markup");
        hashMap.put(Integer.valueOf((int) CREATIVE_ERROR), "Creative error occurred");
        hashMap.put(Integer.valueOf((int) INVALID_AD_STATE), "Invalid ad state ");
        hashMap.put(Integer.valueOf((int) HEARTBEAT_ERROR), "Heartbeat not received within a valid time window");
        hashMap.put(2, "App id is invalid.");
        hashMap.put(207, "Ad type does not match with placement type.");
        hashMap.put(400, "Concurrent playback not supported");
        hashMap.put(Integer.valueOf((int) NETWORK_TIMEOUT), "Request timeout.");
        hashMap.put(137, "Pinging Tpat did not succeed during all allowed reries.");
        hashMap.put(130, "Failed to download mraid js.");
        hashMap.put(113, "Server returned an unexpected response object or failed to load the downloaded data.");
        hashMap.put(222, "Placement header bidding type does not match with loadAd call.");
        hashMap.put(136, "Failed to open privacy url");
        EXCEPTION_CODE_TO_MESSAGE_MAP = hashMap;
    }

    public /* synthetic */ AbstractC29537l2(Integer num, Sdk$SDKError.EnumC29425b enumC29425b, String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, enumC29425b, str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(cls2, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        AbstractC29537l2 abstractC29537l2 = (AbstractC29537l2) obj;
        if (this.code == abstractC29537l2.code && this.loggableReason == abstractC29537l2.loggableReason && Intrinsics.m17075f(this.errorMessage, abstractC29537l2.errorMessage) && Intrinsics.m17075f(this.placementId, abstractC29537l2.placementId) && Intrinsics.m17075f(this.creativeId, abstractC29537l2.creativeId) && Intrinsics.m17075f(this.eventId, abstractC29537l2.eventId)) {
            return true;
        }
        return false;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final Sdk$SDKError.EnumC29425b getLoggableReason() {
        return this.loggableReason;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = Integer.hashCode(this.code) * 31;
        Sdk$SDKError.EnumC29425b enumC29425b = this.loggableReason;
        int i4 = 0;
        if (enumC29425b != null) {
            i = enumC29425b.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.errorMessage.hashCode()) * 31;
        String str = this.placementId;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode2 + i2) * 31;
        String str2 = this.creativeId;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        String str3 = this.eventId;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i6 + i4;
    }

    @NotNull
    public final AbstractC29537l2 logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        Sdk$SDKError.EnumC29425b enumC29425b = this.loggableReason;
        if (enumC29425b != null) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(enumC29425b, this.errorMessage, this.placementId, this.creativeId, this.eventId);
        }
    }

    public final void setCreativeId(@Nullable String str) {
        this.creativeId = str;
    }

    @NotNull
    public final AbstractC29537l2 setCreativeId$vungle_ads_release(@Nullable String str) {
        this.creativeId = str;
        return this;
    }

    public final void setEventId(@Nullable String str) {
        this.eventId = str;
    }

    @NotNull
    public final AbstractC29537l2 setEventId$vungle_ads_release(@Nullable String str) {
        this.eventId = str;
        return this;
    }

    public final void setPlacementId(@Nullable String str) {
        this.placementId = str;
    }

    @NotNull
    public final AbstractC29537l2 setPlacementId$vungle_ads_release(@Nullable String str) {
        this.placementId = str;
        return this;
    }

    public /* synthetic */ AbstractC29537l2(Integer num, Sdk$SDKError.EnumC29425b enumC29425b, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : enumC29425b, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private AbstractC29537l2(java.lang.Integer r4, com.vungle.ads.internal.protos.Sdk$SDKError.EnumC29425b r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r3 = this;
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r6 != 0) goto L13
            com.vungle.ads.l2$a r1 = com.vungle.ads.AbstractC29537l2.Companion
            if (r4 == 0) goto Ld
            int r2 = r4.intValue()
            goto Le
        Ld:
            r2 = r0
        Le:
            java.lang.String r1 = r1.getLocalizedMessage(r2)
            goto L14
        L13:
            r1 = r6
        L14:
            r3.<init>(r1)
            r3.loggableReason = r5
            r3.placementId = r7
            r3.creativeId = r8
            r3.eventId = r9
            if (r4 == 0) goto L26
            int r5 = r4.intValue()
            goto L2d
        L26:
            kotlin.jvm.internal.Intrinsics.m17074g(r5)
            int r5 = r5.getNumber()
        L2d:
            r3.code = r5
            if (r6 != 0) goto L3d
            com.vungle.ads.l2$a r5 = com.vungle.ads.AbstractC29537l2.Companion
            if (r4 == 0) goto L39
            int r0 = r4.intValue()
        L39:
            java.lang.String r6 = r5.getLocalizedMessage(r0)
        L3d:
            r3.errorMessage = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.AbstractC29537l2.<init>(java.lang.Integer, com.vungle.ads.internal.protos.Sdk$SDKError$b, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
