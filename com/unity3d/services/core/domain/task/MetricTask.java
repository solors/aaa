package com.unity3d.services.core.domain.task;

import com.facebook.login.LoginLogger;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import com.unity3d.services.core.p621di.IServiceProvider;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

/* compiled from: MetricTask.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class MetricTask<P extends BaseParams, R> implements BaseTask<P, R> {
    private long duration;
    @NotNull
    private String taskStatus = "unknown";

    private final void captureMetric(Object obj) {
        String str;
        if (Result.m14543h(obj)) {
            str = "success";
        } else {
            str = LoginLogger.EVENT_EXTRAS_FAILURE;
        }
        this.taskStatus = str;
        sendMetric();
    }

    private final Metric getMetric() {
        return new Metric(getMetricName(), Long.valueOf(this.duration), getMetricTagsForState());
    }

    private final Map<String, String> getMetricTagsForState() {
        Map<String, String> retryTags = InitializeEventsMetricSender.getInstance().getRetryTags();
        Intrinsics.checkNotNullExpressionValue(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender) getServiceProvider().getRegistry().getService("", Reflection.m17042b(SDKMetricsSender.class));
    }

    private final int getStatePrefixLength() {
        return 15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* renamed from: invoke-gIAlu-s$suspendImpl  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m110282invokegIAlus$suspendImpl(com.unity3d.services.core.domain.task.MetricTask<? super P, R> r8, P r9, kotlin.coroutines.Continuation<? super p804nd.Result<? extends R>> r10) {
        /*
            boolean r0 = r10 instanceof com.unity3d.services.core.domain.task.MetricTask$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.MetricTask$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.MetricTask$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L51
            if (r2 != r3) goto L49
            long r8 = r0.J$0
            java.lang.Object r1 = r0.L$4
            java.util.concurrent.TimeUnit r1 = (java.util.concurrent.TimeUnit) r1
            java.lang.Object r2 = r0.L$3
            com.unity3d.services.core.domain.task.MetricTask r2 = (com.unity3d.services.core.domain.task.MetricTask) r2
            java.lang.Object r3 = r0.L$2
            kotlin.jvm.internal.n0 r3 = (kotlin.jvm.internal.C37609n0) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.n0 r4 = (kotlin.jvm.internal.C37609n0) r4
            java.lang.Object r0 = r0.L$0
            com.unity3d.services.core.domain.task.MetricTask r0 = (com.unity3d.services.core.domain.task.MetricTask) r0
            p804nd.C38508r.m14539b(r10)
            nd.q r10 = (p804nd.Result) r10
            java.lang.Object r10 = r10.m14541j()
            r6 = r8
            r8 = r2
            r9 = r4
            r4 = r6
            goto L79
        L49:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L51:
            p804nd.C38508r.m14539b(r10)
            kotlin.jvm.internal.n0 r10 = new kotlin.jvm.internal.n0
            r10.<init>()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = java.lang.System.nanoTime()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r10
            r0.L$3 = r8
            r0.L$4 = r2
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m110266invokegIAlus(r8, r9, r0)
            if (r9 != r1) goto L74
            return r1
        L74:
            r0 = r8
            r3 = r10
            r1 = r2
            r10 = r9
            r9 = r3
        L79:
            r3.f99327b = r10
            kotlin.Unit r10 = kotlin.Unit.f99208a
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r4
            long r1 = r1.toMillis(r2)
            r8.duration = r1
            T r8 = r9.f99327b
            r0.captureMetric(r8)
            T r8 = r9.f99327b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.MetricTask.m110282invokegIAlus$suspendImpl(com.unity3d.services.core.domain.task.MetricTask, com.unity3d.services.core.domain.task.BaseParams, kotlin.coroutines.d):java.lang.Object");
    }

    private final void sendMetric() {
        boolean z;
        String metricName = getMetricName();
        if (metricName != null && metricName.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return;
        }
        getSDKMetrics().sendMetric(getMetric());
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public String getMetricName() {
        return null;
    }

    @NotNull
    public final String getMetricNameForInitializeTask(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "native_" + name + "_task_" + this.taskStatus + "_time";
    }

    @Nullable
    public final String getMetricNameForTask(@NotNull Object task) {
        boolean z;
        Intrinsics.checkNotNullParameter(task, "task");
        String className = task.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(className, "className");
        if (className.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(className, "className");
        String substring = className.substring(getStatePrefixLength());
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        StringBuilder sb2 = new StringBuilder(7 + lowerCase.length() + 6);
        sb2.append("native_");
        sb2.append(lowerCase);
        sb2.append("_state");
        return sb2.toString();
    }

    @Override // com.unity3d.services.core.p621di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    public final String getTaskStatus() {
        return this.taskStatus;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    @Nullable
    /* renamed from: invoke-gIAlu-s */
    public Object mo110265invokegIAlus(@NotNull P p, @NotNull Continuation<? super Result<? extends R>> continuation) {
        return m110282invokegIAlus$suspendImpl(this, p, continuation);
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setTaskStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.taskStatus = str;
    }
}
