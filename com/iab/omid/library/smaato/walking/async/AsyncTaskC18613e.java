package com.iab.omid.library.smaato.walking.async;

import com.iab.omid.library.smaato.adsession.C18559a;
import com.iab.omid.library.smaato.internal.C18569c;
import com.iab.omid.library.smaato.walking.async.AbstractAsyncTaskC18608b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18613e extends AbstractAsyncTaskC18607a {
    public AsyncTaskC18613e(AbstractAsyncTaskC18608b.InterfaceC18610b interfaceC18610b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18610b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m62043b(String str) {
        C18569c m62240c = C18569c.m62240c();
        if (m62240c != null) {
            for (C18559a c18559a : m62240c.m62242b()) {
                if (this.f46576c.contains(c18559a.getAdSessionId())) {
                    c18559a.getAdSessionStatePublisher().m62165a(str, this.f46578e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f46577d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.smaato.walking.async.AbstractAsyncTaskC18608b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m62043b(str);
        super.onPostExecute(str);
    }
}
