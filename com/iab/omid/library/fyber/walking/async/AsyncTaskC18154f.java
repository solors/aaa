package com.iab.omid.library.fyber.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.fyber.adsession.C18099a;
import com.iab.omid.library.fyber.internal.C18109c;
import com.iab.omid.library.fyber.utils.C18132c;
import com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC18154f extends AbstractAsyncTaskC18147a {
    public AsyncTaskC18154f(AbstractAsyncTaskC18148b.InterfaceC18150b interfaceC18150b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18150b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m63781b(String str) {
        C18109c m63981c = C18109c.m63981c();
        if (m63981c != null) {
            for (C18099a c18099a : m63981c.m63983b()) {
                if (this.f45647c.contains(c18099a.getAdSessionId())) {
                    c18099a.getAdSessionStatePublisher().m63901b(str, this.f45649e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18132c.m63861h(this.f45648d, this.f45651b.mo63780a())) {
            return null;
        }
        this.f45651b.mo63779a(this.f45648d);
        return this.f45648d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.fyber.walking.async.AbstractAsyncTaskC18148b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m63781b(str);
        }
        super.onPostExecute(str);
    }
}
