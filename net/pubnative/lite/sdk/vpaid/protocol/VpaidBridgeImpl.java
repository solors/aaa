package net.pubnative.lite.sdk.vpaid.protocol;

import android.webkit.JavascriptInterface;
import java.util.Locale;
import java.util.Objects;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.protocol.BridgeEventHandler;

/* loaded from: classes10.dex */
public class VpaidBridgeImpl implements VpaidBridge {
    private static final String LOG_TAG = "VpaidBridgeImpl";
    private final BridgeEventHandler mBridge;
    private final CreativeParams mCreativeParams;

    public VpaidBridgeImpl(BridgeEventHandler bridgeEventHandler, CreativeParams creativeParams) {
        this.mBridge = bridgeEventHandler;
        this.mCreativeParams = creativeParams;
    }

    private void callJsMethod(String str) {
        this.mBridge.callJsMethod(str);
    }

    private void callWrapper(String str) {
        callJsMethod("vapidWrapperInstance." + str);
    }

    private void initAd() {
        Logger.m14229d(LOG_TAG, "JS: call initAd()");
        callWrapper(String.format(Locale.ENGLISH, "initAd(%1$d,%2$d,%3$s,%4$s,%5$s,%6$s)", Integer.valueOf(this.mCreativeParams.getWidth()), Integer.valueOf(this.mCreativeParams.getHeight()), this.mCreativeParams.getViewMode(), Integer.valueOf(this.mCreativeParams.getDesiredBitrate()), this.mCreativeParams.getCreativeData(), this.mCreativeParams.getEnvironmentVars()));
    }

    private void runOnUiThread(Runnable runnable) {
        this.mBridge.runOnUiThread(runnable);
    }

    @JavascriptInterface
    public void getAdDurationResult(int i) {
        String str = LOG_TAG;
        Logger.m14229d(str, "JS: getAdDurationResult: " + i);
    }

    @JavascriptInterface
    public void getAdExpandedResult(String str) {
        Logger.m14229d(LOG_TAG, "JS: getAdExpandedResult");
    }

    @JavascriptInterface
    public void getAdLinearResult(boolean z) {
        String str = LOG_TAG;
        Logger.m14229d(str, "getAdLinearResult: " + z);
    }

    @JavascriptInterface
    public void getAdRemainingTimeResult(int i) {
        String str = LOG_TAG;
        Logger.m14229d(str, "JS: getAdRemainingTimeResult: " + i);
        if (i == 0) {
            this.mBridge.postEvent("complete", true);
        } else {
            this.mBridge.postEvent("progress", i, false);
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.VpaidBridge
    public void getAdSkippableState() {
        Logger.m14229d(LOG_TAG, "call getAdSkippableState()");
        callWrapper("getAdSkippableState()");
    }

    @JavascriptInterface
    public void getAdSkippableStateResult(boolean z) {
        String str = LOG_TAG;
        Logger.m14229d(str, "JS: SkippableState: " + z);
        this.mBridge.setSkippableState(z);
    }

    @JavascriptInterface
    public void getAdVolumeResult() {
        Logger.m14229d(LOG_TAG, "JS: getAdVolumeResult");
    }

    @JavascriptInterface
    public String handshakeVersionResult(String str) {
        Logger.m14229d(LOG_TAG, "JS: handshakeVersion()");
        return str;
    }

    @JavascriptInterface
    public void initAdResult() {
        Logger.m14229d(LOG_TAG, "JS: Init ad done");
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.VpaidBridge
    public void pauseAd() {
        Logger.m14229d(LOG_TAG, "call pauseAd()");
        callWrapper("pauseAd()");
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.VpaidBridge
    public void prepare() {
        Logger.m14229d(LOG_TAG, "call initVpaidWrapper()");
        callJsMethod("initVpaidWrapper()");
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.VpaidBridge
    public void resumeAd() {
        Logger.m14229d(LOG_TAG, "call resumeAd()");
        callWrapper("resumeAd()");
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.VpaidBridge
    public void startAd() {
        Logger.m14229d(LOG_TAG, "call startAd()");
        callWrapper("startAd()");
    }

    @Override // net.pubnative.lite.sdk.vpaid.protocol.VpaidBridge
    public void stopAd() {
        Logger.m14229d(LOG_TAG, "call stopAd()");
        callWrapper("stopAd()");
    }

    @JavascriptInterface
    public void vpaidAdClickThruIdPlayerHandles(String str, String str2, boolean z) {
        if (z) {
            this.mBridge.openUrl(str);
        }
    }

    @JavascriptInterface
    public void vpaidAdDurationChange() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdDurationChange");
        callWrapper("getAdDurationResult");
        this.mBridge.onDurationChanged();
    }

    @JavascriptInterface
    public void vpaidAdError(String str) {
        String str2 = LOG_TAG;
        Logger.m14229d(str2, "JS: vpaidAdError" + str);
        this.mBridge.trackError(str);
    }

    @JavascriptInterface
    public void vpaidAdExpandedChange() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdExpandedChange");
    }

    @JavascriptInterface
    public void vpaidAdImpression() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdImpression");
        this.mBridge.onAdImpression();
    }

    @JavascriptInterface
    public void vpaidAdInteraction() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdInteraction");
    }

    @JavascriptInterface
    public void vpaidAdLinearChange() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdLinearChange");
        this.mBridge.onAdLinearChange();
    }

    @JavascriptInterface
    public void vpaidAdLoaded() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdLoaded");
        this.mBridge.onPrepared();
    }

