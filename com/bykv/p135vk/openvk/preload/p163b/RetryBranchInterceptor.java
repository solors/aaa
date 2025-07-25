package com.bykv.p135vk.openvk.preload.p163b;

import com.bykv.p135vk.openvk.preload.p163b.RealInterceptorChain;
import com.bykv.p135vk.openvk.preload.p163b.SubBranchInterceptor;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.b.j */
/* loaded from: classes3.dex */
public abstract class RetryBranchInterceptor<IN, OUT> extends SubBranchInterceptor<IN, OUT> {

    /* renamed from: d */
    private String f13921d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final Object mo91295a(Chain<OUT> chain, IN in) throws Throwable {
        new Factory(chain);
        this.f13921d = mo91315a((RetryBranchInterceptor<IN, OUT>) in);
        SubBranchInterceptor.C6623a c6623a = m91444a().get(this.f13921d);
        while (c6623a != null) {
            List<Pipe> list = c6623a.f13924a;
            try {
                Object mo91449a = Factory.m91471a(list, chain.f13917a, this).mo91449a((Chain) in);
                if (!SubBranchInterceptor.m91443a(list)) {
                    return mo91449a;
                }
                return chain.mo91449a((Chain<OUT>) mo91449a);
            } catch (RealInterceptorChain.C6622a e) {
                Throwable cause = e.getCause();
                new Factory(chain);
                this.f13921d = mo91314a(in, cause, this.f13921d);
                c6623a = m91444a().get(this.f13921d);
            } catch (Throwable th) {
                new Factory(chain);
                this.f13921d = mo91314a(in, th, this.f13921d);
                c6623a = m91444a().get(this.f13921d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f13921d);
    }

    /* renamed from: a */
    protected abstract String mo91315a(IN in);

    /* renamed from: a */
    protected abstract String mo91314a(IN in, Throwable th, String str);
}
