package com.moloco.sdk.internal.scheduling;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* renamed from: com.moloco.sdk.internal.scheduling.e */
/* loaded from: classes7.dex */
public final class C24241e {
    @NotNull

    /* renamed from: a */
    public static final CoroutineScope f62781a = C37785p0.m16131a(C24239c.m46733a().mo46738a());

    @DebugMetadata(m17095c = "com.moloco.sdk.internal.scheduling.RunOnMainDispatcherKt$runOnMainDispatcher$1", m17094f = "RunOnMainDispatcher.kt", m17093l = {}, m17092m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.scheduling.e$a */
    /* loaded from: classes7.dex */
    public static final class C24242a extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: l */
        public int f62782l;

        /* renamed from: m */
        public final /* synthetic */ Functions<Unit> f62783m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24242a(Functions<Unit> functions, Continuation<? super C24242a> continuation) {
            super(2, continuation);
            this.f62783m = functions;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a */
        public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C24242a) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C24242a(this.f62783m, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C42688d.m6959e();
            if (this.f62782l == 0) {
                C38508r.m14539b(obj);
                this.f62783m.invoke();
                return Unit.f99208a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @NotNull
    /* renamed from: a */
    public static final InterfaceC37708b2 m46731a(@NotNull Functions<Unit> block) {
        InterfaceC37708b2 m16221d;
        Intrinsics.checkNotNullParameter(block, "block");
        m16221d = C37756k.m16221d(f62781a, null, null, new C24242a(block, null), 3, null);
        return m16221d;
    }
}
