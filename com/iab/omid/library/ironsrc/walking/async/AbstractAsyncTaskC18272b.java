package com.iab.omid.library.ironsrc.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18272b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18273a f45904a;

    /* renamed from: b */
    protected final InterfaceC18274b f45905b;

    /* renamed from: com.iab.omid.library.ironsrc.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18273a {
        /* renamed from: a */
        void mo63312a(AbstractAsyncTaskC18272b abstractAsyncTaskC18272b);
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18274b {
        /* renamed from: a */
        JSONObject mo63304a();

        /* renamed from: a */
        void mo63303a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18272b(InterfaceC18274b interfaceC18274b) {
        this.f45905b = interfaceC18274b;
    }

    /* renamed from: a */
    public void m63315a(InterfaceC18273a interfaceC18273a) {
        this.f45904a = interfaceC18273a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18273a interfaceC18273a = this.f45904a;
        if (interfaceC18273a != null) {
            interfaceC18273a.mo63312a(this);
        }
    }

    /* renamed from: a */
    public void m63314a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
