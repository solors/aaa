package com.maticoo.sdk.core.imp.nativead;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.maticoo.sdk.bean.AdBean;
import com.maticoo.sdk.bean.Bidresp;
import com.maticoo.sdk.bean.NativeBean;
import com.maticoo.sdk.core.AbstractAdsManager;
import com.maticoo.sdk.core.imp.nativead.template.AdClickCallback;
import com.maticoo.sdk.core.imp.nativead.template.NativeTemplateMediumView;
import com.maticoo.sdk.p405ad.nativead.NativeAd;
import com.maticoo.sdk.p405ad.nativead.NativeAdListener;
import com.maticoo.sdk.p405ad.nativead.NativeAdOptions;
import com.maticoo.sdk.p405ad.nativead.view.MediaView;
import com.maticoo.sdk.p405ad.utils.AdsUtil;
import com.maticoo.sdk.p405ad.utils.CloseReason;
import com.maticoo.sdk.p405ad.utils.GpUtil;
import com.maticoo.sdk.p405ad.utils.error.Error;
import com.maticoo.sdk.p405ad.utils.webview.WebUtil;
import com.maticoo.sdk.p405ad.video.VideoAdListener;
import com.maticoo.sdk.p405ad.video.VideoOptions;
import com.maticoo.sdk.report.AdReport;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.List;

/* loaded from: classes6.dex */
public class NativeAdImpl extends NativeAd implements View.OnClickListener {
    private NativeAdOptions adOptions;
    private int adType;
    private NativeTemplateMediumView adView;
    private AbstractAdsManager adsManager;
    @NonNull
    private Bidresp bidresp;
    private double cat;
    private AdClickCallback clickCallback;
    private NativeAd.ImageContent iconImage;
    private boolean isCallbackDisplayed = false;
    private boolean isCallbackVideoCompleted = false;
    @NonNull
    private AdBean mAdBean;
    private NativeAd.MediaContent mediaContent;
    private MediaView mediaView;
    private View nativeAdView;
    @NonNull
    private NativeBean nativeBean;
    private String placementId;
    private VideoOptions videoOptions;

    public NativeAdImpl(int i, @NonNull AdBean adBean, AbstractAdsManager abstractAdsManager) {
        this.cat = 1.0d;
        this.adType = i;
        this.mAdBean = adBean;
        Bidresp bidBean = adBean.getBidBean();
        this.bidresp = bidBean;
        this.nativeBean = bidBean.getNativeResp();
        this.placementId = this.bidresp.getPid();
        this.adsManager = abstractAdsManager;
        this.cat = this.bidresp.getCat();
    }

    private void callbackAdClick(NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        nativeAdListener.onAdClicked(this.placementId);
    }

