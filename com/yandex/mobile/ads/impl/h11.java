package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g42;
import com.yandex.mobile.ads.impl.p41;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public class h11 implements p41 {
    @NotNull

    /* renamed from: a */
    private final List<C31034of<?>> f79840a;
    @NotNull

    /* renamed from: b */
    private final l41 f79841b;
    @Nullable

    /* renamed from: c */
    private String f79842c;
    @Nullable

    /* renamed from: d */
    private v31 f79843d;

    /* JADX WARN: Multi-variable type inference failed */
    public h11(@NotNull List<? extends C31034of<?>> assets, @NotNull l41 nativeAdsConfiguration) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(nativeAdsConfiguration, "nativeAdsConfiguration");
        this.f79840a = assets;
        this.f79841b = nativeAdsConfiguration;
    }

    /* renamed from: a */
    public static final boolean m33736a(h11 this$0, List assets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(assets, "assets");
        ArrayList arrayList = new ArrayList();
        for (Object obj : assets) {
            if (((C31034of) obj).m31039f()) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C31034of<?> c31034of = (C31034of) it.next();
                v31 v31Var = this$0.f79843d;
                InterfaceC31123pf<?> m28543a = v31Var != null ? v31Var.m28543a(c31034of) : null;
                if (m28543a != null && m28543a.mo28950d()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m33733b(h11 this$0, List assets) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(assets, "assets");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : assets) {
            if (((C31034of) obj2).m31039f()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C31034of<?> c31034of = (C31034of) obj;
            v31 v31Var = this$0.f79843d;
            InterfaceC31123pf<?> m28543a = v31Var != null ? v31Var.m28543a(c31034of) : null;
            if (!(m28543a instanceof InterfaceC31123pf)) {
                m28543a = null;
            }
            if (m28543a == null) {
                break;
            } else if (!m28543a.mo28955a(c31034of.m31041d())) {
                break;
            }
        }
        C31034of c31034of2 = (C31034of) obj;
        this$0.f79842c = c31034of2 != null ? c31034of2.m31043b() : null;
        return c31034of2 == null;
    }

    /* renamed from: c */
    public static final boolean m33731c(h11 this$0, List assets) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(assets, "assets");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : assets) {
            if (((C31034of) obj2).m31039f()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C31034of<?> c31034of = (C31034of) obj;
            v31 v31Var = this$0.f79843d;
            InterfaceC31123pf<?> m28543a = v31Var != null ? v31Var.m28543a(c31034of) : null;
            if (m28543a == null) {
                break;
            } else if (!m28543a.mo28949e()) {
                break;
            }
        }
        C31034of c31034of2 = (C31034of) obj;
        this$0.f79842c = c31034of2 != null ? c31034of2.m31043b() : null;
        return c31034of2 == null;
    }

    /* renamed from: d */
    public final boolean m33730d() {
        return !m33735a(new p41.InterfaceC31087a() { // from class: com.yandex.mobile.ads.impl.qp2
            {
                h11.this = this;
            }

            @Override // com.yandex.mobile.ads.impl.p41.InterfaceC31087a
            public final boolean isValid(List list) {
                boolean m33733b;
                m33733b = h11.m33733b(h11.this, list);
                return m33733b;
            }
        });
    }

    /* renamed from: d */
    public static final boolean m33729d(h11 this$0, List assets) {
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(assets, "assets");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : assets) {
            if (((C31034of) obj2).m31039f()) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C31034of<?> c31034of = (C31034of) obj;
            v31 v31Var = this$0.f79843d;
            InterfaceC31123pf<?> m28543a = v31Var != null ? v31Var.m28543a(c31034of) : null;
            if (m28543a == null) {
                break;
            } else if (!m28543a.mo28954b()) {
                break;
            }
        }
        C31034of c31034of2 = (C31034of) obj;
        this$0.f79842c = c31034of2 != null ? c31034of2.m31043b() : null;
        return c31034of2 == null;
    }

    /* renamed from: e */
    public final boolean m33728e() {
        return !m33735a(new p41.InterfaceC31087a() { // from class: com.yandex.mobile.ads.impl.np2
            {
                h11.this = this;
            }

            @Override // com.yandex.mobile.ads.impl.p41.InterfaceC31087a
            public final boolean isValid(List list) {
                boolean m33731c;
                m33731c = h11.m33731c(h11.this, list);
                return m33731c;
            }
        });
    }

    /* renamed from: a */
    public boolean mo33458a(@NotNull p41.InterfaceC31087a validator, @NotNull List<? extends C31034of<?>> assets) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f79841b.m32348c();
        return validator.isValid(assets);
    }

    @NotNull
    /* renamed from: b */
    public final l41 m33734b() {
        return this.f79841b;
    }

    /* renamed from: c */
    public final boolean m33732c() {
        return !m33735a(new p41.InterfaceC31087a() { // from class: com.yandex.mobile.ads.impl.pp2
            {
                h11.this = this;
            }

            @Override // com.yandex.mobile.ads.impl.p41.InterfaceC31087a
            public final boolean isValid(List list) {
                boolean m33736a;
                m33736a = h11.m33736a(h11.this, list);
                return m33736a;
            }
        });
    }

    /* renamed from: a */
    private final boolean m33735a(p41.InterfaceC31087a interfaceC31087a) {
        return this.f79843d != null && mo33458a(interfaceC31087a, this.f79840a);
    }

    @Override // com.yandex.mobile.ads.impl.p41
    /* renamed from: a */
    public final void mo30836a(@Nullable v31 v31Var) {
        this.f79843d = v31Var;
    }

    @Override // com.yandex.mobile.ads.impl.p41
    @NotNull
    /* renamed from: a */
    public final im1 mo30837a() {
        return new im1(this.f79842c, m33735a(new p41.InterfaceC31087a() { // from class: com.yandex.mobile.ads.impl.op2
            {
                h11.this = this;
            }

            @Override // com.yandex.mobile.ads.impl.p41.InterfaceC31087a
            public final boolean isValid(List list) {
                boolean m33729d;
                m33729d = h11.m33729d(h11.this, list);
                return m33729d;
            }
        }));
    }

    @Override // com.yandex.mobile.ads.impl.p41
    @NotNull
    /* renamed from: a */
    public final o41 mo30835a(boolean z) {
        g42.EnumC30362a enumC30362a;
        List<C31034of<?>> list = this.f79840a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((C31034of) it.next()).m31039f() && (i = i + 1) < 0) {
                    C37563v.m17157v();
                }
            }
            if (i >= 2 && m33732c() && !z) {
                enumC30362a = g42.EnumC30362a.f79488h;
                return new o41(enumC30362a, this.f79842c);
            }
        }
        if (m33728e()) {
            enumC30362a = g42.EnumC30362a.f79491k;
        } else {
            enumC30362a = m33730d() ? g42.EnumC30362a.f79485e : g42.EnumC30362a.f79483c;
        }
        return new o41(enumC30362a, this.f79842c);
    }
}
