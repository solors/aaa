package com.five_corp.p372ad;

import android.view.View;
import android.view.Window;

/* renamed from: com.five_corp.ad.a */
/* loaded from: classes4.dex */
public final class View$OnSystemUiVisibilityChangeListenerC13606a implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Window f25058a;

    public View$OnSystemUiVisibilityChangeListenerC13606a(Window window) {
        this.f25058a = window;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.f25058a.getDecorView().setSystemUiVisibility(2822);
    }
}
