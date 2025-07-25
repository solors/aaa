package com.iab.omid.library.pubmatic.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.pubmatic.adsession.C18426a;
import com.iab.omid.library.pubmatic.internal.C18436c;
import com.iab.omid.library.pubmatic.utils.C18459c;
import com.iab.omid.library.pubmatic.walking.async.AbstractAsyncTaskC18475b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubmatic.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC18481f extends AbstractAsyncTaskC18474a {
    public AsyncTaskC18481f(AbstractAsyncTaskC18475b.InterfaceC18477b interfaceC18477b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18477b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m62546b(String str) {
        C18436c m62746c = C18436c.m62746c();
        if (m62746c != null) {
            for (C18426a c18426a : m62746c.m62748b()) {
                if (this.f46306c.contains(c18426a.getAdSessionId())) {
                    c18426a.getAdSessionStatePublisher().m62666b(str, this.f46308e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18459c.m62626h(this.f46307d, this.f46310b.mo62545a())) {
            return null;
        }
        this.f46310b.mo62544a(this.f46307d);
        return this.f46307d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.pubmatic.walking.async.AbstractAsyncTaskC18475b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m62546b(str);
        }
        super.onPostExecute(str);
    }
}
