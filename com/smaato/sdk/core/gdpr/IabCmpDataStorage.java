package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface IabCmpDataStorage {
    @NonNull
    CmpData getCmpData();

    @NonNull
    String getConsentString();

    int getConsentVersion();

    @NonNull
    String getPurposesString();

    @NonNull
    SubjectToGdpr getSubjectToGdpr();

    @NonNull
    String getVendorsString();

    boolean isCmpPresent();
}
