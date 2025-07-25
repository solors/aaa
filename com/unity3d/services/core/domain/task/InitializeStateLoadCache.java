package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;

/* compiled from: InitializeStateLoadCache.kt */
@Metadata
/* loaded from: classes7.dex */
public final class InitializeStateLoadCache extends MetricTask<Params, LoadCacheResult> {
    @NotNull
    private final ISDKDispatchers dispatchers;

    /* compiled from: InitializeStateLoadCache.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class LoadCacheResult {
        private final boolean hasHashMismatch;
        @Nullable
        private final String webViewData;

        public LoadCacheResult(boolean z, @Nullable String str) {
            this.hasHashMismatch = z;
            this.webViewData = str;
        }

        public static /* synthetic */ LoadCacheResult copy$default(LoadCacheResult loadCacheResult, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadCacheResult.hasHashMismatch;
            }
            if ((i & 2) != 0) {
                str = loadCacheResult.webViewData;
            }
            return loadCacheResult.copy(z, str);
        }

        public final boolean component1() {
            return this.hasHashMismatch;
        }

        @Nullable
        public final String component2() {
            return this.webViewData;
        }

        @NotNull
        public final LoadCacheResult copy(boolean z, @Nullable String str) {
            return new LoadCacheResult(z, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadCacheResult)) {
                return false;
            }
            LoadCacheResult loadCacheResult = (LoadCacheResult) obj;
            if (this.hasHashMismatch == loadCacheResult.hasHashMismatch && Intrinsics.m17075f(this.webViewData, loadCacheResult.webViewData)) {
                return true;
            }
            return false;
        }

        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        @Nullable
        public final String getWebViewData() {
            return this.webViewData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            int hashCode;
            boolean z = this.hasHashMismatch;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            String str = this.webViewData;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return i + hashCode;
        }

        @NotNull
        public String toString() {
            return "LoadCacheResult(hasHashMismatch=" + this.hasHashMismatch + ", webViewData=" + this.webViewData + ')';
        }

        public /* synthetic */ LoadCacheResult(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str);
        }
    }

    /* compiled from: InitializeStateLoadCache.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Params implements BaseParams {
        @NotNull
        private final Configuration config;

        public Params(@NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        @NotNull
        public final Configuration component1() {
            return this.config;
        }

        @NotNull
        public final Params copy(@NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return new Params(config);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Params) && Intrinsics.m17075f(this.config, ((Params) obj).config)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @NotNull
        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateLoadCache(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getWebViewData() {
        try {
            return Utilities.readFileBytes(new File(SdkProperties.getLocalWebViewFile()));
        } catch (Exception e) {
            DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e.getMessage());
            return null;
        }
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo110264doWorkgIAlus(BaseParams baseParams, Continuation continuation) {
        return m110277doWorkgIAlus((Params) baseParams, (Continuation<? super Result<LoadCacheResult>>) continuation);
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("read_local_webview");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m110277doWorkgIAlus(@org.jetbrains.annotations.NotNull com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super p804nd.Result<com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1
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
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.C37734i.m16317g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            nd.q r7 = (p804nd.Result) r7
            java.lang.Object r6 = r7.m14541j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadCache.m110277doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params, kotlin.coroutines.d):java.lang.Object");
    }
}
