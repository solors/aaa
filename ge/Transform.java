package ge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: ge.w */
/* loaded from: classes8.dex */
public final /* synthetic */ class Transform {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata
    /* renamed from: ge.w$a */
    /* loaded from: classes8.dex */
    public static final class C33411a<T> implements InterfaceC33327h<T> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC33327h f91182b;

        /* compiled from: Emitters.kt */
        @Metadata
        /* renamed from: ge.w$a$a */
        /* loaded from: classes8.dex */
        public static final class C33412a<T> implements FlowCollector {

            /* renamed from: b */
            final /* synthetic */ FlowCollector f91183b;

            /* compiled from: Emitters.kt */
            @DebugMetadata(m17095c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m17094f = "Transform.kt", m17093l = {223}, m17092m = "emit")
            @Metadata
            /* renamed from: ge.w$a$a$a */
            /* loaded from: classes8.dex */
            public static final class C33413a extends AbstractC37589d {

                /* renamed from: l */
                /* synthetic */ Object f91184l;

                /* renamed from: m */
                int f91185m;

                public C33413a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f91184l = obj;
                    this.f91185m |= Integer.MIN_VALUE;
                    return C33412a.this.emit(null, this);
                }
            }

            public C33412a(FlowCollector flowCollector) {
                this.f91183b = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // ge.FlowCollector
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ge.Transform.C33411a.C33412a.C33413a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ge.w$a$a$a r0 = (ge.Transform.C33411a.C33412a.C33413a) r0
                    int r1 = r0.f91185m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f91185m = r1
                    goto L18
                L13:
                    ge.w$a$a$a r0 = new ge.w$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f91184l
                    java.lang.Object r1 = sd.C42683b.m6964e()
                    int r2 = r0.f91185m
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p804nd.C38508r.m14539b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p804nd.C38508r.m14539b(r6)
                    ge.i r6 = r4.f91183b
                    if (r5 == 0) goto L41
                    r0.f91185m = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    kotlin.Unit r5 = kotlin.Unit.f99208a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ge.Transform.C33411a.C33412a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public C33411a(InterfaceC33327h interfaceC33327h) {
            this.f91182b = interfaceC33327h;
        }

        @Override // ge.InterfaceC33327h
        @Nullable
        public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
            Object m6959e;
            Object collect = this.f91182b.collect(new C33412a(flowCollector), continuation);
            m6959e = C42688d.m6959e();
            if (collect == m6959e) {
                return collect;
            }
            return Unit.f99208a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata
    /* renamed from: ge.w$b */
    /* loaded from: classes8.dex */
    public static final class C33414b<T> implements InterfaceC33327h<T> {

        /* renamed from: b */
        final /* synthetic */ InterfaceC33327h f91187b;

        /* renamed from: c */
        final /* synthetic */ Function2 f91188c;

        /* compiled from: Emitters.kt */
        @Metadata
        /* renamed from: ge.w$b$a */
        /* loaded from: classes8.dex */
        public static final class C33415a<T> implements FlowCollector {

            /* renamed from: b */
            final /* synthetic */ FlowCollector f91189b;

            /* renamed from: c */
            final /* synthetic */ Function2 f91190c;

            /* compiled from: Emitters.kt */
            @DebugMetadata(m17095c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m17094f = "Transform.kt", m17093l = {223, 224}, m17092m = "emit")
            @Metadata
            /* renamed from: ge.w$b$a$a */
            /* loaded from: classes8.dex */
            public static final class C33416a extends AbstractC37589d {

                /* renamed from: l */
                /* synthetic */ Object f91191l;

                /* renamed from: m */
                int f91192m;

                /* renamed from: o */
                Object f91194o;

                /* renamed from: p */
                Object f91195p;

                public C33416a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f91191l = obj;
                    this.f91192m |= Integer.MIN_VALUE;
                    return C33415a.this.emit(null, this);
                }
            }

            public C33415a(FlowCollector flowCollector, Function2 function2) {
                this.f91189b = flowCollector;
                this.f91190c = function2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
            @Override // ge.FlowCollector
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ge.Transform.C33414b.C33415a.C33416a
                    if (r0 == 0) goto L13
                    r0 = r7
                    ge.w$b$a$a r0 = (ge.Transform.C33414b.C33415a.C33416a) r0
                    int r1 = r0.f91192m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f91192m = r1
                    goto L18
                L13:
                    ge.w$b$a$a r0 = new ge.w$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f91191l
                    java.lang.Object r1 = sd.C42683b.m6964e()
                    int r2 = r0.f91192m
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p804nd.C38508r.m14539b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f91195p
                    ge.i r6 = (ge.FlowCollector) r6
                    java.lang.Object r2 = r0.f91194o
                    p804nd.C38508r.m14539b(r7)
                    goto L5c
                L3e:
                    p804nd.C38508r.m14539b(r7)
                    ge.i r7 = r5.f91189b
                    kotlin.jvm.functions.Function2 r2 = r5.f91190c
                    r0.f91194o = r6
                    r0.f91195p = r7
                    r0.f91192m = r4
                    r4 = 6
                    kotlin.jvm.internal.InlineMarker.m17016c(r4)
                    java.lang.Object r2 = r2.mo105910invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.InlineMarker.m17016c(r4)
                    if (r2 != r1) goto L5a
                    return r1
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f91194o = r7
                    r0.f91195p = r7
                    r0.f91192m = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                    return r1
                L6a:
                    kotlin.Unit r6 = kotlin.Unit.f99208a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ge.Transform.C33414b.C33415a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public C33414b(InterfaceC33327h interfaceC33327h, Function2 function2) {
            this.f91187b = interfaceC33327h;
            this.f91188c = function2;
        }

        @Override // ge.InterfaceC33327h
        @Nullable
        public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
            Object m6959e;
            Object collect = this.f91187b.collect(new C33415a(flowCollector, this.f91188c), continuation);
            m6959e = C42688d.m6959e();
            if (collect == m6959e) {
                return collect;
            }
            return Unit.f99208a;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final <T> InterfaceC33327h<T> m23991a(@NotNull InterfaceC33327h<? extends T> interfaceC33327h) {
        return new C33411a(interfaceC33327h);
    }

    @NotNull
    /* renamed from: b */
    public static final <T> InterfaceC33327h<T> m23990b(@NotNull InterfaceC33327h<? extends T> interfaceC33327h, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C33414b(interfaceC33327h, function2);
    }
}
