package com.iab.omid.library.unity3d.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18723b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18724a f46835a;

    /* renamed from: b */
    protected final InterfaceC18725b f46836b;

    /* renamed from: com.iab.omid.library.unity3d.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18724a {
        /* renamed from: a */
        void mo61578a(AbstractAsyncTaskC18723b abstractAsyncTaskC18723b);
    }

    /* renamed from: com.iab.omid.library.unity3d.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18725b {
        /* renamed from: a */
        JSONObject mo61570a();

        /* renamed from: a */
        void mo61569a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18723b(InterfaceC18725b interfaceC18725b) {
        this.f46836b = interfaceC18725b;
    }

    /* renamed from: a */
    public void m61581a(InterfaceC18724a interfaceC18724a) {
        this.f46835a = interfaceC18724a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18724a interfaceC18724a = this.f46835a;
        if (interfaceC18724a != null) {
            interfaceC18724a.mo61578a(this);
        }
    }

    /* renamed from: a */
    public void m61580a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
