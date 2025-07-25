package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.ni2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class dj2 extends ei2 {
    public dj2(ni2.InterfaceC30950b interfaceC30950b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC30950b, hashSet, jSONObject, j);
    }

    @Override // com.yandex.mobile.ads.impl.ni2, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        yh2 m26905a;
        if (!TextUtils.isEmpty(str) && (m26905a = yh2.m26905a()) != null) {
            for (xh2 xh2Var : m26905a.m26903b()) {
                if (this.f78639c.contains(xh2Var.m27482i())) {
                    xh2Var.m27481j().m28501a(str, this.f78641e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final String doInBackground(Object[] objArr) {
        if (ki2.m32538b(this.f78640d, ((mi2) this.f82798b).m31981b())) {
            return null;
        }
        ((mi2) this.f82798b).m31983a(this.f78640d);
        return this.f78640d.toString();
    }
}
