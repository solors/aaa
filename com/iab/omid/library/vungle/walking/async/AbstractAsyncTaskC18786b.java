package com.iab.omid.library.vungle.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18786b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18787a f46970a;

    /* renamed from: b */
    protected final InterfaceC18788b f46971b;

    /* renamed from: com.iab.omid.library.vungle.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18787a {
        /* renamed from: a */
        void mo61325a(AbstractAsyncTaskC18786b abstractAsyncTaskC18786b);
    }

    /* renamed from: com.iab.omid.library.vungle.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18788b {
        /* renamed from: a */
        JSONObject mo61317a();

        /* renamed from: a */
        void mo61316a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18786b(InterfaceC18788b interfaceC18788b) {
        this.f46971b = interfaceC18788b;
    }

    /* renamed from: a */
    public void m61328a(InterfaceC18787a interfaceC18787a) {
        this.f46970a = interfaceC18787a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18787a interfaceC18787a = this.f46970a;
        if (interfaceC18787a != null) {
            interfaceC18787a.mo61325a(this);
        }
    }

    /* renamed from: a */
    public void m61327a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
