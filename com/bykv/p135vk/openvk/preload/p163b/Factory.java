package com.bykv.p135vk.openvk.preload.p163b;

import com.bykv.p135vk.openvk.preload.p163b.InterceptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.b.c */
/* loaded from: classes3.dex */
public final class Factory<IN> implements Chain<IN> {

    /* renamed from: a */
    private Chain<IN> f13897a;

    public Factory(Chain<IN> chain) {
        this.f13897a = chain;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <IN> Chain<IN> m91471a(List<Pipe> list, InterceptorFactory interceptorFactory, Interceptor interceptor) {
        if (list != null) {
            if (interceptorFactory == null) {
                interceptorFactory = new InterceptorFactory.C6619a();
            }
            return new RealInterceptorChain(Collections.unmodifiableList(new ArrayList(list)), 0, interceptorFactory, interceptor);
        }
        throw new IllegalArgumentException("interceptors == null !");
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.Chain
    /* renamed from: b */
    public final <O> O mo91448b(Class<? extends Interceptor<?, O>> cls) {
        return (O) this.f13897a.mo91448b(cls);
    }

    /* renamed from: a */
    public static <IN> Chain<IN> m91472a(List<Pipe> list) {
        return m91471a(list, null, null);
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.Chain
    /* renamed from: a */
    public final Object mo91449a(IN in) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.Chain
    /* renamed from: a */
    public final <I> I mo91450a(Class<? extends Interceptor<I, ?>> cls) {
        return (I) this.f13897a.mo91450a((Class<? extends Interceptor<Object, ?>>) cls);
    }
}
