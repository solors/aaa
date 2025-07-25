package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.error.InterfaceC23967b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.InterfaceC24650f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v */
/* loaded from: classes7.dex */
public final class C24908v implements InterfaceC24797u {
    @NotNull

    /* renamed from: a */
    public final InterfaceC24650f f64352a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC23967b f64353b;

    @DebugMetadata(m17095c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.DECLoaderImpl", m17094f = "DECLoader.kt", m17093l = {31}, m17092m = "load")
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v$a */
    /* loaded from: classes7.dex */
    public static final class C24909a extends AbstractC37589d {

        /* renamed from: l */
        public Object f64354l;

        /* renamed from: m */
        public Object f64355m;

        /* renamed from: n */
        public Object f64356n;

        /* renamed from: o */
        public Object f64357o;

        /* renamed from: p */
        public /* synthetic */ Object f64358p;

        /* renamed from: r */
        public int f64360r;

        public C24909a(Continuation<? super C24909a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f64358p = obj;
            this.f64360r |= Integer.MIN_VALUE;
            return C24908v.this.mo45525a(null, null, this);
        }
    }

    public C24908v(@NotNull InterfaceC24650f mediaCacheRepository, @NotNull InterfaceC23967b errorReportingService) {
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        this.f64352a = mediaCacheRepository;
        this.f64353b = errorReportingService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC24797u
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo45525a(@org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C24770r r20, @org.jetbrains.annotations.Nullable java.lang.String r21, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C24770r> r22) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C24908v.mo45525a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, java.lang.String, kotlin.coroutines.d):java.lang.Object");
    }
}
