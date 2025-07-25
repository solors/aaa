package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public enum SubjectToGdpr {
    CMP_GDPR_ENABLED("1"),
    CMP_GDPR_DISABLED("0"),
    CMP_GDPR_UNKNOWN("-1");
    
    @NonNull

    /* renamed from: id */
    public final String f71527id;

    SubjectToGdpr(String str) {
        this.f71527id = (String) Objects.requireNonNull(str);
    }

    public static SubjectToGdpr getValueForString(String str) {
        for (int i = 0; i < values().length; i++) {
            SubjectToGdpr subjectToGdpr = values()[i];
            if (subjectToGdpr.f71527id.equals(str)) {
                return subjectToGdpr;
            }
        }
        return null;
    }

    @NonNull
    public String getId() {
        return this.f71527id;
    }
}
