package net.pubnative.lite.sdk.interstitial;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.CacheListener;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.VideoListener;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.analytics.ReportingEvent;
import net.pubnative.lite.sdk.api.InterstitialRequestManager;
import net.pubnative.lite.sdk.api.OpenRTBApiClient;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenter;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterFactory;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.C38595Ad;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.OpenRTBAdRequestFactory;
import net.pubnative.lite.sdk.models.Protocol;
import net.pubnative.lite.sdk.models.SkipOffset;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.prefs.SessionImpressionPrefs;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.AdRequestRegistry;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.MarkupUtils;
import net.pubnative.lite.sdk.utils.SignalDataProcessor;
import net.pubnative.lite.sdk.utils.SkipOffsetManager;
import net.pubnative.lite.sdk.utils.json.JsonOperations;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdProcessor;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.vast.VastUrlUtils;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class HyBidInterstitialAd implements RequestManager.RequestListener, InterstitialPresenter.Listener, VideoListener {
    private static final String TAG = "HyBidInterstitialAd";
    private static final long TIME_TO_EXPIRE = 1800000;
    private C38595Ad mAd;
    private AdTracker mAdTracker;
    private final String mAppToken;
    private final Context mContext;
    private String mCustomUrl;
    private SkipOffset mHtmlSkipOffset;
    private long mInitialLoadTime;
    private long mInitialRenderTime;
    private boolean mIsDestroyed;
    private final Listener mListener;
    private RequestManager mORTBRequestManager;
    private JSONObject mPlacementParams;
    private InterstitialPresenter mPresenter;
    private boolean mReady;
    private RequestManager mRequestManager;
    private String mScreenIabCategory;
    private String mScreenKeywords;
    private SignalDataProcessor mSignalDataProcessor;
    private String mUserIntent;
    private VideoListener mVideoListener;
    private SkipOffset mVideoSkipOffset;
    private String mZoneId;

    /* loaded from: classes10.dex */
    public interface Listener {
        void onInterstitialClick();

        void onInterstitialDismissed();

        void onInterstitialImpression();

        void onInterstitialLoadFailed(Throwable th);

        void onInterstitialLoaded();
    }

    public HyBidInterstitialAd(Activity activity, Listener listener) {
        this((Context) activity, "", listener);
    }

    private void addReportingKey(String str, Object obj) {
        JSONObject jSONObject = this.mPlacementParams;
        if (jSONObject != null) {
            if (obj instanceof Long) {
                JsonOperations.putJsonLong(jSONObject, str, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                JsonOperations.putJsonValue(jSONObject, str, (Integer) obj);
            } else if (obj instanceof Double) {
                JsonOperations.putJsonValue(jSONObject, str, (Double) obj);
            } else {
                JsonOperations.putJsonString(jSONObject, str, obj.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRemoteConfigs() {
        C38595Ad c38595Ad = this.mAd;
        if (c38595Ad == null) {
            return;
        }
        Integer htmlSkipOffset = c38595Ad.getHtmlSkipOffset();
        Boolean bool = Boolean.TRUE;
        Integer hTMLSkipOffset = SkipOffsetManager.getHTMLSkipOffset(htmlSkipOffset, bool);
        Integer videoSkipOffset = SkipOffsetManager.getVideoSkipOffset(this.mAd.getVideoSkipOffset(), null, null, Boolean.valueOf(hasEndCard()), bool);
        if (hTMLSkipOffset != null) {
            this.mHtmlSkipOffset = new SkipOffset(hTMLSkipOffset.intValue(), SkipOffsetManager.isCustomInterstitialHTMLSkipOffset().booleanValue());
        }
        if (videoSkipOffset != null) {
            this.mVideoSkipOffset = new SkipOffset(videoSkipOffset.intValue(), SkipOffsetManager.isCustomInterstitialVideoSkipOffset().booleanValue());
        }
    }

    private void cleanup() {
        this.mReady = false;
        this.mPlacementParams = new JSONObject();
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        InterstitialPresenter interstitialPresenter = this.mPresenter;
        if (interstitialPresenter != null) {
            interstitialPresenter.destroy();
            this.mPresenter = null;
        }
        SignalDataProcessor signalDataProcessor = this.mSignalDataProcessor;
        if (signalDataProcessor != null) {
            signalDataProcessor.destroy();
            this.mSignalDataProcessor = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeAdTracker() {
        if (this.mAd != null) {
            this.mAdTracker = new AdTracker(null, null, this.mAd.getBeacons(C38595Ad.Beacon.SDK_EVENT), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerAdRequest(String str, String str2, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.AD_REQUEST, str);
        JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.AD_RESPONSE, str2);
        JsonOperations.putJsonLong(this.mPlacementParams, Reporting.Key.RESPONSE_TIME, currentTimeMillis);
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, currentTimeMillis);
    }

    private void renderAd() {
        IntegrationType integrationType = IntegrationType.IN_APP_BIDDING;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            integrationType = requestManager.getIntegrationType();
        }
        InterstitialPresenter createInterstitialPresenter = new InterstitialPresenterFactory(this.mContext, this.mZoneId).createInterstitialPresenter(this.mAd, this.mHtmlSkipOffset, this.mVideoSkipOffset, this, integrationType);
        this.mPresenter = createInterstitialPresenter;
        if (createInterstitialPresenter != null) {
            createInterstitialPresenter.setVideoListener(this);
            this.mPresenter.load();
            return;
        }
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
    }

    private void sendLoadTracker(Integer num) {
        AdTracker adTracker = this.mAdTracker;
        if (adTracker != null) {
            adTracker.trackSdkEvent(1, num);
        }
    }

    public void destroy() {
        cleanup();
        this.mIsDestroyed = true;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.destroy();
            this.mRequestManager = null;
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.destroy();
            this.mORTBRequestManager = null;
        }
    }

    public Integer getBidPoints() {
        int i;
        C38595Ad c38595Ad = this.mAd;
        if (c38595Ad != null) {
            i = c38595Ad.getECPM().intValue();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public String getCreativeId() {
        C38595Ad c38595Ad = this.mAd;
        if (c38595Ad != null) {
            return c38595Ad.getCreativeId();
        }
        return null;
    }

    public String getImpressionId() {
        C38595Ad c38595Ad = this.mAd;
        if (c38595Ad != null) {
            return c38595Ad.getImpressionId();
        }
        return null;
    }

    public JSONObject getPlacementParams() {
        JSONObject placementParams;
        JSONObject placementParams2;
        JSONObject jSONObject = new JSONObject();
        JsonOperations.mergeJsonObjects(jSONObject, this.mPlacementParams);
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && (placementParams2 = requestManager.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams2);
        }
        InterstitialPresenter interstitialPresenter = this.mPresenter;
        if (interstitialPresenter != null && (placementParams = interstitialPresenter.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    public boolean hasEndCard() {
        C38595Ad c38595Ad = this.mAd;
        if (c38595Ad != null) {
            return AdEndCardManager.isEndCardEnabled(c38595Ad).booleanValue();
        }
        return false;
    }

    protected void invokeOnClick() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onInterstitialClick();
        }
    }

    protected void invokeOnDismissed() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onInterstitialDismissed();
        }
    }

    protected void invokeOnImpression() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onInterstitialImpression();
        }
    }

    protected void invokeOnLoadFailed(Throwable th) {
        long j = -1;
        if (this.mInitialLoadTime != -1) {
            j = System.currentTimeMillis() - this.mInitialLoadTime;
            JsonOperations.putJsonLong(this.mPlacementParams, Reporting.Key.TIME_TO_LOAD_FAILED, j);
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType(Reporting.EventType.LOAD_FAIL);
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            RequestManager requestManager = this.mRequestManager;
            if (requestManager != null) {
                reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(requestManager.getIntegrationType()));
            }
            reportingEvent.setCustomInteger(Reporting.Key.TIME_TO_LOAD, j);
            C38595Ad c38595Ad = this.mAd;
            if (c38595Ad != null) {
                reportingEvent.setImpId(c38595Ad.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        if (th instanceof HyBidError) {
            HyBidError hyBidError = (HyBidError) th;
            if (hyBidError.getErrorCode() == HyBidErrorCode.NO_FILL) {
                Logger.m14225w(TAG, th.getMessage());
            } else {
                Logger.m14227e(TAG, th.getMessage());
            }
            sendLoadTracker(Integer.valueOf(hyBidError.getErrorCode().getCode()));
        } else {
            sendLoadTracker(Integer.valueOf(HyBidErrorCode.UNKNOWN_ERROR.getCode()));
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onInterstitialLoadFailed(th);
        }
    }

    protected void invokeOnLoadFinished() {
        long j = -1;
        if (this.mInitialLoadTime != -1) {
            j = System.currentTimeMillis() - this.mInitialLoadTime;
            JsonOperations.putJsonLong(this.mPlacementParams, Reporting.Key.TIME_TO_LOAD, j);
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load");
            reportingEvent.setAdFormat("fullscreen");
            reportingEvent.setPlatform("android");
            RequestManager requestManager = this.mRequestManager;
            if (requestManager != null) {
                reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(requestManager.getIntegrationType()));
            }
            reportingEvent.setCustomInteger(Reporting.Key.TIME_TO_LOAD, j);
            C38595Ad c38595Ad = this.mAd;
            if (c38595Ad != null) {
                reportingEvent.setImpId(c38595Ad.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.mergeJSONObject(getPlacementParams());
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onInterstitialLoaded();
        }
    }

    public boolean isAutoCacheOnLoad() {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            return requestManager.isAutoCacheOnLoad();
        }
        return true;
    }

    public boolean isReady() {
        return this.mReady;
    }

    public void load() {
        addReportingKey("timestamp", String.valueOf(System.currentTimeMillis()));
        if (HyBid.getAppToken() != null) {
            addReportingKey(Reporting.Key.APP_TOKEN, HyBid.getAppToken());
        }
        addReportingKey("ad_type", "fullscreen");
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && requestManager.getAdSize() != null) {
            addReportingKey("ad_size", this.mRequestManager.getAdSize().toString());
        }
        addReportingKey("integration_type", IntegrationType.STANDALONE);
        if (!HyBid.isInitialized()) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NOT_INITIALISED));
        } else if (TextUtils.isEmpty(this.mZoneId)) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
        } else {
            cleanup();
            this.mInitialLoadTime = System.currentTimeMillis();
            if (this.mRequestManager != null) {
                if (!TextUtils.isEmpty(this.mAppToken)) {
                    this.mRequestManager.setAppToken(this.mAppToken);
                }
                this.mRequestManager.setZoneId(this.mZoneId);
                this.mRequestManager.setRequestListener(this);
                this.mRequestManager.requestAd();
            }
        }
    }

    public void loadExchangeAd(String str) {
        addReportingKey("timestamp", String.valueOf(System.currentTimeMillis()));
        if (HyBid.getAppToken() != null) {
            addReportingKey(Reporting.Key.APP_TOKEN, HyBid.getAppToken());
        }
        addReportingKey("ad_type", "fullscreen");
        this.mORTBRequestManager.setAdSize(AdSize.SIZE_INTERSTITIAL);
        addReportingKey("ad_size", this.mORTBRequestManager.getAdSize().toString());
        addReportingKey("integration_type", IntegrationType.STANDALONE);
        if (!HyBid.isInitialized()) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NOT_INITIALISED));
        } else if (TextUtils.isEmpty(this.mZoneId)) {
            this.mInitialLoadTime = System.currentTimeMillis();
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
        } else {
            cleanup();
            this.mInitialLoadTime = System.currentTimeMillis();
            if (!TextUtils.isEmpty(this.mAppToken)) {
                this.mORTBRequestManager.setAppToken(this.mAppToken);
            }
            if (!TextUtils.isEmpty(str)) {
                this.mORTBRequestManager.setAdFormat(str);
            }
            this.mORTBRequestManager.setZoneId(this.mZoneId);
            this.mORTBRequestManager.setRequestListener(this);
            this.mORTBRequestManager.requestAd();
        }
    }

    @Override // net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialClicked(InterstitialPresenter interstitialPresenter) {
        invokeOnClick();
    }

    @Override // net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialDismissed(InterstitialPresenter interstitialPresenter) {
        invokeOnDismissed();
    }

    @Override // net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialError(InterstitialPresenter interstitialPresenter) {
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.ERROR_RENDERING_INTERSTITIAL));
    }

    @Override // net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialLoaded(InterstitialPresenter interstitialPresenter) {
        this.mReady = true;
        invokeOnLoadFinished();
    }

    @Override // net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenter.Listener
    public void onInterstitialShown(InterstitialPresenter interstitialPresenter) {
        Context context;
        if (this.mInitialRenderTime != -1) {
            addReportingKey(Reporting.Key.RENDER_TIME, Long.valueOf(System.currentTimeMillis() - this.mInitialRenderTime));
        }
        reportAdRender("fullscreen", getPlacementParams());
        String str = this.mZoneId;
        if (str != null && !TextUtils.isEmpty(str) && (context = this.mContext) != null) {
            new SessionImpressionPrefs(context).insert(this.mZoneId);
        }
        invokeOnImpression();
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestFail(Throwable th) {
        invokeOnLoadFailed(th);
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestSuccess(C38595Ad c38595Ad) {
        if (c38595Ad == null) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NULL_AD));
            return;
        }
        this.mAd = c38595Ad;
        initializeAdTracker();
        checkRemoteConfigs();
        renderAd();
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoDismissed(int i) {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoDismissed(i);
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoError(int i) {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoError(i);
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoFinished() {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoFinished();
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoSkipped() {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoSkipped();
        }
    }

    @Override // net.pubnative.lite.sdk.VideoListener
    public void onVideoStarted() {
        VideoListener videoListener = this.mVideoListener;
        if (videoListener != null) {
            videoListener.onVideoStarted();
        }
    }

    public void prepare() {
        prepare(null);
    }

    public void prepareAd(String str) {
        if (!TextUtils.isEmpty(str)) {
            SignalDataProcessor signalDataProcessor = new SignalDataProcessor();
            this.mSignalDataProcessor = signalDataProcessor;
            signalDataProcessor.processSignalData(str, new SignalDataProcessor.Listener() { // from class: net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd.1
                @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
                public void onError(Throwable th) {
                    HyBidInterstitialAd.this.invokeOnLoadFailed(th);
                }

                @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
                public void onProcessed(C38595Ad c38595Ad) {
                    if (c38595Ad != null) {
                        HyBidInterstitialAd.this.prepareAd(c38595Ad);
                    }
                }
            });
            return;
        }
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_SIGNAL_DATA));
    }

    public void prepareCustomMarkup(String str) {
        prepareCustomMarkup("", str);
    }

    public void prepareVideoTag(String str) {
        prepareVideoTag("", str);
    }

    public void reportAdRender(String str, JSONObject jSONObject) {
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType(Reporting.EventType.RENDER);
            reportingEvent.setAdFormat(str);
            reportingEvent.setPlatform("android");
            RequestManager requestManager = this.mRequestManager;
            if (requestManager != null) {
                reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(requestManager.getIntegrationType()));
            }
            reportingEvent.setHasEndCard(hasEndCard());
            C38595Ad c38595Ad = this.mAd;
            if (c38595Ad != null) {
                reportingEvent.setImpId(c38595Ad.getSessionId());
                reportingEvent.setCampaignId(this.mAd.getCampaignId());
                reportingEvent.setConfigId(this.mAd.getConfigId());
            }
            reportingEvent.mergeJSONObject(jSONObject);
            HyBid.getReportingController().reportEvent(reportingEvent);
        }
    }

    public void setAutoCacheOnLoad(boolean z) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setAutoCacheOnLoad(z);
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.setAutoCacheOnLoad(z);
        }
    }

    public void setCustomUrl(String str) {
        this.mCustomUrl = str;
    }

    public void setMediation(boolean z) {
        IntegrationType integrationType;
        IntegrationType integrationType2;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            if (z) {
                integrationType2 = IntegrationType.MEDIATION;
            } else {
                integrationType2 = IntegrationType.STANDALONE;
            }
            requestManager.setIntegrationType(integrationType2);
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            if (z) {
                integrationType = IntegrationType.MEDIATION;
            } else {
                integrationType = IntegrationType.STANDALONE;
            }
            requestManager2.setIntegrationType(integrationType);
        }
    }

    public void setMediationVendor(String str) {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            requestManager.setMediationVendor(str);
        }
        RequestManager requestManager2 = this.mORTBRequestManager;
        if (requestManager2 != null) {
            requestManager2.setMediationVendor(str);
        }
    }

    public void setVideoListener(VideoListener videoListener) {
        this.mVideoListener = videoListener;
    }

    public boolean show() {
        if (this.mPresenter != null && this.mReady) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mInitialRenderTime = currentTimeMillis;
            long j = this.mInitialLoadTime;
            if (currentTimeMillis >= TIME_TO_EXPIRE + j && j != -1) {
                Logger.m14227e(TAG, "Ad has expired.");
                cleanup();
                invokeOnLoadFailed(new HyBidError(HyBidErrorCode.EXPIRED_AD));
                return false;
            }
            this.mPresenter.show();
            return true;
        }
        Logger.m14227e(TAG, "Can't display ad. Interstitial not ready.");
        return false;
    }

    public HyBidInterstitialAd(Activity activity, String str, Listener listener) {
        this((Context) activity, str, listener);
    }

    public void prepare(CacheListener cacheListener) {
        C38595Ad c38595Ad;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager == null || (c38595Ad = this.mAd) == null) {
            return;
        }
        requestManager.cacheAd(c38595Ad, cacheListener);
    }

    public void prepareCustomMarkup(String str, final String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.mZoneId = str;
            if (MarkupUtils.isVastXml(str2)) {
                if (TextUtils.isEmpty(this.mZoneId)) {
                    this.mZoneId = Protocol.VAST_1_0_WRAPPER;
                    JsonOperations.putJsonString(this.mPlacementParams, "zone_id", Protocol.VAST_1_0_WRAPPER);
                }
                final C38595Ad.AdType adType = C38595Ad.AdType.VIDEO;
                new VideoAdProcessor().process(this.mContext, str2, null, new VideoAdProcessor.Listener() { // from class: net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd.2
                    @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                    public void onCacheError(Throwable th) {
                        if (HyBidInterstitialAd.this.mIsDestroyed) {
                            return;
                        }
                        Logger.m14224w(HyBidInterstitialAd.TAG, "onCacheError", th);
                        HyBidInterstitialAd.this.invokeOnLoadFailed(th);
                    }

                    @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                    public void onCacheSuccess(AdParams adParams, String str3, EndCardData endCardData, String str4, List<String> list) {
                        boolean z;
                        if (HyBidInterstitialAd.this.mIsDestroyed) {
                            return;
                        }
                        if (list != null && !list.isEmpty()) {
                            JsonOperations.putStringArray(HyBidInterstitialAd.this.mPlacementParams, Reporting.Key.OM_VENDORS, list);
                        }
                        if (adParams.getEndCardList() != null && !adParams.getEndCardList().isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        VideoAdCacheItem videoAdCacheItem = new VideoAdCacheItem(adParams, str3, endCardData, str4);
                        HyBidInterstitialAd.this.mAd = new C38595Ad(r2, str2, adType);
                        HyBidInterstitialAd.this.mAd.setHasEndCard(z);
                        HyBidInterstitialAd.this.initializeAdTracker();
                        HyBid.getAdCache().put(HyBidInterstitialAd.this.mZoneId, HyBidInterstitialAd.this.mAd);
                        HyBid.getVideoAdCache().put(HyBidInterstitialAd.this.mZoneId, videoAdCacheItem);
                        HyBidInterstitialAd.this.checkRemoteConfigs();
                        IntegrationType integrationType = IntegrationType.IN_APP_BIDDING;
                        if (HyBidInterstitialAd.this.mRequestManager != null) {
                            integrationType = HyBidInterstitialAd.this.mRequestManager.getIntegrationType();
                        }
                        IntegrationType integrationType2 = integrationType;
                        HyBidInterstitialAd.this.mPresenter = new InterstitialPresenterFactory(HyBidInterstitialAd.this.mContext, HyBidInterstitialAd.this.mZoneId).createInterstitialPresenter(HyBidInterstitialAd.this.mAd, HyBidInterstitialAd.this.mHtmlSkipOffset, HyBidInterstitialAd.this.mVideoSkipOffset, HyBidInterstitialAd.this, integrationType2);
                        if (HyBidInterstitialAd.this.mPresenter != null) {
                            HyBidInterstitialAd.this.mPresenter.setVideoListener(HyBidInterstitialAd.this);
                            HyBidInterstitialAd.this.mPresenter.load();
                            return;
                        }
                        HyBidInterstitialAd.this.invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
                    }
                });
            } else {
                if (TextUtils.isEmpty(this.mZoneId)) {
                    this.mZoneId = "3";
                }
                C38595Ad c38595Ad = new C38595Ad(21, str2, C38595Ad.AdType.HTML);
                this.mAd = c38595Ad;
                c38595Ad.setZoneId(this.mZoneId);
                this.mAd.setHasEndCard(hasEndCard());
                initializeAdTracker();
                HyBid.getAdCache().put(this.mZoneId, this.mAd);
                checkRemoteConfigs();
                IntegrationType integrationType = IntegrationType.IN_APP_BIDDING;
                RequestManager requestManager = this.mRequestManager;
                if (requestManager != null) {
                    integrationType = requestManager.getIntegrationType();
                }
                InterstitialPresenter createInterstitialPresenter = new InterstitialPresenterFactory(this.mContext, this.mZoneId).createInterstitialPresenter(this.mAd, this.mHtmlSkipOffset, this.mVideoSkipOffset, this, integrationType);
                this.mPresenter = createInterstitialPresenter;
                if (createInterstitialPresenter != null) {
                    createInterstitialPresenter.setVideoListener(this);
                    this.mPresenter.load();
                } else {
                    invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
                }
            }
            JsonOperations.putJsonString(this.mPlacementParams, "zone_id", this.mZoneId);
            return;
        }
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ASSET));
    }

    public void prepareVideoTag(final String str, String str2) {
        final String formatURL = VastUrlUtils.formatURL(str2);
        HashMap hashMap = new HashMap();
        String userAgent = HyBid.getDeviceInfo().getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            hashMap.put("User-Agent", userAgent);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        PNHttpClient.makeRequest(this.mContext, formatURL, hashMap, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd.3
            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFailure(Throwable th) {
                String str3 = HyBidInterstitialAd.TAG;
                Logger.m14227e(str3, "Request failed: " + th.toString());
                HyBidInterstitialAd.this.invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ASSET));
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onSuccess(String str3, Map<String, List<String>> map) {
                HyBidInterstitialAd.this.registerAdRequest(formatURL, str3, currentTimeMillis);
                if (!TextUtils.isEmpty(str3)) {
                    HyBidInterstitialAd.this.prepareCustomMarkup(str, str3);
                }
            }
        });
    }

    public HyBidInterstitialAd(Context context, String str, Listener listener) {
        this(context, null, str, listener);
    }

    public HyBidInterstitialAd(Context context, String str, String str2, Listener listener) {
        this.mReady = false;
        this.mIsDestroyed = false;
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        if (!HyBid.isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before creating a HyBidInterstitialAd");
        }
        this.mRequestManager = new InterstitialRequestManager();
        this.mORTBRequestManager = new RequestManager(new OpenRTBApiClient(context), new OpenRTBAdRequestFactory());
        this.mContext = context;
        this.mAppToken = str;
        this.mZoneId = str2;
        this.mListener = listener;
        this.mPlacementParams = new JSONObject();
        addReportingKey("zone_id", this.mZoneId);
        this.mHtmlSkipOffset = new SkipOffset(SkipOffsetManager.getDefaultHtmlInterstitialSkipOffset().intValue(), false);
        this.mVideoSkipOffset = new SkipOffset(SkipOffsetManager.getDefaultVideoWithoutEndCardSkipOffset().intValue(), false);
        RequestManager requestManager = this.mRequestManager;
        IntegrationType integrationType = IntegrationType.STANDALONE;
        requestManager.setIntegrationType(integrationType);
        this.mORTBRequestManager.setIntegrationType(integrationType);
    }

    public void prepareAd(C38595Ad c38595Ad) {
        if (c38595Ad != null) {
            this.mAd = c38595Ad;
            initializeAdTracker();
            checkRemoteConfigs();
            C38595Ad c38595Ad2 = this.mAd;
            if (c38595Ad2 != null && c38595Ad2.getZoneId() != null && !this.mAd.getZoneId().equalsIgnoreCase(this.mZoneId)) {
                String zoneId = this.mAd.getZoneId();
                this.mZoneId = zoneId;
                JsonOperations.putJsonString(this.mPlacementParams, "zone_id", zoneId);
            } else if (this.mZoneId == null) {
                this.mZoneId = Protocol.VAST_1_0_WRAPPER;
            }
            IntegrationType integrationType = IntegrationType.IN_APP_BIDDING;
            RequestManager requestManager = this.mRequestManager;
            if (requestManager != null) {
                integrationType = requestManager.getIntegrationType();
            }
            InterstitialPresenter createInterstitialPresenter = new InterstitialPresenterFactory(this.mContext, this.mZoneId).createInterstitialPresenter(this.mAd, this.mHtmlSkipOffset, this.mVideoSkipOffset, this, integrationType);
            this.mPresenter = createInterstitialPresenter;
            if (createInterstitialPresenter != null) {
                createInterstitialPresenter.setVideoListener(this);
                this.mPresenter.load();
                return;
            }
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
            return;
        }
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_AD));
    }

    public void loadExchangeAd() {
        loadExchangeAd(null);
    }
}
