package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonClearCache.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonClearCache implements ClearCache {
    @NotNull
    private final CacheRepository cacheRepository;
    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonClearCache(@NotNull CacheRepository cacheRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    @Override // com.unity3d.ads.core.domain.ClearCache
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.CommonClearCache$invoke$1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.CommonClearCache$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonClearCache$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonClearCache$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonClearCache$invoke$1
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            long r1 = r0.J$1
            long r3 = r0.J$0
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.CommonClearCache r0 = (com.unity3d.ads.core.domain.CommonClearCache) r0
            p804nd.C38508r.m14539b(r14)
            goto L7a
        L34:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3c:
            long r4 = r0.J$0
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.CommonClearCache r2 = (com.unity3d.ads.core.domain.CommonClearCache) r2
            p804nd.C38508r.m14539b(r14)
            goto L60
        L46:
            p804nd.C38508r.m14539b(r14)
            kotlin.time.h r14 = kotlin.time.C37702h.f99501a
            long r5 = r14.m16437a()
            com.unity3d.ads.core.data.repository.CacheRepository r14 = r13.cacheRepository
            r0.L$0 = r13
            r0.J$0 = r5
            r0.label = r4
            java.lang.Object r14 = r14.getCacheSize(r0)
            if (r14 != r1) goto L5e
            return r1
        L5e:
            r2 = r13
            r4 = r5
        L60:
            java.lang.Number r14 = (java.lang.Number) r14
            long r6 = r14.longValue()
            com.unity3d.ads.core.data.repository.CacheRepository r14 = r2.cacheRepository
            r0.L$0 = r2
            r0.J$0 = r4
            r0.J$1 = r6
            r0.label = r3
            java.lang.Object r14 = r14.clearCache(r0)
            if (r14 != r1) goto L77
            return r1
        L77:
            r0 = r2
            r3 = r4
            r1 = r6
        L7a:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r0.sendDiagnosticEvent
            java.lang.String r6 = "native_initialize_clear_cache_time"
            kotlin.time.h$a r14 = kotlin.time.C37702h.C37703a.m16434c(r3)
            double r3 = com.unity3d.ads.core.extensions.TimeExtensions.elapsedMillis(r14)
            java.lang.Double r7 = kotlin.coroutines.jvm.internal.boxing.m17099b(r3)
            r8 = 0
            r14 = 1024(0x400, float:1.435E-42)
            long r3 = (long) r14
            long r1 = r1 / r3
            int r14 = (int) r1
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.boxing.m17097d(r14)
            java.lang.String r0 = "size_kb"
            kotlin.Pair r14 = p804nd.C38513v.m14532a(r0, r14)
            java.util.Map r9 = kotlin.collections.C37554o0.m17368g(r14)
            r10 = 0
            r11 = 20
            r12 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.Unit r14 = kotlin.Unit.f99208a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonClearCache.invoke(kotlin.coroutines.d):java.lang.Object");
    }
}
