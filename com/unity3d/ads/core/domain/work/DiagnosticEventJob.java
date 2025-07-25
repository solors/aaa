package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.p621di.ServiceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: DiagnosticEventJob.kt */
@Metadata
/* loaded from: classes7.dex */
public final class DiagnosticEventJob extends UniversalRequestJob {
    @NotNull
    private final InterfaceC38501j diagnosticEventRequestWorkModifier$delegate;
    @NotNull
    private final InterfaceC38501j getDiagnosticRequestPolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        InterfaceC38501j m14553b;
        InterfaceC38501j m14553b2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        EnumC38505n enumC38505n = EnumC38505n.f101867d;
        m14553b = LazyJVM.m14553b(enumC38505n, new IServiceComponent(this, ServiceProvider.NAMED_OTHER_REQ));
        this.getDiagnosticRequestPolicy$delegate = m14553b;
        m14553b2 = LazyJVM.m14553b(enumC38505n, new DiagnosticEventJob$special$$inlined$inject$default$2(this, ""));
        this.diagnosticEventRequestWorkModifier$delegate = m14553b2;
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[PHI: r10 
      PHI: (r10v17 java.lang.Object) = (r10v16 java.lang.Object), (r10v1 java.lang.Object) binds: [B:31:0x00c1, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 r0 = new com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            p804nd.C38508r.m14539b(r10)
            goto Lc4
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.work.DiagnosticEventJob r2 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) r2
            p804nd.C38508r.m14539b(r10)
            goto Lae
        L41:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.work.DiagnosticEventJob r6 = (com.unity3d.ads.core.domain.work.DiagnosticEventJob) r6
            p804nd.C38508r.m14539b(r10)
            goto L7c
        L4d:
            p804nd.C38508r.m14539b(r10)
            androidx.work.WorkerParameters r10 = r9.getWorkerParams()
            androidx.work.Data r10 = r10.getInputData()
            java.lang.String r2 = "universalRequestId"
            java.lang.String r2 = r10.getString(r2)
            if (r2 != 0) goto L6a
            androidx.work.ListenableWorker$Result r10 = androidx.work.ListenableWorker.Result.success()
            java.lang.String r0 = "success()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            return r10
        L6a:
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r10 = r9.getUniversalRequestDataSource()
            r0.L$0 = r9
            r0.L$1 = r2
            r0.label = r6
            java.lang.Object r10 = r10.get(r0)
            if (r10 != r1) goto L7b
            return r1
        L7b:
            r6 = r9
        L7c:
            com.unity3d.ads.datastore.UniversalRequestStoreOuterClass$UniversalRequestStore r10 = (com.unity3d.ads.datastore.UniversalRequestStoreOuterClass.UniversalRequestStore) r10
            com.google.protobuf.ByteString r10 = r10.getUniversalRequestMapOrThrow(r2)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r10 = gatewayprotocol.p687v1.UniversalRequestOuterClass.UniversalRequest.parseFrom(r10)
            com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier r7 = r6.getDiagnosticEventRequestWorkModifier()
            java.lang.String r8 = "universalRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r8)
            gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r10 = r7.invoke(r10)
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource r7 = r6.getUniversalRequestDataSource()
            com.google.protobuf.ByteString r10 = r10.toByteString()
            java.lang.String r8 = "modifiedUniversalRequest.toByteString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r8)
            r0.L$0 = r6
            r0.L$1 = r3
            r0.label = r5
            java.lang.Object r10 = r7.set(r2, r10, r0)
            if (r10 != r1) goto Lad
            return r1
        Lad:
            r2 = r6
        Lae:
            com.unity3d.ads.core.domain.GetRequestPolicy r10 = r2.getGetDiagnosticRequestPolicy()
            com.unity3d.ads.gatewayclient.RequestPolicy r10 = r10.invoke()
            r2.setRequestPolicy(r10)
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r10 = super.doWork(r0)
            if (r10 != r1) goto Lc4
            return r1
        Lc4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DiagnosticEventJob.doWork(kotlin.coroutines.d):java.lang.Object");
    }
}
