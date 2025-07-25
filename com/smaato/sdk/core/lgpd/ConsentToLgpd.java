package com.smaato.sdk.core.lgpd;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public enum ConsentToLgpd {
    CONSENT_LGPD_ENABLED("1"),
    CONSENT_LGPD_DISABLED("0"),
    CONSENT_LGPD_UNKNOWN("-1");
    
    @NonNull

    /* renamed from: id */
    public final String f71595id;

    ConsentToLgpd(String str) {
        this.f71595id = (String) Objects.requireNonNull(str);
    }

    public static ConsentToLgpd getValueForString(String str) {
        for (int i = 0; i < values().length; i++) {
            ConsentToLgpd consentToLgpd = values()[i];
            if (consentToLgpd.f71595id.equals(str)) {
                return consentToLgpd;
            }
        }
        return null;
    }

    @NonNull
    public String getId() {
        return this.f71595id;
    }
}
