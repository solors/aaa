package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C5434n;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.ml */
/* loaded from: classes2.dex */
public class C4962ml implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b */
    private final String f8446b;

    /* renamed from: c */
    private final WeakReference f8447c;

    /* renamed from: a */
    private boolean f8445a = true;

    /* renamed from: d */
    private final Set f8448d = new LinkedHashSet();

    /* renamed from: f */
    private final Object f8449f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4962ml(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f8446b = str;
        this.f8447c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    /* renamed from: a */
    public AppLovinCommunicatorSubscriber m97089a() {
        return (AppLovinCommunicatorSubscriber) this.f8447c.get();
    }

    /* renamed from: b */
    public String m97087b() {
        return this.f8446b;
    }

    /* renamed from: c */
    public boolean m97086c() {
        return this.f8445a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4962ml)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8447c.get();
        C4962ml c4962ml = (C4962ml) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) c4962ml.f8447c.get();
        if (m97087b().equals(c4962ml.m97087b())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f8446b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8447c.get();
        int i2 = hashCode * 31;
        if (appLovinCommunicatorSubscriber != null) {
            i = appLovinCommunicatorSubscriber.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z;
        if (m97089a() == null) {
            C5434n.m94898h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f8449f) {
            if (!this.f8448d.contains(communicatorMessageImpl.getUniqueId())) {
                this.f8448d.add(communicatorMessageImpl.getUniqueId());
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            m97089a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    /* renamed from: a */
    public void m97088a(boolean z) {
        this.f8445a = z;
    }
}
