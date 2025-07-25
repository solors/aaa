package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ja1;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ka1 {
    @NotNull

    /* renamed from: a */
    private static final ConcurrentHashMap<la1, ja1> f81352a = new ConcurrentHashMap<>();
    @NotNull

    /* renamed from: b */
    private static final e22 f81353b = new e22();

    /* renamed from: c */
    public static final /* synthetic */ int f81354c = 0;

    @NotNull
    /* renamed from: a */
    public static ja1 m32611a(int i, int i2, @Nullable SSLSocketFactory sSLSocketFactory) {
        Object m17529r0;
        f81353b.getClass();
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        SSLSocketFactory sSLSocketFactory2 = null;
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.m17074g(trustManagers);
        ArrayList arrayList = new ArrayList();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                arrayList.add(trustManager);
            }
        }
        m17529r0 = _Collections.m17529r0(arrayList);
        X509TrustManager x509TrustManager = (X509TrustManager) m17529r0;
        if (sSLSocketFactory != null && x509TrustManager != null) {
            sSLSocketFactory2 = sSLSocketFactory;
        }
        la1 la1Var = new la1(i, i2, sSLSocketFactory2);
        ConcurrentHashMap<la1, ja1> concurrentHashMap = f81352a;
        if (!concurrentHashMap.containsKey(la1Var)) {
            ja1.C30614a c30614a = new ja1.C30614a();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ja1.C30614a m32978a = c30614a.m32977a(j, timeUnit).m32974b(i2, timeUnit).m32978a();
            if (sSLSocketFactory != null && x509TrustManager != null) {
                m32978a = m32978a.m32976a(sSLSocketFactory, x509TrustManager);
            }
            concurrentHashMap.put(la1Var, new ja1(m32978a));
        }
        ja1 ja1Var = concurrentHashMap.get(la1Var);
        if (ja1Var != null) {
            return ja1Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
