package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C20245l5;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes6.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* renamed from: a */
    private View f51358a;

    /* renamed from: b */
    private ISBannerSize f51359b;

    /* renamed from: c */
    private String f51360c;

    /* renamed from: d */
    private Activity f51361d;

    /* renamed from: e */
    private boolean f51362e;

    /* renamed from: f */
    private C20245l5 f51363f;

    /* renamed from: com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout$a */
    /* loaded from: classes6.dex */
    class RunnableC20352a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f51364a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout.LayoutParams f51365b;

        RunnableC20352a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f51364a = view;
            this.f51365b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f51364a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f51364a);
            }
            ISDemandOnlyBannerLayout.this.f51358a = this.f51364a;
            ISDemandOnlyBannerLayout.this.addView(this.f51364a, 0, this.f51365b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f51362e = false;
        this.f51361d = activity;
        this.f51359b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f51363f = new C20245l5();
    }

    public Activity getActivity() {
        return this.f51361d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f51363f.m59324a();
    }

    public View getBannerView() {
        return this.f51358a;
    }

    public C20245l5 getListener() {
        return this.f51363f;
    }

    public String getPlacementName() {
        return this.f51360c;
    }

    public ISBannerSize getSize() {
        return this.f51359b;
    }

    public boolean isDestroyed() {
        return this.f51362e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f51363f.m59319b((C20245l5) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f51363f.m59319b((C20245l5) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f51360c = str;
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f51362e = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m56990a() {
        this.f51362e = true;
        this.f51361d = null;
        this.f51359b = null;
        this.f51360c = null;
        this.f51358a = null;
        removeBannerListener();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m56989a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20352a(view, layoutParams));
    }
}
