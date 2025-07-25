package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.ag */
/* loaded from: classes2.dex */
public class C4064ag extends BroadcastReceiver {

    /* renamed from: a */
    private final List f4710a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.ag$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4065a {
        /* renamed from: a */
        void mo95033a();

        /* renamed from: b */
        void mo95032b();
    }

    public C4064ag(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: a */
    private static boolean m100804a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get("networkInfo");
            if (obj instanceof NetworkInfo) {
                return ((NetworkInfo) obj).isConnected();
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void m100802b(InterfaceC4065a interfaceC4065a) {
        this.f4710a.remove(interfaceC4065a);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || isInitialStickyBroadcast()) {
            return;
        }
        ArrayList<InterfaceC4065a> arrayList = new ArrayList(this.f4710a);
        if (m100804a(intent)) {
            for (InterfaceC4065a interfaceC4065a : arrayList) {
                interfaceC4065a.mo95033a();
            }
            return;
        }
        for (InterfaceC4065a interfaceC4065a2 : arrayList) {
            interfaceC4065a2.mo95032b();
        }
    }

    /* renamed from: a */
    public void m100803a(InterfaceC4065a interfaceC4065a) {
        this.f4710a.add(interfaceC4065a);
    }
}
