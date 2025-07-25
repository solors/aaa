package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonAdViewerExposedFunctionsKt$loadScarAd$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ LoadScarAd $loadScarAd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$loadScarAd$1(AdObject adObject, LoadScarAd loadScarAd) {
        this.$adObject = adObject;
        this.$loadScarAd = loadScarAd;
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(objArr, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull java.lang.Object[] r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
            r0.<init>(r11, r13)
        L18:
            r8 = r0
            java.lang.Object r13 = r8.result
            java.lang.Object r0 = sd.C42683b.m6964e()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            p804nd.C38508r.m14539b(r13)
            goto L95
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            p804nd.C38508r.m14539b(r13)
            r13 = 0
            r12 = r12[r13]
            java.lang.String r13 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.m17073h(r12, r13)
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            java.lang.String r13 = "type"
            java.lang.String r13 = r12.optString(r13)
            java.lang.String r1 = "adUnitId"
            java.lang.String r4 = r12.optString(r1)
            java.lang.String r3 = "adString"
            java.lang.String r5 = r12.optString(r3)
            java.lang.String r6 = "queryId"
            java.lang.String r7 = r12.optString(r6)
            java.lang.String r9 = "videoLength"
            int r12 = r12.optInt(r9)
            com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
            r9.setScarAd(r2)
            com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
            r9.setScarAdUnitId(r4)
            com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
            r9.setScarQueryId(r7)
            com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
            r9.setScarAdString(r5)
            com.unity3d.ads.core.domain.scar.LoadScarAd r9 = r11.$loadScarAd
            java.lang.String r10 = "adType"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r10)
            com.unity3d.ads.core.data.model.AdObject r10 = r11.$adObject
            java.lang.String r10 = r10.getPlacementId()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r8.label = r2
            r1 = r9
            r2 = r13
            r3 = r10
            r6 = r7
            r7 = r12
            java.lang.Object r12 = r1.invoke(r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L95
            return r0
        L95:
            kotlin.Unit r12 = kotlin.Unit.f99208a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1.invoke2(java.lang.Object[], kotlin.coroutines.d):java.lang.Object");
    }
}
