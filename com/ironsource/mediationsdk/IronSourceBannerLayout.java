package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C20309m5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: classes6.dex */
public class IronSourceBannerLayout extends FrameLayout {

    /* renamed from: a */
    private View f51245a;

    /* renamed from: b */
    private ISBannerSize f51246b;

    /* renamed from: c */
    private String f51247c;

    /* renamed from: d */
    private Activity f51248d;

    /* renamed from: e */
    private boolean f51249e;

    /* renamed from: f */
    private boolean f51250f;

    /* renamed from: g */
    private InterfaceC20341a f51251g;

    /* renamed from: com.ironsource.mediationsdk.IronSourceBannerLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC20341a {
        void onWindowFocusChanged(boolean z);
    }

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f51249e = false;
        this.f51250f = false;
        this.f51248d = activity;
        this.f51246b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m57084a() {
        this.f51249e = true;
        this.f51248d = null;
        this.f51246b = null;
        this.f51247c = null;
        this.f51245a = null;
        this.f51251g = null;
        removeBannerListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public IronSourceBannerLayout m57083b() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f51248d, this.f51246b);
        ironSourceBannerLayout.setPlacementName(this.f51247c);
        return ironSourceBannerLayout;
    }

    public Activity getActivity() {
        return this.f51248d;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return C20309m5.m57329a().m57324b();
    }

    public String getPlacementName() {
        return this.f51247c;
    }

    public ISBannerSize getSize() {
        return this.f51246b;
    }

    public InterfaceC20341a getWindowFocusChangedListener() {
        return this.f51251g;
    }

    public boolean isDestroyed() {
        return this.f51249e;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        InterfaceC20341a interfaceC20341a = this.f51251g;
        if (interfaceC20341a != null) {
            interfaceC20341a.onWindowFocusChanged(z);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info();
        C20309m5.m57329a().m57325a((LevelPlayBannerListener) null);
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f51246b = iSBannerSize;
    }

    @Deprecated
    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info();
        C20309m5.m57329a().m57325a(levelPlayBannerListener);
    }

    public void setPlacementName(String str) {
        this.f51247c = str;
    }

    public void setWindowFocusChangedListener(InterfaceC20341a interfaceC20341a) {
        this.f51251g = interfaceC20341a;
    }

    public IronSourceBannerLayout(Context context) {
        super(context);
        this.f51249e = false;
        this.f51250f = false;
    }
}
