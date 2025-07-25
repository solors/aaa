package com.p551my.tracker.obfuscated;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.my.tracker.obfuscated.l0 */
/* loaded from: classes7.dex */
public final class C26362l0 {

    /* renamed from: a */
    private int f68714a = -1;

    /* renamed from: b */
    private int f68715b = -1;

    /* renamed from: c */
    private String f68716c;

    /* renamed from: a */
    public void m41928a(Context context) {
        this.f68714a = -1;
        this.f68715b = -1;
        this.f68716c = null;
        if (C26378o0.m41900a("android.permission.ACCESS_NETWORK_STATE", context)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        this.f68714a = 2;
                    } else if (type != 1) {
                        this.f68714a = 1;
                    } else {
                        this.f68714a = 3;
                    }
                    this.f68716c = activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName();
                }
            } catch (SecurityException unused) {
                C26468z0.m41528a("No permissions for access to network state");
            }
        }
        if (C26378o0.m41901a() || !C26378o0.m41900a("android.permission.BLUETOOTH", context)) {
            return;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                this.f68715b = defaultAdapter.isEnabled() ? 1 : 0;
            }
        } catch (SecurityException unused2) {
            C26468z0.m41528a("Permission android.permission.BLUETOOTH check was positive, but still got security exception on the bluetooth provider");
        }
    }

    /* renamed from: a */
    public void m41927a(C26405s0 c26405s0, Context context) {
        c26405s0.m41716a(this.f68714a, this.f68716c);
        int i = this.f68715b;
        if (i != -1) {
            c26405s0.m41670g(i);
        }
    }

    /* renamed from: b */
    public void m41926b(Context context) {
    }
}