    private void callbackAdClosed() {
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.core.imp.nativead.NativeAdImpl.2
            @Override // java.lang.Runnable
            public void run() {
                NativeAdListener adListener = NativeAdImpl.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdClosed(NativeAdImpl.this.getBidresp().getPid());
                }
            }
        });
    }

    private void callbackAdDisplayOnUIThread(final NativeAdListener nativeAdListener) {
        if (nativeAdListener == null || this.isCallbackDisplayed) {
            return;
        }
        HandlerUtil.runOnUiThread(new Runnable() { // from class: com.maticoo.sdk.core.imp.nativead.NativeAdImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (!NativeAdImpl.this.isCallbackDisplayed) {
                    NativeAdImpl.this.isCallbackDisplayed = true;
                    nativeAdListener.onAdDisplayed(NativeAdImpl.this.placementId);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void click(String str, String str2) {
        if (this.adsManager == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getNativeBean().getClickThroughUrl();
        }
        AbstractAdsManager abstractAdsManager = this.adsManager;
        if (abstractAdsManager != null) {
            AdsUtil.callAdClickReport(this.mAdBean, abstractAdsManager.getChildAdType(), str, this.adsManager.getEventCommonParams());
        }
        GpUtil.openUrl(ApplicationUtil.getInstance().getApplicationContext(), str2, this.mAdBean);
        trackClick();
        AbstractAdsManager abstractAdsManager2 = this.adsManager;
        if (abstractAdsManager2 != null) {
            abstractAdsManager2.onAdsClicked();
        }
        AdClickCallback adClickCallback = this.clickCallback;
        if (adClickCallback != null) {
            adClickCallback.onAdClick();
        }
    }

    private void trackClick() {
        List<String> clickTrackers = getNativeBean().getClickTrackers();
        if (clickTrackers != null && clickTrackers.size() > 0) {
            for (String str : clickTrackers) {
                DeveloperLog.LogD("trackClick, clickTrackUrl = " + str);
                AdReport.reportClickTrack(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void videoCompleted() {
        AbstractAdsManager abstractAdsManager = this.adsManager;
        if (abstractAdsManager == null || this.isCallbackVideoCompleted) {
            return;
        }
        AdsUtil.callAdVideoCompletedReport(this.mAdBean, abstractAdsManager.getEventCommonParams());
        VideoAdListener videoListener = getVideoListener();
        if (videoListener != null) {
            this.isCallbackVideoCompleted = true;
            videoListener.onVideoCompleted(this.placementId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void videoStart() {
        AbstractAdsManager abstractAdsManager = this.adsManager;
        if (abstractAdsManager == null) {
            return;
        }
        AdsUtil.callAdVideoImplReport(this.mAdBean, 0L, abstractAdsManager.getEventCommonParams());
        VideoAdListener videoListener = getVideoListener();
        if (videoListener != null) {
            videoListener.onVideoStarted(this.placementId);
        }
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public void destroy() {
        this.mediaContent = null;
        this.iconImage = null;
        this.adOptions = null;
        this.videoOptions = null;
        this.adView = null;
        AbstractAdsManager abstractAdsManager = this.adsManager;
        if (abstractAdsManager != null) {
            abstractAdsManager.destroy();
            this.adsManager = null;
        }
    }

    public NativeAdListener getAdListener() {
        NativeAdOptions nativeAdOptions = this.adOptions;
        if (nativeAdOptions != null) {
            return nativeAdOptions.getLoadListener();
        }
        return null;
    }

    public int getAdType() {
        return this.adType;
    }

    @NonNull
    public Bidresp getBidresp() {
        return this.bidresp;
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public String getBody() {
        return this.nativeBean.getDescribeData();
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public String getCallToAction() {
        return this.nativeBean.getCallToActionText();
    }

    public double getCat() {
        return this.cat;
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public String getHeadline() {
        return this.nativeBean.getTitle();
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public NativeAd.ImageContent getIcon() {
        if (this.iconImage == null) {
            this.iconImage = new ImageContentImpl(this.nativeBean.getIconUrl());
        }
        return this.iconImage;
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public NativeAd.MediaContent getMediaContent() {
        int i;
        if (this.mediaContent == null) {
            String imgAdUrl = this.nativeBean.getImgAdUrl();
            if (!TextUtils.isEmpty(this.nativeBean.getVideoAdUrl())) {
                imgAdUrl = this.nativeBean.getVideoAdUrl();
                i = 1;
            } else {
                i = 0;
            }
            MediaContentImpl mediaContentImpl = new MediaContentImpl(i, imgAdUrl);
            mediaContentImpl.setNativeAdOptions(this.adOptions);
            mediaContentImpl.setVideoOptions(this.videoOptions);
            this.mediaContent = mediaContentImpl;
        }
        return this.mediaContent;
    }

    @NonNull
    public NativeBean getNativeBean() {
        return this.nativeBean;
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public View getTemplateView() {
        return this.adView;
    }

    public VideoAdListener getVideoListener() {
        VideoOptions videoOptions = this.videoOptions;
        if (videoOptions != null) {
            return videoOptions.getVideoAdListener();
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        click("picture", "");
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public void recordDisplay(View view) {
        AbstractAdsManager abstractAdsManager;
        if (!this.isCallbackDisplayed && (abstractAdsManager = this.adsManager) != null) {
            if (view == null) {
                view = this.nativeAdView;
            }
            if (view == null) {
                view = this.mediaView;
            }
            if (view == null) {
                return;
            }
            this.isCallbackDisplayed = true;
            abstractAdsManager.onAdsShowed(view);
        }
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public void registerViewForInteraction(View view, MediaView mediaView, List<View> list) {
        this.nativeAdView = view;
        this.mediaView = mediaView;
        if (list != null) {
            for (View view2 : list) {
                view2.setOnClickListener(this);
            }
        }
        if (mediaView != null) {
            mediaView.setMediaClickListener(new MediaView.MediaClickListener() { // from class: com.maticoo.sdk.core.imp.nativead.NativeAdImpl.1
                @Override // com.maticoo.sdk.p405ad.nativead.view.MediaView.MediaClickListener
                public void onLogoClick() {
                    if (NativeAdImpl.this.adsManager != null) {
                        NativeAdImpl.this.adsManager.clickLogo();
                    }
                }

                @Override // com.maticoo.sdk.p405ad.nativead.view.MediaView.MediaClickListener
                public void onMediaClick(WebView webView, String str, String str2) {
                    if (!WebUtil.checkRedirectAndReport(webView, NativeAdImpl.this.mAdBean, str2)) {
                        NativeAdImpl.this.click(str, str2);
                    }
                }

                @Override // com.maticoo.sdk.p405ad.nativead.view.MediaView.MediaClickListener
                public void onRenderFailed(Error error, RenderProcessGoneDetail renderProcessGoneDetail) {
                    if (NativeAdImpl.this.adsManager != null) {
                        AdsUtil.callReportRenderGone(NativeAdImpl.this.adsManager, renderProcessGoneDetail);
                        NativeAdImpl.this.adsManager.onAdsShowFailed(error);
                    }
                }

                @Override // com.maticoo.sdk.p405ad.nativead.view.MediaView.MediaClickListener
                public void onVideoCompleted() {
                    NativeAdImpl.this.videoCompleted();
                }

                @Override // com.maticoo.sdk.p405ad.nativead.view.MediaView.MediaClickListener
                public void onVideoMuted(int i) {
                    if (NativeAdImpl.this.adsManager != null) {
                        AdsUtil.callAdClickTrumpetReport(NativeAdImpl.this.mAdBean, i, NativeAdImpl.this.adsManager.getEventCommonParams());
                    }
                }

                @Override // com.maticoo.sdk.p405ad.nativead.view.MediaView.MediaClickListener
                public void onVideoStarted() {
                    NativeAdImpl.this.videoStart();
                }
            });
        }
    }

    public void renderAdView(Context context) {
        if (this.adView == null) {
            this.adView = new NativeTemplateMediumView(context);
        }
        NativeAdOptions nativeAdOptions = this.adOptions;
        if (nativeAdOptions != null) {
            this.adView.inflateAd(this, nativeAdOptions.getAdTemplate());
        }
    }

    @Override // com.maticoo.sdk.p405ad.nativead.NativeAd
    public void reportCloseReason(CloseReason closeReason) {
        String str;
        NativeAdOptions nativeAdOptions = this.adOptions;
        if (nativeAdOptions != null && nativeAdOptions.getAdTemplate() != null) {
            str = "close_template";
        } else {
            str = "close_custom";
        }
        AdsUtil.callAdCloseReport(this.mAdBean, str, closeReason.getReason(), this.adsManager.getEventCommonParams());
        AbstractAdsManager abstractAdsManager = this.adsManager;
        if (abstractAdsManager != null) {
            abstractAdsManager.onAdsClosed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAdOptions(NativeAdOptions nativeAdOptions) {
        this.adOptions = nativeAdOptions;
    }

    public void setClickCallback(AdClickCallback adClickCallback) {
        this.clickCallback = adClickCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setVideoOptions(VideoOptions videoOptions) {
        this.videoOptions = videoOptions;
    }
}
