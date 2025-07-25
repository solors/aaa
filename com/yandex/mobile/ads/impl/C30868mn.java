package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.mn */
/* loaded from: classes8.dex */
public final class C30868mn {
    @NotNull

    /* renamed from: b */
    public static final C30870b f82298b = new C30870b(0);
    @NotNull

    /* renamed from: c */
    private static final C30869a f82299c = new C30869a();
    @NotNull

    /* renamed from: d */
    private static final LinkedHashMap f82300d = new LinkedHashMap();
    @NotNull

    /* renamed from: e */
    public static final C30868mn f82301e;
    @NotNull

    /* renamed from: f */
    public static final C30868mn f82302f;
    @NotNull

    /* renamed from: g */
    public static final C30868mn f82303g;
    @NotNull

    /* renamed from: h */
    public static final C30868mn f82304h;
    @NotNull

    /* renamed from: i */
    public static final C30868mn f82305i;
    @NotNull

    /* renamed from: j */
    public static final C30868mn f82306j;
    @NotNull

    /* renamed from: k */
    public static final C30868mn f82307k;
    @NotNull

    /* renamed from: l */
    public static final C30868mn f82308l;
    @NotNull

    /* renamed from: m */
    public static final C30868mn f82309m;
    @NotNull

    /* renamed from: n */
    public static final C30868mn f82310n;
    @NotNull

    /* renamed from: o */
    public static final C30868mn f82311o;
    @NotNull

    /* renamed from: p */
    public static final C30868mn f82312p;
    @NotNull

    /* renamed from: q */
    public static final C30868mn f82313q;
    @NotNull

    /* renamed from: r */
    public static final C30868mn f82314r;
    @NotNull

    /* renamed from: s */
    public static final C30868mn f82315s;
    @NotNull

    /* renamed from: t */
    public static final C30868mn f82316t;
    @NotNull

    /* renamed from: a */
    private final String f82317a;

    /* renamed from: com.yandex.mobile.ads.impl.mn$a */
    /* loaded from: classes8.dex */
    public static final class C30869a implements Comparator<String> {
        C30869a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN, SYNTHETIC] */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r0 = "a"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "b"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                int r0 = r5.length()
                int r1 = r6.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L1b:
                if (r1 >= r0) goto L31
                char r2 = r5.charAt(r1)
                char r3 = r6.charAt(r1)
                if (r2 == r3) goto L2e
                int r5 = kotlin.jvm.internal.Intrinsics.m17071j(r2, r3)
                if (r5 >= 0) goto L3f
                goto L3d
            L2e:
                int r1 = r1 + 1
                goto L1b
            L31:
                int r5 = r5.length()
                int r6 = r6.length()
                if (r5 == r6) goto L41
                if (r5 >= r6) goto L3f
            L3d:
                r5 = -1
                goto L42
            L3f:
                r5 = 1
                goto L42
            L41:
                r5 = 0
            L42:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30868mn.C30869a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mn$b */
    /* loaded from: classes8.dex */
    public static final class C30870b {
        private C30870b() {
        }

        /* renamed from: b */
        private static String m31892b(String str) {
            boolean m16624M;
            boolean m16624M2;
            m16624M = StringsJVM.m16624M(str, "TLS_", false, 2, null);
            if (!m16624M) {
                m16624M2 = StringsJVM.m16624M(str, "SSL_", false, 2, null);
                if (m16624M2) {
                    String substring = str.substring(4);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    return "TLS_" + substring;
                }
                return str;
            }
            String substring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            return "SSL_" + substring2;
        }

        @NotNull
        /* renamed from: a */
        public final synchronized C30868mn m31893a(@NotNull String javaName) {
            C30868mn c30868mn;
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            c30868mn = (C30868mn) ((LinkedHashMap) C30868mn.f82300d).get(javaName);
            if (c30868mn == null) {
                c30868mn = (C30868mn) ((LinkedHashMap) C30868mn.f82300d).get(m31892b(javaName));
                if (c30868mn == null) {
                    c30868mn = new C30868mn(javaName, 0);
                }
                C30868mn.f82300d.put(javaName, c30868mn);
            }
            return c30868mn;
        }

        public /* synthetic */ C30870b(int i) {
            this();
        }
    }

