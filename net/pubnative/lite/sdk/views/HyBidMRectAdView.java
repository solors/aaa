package net.pubnative.lite.sdk.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import net.pubnative.lite.sdk.api.MRectRequestManager;
import net.pubnative.lite.sdk.api.OpenRTBApiClient;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.models.OpenRTBAdRequestFactory;

/* loaded from: classes10.dex */
public class HyBidMRectAdView extends HyBidAdView {
    public HyBidMRectAdView(Context context) {
        super(context);
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView
    protected String getLogTag() {
        return HyBidMRectAdView.class.getSimpleName();
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView
    RequestManager getORTBRequestManager() {
        return new MRectRequestManager(new OpenRTBApiClient(getContext()), new OpenRTBAdRequestFactory());
    }

    @Override // net.pubnative.lite.sdk.views.HyBidAdView
    RequestManager getRequestManager() {
        return new MRectRequestManager();
    }

    public HyBidMRectAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HyBidMRectAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public HyBidMRectAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
