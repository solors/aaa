package net.pubnative.lite.sdk.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import net.pubnative.lite.sdk.views.HyBidAdView;

/* loaded from: classes10.dex */
public class PNAdView extends HyBidAdView {

    /* loaded from: classes10.dex */
    public interface Listener extends HyBidAdView.Listener {
    }

    public PNAdView(Context context) {
        super(context);
    }

    public PNAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PNAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public PNAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
