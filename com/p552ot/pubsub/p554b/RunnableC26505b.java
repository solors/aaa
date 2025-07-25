package com.p552ot.pubsub.p554b;

import android.text.TextUtils;

/* renamed from: com.ot.pubsub.b.b */
/* loaded from: classes7.dex */
class RunnableC26505b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69322a;

    /* renamed from: b */
    final /* synthetic */ C26502a f69323b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26505b(C26502a c26502a, String str) {
        this.f69323b = c26502a;
        this.f69322a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.isEmpty(this.f69322a)) {
            return;
        }
        this.f69323b.m41424c(this.f69322a);
    }
}
