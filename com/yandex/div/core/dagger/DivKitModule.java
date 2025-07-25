package com.yandex.div.core.dagger;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1025w8.SendBeaconConfiguration;
import p1025w8.SendBeaconManager;
import p817oa.CpuUsageHistogramReporter;
import za.ViewCreator;

@Metadata
/* renamed from: com.yandex.div.core.dagger.h */
/* loaded from: classes8.dex */
public final class DivKitModule {
    @NotNull

    /* renamed from: a */
    public static final DivKitModule f75247a = new DivKitModule();

    private DivKitModule() {
    }

    @Nullable
    /* renamed from: a */
    public static final SendBeaconManager m37296a(@NotNull Context context, @Nullable SendBeaconConfiguration sendBeaconConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (sendBeaconConfiguration == null) {
            return null;
        }
        return new SendBeaconManager(context, sendBeaconConfiguration);
    }

    @NotNull
    /* renamed from: b */
    public static final ViewCreator m37295b(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        Intrinsics.checkNotNullParameter(cpuUsageHistogramReporter, "cpuUsageHistogramReporter");
        return new ViewCreator(cpuUsageHistogramReporter);
    }
}
