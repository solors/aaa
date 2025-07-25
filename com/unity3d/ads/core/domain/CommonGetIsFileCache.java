package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonGetIsFileCache.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {
    @NotNull
    private final CacheRepository cacheRepository;
    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetIsFileCache(@NotNull CacheRepository cacheRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r1 = r0.J$0
            java.lang.Object r12 = r0.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetIsFileCache r0 = (com.unity3d.ads.core.domain.CommonGetIsFileCache) r0
            p804nd.C38508r.m14539b(r13)
            goto L65
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            p804nd.C38508r.m14539b(r13)
            kotlin.time.h r13 = kotlin.time.C37702h.f99501a
            long r4 = r13.m16437a()
            java.lang.String r13 = "/"
            r2 = 0
            r6 = 2
            java.lang.String r13 = kotlin.text.C37686h.m16705R0(r12, r13, r2, r6, r2)
            java.lang.String r7 = "."
            java.lang.String r13 = kotlin.text.C37686h.m16701V0(r13, r7, r2, r6, r2)
            com.unity3d.ads.core.data.repository.CacheRepository r2 = r11.cacheRepository
            r0.L$0 = r11
            r0.L$1 = r12
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r13 = r2.doesFileExist(r13, r0)
            if (r13 != r1) goto L63
            return r1
        L63:
            r0 = r11
            r1 = r4
        L65:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r3 = r0.sendDiagnosticEvent
            if (r13 == 0) goto L72
            java.lang.String r0 = "native_show_is_file_cached_success_time"
            goto L74
        L72:
            java.lang.String r0 = "native_show_is_file_cached_failure_time"
        L74:
            r4 = r0
            kotlin.time.h$a r0 = kotlin.time.C37702h.C37703a.m16434c(r1)
            double r0 = com.unity3d.ads.core.extensions.TimeExtensions.elapsedMillis(r0)
            java.lang.Double r5 = kotlin.coroutines.jvm.internal.boxing.m17099b(r0)
            java.lang.String r0 = "url"
            kotlin.Pair r12 = p804nd.C38513v.m14532a(r0, r12)
            java.util.Map r6 = kotlin.collections.C37554o0.m17368g(r12)
            r7 = 0
            r8 = 0
            r9 = 24
            r10 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.boxing.m17100a(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetIsFileCache.invoke(java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }
}
