package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.nu */
/* loaded from: classes6.dex */
public final class C20548nu {
    @NotNull

    /* renamed from: a */
    private final List<AbstractC21201x> f52252a;

    /* JADX WARN: Multi-variable type inference failed */
    public C20548nu(@NotNull List<? extends AbstractC21201x> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        this.f52252a = instances;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C20548nu m56082a(C20548nu c20548nu, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c20548nu.f52252a;
        }
        return c20548nu.m56081a(list);
    }

    @NotNull
    /* renamed from: b */
    public final List<AbstractC21201x> m56080b() {
        return this.f52252a;
    }

    /* renamed from: c */
    public final int m56079c() {
        return this.f52252a.size();
    }

    @NotNull
    /* renamed from: d */
    public final String m56078d() {
        String m17521z0;
        ArrayList arrayList = new ArrayList();
        for (AbstractC21201x abstractC21201x : this.f52252a) {
            arrayList.add(m56083a(abstractC21201x.m54237g(), abstractC21201x.m54225p()));
        }
        m17521z0 = _Collections.m17521z0(arrayList, ",", null, null, 0, null, null, 62, null);
        return m17521z0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C20548nu) && Intrinsics.m17075f(this.f52252a, ((C20548nu) obj).f52252a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f52252a.hashCode();
    }

    @NotNull
    public String toString() {
        return "WaterfallInstances(instances=" + this.f52252a + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C20548nu m56081a(@NotNull List<? extends AbstractC21201x> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        return new C20548nu(instances);
    }

    /* renamed from: a */
    private final String m56083a(C19897f5 c19897f5, int i) {
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c19897f5.m58650c()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    @NotNull
    /* renamed from: a */
    public final List<AbstractC21201x> m56084a() {
        return this.f52252a;
    }
}
