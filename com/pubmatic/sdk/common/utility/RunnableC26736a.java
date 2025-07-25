package com.pubmatic.sdk.common.utility;

import com.pubmatic.sdk.common.utility.POBLooper;

/* renamed from: com.pubmatic.sdk.common.utility.a */
/* loaded from: classes7.dex */
class RunnableC26736a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ POBLooper.RunnableC26732b f70328a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26736a(POBLooper.RunnableC26732b runnableC26732b) {
        this.f70328a = runnableC26732b;
    }

    @Override // java.lang.Runnable
    public void run() {
        POBLooper.this.m40542a();
    }
}
