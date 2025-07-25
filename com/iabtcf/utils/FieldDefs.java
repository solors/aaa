package com.iabtcf.utils;

import java.util.function.Function;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum CORE_VENDOR_BITRANGE_FIELD uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class FieldDefs {
    private static final /* synthetic */ FieldDefs[] $VALUES;
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final FieldDefs AV_IS_RANGE_ENCODING;
    public static final FieldDefs AV_MAX_VENDOR_ID;
    public static final FieldDefs AV_VENDOR_BITRANGE_FIELD;
    public static final FieldDefs CHAR;
    public static final FieldDefs CORE_NUM_PUB_RESTRICTION;
    public static final FieldDefs CORE_PUB_RESTRICTION_ENTRY;
    public static final FieldDefs CORE_VENDOR_BITRANGE_FIELD;
    public static final FieldDefs CORE_VENDOR_IS_RANGE_ENCODING;
    public static final FieldDefs CORE_VENDOR_LI_BITRANGE_FIELD;
    public static final FieldDefs CORE_VENDOR_LI_IS_RANGE_ENCODING;
    public static final FieldDefs CORE_VENDOR_LI_MAX_VENDOR_ID;
    public static final FieldDefs CORE_VENDOR_MAX_VENDOR_ID;
    public static final FieldDefs DV_IS_RANGE_ENCODING;
    public static final FieldDefs DV_MAX_VENDOR_ID;
    public static final FieldDefs DV_VENDOR_BITRANGE_FIELD;
    public static final FieldDefs END_VENDOR_ID;
    public static final FieldDefs IS_A_RANGE;
    public static final FieldDefs NUM_ENTRIES;
    public static final FieldDefs OOB_SEGMENT_TYPE;
    public static final FieldDefs PPTC_CUSTOM_PURPOSES_CONSENT;
    public static final FieldDefs PPTC_CUSTOM_PURPOSES_LI_TRANSPARENCY;
    public static final FieldDefs PPTC_NUM_CUSTOM_PURPOSES;
    public static final FieldDefs PPTC_PUB_PURPOSES_CONSENT;
    public static final FieldDefs PPTC_PUB_PURPOSES_LI_TRANSPARENCY;
    public static final FieldDefs PPTC_SEGMENT_TYPE;
    public static final FieldDefs PURPOSE_ID;
    public static final FieldDefs RESTRICTION_TYPE;
    public static final FieldDefs START_OR_ONLY_VENDOR_ID;
    public static final FieldDefs TIMESTAMP;
    public static final FieldDefs V1_CMP_ID;
    public static final FieldDefs V1_CMP_VERSION;
    public static final FieldDefs V1_CONSENT_LANGUAGE;
    public static final FieldDefs V1_CONSENT_SCREEN;
    public static final FieldDefs V1_CREATED;
    public static final FieldDefs V1_LAST_UPDATED;
    public static final FieldDefs V1_PPC_CUSTOM_PURPOSES_BITFIELD;
    public static final FieldDefs V1_PPC_NUMBER_CUSTOM_PURPOSES;
    public static final FieldDefs V1_PPC_PUBLISHER_PURPOSES_VERSION;
    public static final FieldDefs V1_PPC_STANDARD_PURPOSES_ALLOWED;
    public static final FieldDefs V1_PURPOSES_ALLOW;
    public static final FieldDefs V1_VENDOR_BITRANGE_FIELD;
    public static final FieldDefs V1_VENDOR_DEFAULT_CONSENT;
    public static final FieldDefs V1_VENDOR_IS_RANGE_ENCODING;
    public static final FieldDefs V1_VENDOR_LIST_VERSION;
    public static final FieldDefs V1_VENDOR_MAX_VENDOR_ID;
    public static final FieldDefs V1_VENDOR_NUM_ENTRIES;
    public static final FieldDefs V1_VERSION;
    private volatile boolean isDynamic;
    private volatile boolean isDynamicInit;
    private LengthSupplier length;
    private OffsetSupplier offset;
    public static final FieldDefs CORE_VERSION = new FieldDefs("CORE_VERSION", 0, 6, 0);
    public static final FieldDefs CORE_CREATED = new FieldDefs("CORE_CREATED", 1, 36);
    public static final FieldDefs CORE_LAST_UPDATED = new FieldDefs("CORE_LAST_UPDATED", 2, 36);
    public static final FieldDefs CORE_CMP_ID = new FieldDefs("CORE_CMP_ID", 3, 12);
    public static final FieldDefs CORE_CMP_VERSION = new FieldDefs("CORE_CMP_VERSION", 4, 12);
    public static final FieldDefs CORE_CONSENT_SCREEN = new FieldDefs("CORE_CONSENT_SCREEN", 5, 6);
    public static final FieldDefs CORE_CONSENT_LANGUAGE = new FieldDefs("CORE_CONSENT_LANGUAGE", 6, 12);
    public static final FieldDefs CORE_VENDOR_LIST_VERSION = new FieldDefs("CORE_VENDOR_LIST_VERSION", 7, 12);
    public static final FieldDefs CORE_TCF_POLICY_VERSION = new FieldDefs("CORE_TCF_POLICY_VERSION", 8, 6);
    public static final FieldDefs CORE_IS_SERVICE_SPECIFIC = new FieldDefs("CORE_IS_SERVICE_SPECIFIC", 9, 1);
    public static final FieldDefs CORE_USE_NON_STANDARD_STOCKS = new FieldDefs("CORE_USE_NON_STANDARD_STOCKS", 10, 1);
    public static final FieldDefs CORE_SPECIAL_FEATURE_OPT_INS = new FieldDefs("CORE_SPECIAL_FEATURE_OPT_INS", 11, 12);
    public static final FieldDefs CORE_PURPOSES_CONSENT = new FieldDefs("CORE_PURPOSES_CONSENT", 12, 24);
    public static final FieldDefs CORE_PURPOSES_LI_TRANSPARENCY = new FieldDefs("CORE_PURPOSES_LI_TRANSPARENCY", 13, 24);
    public static final FieldDefs CORE_PURPOSE_ONE_TREATMENT = new FieldDefs("CORE_PURPOSE_ONE_TREATMENT", 14, 1);
    public static final FieldDefs CORE_PUBLISHER_CC = new FieldDefs("CORE_PUBLISHER_CC", 15, 12);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class BitRangeFieldUtils {
        private BitRangeFieldUtils() {
        }

        public static int calculateBitLength(BitReader bitReader, int i) {
            return bitReader.readBits16(i);
        }

        public static int calculateBitRangeLength(BitReader bitReader, int i, int i2) {
            if (!bitReader.readBits1(i)) {
                return calculateBitLength(bitReader, i2);
            }
            return calculateRangeLength(bitReader, i + 1);
        }

        public static int calculateRangeLength(BitReader bitReader, int i) {
            int i2;
            int readBits12 = bitReader.readBits12(i);
            int length = FieldDefs.NUM_ENTRIES.getLength(bitReader) + i;
            for (int i3 = 0; i3 < readBits12; i3++) {
                int length2 = FieldDefs.IS_A_RANGE.getLength(bitReader) + FieldDefs.START_OR_ONLY_VENDOR_ID.getLength(bitReader);
                if (bitReader.readBits1(length)) {
                    i2 = FieldDefs.END_VENDOR_ID.getLength(bitReader);
                } else {
                    i2 = 0;
                }
                length += length2 + i2;
            }
            return length - i;
        }

        public static LengthSupplier lengthSupplier(final FieldDefs fieldDefs, final FieldDefs fieldDefs2) {
            return new LengthSupplier() { // from class: com.iabtcf.utils.FieldDefs.BitRangeFieldUtils.1
                @Override // com.iabtcf.utils.FieldDefs.LengthSupplier
                public boolean isDynamic() {
                    return true;
                }

                @Override // java.util.function.Function
                public Integer apply(BitReader bitReader) {
                    return Integer.valueOf(BitRangeFieldUtils.calculateBitRangeLength(bitReader, FieldDefs.this.getOffset(bitReader), fieldDefs2.getOffset(bitReader)));
                }
            };
        }

        public static LengthSupplier lengthSupplierV1() {
            return new LengthSupplier() { // from class: com.iabtcf.utils.FieldDefs.BitRangeFieldUtils.2
                @Override // com.iabtcf.utils.FieldDefs.LengthSupplier
                public boolean isDynamic() {
                    return true;
                }

                @Override // java.util.function.Function
                public Integer apply(BitReader bitReader) {
                    if (!bitReader.readBits1(FieldDefs.V1_VENDOR_IS_RANGE_ENCODING.getOffset(bitReader))) {
                        return Integer.valueOf(BitRangeFieldUtils.calculateBitLength(bitReader, FieldDefs.V1_VENDOR_MAX_VENDOR_ID.getOffset(bitReader)));
                    }
                    return Integer.valueOf(BitRangeFieldUtils.calculateRangeLength(bitReader, FieldDefs.V1_VENDOR_NUM_ENTRIES.getOffset(bitReader)));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public interface LengthSupplier extends Function<BitReader, Integer> {
        static LengthSupplier constant(final int i) {
            return new LengthSupplier() { // from class: com.iabtcf.utils.FieldDefs.LengthSupplier.1
                @Override // com.iabtcf.utils.FieldDefs.LengthSupplier
                public boolean isDynamic() {
                    return false;
                }

                @Override // java.util.function.Function
                public Integer apply(BitReader bitReader) {
                    return Integer.valueOf(i);
                }
            };
        }

        boolean isDynamic();
    }

    /* loaded from: classes6.dex */
    private static abstract class MemoizingFunction implements LengthSupplier, OffsetSupplier, Function<BitReader, Integer> {
        private volatile boolean dynamicInitialized;
        private volatile boolean isDynamic;
        private volatile Integer value;

        private MemoizingFunction() {
            this.dynamicInitialized = false;
            this.isDynamic = false;
        }

        private boolean isDynamicPvt() {
            if (!this.dynamicInitialized) {
                this.isDynamic = isDynamic();
                this.dynamicInitialized = true;
            }
            return this.isDynamic;
        }

        public abstract Integer doCompute(BitReader bitReader);

        @Override // com.iabtcf.utils.FieldDefs.LengthSupplier
        public abstract boolean isDynamic();

        @Override // java.util.function.Function
        public Integer apply(BitReader bitReader) {
            if (isDynamicPvt()) {
                return doCompute(bitReader);
            }
            if (this.value == null) {
                this.value = doCompute(bitReader);
            }
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public interface OffsetSupplier extends Function<BitReader, Integer> {
        public static final OffsetSupplier NOT_SUPPORTED = new OffsetSupplier() { // from class: com.iabtcf.utils.FieldDefs.OffsetSupplier.1
            @Override // com.iabtcf.utils.FieldDefs.OffsetSupplier
            public boolean isDynamic() {
                return false;
            }

            @Override // java.util.function.Function
            public Integer apply(BitReader bitReader) {
                throw new UnsupportedOperationException();
            }
        };

        static OffsetSupplier constant(final int i) {
            return new OffsetSupplier() { // from class: com.iabtcf.utils.FieldDefs.OffsetSupplier.2
                @Override // com.iabtcf.utils.FieldDefs.OffsetSupplier
                public boolean isDynamic() {
                    return false;
                }

                @Override // java.util.function.Function
                public Integer apply(BitReader bitReader) {
                    return Integer.valueOf(i);
                }
            };
        }

        static OffsetSupplier from(final FieldDefs fieldDefs) {
            return new MemoizingFunction() { // from class: com.iabtcf.utils.FieldDefs.OffsetSupplier.3
                {
                    super();
                }

                @Override // com.iabtcf.utils.FieldDefs.MemoizingFunction
                public Integer doCompute(BitReader bitReader) {
                    return Integer.valueOf(FieldDefs.this.getLength(bitReader) + FieldDefs.this.getOffset(bitReader));
                }

                @Override // com.iabtcf.utils.FieldDefs.MemoizingFunction, com.iabtcf.utils.FieldDefs.LengthSupplier
                public boolean isDynamic() {
                    return FieldDefs.this.isDynamic();
                }
            };
        }

        static OffsetSupplier fromPrevious(final FieldDefs fieldDefs) {
            return new MemoizingFunction() { // from class: com.iabtcf.utils.FieldDefs.OffsetSupplier.4
                {
                    super();
                }

                @Override // com.iabtcf.utils.FieldDefs.MemoizingFunction
                public Integer doCompute(BitReader bitReader) {
                    FieldDefs fieldDefs2 = FieldDefs.values()[FieldDefs.this.ordinal() - 1];
                    return Integer.valueOf(fieldDefs2.getLength(bitReader) + fieldDefs2.getOffset(bitReader));
                }

                @Override // com.iabtcf.utils.FieldDefs.MemoizingFunction, com.iabtcf.utils.FieldDefs.LengthSupplier
                public boolean isDynamic() {
                    return FieldDefs.values()[FieldDefs.this.ordinal() - 1].isDynamic();
                }
            };
        }

        boolean isDynamic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class PublisherRestrictionUtils {
        private PublisherRestrictionUtils() {
        }

        public static int calculateBitRangelength(BitReader bitReader, int i) {
            int readBits12 = bitReader.readBits12(i);
            int length = FieldDefs.CORE_NUM_PUB_RESTRICTION.getLength(bitReader) + i;
            for (int i2 = 0; i2 < readBits12; i2++) {
                int length2 = length + FieldDefs.PURPOSE_ID.getLength(bitReader) + FieldDefs.RESTRICTION_TYPE.getLength(bitReader);
                length = length2 + BitRangeFieldUtils.calculateRangeLength(bitReader, length2);
            }
            return length - i;
        }

        public static LengthSupplier lengthSupplier(final FieldDefs fieldDefs) {
            return new LengthSupplier() { // from class: com.iabtcf.utils.FieldDefs.PublisherRestrictionUtils.1
                @Override // com.iabtcf.utils.FieldDefs.LengthSupplier
                public boolean isDynamic() {
                    return true;
                }

                @Override // java.util.function.Function
                public Integer apply(BitReader bitReader) {
                    return Integer.valueOf(PublisherRestrictionUtils.calculateBitRangelength(bitReader, FieldDefs.this.getOffset(bitReader)));
                }
            };
        }
    }

    private static /* synthetic */ FieldDefs[] $values() {
        return new FieldDefs[]{CORE_VERSION, CORE_CREATED, CORE_LAST_UPDATED, CORE_CMP_ID, CORE_CMP_VERSION, CORE_CONSENT_SCREEN, CORE_CONSENT_LANGUAGE, CORE_VENDOR_LIST_VERSION, CORE_TCF_POLICY_VERSION, CORE_IS_SERVICE_SPECIFIC, CORE_USE_NON_STANDARD_STOCKS, CORE_SPECIAL_FEATURE_OPT_INS, CORE_PURPOSES_CONSENT, CORE_PURPOSES_LI_TRANSPARENCY, CORE_PURPOSE_ONE_TREATMENT, CORE_PUBLISHER_CC, CORE_VENDOR_MAX_VENDOR_ID, CORE_VENDOR_IS_RANGE_ENCODING, CORE_VENDOR_BITRANGE_FIELD, CORE_VENDOR_LI_MAX_VENDOR_ID, CORE_VENDOR_LI_IS_RANGE_ENCODING, CORE_VENDOR_LI_BITRANGE_FIELD, CORE_NUM_PUB_RESTRICTION, CORE_PUB_RESTRICTION_ENTRY, OOB_SEGMENT_TYPE, DV_MAX_VENDOR_ID, DV_IS_RANGE_ENCODING, DV_VENDOR_BITRANGE_FIELD, AV_MAX_VENDOR_ID, AV_IS_RANGE_ENCODING, AV_VENDOR_BITRANGE_FIELD, PPTC_SEGMENT_TYPE, PPTC_PUB_PURPOSES_CONSENT, PPTC_PUB_PURPOSES_LI_TRANSPARENCY, PPTC_NUM_CUSTOM_PURPOSES, PPTC_CUSTOM_PURPOSES_CONSENT, PPTC_CUSTOM_PURPOSES_LI_TRANSPARENCY, NUM_ENTRIES, IS_A_RANGE, START_OR_ONLY_VENDOR_ID, END_VENDOR_ID, TIMESTAMP, PURPOSE_ID, RESTRICTION_TYPE, CHAR, V1_VERSION, V1_CREATED, V1_LAST_UPDATED, V1_CMP_ID, V1_CMP_VERSION, V1_CONSENT_SCREEN, V1_CONSENT_LANGUAGE, V1_VENDOR_LIST_VERSION, V1_PURPOSES_ALLOW, V1_VENDOR_MAX_VENDOR_ID, V1_VENDOR_IS_RANGE_ENCODING, V1_VENDOR_BITRANGE_FIELD, V1_VENDOR_DEFAULT_CONSENT, V1_VENDOR_NUM_ENTRIES, V1_PPC_PUBLISHER_PURPOSES_VERSION, V1_PPC_STANDARD_PURPOSES_ALLOWED, V1_PPC_NUMBER_CUSTOM_PURPOSES, V1_PPC_CUSTOM_PURPOSES_BITFIELD};
    }

    static {
        FieldDefs fieldDefs = new FieldDefs("CORE_VENDOR_MAX_VENDOR_ID", 16, 16);
        CORE_VENDOR_MAX_VENDOR_ID = fieldDefs;
        FieldDefs fieldDefs2 = new FieldDefs("CORE_VENDOR_IS_RANGE_ENCODING", 17, 1);
        CORE_VENDOR_IS_RANGE_ENCODING = fieldDefs2;
        CORE_VENDOR_BITRANGE_FIELD = new FieldDefs("CORE_VENDOR_BITRANGE_FIELD", 18, BitRangeFieldUtils.lengthSupplier(fieldDefs2, fieldDefs));
        FieldDefs fieldDefs3 = new FieldDefs("CORE_VENDOR_LI_MAX_VENDOR_ID", 19, 16);
        CORE_VENDOR_LI_MAX_VENDOR_ID = fieldDefs3;
        FieldDefs fieldDefs4 = new FieldDefs("CORE_VENDOR_LI_IS_RANGE_ENCODING", 20, 1);
        CORE_VENDOR_LI_IS_RANGE_ENCODING = fieldDefs4;
        CORE_VENDOR_LI_BITRANGE_FIELD = new FieldDefs("CORE_VENDOR_LI_BITRANGE_FIELD", 21, BitRangeFieldUtils.lengthSupplier(fieldDefs4, fieldDefs3));
        FieldDefs fieldDefs5 = new FieldDefs("CORE_NUM_PUB_RESTRICTION", 22, 12);
        CORE_NUM_PUB_RESTRICTION = fieldDefs5;
        CORE_PUB_RESTRICTION_ENTRY = new FieldDefs("CORE_PUB_RESTRICTION_ENTRY", 23, PublisherRestrictionUtils.lengthSupplier(fieldDefs5));
        FieldDefs fieldDefs6 = new FieldDefs("OOB_SEGMENT_TYPE", 24, 3, 0);
        OOB_SEGMENT_TYPE = fieldDefs6;
        FieldDefs fieldDefs7 = new FieldDefs("DV_MAX_VENDOR_ID", 25, 16, fieldDefs6);
        DV_MAX_VENDOR_ID = fieldDefs7;
        FieldDefs fieldDefs8 = new FieldDefs("DV_IS_RANGE_ENCODING", 26, 1);
        DV_IS_RANGE_ENCODING = fieldDefs8;
        DV_VENDOR_BITRANGE_FIELD = new FieldDefs("DV_VENDOR_BITRANGE_FIELD", 27, BitRangeFieldUtils.lengthSupplier(fieldDefs8, fieldDefs7));
        FieldDefs fieldDefs9 = new FieldDefs("AV_MAX_VENDOR_ID", 28, 16, fieldDefs6);
        AV_MAX_VENDOR_ID = fieldDefs9;
        FieldDefs fieldDefs10 = new FieldDefs("AV_IS_RANGE_ENCODING", 29, 1);
        AV_IS_RANGE_ENCODING = fieldDefs10;
        AV_VENDOR_BITRANGE_FIELD = new FieldDefs("AV_VENDOR_BITRANGE_FIELD", 30, BitRangeFieldUtils.lengthSupplier(fieldDefs10, fieldDefs9));
        PPTC_SEGMENT_TYPE = new FieldDefs("PPTC_SEGMENT_TYPE", 31, 3, 0);
        PPTC_PUB_PURPOSES_CONSENT = new FieldDefs("PPTC_PUB_PURPOSES_CONSENT", 32, 24);
        PPTC_PUB_PURPOSES_LI_TRANSPARENCY = new FieldDefs("PPTC_PUB_PURPOSES_LI_TRANSPARENCY", 33, 24);
        PPTC_NUM_CUSTOM_PURPOSES = new FieldDefs("PPTC_NUM_CUSTOM_PURPOSES", 34, 6);
        PPTC_CUSTOM_PURPOSES_CONSENT = new FieldDefs("PPTC_CUSTOM_PURPOSES_CONSENT", 35, new LengthSupplier() { // from class: com.iabtcf.utils.FieldDefs.1
            @Override // com.iabtcf.utils.FieldDefs.LengthSupplier
            public boolean isDynamic() {
                return true;
            }

            @Override // java.util.function.Function
            public Integer apply(BitReader bitReader) {
                return Integer.valueOf(bitReader.readBits6(FieldDefs.PPTC_NUM_CUSTOM_PURPOSES.getOffset(bitReader)));
            }
        });
        PPTC_CUSTOM_PURPOSES_LI_TRANSPARENCY = new FieldDefs("PPTC_CUSTOM_PURPOSES_LI_TRANSPARENCY", 36, new LengthSupplier() { // from class: com.iabtcf.utils.FieldDefs.2
            @Override // com.iabtcf.utils.FieldDefs.LengthSupplier
            public boolean isDynamic() {
                return true;
            }

            @Override // java.util.function.Function
            public Integer apply(BitReader bitReader) {
                return Integer.valueOf(FieldDefs.PPTC_CUSTOM_PURPOSES_CONSENT.getLength(bitReader));
            }
        });
        OffsetSupplier offsetSupplier = OffsetSupplier.NOT_SUPPORTED;
        NUM_ENTRIES = new FieldDefs("NUM_ENTRIES", 37, 12, offsetSupplier);
        IS_A_RANGE = new FieldDefs("IS_A_RANGE", 38, 1, offsetSupplier);
        START_OR_ONLY_VENDOR_ID = new FieldDefs("START_OR_ONLY_VENDOR_ID", 39, 16, offsetSupplier);
        END_VENDOR_ID = new FieldDefs("END_VENDOR_ID", 40, 16, offsetSupplier);
        TIMESTAMP = new FieldDefs("TIMESTAMP", 41, 36, offsetSupplier);
        PURPOSE_ID = new FieldDefs("PURPOSE_ID", 42, 6, offsetSupplier);
        RESTRICTION_TYPE = new FieldDefs("RESTRICTION_TYPE", 43, 2, offsetSupplier);
        CHAR = new FieldDefs("CHAR", 44, 6, offsetSupplier);
        V1_VERSION = new FieldDefs("V1_VERSION", 45, 6, 0);
        V1_CREATED = new FieldDefs("V1_CREATED", 46, 36);
        V1_LAST_UPDATED = new FieldDefs("V1_LAST_UPDATED", 47, 36);
        V1_CMP_ID = new FieldDefs("V1_CMP_ID", 48, 12);
        V1_CMP_VERSION = new FieldDefs("V1_CMP_VERSION", 49, 12);
        V1_CONSENT_SCREEN = new FieldDefs("V1_CONSENT_SCREEN", 50, 6);
        V1_CONSENT_LANGUAGE = new FieldDefs("V1_CONSENT_LANGUAGE", 51, 12);
        FieldDefs fieldDefs11 = new FieldDefs("V1_VENDOR_LIST_VERSION", 52, 12);
        V1_VENDOR_LIST_VERSION = fieldDefs11;
        V1_PURPOSES_ALLOW = new FieldDefs("V1_PURPOSES_ALLOW", 53, 24);
        V1_VENDOR_MAX_VENDOR_ID = new FieldDefs("V1_VENDOR_MAX_VENDOR_ID", 54, 16);
        FieldDefs fieldDefs12 = new FieldDefs("V1_VENDOR_IS_RANGE_ENCODING", 55, 1);
        V1_VENDOR_IS_RANGE_ENCODING = fieldDefs12;
        V1_VENDOR_BITRANGE_FIELD = new FieldDefs("V1_VENDOR_BITRANGE_FIELD", 56, BitRangeFieldUtils.lengthSupplierV1());
        V1_VENDOR_DEFAULT_CONSENT = new FieldDefs("V1_VENDOR_DEFAULT_CONSENT", 57, 1, fieldDefs12);
        V1_VENDOR_NUM_ENTRIES = new FieldDefs("V1_VENDOR_NUM_ENTRIES", 58, 12);
        V1_PPC_PUBLISHER_PURPOSES_VERSION = new FieldDefs("V1_PPC_PUBLISHER_PURPOSES_VERSION", 59, 12, fieldDefs11);
        V1_PPC_STANDARD_PURPOSES_ALLOWED = new FieldDefs("V1_PPC_STANDARD_PURPOSES_ALLOWED", 60, 24);
        V1_PPC_NUMBER_CUSTOM_PURPOSES = new FieldDefs("V1_PPC_NUMBER_CUSTOM_PURPOSES", 61, 6);
        V1_PPC_CUSTOM_PURPOSES_BITFIELD = new FieldDefs("V1_PPC_CUSTOM_PURPOSES_BITFIELD", 62, new LengthSupplier() { // from class: com.iabtcf.utils.FieldDefs.3
            @Override // com.iabtcf.utils.FieldDefs.LengthSupplier
            public boolean isDynamic() {
                return true;
            }

            @Override // java.util.function.Function
            public Integer apply(BitReader bitReader) {
                return Integer.valueOf(C18821b.m61308a(bitReader.readBits6(FieldDefs.V1_PPC_NUMBER_CUSTOM_PURPOSES.getOffset(bitReader))));
            }
        });
        $VALUES = $values();
    }

    private FieldDefs(String str, int i, int i2, FieldDefs fieldDefs) {
        this.isDynamic = false;
        this.isDynamicInit = false;
        this.length = LengthSupplier.constant(i2);
        this.offset = OffsetSupplier.from(fieldDefs);
    }

    public static FieldDefs valueOf(String str) {
        return (FieldDefs) Enum.valueOf(FieldDefs.class, str);
    }

    public static FieldDefs[] values() {
        return (FieldDefs[]) $VALUES.clone();
    }

    public int getEnd(BitReader bitReader) {
        return getLength(bitReader) + getOffset(bitReader);
    }

    public int getLength() {
        return this.length.apply(null).intValue();
    }

    public int getOffset(BitReader bitReader) {
        return bitReader.cache.getOffset(this, this.offset).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isDynamic() {
        boolean z;
        if (!this.isDynamicInit) {
            if (!this.offset.isDynamic() && !this.length.isDynamic()) {
                z = false;
            } else {
                z = true;
            }
            this.isDynamic = z;
            this.isDynamicInit = true;
        }
        return this.isDynamic;
    }

    public int getLength(BitReader bitReader) {
        return bitReader.cache.getLength(this, this.length).intValue();
    }

    private FieldDefs(String str, int i, int i2, OffsetSupplier offsetSupplier) {
        this.isDynamic = false;
        this.isDynamicInit = false;
        this.length = LengthSupplier.constant(i2);
        this.offset = offsetSupplier;
    }

    private FieldDefs(String str, int i, int i2, int i3) {
        this.isDynamic = false;
        this.isDynamicInit = false;
        this.length = LengthSupplier.constant(i2);
        this.offset = OffsetSupplier.constant(i3);
    }

    private FieldDefs(String str, int i, LengthSupplier lengthSupplier) {
        this.isDynamic = false;
        this.isDynamicInit = false;
        this.length = lengthSupplier;
        this.offset = OffsetSupplier.fromPrevious(this);
    }

    private FieldDefs(String str, int i, int i2) {
        this.isDynamic = false;
        this.isDynamicInit = false;
        this.length = LengthSupplier.constant(i2);
        this.offset = OffsetSupplier.fromPrevious(this);
    }
}
