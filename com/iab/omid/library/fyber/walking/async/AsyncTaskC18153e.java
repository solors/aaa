package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.adsession.C18099a;
import com.iab.omid.library.fyber.internal.C18109c;
import com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18153e extends AbstractAsyncTaskC18147a {
    public AsyncTaskC18153e(AbstractAsyncTaskC18148b.InterfaceC18150b interfaceC18150b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18150b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m63784b(String str) {
        C18109c m63981c = C18109c.m63981c();
        if (m63981c != null) {
            for (C18099a c18099a : m63981c.m63983b()) {
                if (this.f45647c.contains(c18099a.getAdSessionId())) {
                    c18099a.getAdSessionStatePublisher().m63906a(str, this.f45649e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f45648d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m63784b(str);
        super.onPostExecute(str);
    }
}
