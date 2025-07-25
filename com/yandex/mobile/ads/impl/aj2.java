package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ni2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class aj2 extends ei2 {
    public aj2(ni2.InterfaceC30950b interfaceC30950b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC30950b, hashSet, jSONObject, j);
    }

    @Override // com.yandex.mobile.ads.impl.ni2, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        yh2 m26905a = yh2.m26905a();
        if (m26905a != null) {
            for (xh2 xh2Var : m26905a.m26903b()) {
                if (this.f78639c.contains(xh2Var.m27482i())) {
                    xh2Var.m27481j().m28496b(str, this.f78641e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final String doInBackground(Object[] objArr) {
        return this.f78640d.toString();
    }
}
