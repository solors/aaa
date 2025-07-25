package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DownloadPriorityQueue.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", m17094f = "DownloadPriorityQueue.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
public final class DownloadPriorityQueue$invoke$3 extends AbstractC37596l implements Function2<DownloadPriorityQueue.PriorityItem, Continuation<? super Boolean>, Object> {
    final /* synthetic */ DownloadPriorityQueue.PriorityItem $priorityItem;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPriorityQueue$invoke$3(DownloadPriorityQueue.PriorityItem priorityItem, Continuation<? super DownloadPriorityQueue$invoke$3> continuation) {
        super(2, continuation);
        this.$priorityItem = priorityItem;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(this.$priorityItem, continuation);
        downloadPriorityQueue$invoke$3.L$0 = obj;
        return downloadPriorityQueue$invoke$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@Nullable DownloadPriorityQueue.PriorityItem priorityItem, @Nullable Continuation<? super Boolean> continuation) {
        return ((DownloadPriorityQueue$invoke$3) create(priorityItem, continuation)).invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            if (((DownloadPriorityQueue.PriorityItem) this.L$0) == this.$priorityItem) {
                z = true;
            } else {
                z = false;
            }
            return boxing.m17100a(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
