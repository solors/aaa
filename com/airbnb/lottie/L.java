package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.p017os.TraceCompat;
import java.io.File;
import p645e0.DefaultLottieNetworkFetcher;
import p645e0.LottieNetworkCacheProvider;
import p645e0.LottieNetworkFetcher;
import p645e0.NetworkCache;
import p645e0.NetworkFetcher;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.c */
/* loaded from: classes2.dex */
public class L {

    /* renamed from: a */
    public static boolean f2111a = false;

    /* renamed from: b */
    private static boolean f2112b = false;

    /* renamed from: c */
    private static String[] f2113c;

    /* renamed from: d */
    private static long[] f2114d;

    /* renamed from: e */
    private static int f2115e;

    /* renamed from: f */
    private static int f2116f;

    /* renamed from: g */
    private static LottieNetworkFetcher f2117g;

    /* renamed from: h */
    private static LottieNetworkCacheProvider f2118h;

    /* renamed from: i */
    private static volatile NetworkFetcher f2119i;

    /* renamed from: j */
    private static volatile NetworkCache f2120j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: L.java */
    /* renamed from: com.airbnb.lottie.c$a */
    /* loaded from: classes2.dex */
    public class C3487a implements LottieNetworkCacheProvider {

        /* renamed from: a */
        final /* synthetic */ Context f2121a;

        C3487a(Context context) {
            this.f2121a = context;
        }

        @Override // p645e0.LottieNetworkCacheProvider
        @NonNull
        /* renamed from: a */
        public File mo25543a() {
            return new File(this.f2121a.getCacheDir(), "lottie_network_cache");
        }
    }

    /* renamed from: a */
    public static void m103402a(String str) {
        if (!f2112b) {
            return;
        }
        int i = f2115e;
        if (i == 20) {
            f2116f++;
            return;
        }
        f2113c[i] = str;
        f2114d[i] = System.nanoTime();
        TraceCompat.beginSection(str);
        f2115e++;
    }

    /* renamed from: b */
    public static float m103401b(String str) {
        int i = f2116f;
        if (i > 0) {
            f2116f = i - 1;
            return 0.0f;
        } else if (!f2112b) {
            return 0.0f;
        } else {
            int i2 = f2115e - 1;
            f2115e = i2;
            if (i2 != -1) {
                if (str.equals(f2113c[i2])) {
                    TraceCompat.endSection();
                    return ((float) (System.nanoTime() - f2114d[f2115e])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f2113c[f2115e] + ".");
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
    }

    @NonNull
    /* renamed from: c */
    public static NetworkCache m103400c(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        NetworkCache networkCache = f2120j;
        if (networkCache == null) {
            synchronized (NetworkCache.class) {
                networkCache = f2120j;
                if (networkCache == null) {
                    LottieNetworkCacheProvider lottieNetworkCacheProvider = f2118h;
                    if (lottieNetworkCacheProvider == null) {
                        lottieNetworkCacheProvider = new C3487a(applicationContext);
                    }
                    networkCache = new NetworkCache(lottieNetworkCacheProvider);
                    f2120j = networkCache;
                }
            }
        }
        return networkCache;
    }

    @NonNull
    /* renamed from: d */
    public static NetworkFetcher m103399d(@NonNull Context context) {
        NetworkFetcher networkFetcher = f2119i;
        if (networkFetcher == null) {
            synchronized (NetworkFetcher.class) {
                networkFetcher = f2119i;
                if (networkFetcher == null) {
                    NetworkCache m103400c = m103400c(context);
                    LottieNetworkFetcher lottieNetworkFetcher = f2117g;
                    if (lottieNetworkFetcher == null) {
                        lottieNetworkFetcher = new DefaultLottieNetworkFetcher();
                    }
                    networkFetcher = new NetworkFetcher(m103400c, lottieNetworkFetcher);
                    f2119i = networkFetcher;
                }
            }
        }
        return networkFetcher;
    }
}
