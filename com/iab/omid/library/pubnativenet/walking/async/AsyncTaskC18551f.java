package com.iab.omid.library.pubnativenet.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.pubnativenet.adsession.C18496a;
import com.iab.omid.library.pubnativenet.internal.C18506c;
import com.iab.omid.library.pubnativenet.utils.C18529c;
import com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.pubnativenet.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC18551f extends AbstractAsyncTaskC18544a {
    public AsyncTaskC18551f(AbstractAsyncTaskC18545b.InterfaceC18547b interfaceC18547b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18547b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m62293b(String str) {
        C18506c m62493c = C18506c.m62493c();
        if (m62493c != null) {
            for (C18496a c18496a : m62493c.m62495b()) {
                if (this.f46441c.contains(c18496a.getAdSessionId())) {
                    c18496a.getAdSessionStatePublisher().m62413b(str, this.f46443e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18529c.m62373h(this.f46442d, this.f46445b.mo62292a())) {
            return null;
        }
        this.f46445b.mo62291a(this.f46442d);
        return this.f46442d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.pubnativenet.walking.async.AbstractAsyncTaskC18545b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m62293b(str);
        }
        super.onPostExecute(str);
    }
}
