package com.unity3d.ads.core.domain;

import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidTriggerInitializationCompletedRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    @NotNull
    private final GatewayClient gatewayClient;
    @NotNull
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    @NotNull
    private final GetRequestPolicy getRequestPolicy;
    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidTriggerInitializationCompletedRequest(@NotNull GetInitializationCompletedRequest getInitializationCompletedRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GatewayClient gatewayClient, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|(4:(1:(7:10|11|12|13|14|15|(5:17|18|19|20|21)(2:28|29))(2:35|36))(3:37|38|39)|34|25|26)(4:59|60|61|(1:63)(1:64))|40|41|42|43|44|45|(1:47)(4:48|14|15|(0)(0))))|68|6|(0)(0)|40|41|42|43|44|45|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013a, code lost:
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013d, code lost:
        r20 = r5;
        r21 = r6;
        r8 = 1;
        r16 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0144, code lost:
        r4 = r20;
        r2 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: Exception -> 0x0136, TRY_LEAVE, TryCatch #5 {Exception -> 0x0136, blocks: (B:36:0x00bf, B:38:0x00c7), top: B:67:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r34) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest.invoke(kotlin.coroutines.d):java.lang.Object");
    }
}
