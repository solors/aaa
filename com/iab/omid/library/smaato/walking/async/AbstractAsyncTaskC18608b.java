package com.iab.omid.library.smaato.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18608b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18609a f46579a;

    /* renamed from: b */
    protected final InterfaceC18610b f46580b;

    /* renamed from: com.iab.omid.library.smaato.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18609a {
        /* renamed from: a */
        void mo62047a(AbstractAsyncTaskC18608b abstractAsyncTaskC18608b);
    }

    /* renamed from: com.iab.omid.library.smaato.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18610b {
        /* renamed from: a */
        JSONObject mo62039a();

        /* renamed from: a */
        void mo62038a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18608b(InterfaceC18610b interfaceC18610b) {
        this.f46580b = interfaceC18610b;
    }

    /* renamed from: a */
    public void m62050a(InterfaceC18609a interfaceC18609a) {
        this.f46579a = interfaceC18609a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18609a interfaceC18609a = this.f46579a;
        if (interfaceC18609a != null) {
            interfaceC18609a.mo62047a(this);
        }
    }

    /* renamed from: a */
    public void m62049a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
