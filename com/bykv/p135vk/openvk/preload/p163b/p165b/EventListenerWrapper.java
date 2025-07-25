package com.bykv.p135vk.openvk.preload.p163b.p165b;

import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bykv.vk.openvk.preload.b.b.b */
/* loaded from: classes3.dex */
public final class EventListenerWrapper extends AbstractC6618a {

    /* renamed from: a */
    private List<AbstractC6618a> f13896a;

    public EventListenerWrapper(AbstractC6618a... abstractC6618aArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f13896a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(abstractC6618aArr));
    }

    /* renamed from: a */
    public final void m91474a(AbstractC6618a abstractC6618a) {
        if (abstractC6618a == null) {
            return;
        }
        this.f13896a.add(abstractC6618a);
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a
    /* renamed from: b */
    public final <T> void mo91244b(Chain<T> chain, Interceptor interceptor) {
        for (AbstractC6618a abstractC6618a : this.f13896a) {
            if (abstractC6618a != null) {
                abstractC6618a.mo91244b(chain, interceptor);
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a
    /* renamed from: c */
    public final <T> void mo91247c(Chain<T> chain, Interceptor interceptor) {
        for (AbstractC6618a abstractC6618a : this.f13896a) {
            if (abstractC6618a != null) {
                abstractC6618a.mo91247c(chain, interceptor);
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a
    /* renamed from: a */
    public final <T> void mo91246a(Chain<T> chain, Interceptor interceptor) {
        for (AbstractC6618a abstractC6618a : this.f13896a) {
            if (abstractC6618a != null) {
                abstractC6618a.mo91246a(chain, interceptor);
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a
    /* renamed from: b */
    public final <T> void mo91248b(Chain<T> chain, Interceptor interceptor, Throwable th) {
        for (AbstractC6618a abstractC6618a : this.f13896a) {
            if (abstractC6618a != null) {
                abstractC6618a.mo91248b(chain, interceptor, th);
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a
    /* renamed from: c */
    public final <T> void mo91473c(Chain<T> chain, Interceptor interceptor, Throwable th) {
        for (AbstractC6618a abstractC6618a : this.f13896a) {
            if (abstractC6618a != null) {
                abstractC6618a.mo91473c(chain, interceptor, th);
            }
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a
    /* renamed from: a */
    public final <T> void mo91245a(Chain<T> chain, Interceptor interceptor, Throwable th) {
        for (AbstractC6618a abstractC6618a : this.f13896a) {
            if (abstractC6618a != null) {
                abstractC6618a.mo91245a(chain, interceptor, th);
            }
        }
    }
}
