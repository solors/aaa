package com.iabtcf.decoder;

import com.iabtcf.exceptions.InvalidRangeFieldException;
import com.iabtcf.p398v2.PublisherRestriction;
import com.iabtcf.p398v2.RestrictionType;
import com.iabtcf.p398v2.SegmentType;
import com.iabtcf.utils.BitReader;
import com.iabtcf.utils.BitSetIntIterable;
import com.iabtcf.utils.FieldDefs;
import com.iabtcf.utils.IntIterable;
import com.ironsource.C21114v8;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes6.dex */
public class TCStringV2 implements TCString {
    private IntIterable allowedVendors;
    private final BitReader bbv;
    private final EnumSet<FieldDefs> cache;
    private String consentLanguage;
    private int consentManagerProviderId;
    private int consentManagerProviderVersion;
    private Instant consentRecordCreated;
    private Instant consentRecordLastUpdated;
    private int consentScreen;
    private IntIterable customPurposesConsent;
    private IntIterable customPurposesLITransparency;
    private IntIterable disclosedVendors;
    private boolean isPurposeOneTreatment;
    private boolean isServiceSpecific;
    private int policyVersion;
    private String publisherCountryCode;
    private IntIterable publisherPurposesConsent;
    private IntIterable publisherPurposesLITransparency;
    private List<PublisherRestriction> publisherRestrictions;
    private IntIterable purposesConsent;
    private IntIterable purposesLITransparency;
    private final Collection<BitReader> remainingVectors;
    private IntIterable specialFeaturesOptInts;
    private boolean useNonStandardStacks;
    private IntIterable vendorConsents;
    private IntIterable vendorLegitimateInterests;
    private int vendorListVersion;
    private int version;

    private TCStringV2(BitReader bitReader) {
        this(bitReader, new BitReader[0]);
    }

    public static BitSetIntIterable fillBitSet(BitReader bitReader, FieldDefs fieldDefs) {
        int offset = fieldDefs.getOffset(bitReader);
        int length = fieldDefs.getLength(bitReader);
        BitSetIntIterable.Builder newBuilder = BitSetIntIterable.newBuilder();
        for (int i = 0; i < length; i++) {
            if (bitReader.readBits1(offset + i)) {
                newBuilder.add(i + 1);
            }
        }
        return newBuilder.build();
    }

    private int fillPublisherRestrictions(List<PublisherRestriction> list, int i, BitReader bitReader) {
        int readBits12 = bitReader.readBits12(i);
        int length = i + FieldDefs.NUM_ENTRIES.getLength(bitReader);
        for (int i2 = 0; i2 < readBits12; i2++) {
            byte readBits6 = bitReader.readBits6(length);
            int length2 = length + FieldDefs.PURPOSE_ID.getLength(bitReader);
            RestrictionType from = RestrictionType.from(bitReader.readBits2(length2));
            BitSet bitSet = new BitSet();
            length = vendorIdsFromRange(this.bbv, bitSet, length2 + 2, Optional.empty());
            list.add(new PublisherRestriction(readBits6, from, BitSetIntIterable.from(bitSet)));
        }
        return length;
    }

    static BitSetIntIterable fillVendors(BitReader bitReader, FieldDefs fieldDefs, FieldDefs fieldDefs2) {
        BitSet bitSet = new BitSet();
        int readBits16 = bitReader.readBits16(fieldDefs);
        if (bitReader.readBits1(fieldDefs.getEnd(bitReader))) {
            vendorIdsFromRange(bitReader, bitSet, fieldDefs2, Optional.of(fieldDefs));
        } else {
            for (int i = 0; i < readBits16; i++) {
                if (bitReader.readBits1(fieldDefs2.getOffset(bitReader) + i)) {
                    bitSet.set(i + 1);
                }
            }
        }
        return BitSetIntIterable.from(bitSet);
    }

    public static TCStringV2 fromBitVector(BitReader bitReader, BitReader... bitReaderArr) {
        return new TCStringV2(bitReader, bitReaderArr);
    }

