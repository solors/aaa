package com.yandex.mobile.ads.impl;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes8.dex */
public abstract class ni2 extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC30949a f82797a;

    /* renamed from: b */
    protected final InterfaceC30950b f82798b;

    /* renamed from: com.yandex.mobile.ads.impl.ni2$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30949a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.ni2$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30950b {
    }

    public ni2(InterfaceC30950b interfaceC30950b) {
        this.f82798b = interfaceC30950b;
    }

    /* renamed from: a */
    public final void m31499a(InterfaceC30949a interfaceC30949a) {
        this.f82797a = interfaceC30949a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC30949a interfaceC30949a = this.f82797a;
        if (interfaceC30949a != null) {
            ((ri2) interfaceC30949a).m30042a();
        }
    }

    /* renamed from: a */
    public final void m31497a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
