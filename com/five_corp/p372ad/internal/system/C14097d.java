package com.five_corp.p372ad.internal.system;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: com.five_corp.ad.internal.system.d */
/* loaded from: classes4.dex */
public final class C14097d {

    /* renamed from: a */
    public final Context f26304a;

    static {
        C14097d.class.toString();
    }

    public C14097d(Context context) {
        this.f26304a = context;
    }

    /* renamed from: a */
    public final boolean m78103a() {
        try {
            return ((ConnectivityManager) this.f26304a.getSystemService("connectivity")).isActiveNetworkMetered();
        } catch (Throwable unused) {
            return false;
        }
    }
}
