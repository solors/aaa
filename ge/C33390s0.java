package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
@Metadata
/* renamed from: ge.s0 */
/* loaded from: classes8.dex */
public final class C33390s0<T> implements SharedFlow<T> {
    @NotNull

    /* renamed from: b */
    private final SharedFlow<T> f91122b;
    @NotNull

    /* renamed from: c */
    private final Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> f91123c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @DebugMetadata(m17095c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m17094f = "Share.kt", m17093l = {409}, m17092m = "collect")
    @Metadata
    /* renamed from: ge.s0$a */
    /* loaded from: classes8.dex */
    public static final class C33391a extends AbstractC37589d {

        /* renamed from: l */
        /* synthetic */ Object f91124l;

        /* renamed from: m */
        final /* synthetic */ C33390s0<T> f91125m;

        /* renamed from: n */
        int f91126n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33391a(C33390s0<T> c33390s0, Continuation<? super C33391a> continuation) {
            super(continuation);
            this.f91125m = c33390s0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f91124l = obj;
            this.f91126n |= Integer.MIN_VALUE;
            return this.f91125m.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33390s0(@NotNull SharedFlow<? extends T> sharedFlow, @NotNull Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f91122b = sharedFlow;
        this.f91123c = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // ge.SharedFlow, ge.InterfaceC33327h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull ge.FlowCollector<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ge.C33390s0.C33391a
            if (r0 == 0) goto L13
            r0 = r7
            ge.s0$a r0 = (ge.C33390s0.C33391a) r0
            int r1 = r0.f91126n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91126n = r1
            goto L18
        L13:
            ge.s0$a r0 = new ge.s0$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f91124l
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f91126n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            p804nd.C38508r.m14539b(r7)
            goto L46
        L31:
            p804nd.C38508r.m14539b(r7)
            ge.d0<T> r7 = r5.f91122b
            ge.r0 r2 = new ge.r0
            kotlin.jvm.functions.Function2<ge.i<? super T>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r4 = r5.f91123c
            r2.<init>(r6, r4)
            r0.f91126n = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            nd.i r6 = new nd.i
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.C33390s0.collect(ge.i, kotlin.coroutines.d):java.lang.Object");
    }
}
