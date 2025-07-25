package com.fyber.inneractive.sdk.p377ui;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;

/* renamed from: com.fyber.inneractive.sdk.ui.a */
/* loaded from: classes4.dex */
public final class View$OnClickListenerC15400a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveFullscreenAdActivity f30539a;

    public View$OnClickListenerC15400a(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f30539a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f30539a.dismissAd(true);
    }
}
