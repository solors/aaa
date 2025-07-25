package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.gc */
/* loaded from: classes6.dex */
public class HandlerC19968gc extends Handler {

    /* renamed from: a */
    private final ConcurrentHashMap<String, InterfaceC20057hn> f50201a;

    public HandlerC19968gc(Looper looper) {
        super(looper);
        this.f50201a = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m58437a(String str, InterfaceC20057hn interfaceC20057hn) {
        if (str == null || interfaceC20057hn == null) {
            return;
        }
        this.f50201a.put(str, interfaceC20057hn);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C21314zf c21314zf = (C21314zf) message.obj;
            String path = c21314zf.getPath();
            InterfaceC20057hn interfaceC20057hn = this.f50201a.get(path);
            if (interfaceC20057hn == null) {
                return;
            }
            if (m58438a(message.what)) {
                interfaceC20057hn.mo55123a(c21314zf);
            } else {
                int i = message.what;
                interfaceC20057hn.mo55122a(c21314zf, new C20757rf(i, C21280yt.m53938a(i)));
            }
            this.f50201a.remove(path);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* renamed from: a */
    private boolean m58438a(int i) {
        return i == 1016 || i == 1015;
    }
}
