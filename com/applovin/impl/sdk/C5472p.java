package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p134ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.sdk.p */
/* loaded from: classes2.dex */
public class C5472p {

    /* renamed from: a */
    private final Queue f10214a = new LinkedList();

    /* renamed from: b */
    private final Object f10215b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m94723a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10215b) {
            if (m94722b() <= 25) {
                this.f10214a.offer(appLovinAdImpl);
            } else {
                C5434n.m94898h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m94722b() {
        int size;
        synchronized (this.f10215b) {
            size = this.f10214a.size();
        }
        return size;
    }

    /* renamed from: c */
    boolean m94720c() {
        boolean z;
        synchronized (this.f10215b) {
            if (m94722b() == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public AppLovinAdImpl m94719d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f10215b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f10214a.peek();
        }
        return appLovinAdImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m94721b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f10215b) {
            this.f10214a.remove(appLovinAdImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AppLovinAdImpl m94724a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f10215b) {
            appLovinAdImpl = !m94720c() ? (AppLovinAdImpl) this.f10214a.poll() : null;
        }
        return appLovinAdImpl;
    }
}
