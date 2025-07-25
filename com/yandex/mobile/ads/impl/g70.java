package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import sd.C42688d;

@DebugMetadata(m17095c = "com.monetization.ads.feed.domain.FeedItemListUseCase$feedStateStateFlow$1", m17094f = "FeedItemListUseCase.kt", m17093l = {}, m17092m = "invokeSuspend")
/* loaded from: classes8.dex */
final class g70 extends AbstractC37596l implements InterfaceC45268n<s70, List<? extends b70>, Continuation<? super z70>, Object> {

    /* renamed from: b */
    /* synthetic */ s70 f79532b;

    /* renamed from: c */
    /* synthetic */ List f79533c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g70(Continuation<? super g70> continuation) {
        super(3, continuation);
    }

    @Override // p1076zd.InterfaceC45268n
    public final Object invoke(s70 s70Var, List<? extends b70> list, Continuation<? super z70> continuation) {
        g70 g70Var = new g70(continuation);
        g70Var.f79532b = s70Var;
        g70Var.f79533c = list;
        return g70Var.invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        C38508r.m14539b(obj);
        return new z70(this.f79532b, this.f79533c);
    }
}
