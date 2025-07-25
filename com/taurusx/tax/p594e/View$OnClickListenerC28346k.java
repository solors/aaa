package com.taurusx.tax.p594e;

import android.view.View;
import com.taurusx.tax.mraid.MraidBrowser;

/* renamed from: com.taurusx.tax.e.k */
/* loaded from: classes7.dex */
public class View$OnClickListenerC28346k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MraidBrowser f73603a;

    public View$OnClickListenerC28346k(MraidBrowser mraidBrowser) {
        this.f73603a = mraidBrowser;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f73603a.f74066a.canGoBack()) {
            this.f73603a.f74066a.goBack();
        }
    }
}
