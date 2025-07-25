package com.unity3d.ads.core.domain.events;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EventObservers.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.events.EventObservers", m17094f = "EventObservers.kt", m17093l = {16, 17, 18}, m17092m = "invoke")
@Metadata
/* loaded from: classes7.dex */
public final class EventObservers$invoke$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventObservers this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventObservers$invoke$1(EventObservers eventObservers, Continuation<? super EventObservers$invoke$1> continuation) {
        super(continuation);
        this.this$0 = eventObservers;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
