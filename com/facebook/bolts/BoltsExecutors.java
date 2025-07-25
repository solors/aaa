package com.facebook.bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* compiled from: BoltsExecutors.kt */
@Metadata
/* loaded from: classes2.dex */
public final class BoltsExecutors {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final BoltsExecutors INSTANCE = new BoltsExecutors();
    @NotNull
    private final ExecutorService background;
    @NotNull
    private final Executor immediate;
    @NotNull
    private final ScheduledExecutorService scheduled;

    /* compiled from: BoltsExecutors.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAndroidRuntime() {
            boolean m16592R;
            String property = System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = property.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            m16592R = C37690r.m16592R(lowerCase, "android", false, 2, null);
            return m16592R;
        }

        @NotNull
        public final ExecutorService background() {
            return BoltsExecutors.INSTANCE.background;
        }

        @NotNull
        public final Executor immediate$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.immediate;
        }

        @NotNull
        public final ScheduledExecutorService scheduled$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.scheduled;
        }
    }

    /* compiled from: BoltsExecutors.kt */
    @Metadata
    /* loaded from: classes2.dex */
    private static final class ImmediateExecutor implements Executor {
        @NotNull

        /* renamed from: c */
        public static final Companion f24607c = new Companion(null);
        @NotNull

        /* renamed from: b */
        private final ThreadLocal<Integer> f24608b = new ThreadLocal<>();

        /* compiled from: BoltsExecutors.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        private final int m78801a() {
            Integer num = this.f24608b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f24608b.remove();
            } else {
                this.f24608b.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        private final int m78800b() {
            Integer num = this.f24608b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f24608b.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            try {
                if (m78800b() <= 15) {
                    command.run();
                } else {
                    BoltsExecutors.Companion.background().execute(command);
                }
            } finally {
                m78801a();
            }
        }
    }

    private BoltsExecutors() {
        ExecutorService newCachedThreadPool;
        if (!Companion.isAndroidRuntime()) {
            newCachedThreadPool = Executors.newCachedThreadPool();
            Intrinsics.checkNotNullExpressionValue(newCachedThreadPool, "newCachedThreadPool()");
        } else {
            newCachedThreadPool = AndroidExecutors.Companion.newCachedThreadPool();
        }
        this.background = newCachedThreadPool;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.scheduled = newSingleThreadScheduledExecutor;
        this.immediate = new ImmediateExecutor();
    }

    @NotNull
    public static final ExecutorService background() {
        return Companion.background();
    }
}
