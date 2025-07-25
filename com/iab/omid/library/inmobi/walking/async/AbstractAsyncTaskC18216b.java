package com.iab.omid.library.inmobi.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18216b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18217a f45779a;

    /* renamed from: b */
    protected final InterfaceC18218b f45780b;

    /* renamed from: com.iab.omid.library.inmobi.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18217a {
        /* renamed from: a */
        void mo63547a(AbstractAsyncTaskC18216b abstractAsyncTaskC18216b);
    }

    /* renamed from: com.iab.omid.library.inmobi.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18218b {
        /* renamed from: a */
        JSONObject mo63539a();

        /* renamed from: a */
        void mo63538a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18216b(InterfaceC18218b interfaceC18218b) {
        this.f45780b = interfaceC18218b;
    }

    /* renamed from: a */
    public void m63550a(InterfaceC18217a interfaceC18217a) {
        this.f45779a = interfaceC18217a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18217a interfaceC18217a = this.f45779a;
        if (interfaceC18217a != null) {
            interfaceC18217a.mo63547a(this);
        }
    }

    /* renamed from: a */
    public void m63549a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
