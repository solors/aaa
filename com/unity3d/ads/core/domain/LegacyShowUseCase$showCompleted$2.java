package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.extensions.ShowStatusExtensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LegacyShowUseCase.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$2", m17094f = "LegacyShowUseCase.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
public final class LegacyShowUseCase$showCompleted$2 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ ShowStatus $status;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$showCompleted$2(Listeners listeners, String str, ShowStatus showStatus, Continuation<? super LegacyShowUseCase$showCompleted$2> continuation) {
        super(2, continuation);
        this.$listeners = listeners;
        this.$placement = str;
        this.$status = showStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LegacyShowUseCase$showCompleted$2(this.$listeners, this.$placement, this.$status, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            this.$listeners.onComplete(this.$placement, ShowStatusExtensions.toUnityAdsShowCompletionState(this.$status));
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LegacyShowUseCase$showCompleted$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
