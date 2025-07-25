package com.iab.omid.library.taurusx.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18666b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18667a f46707a;

    /* renamed from: b */
    protected final InterfaceC18668b f46708b;

    /* renamed from: com.iab.omid.library.taurusx.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18667a {
        /* renamed from: a */
        void mo61812a(AbstractAsyncTaskC18666b abstractAsyncTaskC18666b);
    }

    /* renamed from: com.iab.omid.library.taurusx.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18668b {
        /* renamed from: a */
        JSONObject mo61804a();

        /* renamed from: a */
        void mo61803a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18666b(InterfaceC18668b interfaceC18668b) {
        this.f46708b = interfaceC18668b;
    }

    /* renamed from: a */
    public void m61815a(InterfaceC18667a interfaceC18667a) {
        this.f46707a = interfaceC18667a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18667a interfaceC18667a = this.f46707a;
        if (interfaceC18667a != null) {
            interfaceC18667a.mo61812a(this);
        }
    }

    /* renamed from: a */
    public void m61814a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
