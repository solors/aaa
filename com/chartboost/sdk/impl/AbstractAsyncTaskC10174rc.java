package com.chartboost.sdk.impl;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.rc */
/* loaded from: classes3.dex */
public abstract class AbstractAsyncTaskC10174rc extends AsyncTask {

    /* renamed from: a */
    public InterfaceC10175a f23078a;

    /* renamed from: b */
    public final InterfaceC10176b f23079b;

    /* renamed from: com.chartboost.sdk.impl.rc$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10175a {
        /* renamed from: a */
        void mo79783a(AbstractAsyncTaskC10174rc abstractAsyncTaskC10174rc);
    }

    /* renamed from: com.chartboost.sdk.impl.rc$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10176b {
        /* renamed from: a */
        JSONObject mo80648a();

        /* renamed from: a */
        void mo80647a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC10174rc(InterfaceC10176b interfaceC10176b) {
        this.f23079b = interfaceC10176b;
    }

    /* renamed from: a */
    public void m80651a(InterfaceC10175a interfaceC10175a) {
        this.f23078a = interfaceC10175a;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC10175a interfaceC10175a = this.f23078a;
        if (interfaceC10175a != null) {
            interfaceC10175a.mo79783a(this);
        }
    }

    /* renamed from: a */
    public void m80649a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
