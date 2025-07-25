package com.smaato.sdk.core.gdpr;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.locationaware.LocationAware;
import com.smaato.sdk.core.util.Objects;
import java.util.EnumMap;

/* loaded from: classes7.dex */
public final class SomaGdprV2Utils {
    @NonNull
    private final LocationAware locationAware;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SomaGdprV2Utils(@NonNull LocationAware locationAware) {
        this.locationAware = locationAware;
    }

    @NonNull
    public SomaGdprData createSomaGdprData(@NonNull CmpData cmpData) {
        Objects.requireNonNull(cmpData, "cmpData must not be null for SomaGdprData::from");
        CmpV2Data cmpV2Data = (CmpV2Data) cmpData;
        SubjectToGdpr subjectToGdpr = cmpV2Data.getSubjectToGdpr();
        String consentString = cmpV2Data.getConsentString();
        EnumMap enumMap = new EnumMap(PiiParam.class);
        for (PiiParam piiParam : PiiParam.values()) {
            enumMap.put((EnumMap) piiParam, (PiiParam) Boolean.TRUE);
        }
        return new SomaGdprData(subjectToGdpr, consentString, enumMap, this.locationAware, 2);
    }
}
