package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C30356g2;
import com.yandex.mobile.ads.impl.om1;
import com.yandex.mobile.ads.impl.zs1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.rj */
/* loaded from: classes8.dex */
public abstract class AbstractC31287rj<T> extends ml1<T> {

    /* renamed from: w */
    private static final int f84772w = (int) TimeUnit.SECONDS.toMillis(10);
    @NotNull

    /* renamed from: s */
    private final Context f84773s;
    @NotNull

    /* renamed from: t */
    private final InterfaceC31288a<T> f84774t;
    @Nullable

    /* renamed from: u */
    private final wl1 f84775u;
    @NotNull

    /* renamed from: v */
    private final em1 f84776v;

    /* renamed from: com.yandex.mobile.ads.impl.rj$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31288a<T> extends om1.InterfaceC31054b<T>, om1.InterfaceC31053a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC31287rj(@NotNull Context context, int i, @NotNull String url, @NotNull InterfaceC31288a<T> listener, @Nullable wl1 wl1Var) {
        super(i, url, listener);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f84773s = context;
        this.f84774t = listener;
        this.f84775u = wl1Var;
        m31938q();
        m31960a(new C31859xy(1.0f, f84772w, 0));
        this.f84776v = em1.f78710b;
    }

    /* renamed from: a */
    public final void m30039a(@Nullable Integer num) {
        Context context = this.f84773s;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = C30356g2.f79435e;
        C30356g2.C30357a.m33996a(context).m34000a(mo29226w(), num);
    }

    @Override // com.yandex.mobile.ads.impl.ml1
    @NotNull
    /* renamed from: b */
    public yc2 mo30037b(@NotNull yc2 volleyError) {
        Integer num;
        Intrinsics.checkNotNullParameter(volleyError, "volleyError");
        c91 c91Var = volleyError.f88158b;
        if (c91Var != null) {
            num = Integer.valueOf(c91Var.f77556a);
        } else {
            num = null;
        }
        m30039a(num);
        Intrinsics.checkNotNullExpressionValue(volleyError, "parseNetworkError(...)");
        return volleyError;
    }

    @NotNull
    /* renamed from: w */
    protected em1 mo29226w() {
        return this.f84776v;
    }

    /* renamed from: x */
    public final void m30036x() {
        wl1 wl1Var = this.f84775u;
        if (wl1Var != null) {
            wl1Var.mo27873b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ml1
    /* renamed from: a */
    public final void mo27505a(T t) {
        this.f84774t.mo28555a((InterfaceC31288a<T>) t);
    }

    /* renamed from: a */
    public final void m30038a(@NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        String m27983a = wc0.m27983a(headers, df0.f78084c0);
        if (m27983a != null) {
            zs1.C32014a c32014a = zs1.f89088a;
            Context context = this.f84773s;
            c32014a.getClass();
            zs1.C32014a.m26005a(context).mo26006a(m27983a);
        }
    }

    public /* synthetic */ AbstractC31287rj(Context context, String str, InterfaceC31288a interfaceC31288a) {
        this(context, 0, str, interfaceC31288a, null);
    }
}
