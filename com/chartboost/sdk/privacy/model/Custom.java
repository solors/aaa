package com.chartboost.sdk.privacy.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class Custom extends GenericDataUseConsent {

    /* renamed from: d */
    public final String f23786d;

    /* renamed from: e */
    public final String f23787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Custom(@NotNull String customPrivacyStandard, @NotNull String customConsent) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(customPrivacyStandard, "customPrivacyStandard");
        Intrinsics.checkNotNullParameter(customConsent, "customConsent");
        this.f23786d = customPrivacyStandard;
        this.f23787e = customConsent;
        m79722b();
    }

    /* renamed from: d */
    private final boolean m79720d(String str) {
        int length = str.length();
        if (1 <= length && length < 100) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m79722b() {
        if (this.f23786d.length() == 0 || this.f23787e.length() == 0) {
            m79715a("Invalid Custom privacy standard name. Values cannot be null");
        } else if (m79721c(this.f23786d)) {
            m79715a("Invalid Custom privacy standard name. Cannot use GDPR as privacy standard");
        } else if (m79720d(this.f23786d) && m79720d(this.f23787e)) {
            m79714b(this.f23786d);
            m79716a((Object) this.f23787e);
        } else {
            String str = this.f23786d;
            String str2 = this.f23787e;
            m79715a("Invalid Custom consent values. Use valid values between 1 and 100 characters. privacyStandard: " + str + " consent: " + str2);
        }
    }

    /* renamed from: c */
    public final boolean m79721c(String str) {
        String str2;
        CharSequence m16571b1;
        if (str != null) {
            m16571b1 = C37690r.m16571b1(str);
            String obj = m16571b1.toString();
            if (obj != null) {
                str2 = obj.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                return Intrinsics.m17075f("gdpr", str2);
            }
        }
        str2 = null;
        return Intrinsics.m17075f("gdpr", str2);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    @NotNull
    public String getConsent() {
        Object m79717a = m79717a();
        Intrinsics.m17073h(m79717a, "null cannot be cast to non-null type kotlin.String");
        return (String) m79717a;
    }
}
