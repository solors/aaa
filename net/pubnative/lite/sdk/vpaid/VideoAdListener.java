package net.pubnative.lite.sdk.vpaid;

/* loaded from: classes10.dex */
public abstract class VideoAdListener {
    public abstract void onAdCustomEndCardFound();

    public void onAdDismissed() {
    }

    public abstract void onAdLoadFail(PlayerInfo playerInfo);

    public abstract void onAdLoadSuccess();

    public abstract void onAdSkipped();

    public void onAdDismissed(int i) {
    }

    public void onAdClicked() {
    }

    public void onAdDidReachEnd() {
    }

    public void onAdExpired() {
    }

    public void onAdStarted() {
    }

    public void onCustomCTALoadFail() {
    }

    public void onCustomCTAShow() {
    }

    public void onLeaveApp() {
    }

    public void onCustomCTACLick(boolean z) {
    }

    public void onCustomEndCardClick(String str) {
    }

    public void onCustomEndCardShow(String str) {
    }

    public void onDefaultEndCardClick(String str) {
    }

    public void onDefaultEndCardShow(String str) {
    }

    public void onEndCardClosed(Boolean bool) {
    }

    public void onEndCardLoadFail(Boolean bool) {
    }

    public void onEndCardLoadSuccess(Boolean bool) {
    }

    public void onEndCardSkipped(Boolean bool) {
    }
}
