package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;
import java.util.Set;

/* loaded from: classes7.dex */
public interface CmpData {
    @NonNull
    String getConsentString();

    @NonNull
    Set<Integer> getPurposesConsent();

    @NonNull
    SubjectToGdpr getSubjectToGdpr();

    @NonNull
    Set<Integer> getVendorConsent();

    boolean isCmpPresent();
}
