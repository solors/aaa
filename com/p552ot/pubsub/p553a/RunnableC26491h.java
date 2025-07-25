package com.p552ot.pubsub.p553a;

import com.p552ot.pubsub.util.C26586j;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.a.h */
/* loaded from: classes7.dex */
public class RunnableC26491h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69263a;

    /* renamed from: b */
    final /* synthetic */ String f69264b;

    /* renamed from: c */
    final /* synthetic */ String f69265c;

    /* renamed from: d */
    final /* synthetic */ Map f69266d;

    /* renamed from: e */
    final /* synthetic */ boolean f69267e;

    /* renamed from: f */
    final /* synthetic */ C26487d f69268f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26491h(C26487d c26487d, String str, String str2, String str3, Map map, boolean z) {
        this.f69268f = c26487d;
        this.f69263a = str;
        this.f69264b = str2;
        this.f69265c = str3;
        this.f69266d = map;
        this.f69267e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC26486c interfaceC26486c;
        try {
            interfaceC26486c = this.f69268f.f69251d;
            interfaceC26486c.mo41449a(this.f69263a, this.f69264b, this.f69265c, this.f69266d, this.f69267e);
        } catch (Exception e) {
            C26586j.m41074b("PubSubTrackImp", "publish pb data error: " + e.toString());
        }
    }
}
