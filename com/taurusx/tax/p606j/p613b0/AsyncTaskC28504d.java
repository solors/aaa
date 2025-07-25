package com.taurusx.tax.p606j.p613b0;

import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.VisibleForTesting;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p606j.p613b0.C28506e;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

@VisibleForTesting
/* renamed from: com.taurusx.tax.j.b0.d */
/* loaded from: classes7.dex */
public class AsyncTaskC28504d extends AsyncTask<String, Void, String> {

    /* renamed from: a */
    public final InterfaceC28505a f73932a;

    /* renamed from: com.taurusx.tax.j.b0.d$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC28505a {
    }

    public AsyncTaskC28504d(InterfaceC28505a interfaceC28505a) {
        this.f73932a = interfaceC28505a;
    }

    /* renamed from: a */
    public final String m38061a(String str) throws IOException, URISyntaxException {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setInstanceFollowRedirects(false);
            String m38060a = m38060a(str, httpURLConnection);
            httpURLConnection.disconnect();
            return m38060a;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    public String doInBackground(String[] strArr) {
        String[] strArr2 = strArr;
        if (strArr2 == null || strArr2.length == 0) {
            return null;
        }
        int i = 0;
        try {
            String str = strArr2[0];
            String str2 = null;
            while (str != null && i < 10) {
                if (!EnumC28492b.OPEN_IN_APP_BROWSER.shouldTryHandlingUrl(Uri.parse(str))) {
                    return str;
                }
                i++;
                str2 = str;
                str = m38061a(str);
            }
            return str2;
        } catch (IOException | URISyntaxException unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        InterfaceC28505a interfaceC28505a = this.f73932a;
        String m23824a = C28162a.f73047a.m23824a(new byte[]{-95, 59, -122, 49, -43, 60, -102, 40, -43, 40, -112, 41, -102, 54, -125, 51, -101, 61, -43, 47, -121, 54, -43, 45, -108, 41, -43, 57, -108, 52, -106, 63, -103, 54, -112, 62}, new byte[]{-11, 90});
        C28506e.C28509c c28509c = (C28506e.C28509c) interfaceC28505a;
        C28506e.this.f73941g = false;
        C28506e.this.m38055a(c28509c.f73945d, (EnumC28492b) null, m23824a);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(String str) {
        String str2 = str;
        super.onPostExecute(str2);
        if (!isCancelled() && str2 != null) {
            C28506e.C28509c c28509c = (C28506e.C28509c) this.f73932a;
            C28506e.this.f73941g = false;
            C28506e.this.m38058a(c28509c.f73942a, str2, c28509c.f73943b);
            return;
        }
        onCancelled();
    }

    @VisibleForTesting
    /* renamed from: a */
    public static String m38060a(String str, HttpURLConnection httpURLConnection) throws IOException, URISyntaxException {
        URI uri = new URI(str);
        int responseCode = httpURLConnection.getResponseCode();
        String headerField = httpURLConnection.getHeaderField(C28162a.f73047a.m23824a(new byte[]{86, 72, 121, 70, 110, 78, 117, 73}, new byte[]{26, 39}));
        if (responseCode < 300 || responseCode >= 400) {
            return null;
        }
        try {
            return uri.resolve(headerField).toString();
        } catch (IllegalArgumentException unused) {
            throw new URISyntaxException(headerField, C28162a.f73047a.m23824a(new byte[]{66, -126, 118, -114, 123, -119, 55, -104, 120, -52, 103, -115, 101, -97, 114, -52, 126, -126, 97, -115, 123, -123, 115, -52, 66, -66, 91}, new byte[]{23, -20}));
        }
    }
}
