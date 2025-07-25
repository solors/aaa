package com.iab.omid.library.corpmailru.walking.p397a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18080b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18081a f45514a;

    /* renamed from: d */
    protected final InterfaceC18082b f45515d;

    /* renamed from: com.iab.omid.library.corpmailru.walking.a.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18081a {
        /* renamed from: a */
        void mo64041a(AbstractAsyncTaskC18080b abstractAsyncTaskC18080b);
    }

    /* renamed from: com.iab.omid.library.corpmailru.walking.a.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18082b {
        /* renamed from: a */
        void mo64032a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo64030b();
    }

    public AbstractAsyncTaskC18080b(InterfaceC18082b interfaceC18082b) {
        this.f45515d = interfaceC18082b;
    }

    /* renamed from: a */
    public void m64044a(InterfaceC18081a interfaceC18081a) {
        this.f45514a = interfaceC18081a;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18081a interfaceC18081a = this.f45514a;
        if (interfaceC18081a != null) {
            interfaceC18081a.mo64041a(this);
        }
    }

    /* renamed from: a */
    public void m64043a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
