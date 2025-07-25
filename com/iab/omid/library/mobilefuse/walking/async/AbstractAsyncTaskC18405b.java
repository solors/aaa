package com.iab.omid.library.mobilefuse.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18405b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18406a f46174a;

    /* renamed from: b */
    protected final InterfaceC18407b f46175b;

    /* renamed from: com.iab.omid.library.mobilefuse.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18406a {
        /* renamed from: a */
        void mo62806a(AbstractAsyncTaskC18405b abstractAsyncTaskC18405b);
    }

    /* renamed from: com.iab.omid.library.mobilefuse.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18407b {
        /* renamed from: a */
        JSONObject mo62798a();

        /* renamed from: a */
        void mo62797a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18405b(InterfaceC18407b interfaceC18407b) {
        this.f46175b = interfaceC18407b;
    }

    /* renamed from: a */
    public void m62809a(InterfaceC18406a interfaceC18406a) {
        this.f46174a = interfaceC18406a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18406a interfaceC18406a = this.f46174a;
        if (interfaceC18406a != null) {
            interfaceC18406a.mo62806a(this);
        }
    }

    /* renamed from: a */
    public void m62808a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
