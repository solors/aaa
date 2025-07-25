package com.iab.omid.library.fyber.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18148b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18149a f45650a;

    /* renamed from: b */
    protected final InterfaceC18150b f45651b;

    /* renamed from: com.iab.omid.library.fyber.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18149a {
        /* renamed from: a */
        void mo63788a(AbstractAsyncTaskC18148b abstractAsyncTaskC18148b);
    }

    /* renamed from: com.iab.omid.library.fyber.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18150b {
        /* renamed from: a */
        JSONObject mo63780a();

        /* renamed from: a */
        void mo63779a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18148b(InterfaceC18150b interfaceC18150b) {
        this.f45651b = interfaceC18150b;
    }

    /* renamed from: a */
    public void m63791a(InterfaceC18149a interfaceC18149a) {
        this.f45650a = interfaceC18149a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18149a interfaceC18149a = this.f45650a;
        if (interfaceC18149a != null) {
            interfaceC18149a.mo63788a(this);
        }
    }

    /* renamed from: a */
    public void m63790a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
