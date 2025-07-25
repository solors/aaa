package com.iab.omid.library.pubnativenet.walking.async;

import com.iab.omid.library.pubnativenet.adsession.C18496a;
import com.iab.omid.library.pubnativenet.internal.C18506c;
import com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18550e extends AbstractAsyncTaskC18544a {
    public AsyncTaskC18550e(AbstractAsyncTaskC18545b.InterfaceC18547b interfaceC18547b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18547b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m62296b(String str) {
        C18506c m62493c = C18506c.m62493c();
        if (m62493c != null) {
            for (C18496a c18496a : m62493c.m62495b()) {
                if (this.f46441c.contains(c18496a.getAdSessionId())) {
                    c18496a.getAdSessionStatePublisher().m62418a(str, this.f46443e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f46442d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m62296b(str);
        super.onPostExecute(str);
    }
}
