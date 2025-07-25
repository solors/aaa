package com.iab.omid.library.vungle.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.vungle.adsession.C18737a;
import com.iab.omid.library.vungle.internal.C18747c;
import com.iab.omid.library.vungle.utils.C18770c;
import com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC18792f extends AbstractAsyncTaskC18785a {
    public AsyncTaskC18792f(AbstractAsyncTaskC18786b.InterfaceC18788b interfaceC18788b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18788b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m61318b(String str) {
        C18747c m61518c = C18747c.m61518c();
        if (m61518c != null) {
            for (C18737a c18737a : m61518c.m61520b()) {
                if (this.f46967c.contains(c18737a.getAdSessionId())) {
                    c18737a.getAdSessionStatePublisher().m61438b(str, this.f46969e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18770c.m61398h(this.f46968d, this.f46971b.mo61317a())) {
            return null;
        }
        this.f46971b.mo61316a(this.f46968d);
        return this.f46968d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.vungle.walking.async.AbstractAsyncTaskC18786b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m61318b(str);
        }
        super.onPostExecute(str);
    }
}
