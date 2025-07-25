package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* renamed from: com.fyber.inneractive.sdk.activities.b */
/* loaded from: classes4.dex */
public final class C14179b implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ InneractiveBaseActivity f26882a;

    public C14179b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.f26882a = inneractiveBaseActivity;
    }

    public final void onBackInvoked() {
        this.f26882a.onBackPressed();
    }
}
