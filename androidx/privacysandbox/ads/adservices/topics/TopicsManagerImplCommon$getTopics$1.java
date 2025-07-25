package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsManagerImplCommon.kt */
@DebugMetadata(m17095c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", m17094f = "TopicsManagerImplCommon.kt", m17093l = {22}, m17092m = "getTopics$suspendImpl")
@Metadata
/* loaded from: classes2.dex */
public final class TopicsManagerImplCommon$getTopics$1 extends AbstractC37589d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TopicsManagerImplCommon this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerImplCommon$getTopics$1(TopicsManagerImplCommon topicsManagerImplCommon, Continuation<? super TopicsManagerImplCommon$getTopics$1> continuation) {
        super(continuation);
        this.this$0 = topicsManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TopicsManagerImplCommon.getTopics$suspendImpl(this.this$0, null, this);
    }
}
