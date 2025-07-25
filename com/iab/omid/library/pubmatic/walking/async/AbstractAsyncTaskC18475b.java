package com.iab.omid.library.pubmatic.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18475b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18476a f46309a;

    /* renamed from: b */
    protected final InterfaceC18477b f46310b;

    /* renamed from: com.iab.omid.library.pubmatic.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18476a {
        /* renamed from: a */
        void mo62553a(AbstractAsyncTaskC18475b abstractAsyncTaskC18475b);
    }

    /* renamed from: com.iab.omid.library.pubmatic.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18477b {
        /* renamed from: a */
        JSONObject mo62545a();

        /* renamed from: a */
        void mo62544a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18475b(InterfaceC18477b interfaceC18477b) {
        this.f46310b = interfaceC18477b;
    }

    /* renamed from: a */
    public void m62556a(InterfaceC18476a interfaceC18476a) {
        this.f46309a = interfaceC18476a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18476a interfaceC18476a = this.f46309a;
        if (interfaceC18476a != null) {
            interfaceC18476a.mo62553a(this);
        }
    }

    /* renamed from: a */
    public void m62555a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
