package com.iab.omid.library.bigosg.walking.p391a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.walking.a.b */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC17969b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC17970a f45272a;

    /* renamed from: d */
    protected final InterfaceC17971b f45273d;

    /* renamed from: com.iab.omid.library.bigosg.walking.a.b$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17970a {
        /* renamed from: a */
        void mo64491a(AbstractAsyncTaskC17969b abstractAsyncTaskC17969b);
    }

    /* renamed from: com.iab.omid.library.bigosg.walking.a.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17971b {
        /* renamed from: a */
        void mo64482a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo64480b();
    }

    public AbstractAsyncTaskC17969b(InterfaceC17971b interfaceC17971b) {
        this.f45273d = interfaceC17971b;
    }

    /* renamed from: a */
    public void m64494a(InterfaceC17970a interfaceC17970a) {
        this.f45272a = interfaceC17970a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC17970a interfaceC17970a = this.f45272a;
        if (interfaceC17970a != null) {
            interfaceC17970a.mo64491a(this);
        }
    }

    /* renamed from: a */
    public void m64493a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
