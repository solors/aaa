package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.p621di.IServiceComponent;
import com.unity3d.services.core.p621di.IServiceProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

/* compiled from: BaseTask.kt */
@Metadata
/* loaded from: classes7.dex */
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    /* compiled from: BaseTask.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @NotNull
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(@NotNull BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        @org.jetbrains.annotations.Nullable
        /* renamed from: invoke-gIAlu-s  reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <P extends com.unity3d.services.core.domain.task.BaseParams, R> java.lang.Object m110266invokegIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.BaseTask<? super P, R> r4, @org.jetbrains.annotations.NotNull P r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super p804nd.Result<? extends R>> r6) {
            /*
                boolean r0 = r6 instanceof com.unity3d.services.core.domain.task.BaseTask$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.BaseTask$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.services.core.domain.task.BaseTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.BaseTask$invoke$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = sd.C42683b.m6964e()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                p804nd.C38508r.m14539b(r6)
                nd.q r6 = (p804nd.Result) r6
                java.lang.Object r4 = r6.m14541j()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                p804nd.C38508r.m14539b(r6)
                r0.label = r3
                java.lang.Object r4 = r4.mo110264doWorkgIAlus(r5, r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.m110266invokegIAlus(com.unity3d.services.core.domain.task.BaseTask, com.unity3d.services.core.domain.task.BaseParams, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @Nullable
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    Object mo110264doWorkgIAlus(@NotNull P p, @NotNull Continuation<? super Result<? extends R>> continuation);

    @Nullable
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    Object mo110265invokegIAlus(@NotNull P p, @NotNull Continuation<? super Result<? extends R>> continuation);
}
