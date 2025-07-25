package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork;
import com.monetization.ads.mediation.base.C25606a;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37734i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* loaded from: classes8.dex */
public final class mg1 {
    @NotNull

    /* renamed from: a */
    private final bv0<C25606a> f82184a;
    @NotNull

    /* renamed from: b */
    private final ig1 f82185b;
    @NotNull

    /* renamed from: c */
    private final jg1 f82186c;
    @NotNull

    /* renamed from: d */
    private final CoroutineContext f82187d;
    @NotNull

    /* renamed from: e */
    private final CoroutineContext f82188e;

    @DebugMetadata(m17095c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationData$2", m17094f = "PrefetchedMediationNetworksDataLoader.kt", m17093l = {46}, m17092m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.mg1$a */
    /* loaded from: classes8.dex */
    static final class C30853a extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super eg1>, Object> {

        /* renamed from: b */
        int f82189b;

        /* renamed from: c */
        final /* synthetic */ mg1 f82190c;

        /* renamed from: d */
        final /* synthetic */ Context f82191d;

        /* renamed from: e */
        final /* synthetic */ qu1 f82192e;

        /* renamed from: f */
        final /* synthetic */ List<MediationPrefetchNetwork> f82193f;

        /* renamed from: g */
        final /* synthetic */ long f82194g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30853a(long j, Context context, qu1 qu1Var, mg1 mg1Var, List list, Continuation continuation) {
            super(2, continuation);
            this.f82190c = mg1Var;
            this.f82191d = context;
            this.f82192e = qu1Var;
            this.f82193f = list;
            this.f82194g = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            mg1 mg1Var = this.f82190c;
            return new C30853a(this.f82194g, this.f82191d, this.f82192e, mg1Var, this.f82193f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public final Object mo105910invoke(CoroutineScope coroutineScope, Continuation<? super eg1> continuation) {
            return ((C30853a) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object m6959e;
            m6959e = C42688d.m6959e();
            int i = this.f82189b;
            if (i != 0) {
                if (i == 1) {
                    C38508r.m14539b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C38508r.m14539b(obj);
                mg1 mg1Var = this.f82190c;
                Context context = this.f82191d;
                qu1 qu1Var = this.f82192e;
                List<MediationPrefetchNetwork> list = this.f82193f;
                long j = this.f82194g;
                this.f82189b = 1;
                obj = mg1.m32008a(j, context, qu1Var, mg1Var, list, this);
                if (obj == m6959e) {
                    return m6959e;
                }
            }
            return obj;
        }
    }

    public /* synthetic */ mg1(fv0 fv0Var) {
        this(fv0Var, new bv0(fv0Var), new ig1(), new jg1(), Dispatchers.m16376c().getImmediate(), op0.m30953b());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m32008a(long r14, android.content.Context r16, com.yandex.mobile.ads.impl.qu1 r17, com.yandex.mobile.ads.impl.mg1 r18, java.util.List r19, kotlin.coroutines.Continuation r20) {
        /*
            r8 = r18
            r0 = r20
            r18.getClass()
            boolean r1 = r0 instanceof com.yandex.mobile.ads.impl.ng1
            if (r1 == 0) goto L1a
            r1 = r0
            com.yandex.mobile.ads.impl.ng1 r1 = (com.yandex.mobile.ads.impl.ng1) r1
            int r2 = r1.f82780e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.f82780e = r2
            goto L1f
        L1a:
            com.yandex.mobile.ads.impl.ng1 r1 = new com.yandex.mobile.ads.impl.ng1
            r1.<init>(r8, r0)
        L1f:
            r9 = r1
            java.lang.Object r0 = r9.f82778c
            java.lang.Object r10 = sd.C42683b.m6964e()
            int r1 = r9.f82780e
            r11 = 2
            r12 = 1
            if (r1 == 0) goto L42
            if (r1 == r12) goto L3c
            if (r1 != r11) goto L34
            p804nd.C38508r.m14539b(r0)
            goto L76
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            com.yandex.mobile.ads.impl.mg1 r1 = r9.f82777b
            p804nd.C38508r.m14539b(r0)
            goto L61
        L42:
            p804nd.C38508r.m14539b(r0)
            com.yandex.mobile.ads.impl.og1 r13 = new com.yandex.mobile.ads.impl.og1
            r7 = 0
            r0 = r13
            r1 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r9.f82777b = r8
            r9.f82780e = r12
            java.lang.Object r0 = kotlinx.coroutines.C37785p0.m16125g(r13, r9)
            if (r0 != r10) goto L60
            goto L7d
        L60:
            r1 = r8
        L61:
            java.util.List r0 = (java.util.List) r0
            kotlin.coroutines.CoroutineContext r1 = r1.f82188e
            com.yandex.mobile.ads.impl.pg1 r2 = new com.yandex.mobile.ads.impl.pg1
            r3 = 0
            r2.<init>(r0, r3)
            r9.f82777b = r3
            r9.f82780e = r11
            java.lang.Object r0 = kotlinx.coroutines.C37734i.m16317g(r1, r2, r9)
            if (r0 != r10) goto L76
            goto L7d
        L76:
            java.util.List r0 = (java.util.List) r0
            com.yandex.mobile.ads.impl.eg1 r10 = new com.yandex.mobile.ads.impl.eg1
            r10.<init>(r0)
        L7d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mg1.m32008a(long, android.content.Context, com.yandex.mobile.ads.impl.qu1, com.yandex.mobile.ads.impl.mg1, java.util.List, kotlin.coroutines.d):java.lang.Object");
    }

    public mg1(@NotNull fv0 mediatedAdapterReporter, @NotNull bv0<C25606a> mediatedAdapterCreator, @NotNull ig1 prefetchedMediationNetworkDataLoader, @NotNull jg1 prefetchedMediationNetworkMapper, @NotNull CoroutineContext mainThreadContext, @NotNull CoroutineContext loadingContext) {
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediatedAdapterCreator, "mediatedAdapterCreator");
        Intrinsics.checkNotNullParameter(prefetchedMediationNetworkDataLoader, "prefetchedMediationNetworkDataLoader");
        Intrinsics.checkNotNullParameter(prefetchedMediationNetworkMapper, "prefetchedMediationNetworkMapper");
        Intrinsics.checkNotNullParameter(mainThreadContext, "mainThreadContext");
        Intrinsics.checkNotNullParameter(loadingContext, "loadingContext");
        this.f82184a = mediatedAdapterCreator;
        this.f82185b = prefetchedMediationNetworkDataLoader;
        this.f82186c = prefetchedMediationNetworkMapper;
        this.f82187d = mainThreadContext;
        this.f82188e = loadingContext;
    }

    @WorkerThread
    @Nullable
    /* renamed from: a */
    public final Object m32007a(@NotNull Context context, @Nullable qu1 qu1Var, @NotNull List<MediationPrefetchNetwork> list, long j, @NotNull Continuation<? super eg1> continuation) {
        return C37734i.m16317g(this.f82187d, new C30853a(j, context, qu1Var, this, list, null), continuation);
    }
}
