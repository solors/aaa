package com.iab.omid.library.mmadbridge.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18335b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18336a f46039a;

    /* renamed from: b */
    protected final InterfaceC18337b f46040b;

    /* renamed from: com.iab.omid.library.mmadbridge.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18336a {
        /* renamed from: a */
        void mo63059a(AbstractAsyncTaskC18335b abstractAsyncTaskC18335b);
    }

    /* renamed from: com.iab.omid.library.mmadbridge.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18337b {
        /* renamed from: a */
        JSONObject mo63051a();

        /* renamed from: a */
        void mo63050a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18335b(InterfaceC18337b interfaceC18337b) {
        this.f46040b = interfaceC18337b;
    }

    /* renamed from: a */
    public void m63062a(InterfaceC18336a interfaceC18336a) {
        this.f46039a = interfaceC18336a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18336a interfaceC18336a = this.f46039a;
        if (interfaceC18336a != null) {
            interfaceC18336a.mo63059a(this);
        }
    }

    /* renamed from: a */
    public void m63061a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
