package com.mobilefuse.sdk.internal;

import android.content.Context;
import com.mobilefuse.sdk.mfx.MfxRequestAd;
import com.mobilefuse.sdk.network.model.MfxBidRequestToJsonObject;
import com.mobilefuse.sdk.service.MobileFuseServices;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseBiddingTokenProvider {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: MobileFuseBiddingTokenProvider.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject buildJsonObjectWithRequest(MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest) {
            JSONObject jsonObject = MfxBidRequestToJsonObject.toJsonObject(MfxRequestAd.createBidRequest("", 0, 0, new C23570x34e140ba(mergePrivacyPreferences$mobilefuse_sdk_core_release(mobileFuseBiddingTokenRequest.getPrivacyPreferences())), mobileFuseBiddingTokenRequest.isTestMode()));
            jsonObject.put("v", 2);
            jsonObject.remove("tagid");
            return jsonObject;
        }

        public final void getToken(@NotNull MobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull TokenGeneratorListener listener) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            MobileFuseServices.requireAllServices(new MobileFuseBiddingTokenProvider$Companion$getToken$1(request, listener));
        }

        public final void getTokenData(@NotNull IMobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull TokenDataListener listener) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listener, "listener");
            MobileFuseBiddingTokenProvider_getTokenData.getBiddingTokenData(request, context, listener);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences mergePrivacyPreferences$mobilefuse_sdk_core_release(@org.jetbrains.annotations.NotNull com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences r6) {
            /*
                r5 = this;
                java.lang.String r0 = "mediatorPrefs"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                com.mobilefuse.sdk.privacy.PrivacyPrefsDefaultsResolver.resolveDefaults()
                com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences r0 = com.mobilefuse.sdk.MobileFuse.getPrivacyPreferences()
                java.lang.String r1 = "MobileFuse.getPrivacyPreferences()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences$Builder r1 = new com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences$Builder
                r1.<init>()
                java.lang.String r2 = r6.getUsPrivacyConsentString()
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L27
                boolean r2 = kotlin.text.C37686h.m16727B(r2)
                if (r2 == 0) goto L25
                goto L27
            L25:
                r2 = r3
                goto L28
            L27:
                r2 = r4
            L28:
                if (r2 != 0) goto L32
                java.lang.String r2 = r6.getUsPrivacyConsentString()
                r1.setUsPrivacyConsentString(r2)
                goto L4b
            L32:
                java.lang.String r2 = r0.getUsPrivacyConsentString()
                if (r2 == 0) goto L41
                boolean r2 = kotlin.text.C37686h.m16727B(r2)
                if (r2 == 0) goto L3f
                goto L41
            L3f:
                r2 = r3
                goto L42
            L41:
                r2 = r4
            L42:
                if (r2 != 0) goto L4b
                java.lang.String r2 = r0.getUsPrivacyConsentString()
                r1.setUsPrivacyConsentString(r2)
            L4b:
                java.lang.String r2 = r6.getGppConsentString()
                if (r2 == 0) goto L5a
                boolean r2 = kotlin.text.C37686h.m16727B(r2)
                if (r2 == 0) goto L58
                goto L5a
            L58:
                r2 = r3
                goto L5b
            L5a:
                r2 = r4
            L5b:
                if (r2 != 0) goto L65
                java.lang.String r2 = r6.getGppConsentString()
                r1.setGppConsentString(r2)
                goto L7e
            L65:
                java.lang.String r2 = r0.getGppConsentString()
                if (r2 == 0) goto L74
                boolean r2 = kotlin.text.C37686h.m16727B(r2)
                if (r2 == 0) goto L72
                goto L74
            L72:
                r2 = r3
                goto L75
            L74:
                r2 = r4
            L75:
                if (r2 != 0) goto L7e
                java.lang.String r2 = r0.getGppConsentString()
                r1.setGppConsentString(r2)
            L7e:
                boolean r2 = r6.isSubjectToCoppa()
                if (r2 != 0) goto L8d
                boolean r2 = r0.isSubjectToCoppa()
                if (r2 == 0) goto L8b
                goto L8d
            L8b:
                r2 = r3
                goto L8e
            L8d:
                r2 = r4
            L8e:
                r1.setSubjectToCoppa(r2)
                boolean r6 = r6.isDoNotTrack()
                if (r6 != 0) goto L9d
                boolean r6 = r0.isDoNotTrack()
                if (r6 == 0) goto L9e
            L9d:
                r3 = r4
            L9e:
                r1.setDoNotTrack(r3)
                com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences r6 = r1.build()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider.Companion.mergePrivacyPreferences$mobilefuse_sdk_core_release(com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences):com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences");
        }
    }

    public static final void getToken(@NotNull MobileFuseBiddingTokenRequest mobileFuseBiddingTokenRequest, @NotNull Context context, @NotNull TokenGeneratorListener tokenGeneratorListener) {
        Companion.getToken(mobileFuseBiddingTokenRequest, context, tokenGeneratorListener);
    }

    public static final void getTokenData(@NotNull IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest, @NotNull Context context, @NotNull TokenDataListener tokenDataListener) {
        Companion.getTokenData(iMobileFuseBiddingTokenRequest, context, tokenDataListener);
    }
}
