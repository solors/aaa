package com.iabtcf.p398v2;

/* renamed from: com.iabtcf.v2.SegmentType */
/* loaded from: classes6.dex */
public enum SegmentType {
    DEFAULT { // from class: com.iabtcf.v2.SegmentType.1
        @Override // com.iabtcf.p398v2.SegmentType
        public int value() {
            return 0;
        }
    },
    DISCLOSED_VENDOR { // from class: com.iabtcf.v2.SegmentType.2
        @Override // com.iabtcf.p398v2.SegmentType
        public int value() {
            return 1;
        }
    },
    ALLOWED_VENDOR { // from class: com.iabtcf.v2.SegmentType.3
        @Override // com.iabtcf.p398v2.SegmentType
        public int value() {
            return 2;
        }
    },
    PUBLISHER_TC { // from class: com.iabtcf.v2.SegmentType.4
        @Override // com.iabtcf.p398v2.SegmentType
        public int value() {
            return 3;
        }
    },
    INVALID { // from class: com.iabtcf.v2.SegmentType.5
        @Override // com.iabtcf.p398v2.SegmentType
        public int value() {
            return -1;
        }
    };

    public static SegmentType from(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return INVALID;
                    }
                    return PUBLISHER_TC;
                }
                return ALLOWED_VENDOR;
            }
            return DISCLOSED_VENDOR;
        }
        return DEFAULT;
    }

    public abstract int value();
}
