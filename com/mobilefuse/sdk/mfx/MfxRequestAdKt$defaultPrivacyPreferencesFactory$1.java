package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.privacy.PrivacyPrefsDefaultsResolver;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: MfxRequestAd.kt */
@Metadata
/* loaded from: classes7.dex */
final class MfxRequestAdKt$defaultPrivacyPreferencesFactory$1 extends Lambda implements Functions<MobileFusePrivacyPreferences> {
    public static final MfxRequestAdKt$defaultPrivacyPreferencesFactory$1 INSTANCE = new MfxRequestAdKt$defaultPrivacyPreferencesFactory$1();

    MfxRequestAdKt$defaultPrivacyPreferencesFactory$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final MobileFusePrivacyPreferences invoke() {
        PrivacyPrefsDefaultsResolver.resolveDefaults();
        return MobileFuse.getPrivacyPreferences();
    }
}
