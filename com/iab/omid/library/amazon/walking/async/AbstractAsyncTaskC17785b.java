package com.iab.omid.library.amazon.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC17785b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC17786a f44887a;

    /* renamed from: b */
    protected final InterfaceC17787b f44888b;

    /* renamed from: com.iab.omid.library.amazon.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17786a {
        /* renamed from: a */
        void mo65199a(AbstractAsyncTaskC17785b abstractAsyncTaskC17785b);
    }

    /* renamed from: com.iab.omid.library.amazon.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17787b {
        /* renamed from: a */
        JSONObject mo65191a();

        /* renamed from: a */
        void mo65190a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC17785b(InterfaceC17787b interfaceC17787b) {
        this.f44888b = interfaceC17787b;
    }

    /* renamed from: a */
    public void m65202a(InterfaceC17786a interfaceC17786a) {
        this.f44887a = interfaceC17786a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC17786a interfaceC17786a = this.f44887a;
        if (interfaceC17786a != null) {
            interfaceC17786a.mo65199a(this);
        }
    }

    /* renamed from: a */
    public void m65201a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
