package com.iab.omid.library.corpmailru.walking.p397a;

import com.iab.omid.library.corpmailru.adsession.C18045a;
import com.iab.omid.library.corpmailru.p393b.C18047a;
import com.iab.omid.library.corpmailru.walking.p397a.AbstractAsyncTaskC18080b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18085e extends AbstractAsyncTaskC18079a {
    public AsyncTaskC18085e(AbstractAsyncTaskC18080b.InterfaceC18082b interfaceC18082b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18082b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m64037b(String str) {
        C18047a m64206a = C18047a.m64206a();
        if (m64206a != null) {
            for (C18045a c18045a : m64206a.m64204b()) {
                if (((AbstractAsyncTaskC18079a) this).f45511a.contains(c18045a.getAdSessionId())) {
                    c18045a.getAdSessionStatePublisher().m64093b(str, this.f45513c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f45512b.toString();
    }

    @Override // com.iab.omid.library.corpmailru.walking.p397a.AbstractAsyncTaskC18080b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m64037b(str);
        super.onPostExecute(str);
    }
}
