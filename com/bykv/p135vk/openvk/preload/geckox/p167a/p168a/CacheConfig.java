package com.bykv.p135vk.openvk.preload.geckox.p167a.p168a;

/* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a */
/* loaded from: classes3.dex */
public final class CacheConfig {

    /* renamed from: a */
    final int f13952a;

    /* renamed from: b */
    private final CachePolicy f13953b;

    /* renamed from: c */
    private CleanListener f13954c;

    /* compiled from: CacheConfig.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a */
    /* loaded from: classes3.dex */
    public static final class C6628a {

        /* renamed from: a */
        private int f13955a;

        /* renamed from: b */
        private CachePolicy f13956b = CachePolicy.f13957a;

        /* renamed from: a */
        public final C6628a m91415a() {
            this.f13955a = 20;
            return this;
        }

        /* renamed from: b */
        public final CacheConfig m91412b() {
            return new CacheConfig(this, (byte) 0);
        }

        /* renamed from: a */
        public final C6628a m91413a(CachePolicy cachePolicy) {
            if (cachePolicy == null) {
                cachePolicy = CachePolicy.f13957a;
            }
            this.f13956b = cachePolicy;
            return this;
        }
    }

    /* synthetic */ CacheConfig(C6628a c6628a, byte b) {
        this(c6628a);
    }

    /* renamed from: a */
    public final CachePolicy m91416a() {
        return this.f13953b;
    }

    private CacheConfig(C6628a c6628a) {
        this.f13952a = c6628a.f13955a;
        this.f13953b = c6628a.f13956b;
        this.f13954c = null;
    }
}
