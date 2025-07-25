package com.p552ot.pubsub.p564j;

import android.os.SystemClock;
import com.p552ot.pubsub.p559g.C26538c;
import com.p552ot.pubsub.p564j.C26566d;
import com.p552ot.pubsub.util.C26586j;

/* renamed from: com.ot.pubsub.j.j */
/* loaded from: classes7.dex */
class RunnableC26574j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C26566d.HandlerC26567a f69697a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26574j(C26566d.HandlerC26567a handlerC26567a) {
        this.f69697a = handlerC26567a;
    }

    @Override // java.lang.Runnable
    public void run() {
        C26566d.HandlerC26567a handlerC26567a;
        int i;
        C26566d.m41154a().m41149a(false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C26586j.m41080a("UploaderEngine", "Scheduled try track events cost: " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        if (!C26538c.m41280a().m41267e()) {
            handlerC26567a = C26566d.this.f69684g;
            i = C26566d.f69682i;
            handlerC26567a.sendEmptyMessageDelayed(123, i);
        }
    }
}
