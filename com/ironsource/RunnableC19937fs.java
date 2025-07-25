package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.fs */
/* loaded from: classes6.dex */
public class RunnableC19937fs implements Runnable {

    /* renamed from: a */
    private final Handler f50138a;

    /* renamed from: b */
    private final C20574oa f50139b;

    public RunnableC19937fs(C20574oa c20574oa, Handler handler) {
        this.f50139b = c20574oa;
        this.f50138a = handler;
    }

    /* renamed from: a */
    Message m58520a() {
        return new Message();
    }

    @Override // java.lang.Runnable
    public void run() {
        int m55854b;
        C21314zf c21314zf = new C21314zf(this.f50139b.m56041b().getParent(), this.f50139b.m56041b().getName());
        Message m58520a = m58520a();
        m58520a.obj = c21314zf;
        String m58518a = m58518a(c21314zf.getParent());
        if (m58518a == null) {
            m55854b = 1020;
        } else {
            C20629pa call = m58519a(new C20574oa(c21314zf, this.f50139b.m56038e(), this.f50139b.m56042a(), this.f50139b.m56040c(), this.f50139b.m56037f(), this.f50139b.m56039d()), m58518a, 3L).call();
            if (call.m55854b() == 200) {
                m55854b = 1016;
            } else {
                m55854b = call.m55854b();
            }
        }
        m58520a.what = m55854b;
        this.f50138a.sendMessage(m58520a);
    }

    /* renamed from: a */
    CallableC20145jc m58519a(C20574oa c20574oa, String str, long j) {
        return new CallableC20145jc(c20574oa, str, j);
    }

    /* renamed from: a */
    String m58518a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
