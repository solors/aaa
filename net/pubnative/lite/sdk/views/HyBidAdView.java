package net.pubnative.lite.sdk.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.smaato.sdk.video.vast.model.VastTree;
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
import net.pubnative.lite.sdk.api.OpenRTBApiClient;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.banner.presenter.BannerPresenterFactory;
import net.pubnative.lite.sdk.models.APIAsset;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.models.C38595Ad;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.ImpressionTrackingMethod;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.models.OpenRTBAdRequestFactory;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import net.pubnative.lite.sdk.mraid.utils.MraidCloseAdRepo;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.prefs.SessionImpressionPrefs;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.AdTracker;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.MarkupUtils;
import net.pubnative.lite.sdk.utils.SignalDataProcessor;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.utils.json.JsonOperations;
import net.pubnative.lite.sdk.views.endcard.HyBidEndCardView;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdProcessor;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.vast.VastUrlUtils;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class HyBidAdView extends FrameLayout implements RequestManager.RequestListener, AdPresenter.Listener, AdPresenter.ImpressionListener, VideoListener, MRAIDViewListener, MraidCloseAdRepo.ICloseAdObserver {
    private static final String TAG = "HyBidAdView";
    private static final int TIME_TO_EXPIRE = 1800000;
    protected C38595Ad mAd;
    private final String mAdFormat;
    private AdTracker mAdTracker;
    private String mAppToken;
    private Long mAutoRefreshTime;
    private boolean mAutoShowOnLoad;
    private FrameLayout mContainer;
    private HyBidEndCardView mEndCardView;
    private final Handler mHandler;
    private long mInitialLoadTime;
    private long mInitialRenderTime;
    private IntegrationType mIntegrationType;
    private boolean mIsDestroyed;
    protected Listener mListener;
    private RequestManager mORTBRequestManager;
    private JSONObject mPlacementParams;
    private Position mPosition;
    private AdPresenter mPresenter;
    protected MRAIDViewListener mRaidListener;
    private RequestManager mRequestManager;
    private String mScreenIabCategory;
    private String mScreenKeywords;
    private SignalDataProcessor mSignalDataProcessor;
    private ImpressionTrackingMethod mTrackingMethod;
    private String mUserIntent;
    protected VideoListener mVideoListener;
    private WindowManager mWindowManager;
    private String mZoneId;

    /* renamed from: net.pubnative.lite.sdk.views.HyBidAdView$4 */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class C387224 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$models$AdSize;

        static {
            int[] iArr = new int[AdSize.values().length];
            $SwitchMap$net$pubnative$lite$sdk$models$AdSize = iArr;
            try {
                iArr[AdSize.SIZE_300x250.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$models$AdSize[AdSize.SIZE_728x90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes10.dex */
    public interface Listener {
        void onAdClick();

        void onAdImpression();

        void onAdLoadFailed(Throwable th);

        void onAdLoaded();
    }

    /* loaded from: classes10.dex */
    public enum Position {
        TOP,
        BOTTOM
    }

    public HyBidAdView(Context context) {
        super(context);
        this.mAutoShowOnLoad = true;
        this.mAdFormat = "banner";
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        this.mIntegrationType = IntegrationType.IN_APP_BIDDING;
        this.mTrackingMethod = ImpressionTrackingMethod.AD_VIEWABLE;
        this.mAutoRefreshTime = 0L;
        this.mAppToken = null;
        this.mZoneId = null;
        this.mHandler = new Handler(Looper.getMainLooper());
        init(getRequestManager(), getORTBRequestManager());
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

    public void getAdTypeAndCreative(ReportingEvent reportingEvent) {
        C38595Ad c38595Ad;
        if (reportingEvent != null && (c38595Ad = this.mAd) != null) {
            int i = c38595Ad.assetgroupid;
            if (i != 4 && i != 15) {
                reportingEvent.setAdType("HTML");
                reportingEvent.setCreative(this.mAd.getAssetHtml(APIAsset.HTML_BANNER));
                return;
            }
            reportingEvent.setAdType(VastTree.VAST);
            reportingEvent.setCreative(this.mAd.getVast());
        }
    }

    private void init(RequestManager requestManager, RequestManager requestManager2) {
        if (!HyBid.isInitialized()) {
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before creating an AdView");
        }
        this.mRequestManager = requestManager;
        this.mORTBRequestManager = requestManager2;
        IntegrationType integrationType = IntegrationType.STANDALONE;
        requestManager.setIntegrationType(integrationType);
        this.mORTBRequestManager.setIntegrationType(integrationType);
        this.mPlacementParams = new JSONObject();
        initEndCardView();
    }

    private void initEndCardView() {
        this.mEndCardView = new HyBidEndCardView(getContext());
        this.mEndCardView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.mEndCardView);
    }

    public void initializeAdTracker(C38595Ad c38595Ad) {
        if (c38595Ad != null) {
            this.mAdTracker = new AdTracker(c38595Ad.getBeacons("impression"), c38595Ad.getBeacons("click"), c38595Ad.getBeacons(C38595Ad.Beacon.SDK_EVENT), c38595Ad.getBeacons(C38595Ad.Beacon.COMPANION_AD_EVENT), c38595Ad.getBeacons(C38595Ad.Beacon.CUSTOM_ENDCARD_EVENT));
        }
    }

    public /* synthetic */ void lambda$refresh$0() {
        load(this.mAppToken, this.mZoneId, this.mListener);
    }

    public /* synthetic */ void lambda$refresh$1() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            if (this.mAutoRefreshTime.longValue() > 0) {
                this.mHandler.postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.views.b
                    {
                        HyBidAdView.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        HyBidAdView.this.lambda$refresh$0();
                    }
                }, this.mAutoRefreshTime.longValue());
            }
        }
    }

    private void refresh() {
        postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.views.c
            {
                HyBidAdView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                HyBidAdView.this.lambda$refresh$1();
            }
        }, 100L);
    }

    protected void cleanup() {
        stopTracking();
        removeAllViews();
        this.mAd = null;
        this.mPlacementParams = new JSONObject();
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        AdPresenter adPresenter = this.mPresenter;
        if (adPresenter != null) {
            adPresenter.destroy();
            this.mPresenter = null;
        }
        if (this.mAdTracker != null) {
            this.mAdTracker = null;
        }
        SignalDataProcessor signalDataProcessor = this.mSignalDataProcessor;
        if (signalDataProcessor != null) {
            signalDataProcessor.destroy();
            this.mSignalDataProcessor = null;
        }
        if (this.mWindowManager != null && this.mContainer.isShown()) {
            this.mWindowManager.removeViewImmediate(this.mContainer);
            this.mWindowManager = null;
            this.mContainer = null;
        }
    }

    protected AdPresenter createPresenter() {
        this.mInitialRenderTime = System.currentTimeMillis();
        AdSize adSize = AdSize.SIZE_320x50;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && requestManager.getAdSize() != null) {
            adSize = this.mRequestManager.getAdSize();
        }
        return new BannerPresenterFactory(getContext(), this.mIntegrationType).createPresenter(this.mAd, this.mAdTracker, adSize, this.mTrackingMethod, this, this);
    }

    public void destroy() {
        stopAutoRefresh();
        cleanup();
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
        this.mIsDestroyed = true;
        this.mListener = null;
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

    protected String getLogTag() {
        return HyBidAdView.class.getSimpleName();
    }

    RequestManager getORTBRequestManager() {
        return new RequestManager(new OpenRTBApiClient(getContext()), new OpenRTBAdRequestFactory());
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
        AdPresenter adPresenter = this.mPresenter;
        if (adPresenter != null && (placementParams = adPresenter.getPlacementParams()) != null) {
            JsonOperations.mergeJsonObjects(jSONObject, placementParams);
        }
        return jSONObject;
    }

    RequestManager getRequestManager() {
        return new RequestManager();
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
            listener.onAdClick();
        }
    }

    protected void invokeOnImpression() {
        String str = this.mZoneId;
        if (str != null && !TextUtils.isEmpty(str) && getContext() != null) {
            new SessionImpressionPrefs(getContext()).insert(this.mZoneId);
        }
        AdTracker adTracker = this.mAdTracker;
        if (adTracker != null) {
            adTracker.trackSdkEvent(2, null);
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onAdImpression();
        }
    }

    protected void invokeOnLoadFailed(Throwable th) {
        long j = -1;
        if (this.mInitialLoadTime != -1) {
            j = System.currentTimeMillis() - this.mInitialLoadTime;
            addReportingKey(Reporting.Key.TIME_TO_LOAD_FAILED, Long.valueOf(j));
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType(Reporting.EventType.LOAD_FAIL);
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
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
                Logger.m14225w(getLogTag(), th.getMessage());
            } else {
                Logger.m14227e(getLogTag(), th.getMessage());
            }
            AdTracker adTracker = this.mAdTracker;
            if (adTracker != null) {
                adTracker.trackSdkEvent(1, Integer.valueOf(hyBidError.getErrorCode().getCode()));
            }
        } else {
            AdTracker adTracker2 = this.mAdTracker;
            if (adTracker2 != null) {
                adTracker2.trackSdkEvent(1, Integer.valueOf(HyBidErrorCode.UNKNOWN_ERROR.getCode()));
            }
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onAdLoadFailed(th);
        }
    }

    protected void invokeOnLoadFinished() {
        long j = -1;
        if (this.mInitialLoadTime != -1) {
            j = System.currentTimeMillis() - this.mInitialLoadTime;
            addReportingKey(Reporting.Key.TIME_TO_LOAD, Long.valueOf(j));
        }
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType("load");
            reportingEvent.setAdFormat("banner");
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
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
        AdTracker adTracker = this.mAdTracker;
        if (adTracker != null) {
            adTracker.trackSdkEvent(1, null);
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onAdLoaded();
        }
    }

    public boolean isAutoCacheOnLoad() {
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null) {
            return requestManager.isAutoCacheOnLoad();
        }
        return true;
    }

    public boolean isAutoShowOnLoad() {
        return this.mAutoShowOnLoad;
    }

    public void load(String str, Position position, Listener listener) {
        this.mPosition = position;
        load(str, listener);
    }

    public void loadCustomExchangeAd(String str, Listener listener) {
        loadExchangeAd(str, "", "", listener);
    }

    public void loadExchangeAd(String str, Position position, Listener listener) {
        this.mPosition = position;
        loadExchangeAd(str, listener);
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewExpand(MRAIDView mRAIDView) {
        Log.d("mraidview", "expanded");
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4) {
        return false;
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter.Listener
    public void onAdClicked(AdPresenter adPresenter) {
        invokeOnClick();
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter.Listener
    public void onAdError(AdPresenter adPresenter) {
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.ERROR_RENDERING_BANNER));
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter.Listener
    public void onAdLoaded(AdPresenter adPresenter, View view) {
        if (view == null) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.ERROR_RENDERING_BANNER));
        } else {
            setupAdView(view);
        }
    }

    @Override // net.pubnative.lite.sdk.mraid.utils.MraidCloseAdRepo.ICloseAdObserver
    public void onCloseExpandedAd() {
        destroy();
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void onExpandedAdClosed() {
        MRAIDViewListener mRAIDViewListener = this.mRaidListener;
        if (mRAIDViewListener != null) {
            mRAIDViewListener.onExpandedAdClosed();
        }
    }

    @Override // net.pubnative.lite.sdk.presenter.AdPresenter.ImpressionListener
    public void onImpression() {
        reportAdRender("banner", getPlacementParams());
        invokeOnImpression();
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestFail(Throwable th) {
        refresh();
        invokeOnLoadFailed(th);
    }

    @Override // net.pubnative.lite.sdk.api.RequestManager.RequestListener
    public void onRequestSuccess(C38595Ad c38595Ad) {
        refresh();
        if (c38595Ad == null) {
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NULL_AD));
            return;
        }
        this.mAd = c38595Ad;
        if (this.mAutoShowOnLoad) {
            renderAd();
        } else {
            invokeOnLoadFinished();
        }
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

    public void renderAd() {
        if (System.currentTimeMillis() < this.mInitialLoadTime + 1800000) {
            if (this.mPresenter == null) {
                AdPresenter createPresenter = createPresenter();
                this.mPresenter = createPresenter;
                if (createPresenter != null) {
                    createPresenter.setVideoListener(this);
                    this.mPresenter.load();
                    return;
                }
                HyBidErrorCode hyBidErrorCode = HyBidErrorCode.UNSUPPORTED_ASSET;
                invokeOnLoadFailed(new HyBidError(hyBidErrorCode));
                if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
                    return;
                }
                ReportingEvent reportingEvent = new ReportingEvent();
                reportingEvent.setAppToken(HyBid.getAppToken());
                reportingEvent.setEventType(Reporting.EventType.RENDER_ERROR);
                reportingEvent.setPlatform("android");
                reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
                reportingEvent.setErrorCode(hyBidErrorCode.getCode());
                reportingEvent.setErrorMessage(hyBidErrorCode.getMessage());
                reportingEvent.setTimestamp(System.currentTimeMillis());
                reportingEvent.setAdFormat("banner");
                C38595Ad c38595Ad = this.mAd;
                if (c38595Ad != null) {
                    reportingEvent.setImpId(c38595Ad.getSessionId());
                    reportingEvent.setCampaignId(this.mAd.getCampaignId());
                    reportingEvent.setConfigId(this.mAd.getConfigId());
                }
                RequestManager requestManager = this.mRequestManager;
                if (requestManager != null && requestManager.getAdSize() != null) {
                    reportingEvent.setAdSize(this.mRequestManager.getAdSize().toString());
                }
                reportingEvent.setIntegrationType(this.mIntegrationType.getCode());
                C38595Ad c38595Ad2 = this.mAd;
                if (c38595Ad2 != null) {
                    if (!TextUtils.isEmpty(c38595Ad2.getVast())) {
                        reportingEvent.setVast(this.mAd.getVast());
                    }
                    if (!TextUtils.isEmpty(this.mAd.getZoneId())) {
                        reportingEvent.setZoneId(this.mAd.getZoneId());
                    }
                }
                reportingEvent.mergeJSONObject(getPlacementParams());
                getAdTypeAndCreative(reportingEvent);
                HyBid.getReportingController().reportEvent(reportingEvent);
                return;
            }
            Logger.m14227e(TAG, "Ad is already rendering. Dropping call.");
            return;
        }
        Logger.m14227e(TAG, "Ad has expired.");
        cleanup();
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.EXPIRED_AD));
    }

    public void renderCustomMarkup(final String str, Listener listener) {
        RequestManager requestManager;
        cleanup();
        this.mInitialLoadTime = System.currentTimeMillis();
        this.mListener = listener;
        if (!TextUtils.isEmpty(str) && (requestManager = this.mRequestManager) != null) {
            int i = C387224.$SwitchMap$net$pubnative$lite$sdk$models$AdSize[requestManager.getAdSize().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C38595Ad c38595Ad = new C38595Ad(10, str, C38595Ad.AdType.HTML);
                    this.mAd = c38595Ad;
                    c38595Ad.setZoneId("2");
                    renderFromCustomAd();
                    return;
                }
                C38595Ad c38595Ad2 = new C38595Ad(24, str, C38595Ad.AdType.HTML);
                this.mAd = c38595Ad2;
                c38595Ad2.setZoneId("8");
                renderFromCustomAd();
                return;
            } else if (MarkupUtils.isVastXml(str)) {
                final C38595Ad.AdType adType = C38595Ad.AdType.VIDEO;
                new VideoAdProcessor().process(getContext(), str, AdSize.SIZE_300x250, new VideoAdProcessor.Listener() { // from class: net.pubnative.lite.sdk.views.HyBidAdView.3
                    {
                        HyBidAdView.this = this;
                    }

                    @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                    public void onCacheError(Throwable th) {
                        if (HyBidAdView.this.mIsDestroyed) {
                            return;
                        }
                        Logger.m14224w(HyBidAdView.TAG, "onCacheError", th);
                        HyBidAdView.this.invokeOnLoadFailed(th);
                    }

                    @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                    public void onCacheSuccess(AdParams adParams, String str2, EndCardData endCardData, String str3, List<String> list) {
                        boolean z;
                        if (HyBidAdView.this.mIsDestroyed) {
                            return;
                        }
                        if (list != null && !list.isEmpty()) {
                            JsonOperations.putStringArray(HyBidAdView.this.mPlacementParams, Reporting.Key.OM_VENDORS, list);
                        }
                        if (adParams.getEndCardList() != null && !adParams.getEndCardList().isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        VideoAdCacheItem videoAdCacheItem = new VideoAdCacheItem(adParams, str2, endCardData, str3);
                        HyBidAdView.this.mAd = new C38595Ad(r2, str, adType);
                        HyBidAdView.this.mAd.setZoneId(r5);
                        HyBidAdView.this.mAd.setHasEndCard(z);
                        HyBid.getAdCache().put(r5, HyBidAdView.this.mAd);
                        HyBid.getVideoAdCache().put(r5, videoAdCacheItem);
                        HyBidAdView.this.renderFromCustomAd();
                    }
                });
                return;
            } else {
                C38595Ad c38595Ad3 = new C38595Ad(8, str, C38595Ad.AdType.HTML);
                this.mAd = c38595Ad3;
                c38595Ad3.setZoneId("5");
                renderFromCustomAd();
                return;
            }
        }
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ASSET));
    }

    protected void renderFromCustomAd() {
        AdPresenter createPresenter = createPresenter();
        this.mPresenter = createPresenter;
        if (createPresenter != null) {
            createPresenter.setVideoListener(this);
            this.mPresenter.setMRaidListener(this);
            this.mPresenter.load();
            return;
        }
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.UNSUPPORTED_ASSET));
    }

    public void renderVideoTag(String str, final Listener listener) {
        String formatURL = VastUrlUtils.formatURL(str);
        HashMap hashMap = new HashMap();
        String userAgent = HyBid.getDeviceInfo().getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            hashMap.put("User-Agent", userAgent);
        }
        PNHttpClient.makeRequest(getContext(), formatURL, hashMap, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.views.HyBidAdView.2
            {
                HyBidAdView.this = this;
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFailure(Throwable th) {
                String str2 = HyBidAdView.TAG;
                Logger.m14227e(str2, "Request failed: " + th.toString());
                HyBidAdView.this.invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ASSET));
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onSuccess(String str2, Map<String, List<String>> map) {
                if (!TextUtils.isEmpty(str2)) {
                    HyBidAdView.this.renderCustomMarkup(str2, listener);
                }
            }
        });
    }

    public void reportAdRender(String str, JSONObject jSONObject) {
        if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
            ReportingEvent reportingEvent = new ReportingEvent();
            reportingEvent.setEventType(Reporting.EventType.RENDER);
            reportingEvent.setPlatform("android");
            reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
            reportingEvent.setAdFormat(str);
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

    public void setAdSize(AdSize adSize) {
        this.mRequestManager.setAdSize(adSize);
        this.mORTBRequestManager.setAdSize(adSize);
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

    public void setAutoRefreshTimeInSeconds(int i) {
        if (this.mAutoShowOnLoad) {
            this.mAutoRefreshTime = Long.valueOf(i * 1000);
        }
    }

    public void setAutoShowOnLoad(boolean z) {
        this.mAutoShowOnLoad = z;
        if (!z) {
            stopAutoRefresh();
        }
    }

    public void setIsAdSticky(boolean z) {
        MraidCloseAdRepo.getInstance().setIsAdSticky(z);
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
        if (z) {
            this.mIntegrationType = IntegrationType.MEDIATION;
        } else {
            this.mIntegrationType = IntegrationType.STANDALONE;
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

    public void setMraidListener(MRAIDViewListener mRAIDViewListener) {
        this.mRaidListener = mRAIDViewListener;
    }

    public void setPosition(Position position) {
        this.mPosition = position;
    }

    public void setScreenIabCategory(String str) {
        this.mScreenIabCategory = str;
    }

    public void setScreenKeywords(String str) {
        this.mScreenKeywords = str;
    }

    public void setTrackingMethod(ImpressionTrackingMethod impressionTrackingMethod) {
        if (impressionTrackingMethod != null) {
            this.mTrackingMethod = impressionTrackingMethod;
        }
    }

    public void setUserIntent(String str) {
        this.mUserIntent = str;
    }

    public void setVideoListener(VideoListener videoListener) {
        this.mVideoListener = videoListener;
    }

    protected void setupAdView(View view) {
        Position position = this.mPosition;
        if (position == null) {
            AdSize adSize = AdSize.SIZE_320x50;
            int width = adSize.getWidth();
            int height = adSize.getHeight();
            RequestManager requestManager = this.mRequestManager;
            if (requestManager != null && requestManager.getAdSize() != null) {
                width = (int) ViewUtils.convertDpToPixel(this.mRequestManager.getAdSize().getWidth(), getContext());
                height = (int) ViewUtils.convertDpToPixel(this.mRequestManager.getAdSize().getHeight(), getContext());
            }
            if (view.getParent() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
                layoutParams.gravity = 17;
                addView(view, layoutParams);
            }
            if (this.mAutoShowOnLoad) {
                invokeOnLoadFinished();
            }
            startTracking();
            if (this.mInitialRenderTime != -1) {
                addReportingKey(Reporting.Key.RENDER_TIME, Long.valueOf(System.currentTimeMillis() - this.mInitialRenderTime));
                return;
            }
            return;
        }
        show(view, position);
    }

    public void show() {
        renderAd();
    }

    protected void startTracking() {
        AdPresenter adPresenter = this.mPresenter;
        if (adPresenter != null) {
            adPresenter.startTracking();
        }
    }

    public void stopAutoRefresh() {
        this.mAutoRefreshTime = 0L;
        this.mHandler.removeCallbacksAndMessages(null);
    }

    protected void stopTracking() {
        AdPresenter adPresenter = this.mPresenter;
        if (adPresenter != null) {
            adPresenter.stopTracking();
        }
    }

    RequestManager getORTBRequestManager(AdSize adSize) {
        return new RequestManager(adSize, new OpenRTBApiClient(getContext()), new OpenRTBAdRequestFactory());
    }

    RequestManager getRequestManager(AdSize adSize) {
        return new RequestManager(adSize);
    }

    public void prepare(CacheListener cacheListener) {
        C38595Ad c38595Ad;
        RequestManager requestManager = this.mRequestManager;
        if (requestManager == null || (c38595Ad = this.mAd) == null) {
            return;
        }
        requestManager.cacheAd(c38595Ad, cacheListener);
    }

    public void show(View view, Position position) {
        addReportingKey("timestamp", String.valueOf(System.currentTimeMillis()));
        if (HyBid.getAppToken() != null) {
            addReportingKey(Reporting.Key.APP_TOKEN, HyBid.getAppToken());
        }
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && requestManager.getAdSize() != null) {
            addReportingKey("ad_size", this.mRequestManager.getAdSize().toString());
        }
        addReportingKey("integration_type", this.mIntegrationType);
        addReportingKey(Reporting.Key.AD_POSITION, position.name());
        if (this.mWindowManager == null) {
            this.mWindowManager = (WindowManager) getContext().getSystemService("window");
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            if (position == Position.TOP) {
                layoutParams.gravity = 49;
            } else if (position == Position.BOTTOM) {
                layoutParams.gravity = 81;
            }
            layoutParams.flags = 262152;
            RequestManager requestManager2 = this.mRequestManager;
            if (requestManager2 != null && requestManager2.getAdSize() != null) {
                layoutParams.width = (int) ViewUtils.convertDpToPixel(this.mRequestManager.getAdSize().getWidth(), getContext());
                layoutParams.height = (int) ViewUtils.convertDpToPixel(this.mRequestManager.getAdSize().getHeight(), getContext());
            }
            layoutParams.format = -2;
            if (this.mContainer == null) {
                this.mContainer = new FrameLayout(getContext());
            }
            this.mContainer.addView(view);
            this.mWindowManager.addView(this.mContainer, layoutParams);
        }
        if (this.mAutoShowOnLoad) {
            invokeOnLoadFinished();
        }
        startTracking();
        if (this.mInitialRenderTime != -1) {
            addReportingKey(Reporting.Key.RENDER_TIME, Long.valueOf(System.currentTimeMillis() - this.mInitialRenderTime));
        }
    }

    public void load(String str, Listener listener) {
        load((String) null, str, listener);
    }

    public void loadExchangeAd(String str, Listener listener) {
        loadExchangeAd((String) null, str, listener);
    }

    public void load(String str, String str2, Listener listener) {
        this.mAppToken = str;
        this.mZoneId = str2;
        this.mListener = listener;
        if (HyBid.isInitialized()) {
            cleanup();
            this.mInitialLoadTime = System.currentTimeMillis();
            if (TextUtils.isEmpty(str2)) {
                invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
            } else {
                addReportingKey("zone_id", str2);
                if (!TextUtils.isEmpty(str)) {
                    this.mRequestManager.setAppToken(str);
                }
                this.mRequestManager.setZoneId(str2);
                this.mRequestManager.setRequestListener(this);
                this.mRequestManager.requestAd();
            }
        } else {
            this.mInitialLoadTime = System.currentTimeMillis();
            Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before attempting a request");
            invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NOT_INITIALISED));
        }
        MraidCloseAdRepo.getInstance().registerExpandedAdCloseObserver(this);
    }

    public void loadExchangeAd(String str, String str2, Listener listener) {
        loadExchangeAd(null, str, str2, listener);
    }

    public void loadExchangeAd(String str, String str2, String str3, Listener listener) {
        loadExchangeAd(str, str2, str3, listener, null);
    }

    public void loadExchangeAd(String str, String str2, String str3, Listener listener, String str4) {
        this.mAppToken = str2;
        this.mZoneId = str3;
        this.mListener = listener;
        if (HyBid.isInitialized()) {
            cleanup();
            this.mInitialLoadTime = System.currentTimeMillis();
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str3)) {
                    invokeOnLoadFailed(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
                    return;
                }
                addReportingKey("zone_id", str3);
                if (!TextUtils.isEmpty(str2)) {
                    this.mORTBRequestManager.setAppToken(str2);
                }
                if (!TextUtils.isEmpty(str4)) {
                    this.mORTBRequestManager.setAdFormat(str4);
                }
                this.mORTBRequestManager.setZoneId(str3);
                this.mORTBRequestManager.setRequestListener(this);
                this.mORTBRequestManager.requestAd();
                return;
            }
            if (!TextUtils.isEmpty(str4)) {
                this.mORTBRequestManager.setAdFormat(str4);
            }
            this.mORTBRequestManager.setCustomUrl(str);
            this.mORTBRequestManager.setZoneId(str3);
            this.mORTBRequestManager.setRequestListener(this);
            this.mORTBRequestManager.requestAd();
            return;
        }
        this.mInitialLoadTime = System.currentTimeMillis();
        Log.v(TAG, "HyBid SDK is not initiated yet. Please initiate it before attempting a request");
        invokeOnLoadFailed(new HyBidError(HyBidErrorCode.NOT_INITIALISED));
    }

    public HyBidAdView(Context context, AdSize adSize) {
        super(context);
        this.mAutoShowOnLoad = true;
        this.mAdFormat = "banner";
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        this.mIntegrationType = IntegrationType.IN_APP_BIDDING;
        this.mTrackingMethod = ImpressionTrackingMethod.AD_VIEWABLE;
        this.mAutoRefreshTime = 0L;
        this.mAppToken = null;
        this.mZoneId = null;
        this.mHandler = new Handler(Looper.getMainLooper());
        if (adSize == null) {
            init(getRequestManager(), getORTBRequestManager());
        } else {
            init(getRequestManager(adSize), getORTBRequestManager(adSize));
        }
    }

    public HyBidAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAutoShowOnLoad = true;
        this.mAdFormat = "banner";
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        this.mIntegrationType = IntegrationType.IN_APP_BIDDING;
        this.mTrackingMethod = ImpressionTrackingMethod.AD_VIEWABLE;
        this.mAutoRefreshTime = 0L;
        this.mAppToken = null;
        this.mZoneId = null;
        this.mHandler = new Handler(Looper.getMainLooper());
        init(getRequestManager(), getORTBRequestManager());
    }

    public void renderAd(C38595Ad c38595Ad, Listener listener) {
        if (c38595Ad != null) {
            cleanup();
            this.mInitialLoadTime = System.currentTimeMillis();
            this.mListener = listener;
            this.mAd = c38595Ad;
            initializeAdTracker(c38595Ad);
            renderAd();
            return;
        }
        HyBidErrorCode hyBidErrorCode = HyBidErrorCode.INVALID_AD;
        invokeOnLoadFailed(new HyBidError(hyBidErrorCode));
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setAppToken(HyBid.getAppToken());
        reportingEvent.setEventType(Reporting.EventType.RENDER_ERROR);
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
        reportingEvent.setErrorCode(hyBidErrorCode.getCode());
        reportingEvent.setErrorMessage(hyBidErrorCode.getMessage());
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("banner");
        C38595Ad c38595Ad2 = this.mAd;
        if (c38595Ad2 != null) {
            reportingEvent.setImpId(c38595Ad2.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && requestManager.getAdSize() != null) {
            reportingEvent.setAdSize(this.mRequestManager.getAdSize().toString());
        }
        reportingEvent.setIntegrationType(this.mIntegrationType.getCode());
        C38595Ad c38595Ad3 = this.mAd;
        if (c38595Ad3 != null) {
            if (!TextUtils.isEmpty(c38595Ad3.getVast())) {
                reportingEvent.setVast(this.mAd.getVast());
            }
            if (!TextUtils.isEmpty(this.mAd.getZoneId())) {
                reportingEvent.setZoneId(this.mAd.getZoneId());
            }
        }
        reportingEvent.mergeJSONObject(getPlacementParams());
        getAdTypeAndCreative(reportingEvent);
        HyBid.getReportingController().reportEvent(reportingEvent);
    }

    public HyBidAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAutoShowOnLoad = true;
        this.mAdFormat = "banner";
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        this.mIntegrationType = IntegrationType.IN_APP_BIDDING;
        this.mTrackingMethod = ImpressionTrackingMethod.AD_VIEWABLE;
        this.mAutoRefreshTime = 0L;
        this.mAppToken = null;
        this.mZoneId = null;
        this.mHandler = new Handler(Looper.getMainLooper());
        init(getRequestManager(), getORTBRequestManager());
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidShowCloseButton() {
    }

    public HyBidAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mAutoShowOnLoad = true;
        this.mAdFormat = "banner";
        this.mInitialLoadTime = -1L;
        this.mInitialRenderTime = -1L;
        this.mIntegrationType = IntegrationType.IN_APP_BIDDING;
        this.mTrackingMethod = ImpressionTrackingMethod.AD_VIEWABLE;
        this.mAutoRefreshTime = 0L;
        this.mAppToken = null;
        this.mZoneId = null;
        this.mHandler = new Handler(Looper.getMainLooper());
        init(getRequestManager(), getORTBRequestManager());
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewClose(MRAIDView mRAIDView) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewError(MRAIDView mRAIDView) {
    }

    @Override // net.pubnative.lite.sdk.mraid.MRAIDViewListener
    public void mraidViewLoaded(MRAIDView mRAIDView) {
    }

    public void renderAd(String str, Listener listener) {
        cleanup();
        this.mInitialLoadTime = System.currentTimeMillis();
        this.mListener = listener;
        if (!TextUtils.isEmpty(str)) {
            SignalDataProcessor signalDataProcessor = new SignalDataProcessor();
            this.mSignalDataProcessor = signalDataProcessor;
            signalDataProcessor.processSignalData(str, new SignalDataProcessor.Listener() { // from class: net.pubnative.lite.sdk.views.HyBidAdView.1
                {
                    HyBidAdView.this = this;
                }

                @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
                public void onError(Throwable th) {
                    HyBidAdView.this.invokeOnLoadFailed(th);
                }

                @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
                public void onProcessed(C38595Ad c38595Ad) {
                    if (c38595Ad != null) {
                        HyBidAdView.this.mTrackingMethod = ImpressionTrackingMethod.AD_VIEWABLE;
                        HyBidAdView hyBidAdView = HyBidAdView.this;
                        hyBidAdView.mAd = c38595Ad;
                        hyBidAdView.initializeAdTracker(c38595Ad);
                        HyBidAdView.this.renderAd();
                        return;
                    }
                    HyBidAdView hyBidAdView2 = HyBidAdView.this;
                    HyBidErrorCode hyBidErrorCode = HyBidErrorCode.NULL_AD;
                    hyBidAdView2.invokeOnLoadFailed(new HyBidError(hyBidErrorCode));
                    if (HyBid.getReportingController() != null && HyBid.isReportingEnabled().booleanValue()) {
                        ReportingEvent reportingEvent = new ReportingEvent();
                        reportingEvent.setAppToken(HyBid.getAppToken());
                        reportingEvent.setEventType(Reporting.EventType.RENDER_ERROR);
                        reportingEvent.setPlatform("android");
                        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(HyBidAdView.this.mIntegrationType));
                        reportingEvent.setErrorCode(hyBidErrorCode.getCode());
                        reportingEvent.setErrorMessage(hyBidErrorCode.getMessage());
                        reportingEvent.setTimestamp(System.currentTimeMillis());
                        reportingEvent.setAdFormat("banner");
                        C38595Ad c38595Ad2 = HyBidAdView.this.mAd;
                        if (c38595Ad2 != null) {
                            reportingEvent.setImpId(c38595Ad2.getSessionId());
                            reportingEvent.setCampaignId(HyBidAdView.this.mAd.getCampaignId());
                            reportingEvent.setConfigId(HyBidAdView.this.mAd.getConfigId());
                        }
                        if (HyBidAdView.this.mRequestManager != null && HyBidAdView.this.mRequestManager.getAdSize() != null) {
                            reportingEvent.setAdSize(HyBidAdView.this.mRequestManager.getAdSize().toString());
                        }
                        reportingEvent.setIntegrationType(HyBidAdView.this.mIntegrationType.getCode());
                        C38595Ad c38595Ad3 = HyBidAdView.this.mAd;
                        if (c38595Ad3 != null) {
                            if (!TextUtils.isEmpty(c38595Ad3.getVast())) {
                                reportingEvent.setVast(HyBidAdView.this.mAd.getVast());
                            }
                            if (!TextUtils.isEmpty(HyBidAdView.this.mAd.getZoneId())) {
                                reportingEvent.setZoneId(HyBidAdView.this.mAd.getZoneId());
                            }
                        }
                        reportingEvent.mergeJSONObject(HyBidAdView.this.getPlacementParams());
                        HyBidAdView.this.getAdTypeAndCreative(reportingEvent);
                        HyBid.getReportingController().reportEvent(reportingEvent);
                    }
                }
            });
            return;
        }
        HyBidErrorCode hyBidErrorCode = HyBidErrorCode.INVALID_SIGNAL_DATA;
        invokeOnLoadFailed(new HyBidError(hyBidErrorCode));
        if (HyBid.getReportingController() == null || !HyBid.isReportingEnabled().booleanValue()) {
            return;
        }
        ReportingEvent reportingEvent = new ReportingEvent();
        reportingEvent.setAppToken(HyBid.getAppToken());
        reportingEvent.setEventType(Reporting.EventType.RENDER_ERROR);
        reportingEvent.setPlatform("android");
        reportingEvent.setSdkVersion(HyBid.getSDKVersionInfo(this.mIntegrationType));
        reportingEvent.setErrorCode(hyBidErrorCode.getCode());
        reportingEvent.setErrorMessage(hyBidErrorCode.getMessage());
        reportingEvent.setTimestamp(System.currentTimeMillis());
        reportingEvent.setAdFormat("banner");
        C38595Ad c38595Ad = this.mAd;
        if (c38595Ad != null) {
            reportingEvent.setImpId(c38595Ad.getSessionId());
            reportingEvent.setCampaignId(this.mAd.getCampaignId());
            reportingEvent.setConfigId(this.mAd.getConfigId());
        }
        RequestManager requestManager = this.mRequestManager;
        if (requestManager != null && requestManager.getAdSize() != null) {
            reportingEvent.setAdSize(this.mRequestManager.getAdSize().toString());
        }
        reportingEvent.setIntegrationType(this.mIntegrationType.getCode());
        C38595Ad c38595Ad2 = this.mAd;
        if (c38595Ad2 != null) {
            if (!TextUtils.isEmpty(c38595Ad2.getVast())) {
                reportingEvent.setVast(this.mAd.getVast());
            }
            if (!TextUtils.isEmpty(this.mAd.getZoneId())) {
                reportingEvent.setZoneId(this.mAd.getZoneId());
            }
        }
        reportingEvent.mergeJSONObject(getPlacementParams());
        getAdTypeAndCreative(reportingEvent);
        HyBid.getReportingController().reportEvent(reportingEvent);
    }
}
