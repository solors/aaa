package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC31287rj;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class qi0 implements AbstractC31287rj.InterfaceC31288a<C30508hw> {

    /* renamed from: a */
    final /* synthetic */ Function1<C30508hw, Unit> f84373a;

    /* renamed from: b */
    final /* synthetic */ Function1<yc2, Unit> f84374b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public qi0(Function1<? super C30508hw, Unit> function1, Function1<? super yc2, Unit> function12) {
        this.f84373a = function1;
        this.f84374b = function12;
    }

    @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
    /* renamed from: a */
    public final void mo29243a(@NotNull yc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f84374b.invoke(error);
    }

    @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31054b
    /* renamed from: a */
    public final void mo28555a(Object obj) {
        C30508hw response = (C30508hw) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f84373a.invoke(response);
    }
}
