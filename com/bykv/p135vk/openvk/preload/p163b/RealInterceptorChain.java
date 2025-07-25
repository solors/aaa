package com.bykv.p135vk.openvk.preload.p163b;

import com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bykv.vk.openvk.preload.b.i */
/* loaded from: classes3.dex */
public final class RealInterceptorChain implements Chain {

    /* renamed from: a */
    protected InterceptorFactory f13917a;

    /* renamed from: b */
    private int f13918b;

    /* renamed from: c */
    private List<Pipe> f13919c;

    /* renamed from: d */
    private Interceptor f13920d;

    /* compiled from: RealInterceptorChain.java */
    /* renamed from: com.bykv.vk.openvk.preload.b.i$a */
    /* loaded from: classes3.dex */
    static final class C6622a extends Exception {
        C6622a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealInterceptorChain(List<Pipe> list, int i, InterceptorFactory interceptorFactory, Interceptor interceptor) {
        this.f13919c = list;
        this.f13918b = i;
        this.f13917a = interceptorFactory;
        this.f13920d = interceptor;
    }

    /* renamed from: c */
    private Interceptor m91447c(Class cls) {
        Interceptor interceptor = this.f13920d;
        while (interceptor != null && interceptor.getClass() != cls) {
            interceptor = interceptor.f13899a;
        }
        return interceptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Chain
    /* renamed from: a */
    public final Object mo91449a(Object obj) throws Exception {
        Interceptor interceptor = this.f13920d;
        if (interceptor != null) {
            interceptor.f13901c = obj;
            interceptor.m91463e();
        }
        if (this.f13918b >= this.f13919c.size()) {
            return obj;
        }
        Pipe pipe = this.f13919c.get(this.f13918b);
        Class<? extends Interceptor> cls = pipe.f13911a;
        Interceptor interceptor2 = (Interceptor) this.f13917a.mo91461a(cls);
        if (interceptor2 != null) {
            AbstractC6618a m91460a = pipe.m91460a();
            RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.f13919c, this.f13918b + 1, this.f13917a, interceptor2);
            interceptor2.m91470a(realInterceptorChain, this.f13920d, obj, m91460a, pipe.m91459b());
            interceptor2.m91467c();
            try {
                Object mo91295a = interceptor2.mo91295a(realInterceptorChain, obj);
                interceptor2.m91465d();
                return mo91295a;
            } catch (C6622a e) {
                interceptor2.m91466c(e.getCause());
                throw e;
            } catch (Throwable th) {
                interceptor2.m91468b(th);
                throw new C6622a(th);
            }
        }
        throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.Chain
    /* renamed from: b */
    public final Object mo91448b(Class cls) {
        Interceptor m91447c = m91447c(cls);
        if (m91447c != null) {
            return m91447c.f13901c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.Chain
    /* renamed from: a */
    public final Object mo91450a(Class cls) {
        Interceptor m91447c = m91447c(cls);
        if (m91447c != null) {
            return m91447c.f13900b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
