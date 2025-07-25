package com.iab.omid.library.amazon.walking.async;

import com.iab.omid.library.amazon.adsession.C17738a;
import com.iab.omid.library.amazon.internal.C17748c;
import com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC17790e extends AbstractAsyncTaskC17784a {
    public AsyncTaskC17790e(AbstractAsyncTaskC17785b.InterfaceC17787b interfaceC17787b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC17787b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m65195b(String str) {
        C17748c m65380c = C17748c.m65380c();
        if (m65380c != null) {
            for (C17738a c17738a : m65380c.m65382b()) {
                if (this.f44884c.contains(c17738a.getAdSessionId())) {
                    c17738a.getAdSessionStatePublisher().m65312a(str, this.f44886e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f44885d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m65195b(str);
        super.onPostExecute(str);
    }
}
