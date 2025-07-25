package com.bytedance.sdk.component.p275zx.p276IL;

import android.util.Log;
import com.bytedance.sdk.component.p275zx.InterfaceC7832eqN;
import com.bytedance.sdk.component.p275zx.InterfaceC7853zx;
import com.bytedance.sdk.component.p275zx.p277bX.p279bX.C7795IL;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.zx.IL.bg */
/* loaded from: classes3.dex */
public class C7773bg implements InterfaceC7832eqN<C7774eqN> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7832eqN
    /* renamed from: IL */
    public C7774eqN<byte[]> mo87348bg(InterfaceC7853zx interfaceC7853zx) {
        Closeable closeable;
        InputStream inputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        String message;
        Closeable closeable2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream2 = null;
        r1 = null;
        Map<String, String> map = null;
        int i = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(interfaceC7853zx.mo87547bg()).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
            } catch (MalformedURLException e) {
                e = e;
                inputStream = null;
                bArr = null;
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
                bArr = null;
            } catch (Throwable th) {
                th = th;
                closeable = null;
                C7795IL.m87725bg(inputStream2);
                C7795IL.m87725bg(closeable);
                throw th;
            }
            try {
                byte[] bArr2 = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } catch (MalformedURLException e3) {
                        e = e3;
                        bArr = null;
                    } catch (IOException e4) {
                        e = e4;
                        bArr = null;
                    }
                }
                i = 200;
                bArr = byteArrayOutputStream.toByteArray();
            } catch (MalformedURLException e5) {
                e = e5;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                C7795IL.m87725bg(inputStream);
                C7795IL.m87725bg(closeable2);
                return new C7774eqN<>(i, bArr, message, map);
            } catch (IOException e6) {
                e = e6;
                bArr = null;
                byteArrayOutputStream = bArr;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                C7795IL.m87725bg(inputStream);
                C7795IL.m87725bg(closeable2);
                return new C7774eqN<>(i, bArr, message, map);
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                inputStream2 = inputStream;
                C7795IL.m87725bg(inputStream2);
                C7795IL.m87725bg(closeable);
                throw th;
            }
            try {
                if (interfaceC7853zx.mo87549IL()) {
                    map = m87783bg(httpURLConnection);
                }
                C7795IL.m87725bg(inputStream);
                C7795IL.m87725bg(byteArrayOutputStream);
                message = "success";
            } catch (MalformedURLException e7) {
                e = e7;
                Log.w("InternalHttpClient", "MalformedURLException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                C7795IL.m87725bg(inputStream);
                C7795IL.m87725bg(closeable2);
                return new C7774eqN<>(i, bArr, message, map);
            } catch (IOException e8) {
                e = e8;
                Log.w("InternalHttpClient", "IOException:" + e.getMessage());
                message = e.getMessage();
                closeable2 = byteArrayOutputStream;
                C7795IL.m87725bg(inputStream);
                C7795IL.m87725bg(closeable2);
                return new C7774eqN<>(i, bArr, message, map);
            }
            return new C7774eqN<>(i, bArr, message, map);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: bg */
    private Map<String, String> m87783bg(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        for (String str : headerFields.keySet()) {
            List<String> list = headerFields.get(str);
            if (list != null && list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }
}
