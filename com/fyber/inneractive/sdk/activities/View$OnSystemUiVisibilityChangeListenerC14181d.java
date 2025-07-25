package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.AbstractC15465p;

/* renamed from: com.fyber.inneractive.sdk.activities.d */
/* loaded from: classes4.dex */
public final class View$OnSystemUiVisibilityChangeListenerC14181d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ InneractiveFullscreenAdActivity f26884a;

    public View$OnSystemUiVisibilityChangeListenerC14181d(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f26884a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        if ((i & 2) == 0) {
            AbstractC15465p.f30612b.postDelayed(this.f26884a.mHideNavigationBarTask, 3000L);
        }
    }
}
