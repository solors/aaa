package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: InstallationId.kt */
@Metadata
/* loaded from: classes4.dex */
public final class InstallationId {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: a */
    private final String f43698a;
    @NotNull

    /* renamed from: b */
    private final String f43699b;

    /* compiled from: InstallationId.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(12:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(3:29|30|(1:32))|23|24|25|(1:27)|13|14|15|16))|37|6|7|(0)(0)|23|24|25|(0)|13|14|15|16) */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
            android.util.Log.w("InstallationId", "Error getting authentication token.", r10);
            r10 = r9;
            r9 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
            android.util.Log.w("InstallationId", "Error getting Firebase installation id .", r10);
            r9 = r9;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[RETURN] */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object create(@org.jetbrains.annotations.NotNull com.google.firebase.installations.FirebaseInstallationsApi r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.google.firebase.sessions.InstallationId> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.google.firebase.sessions.InstallationId$Companion$create$1
                if (r0 == 0) goto L13
                r0 = r10
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = (com.google.firebase.sessions.InstallationId$Companion$create$1) r0
                int r1 = r0.f43703o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43703o = r1
                goto L18
            L13:
                com.google.firebase.sessions.InstallationId$Companion$create$1 r0 = new com.google.firebase.sessions.InstallationId$Companion$create$1
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.f43701m
                java.lang.Object r1 = sd.C42683b.m6964e()
                int r2 = r0.f43703o
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L46
                if (r2 == r6) goto L3e
                if (r2 != r5) goto L36
                java.lang.Object r9 = r0.f43700l
                java.lang.String r9 = (java.lang.String) r9
                p804nd.C38508r.m14539b(r10)     // Catch: java.lang.Exception -> L34
                goto L89
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f43700l
                com.google.firebase.installations.FirebaseInstallationsApi r9 = (com.google.firebase.installations.FirebaseInstallationsApi) r9
                p804nd.C38508r.m14539b(r10)     // Catch: java.lang.Exception -> L6d
                goto L5e
            L46:
                p804nd.C38508r.m14539b(r10)
                r10 = 0
                com.google.android.gms.tasks.Task r10 = r9.getToken(r10)     // Catch: java.lang.Exception -> L6d
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L6d
                r0.f43700l = r9     // Catch: java.lang.Exception -> L6d
                r0.f43703o = r6     // Catch: java.lang.Exception -> L6d
                java.lang.Object r10 = ne.C38519b.m14485a(r10, r0)     // Catch: java.lang.Exception -> L6d
                if (r10 != r1) goto L5e
                return r1
            L5e:
                com.google.firebase.installations.InstallationTokenResult r10 = (com.google.firebase.installations.InstallationTokenResult) r10     // Catch: java.lang.Exception -> L6d
                java.lang.String r10 = r10.getToken()     // Catch: java.lang.Exception -> L6d
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L6d
                r7 = r10
                r10 = r9
                r9 = r7
                goto L75
            L6d:
                r10 = move-exception
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L75:
                com.google.android.gms.tasks.Task r10 = r10.getId()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "firebaseInstallations.id"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.f43700l = r9     // Catch: java.lang.Exception -> L34
                r0.f43703o = r5     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = ne.C38519b.m14485a(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L89
                return r1
            L89:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)     // Catch: java.lang.Exception -> L34
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                r3 = r10
                goto L97
            L92:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L97:
                com.google.firebase.sessions.InstallationId r10 = new com.google.firebase.sessions.InstallationId
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.InstallationId.Companion.create(com.google.firebase.installations.FirebaseInstallationsApi, kotlin.coroutines.d):java.lang.Object");
        }
    }

    public /* synthetic */ InstallationId(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    public final String getAuthToken() {
        return this.f43699b;
    }

    @NotNull
    public final String getFid() {
        return this.f43698a;
    }

    private InstallationId(String str, String str2) {
        this.f43698a = str;
        this.f43699b = str2;
    }
}
