package com.iab.omid.library.mobilefuse.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.mobilefuse.adsession.C18356a;
import com.iab.omid.library.mobilefuse.internal.C18366c;
import com.iab.omid.library.mobilefuse.utils.C18389c;
import com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mobilefuse.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC18411f extends AbstractAsyncTaskC18404a {
    public AsyncTaskC18411f(AbstractAsyncTaskC18405b.InterfaceC18407b interfaceC18407b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18407b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m62799b(String str) {
        C18366c m62999c = C18366c.m62999c();
        if (m62999c != null) {
            for (C18356a c18356a : m62999c.m63001b()) {
                if (this.f46171c.contains(c18356a.getAdSessionId())) {
                    c18356a.getAdSessionStatePublisher().m62919b(str, this.f46173e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18389c.m62879h(this.f46172d, this.f46175b.mo62798a())) {
            return null;
        }
        this.f46175b.mo62797a(this.f46172d);
        return this.f46172d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.mobilefuse.walking.async.AbstractAsyncTaskC18405b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m62799b(str);
        }
        super.onPostExecute(str);
    }
}
