package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.adsession.C18169a;
import com.iab.omid.library.inmobi.internal.C18179c;
import com.iab.omid.library.inmobi.walking.async.AbstractAsyncTaskC18216b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18221e extends AbstractAsyncTaskC18215a {
    public AsyncTaskC18221e(AbstractAsyncTaskC18216b.InterfaceC18218b interfaceC18218b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18218b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m63543b(String str) {
        C18179c m63728c = C18179c.m63728c();
        if (m63728c != null) {
            for (C18169a c18169a : m63728c.m63730b()) {
                if (this.f45776c.contains(c18169a.getAdSessionId())) {
                    c18169a.getAdSessionStatePublisher().m63660a(str, this.f45778e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f45777d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.inmobi.walking.async.AbstractAsyncTaskC18216b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m63543b(str);
        super.onPostExecute(str);
    }
}
