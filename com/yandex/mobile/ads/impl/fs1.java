package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* loaded from: classes8.dex */
public final class fs1 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30120cu f79297a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC38501j f79298b;
    @Nullable

    /* renamed from: c */
    private KeyStore f79299c;
    @Nullable

    /* renamed from: d */
    private X509TrustManager f79300d;
    @NotNull

    /* renamed from: e */
    private final Object f79301e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.fs1$a */
    /* loaded from: classes8.dex */
    public static final class C30337a extends Lambda implements Functions<X509TrustManager> {

        /* renamed from: b */
        public static final C30337a f79302b = new C30337a();

        C30337a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final X509TrustManager invoke() {
            X509TrustManager m33983a = g22.m33983a((KeyStore) null);
            if (m33983a != null) {
                return m33983a;
            }
            throw new IllegalArgumentException("Failed to create default TrustManager");
        }
    }

    public fs1(@NotNull InterfaceC30120cu customCertificatesProvider) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
        this.f79297a = customCertificatesProvider;
        m14554a = LazyJVM.m14554a(C30337a.f79302b);
        this.f79298b = m14554a;
        this.f79301e = new Object();
    }

    /* renamed from: a */
    public final void m34094a(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) throws CertificateException {
        ((X509TrustManager) this.f79298b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    /* renamed from: b */
    public final void m34090b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) throws CertificateException {
        Unit unit;
        try {
            ((X509TrustManager) this.f79298b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            synchronized (this.f79301e) {
                m34096a();
                m34091b();
                X509TrustManager x509TrustManager = this.f79300d;
                if (x509TrustManager != null) {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    unit = Unit.f99208a;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    Unit unit2 = Unit.f99208a;
                } else {
                    Log.w("SdkTrustManager", "Custom TrustManager is null");
                    throw e;
                }
            }
        }
    }

    @NotNull
    /* renamed from: c */
    public final X509Certificate[] m34087c() {
        X509Certificate[] acceptedIssuers = ((X509TrustManager) this.f79298b.getValue()).getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }

    /* renamed from: a */
    private final void m34096a() {
        KeyStore keyStore;
        m34091b();
        m34091b();
        if (this.f79299c == null) {
            int i = g22.f79451b;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("SdkTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                byte[][] mo27436a = this.f79297a.mo27436a();
                ArrayList arrayList = new ArrayList();
                for (byte[] bArr : mo27436a) {
                    X509Certificate m33982a = g22.m33982a(bArr);
                    if (m33982a != null) {
                        arrayList.add(m33982a);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m34095a(keyStore, (X509Certificate) it.next());
                }
                keyStore2 = keyStore;
            }
            this.f79299c = keyStore2;
        }
        m34091b();
        if (this.f79300d == null) {
            m34091b();
            if (this.f79299c != null) {
                m34091b();
                this.f79300d = g22.m33983a(this.f79299c);
            }
        }
    }

    /* renamed from: b */
    public final void m34089b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        Unit unit;
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) this.f79298b.getValue();
            if (g22.m33984a()) {
                C31032od.m31050b(x509TrustManager, x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            synchronized (this.f79301e) {
                m34096a();
                m34091b();
                X509TrustManager x509TrustManager2 = this.f79300d;
                if (x509TrustManager2 != null) {
                    if (g22.m33984a()) {
                        C31032od.m31050b(x509TrustManager2, x509CertificateArr, str, socket);
                    } else {
                        x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                    }
                    unit = Unit.f99208a;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    Unit unit2 = Unit.f99208a;
                } else {
                    Log.w("SdkTrustManager", "Custom TrustManager is null");
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m34095a(KeyStore keyStore, X509Certificate x509Certificate) {
        try {
            int size = keyStore.size();
            keyStore.setCertificateEntry("custom_cert_" + size, x509Certificate);
        } catch (KeyStoreException e) {
            Log.w("SdkTrustManager", "Failed to store certificate", e);
        }
    }

    /* renamed from: a */
    public final void m34093a(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) throws CertificateException {
        if (g22.m33984a()) {
            C31032od.m31052a((X509TrustManager) this.f79298b.getValue(), x509CertificateArr, str, socket);
        } else {
            ((X509TrustManager) this.f79298b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: b */
    public final void m34088b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        Unit unit;
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) this.f79298b.getValue();
            if (g22.m33984a()) {
                C31032od.m31049b(x509TrustManager, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e) {
            synchronized (this.f79301e) {
                m34096a();
                m34091b();
                X509TrustManager x509TrustManager2 = this.f79300d;
                if (x509TrustManager2 != null) {
                    if (g22.m33984a()) {
                        C31032od.m31049b(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                    } else {
                        x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                    }
                    unit = Unit.f99208a;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    Unit unit2 = Unit.f99208a;
                } else {
                    Log.w("SdkTrustManager", "Custom TrustManager is null");
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m34092a(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) throws CertificateException {
        if (g22.m33984a()) {
            C31032od.m31051a((X509TrustManager) this.f79298b.getValue(), x509CertificateArr, str, sSLEngine);
        } else {
            ((X509TrustManager) this.f79298b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: b */
    private final void m34091b() {
        if (!Thread.holdsLock(this.f79301e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }
}
