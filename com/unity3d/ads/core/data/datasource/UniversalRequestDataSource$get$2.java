package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import ge.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UniversalRequestDataSource.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", m17094f = "UniversalRequestDataSource.kt", m17093l = {16}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
public final class UniversalRequestDataSource$get$2 extends AbstractC37596l implements InterfaceC45268n<FlowCollector<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UniversalRequestDataSource$get$2(Continuation<? super UniversalRequestDataSource$get$2> continuation) {
        super(3, continuation);
    }

    @Override // p1076zd.InterfaceC45268n
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super UniversalRequestStoreOuterClass.UniversalRequestStore> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
        UniversalRequestDataSource$get$2 universalRequestDataSource$get$2 = new UniversalRequestDataSource$get$2(continuation);
        universalRequestDataSource$get$2.L$0 = flowCollector;
        universalRequestDataSource$get$2.L$1 = th;
        return universalRequestDataSource$get$2.invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        m6959e = C42688d.m6959e();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C38508r.m14539b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C38508r.m14539b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof CorruptionException) {
                UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
                Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(defaultInstance, this) == m6959e) {
                    return m6959e;
                }
            } else {
                throw th;
            }
        }
        return Unit.f99208a;
    }
}
