package com.inmobi.media;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Xa */
/* loaded from: classes6.dex */
public final class C19166Xa extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onAvailable(network);
        C18954Ha.m61066f().m61246b(new C18945H1(10, 4, "available"));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        C18954Ha.m61066f().m61246b(new C18945H1(10, 4, "lost"));
    }
}
