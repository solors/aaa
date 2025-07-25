package com.bykv.p135vk.openvk.preload.p163b;

import com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a;

/* renamed from: com.bykv.vk.openvk.preload.b.h */
/* loaded from: classes3.dex */
public final class Pipe {

    /* renamed from: a */
    Class<? extends Interceptor> f13911a;

    /* renamed from: b */
    private AbstractC6618a f13912b;

    /* renamed from: c */
    private Object[] f13913c;

    /* compiled from: Pipe.java */
    /* renamed from: com.bykv.vk.openvk.preload.b.h$a */
    /* loaded from: classes3.dex */
    public static final class C6621a {

        /* renamed from: a */
        private Class<? extends Interceptor> f13914a;

        /* renamed from: b */
        private AbstractC6618a f13915b;

        /* renamed from: c */
        private Object[] f13916c;

        private C6621a() {
        }

        /* renamed from: a */
        public static C6621a m91458a() {
            return new C6621a();
        }

        /* renamed from: b */
        public final Pipe m91453b() {
            return new Pipe(this, (byte) 0);
        }

        /* renamed from: a */
        public final C6621a m91455a(Class<? extends Interceptor> cls) {
            if (cls != null) {
                this.f13914a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        /* renamed from: a */
        public final C6621a m91457a(AbstractC6618a abstractC6618a) {
            this.f13915b = abstractC6618a;
            return this;
        }

        /* renamed from: a */
        public final C6621a m91454a(Object... objArr) {
            this.f13916c = objArr;
            return this;
        }
    }

    /* synthetic */ Pipe(C6621a c6621a, byte b) {
        this(c6621a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC6618a m91460a() {
        return this.f13912b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] m91459b() {
        return this.f13913c;
    }

    private Pipe(C6621a c6621a) {
        this.f13911a = c6621a.f13914a;
        this.f13912b = c6621a.f13915b;
        this.f13913c = c6621a.f13916c;
        if (this.f13911a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
