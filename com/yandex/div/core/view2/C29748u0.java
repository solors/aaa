package com.yandex.div.core.view2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.DivDataTag;
import sb.DivData;

/* compiled from: ViewBindingProvider.kt */
@Metadata
/* renamed from: com.yandex.div.core.view2.u0 */
/* loaded from: classes8.dex */
public final class C29748u0 {
    @NotNull

    /* renamed from: a */
    private ViewBindingProvider f75903a;
    @NotNull

    /* renamed from: b */
    private final List<Function1<ViewBindingProvider, Unit>> f75904b;

    public C29748u0() {
        DivDataTag INVALID = DivDataTag.f118797b;
        Intrinsics.checkNotNullExpressionValue(INVALID, "INVALID");
        this.f75903a = new ViewBindingProvider(INVALID, null);
        this.f75904b = new ArrayList();
    }

    /* renamed from: a */
    public final void m36695a(@NotNull Function1<? super ViewBindingProvider, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        observer.invoke(this.f75903a);
        this.f75904b.add(observer);
    }

    /* renamed from: b */
    public final void m36694b(@NotNull DivDataTag tag, @Nullable DivData divData) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.m17075f(tag, this.f75903a.m37093b()) && this.f75903a.m37094a() == divData) {
            return;
        }
        this.f75903a = new ViewBindingProvider(tag, divData);
        Iterator<T> it = this.f75904b.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this.f75903a);
        }
    }
}
