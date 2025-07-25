package com.iab.omid.library.bigosg.walking.p391a;

import android.text.TextUtils;
import com.iab.omid.library.bigosg.adsession.C17933a;
import com.iab.omid.library.bigosg.p387b.C17935a;
import com.iab.omid.library.bigosg.p389d.C17951b;
import com.iab.omid.library.bigosg.walking.p391a.AbstractAsyncTaskC17969b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bigosg.walking.a.f */
/* loaded from: classes6.dex */
public class AsyncTaskC17975f extends AbstractAsyncTaskC17968a {
    public AsyncTaskC17975f(AbstractAsyncTaskC17969b.InterfaceC17971b interfaceC17971b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC17971b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m64484b(String str) {
        C17935a m64659a = C17935a.m64659a();
        if (m64659a != null) {
            for (C17933a c17933a : m64659a.m64657b()) {
                if (((AbstractAsyncTaskC17968a) this).f45269a.contains(c17933a.getAdSessionId())) {
                    c17933a.getAdSessionStatePublisher().m64547a(str, this.f45271c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C17951b.m64581b(this.f45270b, this.f45273d.mo64480b())) {
            return null;
        }
        this.f45273d.mo64482a(this.f45270b);
        return this.f45270b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.bigosg.walking.p391a.AbstractAsyncTaskC17969b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m64484b(str);
        }
        super.onPostExecute(str);
    }
}
