package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.p621di.IServiceComponent;
import com.unity3d.services.core.p621di.IServiceProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: UniversalRequestJob.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {
    public RequestPolicy requestPolicy;
    @NotNull
    private final InterfaceC38501j universalRequestDataSource$delegate;
    @NotNull
    private final InterfaceC38501j universalRequestEventSender$delegate;
    @NotNull
    private final WorkerParameters workerParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        InterfaceC38501j m14553b;
        InterfaceC38501j m14553b2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.workerParams = workerParams;
        EnumC38505n enumC38505n = EnumC38505n.f101867d;
        m14553b = LazyJVM.m14553b(enumC38505n, new UniversalRequestJob$special$$inlined$inject$default$1(this, ""));
        this.universalRequestEventSender$delegate = m14553b;
        m14553b2 = LazyJVM.m14553b(enumC38505n, new UniversalRequestJob$special$$inlined$inject$default$2(this, ""));
        this.universalRequestDataSource$delegate = m14553b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|20|21|(4:23|(1:25)|13|14)(2:26|27)))(1:29))(2:34|(2:36|37)(2:38|(1:40)(1:41)))|30|31|(1:33)|20|21|(0)(0)))|44|6|7|(0)(0)|30|31|(0)|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
        r4 = p804nd.Result.f101870c;
        r9 = p804nd.Result.m14549b(p804nd.C38508r.m14540a(r9));
        r2 = r2;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob r8, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r9) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.UniversalRequestJob.doWork$suspendImpl(com.unity3d.ads.core.domain.work.UniversalRequestJob, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation) {
        return doWork$suspendImpl(this, continuation);
    }

    @NotNull
    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        Intrinsics.m17056y("requestPolicy");
        return null;
    }

    @Override // com.unity3d.services.core.p621di.IServiceComponent
    @NotNull
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @NotNull
    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource$delegate.getValue();
    }

    @NotNull
    public final UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(@NotNull RequestPolicy requestPolicy) {
        Intrinsics.checkNotNullParameter(requestPolicy, "<set-?>");
        this.requestPolicy = requestPolicy;
    }
}
