package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensions;
import com.unity3d.services.core.misc.Utilities;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37559r0;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C37702h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    @NotNull
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    @NotNull
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    @NotNull
    private final GetInitializationState getInitializationState;
    @Nullable
    private IUnityAdsTokenListener listener;
    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;
    @NotNull
    private final SessionRepository sessionRepository;
    @Nullable
    private InitializationState startState;
    private final long startTime;

    public CommonInitAwaitingGetHeaderBiddingToken(@NotNull GetHeaderBiddingToken getHeaderBiddingToken, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetInitializationState getInitializationState, @NotNull AwaitInitialization awaitInitialization, @NotNull SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(getHeaderBiddingToken, "getHeaderBiddingToken");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.startTime = C37702h.f99501a.m16437a();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchToken(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r0
            p804nd.C38508r.m14539b(r6)     // Catch: java.lang.Exception -> L2e
            goto L49
        L2e:
            r6 = move-exception
            goto L51
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            p804nd.C38508r.m14539b(r6)
            com.unity3d.ads.core.domain.GetHeaderBiddingToken r6 = r5.getHeaderBiddingToken     // Catch: java.lang.Exception -> L4f
            r0.L$0 = r5     // Catch: java.lang.Exception -> L4f
            r0.label = r3     // Catch: java.lang.Exception -> L4f
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Exception -> L4f
            if (r6 != r1) goto L48
            return r1
        L48:
            r0 = r5
        L49:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L2e
            r1 = r4
            r4 = r6
            r6 = r1
            goto L58
        L4f:
            r6 = move-exception
            r0 = r5
        L51:
            r1 = 0
            java.lang.String r6 = com.unity3d.ads.core.extensions.ExceptionExtensions.getShortenedStackTrace$default(r6, r1, r3, r4)
            java.lang.String r1 = "uncaught_exception"
        L58:
            if (r4 != 0) goto L5e
            r0.tokenFailure(r1, r6)
            goto L61
        L5e:
            r0.tokenSuccess(r4)
        L61:
            kotlin.Unit r6 = kotlin.Unit.f99208a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken(kotlin.coroutines.d):java.lang.Object");
    }

    private final void tokenFailure(String str, String str2) {
        Map m17294d;
        Map m17295c;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double valueOf = Double.valueOf(TimeExtensions.elapsedMillis(C37702h.C37703a.m16434c(this.startTime)));
        m17294d = MapsJVM.m17294d();
        m17294d.put("sync", "false");
        m17294d.put("state", String.valueOf(this.startState));
        m17294d.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        m17294d.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (str != null) {
            String str3 = (String) m17294d.put("reason", str);
        }
        if (str2 != null) {
            m17294d.put("reason_debug", str2);
        }
        Unit unit = Unit.f99208a;
        m17295c = MapsJVM.m17295c(m17294d);
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", valueOf, m17295c, null, null, 24, null);
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.a
            {
                CommonInitAwaitingGetHeaderBiddingToken.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CommonInitAwaitingGetHeaderBiddingToken.tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken.this);
            }
        });
    }

    static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(str, str2);
    }

    public static final void tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IUnityAdsTokenListener iUnityAdsTokenListener = this$0.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        }
    }

    private final void tokenStart() {
        Map m17281m;
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        m17281m = C37559r0.m17281m(C38513v.m14532a("sync", "false"), C38513v.m14532a("state", String.valueOf(this.startState)));
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_started", null, m17281m, null, null, 26, null);
    }

    private final void tokenSuccess(final String str) {
        Map m17281m;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double valueOf = Double.valueOf(TimeExtensions.elapsedMillis(C37702h.C37703a.m16434c(this.startTime)));
        m17281m = C37559r0.m17281m(C38513v.m14532a("sync", "false"), C38513v.m14532a("state", String.valueOf(this.startState)), C38513v.m14532a("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), C38513v.m14532a("awaited_init", String.valueOf(this.didAwaitInit)));
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_success_time", valueOf, m17281m, null, null, 24, null);
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.b
            {
                CommonInitAwaitingGetHeaderBiddingToken.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken.this, str);
            }
        });
    }

    public static final void tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken this$0, String token) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(token, "$token");
        IUnityAdsTokenListener iUnityAdsTokenListener = this$0.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(token);
        }
    }

    @NotNull
    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    @NotNull
    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    @NotNull
    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    @Nullable
    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    @NotNull
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    @NotNull
    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* renamed from: getStartTime-z9LOYto */
    public final long m110260getStartTimez9LOYto() {
        return this.startTime;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0091  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.Nullable com.unity3d.ads.IUnityAdsTokenListener r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            java.lang.String r3 = "!sessionRepository.shouldInitialize"
            java.lang.String r4 = "gateway"
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L41
            if (r2 == r7) goto L39
            if (r2 != r6) goto L31
            p804nd.C38508r.m14539b(r10)
            goto L9c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r9 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r9
            p804nd.C38508r.m14539b(r10)
            goto L83
        L41:
            p804nd.C38508r.m14539b(r10)
            r8.listener = r9
            r8.tokenStart()
            if (r9 != 0) goto L55
            java.lang.String r9 = "listener_null"
            java.lang.String r10 = "IUnityAdsTokenListener is null"
            r8.tokenFailure(r9, r10)
            kotlin.Unit r9 = kotlin.Unit.f99208a
            return r9
        L55:
            com.unity3d.ads.core.data.repository.SessionRepository r9 = r8.sessionRepository
            boolean r9 = r9.getShouldInitialize()
            if (r9 != 0) goto L63
            r8.tokenFailure(r4, r3)
            kotlin.Unit r9 = kotlin.Unit.f99208a
            return r9
        L63:
            com.unity3d.ads.core.data.repository.SessionRepository r9 = r8.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r9 = r9.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfiguration r9 = r9.getAdOperations()
            int r9 = r9.getGetTokenTimeoutMs()
            long r9 = (long) r9
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2 r2 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2
            r2.<init>(r8, r5)
            r0.L$0 = r8
            r0.label = r7
            java.lang.Object r9 = kotlinx.coroutines.C37727f3.m16350e(r9, r2, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            r9 = r8
        L83:
            com.unity3d.ads.core.data.repository.SessionRepository r10 = r9.sessionRepository
            boolean r10 = r10.getShouldInitialize()
            if (r10 != 0) goto L91
            r9.tokenFailure(r4, r3)
            kotlin.Unit r9 = kotlin.Unit.f99208a
            return r9
        L91:
            r0.L$0 = r5
            r0.label = r6
            java.lang.Object r9 = r9.fetchToken(r0)
            if (r9 != r1) goto L9c
            return r1
        L9c:
            kotlin.Unit r9 = kotlin.Unit.f99208a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke(com.unity3d.ads.IUnityAdsTokenListener, kotlin.coroutines.d):java.lang.Object");
    }

    public final void setListener(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
