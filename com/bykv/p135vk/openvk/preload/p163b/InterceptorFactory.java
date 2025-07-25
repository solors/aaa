package com.bykv.p135vk.openvk.preload.p163b;

/* renamed from: com.bykv.vk.openvk.preload.b.e */
/* loaded from: classes3.dex */
public interface InterceptorFactory {

    /* compiled from: InterceptorFactory.java */
    /* renamed from: com.bykv.vk.openvk.preload.b.e$a */
    /* loaded from: classes3.dex */
    public static class C6619a implements InterceptorFactory {
        @Override // com.bykv.p135vk.openvk.preload.p163b.InterceptorFactory
        /* renamed from: a */
        public final <T> T mo91461a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    <T> T mo91461a(Class<T> cls);
}
