package com.bytedance.adsdk.p183IL.eqN;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.eqN.IL */
/* loaded from: classes3.dex */
public class C6824IL implements InterfaceC6830ldr {
    @Override // com.bytedance.adsdk.p183IL.eqN.InterfaceC6830ldr
    /* renamed from: bg */
    public InterfaceC6828eqN mo90745bg(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C6827bg(httpURLConnection);
    }
}
