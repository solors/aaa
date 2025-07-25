package net.pubnative.lite.sdk.vpaid;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.models.C38595Ad;
import net.pubnative.lite.sdk.models.CustomCTAData;
import net.pubnative.lite.sdk.models.CustomEndCardDisplay;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.IntegrationType;
import net.pubnative.lite.sdk.presenter.AdPresenter;
import net.pubnative.lite.sdk.utils.AdCustomCTAManager;
import net.pubnative.lite.sdk.utils.AdEndCardManager;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.utils.PNBitmapDownloader;
import net.pubnative.lite.sdk.viewability.HyBidViewabilityNativeVideoAdSession;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.enums.VastError;
import net.pubnative.lite.sdk.vpaid.helpers.AssetsLoader;
import net.pubnative.lite.sdk.vpaid.helpers.ErrorLog;
import net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer;
import net.pubnative.lite.sdk.vpaid.models.vpaid.AdSpotDimensions;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.response.VastProcessor;

/* loaded from: classes10.dex */
public abstract class BaseVideoAdInternal {
    private static final String LOG_TAG = "BaseVideoAdInternal";
    protected final boolean isFullscreen;
    private final boolean isInterstitial;
    private C38595Ad mAd;
    private AdCloseButtonListener mAdCloseButtonListener;
    private VideoAdController mAdController;
    private long mAdLoadingStartTime;
    private int mAdState;
    private final AssetsLoader mAssetsLoader;
    private VideoAdCacheItem mCacheItem;
    private CloseButtonListener mCloseButtonListener;
    private final Context mContext;
    private SimpleTimer mExpirationTimer;
    private SimpleTimer mFetcherTimer;
    AdPresenter.ImpressionListener mImpressionListener;
    private boolean mIsReady;
    private SimpleTimer mPrepareTimer;
    private final String mVastData;
    private VideoAdListener mVideoAdListener;
    private final HyBidViewabilityNativeVideoAdSession mViewabilityAdSession;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mIsRewarded = false;

    public BaseVideoAdInternal(Context context, C38595Ad c38595Ad, boolean z, boolean z2, AdPresenter.ImpressionListener impressionListener, AdCloseButtonListener adCloseButtonListener) throws Exception {
        String vast = c38595Ad.getVast();
        if (context != null && !TextUtils.isEmpty(vast)) {
            this.mAd = c38595Ad;
            this.mAdState = 200;
            this.mContext = context;
            this.mVastData = vast;
            this.mAssetsLoader = new AssetsLoader();
            this.isInterstitial = z;
            this.isFullscreen = z2;
            this.mViewabilityAdSession = new HyBidViewabilityNativeVideoAdSession(HyBid.getViewabilityManager());
            this.mImpressionListener = impressionListener;
            this.mAdCloseButtonListener = adCloseButtonListener;
            return;
        }
        throw new HyBidError(HyBidErrorCode.VAST_PLAYER_ERROR);
    }

