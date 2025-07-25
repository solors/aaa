package com.yandex.mobile.ads.impl;

import com.smaato.sdk.core.gdpr.CmpApiConstants;
import io.bidmachine.IABSharedPreference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.ap */
/* loaded from: classes8.dex */
public final class EnumC29955ap {
    @NotNull

    /* renamed from: d */
    public static final C29956a f76866d;

    /* renamed from: e */
    private static final /* synthetic */ EnumC29955ap[] f76867e;
    @Nullable

    /* renamed from: b */
    private final String f76868b;
    @NotNull

    /* renamed from: c */
    private final String f76869c;

    /* renamed from: com.yandex.mobile.ads.impl.ap$a */
    /* loaded from: classes8.dex */
    public static final class C29956a {
        private C29956a() {
        }

        public /* synthetic */ C29956a(int i) {
            this();
        }
    }

    static {
        EnumC29955ap[] enumC29955apArr = {new EnumC29955ap(0, "CONSENT_STRING", IABSharedPreference.IAB_CONSENT_STRING, "IABTCF_TCString"), new EnumC29955ap(1, "GDPR", IABSharedPreference.IAB_SUBJECT_TO_GDPR, "IABTCF_gdprApplies"), new EnumC29955ap(2, "CMP_PRESENT", "IABConsent_CMPPresent", CmpApiConstants.IABTCF_CMP_SDK_ID), new EnumC29955ap(3, "PURPOSE_CONSENTS", "IABConsent_ParsedPurposeConsents", CmpApiConstants.IABTCF_PURPOSE_CONSENTS), new EnumC29955ap(4, "VENDOR_CONSENTS", "IABConsent_ParsedVendorConsents", CmpApiConstants.IABTCF_VENDOR_CONSENT), new EnumC29955ap(5, "ADDITIONAL_CONSENT", null, "IABTCF_AddtlConsent")};
        f76867e = enumC29955apArr;
        C44401b.m3113a(enumC29955apArr);
        f76866d = new C29956a(0);
    }

    private EnumC29955ap(int i, String str, String str2, String str3) {
        this.f76868b = str2;
        this.f76869c = str3;
    }

    public static EnumC29955ap valueOf(String str) {
        return (EnumC29955ap) Enum.valueOf(EnumC29955ap.class, str);
    }

    public static EnumC29955ap[] values() {
        return (EnumC29955ap[]) f76867e.clone();
    }

    @Nullable
    /* renamed from: a */
    public final String m35814a() {
        return this.f76868b;
    }

    @NotNull
    /* renamed from: b */
    public final String m35813b() {
        return this.f76869c;
    }
}
