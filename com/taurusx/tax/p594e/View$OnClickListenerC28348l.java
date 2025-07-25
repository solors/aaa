package com.taurusx.tax.p594e;

import android.view.View;
import com.taurusx.tax.mraid.MraidBrowser;

/* renamed from: com.taurusx.tax.e.l */
/* loaded from: classes7.dex */
public class View$OnClickListenerC28348l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ MraidBrowser f73605a;

    public View$OnClickListenerC28348l(MraidBrowser mraidBrowser) {
        this.f73605a = mraidBrowser;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f73605a.f74066a.canGoForward()) {
            this.f73605a.f74066a.goForward();
        }
    }
}
