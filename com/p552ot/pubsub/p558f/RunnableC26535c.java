package com.p552ot.pubsub.p558f;

import com.p552ot.pubsub.p559g.C26542f;
import java.util.Map;

/* renamed from: com.ot.pubsub.f.c */
/* loaded from: classes7.dex */
final class RunnableC26535c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69442a;

    /* renamed from: b */
    final /* synthetic */ String f69443b;

    /* renamed from: c */
    final /* synthetic */ String f69444c;

    /* renamed from: d */
    final /* synthetic */ String f69445d;

    /* renamed from: e */
    final /* synthetic */ String f69446e;

    /* renamed from: f */
    final /* synthetic */ String f69447f;

    /* renamed from: g */
    final /* synthetic */ Map f69448g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26535c(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.f69442a = str;
        this.f69443b = str2;
        this.f69444c = str3;
        this.f69445d = str4;
        this.f69446e = str5;
        this.f69447f = str6;
        this.f69448g = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        C26542f.m41264a().m41259a(this.f69446e, this.f69447f, C26533a.m41291a(this.f69442a, this.f69443b, this.f69444c, this.f69445d), this.f69448g);
    }
}
