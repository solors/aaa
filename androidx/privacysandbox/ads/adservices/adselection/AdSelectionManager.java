package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.p017os.OutcomeReceiverKt;
import androidx.media3.exoplayer.hls.offline.ExecutorC2515a;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37784p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: AdSelectionManager.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class AdSelectionManager {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: AdSelectionManager.kt */
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
        public final AdSelectionManager obtain(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public static final AdSelectionManager obtain(@NotNull Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    public abstract Object reportImpression(@NotNull ReportImpressionRequest reportImpressionRequest, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    public abstract Object selectAds(@NotNull AdSelectionConfig adSelectionConfig, @NotNull Continuation<? super AdSelectionOutcome> continuation);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdSelectionManager.kt */
    @Metadata
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @RequiresExtension(extension = 1000000, version = 4)
    /* loaded from: classes2.dex */
    public static final class Api33Ext4Impl extends AdSelectionManager {
        @NotNull
        private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

        public Api33Ext4Impl(@NotNull android.adservices.adselection.AdSelectionManager mAdSelectionManager) {
            Intrinsics.checkNotNullParameter(mAdSelectionManager, "mAdSelectionManager");
            this.mAdSelectionManager = mAdSelectionManager;
        }

        private final android.adservices.adselection.AdSelectionConfig convertAdSelectionConfig(AdSelectionConfig adSelectionConfig) {
            android.adservices.adselection.AdSelectionConfig build = new AdSelectionConfig.Builder().setAdSelectionSignals(convertAdSelectionSignals(adSelectionConfig.getAdSelectionSignals())).setCustomAudienceBuyers(convertBuyers(adSelectionConfig.getCustomAudienceBuyers())).setDecisionLogicUri(adSelectionConfig.getDecisionLogicUri()).setSeller(AdTechIdentifier.fromString(adSelectionConfig.getSeller().getIdentifier())).setPerBuyerSignals(convertPerBuyerSignals(adSelectionConfig.getPerBuyerSignals())).setSellerSignals(convertAdSelectionSignals(adSelectionConfig.getSellerSignals())).setTrustedScoringSignalsUri(adSelectionConfig.getTrustedScoringSignalsUri()).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
            return build;
        }

        private final AdSelectionSignals convertAdSelectionSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            AdSelectionSignals fromString = AdSelectionSignals.fromString(adSelectionSignals.getSignals());
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(request.signals)");
            return fromString;
        }

        private final List<AdTechIdentifier> convertBuyers(List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> list) {
            ArrayList arrayList = new ArrayList();
            for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : list) {
                AdTechIdentifier fromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
                Intrinsics.checkNotNullExpressionValue(fromString, "fromString(buyer.identifier)");
                arrayList.add(fromString);
            }
            return arrayList;
        }

        private final Map<AdTechIdentifier, AdSelectionSignals> convertPerBuyerSignals(Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> map) {
            AdSelectionSignals adSelectionSignals;
            HashMap hashMap = new HashMap();
            for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : map.keySet()) {
                AdTechIdentifier fromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
                Intrinsics.checkNotNullExpressionValue(fromString, "fromString(key.identifier)");
                if (map.get(adTechIdentifier) != null) {
                    androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals2 = map.get(adTechIdentifier);
                    Intrinsics.m17074g(adSelectionSignals2);
                    adSelectionSignals = convertAdSelectionSignals(adSelectionSignals2);
                } else {
                    adSelectionSignals = null;
                }
                hashMap.put(fromString, adSelectionSignals);
            }
            return hashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest reportImpressionRequest) {
            return new android.adservices.adselection.ReportImpressionRequest(reportImpressionRequest.getAdSelectionId(), convertAdSelectionConfig(reportImpressionRequest.getAdSelectionConfig()));
        }

        private final AdSelectionOutcome convertResponse(android.adservices.adselection.AdSelectionOutcome adSelectionOutcome) {
            long adSelectionId = adSelectionOutcome.getAdSelectionId();
            Uri renderUri = adSelectionOutcome.getRenderUri();
            Intrinsics.checkNotNullExpressionValue(renderUri, "response.renderUri");
            return new AdSelectionOutcome(adSelectionId, renderUri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, Continuation<? super android.adservices.adselection.AdSelectionOutcome> continuation) {
            Continuation m6961c;
            Object m6959e;
            m6961c = IntrinsicsJvm.m6961c(continuation);
            C37784p c37784p = new C37784p(m6961c, 1);
            c37784p.m16132y();
            this.mAdSelectionManager.selectAds(adSelectionConfig, new ExecutorC2515a(), OutcomeReceiverKt.asOutcomeReceiver(c37784p));
            Object m16135u = c37784p.m16135u();
            m6959e = C42688d.m6959e();
            if (m16135u == m6959e) {
                C37591h.m17084c(continuation);
            }
            return m16135u;
        }

        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        @Nullable
        public Object reportImpression(@NotNull ReportImpressionRequest reportImpressionRequest, @NotNull Continuation<? super Unit> continuation) {
            Continuation m6961c;
            Object m6959e;
            Object m6959e2;
            m6961c = IntrinsicsJvm.m6961c(continuation);
            C37784p c37784p = new C37784p(m6961c, 1);
            c37784p.m16132y();
            this.mAdSelectionManager.reportImpression(convertReportImpressionRequest(reportImpressionRequest), new ExecutorC2515a(), OutcomeReceiverKt.asOutcomeReceiver(c37784p));
            Object m16135u = c37784p.m16135u();
            m6959e = C42688d.m6959e();
            if (m16135u == m6959e) {
                C37591h.m17084c(continuation);
            }
            m6959e2 = C42688d.m6959e();
            if (m16135u == m6959e2) {
                return m16135u;
            }
            return Unit.f99208a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @androidx.annotation.DoNotInline
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object selectAds(@org.jetbrains.annotations.NotNull androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = sd.C42683b.m6964e()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.L$0
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl r5 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl) r5
                p804nd.C38508r.m14539b(r6)
                goto L48
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                p804nd.C38508r.m14539b(r6)
                android.adservices.adselection.AdSelectionConfig r5 = r4.convertAdSelectionConfig(r5)
                r0.L$0 = r4
                r0.label = r3
                java.lang.Object r6 = r4.selectAdsInternal(r5, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                r5 = r4
            L48:
                android.adservices.adselection.AdSelectionOutcome r6 = (android.adservices.adselection.AdSelectionOutcome) r6
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r5 = r5.convertResponse(r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.selectAds(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig, kotlin.coroutines.d):java.lang.Object");
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
                java.lang.Class<android.adservices.adselection.AdSelectionManager> r0 = android.adservices.adselection.AdSelectionManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                android.adservices.adselection.AdSelectionManager r2 = (android.adservices.adselection.AdSelectionManager) r2
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.<init>(android.content.Context):void");
        }
    }
}