    private AssetsLoader.OnAssetsLoaded createAssetsLoadListener() {
        return new AssetsLoader.OnAssetsLoaded() { // from class: net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal.6
            {
                BaseVideoAdInternal.this = this;
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.AssetsLoader.OnAssetsLoaded
            public void onAssetsLoaded(String str, EndCardData endCardData, String str2) {
                BaseVideoAdInternal.this.prepareAdController(str, endCardData, str2);
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.AssetsLoader.OnAssetsLoaded
            public void onError(PlayerInfo playerInfo) {
                BaseVideoAdInternal.this.onAdLoadFailInternal(playerInfo);
            }
        };
    }

    private VideoAdController.OnPreparedListener createOnPrepareListener() {
        return new VideoAdController.OnPreparedListener() { // from class: net.pubnative.lite.sdk.vpaid.c
            {
                BaseVideoAdInternal.this = this;
            }

            @Override // net.pubnative.lite.sdk.vpaid.VideoAdController.OnPreparedListener
            public final void onPrepared() {
                BaseVideoAdInternal.this.lambda$createOnPrepareListener$1();
            }
        };
    }

    private void fetchAd(final IntegrationType integrationType) {
        new VastProcessor(getContext(), getAdSpotDimensions()).parseResponse(this.mVastData, new VastProcessor.Listener() { // from class: net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal.4
            {
                BaseVideoAdInternal.this = this;
            }

            @Override // net.pubnative.lite.sdk.vpaid.response.VastProcessor.Listener
            public void onParseError(PlayerInfo playerInfo) {
                BaseVideoAdInternal.this.onAdLoadFailInternal(playerInfo);
            }

            @Override // net.pubnative.lite.sdk.vpaid.response.VastProcessor.Listener
            public void onParseSuccess(AdParams adParams, String str) {
                BaseVideoAdInternal.this.prepare(adParams, str, integrationType);
            }
        });
    }

    private CustomCTAData getCustomCTAData() {
        if (getAd() != null && AdCustomCTAManager.isAbleShow(getAd()).booleanValue()) {
            return getAd().getCustomCta(getContext());
        }
        return null;
    }

    private Integer getCustomCTADelay() {
        Integer num = AdCustomCTAManager.CUSTOM_CTA_DELAY_DEFAULT;
        if (getAd() != null) {
            return AdCustomCTAManager.getCustomCtaDelay(getAd());
        }
        return num;
    }

    public /* synthetic */ void lambda$createOnPrepareListener$1() {
        if (getAdState() == 202) {
            Logger.m14229d(LOG_TAG, "Creative call unexpected AdLoaded");
            return;
        }
        stopPrepareTimer();
        onAdLoadSuccessInternal();
    }

    public /* synthetic */ void lambda$prepareAdController$0() {
        startPrepareTimer();
        this.mAdController.prepare(createOnPrepareListener());
    }

    public void onAdExpired() {
        Logger.m14229d(LOG_TAG, "Ad content is expired");
        this.mExpirationTimer = null;
        this.mIsReady = false;
        this.mAdState = 200;
        this.mAssetsLoader.breakLoading();
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onAdExpired();
        }
    }

    /* renamed from: onAdLoadFail */
    public void lambda$onAdLoadFailInternal$2(PlayerInfo playerInfo) {
        String str = LOG_TAG;
        Logger.m14229d(str, "Ad fails to load: " + playerInfo.getMessage());
        this.mAdState = 200;
        this.mIsReady = false;
        stopFetcherTimer();
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadFail(playerInfo);
        } else {
            Logger.m14225w(str, "Warning: empty listener");
        }
    }

