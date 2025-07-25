package com.iab.omid.library.appodeal.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC17916b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC17917a f45151a;

    /* renamed from: b */
    protected final InterfaceC17918b f45152b;

    /* renamed from: com.iab.omid.library.appodeal.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17917a {
        /* renamed from: a */
        void mo64705a(AbstractAsyncTaskC17916b abstractAsyncTaskC17916b);
    }

    /* renamed from: com.iab.omid.library.appodeal.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17918b {
        /* renamed from: a */
        JSONObject mo64697a();

        /* renamed from: a */
        void mo64696a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC17916b(InterfaceC17918b interfaceC17918b) {
        this.f45152b = interfaceC17918b;
    }

    /* renamed from: a */
    public void m64708a(InterfaceC17917a interfaceC17917a) {
        this.f45151a = interfaceC17917a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC17917a interfaceC17917a = this.f45151a;
        if (interfaceC17917a != null) {
            interfaceC17917a.mo64705a(this);
        }
    }

    /* renamed from: a */
    public void m64707a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
