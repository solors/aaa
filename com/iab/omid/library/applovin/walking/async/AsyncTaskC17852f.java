package com.iab.omid.library.applovin.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.applovin.adsession.C17799a;
import com.iab.omid.library.applovin.internal.C17809c;
import com.iab.omid.library.applovin.utils.C17830c;
import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC17846b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC17852f extends AbstractAsyncTaskC17845a {
    public AsyncTaskC17852f(AbstractAsyncTaskC17846b.InterfaceC17848b interfaceC17848b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC17848b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m64951b(String str) {
        C17809c m65139c = C17809c.m65139c();
        if (m65139c != null) {
            for (C17799a c17799a : m65139c.m65141b()) {
                if (this.f45013c.contains(c17799a.getAdSessionId())) {
                    c17799a.getAdSessionStatePublisher().m65066b(str, this.f45015e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C17830c.m65028h(this.f45014d, this.f45017b.mo64950a())) {
            return null;
        }
        this.f45017b.mo64949a(this.f45014d);
        return this.f45014d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC17846b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m64951b(str);
        }
        super.onPostExecute(str);
    }
}
