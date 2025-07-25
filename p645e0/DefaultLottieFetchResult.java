package p645e0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p690h0.C33453f;

/* renamed from: e0.a */
/* loaded from: classes2.dex */
public class DefaultLottieFetchResult implements LottieFetchResult {
    @NonNull

    /* renamed from: b */
    private final HttpURLConnection f89697b;

    public DefaultLottieFetchResult(@NonNull HttpURLConnection httpURLConnection) {
        this.f89697b = httpURLConnection;
    }

    /* renamed from: a */
    private String m25547a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
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
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // p645e0.LottieFetchResult
    @Nullable
    /* renamed from: B */
    public String mo25545B() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f89697b.getURL() + ". Failed with " + this.f89697b.getResponseCode() + "\n" + m25547a(this.f89697b);
        } catch (IOException e) {
            C33453f.m23900d("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // p645e0.LottieFetchResult
    @NonNull
    /* renamed from: G */
    public InputStream mo25544G() throws IOException {
        return this.f89697b.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f89697b.disconnect();
    }

    @Override // p645e0.LottieFetchResult
    @Nullable
    public String contentType() {
        return this.f89697b.getContentType();
    }

    @Override // p645e0.LottieFetchResult
    public boolean isSuccessful() {
        try {
            if (this.f89697b.getResponseCode() / 100 != 2) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
