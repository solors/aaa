package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Flow.kt */
@Metadata
/* renamed from: ge.a */
/* loaded from: classes8.dex */
public abstract class AbstractC33307a<T> implements InterfaceC33327h<T>, InterfaceC33312c<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Flow.kt */
    @DebugMetadata(m17095c = "kotlinx.coroutines.flow.AbstractFlow", m17094f = "Flow.kt", m17093l = {230}, m17092m = "collect")
    @Metadata
    /* renamed from: ge.a$a */
    /* loaded from: classes8.dex */
    public static final class C33308a extends AbstractC37589d {

        /* renamed from: l */
        Object f90896l;

        /* renamed from: m */
        /* synthetic */ Object f90897m;

        /* renamed from: n */
        final /* synthetic */ AbstractC33307a<T> f90898n;

        /* renamed from: o */
        int f90899o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33308a(AbstractC33307a<T> abstractC33307a, Continuation<? super C33308a> continuation) {
            super(continuation);
            this.f90898n = abstractC33307a;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f90897m = obj;
            this.f90899o |= Integer.MIN_VALUE;
            return this.f90898n.collect(null, this);
        }
    }

    @Nullable
    /* renamed from: c */
    public abstract Object mo24168c(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // ge.InterfaceC33327h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(@org.jetbrains.annotations.NotNull ge.FlowCollector<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ge.AbstractC33307a.C33308a
            if (r0 == 0) goto L13
            r0 = r7
            ge.a$a r0 = (ge.AbstractC33307a.C33308a) r0
            int r1 = r0.f90899o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f90899o = r1
            goto L18
        L13:
            ge.a$a r0 = new ge.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f90897m
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f90899o
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f90896l
            he.t r6 = (p704he.C33531t) r6
            p804nd.C38508r.m14539b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            p804nd.C38508r.m14539b(r7)
            he.t r7 = new he.t
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f90896l = r7     // Catch: java.lang.Throwable -> L55
            r0.f90899o = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo24168c(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.f99208a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.AbstractC33307a.collect(ge.i, kotlin.coroutines.d):java.lang.Object");
    }
}
