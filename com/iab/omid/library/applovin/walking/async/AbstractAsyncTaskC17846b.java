package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC17846b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC17847a f45016a;

    /* renamed from: b */
    protected final InterfaceC17848b f45017b;

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17847a {
        /* renamed from: a */
        void mo64958a(AbstractAsyncTaskC17846b abstractAsyncTaskC17846b);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17848b {
        /* renamed from: a */
        JSONObject mo64950a();

        /* renamed from: a */
        void mo64949a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC17846b(InterfaceC17848b interfaceC17848b) {
        this.f45017b = interfaceC17848b;
    }

    /* renamed from: a */
    public void m64961a(InterfaceC17847a interfaceC17847a) {
        this.f45016a = interfaceC17847a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC17847a interfaceC17847a = this.f45016a;
        if (interfaceC17847a != null) {
            interfaceC17847a.mo64958a(this);
        }
    }

    /* renamed from: a */
    public void m64960a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
