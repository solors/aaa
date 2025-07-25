package com.moloco.sdk.internal.services.bidtoken.providers;

import android.app.ActivityManager;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.p */
/* loaded from: classes7.dex */
public final class C24301p implements InterfaceC24292j<ActivityManager.MemoryInfo> {
    @NotNull

    /* renamed from: d */
    public static final C24302a f62921d = new C24302a(null);
    @NotNull

    /* renamed from: b */
    public final ActivityManager f62922b;
    @NotNull

    /* renamed from: c */
    public ActivityManager.MemoryInfo f62923c;

    /* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.p$a */
    /* loaded from: classes7.dex */
    public static final class C24302a {
        public /* synthetic */ C24302a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24302a() {
        }
    }

    public C24301p(@NotNull ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        this.f62922b = activityManager;
        this.f62923c = m46641e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: a */
    public void mo46632a() {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] Updating m state", false, 4, null);
        this.f62923c = m46641e();
    }

    /* renamed from: b */
    public final boolean m46642b(ActivityManager.MemoryInfo memoryInfo, ActivityManager.MemoryInfo memoryInfo2) {
        return (memoryInfo.lowMemory == memoryInfo2.lowMemory && memoryInfo.threshold == memoryInfo2.threshold && memoryInfo.totalMem == memoryInfo2.totalMem) ? false : true;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: c */
    public String mo46630c() {
        return "MemorySignalProvider";
    }

    /* renamed from: e */
    public final ActivityManager.MemoryInfo m46641e() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.f62922b.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "MemoryInfo Error", e, false, 8, null);
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            memoryInfo2.totalMem = 0L;
            memoryInfo2.threshold = 0L;
            memoryInfo2.lowMemory = false;
            return memoryInfo2;
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    @NotNull
    /* renamed from: f */
    public ActivityManager.MemoryInfo mo46629d() {
        ActivityManager.MemoryInfo memoryInfo = this.f62923c;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] lm: " + memoryInfo.lowMemory + ", t: " + memoryInfo.threshold + ", tm: " + memoryInfo.totalMem, false, 4, null);
        return memoryInfo;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.InterfaceC24292j
    /* renamed from: b */
    public boolean mo46631b() {
        ActivityManager.MemoryInfo m46641e = m46641e();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] cached lm: " + this.f62923c.lowMemory + ", t: " + this.f62923c.threshold + ", tm: " + this.f62923c.totalMem, false, 4, null);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] current lm: " + m46641e.lowMemory + ", t: " + m46641e.threshold + ", tm: " + m46641e.totalMem, false, 4, null);
        boolean m46642b = m46642b(m46641e, this.f62923c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[CBT] m needsRefresh: ");
        sb2.append(m46642b);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", sb2.toString(), false, 4, null);
        return m46642b;
    }
}
