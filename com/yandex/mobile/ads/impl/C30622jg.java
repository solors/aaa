package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.z31;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.jg */
/* loaded from: classes8.dex */
public final class C30622jg {
    @NotNull

    /* renamed from: a */
    private final Collection<String> f80896a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C30622jg() {
        /*
            r1 = this;
            java.util.List r0 = kotlin.collections.C37561t.m17202m()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30622jg.<init>():void");
    }

    @NotNull
    /* renamed from: a */
    public final z31 m32932a(@NotNull View view, @NotNull c11 viewProvider) {
        Map m17284j;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        u41 u41Var = u41.f86102c;
        m17284j = C37559r0.m17284j();
        z31.C31951a c31951a = new z31.C31951a(view, u41Var, m17284j);
        z31.C31951a m26436e = c31951a.m26448a(viewProvider.mo34721h(view)).m26444b(viewProvider.mo34729a(view)).m26441c(viewProvider.mo34724e(view)).m26438d(viewProvider.mo34715n(view)).m26450a(viewProvider.mo34722g(view)).m26445b(viewProvider.mo34717l(view)).m26442c(viewProvider.mo34714o(view)).m26447a(viewProvider.mo34726c(view)).m26451a(viewProvider.mo34727b(view)).m26449a(viewProvider.mo34718k(view)).m26436e(viewProvider.mo34725d(view));
        View mo34720i = viewProvider.mo34720i(view);
        if (!(mo34720i instanceof dj1)) {
            mo34720i = null;
        }
        m26436e.m26453a(mo34720i).m26434f(viewProvider.mo34713p(view)).m26433g(viewProvider.mo34716m(view)).m26432h(viewProvider.mo34719j(view)).m26431i(viewProvider.mo34723f(view));
        for (String str : this.f80896a) {
            View mo34728a = viewProvider.mo34728a(view, str);
            if (mo34728a != null) {
                c31951a.m26452a(mo34728a, str);
            }
        }
        return new z31(c31951a, 0);
    }

    public C30622jg(@NotNull Collection<String> supportedAssetNames) {
        Intrinsics.checkNotNullParameter(supportedAssetNames, "supportedAssetNames");
        this.f80896a = supportedAssetNames;
    }
}
