package com.unity3d.services.core.extensions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: CoroutineExtensions.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", m17094f = "CoroutineExtensions.kt", m17093l = {41}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1<T> extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super CoroutineExtensionsKt$memoize$2$deferred$1$1$1> continuation) {
        super(2, continuation);
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(CoroutineScope coroutineScope, Object obj) {
        return invoke(coroutineScope, (Continuation) ((Continuation) obj));
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
            Function1<Continuation<? super T>, Object> function1 = this.$action;
            this.label = 1;
            obj = function1.invoke(this);
            if (obj == m6959e) {
                return m6959e;
            }
        }
        return obj;
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        return this.$action.invoke(this);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super T> continuation) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
