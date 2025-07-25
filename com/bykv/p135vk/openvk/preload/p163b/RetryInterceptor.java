package com.bykv.p135vk.openvk.preload.p163b;

import com.bykv.p135vk.openvk.preload.p163b.RealInterceptorChain;

/* renamed from: com.bykv.vk.openvk.preload.b.k */
/* loaded from: classes3.dex */
public abstract class RetryInterceptor<IN, OUT> extends Interceptor<IN, OUT> {

    /* renamed from: d */
    private IN f13922d;

    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final Object mo91295a(Chain<OUT> chain, IN in) throws Throwable {
        this.f13922d = in;
        try {
            return chain.mo91449a((Chain<OUT>) mo91297a());
        } catch (RealInterceptorChain.C6622a e) {
            return m91446a((Chain) chain, e.getCause());
        } catch (Throwable th) {
            return m91446a((Chain) chain, th);
        }
    }

    /* renamed from: a */
    protected abstract boolean mo91296a(Throwable th);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final IN m91445g() {
        return this.f13922d;
    }

    /* renamed from: a */
    private Object m91446a(Chain<OUT> chain, Throwable th) throws Throwable {
        while (mo91296a(th)) {
            try {
                return chain.mo91449a((Chain<OUT>) mo91297a());
            } catch (RealInterceptorChain.C6622a e) {
                th = e.getCause();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [IN, OUT] */
    /* renamed from: a */
    protected OUT mo91297a() {
        return this.f13922d;
    }
}
