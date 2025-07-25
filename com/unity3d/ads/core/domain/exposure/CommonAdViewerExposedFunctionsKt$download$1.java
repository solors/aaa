package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.CacheFile;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonAdViewerExposedFunctionsKt$download$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$download$1(CacheFile cacheFile, AdObject adObject) {
        this.$cacheFile = cacheFile;
        this.$adObject = adObject;
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(objArr, (Continuation<Object>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull java.lang.Object[] r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<java.lang.Object> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
            r0.<init>(r10, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = sd.C42683b.m6964e()
            int r1 = r6.label
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L37
            if (r1 != r8) goto L2f
            java.lang.Object r11 = r6.L$0
            java.lang.String r11 = (java.lang.String) r11
            p804nd.C38508r.m14539b(r12)
            goto L6c
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            p804nd.C38508r.m14539b(r12)
            r12 = r11[r7]
            java.lang.String r1 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.m17073h(r12, r1)
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.lang.String r1 = "url"
            java.lang.String r9 = r12.getString(r1)
            r2 = 2
            java.lang.Object r11 = kotlin.collections.C37551l.m17456b0(r11, r2)
            r4 = r11
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.lang.String r11 = "priority"
            int r5 = r12.optInt(r11, r7)
            com.unity3d.ads.core.domain.CacheFile r11 = r10.$cacheFile
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            com.unity3d.ads.core.data.model.AdObject r3 = r10.$adObject
            r6.L$0 = r9
            r6.label = r8
            r1 = r11
            r2 = r9
            java.lang.Object r12 = r1.invoke(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L6b
            return r0
        L6b:
            r11 = r9
        L6c:
            com.unity3d.ads.core.data.model.CacheResult r12 = (com.unity3d.ads.core.data.model.CacheResult) r12
            boolean r0 = r12 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            if (r0 == 0) goto Lce
            com.unity3d.ads.core.data.model.CacheResult$Success r12 = (com.unity3d.ads.core.data.model.CacheResult.Success) r12
            com.unity3d.ads.core.data.model.CachedFile r11 = r12.getCachedFile()
            java.lang.String r11 = r11.getExtension()
            if (r11 == 0) goto L8a
            int r11 = r11.length()
            if (r11 != 0) goto L86
            r11 = r8
            goto L87
        L86:
            r11 = r7
        L87:
            if (r11 != r8) goto L8a
            r7 = r8
        L8a:
            java.lang.String r11 = "unity-ads-cache://unity.ads.cache/"
            if (r7 == 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            com.unity3d.ads.core.data.model.CachedFile r11 = r12.getCachedFile()
            java.lang.String r11 = r11.getName()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            goto Ld2
        La6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            com.unity3d.ads.core.data.model.CachedFile r11 = r12.getCachedFile()
            java.lang.String r11 = r11.getName()
            r0.append(r11)
            r11 = 46
            r0.append(r11)
            com.unity3d.ads.core.data.model.CachedFile r11 = r12.getCachedFile()
            java.lang.String r11 = r11.getExtension()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            goto Ld2
        Lce:
            boolean r12 = r12 instanceof com.unity3d.ads.core.data.model.CacheResult.Failure
            if (r12 == 0) goto Ld8
        Ld2:
            java.lang.String r12 = "when (result) {\n        …sult.Failure -> url\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            return r11
        Ld8:
            nd.o r11 = new nd.o
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1.invoke2(java.lang.Object[], kotlin.coroutines.d):java.lang.Object");
    }
}
