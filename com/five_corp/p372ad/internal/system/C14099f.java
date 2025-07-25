package com.five_corp.p372ad.internal.system;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: com.five_corp.ad.internal.system.f */
/* loaded from: classes4.dex */
public final class C14099f extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ C14101h f26305a;

    public C14099f(C14101h c14101h) {
        this.f26305a = c14101h;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        C14101h c14101h = this.f26305a;
        c14101h.getClass();
        try {
            c14101h.m78102a();
        } catch (Exception e) {
            c14101h.f26309c.m78269a(e);
        }
    }
}