    @JavascriptInterface
    public void vpaidAdLog(String str) {
        String str2 = LOG_TAG;
        Logger.m14229d(str2, "JS: vpaidAdLog " + str);
    }

    @JavascriptInterface
    public void vpaidAdPaused() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdPaused");
        this.mBridge.postEvent("pause", false);
    }

    @JavascriptInterface
    public void vpaidAdPlaying() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdPlaying");
        this.mBridge.postEvent("resume", false);
    }

    @JavascriptInterface
    public void vpaidAdRemainingTimeChange() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdRemainingTimeChange");
        callWrapper("getAdRemainingTime()");
    }

    @JavascriptInterface
    public void vpaidAdSizeChange() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdSizeChange");
    }

    @JavascriptInterface
    public void vpaidAdSkippableStateChange() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdSkippableStateChange");
    }

    @JavascriptInterface
    public void vpaidAdSkipped() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdSkipped");
        final BridgeEventHandler bridgeEventHandler = this.mBridge;
        Objects.requireNonNull(bridgeEventHandler);
        runOnUiThread(new Runnable() { // from class: ye.a
            @Override // java.lang.Runnable
            public final void run() {
                BridgeEventHandler.this.onAdSkipped();
            }
        });
    }

    @JavascriptInterface
    public void vpaidAdStarted() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdStarted");
    }

    @JavascriptInterface
    public void vpaidAdStopped() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdStopped");
        final BridgeEventHandler bridgeEventHandler = this.mBridge;
        Objects.requireNonNull(bridgeEventHandler);
        runOnUiThread(new Runnable() { // from class: ye.b
            @Override // java.lang.Runnable
            public final void run() {
                BridgeEventHandler.this.onAdStopped();
            }
        });
    }

    @JavascriptInterface
    public void vpaidAdUserAcceptInvitation() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdUserAcceptInvitation");
    }

    @JavascriptInterface
    public void vpaidAdUserClose() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdUserClose");
    }

    @JavascriptInterface
    public void vpaidAdUserMinimize() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdUserMinimize");
    }

    @JavascriptInterface
    public void vpaidAdVideoComplete() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdVideoComplete");
    }

    @JavascriptInterface
    public void vpaidAdVideoFirstQuartile() {
        this.mBridge.postEvent("firstQuartile", true);
    }

    @JavascriptInterface
    public void vpaidAdVideoMidpoint() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdVideoMidpoint");
        this.mBridge.postEvent("midpoint", true);
    }

    @JavascriptInterface
    public void vpaidAdVideoStart() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdVideoStart");
        this.mBridge.postEvent("start", true);
    }

    @JavascriptInterface
    public void vpaidAdVideoThirdQuartile() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdVideoThirdQuartile");
        this.mBridge.postEvent("thirdQuartile", true);
    }

    @JavascriptInterface
    public void vpaidAdVolumeChanged() {
        Logger.m14229d(LOG_TAG, "JS: vpaidAdVolumeChanged");
        this.mBridge.onAdVolumeChange();
    }

    @JavascriptInterface
    public void wrapperReady() {
        initAd();
    }
}
