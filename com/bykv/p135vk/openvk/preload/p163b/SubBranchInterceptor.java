package com.bykv.p135vk.openvk.preload.p163b;

import com.bykv.p135vk.openvk.preload.p163b.Pipe;
import com.bykv.p135vk.openvk.preload.p163b.p165b.AbstractC6618a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.preload.b.l */
/* loaded from: classes3.dex */
abstract class SubBranchInterceptor<IN, OUT> extends Interceptor<IN, OUT> {

    /* renamed from: d */
    private Map<String, C6623a> f13923d;

    /* compiled from: SubBranchInterceptor.java */
    /* renamed from: com.bykv.vk.openvk.preload.b.l$a */
    /* loaded from: classes3.dex */
    public static final class C6623a {

        /* renamed from: a */
        List<Pipe> f13924a = new ArrayList();

        /* renamed from: a */
        public final C6623a m91442a(Pipe pipe) {
            this.f13924a.add(pipe);
            return this;
        }

        /* renamed from: a */
        public final C6623a m91441a(List<Pipe> list) {
            this.f13924a.addAll(list);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, C6623a> m91444a() {
        return this.f13923d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m91443a(List<Pipe> list) {
        return !list.isEmpty() && list.get(list.size() - 1).f13911a == MergeInterceptor.class;
    }

    /* compiled from: SubBranchInterceptor.java */
    /* renamed from: com.bykv.vk.openvk.preload.b.l$b */
    /* loaded from: classes3.dex */
    public static final class C6624b {

        /* renamed from: a */
        private Map<String, C6623a> f13925a = new HashMap();

        /* renamed from: a */
        public final C6623a m91439a(String str) {
            if (!this.f13925a.containsKey(str)) {
                C6623a c6623a = new C6623a();
                this.f13925a.put(str, c6623a);
                return c6623a;
            }
            throw new IllegalArgumentException("duplicated branch name");
        }

        /* renamed from: a */
        public final Pipe m91440a(Class<? extends SubBranchInterceptor> cls) {
            return Pipe.C6621a.m91458a().m91455a(cls).m91454a(this.f13925a).m91457a((AbstractC6618a) null).m91453b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final void mo91298a(Object... objArr) {
        Object obj;
        super.mo91298a(objArr);
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.f13923d = (Map) obj;
                return;
            } catch (ClassCastException e) {
                throw new IllegalArgumentException(e);
            }
        }
        throw new IllegalStateException("args error");
    }
}
