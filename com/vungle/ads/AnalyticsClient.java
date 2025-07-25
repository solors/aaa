package com.vungle.ads;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.C29518o;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.o */
/* loaded from: classes7.dex */
public final class AnalyticsClient {
    @NotNull
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();
    @NotNull
    private static final String TAG;
    @NotNull
    private static final BlockingQueue<Sdk$SDKError.C29424a> errors;
    @Nullable
    private static VungleThreadPoolExecutor executor = null;
    @NotNull
    private static EnumC29545a logLevel = null;
    private static final int maxBatchSize = 20;
    @NotNull
    private static final BlockingQueue<Sdk$SDKMetric.C29429a> metrics;
    private static boolean metricsEnabled = false;
    private static boolean paused = false;
    @NotNull
    private static final BlockingQueue<Sdk$SDKError.C29424a> pendingErrors;
    @NotNull
    private static final BlockingQueue<Sdk$SDKMetric.C29429a> pendingMetrics;
    private static boolean refreshEnabled = false;
    private static final long refreshTimeMillis = 5000;
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static SignalManager signalManager;
    @Nullable
    private static VungleApiClient vungleApiClient;

    /* compiled from: AnalyticsClient.kt */
    @Metadata
    /* renamed from: com.vungle.ads.o$a */
    /* loaded from: classes7.dex */
    public enum EnumC29545a {
        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);
        
        @NotNull
        public static final C29546a Companion = new C29546a(null);
        private final int level;

        /* compiled from: AnalyticsClient.kt */
        @Metadata
        /* renamed from: com.vungle.ads.o$a$a */
        /* loaded from: classes7.dex */
        public static final class C29546a {
            private C29546a() {
            }

            public /* synthetic */ C29546a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final EnumC29545a fromValue(int i) {
                EnumC29545a enumC29545a = EnumC29545a.ERROR_LOG_LEVEL_DEBUG;
                if (i == enumC29545a.getLevel()) {
                    return enumC29545a;
                }
                EnumC29545a enumC29545a2 = EnumC29545a.ERROR_LOG_LEVEL_ERROR;
                if (i == enumC29545a2.getLevel()) {
                    return enumC29545a2;
                }
                EnumC29545a enumC29545a3 = EnumC29545a.ERROR_LOG_LEVEL_OFF;
                if (i == enumC29545a3.getLevel()) {
                    return enumC29545a3;
                }
                return enumC29545a2;
            }
        }

