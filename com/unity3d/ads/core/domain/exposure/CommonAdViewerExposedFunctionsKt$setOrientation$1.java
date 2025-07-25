package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonAdViewerExposedFunctionsKt$setOrientation$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$setOrientation$1(AdObject adObject) {
        this.$adObject = adObject;
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(objArr, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull java.lang.Object[] r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p804nd.C38508r.m14539b(r8)
            goto L65
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            p804nd.C38508r.m14539b(r8)
            r8 = 0
            r7 = r7[r8]
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.Intrinsics.m17073h(r7, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
            ge.y r8 = r8.getDisplayMessages()
            com.unity3d.ads.adplayer.DisplayMessage$SetOrientation r2 = new com.unity3d.ads.adplayer.DisplayMessage$SetOrientation
            com.unity3d.ads.core.data.model.AdObject r4 = r6.$adObject
            com.google.protobuf.ByteString r4 = r4.getOpportunityId()
            java.lang.String r4 = r4.toStringUtf8()
            java.lang.String r5 = "adObject.opportunityId.toStringUtf8()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r2.<init>(r4, r7)
            r0.label = r3
            java.lang.Object r7 = r8.emit(r2, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            kotlin.Unit r7 = kotlin.Unit.f99208a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1.invoke2(java.lang.Object[], kotlin.coroutines.d):java.lang.Object");
    }
}
