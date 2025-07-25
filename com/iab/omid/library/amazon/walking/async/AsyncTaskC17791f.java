package com.iab.omid.library.amazon.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.amazon.adsession.C17738a;
import com.iab.omid.library.amazon.internal.C17748c;
import com.iab.omid.library.amazon.utils.C17769c;
import com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC17791f extends AbstractAsyncTaskC17784a {
    public AsyncTaskC17791f(AbstractAsyncTaskC17785b.InterfaceC17787b interfaceC17787b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC17787b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m65192b(String str) {
        C17748c m65380c = C17748c.m65380c();
        if (m65380c != null) {
            for (C17738a c17738a : m65380c.m65382b()) {
                if (this.f44884c.contains(c17738a.getAdSessionId())) {
                    c17738a.getAdSessionStatePublisher().m65307b(str, this.f44886e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C17769c.m65269h(this.f44885d, this.f44888b.mo65191a())) {
            return null;
        }
        this.f44888b.mo65190a(this.f44885d);
        return this.f44885d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.amazon.walking.async.AbstractAsyncTaskC17785b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m65192b(str);
        }
        super.onPostExecute(str);
    }
}