        EnumC29545a(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* compiled from: AnalyticsClient.kt */
    @Metadata
    /* renamed from: com.vungle.ads.o$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC29547b {
        void onFailure();

        void onSuccess();
    }

    /* compiled from: AnalyticsClient.kt */
    @Metadata
    /* renamed from: com.vungle.ads.o$c */
    /* loaded from: classes7.dex */
    public static final class C29548c implements InterfaceC29547b {
        final /* synthetic */ BlockingQueue<Sdk$SDKError.C29424a> $currentSendingErrors;

        C29548c(BlockingQueue<Sdk$SDKError.C29424a> blockingQueue) {
            this.$currentSendingErrors = blockingQueue;
        }

        @Override // com.vungle.ads.AnalyticsClient.InterfaceC29547b
        public void onFailure() {
            C29518o.C29519a c29519a = C29518o.Companion;
            String str = AnalyticsClient.TAG;
            c29519a.m37468d(str, "Failed to send " + this.$currentSendingErrors.size() + " errors");
            AnalyticsClient.INSTANCE.getErrors$vungle_ads_release().addAll(this.$currentSendingErrors);
        }

        @Override // com.vungle.ads.AnalyticsClient.InterfaceC29547b
        public void onSuccess() {
            C29518o.C29519a c29519a = C29518o.Companion;
            String str = AnalyticsClient.TAG;
            c29519a.m37468d(str, "Sent " + this.$currentSendingErrors.size() + " errors");
        }
    }

    /* compiled from: AnalyticsClient.kt */
    @Metadata
    /* renamed from: com.vungle.ads.o$d */
    /* loaded from: classes7.dex */
    public static final class C29549d implements InterfaceC29547b {
        final /* synthetic */ BlockingQueue<Sdk$SDKMetric.C29429a> $currentSendingMetrics;

        C29549d(BlockingQueue<Sdk$SDKMetric.C29429a> blockingQueue) {
            this.$currentSendingMetrics = blockingQueue;
        }

        @Override // com.vungle.ads.AnalyticsClient.InterfaceC29547b
        public void onFailure() {
            C29518o.C29519a c29519a = C29518o.Companion;
            String str = AnalyticsClient.TAG;
            c29519a.m37468d(str, "Failed to send " + this.$currentSendingMetrics.size() + " metrics");
            AnalyticsClient.INSTANCE.getMetrics$vungle_ads_release().addAll(this.$currentSendingMetrics);
        }

        @Override // com.vungle.ads.AnalyticsClient.InterfaceC29547b
        public void onSuccess() {
            C29518o.C29519a c29519a = C29518o.Companion;
            String str = AnalyticsClient.TAG;
            c29519a.m37468d(str, "Sent " + this.$currentSendingMetrics.size() + " metrics");
        }
    }

    /* compiled from: AnalyticsClient.kt */
    @Metadata
    /* renamed from: com.vungle.ads.o$e */
    /* loaded from: classes7.dex */
    public static final class C29550e extends ActivityManager.C29505c {
        C29550e() {
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.C29505c
        public void onPause() {
            super.onPause();
            AnalyticsClient.INSTANCE.pause();
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.C29505c
        public void onResume() {
            super.onResume();
            AnalyticsClient.INSTANCE.resume();
        }
    }

    static {
        String simpleName = AnalyticsClient.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "AnalyticsClient::class.java.simpleName");
        TAG = simpleName;
        errors = new LinkedBlockingQueue();
        metrics = new LinkedBlockingQueue();
        pendingErrors = new LinkedBlockingQueue();
        pendingMetrics = new LinkedBlockingQueue();
        logLevel = EnumC29545a.ERROR_LOG_LEVEL_ERROR;
        refreshEnabled = true;
    }

    private AnalyticsClient() {
    }

    @WorkerThread
    private final void flushErrors() {
        VungleApiClient vungleApiClient2;
        C29518o.C29519a c29519a = C29518o.Companion;
        String str = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk$SDKError.C29424a> blockingQueue = errors;
        sb2.append(blockingQueue.size());
        sb2.append(" errors");
        c29519a.m37468d(str, sb2.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (!linkedBlockingQueue.isEmpty() && (vungleApiClient2 = vungleApiClient) != null) {
            vungleApiClient2.reportErrors(linkedBlockingQueue, new C29548c(linkedBlockingQueue));
        }
    }

    @WorkerThread
    private final void flushMetrics() {
        VungleApiClient vungleApiClient2;
        C29518o.C29519a c29519a = C29518o.Companion;
        String str = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        BlockingQueue<Sdk$SDKMetric.C29429a> blockingQueue = metrics;
        sb2.append(blockingQueue.size());
        sb2.append(" metrics");
        c29519a.m37468d(str, sb2.toString());
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        blockingQueue.drainTo(linkedBlockingQueue);
        if (!linkedBlockingQueue.isEmpty() && (vungleApiClient2 = vungleApiClient) != null) {
            vungleApiClient2.reportMetrics(linkedBlockingQueue, new C29549d(linkedBlockingQueue));
        }
    }

    private final Sdk$SDKMetric.C29429a genMetric(Sdk$SDKMetric.EnumC29430b enumC29430b, long j, String str, String str2, String str3, String str4) {
        String uuid;
        Sdk$SDKMetric.C29429a osVersion = Sdk$SDKMetric.newBuilder().setType(enumC29430b).setValue(j).setMake(Build.MANUFACTURER).setModel(Build.MODEL).setOs("Android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str5 = "";
        if (str == null) {
            str = "";
        }
        Sdk$SDKMetric.C29429a placementReferenceId = osVersion.setPlacementReferenceId(str);
        if (str2 == null) {
            str2 = "";
        }
        Sdk$SDKMetric.C29429a creativeId = placementReferenceId.setCreativeId(str2);
        if (str3 == null) {
            str3 = "";
        }
        Sdk$SDKMetric.C29429a eventId = creativeId.setEventId(str3);
        if (str4 == null) {
            str4 = "";
        }
        Sdk$SDKMetric.C29429a meta = eventId.setMeta(str4);
        SignalManager signalManager2 = signalManager;
        if (signalManager2 != null && (uuid = signalManager2.getUuid()) != null) {
            str5 = uuid;
        }
        Sdk$SDKMetric.C29429a sessionId = meta.setSessionId(str5);
        Intrinsics.checkNotNullExpressionValue(sessionId, "newBuilder()\n           …ignalManager?.uuid ?: \"\")");
        return sessionId;
    }

    static /* synthetic */ Sdk$SDKMetric.C29429a genMetric$default(AnalyticsClient analyticsClient, Sdk$SDKMetric.EnumC29430b enumC29430b, long j, String str, String str2, String str3, String str4, int i, Object obj) {
        long j2;
        String str5;
        String str6;
        String str7;
        if ((i & 2) != 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        String str8 = null;
        if ((i & 4) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i & 8) != 0) {
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 16) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 32) == 0) {
            str8 = str4;
        }
        return analyticsClient.genMetric(enumC29430b, j2, str5, str6, str7, str8);
    }

    private final Sdk$SDKError.C29424a genSDKError(Sdk$SDKError.EnumC29425b enumC29425b, String str, String str2, String str3, String str4) {
        String uuid;
        Sdk$SDKError.C29424a at = Sdk$SDKError.newBuilder().setOs("Android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(Build.MANUFACTURER).setModel(Build.MODEL).setReason(enumC29425b).setMessage(str).setAt(System.currentTimeMillis());
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        Sdk$SDKError.C29424a placementReferenceId = at.setPlacementReferenceId(str2);
        if (str3 == null) {
            str3 = "";
        }
        Sdk$SDKError.C29424a creativeId = placementReferenceId.setCreativeId(str3);
        if (str4 == null) {
            str4 = "";
        }
        Sdk$SDKError.C29424a eventId = creativeId.setEventId(str4);
        SignalManager signalManager2 = signalManager;
        if (signalManager2 != null && (uuid = signalManager2.getUuid()) != null) {
            str5 = uuid;
        }
        Sdk$SDKError.C29424a sessionId = eventId.setSessionId(str5);
        Intrinsics.checkNotNullExpressionValue(sessionId, "newBuilder()\n           …ignalManager?.uuid ?: \"\")");
        return sessionId;
    }

    static /* synthetic */ Sdk$SDKError.C29424a genSDKError$default(AnalyticsClient analyticsClient, Sdk$SDKError.EnumC29425b enumC29425b, String str, String str2, String str3, String str4, int i, Object obj) {
        String str5;
        String str6;
        String str7;
        if ((i & 4) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 8) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 16) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        return analyticsClient.genSDKError(enumC29425b, str, str5, str6, str7);
    }

    /* renamed from: init$lambda-1 */
    public static final void m110406init$lambda1(VungleThreadPoolExecutor executor2) {
        Intrinsics.checkNotNullParameter(executor2, "$executor");
        executor2.execute(new Runnable() { // from class: com.vungle.ads.k
            @Override // java.lang.Runnable
            public final void run() {
                AnalyticsClient.m110407init$lambda1$lambda0();
            }
        });
    }

    /* renamed from: init$lambda-1$lambda-0 */
    public static final void m110407init$lambda1$lambda0() {
        INSTANCE.report();
    }

    /* renamed from: logError$lambda-2 */
    public static final void m110408logError$lambda2(Sdk$SDKError.EnumC29425b reason, String message, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(reason, "$reason");
        Intrinsics.checkNotNullParameter(message, "$message");
        INSTANCE.logErrorInSameThread(reason, message, str, str2, str3);
    }

    private final synchronized void logErrorInSameThread(Sdk$SDKError.EnumC29425b enumC29425b, String str, String str2, String str3, String str4) {
        if (logLevel == EnumC29545a.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            Sdk$SDKError.C29424a genSDKError = genSDKError(enumC29425b, str, str2, str3, str4);
            BlockingQueue<Sdk$SDKError.C29424a> blockingQueue = errors;
            blockingQueue.put(genSDKError);
            C29518o.C29519a c29519a = C29518o.Companion;
            String str5 = TAG;
            c29519a.m37463w(str5, "Logging error: " + enumC29425b + " with message: " + str);
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e) {
            C29518o.Companion.m37466e(TAG, "Cannot logError", e);
        }
    }

    static /* synthetic */ void logErrorInSameThread$default(AnalyticsClient analyticsClient, Sdk$SDKError.EnumC29425b enumC29425b, String str, String str2, String str3, String str4, int i, Object obj) {
        String str5;
        String str6;
        String str7;
        if ((i & 4) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 8) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 16) != 0) {
            str7 = null;
        } else {
            str7 = str4;
        }
        analyticsClient.logErrorInSameThread(enumC29425b, str, str5, str6, str7);
    }

