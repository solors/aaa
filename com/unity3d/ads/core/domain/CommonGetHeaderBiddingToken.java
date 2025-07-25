package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonGetHeaderBiddingToken.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String HB_TOKEN_VERSION = "2";
    @NotNull
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;
    @NotNull
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;
    @NotNull
    private final SessionRepository sessionRepository;

    /* compiled from: CommonGetHeaderBiddingToken.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CommonGetHeaderBiddingToken(@NotNull BuildHeaderBiddingToken buildHeaderBiddingToken, @NotNull FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        Intrinsics.checkNotNullParameter(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r0 = (gatewayprotocol.p687v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r0
            p804nd.C38508r.m14539b(r8)
            goto L86
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken r2 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken) r2
            p804nd.C38508r.m14539b(r8)
            goto L5e
        L40:
            p804nd.C38508r.m14539b(r8)
            com.unity3d.ads.core.domain.BuildHeaderBiddingToken r8 = r7.buildHeaderBiddingToken
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r7.sessionRepository
            java.util.List r2 = r2.getScarEligibleFormats()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.invoke(r2, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            r2 = r7
        L5e:
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r8 = (gatewayprotocol.p687v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r8
            com.unity3d.ads.core.data.repository.SessionRepository r5 = r2.sessionRepository
            java.util.List r5 = r5.getScarEligibleFormats()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r4
            if (r5 == 0) goto L87
            com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase r2 = r2.fetchSignalsAndSendUseCase
            com.google.protobuf.ByteString r5 = r8.getTokenId()
            java.lang.String r6 = "rawToken.tokenId"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r0 = r2.invoke(r5, r0)
            if (r0 != r1) goto L85
            return r1
        L85:
            r0 = r8
        L86:
            r8 = r0
        L87:
            com.google.protobuf.ByteString r8 = r8.toByteString()
            java.lang.String r0 = "rawToken.toByteString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            r0 = 0
            r1 = 0
            java.lang.String r8 = com.unity3d.ads.core.extensions.ProtobufExtensions.toBase64$default(r8, r0, r4, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "2:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke(kotlin.coroutines.d):java.lang.Object");
    }
}