    public void onAdLoadSuccess() {
        startExpirationTimer();
        long currentTimeMillis = System.currentTimeMillis() - this.mAdLoadingStartTime;
        String str = LOG_TAG;
        Logger.m14229d(str, "Ad successfully loaded (" + currentTimeMillis + "ms)");
        this.mIsReady = true;
        this.mAdState = 200;
        stopFetcherTimer();
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadSuccess();
        } else {
            Logger.m14225w(str, "Warning: empty listener");
        }
    }

    public void prepare(final AdParams adParams, String str, final IntegrationType integrationType) {
        if (adParams.isVpaid()) {
            ErrorLog.postError(getContext(), VastError.VAST_VERSION_NOT_SUPPORTED);
            lambda$onAdLoadFailInternal$2(new PlayerInfo("Unsupported ad format"));
            return;
        }
        final CustomCTAData customCTAData = getCustomCTAData();
        if (customCTAData != null && customCTAData.getIconURL() != null) {
            new PNBitmapDownloader().download(customCTAData.getIconURL(), new PNBitmapDownloader.DownloadListener() { // from class: net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal.5
                {
                    BaseVideoAdInternal.this = this;
                }

                @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
                public void onDownloadFailed(String str2, Exception exc) {
                    BaseVideoAdInternal.this.prepareAdController(adParams, integrationType, (CustomCTAData) null);
                }

                @Override // net.pubnative.lite.sdk.utils.PNBitmapDownloader.DownloadListener
                public void onDownloadFinish(String str2, Bitmap bitmap) {
                    if (bitmap != null) {
                        customCTAData.setBitmap(bitmap);
                    }
                    BaseVideoAdInternal.this.prepareAdController(adParams, integrationType, customCTAData);
                }
            });
        } else {
            prepareAdController(adParams, integrationType, (CustomCTAData) null);
        }
    }

    public void prepareAdController(AdParams adParams, IntegrationType integrationType, CustomCTAData customCTAData) {
        if (customCTAData == null) {
            customCTAData = getCustomCTAData();
        }
        this.mAdController = new VideoAdControllerVast(this, adParams, getViewabilityAdSession(), this.isFullscreen, this.mImpressionListener, this.mAdCloseButtonListener, customCTAData, getCustomCTADelay(), integrationType);
        VideoAdCacheItem videoAdCacheItem = this.mCacheItem;
        if (videoAdCacheItem != null) {
            prepareAdController(videoAdCacheItem.getVideoFilePath(), this.mCacheItem.getEndCardData(), this.mCacheItem.getEndCardFilePath());
        } else {
            this.mAssetsLoader.load(adParams, this.mContext, createAssetsLoadListener());
        }
    }

    private void startExpirationTimer() {
        if (this.mExpirationTimer != null) {
            return;
        }
        SimpleTimer simpleTimer = new SimpleTimer(600000L, new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal.1
            {
                BaseVideoAdInternal.this = this;
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onFinish() {
                BaseVideoAdInternal.this.onAdExpired();
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onTick(long j) {
            }
        });
        this.mExpirationTimer = simpleTimer;
        simpleTimer.start();
        Logger.m14229d(LOG_TAG, "Start schedule expiration");
    }

    private void startPrepareTimer() {
        if (this.mPrepareTimer != null) {
            return;
        }
        SimpleTimer simpleTimer = new SimpleTimer(15000L, new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal.2
            {
                BaseVideoAdInternal.this = this;
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onFinish() {
                BaseVideoAdInternal.this.mPrepareTimer = null;
                if (BaseVideoAdInternal.this.mAdController != null && (BaseVideoAdInternal.this.mAdController instanceof VideoAdControllerVpaid)) {
                    ErrorLog.postError(BaseVideoAdInternal.this.getContext(), VastError.FILE_NOT_FOUND);
                    BaseVideoAdInternal.this.lambda$onAdLoadFailInternal$2(new PlayerInfo("Problem with js file"));
                }
                BaseVideoAdInternal.this.cancelFetcher();
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onTick(long j) {
            }
        });
        this.mPrepareTimer = simpleTimer;
        simpleTimer.start();
        Logger.m14229d(LOG_TAG, "Start prepare timer");
    }

    private void stopPrepareTimer() {
        Logger.m14229d(LOG_TAG, "Stop prepare timer");
        SimpleTimer simpleTimer = this.mPrepareTimer;
        if (simpleTimer != null) {
            simpleTimer.cancel();
            this.mPrepareTimer = null;
        }
    }

    public void cancelFetcher() {
        Logger.m14229d(LOG_TAG, "Cancel ad fetcher");
        this.mAssetsLoader.breakLoading();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public abstract void dismiss();

    public C38595Ad getAd() {
        return this.mAd;
    }

    public VideoAdController getAdController() {
        return this.mAdController;
    }

    abstract int getAdFormat();

    public VideoAdListener getAdListener() {
        return this.mVideoAdListener;
    }

    abstract AdSpotDimensions getAdSpotDimensions();

    public int getAdState() {
        return this.mAdState;
    }

    protected VideoAdCacheItem getCacheItem() {
        return this.mCacheItem;
    }

    public Context getContext() {
        return this.mContext;
    }

    public HyBidViewabilityNativeVideoAdSession getViewabilityAdSession() {
        return this.mViewabilityAdSession;
    }

    public void initAdLoadingStartTime() {
        this.mAdLoadingStartTime = System.currentTimeMillis();
    }

    public Boolean isInterstitial() {
        return Boolean.valueOf(this.isInterstitial);
    }

    public boolean isReady() {
        return this.mIsReady;
    }

    public boolean isRewarded() {
        return this.mIsRewarded;
    }

    public void onAdClicked() {
        Logger.m14229d(LOG_TAG, "Ad received click event");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onAdClicked();
        }
    }

    public void onAdCloseButtonVisible() {
        CloseButtonListener closeButtonListener = this.mCloseButtonListener;
        if (closeButtonListener != null) {
            closeButtonListener.onCloseButtonVisible();
        }
    }

    public void onAdDidReachEnd() {
        Logger.m14229d(LOG_TAG, "Video reach end");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onAdDidReachEnd();
        }
    }

    void onAdLeaveApp() {
        Logger.m14229d(LOG_TAG, "adLeaveApp");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onLeaveApp();
        }
    }

    public void onAdLoadFailInternal(final PlayerInfo playerInfo) {
        runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.b
            {
                BaseVideoAdInternal.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseVideoAdInternal.this.lambda$onAdLoadFailInternal$2(playerInfo);
            }
        });
    }

    public void onAdLoadSuccessInternal() {
        runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.d
            {
                BaseVideoAdInternal.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseVideoAdInternal.this.onAdLoadSuccess();
            }
        });
    }

    public void onAdSkipped() {
        Logger.m14229d(LOG_TAG, "onAdSkipped");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onAdSkipped();
        }
    }

    public void onCustomCTAClick(boolean z) {
        Logger.m14229d(LOG_TAG, "Ad received custom CTA click event");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTACLick(z);
        }
    }

    public void onCustomCTALoadFail() {
        Logger.m14229d(LOG_TAG, "Ad received custom CTA load fail event");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTALoadFail();
        }
    }

    public void onCustomCTAShow() {
        Logger.m14229d(LOG_TAG, "Ad received custom CTA show event");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTAShow();
        }
    }

    public void onCustomEndCardClick(String str) {
        Logger.m14229d(LOG_TAG, "Ad received custom end card click event");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardClick(str);
        }
    }

    public void onCustomEndCardShow(String str) {
        Logger.m14229d(LOG_TAG, "Ad received custom end card impression event");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardShow(str);
        }
    }

    public void onDefaultEndCardClick(String str) {
        Logger.m14229d(LOG_TAG, "Ad received default end card click event");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardClick(str);
        }
    }

    public void onDefaultEndCardShow(String str) {
        Logger.m14229d(LOG_TAG, "Ad received custom end card impression event");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardShow(str);
        }
    }

    public void onEndCardClosed(Boolean bool) {
        Logger.m14229d(LOG_TAG, "onEndCardClosed");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onEndCardClosed(bool);
        }
    }

    public void onEndCardLoadFail(Boolean bool) {
        Logger.m14229d(LOG_TAG, "EndCard loading failed");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadFail(bool);
        }
    }

    public void onEndCardLoadSuccess(Boolean bool) {
        Logger.m14229d(LOG_TAG, "EndCard loading success");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadSuccess(bool);
        }
    }

    public void onEndCardSkipped(Boolean bool) {
        Logger.m14229d(LOG_TAG, "onEndCardSkipped");
        VideoAdListener videoAdListener = this.mVideoAdListener;
        if (videoAdListener != null) {
            videoAdListener.onEndCardSkipped(bool);
        }
    }

    public void proceedLoad(IntegrationType integrationType) {
        VideoAdCacheItem videoAdCacheItem = this.mCacheItem;
        if (videoAdCacheItem != null) {
            prepare(videoAdCacheItem.getAdParams(), this.mVastData, integrationType);
        } else {
            fetchAd(integrationType);
        }
    }

    public void releaseAdController() {
        Logger.m14229d(LOG_TAG, "Release ViewControllerVast");
        VideoAdController videoAdController = this.mAdController;
        if (videoAdController != null) {
            videoAdController.destroy();
            this.mAdController = null;
        }
    }

    public void runOnUiThread(Runnable runnable) {
        this.mHandler.post(runnable);
    }

    public void setAdCloseButtonListener(CloseButtonListener closeButtonListener) {
        this.mCloseButtonListener = closeButtonListener;
    }

    public void setAdListener(VideoAdListener videoAdListener) {
        this.mVideoAdListener = videoAdListener;
    }

    public void setAdState(int i) {
        this.mAdState = i;
    }

    public void setReady() {
        this.mIsReady = false;
    }

    public void setRewarded(boolean z) {
        this.mIsRewarded = z;
    }

    public void setVideoCacheItem(VideoAdCacheItem videoAdCacheItem) {
        this.mCacheItem = videoAdCacheItem;
    }

    public void startFetcherTimer() {
        if (this.mFetcherTimer != null) {
            return;
        }
        SimpleTimer simpleTimer = new SimpleTimer(180000L, new SimpleTimer.Listener() { // from class: net.pubnative.lite.sdk.vpaid.BaseVideoAdInternal.3
            {
                BaseVideoAdInternal.this = this;
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onFinish() {
                BaseVideoAdInternal.this.cancelFetcher();
                ErrorLog.postError(BaseVideoAdInternal.this.getContext(), VastError.TIMEOUT);
                BaseVideoAdInternal.this.lambda$onAdLoadFailInternal$2(new PlayerInfo("Ad processing timeout"));
            }

            @Override // net.pubnative.lite.sdk.vpaid.helpers.SimpleTimer.Listener
            public void onTick(long j) {
            }
        });
        this.mFetcherTimer = simpleTimer;
        simpleTimer.start();
        Logger.m14229d(LOG_TAG, "Start fetcher timer");
    }

    public void stopExpirationTimer() {
        if (this.mExpirationTimer != null) {
            Logger.m14229d(LOG_TAG, "Stop schedule expiration");
            this.mExpirationTimer.cancel();
            this.mExpirationTimer = null;
        }
    }

    public void stopFetcherTimer() {
        Logger.m14229d(LOG_TAG, "Stop fetcher timer");
        SimpleTimer simpleTimer = this.mFetcherTimer;
        if (simpleTimer != null) {
            simpleTimer.cancel();
            this.mFetcherTimer = null;
        }
    }

    public void prepareAdController(String str, EndCardData endCardData, String str2) {
        VideoAdController videoAdController = this.mAdController;
        if (videoAdController == null) {
            onAdLoadFailInternal(new PlayerInfo("Error during video loading"));
            ErrorLog.postError(getContext(), VastError.UNDEFINED);
            Logger.m14229d(LOG_TAG, "VideoAdController == null, after onAssetsLoaded success");
            return;
        }
        videoAdController.setVideoFilePath(str);
        if (getAd() != null) {
            EndCardData customEndCard = getAd().getCustomEndCard();
            if (AdEndCardManager.shouldShowEndcard(getAd())) {
                this.mAdController.addEndCardData(endCardData);
                if (AdEndCardManager.shouldShowCustomEndcard(getAd()) && getAd().getCustomEndCardDisplay().equals(CustomEndCardDisplay.EXTENSION) && !customEndCard.getContent().isEmpty()) {
                    this.mAdController.addEndCardData(customEndCard);
                    this.mVideoAdListener.onAdCustomEndCardFound();
                }
            } else if (AdEndCardManager.shouldShowCustomEndcard(getAd()) && !customEndCard.getContent().isEmpty()) {
                this.mAdController.addEndCardData(customEndCard);
                this.mVideoAdListener.onAdCustomEndCardFound();
            }
        }
        this.mAdController.setEndCardFilePath(str2);
        runOnUiThread(new Runnable() { // from class: net.pubnative.lite.sdk.vpaid.e
            {
                BaseVideoAdInternal.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseVideoAdInternal.this.lambda$prepareAdController$0();
            }
        });
    }
}
