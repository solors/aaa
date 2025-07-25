package com.iab.omid.library.taurusx.walking.async;

import com.iab.omid.library.taurusx.adsession.C18621a;
import com.iab.omid.library.taurusx.internal.C18631c;
import com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18671e extends AbstractAsyncTaskC18665a {
    public AsyncTaskC18671e(AbstractAsyncTaskC18666b.InterfaceC18668b interfaceC18668b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18668b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m61808b(String str) {
        C18631c m61984c = C18631c.m61984c();
        if (m61984c != null) {
            for (C18621a c18621a : m61984c.m61986b()) {
                if (this.f46704c.contains(c18621a.getAdSessionId())) {
                    c18621a.getAdSessionStatePublisher().m61922a(str, this.f46706e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f46705d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m61808b(str);
        super.onPostExecute(str);
    }
}
