package net.pubnative.lite.sdk.mraid;

/* loaded from: classes10.dex */
public interface MRAIDViewListener {
    void mraidShowCloseButton();

    void mraidViewClose(MRAIDView mRAIDView);

    void mraidViewError(MRAIDView mRAIDView);

    void mraidViewExpand(MRAIDView mRAIDView);

    void mraidViewLoaded(MRAIDView mRAIDView);

    boolean mraidViewResize(MRAIDView mRAIDView, int i, int i2, int i3, int i4);

    void onExpandedAdClosed();
}
