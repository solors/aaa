package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.adsession.C18228a;
import com.iab.omid.library.ironsrc.internal.C18238c;
import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18277e extends AbstractAsyncTaskC18271a {
    public AsyncTaskC18277e(AbstractAsyncTaskC18272b.InterfaceC18274b interfaceC18274b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18274b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m63308b(String str) {
        C18238c m63484c = C18238c.m63484c();
        if (m63484c != null) {
            for (C18228a c18228a : m63484c.m63486b()) {
                if (this.f45901c.contains(c18228a.getAdSessionId())) {
                    c18228a.getAdSessionStatePublisher().m63422a(str, this.f45903e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f45902d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m63308b(str);
        super.onPostExecute(str);
    }
}
