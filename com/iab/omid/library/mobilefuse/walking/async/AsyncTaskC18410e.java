package com.iab.omid.library.mobilefuse.walking.async;

import com.iab.omid.library.mobilefuse.adsession.C18356a;
import com.iab.omid.library.mobilefuse.internal.C18366c;
import com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18410e extends AbstractAsyncTaskC18404a {
    public AsyncTaskC18410e(AbstractAsyncTaskC18405b.InterfaceC18407b interfaceC18407b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18407b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m62802b(String str) {
        C18366c m62999c = C18366c.m62999c();
        if (m62999c != null) {
            for (C18356a c18356a : m62999c.m63001b()) {
                if (this.f46171c.contains(c18356a.getAdSessionId())) {
                    c18356a.getAdSessionStatePublisher().m62924a(str, this.f46173e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f46172d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m62802b(str);
        super.onPostExecute(str);
    }
}
