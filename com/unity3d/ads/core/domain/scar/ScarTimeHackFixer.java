package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScarTimeHackFixer.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ScarTimeHackFixer {
    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public ScarTimeHackFixer(@NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @NotNull
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final int invoke(int i) {
        if (i < 1000) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_scar_video_length_in_sec", null, null, null, null, 30, null);
            return i * 1000;
        }
        return i;
    }
}
