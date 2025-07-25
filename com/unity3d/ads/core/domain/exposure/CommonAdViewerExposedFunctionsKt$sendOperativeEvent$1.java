package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        this.$getOperativeEventApi = getOperativeEventApi;
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
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull java.lang.Object[] r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p804nd.C38508r.m14539b(r7)
            goto L5b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            p804nd.C38508r.m14539b(r7)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r7 = gatewayprotocol.p687v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER
            r2 = 0
            r6 = r6[r2]
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.m17073h(r6, r2)
            java.lang.String r6 = (java.lang.String) r6
            r2 = 2
            byte[] r6 = android.util.Base64.decode(r6, r2)
            java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStrings.toByteString(r6)
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = r5.$getOperativeEventApi
            com.unity3d.ads.core.data.model.AdObject r4 = r5.$adObject
            r0.label = r3
            java.lang.Object r6 = r2.invoke(r7, r4, r6, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f99208a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1.invoke2(java.lang.Object[], kotlin.coroutines.d):java.lang.Object");
    }
}