    private BitReader getSegment(SegmentType segmentType) {
        if (segmentType == SegmentType.DEFAULT) {
            return this.bbv;
        }
        for (BitReader bitReader : this.remainingVectors) {
            if (segmentType == SegmentType.from(bitReader.readBits3(FieldDefs.OOB_SEGMENT_TYPE))) {
                return bitReader;
            }
        }
        return null;
    }

    public static /* synthetic */ Integer lambda$vendorIdsFromRange$0(BitReader bitReader, FieldDefs fieldDefs) {
        return Integer.valueOf(bitReader.readBits16(fieldDefs));
    }

    public static int vendorIdsFromRange(final BitReader bitReader, BitSet bitSet, int i, Optional<FieldDefs> optional) {
        int readBits12 = bitReader.readBits12(i);
        int length = i + FieldDefs.NUM_ENTRIES.getLength(bitReader);
        int intValue = ((Integer) optional.map(new Function() { // from class: com.iabtcf.decoder.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Integer lambda$vendorIdsFromRange$0;
                lambda$vendorIdsFromRange$0 = TCStringV2.lambda$vendorIdsFromRange$0(bitReader, (FieldDefs) obj);
                return lambda$vendorIdsFromRange$0;
            }
        }).orElse(Integer.MAX_VALUE)).intValue();
        for (int i2 = 0; i2 < readBits12; i2++) {
            int i3 = length + 1;
            boolean readBits1 = bitReader.readBits1(length);
            int readBits16 = bitReader.readBits16(i3);
            FieldDefs fieldDefs = FieldDefs.START_OR_ONLY_VENDOR_ID;
            int length2 = i3 + fieldDefs.getLength(bitReader);
            if (readBits1) {
                int readBits162 = bitReader.readBits16(length2);
                length2 += fieldDefs.getLength(bitReader);
                if (readBits16 > readBits162) {
                    throw new InvalidRangeFieldException(String.format("start vendor id (%d) is greater than endVendorId (%d)", Integer.valueOf(readBits16), Integer.valueOf(readBits162)));
                }
                if (readBits162 <= intValue) {
                    bitSet.set(readBits16, readBits162 + 1);
                } else {
                    throw new InvalidRangeFieldException(String.format("end vendor id (%d) is greater than max (%d)", Integer.valueOf(readBits162), Integer.valueOf(intValue)));
                }
            } else {
                bitSet.set(readBits16);
            }
            length = length2;
        }
        return length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TCStringV2 tCStringV2 = (TCStringV2) obj;
        if (Objects.equals(getAllowedVendors(), tCStringV2.getAllowedVendors()) && Objects.equals(getConsentLanguage(), tCStringV2.getConsentLanguage()) && getCmpId() == tCStringV2.getCmpId() && getCmpVersion() == tCStringV2.getCmpVersion() && Objects.equals(getCreated(), tCStringV2.getCreated()) && Objects.equals(getLastUpdated(), tCStringV2.getLastUpdated()) && getConsentScreen() == tCStringV2.getConsentScreen() && Objects.equals(getCustomPurposesConsent(), tCStringV2.getCustomPurposesConsent()) && Objects.equals(getCustomPurposesLITransparency(), tCStringV2.getCustomPurposesLITransparency()) && Objects.equals(getDisclosedVendors(), tCStringV2.getDisclosedVendors()) && getPurposeOneTreatment() == tCStringV2.getPurposeOneTreatment() && isServiceSpecific() == tCStringV2.isServiceSpecific() && getTcfPolicyVersion() == tCStringV2.getTcfPolicyVersion() && Objects.equals(getPublisherCC(), tCStringV2.getPublisherCC()) && Objects.equals(getPubPurposesConsent(), tCStringV2.getPubPurposesConsent()) && Objects.equals(getPubPurposesLITransparency(), tCStringV2.getPubPurposesLITransparency()) && Objects.equals(getPublisherRestrictions(), tCStringV2.getPublisherRestrictions()) && Objects.equals(getPurposesConsent(), tCStringV2.getPurposesConsent()) && Objects.equals(getPurposesLITransparency(), tCStringV2.getPurposesLITransparency()) && Objects.equals(getSpecialFeatureOptIns(), tCStringV2.getSpecialFeatureOptIns()) && getUseNonStandardStacks() == tCStringV2.getUseNonStandardStacks() && Objects.equals(getVendorConsent(), tCStringV2.getVendorConsent()) && Objects.equals(getVendorLegitimateInterest(), tCStringV2.getVendorLegitimateInterest()) && getVendorListVersion() == tCStringV2.getVendorListVersion() && getVersion() == tCStringV2.getVersion()) {
            return true;
        }
        return false;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getAllowedVendors() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.AV_VENDOR_BITRANGE_FIELD;
        if (enumSet.add(fieldDefs)) {
            this.allowedVendors = BitSetIntIterable.EMPTY;
            BitReader segment = getSegment(SegmentType.ALLOWED_VENDOR);
            if (segment != null) {
                this.allowedVendors = fillVendors(segment, FieldDefs.AV_MAX_VENDOR_ID, fieldDefs);
            }
        }
        return this.allowedVendors;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpId() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_CMP_ID;
        if (enumSet.add(fieldDefs)) {
            this.consentManagerProviderId = (short) this.bbv.readBits12(fieldDefs);
        }
        return this.consentManagerProviderId;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpVersion() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_CMP_VERSION;
        if (enumSet.add(fieldDefs)) {
            this.consentManagerProviderVersion = (short) this.bbv.readBits12(fieldDefs);
        }
        return this.consentManagerProviderVersion;
    }

    @Override // com.iabtcf.decoder.TCString
    public String getConsentLanguage() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_CONSENT_LANGUAGE;
        if (enumSet.add(fieldDefs)) {
            this.consentLanguage = this.bbv.readStr2(fieldDefs);
        }
        return this.consentLanguage;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getConsentScreen() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_CONSENT_SCREEN;
        if (enumSet.add(fieldDefs)) {
            this.consentScreen = this.bbv.readBits6(fieldDefs);
        }
        return this.consentScreen;
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getCreated() {
        Instant ofEpochMilli;
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_CREATED;
        if (enumSet.add(fieldDefs)) {
            ofEpochMilli = Instant.ofEpochMilli(this.bbv.readBits36(fieldDefs) * 100);
            this.consentRecordCreated = ofEpochMilli;
        }
        return this.consentRecordCreated;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesConsent() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.PPTC_CUSTOM_PURPOSES_CONSENT;
        if (enumSet.add(fieldDefs)) {
            this.customPurposesConsent = BitSetIntIterable.EMPTY;
            BitReader segment = getSegment(SegmentType.PUBLISHER_TC);
            if (segment != null) {
                this.customPurposesConsent = fillBitSet(segment, fieldDefs);
            }
        }
        return this.customPurposesConsent;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesLITransparency() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.PPTC_CUSTOM_PURPOSES_LI_TRANSPARENCY;
        if (enumSet.add(fieldDefs)) {
            this.customPurposesLITransparency = BitSetIntIterable.EMPTY;
            BitReader segment = getSegment(SegmentType.PUBLISHER_TC);
            if (segment != null) {
                this.customPurposesLITransparency = fillBitSet(segment, fieldDefs);
            }
        }
        return this.customPurposesLITransparency;
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getDefaultVendorConsent() {
        return false;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getDisclosedVendors() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.DV_VENDOR_BITRANGE_FIELD;
        if (enumSet.add(fieldDefs)) {
            this.disclosedVendors = BitSetIntIterable.EMPTY;
            BitReader segment = getSegment(SegmentType.DISCLOSED_VENDOR);
            if (segment != null) {
                this.disclosedVendors = fillVendors(segment, FieldDefs.DV_MAX_VENDOR_ID, fieldDefs);
            }
        }
        return this.disclosedVendors;
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getLastUpdated() {
        Instant ofEpochMilli;
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_LAST_UPDATED;
        if (enumSet.add(fieldDefs)) {
            ofEpochMilli = Instant.ofEpochMilli(this.bbv.readBits36(fieldDefs) * 100);
            this.consentRecordLastUpdated = ofEpochMilli;
        }
        return this.consentRecordLastUpdated;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesConsent() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.PPTC_PUB_PURPOSES_CONSENT;
        if (enumSet.add(fieldDefs)) {
            this.publisherPurposesConsent = BitSetIntIterable.EMPTY;
            BitReader segment = getSegment(SegmentType.PUBLISHER_TC);
            if (segment != null) {
                this.publisherPurposesConsent = fillBitSet(segment, fieldDefs);
            }
        }
        return this.publisherPurposesConsent;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesLITransparency() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.PPTC_PUB_PURPOSES_LI_TRANSPARENCY;
        if (enumSet.add(fieldDefs)) {
            this.publisherPurposesLITransparency = BitSetIntIterable.EMPTY;
            BitReader segment = getSegment(SegmentType.PUBLISHER_TC);
            if (segment != null) {
                this.publisherPurposesLITransparency = fillBitSet(segment, fieldDefs);
            }
        }
        return this.publisherPurposesLITransparency;
    }

    @Override // com.iabtcf.decoder.TCString
    public String getPublisherCC() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_PUBLISHER_CC;
        if (enumSet.add(fieldDefs)) {
            this.publisherCountryCode = this.bbv.readStr2(fieldDefs);
        }
        return this.publisherCountryCode;
    }

    @Override // com.iabtcf.decoder.TCString
    public List<PublisherRestriction> getPublisherRestrictions() {
        if (this.cache.add(FieldDefs.CORE_PUB_RESTRICTION_ENTRY)) {
            ArrayList arrayList = new ArrayList();
            this.publisherRestrictions = arrayList;
            fillPublisherRestrictions(arrayList, FieldDefs.CORE_NUM_PUB_RESTRICTION.getOffset(this.bbv), this.bbv);
        }
        return this.publisherRestrictions;
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getPurposeOneTreatment() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_PURPOSE_ONE_TREATMENT;
        if (enumSet.add(fieldDefs)) {
            this.isPurposeOneTreatment = this.bbv.readBits1(fieldDefs);
        }
        return this.isPurposeOneTreatment;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesConsent() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_PURPOSES_CONSENT;
        if (enumSet.add(fieldDefs)) {
            this.purposesConsent = fillBitSet(this.bbv, fieldDefs);
        }
        return this.purposesConsent;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesLITransparency() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_PURPOSES_LI_TRANSPARENCY;
        if (enumSet.add(fieldDefs)) {
            this.purposesLITransparency = fillBitSet(this.bbv, fieldDefs);
        }
        return this.purposesLITransparency;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getSpecialFeatureOptIns() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_SPECIAL_FEATURE_OPT_INS;
        if (enumSet.add(fieldDefs)) {
            this.specialFeaturesOptInts = fillBitSet(this.bbv, fieldDefs);
        }
        return this.specialFeaturesOptInts;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getTcfPolicyVersion() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_TCF_POLICY_VERSION;
        if (enumSet.add(fieldDefs)) {
            this.policyVersion = this.bbv.readBits6(fieldDefs);
        }
        return this.policyVersion;
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getUseNonStandardStacks() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_USE_NON_STANDARD_STOCKS;
        if (enumSet.add(fieldDefs)) {
            this.useNonStandardStacks = this.bbv.readBits1(fieldDefs);
        }
        return this.useNonStandardStacks;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorConsent() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_VENDOR_BITRANGE_FIELD;
        if (enumSet.add(fieldDefs)) {
            this.vendorConsents = fillVendors(this.bbv, FieldDefs.CORE_VENDOR_MAX_VENDOR_ID, fieldDefs);
        }
        return this.vendorConsents;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorLegitimateInterest() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_VENDOR_LI_BITRANGE_FIELD;
        if (enumSet.add(fieldDefs)) {
            this.vendorLegitimateInterests = fillVendors(this.bbv, FieldDefs.CORE_VENDOR_LI_MAX_VENDOR_ID, fieldDefs);
        }
        return this.vendorLegitimateInterests;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVendorListVersion() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_VENDOR_LIST_VERSION;
        if (enumSet.add(fieldDefs)) {
            this.vendorListVersion = (short) this.bbv.readBits12(fieldDefs);
        }
        return this.vendorListVersion;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVersion() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_VERSION;
        if (enumSet.add(fieldDefs)) {
            this.version = this.bbv.readBits6(fieldDefs);
        }
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(getAllowedVendors(), getConsentLanguage(), Integer.valueOf(getCmpId()), Integer.valueOf(getCmpVersion()), getCreated(), getLastUpdated(), Integer.valueOf(getConsentScreen()), getCustomPurposesConsent(), getCustomPurposesLITransparency(), getDisclosedVendors(), Boolean.valueOf(getPurposeOneTreatment()), Boolean.valueOf(isServiceSpecific()), Integer.valueOf(getTcfPolicyVersion()), getPublisherCC(), getPubPurposesConsent(), getPubPurposesLITransparency(), getPublisherRestrictions(), getPurposesConsent(), getPurposesLITransparency(), getSpecialFeatureOptIns(), Boolean.valueOf(getUseNonStandardStacks()), getVendorConsent(), getVendorLegitimateInterest(), Integer.valueOf(getVendorListVersion()), Integer.valueOf(getVersion()));
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean isServiceSpecific() {
        EnumSet<FieldDefs> enumSet = this.cache;
        FieldDefs fieldDefs = FieldDefs.CORE_IS_SERVICE_SPECIFIC;
        if (enumSet.add(fieldDefs)) {
            this.isServiceSpecific = this.bbv.readBits1(fieldDefs);
        }
        return this.isServiceSpecific;
    }

    public String toString() {
        return "TCStringV2 [getVersion()=" + getVersion() + ", getCreated()=" + getCreated() + ", getLastUpdated()=" + getLastUpdated() + ", getCmpId()=" + getCmpId() + ", getCmpVersion()=" + getCmpVersion() + ", getConsentScreen()=" + getConsentScreen() + ", getConsentLanguage()=" + getConsentLanguage() + ", getVendorListVersion()=" + getVendorListVersion() + ", getTcfPolicyVersion()=" + getTcfPolicyVersion() + ", isServiceSpecific()=" + isServiceSpecific() + ", getUseNonStandardStacks()=" + getUseNonStandardStacks() + ", getSpecialFeatureOptIns()=" + getSpecialFeatureOptIns() + ", getPurposesConsent()=" + getPurposesConsent() + ", getPurposesLITransparency()=" + getPurposesLITransparency() + ", getPurposeOneTreatment()=" + getPurposeOneTreatment() + ", getPublisherCC()=" + getPublisherCC() + ", getVendorConsent()=" + getVendorConsent() + ", getVendorLegitimateInterest()=" + getVendorLegitimateInterest() + ", getPublisherRestrictions()=" + getPublisherRestrictions() + ", getDisclosedVendors()=" + getDisclosedVendors() + ", getAllowedVendors()=" + getAllowedVendors() + ", getPubPurposesConsent()=" + getPubPurposesConsent() + ", getPubPurposesLITransparency()=" + getPubPurposesLITransparency() + ", getCustomPurposesConsent()=" + getCustomPurposesConsent() + ", getCustomPurposesLITransparency()=" + getCustomPurposesLITransparency() + C21114v8.C21123i.f54139e;
    }

    private TCStringV2(BitReader bitReader, BitReader... bitReaderArr) {
        this.cache = EnumSet.noneOf(FieldDefs.class);
        this.bbv = bitReader;
        this.remainingVectors = Arrays.asList(bitReaderArr);
    }

    static void vendorIdsFromRange(BitReader bitReader, BitSet bitSet, FieldDefs fieldDefs, Optional<FieldDefs> optional) {
        vendorIdsFromRange(bitReader, bitSet, fieldDefs.getOffset(bitReader), optional);
    }
}
