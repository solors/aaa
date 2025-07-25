package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.connectivity.IConnectivityListener;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

/* compiled from: InitializeStateNetworkError.kt */
@Metadata
/* loaded from: classes7.dex */
public final class InitializeStateNetworkError extends MetricTask<Params, Unit> implements IConnectivityListener {
    private int connectedEventThreshold;
    @Nullable
    private Continuation<? super Unit> continuation;
    @NotNull
    private final ISDKDispatchers dispatchers;
    private long lastConnectedEventTimeMs;
    private int maximumConnectedEvents;
    private int receivedConnectedEvents;

    /* compiled from: InitializeStateNetworkError.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Params implements BaseParams {
        @NotNull
        private final Configuration config;

        public Params(@NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        @NotNull
        public final Configuration component1() {
            return this.config;
        }

        @NotNull
        public final Params copy(@NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return new Params(config);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Params) && Intrinsics.m17075f(this.config, ((Params) obj).config)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @NotNull
        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateNetworkError(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
        this.maximumConnectedEvents = 500;
        this.connectedEventThreshold = 10000;
    }

    private final boolean shouldHandleConnectedEvent() {
        if (System.currentTimeMillis() - this.lastConnectedEventTimeMs >= this.connectedEventThreshold && this.receivedConnectedEvents <= this.maximumConnectedEvents) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListening(Continuation<? super Unit> continuation) {
        this.continuation = continuation;
        ConnectivityMonitor.addListener(this);
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo110264doWorkgIAlus(BaseParams baseParams, Continuation continuation) {
        return m110279doWorkgIAlus((Params) baseParams, (Continuation<? super Result<Unit>>) continuation);
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("error_network");
    }

    @Override // com.unity3d.services.core.connectivity.IConnectivityListener
    public void onConnected() {
        this.receivedConnectedEvents++;
        DeviceLog.debug("Unity Ads init got connected event");
        if (shouldHandleConnectedEvent()) {
            Continuation<? super Unit> continuation = this.continuation;
            if (continuation != null) {
                Result.C38506a c38506a = Result.f101870c;
                continuation.resumeWith(Result.m14549b(Unit.f99208a));
            }
            this.continuation = null;
        }
        if (this.receivedConnectedEvents > this.maximumConnectedEvents) {
            ConnectivityMonitor.removeListener(this);
        }
        this.lastConnectedEventTimeMs = System.currentTimeMillis();
    }

    @Override // com.unity3d.services.core.connectivity.IConnectivityListener
    public void onDisconnected() {
        DeviceLog.debug("Unity Ads init got disconnected event");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m110279doWorkgIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super p804nd.Result<kotlin.Unit>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p804nd.C38508r.m14539b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            p804nd.C38508r.m14539b(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            kotlinx.coroutines.k0 r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.C37734i.m16317g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            nd.q r7 = (p804nd.Result) r7
            java.lang.Object r6 = r7.m14541j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateNetworkError.m110279doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateNetworkError$Params, kotlin.coroutines.d):java.lang.Object");
    }
}
