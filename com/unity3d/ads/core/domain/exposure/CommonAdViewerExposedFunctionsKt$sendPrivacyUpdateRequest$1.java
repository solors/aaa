package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 implements ExposedFunction {
    final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(objArr, (Continuation<Object>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull java.lang.Object[] r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<java.lang.Object> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.exposure.C28689x9d370ad6
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.C28689x9d370ad6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "version"
            java.lang.String r5 = "content"
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L37
            if (r2 != r7) goto L2f
            p804nd.C38508r.m14539b(r11)
            goto L5f
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            p804nd.C38508r.m14539b(r11)
            r10 = r10[r6]
            java.lang.String r11 = "null cannot be cast to non-null type org.json.JSONObject"
            kotlin.jvm.internal.Intrinsics.m17073h(r10, r11)
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.String r11 = r10.optString(r5)
            int r10 = r10.optInt(r4)
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r2 = r9.$sendPrivacyUpdateRequest
            java.lang.String r8 = "privacyUpdateContentBase64"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r8)
            com.google.protobuf.ByteString r11 = com.unity3d.ads.core.extensions.ProtobufExtensions.fromBase64$default(r11, r6, r7, r3)
            r0.label = r7
            java.lang.Object r11 = r2.invoke(r10, r11, r0)
            if (r11 != r1) goto L5f
            return r1
        L5f:
            gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse r11 = (gatewayprotocol.p687v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) r11
            java.util.Map r10 = kotlin.collections.C37554o0.m17371d()
            int r0 = r11.getVersion()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.boxing.m17097d(r0)
            r10.put(r4, r0)
            com.google.protobuf.ByteString r11 = r11.getContent()
            java.lang.String r0 = "response.content"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            java.lang.String r11 = com.unity3d.ads.core.extensions.ProtobufExtensions.toBase64$default(r11, r6, r7, r3)
            r10.put(r5, r11)
            java.util.Map r10 = kotlin.collections.C37554o0.m17372c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1.invoke2(java.lang.Object[], kotlin.coroutines.d):java.lang.Object");
    }
}
