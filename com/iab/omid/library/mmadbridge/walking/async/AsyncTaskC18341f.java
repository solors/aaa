package com.iab.omid.library.mmadbridge.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.adsession.C18286a;
import com.iab.omid.library.mmadbridge.internal.C18296c;
import com.iab.omid.library.mmadbridge.utils.C18319c;
import com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC18341f extends AbstractAsyncTaskC18334a {
    public AsyncTaskC18341f(AbstractAsyncTaskC18335b.InterfaceC18337b interfaceC18337b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18337b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m63052b(String str) {
        C18296c m63252c = C18296c.m63252c();
        if (m63252c != null) {
            for (C18286a c18286a : m63252c.m63254b()) {
                if (this.f46036c.contains(c18286a.getAdSessionId())) {
                    c18286a.getAdSessionStatePublisher().m63172b(str, this.f46038e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18319c.m63132h(this.f46037d, this.f46040b.mo63051a())) {
            return null;
        }
        this.f46040b.mo63050a(this.f46037d);
        return this.f46037d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.mmadbridge.walking.async.AbstractAsyncTaskC18335b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m63052b(str);
        }
        super.onPostExecute(str);
    }
}
