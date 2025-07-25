package com.bykv.p135vk.openvk.preload.p163b;

import com.bykv.p135vk.openvk.preload.p163b.SubBranchInterceptor;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.b.a */
/* loaded from: classes3.dex */
public abstract class BranchInterceptor<IN, OUT> extends SubBranchInterceptor<IN, OUT> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final Object mo91295a(Chain<OUT> chain, IN in) throws Throwable {
        new Factory(chain);
        String mo91323a = mo91323a((BranchInterceptor<IN, OUT>) in);
        SubBranchInterceptor.C6623a c6623a = m91444a().get(mo91323a);
        if (c6623a != null) {
            List<Pipe> list = c6623a.f13924a;
            Object mo91449a = Factory.m91471a(list, ((RealInterceptorChain) chain).f13917a, this).mo91449a((Chain) in);
            if (!SubBranchInterceptor.m91443a(list)) {
                return mo91449a;
            }
            return chain.mo91449a((Chain<OUT>) mo91449a);
        }
        throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(mo91323a)));
    }

    /* renamed from: a */
    protected abstract String mo91323a(IN in);
}
