package com.inmobi.media;

import com.inmobi.commons.core.configs.CrashConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.S4 */
/* loaded from: classes6.dex */
public final class C19095S4 {

    /* renamed from: a */
    public final C18884Ca f47684a;

    /* renamed from: b */
    public final C18884Ca f47685b;

    /* renamed from: c */
    public final C18884Ca f47686c;

    /* renamed from: d */
    public final C18884Ca f47687d;

    public C19095S4(CrashConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f47684a = new C18884Ca(config.getCrashConfig().getSamplingPercent());
        this.f47685b = new C18884Ca(config.getCatchConfig().getSamplingPercent());
        this.f47686c = new C18884Ca(config.getANRConfig().getWatchdog().getSamplingPercent());
        this.f47687d = new C18884Ca(config.getANRConfig().getAppExitReason().getSamplingPercent());
    }
}
