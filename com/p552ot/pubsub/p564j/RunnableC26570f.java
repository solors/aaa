package com.p552ot.pubsub.p564j;

import android.text.TextUtils;

/* renamed from: com.ot.pubsub.j.f */
/* loaded from: classes7.dex */
class RunnableC26570f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69692a;

    /* renamed from: b */
    final /* synthetic */ C26569e f69693b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26570f(C26569e c26569e, String str) {
        this.f69693b = c26569e;
        this.f69692a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.equals(this.f69692a, "android.intent.action.SCREEN_OFF")) {
            this.f69693b.f69691a.m41134l();
            C26566d.m41154a().m41149a(false);
            C26566d.m41154a().m41152a(2, false);
        } else if (TextUtils.equals(this.f69692a, "android.intent.action.SCREEN_ON")) {
            this.f69693b.f69691a.m41135k();
            C26566d.m41154a().m41149a(false);
            C26566d.m41154a().m41152a(0, false);
        }
    }
}
