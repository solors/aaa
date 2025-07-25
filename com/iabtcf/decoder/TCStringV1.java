package com.iabtcf.decoder;

import com.iabtcf.p398v2.PublisherRestriction;
import com.iabtcf.utils.BitReader;
import com.iabtcf.utils.BitSetIntIterable;
import com.iabtcf.utils.FieldDefs;
import com.iabtcf.utils.IntIterable;
import com.ironsource.C21114v8;
import java.time.Instant;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class TCStringV1 implements TCString {
    private final BitReader bbv;

    private TCStringV1(BitReader bitReader) {
        this.bbv = bitReader;
    }

    private IntIterable fillVendorsV1(BitReader bitReader, FieldDefs fieldDefs, FieldDefs fieldDefs2) {
        BitSet bitSet = new BitSet();
        int readBits16 = bitReader.readBits16(fieldDefs);
        if (bitReader.readBits1(fieldDefs.getEnd(bitReader))) {
            boolean readBits1 = bitReader.readBits1(FieldDefs.V1_VENDOR_DEFAULT_CONSENT);
            TCStringV2.vendorIdsFromRange(bitReader, bitSet, FieldDefs.V1_VENDOR_NUM_ENTRIES.getOffset(bitReader), Optional.of(fieldDefs));
            if (readBits1) {
                bitSet.flip(1, readBits16 + 1);
            }
        } else {
            for (int i = 0; i < readBits16; i++) {
                if (bitReader.readBits1(fieldDefs2.getOffset(bitReader) + i)) {
                    bitSet.set(i + 1);
                }
            }
        }
        return BitSetIntIterable.from(bitSet);
    }

    public static TCStringV1 fromBitVector(BitReader bitReader) {
        return new TCStringV1(bitReader);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TCStringV1 tCStringV1 = (TCStringV1) obj;
        if (getVersion() == tCStringV1.getVersion() && Objects.equals(getCreated(), tCStringV1.getCreated()) && Objects.equals(getLastUpdated(), tCStringV1.getLastUpdated()) && getCmpId() == tCStringV1.getCmpId() && getCmpVersion() == tCStringV1.getCmpVersion() && getConsentScreen() == tCStringV1.getConsentScreen() && Objects.equals(getConsentLanguage(), tCStringV1.getConsentLanguage()) && getVendorListVersion() == tCStringV1.getVendorListVersion() && Objects.equals(getVendorConsent(), tCStringV1.getVendorConsent()) && getDefaultVendorConsent() == tCStringV1.getDefaultVendorConsent() && Objects.equals(getPurposesConsent(), tCStringV1.getPurposesConsent())) {
            return true;
        }
        return false;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getAllowedVendors() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpId() {
        return this.bbv.readBits12(FieldDefs.V1_CMP_ID);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpVersion() {
        return this.bbv.readBits12(FieldDefs.V1_CMP_VERSION);
    }

    @Override // com.iabtcf.decoder.TCString
    public String getConsentLanguage() {
        return this.bbv.readStr2(FieldDefs.V1_CONSENT_LANGUAGE);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getConsentScreen() {
        return this.bbv.readBits6(FieldDefs.V1_CONSENT_SCREEN);
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getCreated() {
        Instant ofEpochMilli;
        ofEpochMilli = Instant.ofEpochMilli(this.bbv.readBits36(FieldDefs.V1_CREATED) * 100);
        return ofEpochMilli;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesConsent() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesLITransparency() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getDefaultVendorConsent() {
        if (this.bbv.readBits1(FieldDefs.V1_VENDOR_IS_RANGE_ENCODING) && this.bbv.readBits1(FieldDefs.V1_VENDOR_DEFAULT_CONSENT)) {
            return true;
        }
        return false;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getDisclosedVendors() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getLastUpdated() {
        Instant ofEpochMilli;
        ofEpochMilli = Instant.ofEpochMilli(this.bbv.readBits36(FieldDefs.V1_LAST_UPDATED) * 100);
        return ofEpochMilli;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesConsent() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesLITransparency() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public String getPublisherCC() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public List<PublisherRestriction> getPublisherRestrictions() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getPurposeOneTreatment() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesConsent() {
        return TCStringV2.fillBitSet(this.bbv, FieldDefs.V1_PURPOSES_ALLOW);
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesLITransparency() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getSpecialFeatureOptIns() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public int getTcfPolicyVersion() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getUseNonStandardStacks() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorConsent() {
        return fillVendorsV1(this.bbv, FieldDefs.V1_VENDOR_MAX_VENDOR_ID, FieldDefs.V1_VENDOR_BITRANGE_FIELD);
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorLegitimateInterest() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVendorListVersion() {
        return this.bbv.readBits12(FieldDefs.V1_VENDOR_LIST_VERSION);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVersion() {
        return this.bbv.readBits6(FieldDefs.V1_VERSION);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(getVersion()), getCreated(), getLastUpdated(), Integer.valueOf(getCmpId()), Integer.valueOf(getCmpVersion()), Integer.valueOf(getConsentScreen()), getConsentLanguage(), Integer.valueOf(getVendorListVersion()), getVendorConsent(), Boolean.valueOf(getDefaultVendorConsent()), getPurposesConsent());
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean isServiceSpecific() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return "TCStringV1 [getVersion()=" + getVersion() + ", getCreated()=" + getCreated() + ", getLastUpdated()=" + getLastUpdated() + ", getCmpId()=" + getCmpId() + ", getCmpVersion()=" + getCmpVersion() + ", getConsentScreen()=" + getConsentScreen() + ", getConsentLanguage()=" + getConsentLanguage() + ", getVendorListVersion()=" + getVendorListVersion() + ", getVendorConsent()=" + getVendorConsent() + ", getDefaultVendorConsent()=" + getDefaultVendorConsent() + ", getPurposesConsent()=" + getPurposesConsent() + C21114v8.C21123i.f54139e;
    }
}
