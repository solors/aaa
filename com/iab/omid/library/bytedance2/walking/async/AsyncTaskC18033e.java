package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.adsession.C17981a;
import com.iab.omid.library.bytedance2.internal.C17991c;
import com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC18028b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance2.walking.async.e */
/* loaded from: classes6.dex */
public class AsyncTaskC18033e extends AbstractAsyncTaskC18027a {
    public AsyncTaskC18033e(AbstractAsyncTaskC18028b.InterfaceC18030b interfaceC18030b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18030b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m64246b(String str) {
        C17991c m64431c = C17991c.m64431c();
        if (m64431c != null) {
            for (C17981a c17981a : m64431c.m64433b()) {
                if (this.f45398c.contains(c17981a.getAdSessionId())) {
                    c17981a.getAdSessionStatePublisher().m64363a(str, this.f45400e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f45399d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.bytedance2.walking.async.AbstractAsyncTaskC18028b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m64246b(str);
        super.onPostExecute(str);
    }
}
