package com.fyber.inneractive.sdk.network;

import android.app.Application;
import android.os.HandlerThread;
import com.fyber.inneractive.sdk.util.HandlerC15440c0;
import com.fyber.inneractive.sdk.util.InterfaceC15442d0;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.network.f */
/* loaded from: classes4.dex */
public final class C14702f implements InterfaceC15442d0 {

    /* renamed from: d */
    public HandlerC15440c0 f27868d;

    /* renamed from: e */
    public int f27869e;

    /* renamed from: a */
    public final LinkedBlockingQueue f27865a = new LinkedBlockingQueue();

    /* renamed from: b */
    public JSONArray f27866b = new JSONArray();

    /* renamed from: f */
    public boolean f27870f = false;

    /* renamed from: g */
    public boolean f27871g = false;

    /* renamed from: c */
    public final HandlerThread f27867c = new HandlerThread("EventCollectorHandlerThread", 0);

    /* renamed from: a */
    public final void m77708a(Application application) {
        if (!this.f27871g) {
            this.f27871g = true;
            this.f27867c.start();
            HandlerC15440c0 handlerC15440c0 = new HandlerC15440c0(this.f27867c.getLooper(), this);
            this.f27868d = handlerC15440c0;
            this.f27870f = true;
            this.f27869e = 30;
            if (handlerC15440c0.hasMessages(12312329)) {
                this.f27868d.removeMessages(12312329);
            }
            long j = this.f27869e * 1000;
            HandlerC15440c0 handlerC15440c02 = this.f27868d;
            if (handlerC15440c02 != null) {
                handlerC15440c02.post(new RunnableC14696c(this, 12312329, j));
            }
        }
        application.registerActivityLifecycleCallbacks(new C14698d(this));
    }
}
