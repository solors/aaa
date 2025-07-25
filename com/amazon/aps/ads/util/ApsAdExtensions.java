package com.amazon.aps.ads.util;

import com.amazon.aps.ads.ApsLog;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.amazon.aps.ads.util.ApsAdExtensionsKt */
/* loaded from: classes2.dex */
public final class ApsAdExtensions {
    /* renamed from: d */
    public static final void m102708d(@NotNull Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        ApsLog.m102717d(getTAG(obj), message);
    }

    /* renamed from: e */
    public static final void m102707e(@NotNull Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        ApsLog.m102717d(getTAG(obj), message);
    }

    @NotNull
    public static final String getTAG(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String simpleName = obj.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    /* renamed from: i */
    public static final void m102706i(@NotNull Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        ApsLog.m102717d(getTAG(obj), message);
    }

    public static final void logEvent(@NotNull Object obj, @Nullable APSEventSeverity aPSEventSeverity, @Nullable APSEventType aPSEventType, @Nullable String str, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str, exc);
    }

    public static final void remoteLog(@NotNull Object obj, @Nullable APSEventSeverity aPSEventSeverity, @Nullable APSEventType aPSEventType, @Nullable String str, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str, exc);
    }

    public static final void logEvent(@NotNull Object obj, @Nullable APSEventSeverity aPSEventSeverity, @Nullable APSEventType aPSEventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        APSAnalytics.logEvent(aPSEventSeverity, aPSEventType, str);
    }
}
