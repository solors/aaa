package com.iab.omid.library.ironsrc.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.adsession.C18228a;
import com.iab.omid.library.ironsrc.internal.C18238c;
import com.iab.omid.library.ironsrc.utils.C18257c;
import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC18278f extends AbstractAsyncTaskC18271a {
    public AsyncTaskC18278f(AbstractAsyncTaskC18272b.InterfaceC18274b interfaceC18274b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18274b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m63305b(String str) {
        C18238c m63484c = C18238c.m63484c();
        if (m63484c != null) {
            for (C18228a c18228a : m63484c.m63486b()) {
                if (this.f45901c.contains(c18228a.getAdSessionId())) {
                    c18228a.getAdSessionStatePublisher().m63417b(str, this.f45903e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18257c.m63379h(this.f45902d, this.f45905b.mo63304a())) {
            return null;
        }
        this.f45905b.mo63303a(this.f45902d);
        return this.f45902d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC18272b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m63305b(str);
        }
        super.onPostExecute(str);
    }
}
