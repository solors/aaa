package com.iab.omid.library.mmadbridge.walking.async;

import com.iab.omid.library.mmadbridge.adsession.C18286a;
import com.iab.omid.library.mmadbridge.internal.C18296c;
import com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18340e extends AbstractAsyncTaskC18334a {
    public AsyncTaskC18340e(AbstractAsyncTaskC18335b.InterfaceC18337b interfaceC18337b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18337b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m63055b(String str) {
        C18296c m63252c = C18296c.m63252c();
        if (m63252c != null) {
            for (C18286a c18286a : m63252c.m63254b()) {
                if (this.f46036c.contains(c18286a.getAdSessionId())) {
                    c18286a.getAdSessionStatePublisher().m63177a(str, this.f46038e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f46037d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m63055b(str);
        super.onPostExecute(str);
    }
}
