package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a70;
import com.yandex.mobile.ads.impl.s70;
import ge.C33329j;
import ge.FlowCollector;
import ge.InterfaceC33327h;
import ge.InterfaceC33420y;
import ge.StateFlow;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* loaded from: classes8.dex */
public final class b80 {
    @NotNull

    /* renamed from: a */
    private final C30359g3 f77171a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC33420y<a70> f77172b;
    @NotNull

    /* renamed from: c */
    private final CoroutineScope f77173c;
    @Nullable

    /* renamed from: d */
    private InterfaceC31475tr f77174d;
    @NotNull

    /* renamed from: e */
    private final StateFlow<z70> f77175e;
    @NotNull

    /* renamed from: f */
    private final AtomicInteger f77176f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @DebugMetadata(m17095c = "com.monetization.ads.feed.ui.FeedViewModel$observeLoadingState$1", m17094f = "FeedViewModel.kt", m17093l = {93}, m17092m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.b80$a */
    /* loaded from: classes8.dex */
    public static final class C29998a extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f77177b;

        /* renamed from: c */
        private /* synthetic */ Object f77178c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.yandex.mobile.ads.impl.b80$a$a */
        /* loaded from: classes8.dex */
        public static final class C29999a extends Lambda implements Function1<z70, s70> {

            /* renamed from: b */
            public static final C29999a f77180b = new C29999a();

            C29999a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final s70 invoke(z70 z70Var) {
                z70 z70Var2 = z70Var;
                Intrinsics.checkNotNullParameter(z70Var2, "<name for destructuring parameter 0>");
                return z70Var2.m26328a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.yandex.mobile.ads.impl.b80$a$b */
        /* loaded from: classes8.dex */
        public static final class C30000b<T> implements FlowCollector {

            /* renamed from: a */
            final /* synthetic */ b80 f77181a;

            /* renamed from: b */
            final /* synthetic */ CoroutineScope f77182b;

            C30000b(b80 b80Var, CoroutineScope coroutineScope) {
                this.f77181a = b80Var;
                this.f77182b = coroutineScope;
            }

            @Override // ge.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                z70 z70Var = (z70) obj;
                s70 m26326c = z70Var.m26326c();
                if (m26326c instanceof s70.C31333a) {
                    C31082p3 m29845a = ((s70.C31333a) z70Var.m26326c()).m29845a();
                    InterfaceC31475tr m35571b = this.f77181a.m35571b();
                    if (m35571b != null) {
                        m35571b.mo29076a(m29845a);
                    }
                    C37785p0.m16127e(this.f77182b, m29845a.m30848d(), null, 2, null);
                } else if (m26326c instanceof s70.C31335c) {
                    InterfaceC31475tr m35571b2 = this.f77181a.m35571b();
                    if (m35571b2 != null) {
                        m35571b2.onAdLoaded();
                    }
                } else if (!(m26326c instanceof s70.C31334b)) {
                    boolean z = m26326c instanceof s70.C31336d;
                }
                return Unit.f99208a;
            }
        }

        C29998a(Continuation<? super C29998a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C29998a c29998a = new C29998a(continuation);
            c29998a.f77178c = obj;
            return c29998a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public final Object mo105910invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            C29998a c29998a = new C29998a(continuation);
            c29998a.f77178c = coroutineScope;
            return c29998a.invokeSuspend(Unit.f99208a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object m6959e;
            m6959e = C42688d.m6959e();
            int i = this.f77177b;
            if (i != 0) {
                if (i == 1) {
                    C38508r.m14539b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C38508r.m14539b(obj);
                InterfaceC33327h m24084q = C33329j.m24084q(b80.this.m35570c(), C29999a.f77180b);
                C30000b c30000b = new C30000b(b80.this, (CoroutineScope) this.f77178c);
                this.f77177b = 1;
                if (m24084q.collect(c30000b, this) == m6959e) {
                    return m6959e;
                }
            }
            return Unit.f99208a;
        }
    }

    @DebugMetadata(m17095c = "com.monetization.ads.feed.ui.FeedViewModel$onFeedItemVisible$1", m17094f = "FeedViewModel.kt", m17093l = {86}, m17092m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.b80$b */
    /* loaded from: classes8.dex */
    static final class C30001b extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f77183b;

        C30001b(Continuation<? super C30001b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C30001b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public final Object mo105910invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new C30001b(continuation).invokeSuspend(Unit.f99208a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object m6959e;
            m6959e = C42688d.m6959e();
            int i = this.f77183b;
            if (i != 0) {
                if (i == 1) {
                    C38508r.m14539b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C38508r.m14539b(obj);
                InterfaceC33420y interfaceC33420y = b80.this.f77172b;
                a70.C29923a c29923a = a70.C29923a.f76729a;
                this.f77183b = 1;
                if (interfaceC33420y.emit(c29923a, this) == m6959e) {
                    return m6959e;
                }
            }
            return Unit.f99208a;
        }
    }

    @DebugMetadata(m17095c = "com.monetization.ads.feed.ui.FeedViewModel$preloadAd$1", m17094f = "FeedViewModel.kt", m17093l = {77}, m17092m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.b80$c */
    /* loaded from: classes8.dex */
    static final class C30002c extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f77185b;

        C30002c(Continuation<? super C30002c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C30002c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public final Object mo105910invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new C30002c(continuation).invokeSuspend(Unit.f99208a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object m6959e;
            m6959e = C42688d.m6959e();
            int i = this.f77185b;
            if (i != 0) {
                if (i == 1) {
                    C38508r.m14539b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C38508r.m14539b(obj);
                InterfaceC33420y interfaceC33420y = b80.this.f77172b;
                a70.C29923a c29923a = a70.C29923a.f76729a;
                this.f77185b = 1;
                if (interfaceC33420y.emit(c29923a, this) == m6959e) {
                    return m6959e;
                }
            }
            return Unit.f99208a;
        }
    }

    public b80(@NotNull Context appContext, @NotNull gh2 sdkEnvironmentModule, @NotNull C30705k7 adRequestData, @NotNull y60 divContextProvider, @NotNull z60 divViewPreloader, @NotNull C30359g3 adConfiguration, @NotNull InterfaceC33420y feedInputEventFlow, @NotNull k70 feedItemLoadControllerCreator, @NotNull l70 feedItemLoadDataSource, @NotNull p70 feedItemPreloadDataSource, @NotNull dx0 memoryUtils, @NotNull m70 loadEnoughMemoryValidator, @NotNull r70 feedItemsRepository, @NotNull h70 feedItemListUseCase, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(divContextProvider, "divContextProvider");
        Intrinsics.checkNotNullParameter(divViewPreloader, "divViewPreloader");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(feedInputEventFlow, "feedInputEventFlow");
        Intrinsics.checkNotNullParameter(feedItemLoadControllerCreator, "feedItemLoadControllerCreator");
        Intrinsics.checkNotNullParameter(feedItemLoadDataSource, "feedItemLoadDataSource");
        Intrinsics.checkNotNullParameter(feedItemPreloadDataSource, "feedItemPreloadDataSource");
        Intrinsics.checkNotNullParameter(memoryUtils, "memoryUtils");
        Intrinsics.checkNotNullParameter(loadEnoughMemoryValidator, "loadEnoughMemoryValidator");
        Intrinsics.checkNotNullParameter(feedItemsRepository, "feedItemsRepository");
        Intrinsics.checkNotNullParameter(feedItemListUseCase, "feedItemListUseCase");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f77171a = adConfiguration;
        this.f77172b = feedInputEventFlow;
        this.f77173c = coroutineScope;
        this.f77175e = feedItemListUseCase.m33601a();
        this.f77176f = new AtomicInteger(-1);
        m35568e();
    }

    /* renamed from: e */
    private final void m35568e() {
        C37756k.m16221d(this.f77173c, null, null, new C29998a(null), 3, null);
    }

    @Nullable
    /* renamed from: b */
    public final InterfaceC31475tr m35571b() {
        return this.f77174d;
    }

    @NotNull
    /* renamed from: c */
    public final StateFlow<z70> m35570c() {
        return this.f77175e;
    }

    @NotNull
    /* renamed from: d */
    public final AtomicInteger m35569d() {
        return this.f77176f;
    }

    /* renamed from: f */
    public final void m35567f() {
        if (!(!this.f77175e.getValue().m26327b().isEmpty()) && this.f77176f.get() == -1 && (!(this.f77175e.getValue().m26326c() instanceof s70.C31333a))) {
            this.f77176f.getAndIncrement();
            C37756k.m16221d(this.f77173c, null, null, new C30002c(null), 3, null);
            return;
        }
        C31082p3 m32319r = C30774l7.m32319r();
        InterfaceC31475tr interfaceC31475tr = this.f77174d;
        if (interfaceC31475tr != null) {
            interfaceC31475tr.mo29076a(m32319r);
        }
    }

    @NotNull
    /* renamed from: a */
    public final C30359g3 m35575a() {
        return this.f77171a;
    }

    /* renamed from: a */
    public final void m35574a(int i) {
        if ((!(this.f77175e.getValue().m26326c() instanceof s70.C31333a)) && i == this.f77176f.get()) {
            this.f77176f.getAndIncrement();
            C37756k.m16221d(this.f77173c, null, null, new C30001b(null), 3, null);
        }
    }

    /* renamed from: a */
    public final void m35572a(@Nullable q60 q60Var) {
        this.f77174d = q60Var;
    }
}
