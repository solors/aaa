package com.yandex.mobile.ads.impl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@DebugMetadata(m17095c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader", m17094f = "PrefetchedMediationNetworksDataLoader.kt", m17093l = {57, 61}, m17092m = "loadNetworksMediationDataInternal")
/* loaded from: classes8.dex */
public final class ng1 extends AbstractC37589d {

    /* renamed from: b */
    mg1 f82777b;

    /* renamed from: c */
    /* synthetic */ Object f82778c;

    /* renamed from: d */
    final /* synthetic */ mg1 f82779d;

    /* renamed from: e */
    int f82780e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng1(mg1 mg1Var, Continuation<? super ng1> continuation) {
        super(continuation);
        this.f82779d = mg1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82778c = obj;
        this.f82780e |= Integer.MIN_VALUE;
        return mg1.m32008a(0L, null, null, this.f82779d, null, this);
    }
}
