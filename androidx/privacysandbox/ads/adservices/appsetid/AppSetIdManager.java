package androidx.privacysandbox.ads.adservices.appsetid;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.core.p017os.OutcomeReceiverKt;
import androidx.media3.exoplayer.hls.offline.ExecutorC2515a;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37784p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: AppSetIdManager.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class AppSetIdManager {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: AppSetIdManager.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @Nullable
        public final AppSetIdManager obtain(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final AppSetIdManager obtain(@NotNull Context context) {
        return Companion.obtain(context);
    }

    @Nullable
    public abstract Object getAppSetId(@NotNull Continuation<? super AppSetId> continuation);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppSetIdManager.kt */
    @Metadata
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @RequiresExtension(extension = 1000000, version = 4)
    /* loaded from: classes2.dex */
    public static final class Api33Ext4Impl extends AppSetIdManager {
        @NotNull
        private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

        public Api33Ext4Impl(@NotNull android.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
            Intrinsics.checkNotNullParameter(mAppSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = mAppSetIdManager;
        }

        private final AppSetId convertResponse(android.adservices.appsetid.AppSetId appSetId) {
            if (appSetId.getScope() == 1) {
                String id2 = appSetId.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "response.id");
                return new AppSetId(id2, 1);
            }
            String id3 = appSetId.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "response.id");
            return new AppSetId(id3, 2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object getAppSetIdAsyncInternal(Continuation<? super android.adservices.appsetid.AppSetId> continuation) {
            Continuation m6961c;
            Object m6959e;
            m6961c = IntrinsicsJvm.m6961c(continuation);
            C37784p c37784p = new C37784p(m6961c, 1);
            c37784p.m16132y();
            this.mAppSetIdManager.getAppSetId(new ExecutorC2515a(), OutcomeReceiverKt.asOutcomeReceiver(c37784p));
            Object m16135u = c37784p.m16135u();
            m6959e = C42688d.m6959e();
            if (m16135u == m6959e) {
                C37591h.m17084c(continuation);
            }
            return m16135u;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
        @androidx.annotation.DoNotInline
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object getAppSetId(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetId> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1
                if (r0 == 0) goto L13
                r0 = r5
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1 r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1 r0 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = sd.C42683b.m6964e()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r0 = r0.L$0
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl) r0
                p804nd.C38508r.m14539b(r5)
                goto L44
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L35:
                p804nd.C38508r.m14539b(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r5 = r4.getAppSetIdAsyncInternal(r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                r0 = r4
            L44:
                android.adservices.appsetid.AppSetId r5 = (android.adservices.appsetid.AppSetId) r5
                androidx.privacysandbox.ads.adservices.appsetid.AppSetId r5 = r0.convertResponse(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl.getAppSetId(kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Api33Ext4Impl(@org.jetbrains.annotations.NotNull android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.Class<android.adservices.appsetid.AppSetIdManager> r0 = android.adservices.appsetid.AppSetIdManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                android.adservices.appsetid.AppSetIdManager r2 = (android.adservices.appsetid.AppSetIdManager) r2
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl.<init>(android.content.Context):void");
        }
    }
}
