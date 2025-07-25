package com.taurusx.tax.p604i;

import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.C28549x;
import com.taurusx.tax.p618ui.AppOpenNativeAdActivity;

/* renamed from: com.taurusx.tax.i.g */
/* loaded from: classes7.dex */
public class RunnableC28444g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AppOpenNativeAdActivity f73864a;

    public RunnableC28444g(AppOpenNativeAdActivity appOpenNativeAdActivity) {
        this.f73864a = appOpenNativeAdActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        AppOpenNativeAdActivity appOpenNativeAdActivity = this.f73864a;
        if (appOpenNativeAdActivity.f74135F) {
            if (!appOpenNativeAdActivity.f74130A) {
                appOpenNativeAdActivity.f74132C++;
                LogUtil.m37901iv("AppOpenNativeAdActivity", "valid number  = " + C28549x.m37969a(this.f73864a.f74165s));
                AppOpenNativeAdActivity appOpenNativeAdActivity2 = this.f73864a;
                if (appOpenNativeAdActivity2.f74132C >= C28549x.m37969a(appOpenNativeAdActivity2.f74165s)) {
                    this.f73864a.m37874b();
                    return;
                } else {
                    AppOpenNativeAdActivity.m37876a(this.f73864a);
                    return;
                }
            }
            AppOpenNativeAdActivity.m37876a(appOpenNativeAdActivity);
        }
    }
}
