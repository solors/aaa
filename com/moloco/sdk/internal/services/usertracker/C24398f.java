package com.moloco.sdk.internal.services.usertracker;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import me.C38289c;
import me.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.usertracker.f */
/* loaded from: classes7.dex */
public final class C24398f implements InterfaceC24397e {
    @NotNull

    /* renamed from: a */
    public final InterfaceC24396d f63129a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC24394b f63130b;
    @NotNull

    /* renamed from: c */
    public final Mutex f63131c;

    @DebugMetadata(m17095c = "com.moloco.sdk.internal.services.usertracker.UserTrackerServiceImpl", m17094f = "UserTrackerService.kt", m17093l = {48, 33, 36}, m17092m = "getIdentifier")
    /* renamed from: com.moloco.sdk.internal.services.usertracker.f$a */
    /* loaded from: classes7.dex */
    public static final class C24399a extends AbstractC37589d {

        /* renamed from: l */
        public Object f63132l;

        /* renamed from: m */
        public Object f63133m;

        /* renamed from: n */
        public /* synthetic */ Object f63134n;

        /* renamed from: p */
        public int f63136p;

        public C24399a(Continuation<? super C24399a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f63134n = obj;
            this.f63136p |= Integer.MIN_VALUE;
            return C24398f.this.mo46496b(this);
        }
    }

    public C24398f(@NotNull InterfaceC24396d idGenerator, @NotNull InterfaceC24394b idRepository) {
        Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        Intrinsics.checkNotNullParameter(idRepository, "idRepository");
        this.f63129a = idGenerator;
        this.f63130b = idRepository;
        this.f63131c = C38289c.m15157b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:34:0x0085, B:36:0x0089), top: B:47:0x004c }] */
    @Override // com.moloco.sdk.internal.services.usertracker.InterfaceC24397e
    @org.jetbrains.annotations.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo46496b(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.String> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.internal.services.usertracker.C24398f.C24399a
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.services.usertracker.f$a r0 = (com.moloco.sdk.internal.services.usertracker.C24398f.C24399a) r0
            int r1 = r0.f63136p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63136p = r1
            goto L18
        L13:
            com.moloco.sdk.internal.services.usertracker.f$a r0 = new com.moloco.sdk.internal.services.usertracker.f$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f63134n
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f63136p
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L52
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f63133m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f63132l
            me.a r0 = (me.Mutex) r0
            p804nd.C38508r.m14539b(r9)     // Catch: java.lang.Throwable -> L39
            goto La0
        L39:
            r9 = move-exception
            goto La8
        L3c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L44:
            java.lang.Object r2 = r0.f63133m
            me.a r2 = (me.Mutex) r2
            java.lang.Object r4 = r0.f63132l
            com.moloco.sdk.internal.services.usertracker.f r4 = (com.moloco.sdk.internal.services.usertracker.C24398f) r4
            p804nd.C38508r.m14539b(r9)     // Catch: java.lang.Throwable -> L50
            goto L85
        L50:
            r9 = move-exception
            goto La9
        L52:
            java.lang.Object r2 = r0.f63133m
            me.a r2 = (me.Mutex) r2
            java.lang.Object r5 = r0.f63132l
            com.moloco.sdk.internal.services.usertracker.f r5 = (com.moloco.sdk.internal.services.usertracker.C24398f) r5
            p804nd.C38508r.m14539b(r9)
            r9 = r2
            goto L72
        L5f:
            p804nd.C38508r.m14539b(r9)
            me.a r9 = r8.f63131c
            r0.f63132l = r8
            r0.f63133m = r9
            r0.f63136p = r5
            java.lang.Object r2 = r9.mo15178d(r6, r0)
            if (r2 != r1) goto L71
            return r1
        L71:
            r5 = r8
        L72:
            com.moloco.sdk.internal.services.usertracker.b r2 = r5.f63130b     // Catch: java.lang.Throwable -> La4
            r0.f63132l = r5     // Catch: java.lang.Throwable -> La4
            r0.f63133m = r9     // Catch: java.lang.Throwable -> La4
            r0.f63136p = r4     // Catch: java.lang.Throwable -> La4
            java.lang.Object r2 = r2.mo46498b(r0)     // Catch: java.lang.Throwable -> La4
            if (r2 != r1) goto L81
            return r1
        L81:
            r4 = r5
            r7 = r2
            r2 = r9
            r9 = r7
        L85:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L9e
            com.moloco.sdk.internal.services.usertracker.d r9 = r4.f63129a     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = r9.mo46497a()     // Catch: java.lang.Throwable -> L50
            com.moloco.sdk.internal.services.usertracker.b r4 = r4.f63130b     // Catch: java.lang.Throwable -> L50
            r0.f63132l = r2     // Catch: java.lang.Throwable -> L50
            r0.f63133m = r9     // Catch: java.lang.Throwable -> L50
            r0.f63136p = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r4.mo46499a(r9, r0)     // Catch: java.lang.Throwable -> L50
            if (r0 != r1) goto L9e
            return r1
        L9e:
            r1 = r9
            r0 = r2
        La0:
            r0.mo15177e(r6)
            return r1
        La4:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        La8:
            r2 = r0
        La9:
            r2.mo15177e(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.usertracker.C24398f.mo46496b(kotlin.coroutines.d):java.lang.Object");
    }
}
