package com.iab.omid.library.bytedance2.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.walking.async.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC18028b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC18029a f45401a;

    /* renamed from: b */
    protected final InterfaceC18030b f45402b;

    /* renamed from: com.iab.omid.library.bytedance2.walking.async.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18029a {
        /* renamed from: a */
        void mo64250a(AbstractAsyncTaskC18028b abstractAsyncTaskC18028b);
    }

    /* renamed from: com.iab.omid.library.bytedance2.walking.async.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18030b {
        /* renamed from: a */
        JSONObject mo64242a();

        /* renamed from: a */
        void mo64241a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC18028b(InterfaceC18030b interfaceC18030b) {
        this.f45402b = interfaceC18030b;
    }

    /* renamed from: a */
    public void m64253a(InterfaceC18029a interfaceC18029a) {
        this.f45401a = interfaceC18029a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC18029a interfaceC18029a = this.f45401a;
        if (interfaceC18029a != null) {
            interfaceC18029a.mo64250a(this);
        }
    }

    /* renamed from: a */
    public void m64252a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
