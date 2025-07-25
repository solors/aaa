package com.yandex.mobile.ads.impl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yb0 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30812lw f88135a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @DebugMetadata(m17095c = "com.yandex.mobile.ads.features.debugpanel.domain.GetMediationNetworkDataUseCase", m17094f = "GetMediationNetworkDataUseCase.kt", m17093l = {12}, m17092m = "invoke")
    /* renamed from: com.yandex.mobile.ads.impl.yb0$a */
    /* loaded from: classes8.dex */
    public static final class C31879a extends AbstractC37589d {

        /* renamed from: b */
        String f88136b;

        /* renamed from: c */
        /* synthetic */ Object f88137c;

        /* renamed from: e */
        int f88139e;

        C31879a(Continuation<? super C31879a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f88137c = obj;
            this.f88139e |= Integer.MIN_VALUE;
            return yb0.this.m26972a(null, false, this);
        }
    }

    public yb0(@NotNull InterfaceC30812lw repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f88135a = repo;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26972a(@org.jetbrains.annotations.NotNull java.lang.String r5, boolean r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.yandex.mobile.ads.impl.C30503hv> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.yandex.mobile.ads.impl.yb0.C31879a
            if (r0 == 0) goto L13
            r0 = r7
            com.yandex.mobile.ads.impl.yb0$a r0 = (com.yandex.mobile.ads.impl.yb0.C31879a) r0
            int r1 = r0.f88139e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f88139e = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.yb0$a r0 = new com.yandex.mobile.ads.impl.yb0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f88137c
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f88139e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r5 = r0.f88136b
            p804nd.C38508r.m14539b(r7)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p804nd.C38508r.m14539b(r7)
            com.yandex.mobile.ads.impl.lw r7 = r4.f88135a
            r0.f88136b = r5
            r0.f88139e = r3
            java.lang.Object r7 = r7.mo31269a(r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.yandex.mobile.ads.impl.rv r7 = (com.yandex.mobile.ads.impl.C31313rv) r7
            com.yandex.mobile.ads.impl.jv r6 = r7.m29932b()
            java.util.List r6 = r6.m32725a()
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r6.next()
            r0 = r7
            com.yandex.mobile.ads.impl.hv r0 = (com.yandex.mobile.ads.impl.C30503hv) r0
            java.lang.String r0 = r0.m33461e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.m17075f(r0, r5)
            if (r0 == 0) goto L51
            goto L6a
        L69:
            r7 = 0
        L6a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yb0.m26972a(java.lang.String, boolean, kotlin.coroutines.d):java.lang.Object");
    }
}
