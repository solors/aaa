package com.mobilefuse.sdk.internal;

import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseBiddingTokenProvider.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider$Companion$buildJsonObjectWithRequest$jsonObject$1 */
/* loaded from: classes7.dex */
final class C23570x34e140ba extends Lambda implements Functions<MobileFusePrivacyPreferences> {
    final /* synthetic */ MobileFusePrivacyPreferences $parsedPrivacyPreferences;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23570x34e140ba(MobileFusePrivacyPreferences mobileFusePrivacyPreferences) {
        super(0);
        this.$parsedPrivacyPreferences = mobileFusePrivacyPreferences;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final MobileFusePrivacyPreferences invoke() {
        return this.$parsedPrivacyPreferences;
    }
}
