package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC31287rj;
import com.yandex.mobile.ads.impl.f62;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class fd2<T> implements AbstractC31287rj.InterfaceC31288a<T> {
    @Nullable

    /* renamed from: a */
    private final vl1<T> f79056a;

    /* renamed from: com.yandex.mobile.ads.impl.fd2$a */
    /* loaded from: classes8.dex */
    public static final class C30308a {
        private C30308a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static f62 m34170b(yc2 yc2Var) {
            if (yc2Var instanceof x20) {
                return f62.C30297a.m34209a((x20) yc2Var);
            }
            if (yc2Var instanceof ec1) {
                return f62.C30297a.m34210a();
            }
            c91 c91Var = yc2Var.f88158b;
            if (c91Var == null) {
                return f62.C30297a.m34208a(yc2Var.getMessage());
            }
            int i = c91Var.f77556a;
            if (i >= 500) {
                return f62.C30297a.m34207b();
            }
            byte[] data = c91Var.f77557b;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            String str = ("Network Error.  Code: " + i + ".") + " Data: \n" + new String(data, Charsets.UTF_8);
            um0.m28726c(new Object[0]);
            return f62.C30297a.m34206b(str);
        }

        public /* synthetic */ C30308a(int i) {
            this();
        }
    }

    public fd2(@Nullable vl1<T> vl1Var) {
        this.f79056a = vl1Var;
    }

    @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
    /* renamed from: a */
    public final void mo29243a(@NotNull yc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f79056a != null) {
            this.f79056a.mo26878a(C30308a.m34170b(error));
        }
    }

    @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31054b
    /* renamed from: a */
    public final void mo28555a(@NotNull T response) {
        Intrinsics.checkNotNullParameter(response, "response");
        vl1<T> vl1Var = this.f79056a;
        if (vl1Var != null) {
            vl1Var.mo26877a((vl1<T>) response);
        }
    }
}
