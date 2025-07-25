package com.p552ot.pubsub.p553a;

import android.text.TextUtils;

/* renamed from: com.ot.pubsub.a.l */
/* loaded from: classes7.dex */
class RunnableC26495l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69278a;

    /* renamed from: b */
    final /* synthetic */ C26494k f69279b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26495l(C26494k c26494k, String str) {
        this.f69279b = c26494k;
        this.f69278a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.equals(this.f69278a, "android.intent.action.SCREEN_OFF") || TextUtils.equals(this.f69278a, "android.intent.action.SCREEN_ON")) {
            this.f69279b.f69277a.m41456e();
        }
    }
}
