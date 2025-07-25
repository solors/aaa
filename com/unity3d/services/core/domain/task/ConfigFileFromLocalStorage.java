package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.Result;

/* compiled from: ConfigFileFromLocalStorage.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ConfigFileFromLocalStorage extends MetricTask<Params, Configuration> {
    @NotNull
    private final ISDKDispatchers dispatchers;

    /* compiled from: ConfigFileFromLocalStorage.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Params implements BaseParams {
        @NotNull
        private final Configuration defaultConfiguration;

        public Params() {
            this(null, 1, null);
        }

        @NotNull
        public final Configuration getDefaultConfiguration() {
            return this.defaultConfiguration;
        }

        public Params(@NotNull Configuration defaultConfiguration) {
            Intrinsics.checkNotNullParameter(defaultConfiguration, "defaultConfiguration");
            this.defaultConfiguration = defaultConfiguration;
        }

        public /* synthetic */ Params(Configuration configuration, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Configuration() : configuration);
        }
    }

    public ConfigFileFromLocalStorage(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo110264doWorkgIAlus(BaseParams baseParams, Continuation continuation) {
        return m110267doWorkgIAlus((Params) baseParams, (Continuation<? super Result<? extends Configuration>>) continuation);
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("read_local_config");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m110267doWorkgIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super p804nd.Result<? extends com.unity3d.services.core.configuration.Configuration>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1 r0 = (com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1 r0 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p804nd.C38508r.m14539b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            p804nd.C38508r.m14539b(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            kotlinx.coroutines.k0 r7 = r7.getIo()
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2 r2 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.C37734i.m16317g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            nd.q r7 = (p804nd.Result) r7
            java.lang.Object r6 = r7.m14541j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.m110267doWorkgIAlus(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$Params, kotlin.coroutines.d):java.lang.Object");
    }
}
