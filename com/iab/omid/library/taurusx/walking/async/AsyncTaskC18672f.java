package com.iab.omid.library.taurusx.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.taurusx.adsession.C18621a;
import com.iab.omid.library.taurusx.internal.C18631c;
import com.iab.omid.library.taurusx.utils.C18651c;
import com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.taurusx.walking.async.f */
/* loaded from: classes6.dex */
public class AsyncTaskC18672f extends AbstractAsyncTaskC18665a {
    public AsyncTaskC18672f(AbstractAsyncTaskC18666b.InterfaceC18668b interfaceC18668b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC18668b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m61805b(String str) {
        C18631c m61984c = C18631c.m61984c();
        if (m61984c != null) {
            for (C18621a c18621a : m61984c.m61986b()) {
                if (this.f46704c.contains(c18621a.getAdSessionId())) {
                    c18621a.getAdSessionStatePublisher().m61917b(str, this.f46706e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18651c.m61879h(this.f46705d, this.f46708b.mo61804a())) {
            return null;
        }
        this.f46708b.mo61803a(this.f46705d);
        return this.f46705d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.taurusx.walking.async.AbstractAsyncTaskC18666b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m61805b(str);
        }
        super.onPostExecute(str);
    }
}
