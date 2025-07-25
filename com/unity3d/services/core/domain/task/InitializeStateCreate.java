package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

/* compiled from: InitializeStateCreate.kt */
@Metadata
/* loaded from: classes7.dex */
public final class InitializeStateCreate extends MetricTask<Params, Configuration> {
    @NotNull
    private final ISDKDispatchers dispatchers;

    /* compiled from: InitializeStateCreate.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Params implements BaseParams {
        @NotNull
        private final Configuration config;
        @NotNull
        private final String webViewData;

        public Params(@NotNull Configuration config, @NotNull String webViewData) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(webViewData, "webViewData");
            this.config = config;
            this.webViewData = webViewData;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            if ((i & 2) != 0) {
                str = params.webViewData;
            }
            return params.copy(configuration, str);
        }

        @NotNull
        public final Configuration component1() {
            return this.config;
        }

        @NotNull
        public final String component2() {
            return this.webViewData;
        }

        @NotNull
        public final Params copy(@NotNull Configuration config, @NotNull String webViewData) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(webViewData, "webViewData");
            return new Params(config, webViewData);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            if (Intrinsics.m17075f(this.config, params.config) && Intrinsics.m17075f(this.webViewData, params.webViewData)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Configuration getConfig() {
            return this.config;
        }

        @NotNull
        public final String getWebViewData() {
            return this.webViewData;
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewData.hashCode();
        }

        @NotNull
        public String toString() {
            return "Params(config=" + this.config + ", webViewData=" + this.webViewData + ')';
        }
    }

    public InitializeStateCreate(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo110264doWorkgIAlus(BaseParams baseParams, Continuation continuation) {
        return m110275doWorkgIAlus((Params) baseParams, (Continuation<? super Result<? extends Configuration>>) continuation);
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("create_web_view");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m110275doWorkgIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.InitializeStateCreate.Params r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super p804nd.Result<? extends com.unity3d.services.core.configuration.Configuration>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1
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
            kotlinx.coroutines.k0 r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateCreate.m110275doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateCreate$Params, kotlin.coroutines.d):java.lang.Object");
    }
}
