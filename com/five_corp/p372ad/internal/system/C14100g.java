package com.five_corp.p372ad.internal.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* renamed from: com.five_corp.ad.internal.system.g */
/* loaded from: classes4.dex */
public final class C14100g extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C14101h f26306a;

    public C14100g(C14101h c14101h) {
        this.f26306a = c14101h;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C14101h c14101h = this.f26306a;
        c14101h.getClass();
        try {
            NetworkInfo activeNetworkInfo = c14101h.f26308b.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                c14101h.m78102a();
            }
        } catch (Exception e) {
            c14101h.f26309c.m78269a(e);
        }
    }
}
