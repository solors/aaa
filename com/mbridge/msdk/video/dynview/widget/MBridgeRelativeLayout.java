package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.mbridge.msdk.video.dynview.moffer.MoreOfferCacheReportCallBack;
import com.mbridge.msdk.video.dynview.moffer.MoreOfferShowFailedCallBack;

/* loaded from: classes6.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private MoreOfferShowFailedCallBack f60463a;

    /* renamed from: b */
    private boolean f60464b;

    /* renamed from: c */
    private AnimatorSet f60465c;

    /* renamed from: d */
    private boolean f60466d;

    /* renamed from: e */
    private MoreOfferCacheReportCallBack f60467e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f60465c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        MoreOfferShowFailedCallBack moreOfferShowFailedCallBack;
        super.onDetachedFromWindow();
        if (!this.f60464b && (moreOfferShowFailedCallBack = this.f60463a) != null) {
            this.f60464b = true;
            moreOfferShowFailedCallBack.mo48864a();
        }
        AnimatorSet animatorSet = this.f60465c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        MoreOfferCacheReportCallBack moreOfferCacheReportCallBack;
        super.onVisibilityChanged(view, i);
        if ((view instanceof MBridgeRelativeLayout) && i == 0 && (moreOfferCacheReportCallBack = this.f60467e) != null && !this.f60466d) {
            this.f60466d = true;
            moreOfferCacheReportCallBack.mo48866a();
        }
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f60465c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(MoreOfferCacheReportCallBack moreOfferCacheReportCallBack) {
        this.f60467e = moreOfferCacheReportCallBack;
    }

    public void setMoreOfferShowFailedCallBack(MoreOfferShowFailedCallBack moreOfferShowFailedCallBack) {
        this.f60463a = moreOfferShowFailedCallBack;
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
