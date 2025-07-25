package com.amazon.device.ads;

import android.content.Context;
import com.amazon.aps.ads.metrics.ApsMetricsBannerListenerAdapter;
import com.amazon.aps.ads.metrics.ApsMetricsInterstitialListenerAdapter;
import com.amazon.aps.ads.util.adview.ApsAdViewImpl;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;

/* loaded from: classes2.dex */
public class DTBAdView extends ApsAdViewImpl {
    static final String LOG_TAG = "DTBAdView";

    /* JADX INFO: Access modifiers changed from: protected */
    public DTBAdView(Context context) {
        super(context);
    }

    public DTBAdMRAIDController getController() {
        return super.getMraidHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void initAdBannerListener(DTBAdBannerListener dTBAdBannerListener) {
        try {
            setMraidListenerAdapter(new ApsMetricsBannerListenerAdapter(getBidId(), dTBAdBannerListener));
            setMraidHandler(new DTBAdMRAIDBannerController(this, (ApsMetricsBannerListenerAdapter) getMraidListenerAdapter()));
            initWebView();
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdBannerListener", e);
        }
    }

    protected void initAdExpandedListener(DTBAdExpandedListener dTBAdExpandedListener, int i) {
        try {
            DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController = new DTBAdMRAIDExpandedController(this);
            setMraidHandler(dTBAdMRAIDExpandedController);
            dTBAdMRAIDExpandedController.setMasterController(DTBAdMRAIDBannerController.findControllerByIndex(i));
            dTBAdExpandedListener.onCreateExpandedController((DTBAdMRAIDExpandedController) getMraidHandler());
            initWebView();
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdExpandedListener", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void initAdInterstitialListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        try {
            setMraidListenerAdapter(new ApsMetricsInterstitialListenerAdapter(getBidId(), dTBAdInterstitialListener));
            setMraidHandler(new DTBAdMRAIDInterstitialController(this, (ApsMetricsInterstitialListenerAdapter) getMraidListenerAdapter()));
            initWebView();
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdInterstitialListener", e);
        }
    }

    public DTBAdView(Context context, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(context);
        initAdInterstitialListener(dTBAdInterstitialListener);
    }

    public DTBAdView(Context context, DTBAdBannerListener dTBAdBannerListener) {
        super(context);
        initAdBannerListener(dTBAdBannerListener);
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener) {
        this(context, dTBAdExpandedListener, 0);
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener, int i) {
        super(context);
        initAdExpandedListener(dTBAdExpandedListener, i);
    }
}
