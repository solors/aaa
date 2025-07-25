package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdPlayerScope.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AdPlayerScope implements CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0;
    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    public AdPlayerScope(@NotNull CoroutineDispatcher defaultDispatcher) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.defaultDispatcher = defaultDispatcher;
        this.$$delegate_0 = C37785p0.m16131a(defaultDispatcher);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
