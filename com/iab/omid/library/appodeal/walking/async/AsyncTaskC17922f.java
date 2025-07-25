package com.iab.omid.library.appodeal.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.appodeal.adsession.C17867a;
import com.iab.omid.library.appodeal.internal.C17877c;
import com.iab.omid.library.appodeal.utils.C17900c;
import com.iab.omid.library.appodeal.walking.async.AbstractAsyncTaskC17916b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.appodeal.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC17922f extends AbstractAsyncTaskC17915a {
    public AsyncTaskC17922f(AbstractAsyncTaskC17916b.InterfaceC17918b interfaceC17918b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC17918b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m64698b(String str) {
        C17877c m64898c = C17877c.m64898c();
        if (m64898c != null) {
            for (C17867a c17867a : m64898c.m64900b()) {
                if (this.f45148c.contains(c17867a.getAdSessionId())) {
                    c17867a.getAdSessionStatePublisher().m64818b(str, this.f45150e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C17900c.m64778h(this.f45149d, this.f45152b.mo64697a())) {
            return null;
        }
        this.f45152b.mo64696a(this.f45149d);
        return this.f45149d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.appodeal.walking.async.AbstractAsyncTaskC17916b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m64698b(str);
        }
        super.onPostExecute(str);
    }
}
