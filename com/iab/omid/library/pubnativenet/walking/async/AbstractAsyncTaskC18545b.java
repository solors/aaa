package com.iab.omid.library.pubnativenet.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18545b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18546a f46444a;

    /* renamed from: b */
    protected final InterfaceC18547b f46445b;

    /* renamed from: com.iab.omid.library.pubnativenet.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18546a {
        /* renamed from: a */
        void mo62300a(AbstractAsyncTaskC18545b abstractAsyncTaskC18545b);
    }

    /* renamed from: com.iab.omid.library.pubnativenet.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18547b {
        /* renamed from: a */
        JSONObject mo62292a();

        /* renamed from: a */
        void mo62291a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18545b(InterfaceC18547b interfaceC18547b) {
        this.f46445b = interfaceC18547b;
    }

    /* renamed from: a */
    public void m62303a(InterfaceC18546a interfaceC18546a) {
        this.f46444a = interfaceC18546a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18546a interfaceC18546a = this.f46444a;
        if (interfaceC18546a != null) {
            interfaceC18546a.mo62300a(this);
        }
    }

    /* renamed from: a */
    public void m62302a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
