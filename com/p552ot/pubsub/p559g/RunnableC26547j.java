package com.p552ot.pubsub.p559g;

import com.p552ot.pubsub.util.C26586j;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.g.j */
/* loaded from: classes7.dex */
public final class RunnableC26547j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69540a;

    /* renamed from: b */
    final /* synthetic */ String f69541b;

    /* renamed from: c */
    final /* synthetic */ String f69542c;

    /* renamed from: d */
    final /* synthetic */ String f69543d;

    /* renamed from: e */
    final /* synthetic */ Map f69544e;

    /* renamed from: f */
    final /* synthetic */ boolean f69545f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26547j(String str, String str2, String str3, String str4, Map map, boolean z) {
        this.f69540a = str;
        this.f69541b = str2;
        this.f69542c = str3;
        this.f69543d = str4;
        this.f69544e = map;
        this.f69545f = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        C26546i.m41240c(this.f69540a, this.f69541b, this.f69542c, this.f69543d, this.f69544e, this.f69545f);
        C26586j.m41080a("NetworkAccessManager", "save data successfully");
    }
}
