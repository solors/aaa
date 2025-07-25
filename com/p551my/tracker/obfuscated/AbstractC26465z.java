package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p551my.tracker.MyTrackerConfig;
import java.io.OutputStream;

/* renamed from: com.my.tracker.obfuscated.z */
/* loaded from: classes7.dex */
public abstract class AbstractC26465z<T> {

    /* renamed from: com.my.tracker.obfuscated.z$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26466a {
        /* renamed from: a */
        String mo41493a();

        /* renamed from: a */
        void mo41492a(OutputStream outputStream);
    }

    /* renamed from: com.my.tracker.obfuscated.z$b */
    /* loaded from: classes7.dex */
    public static final class C26467b<T> {

        /* renamed from: a */
        boolean f69103a;

        /* renamed from: b */
        T f69104b;

        /* renamed from: c */
        String f69105c;

        private C26467b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static <T> C26467b<T> m41530c() {
            return new C26467b<>();
        }

        /* renamed from: a */
        public T m41532a() {
            return this.f69104b;
        }

        /* renamed from: b */
        public boolean m41531b() {
            return this.f69103a;
        }
    }

    /* renamed from: a */
    public static AbstractC26465z<String> m41535a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        if (okHttpClientProvider != null) {
            try {
                return new C26368m0(okHttpClientProvider);
            } catch (Throwable th) {
                C26468z0.m41527a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C26455x();
    }

    /* renamed from: a */
    public abstract C26467b<T> mo41533a(String str);

    /* renamed from: a */
    public static AbstractC26465z<String> m41534a(InterfaceC26466a interfaceC26466a, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        if (okHttpClientProvider != null) {
            try {
                return new C26373n0(interfaceC26466a, okHttpClientProvider, z);
            } catch (Throwable th) {
                C26468z0.m41527a("HttpRequest error: error while creating OkHttpPostRequest", th);
            }
        }
        return new C26460y(interfaceC26466a, z);
    }

    /* renamed from: a */
    public static boolean m41536a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }
}
