package com.bytedance.adsdk.p183IL.eqN;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.eqN.bg */
/* loaded from: classes3.dex */
public class C6827bg implements InterfaceC6828eqN {

    /* renamed from: bg */
    private final HttpURLConnection f14655bg;

    public C6827bg(HttpURLConnection httpURLConnection) {
        this.f14655bg = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.p183IL.eqN.InterfaceC6828eqN
    /* renamed from: IL */
    public InputStream mo90754IL() throws IOException {
        return this.f14655bg.getInputStream();
    }

    @Override // com.bytedance.adsdk.p183IL.eqN.InterfaceC6828eqN
    /* renamed from: bX */
    public String mo90753bX() {
        return this.f14655bg.getContentType();
    }

    @Override // com.bytedance.adsdk.p183IL.eqN.InterfaceC6828eqN
    /* renamed from: bg */
    public boolean mo90752bg() {
        try {
            return this.f14655bg.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14655bg.disconnect();
    }

    @Override // com.bytedance.adsdk.p183IL.eqN.InterfaceC6828eqN
    public String eqN() {
        try {
            if (mo90752bg()) {
                return null;
            }
            return "Unable to fetch " + this.f14655bg.getURL() + ". Failed with " + this.f14655bg.getResponseCode() + "\n" + m90755bg(this.f14655bg);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    /* renamed from: bg */
    private String m90755bg(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }
}
