package com.p552ot.pubsub.p564j;

import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26587k;

/* renamed from: com.ot.pubsub.j.h */
/* loaded from: classes7.dex */
class RunnableC26572h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C26571g f69695a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26572h(C26571g c26571g) {
        this.f69695a = c26571g;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f69695a.f69694a.m41141e();
        try {
            boolean m41063a = C26587k.m41063a();
            C26586j.m41080a("UploaderEngine", "UploadTimer netReceiver, 网络是否可用=" + m41063a);
            if (!m41063a) {
                this.f69695a.f69694a.m41134l();
            } else {
                C26566d.m41154a().m41149a(false);
                C26566d.m41154a().m41152a(0, false);
                C26566d.m41154a().m41152a(1, false);
                C26566d.m41154a().m41152a(2, false);
                this.f69695a.f69694a.m41135k();
            }
        } catch (Exception e) {
            C26586j.m41080a("UploaderEngine", "netReceiver: " + e);
        }
    }
}