    /* renamed from: logMetric$lambda-3 */
    public static final void m110409logMetric$lambda3(Sdk$SDKMetric.EnumC29430b metricType, long j, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(metricType, "$metricType");
        INSTANCE.logMetricInSameThread(metricType, j, str, str2, str3, str4);
    }

    private final synchronized void logMetricInSameThread(Sdk$SDKMetric.EnumC29430b enumC29430b, long j, String str, String str2, String str3, String str4) {
        if (!metricsEnabled) {
            return;
        }
        try {
            Sdk$SDKMetric.C29429a genMetric = genMetric(enumC29430b, j, str, str2, str3, str4);
            BlockingQueue<Sdk$SDKMetric.C29429a> blockingQueue = metrics;
            blockingQueue.put(genMetric);
            C29518o.C29519a c29519a = C29518o.Companion;
            String str5 = TAG;
            c29519a.m37468d(str5, "Logging Metric " + enumC29430b + " with value " + j + " for placement " + str);
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e) {
            C29518o.Companion.m37466e(TAG, "Cannot logMetrics", e);
        }
    }

    static /* synthetic */ void logMetricInSameThread$default(AnalyticsClient analyticsClient, Sdk$SDKMetric.EnumC29430b enumC29430b, long j, String str, String str2, String str3, String str4, int i, Object obj) {
        long j2;
        String str5;
        String str6;
        String str7;
        if ((i & 2) != 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        String str8 = null;
        if ((i & 4) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i & 8) != 0) {
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 16) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i & 32) == 0) {
            str8 = str4;
        }
        analyticsClient.logMetricInSameThread(enumC29430b, j2, str5, str6, str7, str8);
    }

    private final synchronized void report() {
        if (paused) {
            return;
        }
        if (logLevel != EnumC29545a.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
            flushErrors();
        }
        if (metricsEnabled && metrics.size() > 0) {
            flushMetrics();
        }
    }

    @NotNull
    public final BlockingQueue<Sdk$SDKError.C29424a> getErrors$vungle_ads_release() {
        return errors;
    }

    @Nullable
    public final VungleThreadPoolExecutor getExecutor$vungle_ads_release() {
        return executor;
    }

    @NotNull
    public final BlockingQueue<Sdk$SDKMetric.C29429a> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    @NotNull
    public final BlockingQueue<Sdk$SDKError.C29424a> getPendingErrors$vungle_ads_release() {
        return pendingErrors;
    }

    @NotNull
    public final BlockingQueue<Sdk$SDKMetric.C29429a> getPendingMetrics$vungle_ads_release() {
        return pendingMetrics;
    }

    public final boolean getRefreshEnabled$vungle_ads_release() {
        return refreshEnabled;
    }

    @Nullable
    public final SignalManager getSignalManager$vungle_ads_release() {
        return signalManager;
    }

    @Nullable
    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    public final void init$vungle_ads_release(@NotNull VungleApiClient vungleApiClient2, @NotNull final VungleThreadPoolExecutor executor2, int i, boolean z, @NotNull SignalManager signalManager2) {
        Intrinsics.checkNotNullParameter(vungleApiClient2, "vungleApiClient");
        Intrinsics.checkNotNullParameter(executor2, "executor");
        Intrinsics.checkNotNullParameter(signalManager2, "signalManager");
        signalManager = signalManager2;
        executor = executor2;
        vungleApiClient = vungleApiClient2;
        try {
            BlockingQueue<Sdk$SDKError.C29424a> blockingQueue = pendingErrors;
            if (!blockingQueue.isEmpty()) {
                blockingQueue.drainTo(errors);
            }
        } catch (Exception e) {
            C29518o.Companion.m37466e(TAG, "Failed to add pendingErrors to errors queue.", e);
        }
        try {
            BlockingQueue<Sdk$SDKMetric.C29429a> blockingQueue2 = pendingMetrics;
            if (!blockingQueue2.isEmpty()) {
                blockingQueue2.drainTo(metrics);
            }
        } catch (Exception e2) {
            C29518o.Companion.m37466e(TAG, "Failed to add pendingMetrics to metrics queue.", e2);
        }
        if (refreshEnabled) {
            Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() { // from class: com.vungle.ads.l
                @Override // java.lang.Runnable
                public final void run() {
                    AnalyticsClient.m110406init$lambda1(executor2);
                }
            }, 0L, 5000L, TimeUnit.MILLISECONDS);
        }
        updateErrorLevelAndMetricEnabled$vungle_ads_release(i, z);
        if (i == EnumC29545a.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            C29518o.Companion.enable(true);
        } else if (i == EnumC29545a.ERROR_LOG_LEVEL_ERROR.getLevel()) {
            C29518o.Companion.enable(false);
        } else if (i == EnumC29545a.ERROR_LOG_LEVEL_OFF.getLevel()) {
            C29518o.Companion.enable(false);
        }
        ActivityManager.Companion.addLifecycleListener(new C29550e());
    }

    public final synchronized void logError$vungle_ads_release(@NotNull final Sdk$SDKError.EnumC29425b reason, @NotNull final String message, @Nullable final String str, @Nullable final String str2, @Nullable final String str3) {
        VungleThreadPoolExecutor vungleThreadPoolExecutor;
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            vungleThreadPoolExecutor = executor;
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            String str4 = TAG;
            c29519a.m37466e(str4, "Cannot logError " + reason + ", " + message + ", " + str + ", " + str2 + ',' + str3, e);
        }
        if (vungleThreadPoolExecutor == null) {
            pendingErrors.put(genSDKError(reason, message, str, str2, str3));
            return;
        }
        if (vungleThreadPoolExecutor != null) {
            vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.m
                @Override // java.lang.Runnable
                public final void run() {
                    AnalyticsClient.m110408logError$lambda2(reason, message, str, str2, str3);
                }
            });
        }
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull final Sdk$SDKMetric.EnumC29430b metricType, final long j, @Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4) {
        VungleThreadPoolExecutor vungleThreadPoolExecutor;
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        try {
            vungleThreadPoolExecutor = executor;
        } catch (Exception e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            String str5 = TAG;
            c29519a.m37466e(str5, "Cannot logMetric " + metricType + ", " + j + ", " + str + ", " + str2 + ',' + str3 + ", " + str4, e);
        }
        if (vungleThreadPoolExecutor == null) {
            pendingMetrics.put(genMetric(metricType, j, str, str2, str3, str4));
            return;
        }
        if (vungleThreadPoolExecutor != null) {
            vungleThreadPoolExecutor.execute(new Runnable() { // from class: com.vungle.ads.n
                @Override // java.lang.Runnable
                public final void run() {
                    AnalyticsClient.m110409logMetric$lambda3(metricType, j, str, str2, str3, str4);
                }
            });
        }
    }

    public final void pause() {
        paused = true;
    }

    public final void resume() {
        paused = false;
    }

    public final void setExecutor$vungle_ads_release(@Nullable VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        executor = vungleThreadPoolExecutor;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z) {
        metricsEnabled = z;
    }

    public final void setRefreshEnabled$vungle_ads_release(boolean z) {
        refreshEnabled = z;
    }

    public final void setSignalManager$vungle_ads_release(@Nullable SignalManager signalManager2) {
        signalManager = signalManager2;
    }

    public final void setVungleApiClient$vungle_ads_release(@Nullable VungleApiClient vungleApiClient2) {
        vungleApiClient = vungleApiClient2;
    }

    public final synchronized void updateErrorLevelAndMetricEnabled$vungle_ads_release(int i, boolean z) {
        logLevel = EnumC29545a.Companion.fromValue(i);
        metricsEnabled = z;
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, C29136g2 c29136g2, String str, String str2, String str3, String str4, int i, Object obj) {
        String str5 = (i & 2) != 0 ? null : str;
        String str6 = (i & 4) != 0 ? null : str2;
        String str7 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            str4 = c29136g2.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(c29136g2, str5, str6, str7, str4);
    }

    public final synchronized void logError$vungle_ads_release(int i, @NotNull String message, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(message, "message");
        Sdk$SDKError.EnumC29425b forNumber = Sdk$SDKError.EnumC29425b.forNumber(i);
        Intrinsics.checkNotNullExpressionValue(forNumber, "forNumber(reasonCode)");
        logError$vungle_ads_release(forNumber, message, str, str2, str3);
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull Metrics metric, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Sdk$SDKMetric.EnumC29430b metricType = metric.getMetricType();
        long value = metric.getValue();
        if (str4 == null) {
            str4 = metric.getMeta();
        }
        logMetric$vungle_ads_release(metricType, value, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull C29132f2 singleValueMetric, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(singleValueMetric, "singleValueMetric");
        logMetric$vungle_ads_release((Metrics) singleValueMetric, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull C29136g2 timeIntervalMetric, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(timeIntervalMetric, "timeIntervalMetric");
        logMetric$vungle_ads_release((Metrics) timeIntervalMetric, str, str2, str3, str4);
    }

    @VisibleForTesting
    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingErrors$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPendingMetrics$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshEnabled$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSignalManager$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    public final synchronized void logMetric$vungle_ads_release(@NotNull C29572v1 oneShotTimeIntervalMetric, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(oneShotTimeIntervalMetric, "oneShotTimeIntervalMetric");
        if (!oneShotTimeIntervalMetric.isLogged()) {
            logMetric$vungle_ads_release((C29136g2) oneShotTimeIntervalMetric, str, str2, str3, str4);
            oneShotTimeIntervalMetric.markLogged();
        }
    }
}
