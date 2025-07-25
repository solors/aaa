package com.mobilefuse.sdk.config;

import com.mobilefuse.sdk.StabilityHelperBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.config.ExternalUsageInfo */
/* loaded from: classes7.dex */
public final class ExternalUsageHelpers {
    @NotNull
    public static final String SDK_MODULE_UNITY = "Unity";
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static Map<UsageInfoType, UsageInfo> usageInfoMap = new LinkedHashMap();

    /* compiled from: ExternalUsageHelpers.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.config.ExternalUsageInfo$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean hasUsageInfo$default(Companion companion, UsageInfoType usageInfoType, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.hasUsageInfo(usageInfoType, str);
        }

        public final void addUsageInfo(@NotNull UsageInfoType type, @NotNull String name, @NotNull String version) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(version, "version");
            ExternalUsageHelpers.usageInfoMap.put(type, new UsageInfo(type, name, version));
            try {
                StabilityHelperBridge stabilityHelperBridge = StabilityHelperBridge.INSTANCE;
                Function2<String, String, Unit> registerExceptionHandlerVariableFn = stabilityHelperBridge.getRegisterExceptionHandlerVariableFn();
                if (registerExceptionHandlerVariableFn != null) {
                    registerExceptionHandlerVariableFn.mo105910invoke(type.getTelemetryPrefix() + ".name", name);
                }
                Function2<String, String, Unit> registerExceptionHandlerVariableFn2 = stabilityHelperBridge.getRegisterExceptionHandlerVariableFn();
                if (registerExceptionHandlerVariableFn2 != null) {
                    registerExceptionHandlerVariableFn2.mo105910invoke(type.getTelemetryPrefix() + ".version", version);
                }
            } catch (Throwable unused) {
            }
        }

        public final void clear() {
            ExternalUsageHelpers.usageInfoMap.clear();
        }

        @Nullable
        public final String getUsageInfoName(@NotNull UsageInfoType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            UsageInfo usageInfo = (UsageInfo) ExternalUsageHelpers.usageInfoMap.get(type);
            if (usageInfo != null) {
                return usageInfo.getName();
            }
            return null;
        }

        @Nullable
        public final String getUsageInfoVersion(@NotNull UsageInfoType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            UsageInfo usageInfo = (UsageInfo) ExternalUsageHelpers.usageInfoMap.get(type);
            if (usageInfo != null) {
                return usageInfo.getVersion();
            }
            return null;
        }

        public final boolean hasUsageInfo(@NotNull UsageInfoType usageInfoType) {
            return hasUsageInfo$default(this, usageInfoType, null, 2, null);
        }

        public final boolean hasUsageInfo(@NotNull UsageInfoType type, @Nullable String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (str == null) {
                return ExternalUsageHelpers.usageInfoMap.containsKey(type);
            }
            UsageInfo usageInfo = (UsageInfo) ExternalUsageHelpers.usageInfoMap.get(type);
            return Intrinsics.m17075f(usageInfo != null ? usageInfo.getName() : null, str);
        }
    }

    public static final void addUsageInfo(@NotNull UsageInfoType usageInfoType, @NotNull String str, @NotNull String str2) {
        Companion.addUsageInfo(usageInfoType, str, str2);
    }

    public static final void clear() {
        Companion.clear();
    }

    @Nullable
    public static final String getUsageInfoName(@NotNull UsageInfoType usageInfoType) {
        return Companion.getUsageInfoName(usageInfoType);
    }

    @Nullable
    public static final String getUsageInfoVersion(@NotNull UsageInfoType usageInfoType) {
        return Companion.getUsageInfoVersion(usageInfoType);
    }

    public static final boolean hasUsageInfo(@NotNull UsageInfoType usageInfoType) {
        return Companion.hasUsageInfo$default(Companion, usageInfoType, null, 2, null);
    }

    public static final boolean hasUsageInfo(@NotNull UsageInfoType usageInfoType, @Nullable String str) {
        return Companion.hasUsageInfo(usageInfoType, str);
    }
}
