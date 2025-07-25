package com.iabtcf.decoder;

import com.iabtcf.exceptions.ByteParseException;
import com.iabtcf.exceptions.UnsupportedVersionException;
import com.iabtcf.p398v2.PublisherRestriction;
import com.iabtcf.utils.IntIterable;
import java.time.Instant;
import java.util.List;

/* loaded from: classes6.dex */
public interface TCString {
    static TCString decode(String str, DecoderOption... decoderOptionArr) throws IllegalArgumentException, ByteParseException, UnsupportedVersionException {
        return TCStringDecoder.decode(str, decoderOptionArr);
    }

    IntIterable getAllowedVendors();

    int getCmpId();

    int getCmpVersion();

    String getConsentLanguage();

    int getConsentScreen();

    Instant getCreated();

    IntIterable getCustomPurposesConsent();

    IntIterable getCustomPurposesLITransparency();

    boolean getDefaultVendorConsent();

    IntIterable getDisclosedVendors();

    Instant getLastUpdated();

    IntIterable getPubPurposesConsent();

    IntIterable getPubPurposesLITransparency();

    String getPublisherCC();

    List<PublisherRestriction> getPublisherRestrictions();

    boolean getPurposeOneTreatment();

    IntIterable getPurposesConsent();

    IntIterable getPurposesLITransparency();

    IntIterable getSpecialFeatureOptIns();

    int getTcfPolicyVersion();

    boolean getUseNonStandardStacks();

    IntIterable getVendorConsent();

    IntIterable getVendorLegitimateInterest();

    int getVendorListVersion();

    int getVersion();

    boolean isServiceSpecific();
}
