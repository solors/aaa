package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.log.DeviceLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl;
import kotlinx.coroutines.InterfaceC37764l0;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends CoroutineContextImpl implements InterfaceC37764l0 {
    final /* synthetic */ List $metrics$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(InterfaceC37764l0.C37766b c37766b, List list) {
        super(c37766b);
        this.$metrics$inlined = list;
    }

    @Override // kotlinx.coroutines.InterfaceC37764l0
    public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        DeviceLog.debug("Metric " + this.$metrics$inlined + " failed to send with error: " + th);
    }
}
