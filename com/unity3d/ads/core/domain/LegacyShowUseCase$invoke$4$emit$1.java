package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.ShowEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyShowUseCase.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", m17094f = "LegacyShowUseCase.kt", m17093l = {158, 159, 160, 162, 167}, m17092m = "emit")
@Metadata
/* loaded from: classes7.dex */
public final class LegacyShowUseCase$invoke$4$emit$1 extends AbstractC37589d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase$invoke$4<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase$invoke$4<? super T> legacyShowUseCase$invoke$4, Continuation<? super LegacyShowUseCase$invoke$4$emit$1> continuation) {
        super(continuation);
        this.this$0 = legacyShowUseCase$invoke$4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ShowEvent) null, (Continuation<? super Unit>) this);
    }
}
