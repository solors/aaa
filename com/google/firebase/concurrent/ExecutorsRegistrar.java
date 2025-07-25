package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes4.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    static final Lazy<ScheduledExecutorService> f42167a = new Lazy<>(new Provider() { // from class: com.google.firebase.concurrent.s
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService m67269p;
            m67269p = ExecutorsRegistrar.m67269p();
            return m67269p;
        }
    });

    /* renamed from: b */
    static final Lazy<ScheduledExecutorService> f42168b = new Lazy<>(new Provider() { // from class: com.google.firebase.concurrent.t
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService m67268q;
            m67268q = ExecutorsRegistrar.m67268q();
            return m67268q;
        }
    });

    /* renamed from: c */
    static final Lazy<ScheduledExecutorService> f42169c = new Lazy<>(new Provider() { // from class: com.google.firebase.concurrent.u
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService m67267r;
            m67267r = ExecutorsRegistrar.m67267r();
            return m67267r;
        }
    });

    /* renamed from: d */
    static final Lazy<ScheduledExecutorService> f42170d = new Lazy<>(new Provider() { // from class: com.google.firebase.concurrent.v
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService m67266s;
            m67266s = ExecutorsRegistrar.m67266s();
            return m67266s;
        }
    });

    /* renamed from: i */
    private static StrictMode.ThreadPolicy m67276i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    private static ThreadFactory m67275j(String str, int i) {
        return new CustomThreadFactory(str, i, null);
    }

    /* renamed from: k */
    private static ThreadFactory m67274k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new CustomThreadFactory(str, i, threadPolicy);
    }

    /* renamed from: l */
    public static /* synthetic */ ScheduledExecutorService m67273l(ComponentContainer componentContainer) {
        return f42167a.get();
    }

    /* renamed from: m */
    public static /* synthetic */ ScheduledExecutorService m67272m(ComponentContainer componentContainer) {
        return f42169c.get();
    }

    /* renamed from: n */
    public static /* synthetic */ ScheduledExecutorService m67271n(ComponentContainer componentContainer) {
        return f42168b.get();
    }

    /* renamed from: o */
    public static /* synthetic */ Executor m67270o(ComponentContainer componentContainer) {
        return UiExecutor.INSTANCE;
    }

    /* renamed from: p */
    public static /* synthetic */ ScheduledExecutorService m67269p() {
        return m67264u(Executors.newFixedThreadPool(4, m67274k("Firebase Background", 10, m67276i())));
    }

    /* renamed from: q */
    public static /* synthetic */ ScheduledExecutorService m67268q() {
        return m67264u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), m67274k("Firebase Lite", 0, m67265t())));
    }

    /* renamed from: r */
    public static /* synthetic */ ScheduledExecutorService m67267r() {
        return m67264u(Executors.newCachedThreadPool(m67275j("Firebase Blocking", 11)));
    }

    /* renamed from: s */
    public static /* synthetic */ ScheduledExecutorService m67266s() {
        return Executors.newSingleThreadScheduledExecutor(m67275j("Firebase Scheduler", 0));
    }

    /* renamed from: t */
    private static StrictMode.ThreadPolicy m67265t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    private static ScheduledExecutorService m67264u(ExecutorService executorService) {
        return new DelegatingScheduledExecutorService(executorService, f42170d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(Qualified.qualified(Background.class, ScheduledExecutorService.class), Qualified.qualified(Background.class, ExecutorService.class), Qualified.qualified(Background.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.o
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                ScheduledExecutorService m67273l;
                m67273l = ExecutorsRegistrar.m67273l(componentContainer);
                return m67273l;
            }
        }).build(), Component.builder(Qualified.qualified(Blocking.class, ScheduledExecutorService.class), Qualified.qualified(Blocking.class, ExecutorService.class), Qualified.qualified(Blocking.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.p
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                ScheduledExecutorService m67272m;
                m67272m = ExecutorsRegistrar.m67272m(componentContainer);
                return m67272m;
            }
        }).build(), Component.builder(Qualified.qualified(Lightweight.class, ScheduledExecutorService.class), Qualified.qualified(Lightweight.class, ExecutorService.class), Qualified.qualified(Lightweight.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.q
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                ScheduledExecutorService m67271n;
                m67271n = ExecutorsRegistrar.m67271n(componentContainer);
                return m67271n;
            }
        }).build(), Component.builder(Qualified.qualified(UiThread.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.r
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Executor m67270o;
                m67270o = ExecutorsRegistrar.m67270o(componentContainer);
                return m67270o;
            }
        }).build());
    }
}
