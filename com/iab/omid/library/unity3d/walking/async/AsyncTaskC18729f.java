package com.iab.omid.library.unity3d.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.unity3d.adsession.C18678a;
import com.iab.omid.library.unity3d.internal.C18688c;
import com.iab.omid.library.unity3d.utils.C18708c;
import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC18723b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC18729f extends AbstractAsyncTaskC18722a {
    public AsyncTaskC18729f(AbstractAsyncTaskC18723b.InterfaceC18725b interfaceC18725b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18725b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m61571b(String str) {
        C18688c m61749c = C18688c.m61749c();
        if (m61749c != null) {
            for (C18678a c18678a : m61749c.m61751b()) {
                if (this.f46832c.contains(c18678a.getAdSessionId())) {
                    c18678a.getAdSessionStatePublisher().m61683b(str, this.f46834e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18708c.m61645h(this.f46833d, this.f46836b.mo61570a())) {
            return null;
        }
        this.f46836b.mo61569a(this.f46833d);
        return this.f46833d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC18723b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m61571b(str);
        }
        super.onPostExecute(str);
    }
}
