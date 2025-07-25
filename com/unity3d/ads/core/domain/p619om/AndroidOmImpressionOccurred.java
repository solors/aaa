package com.unity3d.ads.core.domain.p619om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidOmImpressionOccurred.kt */
@Metadata
/* renamed from: com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred */
/* loaded from: classes7.dex */
public final class AndroidOmImpressionOccurred implements OmImpressionOccurred {
    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;
    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmImpressionOccurred(@NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // com.unity3d.ads.core.domain.p619om.OmImpressionOccurred
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull com.unity3d.ads.core.data.model.AdObject r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.p619om.AndroidOmImpressionOccurred$invoke$1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1 r0 = (com.unity3d.ads.core.domain.p619om.AndroidOmImpressionOccurred$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred$invoke$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r11 = (com.unity3d.ads.core.data.model.AdObject) r11
            java.lang.Object r12 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred r12 = (com.unity3d.ads.core.domain.p619om.AndroidOmImpressionOccurred) r12
            p804nd.C38508r.m14539b(r13)
        L30:
            r7 = r11
            goto L52
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            p804nd.C38508r.m14539b(r13)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r13 = r10.openMeasurementRepository
            com.google.protobuf.ByteString r2 = r11.getOpportunityId()
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r13 = r13.impressionOccurred(r2, r12, r0)
            if (r13 != r1) goto L50
            return r1
        L50:
            r12 = r10
            goto L30
        L52:
            com.unity3d.ads.core.data.model.OMResult r13 = (com.unity3d.ads.core.data.model.OMResult) r13
            boolean r11 = r13 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r11 == 0) goto L66
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r12.sendDiagnosticEvent
            java.lang.String r3 = "om_impression_occurred_success"
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 14
            r9 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L9a
        L66:
            boolean r11 = r13 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r11 == 0) goto L9a
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r12.sendDiagnosticEvent
            java.lang.String r3 = "om_impression_occurred_failure"
            r4 = 0
            java.util.Map r11 = kotlin.collections.C37554o0.m17371d()
            com.unity3d.ads.core.data.model.OMResult$Failure r13 = (com.unity3d.ads.core.data.model.OMResult.Failure) r13
            java.lang.String r12 = r13.getReason()
            java.lang.String r0 = "reason"
            r11.put(r0, r12)
            java.lang.String r12 = r13.getReasonDebug()
            if (r12 == 0) goto L8d
            java.lang.String r12 = "reason_debug"
            java.lang.String r13 = r13.getReasonDebug()
            r11.put(r12, r13)
        L8d:
            kotlin.Unit r12 = kotlin.Unit.f99208a
            java.util.Map r5 = kotlin.collections.C37554o0.m17372c(r11)
            r6 = 0
            r8 = 10
            r9 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9)
        L9a:
            kotlin.Unit r11 = kotlin.Unit.f99208a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.p619om.AndroidOmImpressionOccurred.invoke(com.unity3d.ads.core.data.model.AdObject, boolean, kotlin.coroutines.d):java.lang.Object");
    }
}
