package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C19897f5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    private static volatile NetworkServiceLocator f95886b;

    /* renamed from: a */
    private final NetworkCore f95887a;

    @Metadata
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f95886b;
            if (networkServiceLocator == null) {
                Intrinsics.m17056y(C19897f5.f50013o);
                return null;
            }
            return networkServiceLocator;
        }

        @AnyThread
        public final void init() {
            if (NetworkServiceLocator.f95886b == null) {
                synchronized (NetworkServiceLocator.class) {
                    if (NetworkServiceLocator.f95886b == null) {
                        NetworkServiceLocator.f95886b = new NetworkServiceLocator();
                    }
                    Unit unit = Unit.f99208a;
                }
            }
        }

        private Companion() {
        }

        @VisibleForTesting
        public final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f95886b = networkServiceLocator;
        }
    }

    @AnyThread
    @VisibleForTesting
    public NetworkServiceLocator() {
        NetworkCore networkCore = new NetworkCore();
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f95887a = networkCore;
    }

    @NotNull
    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    @AnyThread
    public static final void init() {
        Companion.init();
    }

    @NotNull
    public final NetworkCore getNetworkCore() {
        return this.f95887a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f95887a.stopTasks();
    }

    @VisibleForTesting
    public static final void init(@NotNull NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }
}
