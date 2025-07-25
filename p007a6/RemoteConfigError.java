package p007a6;

import android.text.TextUtils;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: a6.d */
/* loaded from: classes6.dex */
public class RemoteConfigError {

    /* renamed from: a */
    private String f87a;

    /* renamed from: b */
    private String f88b;

    /* compiled from: RemoteConfigError.java */
    /* renamed from: a6.d$a */
    /* loaded from: classes6.dex */
    public static class C0010a extends Exception {
        public C0010a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static RemoteConfigError m105845a(Throwable th) {
        RemoteConfigError remoteConfigError = new RemoteConfigError();
        if (th instanceof C0010a) {
            remoteConfigError.m105841e("3");
        } else if (th instanceof IOException) {
            remoteConfigError.m105841e("0");
        } else if (!(th instanceof JSONException) && !(th instanceof IllegalArgumentException)) {
            remoteConfigError.m105841e("2");
        } else {
            remoteConfigError.m105841e("1");
        }
        remoteConfigError.m105840f(th.getMessage());
        return remoteConfigError;
    }

    /* renamed from: b */
    public String m105844b() {
        return this.f87a;
    }

    /* renamed from: c */
    public String m105843c() {
        return this.f88b;
    }

    /* renamed from: d */
    public boolean m105842d() {
        return TextUtils.equals(this.f87a, "3");
    }

    /* renamed from: e */
    public void m105841e(String str) {
        this.f87a = str;
    }

    /* renamed from: f */
    public void m105840f(String str) {
        this.f88b = str;
    }
}
