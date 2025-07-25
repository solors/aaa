package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.adsession.C18737a;
import com.iab.omid.library.vungle.internal.C18747c;
import com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18791e extends AbstractAsyncTaskC18785a {
    public AsyncTaskC18791e(AbstractAsyncTaskC18786b.InterfaceC18788b interfaceC18788b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18788b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m61321b(String str) {
        C18747c m61518c = C18747c.m61518c();
        if (m61518c != null) {
            for (C18737a c18737a : m61518c.m61520b()) {
                if (this.f46967c.contains(c18737a.getAdSessionId())) {
                    c18737a.getAdSessionStatePublisher().m61443a(str, this.f46969e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f46968d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m61321b(str);
        super.onPostExecute(str);
    }
}