    static {
        C30868mn m32224a = C30798ln.m32224a("SSL_RSA_WITH_DES_CBC_SHA", C30798ln.m32224a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", C30798ln.m32224a("SSL_RSA_WITH_RC4_128_SHA", C30798ln.m32224a("SSL_RSA_WITH_RC4_128_MD5", C30798ln.m32224a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", C30798ln.m32224a("SSL_RSA_WITH_NULL_SHA", C30798ln.m32224a("SSL_RSA_WITH_NULL_MD5", new C30868mn("SSL_RSA_WITH_NULL_MD5", 0), "SSL_RSA_WITH_NULL_SHA", 0), "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 0), "SSL_RSA_WITH_RC4_128_MD5", 0), "SSL_RSA_WITH_RC4_128_SHA", 0), "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_RSA_WITH_DES_CBC_SHA", 0), "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 0);
        f82300d.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", m32224a);
        f82301e = m32224a;
        f82300d.put("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", C30798ln.m32224a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("SSL_DHE_RSA_WITH_DES_CBC_SHA", C30798ln.m32224a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", C30798ln.m32224a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("SSL_DHE_DSS_WITH_DES_CBC_SHA", C30798ln.m32224a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new C30868mn("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DHE_DSS_WITH_DES_CBC_SHA", 0), "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DHE_RSA_WITH_DES_CBC_SHA", 0), "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 0));
        C30868mn m32224a2 = C30798ln.m32224a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", C30798ln.m32224a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", C30798ln.m32224a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", C30798ln.m32224a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", C30798ln.m32224a("TLS_KRB5_WITH_RC4_128_MD5", C30798ln.m32224a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", C30798ln.m32224a("TLS_KRB5_WITH_DES_CBC_MD5", C30798ln.m32224a("TLS_KRB5_WITH_RC4_128_SHA", C30798ln.m32224a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("TLS_KRB5_WITH_DES_CBC_SHA", C30798ln.m32224a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("SSL_DH_anon_WITH_DES_CBC_SHA", C30798ln.m32224a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", C30798ln.m32224a("SSL_DH_anon_WITH_RC4_128_MD5", new C30868mn("SSL_DH_anon_WITH_RC4_128_MD5", 0), "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DH_anon_WITH_DES_CBC_SHA", 0), "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_DES_CBC_SHA", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_RC4_128_SHA", 0), "TLS_KRB5_WITH_DES_CBC_MD5", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 0), "TLS_KRB5_WITH_RC4_128_MD5", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 0), "TLS_RSA_WITH_AES_128_CBC_SHA", 0);
        f82300d.put("TLS_RSA_WITH_AES_128_CBC_SHA", m32224a2);
        f82302f = m32224a2;
        f82300d.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", C30798ln.m32224a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new C30868mn("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 0));
        C30868mn m32224a3 = C30798ln.m32224a("TLS_DH_anon_WITH_AES_128_CBC_SHA", new C30868mn("TLS_DH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_RSA_WITH_AES_256_CBC_SHA", 0);
        f82300d.put("TLS_RSA_WITH_AES_256_CBC_SHA", m32224a3);
        f82303g = m32224a3;
        f82300d.put("TLS_DH_anon_WITH_AES_256_CBC_SHA256", C30798ln.m32224a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", C30798ln.m32224a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", C30798ln.m32224a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", C30798ln.m32224a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", C30798ln.m32224a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", C30798ln.m32224a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", C30798ln.m32224a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", C30798ln.m32224a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", C30798ln.m32224a("TLS_RSA_WITH_AES_256_CBC_SHA256", C30798ln.m32224a("TLS_RSA_WITH_AES_128_CBC_SHA256", C30798ln.m32224a("TLS_RSA_WITH_NULL_SHA256", C30798ln.m32224a("TLS_DH_anon_WITH_AES_256_CBC_SHA", C30798ln.m32224a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", C30798ln.m32224a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new C30868mn("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 0), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_NULL_SHA256", 0), "TLS_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 0));
        C30868mn m32224a4 = C30798ln.m32224a("TLS_RSA_WITH_SEED_CBC_SHA", C30798ln.m32224a("TLS_PSK_WITH_AES_256_CBC_SHA", C30798ln.m32224a("TLS_PSK_WITH_AES_128_CBC_SHA", C30798ln.m32224a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("TLS_PSK_WITH_RC4_128_SHA", C30798ln.m32224a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", C30798ln.m32224a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", C30798ln.m32224a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", new C30868mn("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_PSK_WITH_RC4_128_SHA", 0), "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 0), "TLS_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_SEED_CBC_SHA", 0), "TLS_RSA_WITH_AES_128_GCM_SHA256", 0);
        f82300d.put("TLS_RSA_WITH_AES_128_GCM_SHA256", m32224a4);
        f82304h = m32224a4;
        C30868mn c30868mn = new C30868mn("TLS_RSA_WITH_AES_256_GCM_SHA384", 0);
        f82300d.put("TLS_RSA_WITH_AES_256_GCM_SHA384", c30868mn);
        f82305i = c30868mn;
        f82300d.put("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", C30798ln.m32224a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", C30798ln.m32224a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", C30798ln.m32224a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", C30798ln.m32224a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", C30798ln.m32224a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", C30798ln.m32224a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new C30868mn("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 0), "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 0), "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 0), "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 0), "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 0));
        f82300d.put("TLS_ECDHE_RSA_WITH_NULL_SHA", C30798ln.m32224a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", C30798ln.m32224a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", C30798ln.m32224a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("TLS_ECDH_RSA_WITH_RC4_128_SHA", C30798ln.m32224a("TLS_ECDH_RSA_WITH_NULL_SHA", C30798ln.m32224a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", C30798ln.m32224a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", C30798ln.m32224a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", C30798ln.m32224a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", C30798ln.m32224a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", C30798ln.m32224a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", C30798ln.m32224a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", C30798ln.m32224a("TLS_ECDH_ECDSA_WITH_NULL_SHA", C30798ln.m32224a("TLS_FALLBACK_SCSV", new C30868mn("TLS_FALLBACK_SCSV", 0), "TLS_ECDH_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_NULL_SHA", 0), "TLS_ECDH_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_NULL_SHA", 0));
        C30868mn m32224a5 = C30798ln.m32224a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", new C30868mn("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0);
        f82300d.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", m32224a5);
        f82306j = m32224a5;
        C30868mn c30868mn2 = new C30868mn("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 0);
        f82300d.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", c30868mn2);
        f82307k = c30868mn2;
        f82300d.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", C30798ln.m32224a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", C30798ln.m32224a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", C30798ln.m32224a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", C30798ln.m32224a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", C30798ln.m32224a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", C30798ln.m32224a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", C30798ln.m32224a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", C30798ln.m32224a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", C30798ln.m32224a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", C30798ln.m32224a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", C30798ln.m32224a("TLS_ECDH_anon_WITH_RC4_128_SHA", C30798ln.m32224a("TLS_ECDH_anon_WITH_NULL_SHA", new C30868mn("TLS_ECDH_anon_WITH_NULL_SHA", 0), "TLS_ECDH_anon_WITH_RC4_128_SHA", 0), "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0));
        C30868mn c30868mn3 = new C30868mn("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 0);
        f82300d.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", c30868mn3);
        f82308l = c30868mn3;
        C30868mn c30868mn4 = new C30868mn("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 0);
        f82300d.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", c30868mn4);
        f82309m = c30868mn4;
        C30868mn m32224a6 = C30798ln.m32224a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", C30798ln.m32224a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new C30868mn("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 0), "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0);
        f82300d.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", m32224a6);
        f82310n = m32224a6;
        C30868mn c30868mn5 = new C30868mn("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 0);
        f82300d.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", c30868mn5);
        f82311o = c30868mn5;
        C30868mn m32224a7 = C30798ln.m32224a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", C30798ln.m32224a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", C30798ln.m32224a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", C30798ln.m32224a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new C30868mn("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 0), "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0);
        f82300d.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", m32224a7);
        f82312p = m32224a7;
        C30868mn c30868mn6 = new C30868mn("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 0);
        f82300d.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", c30868mn6);
        f82313q = c30868mn6;
        C30868mn m32224a8 = C30798ln.m32224a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", C30798ln.m32224a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new C30868mn("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0), "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0), "TLS_AES_128_GCM_SHA256", 0);
        f82300d.put("TLS_AES_128_GCM_SHA256", m32224a8);
        f82314r = m32224a8;
        C30868mn c30868mn7 = new C30868mn("TLS_AES_256_GCM_SHA384", 0);
        f82300d.put("TLS_AES_256_GCM_SHA384", c30868mn7);
        f82315s = c30868mn7;
        C30868mn c30868mn8 = new C30868mn("TLS_CHACHA20_POLY1305_SHA256", 0);
        f82300d.put("TLS_CHACHA20_POLY1305_SHA256", c30868mn8);
        f82316t = c30868mn8;
        f82300d.put("TLS_AES_128_CCM_8_SHA256", C30798ln.m32224a("TLS_AES_128_CCM_SHA256", new C30868mn("TLS_AES_128_CCM_SHA256", 0), "TLS_AES_128_CCM_8_SHA256", 0));
    }

    private C30868mn(String str) {
        this.f82317a = str;
    }

    @NotNull
    /* renamed from: c */
    public final String m31894c() {
        return this.f82317a;
    }

    @NotNull
    public final String toString() {
        return this.f82317a;
    }

    public /* synthetic */ C30868mn(String str, int i) {
        this(str);
    }
}
