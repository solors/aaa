package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.qa */
/* loaded from: classes6.dex */
public class HandlerC20681qa extends Handler {

    /* renamed from: b */
    private static final String f52539b = "DownloadHandler";

    /* renamed from: a */
    InterfaceC20057hn f52540a;

    public HandlerC20681qa(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    public void m55658a() {
        this.f52540a = null;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        InterfaceC20057hn interfaceC20057hn = this.f52540a;
        if (interfaceC20057hn == null) {
            Logger.m54970i(f52539b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i = message.what;
            if (i != 1016) {
                this.f52540a.mo55122a((C21314zf) message.obj, new C20757rf(i, C21280yt.m53938a(i)));
                return;
            }
            interfaceC20057hn.mo55123a((C21314zf) message.obj);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            Logger.m54970i(f52539b, "handleMessage | Got exception: " + th.getMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* renamed from: a */
    public void m55657a(InterfaceC20057hn interfaceC20057hn) {
        if (interfaceC20057hn == null) {
            throw new IllegalArgumentException();
        }
        this.f52540a = interfaceC20057hn;
    }
}
