package com.iabtcf.p398v2;

/* renamed from: com.iabtcf.v2.RestrictionType */
/* loaded from: classes6.dex */
public enum RestrictionType {
    NOT_ALLOWED,
    REQUIRE_CONSENT,
    REQUIRE_LEGITIMATE_INTEREST,
    UNDEFINED;

    public static RestrictionType from(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return NOT_ALLOWED;
                    }
                    return UNDEFINED;
                }
                return REQUIRE_LEGITIMATE_INTEREST;
            }
            return REQUIRE_CONSENT;
        }
        return NOT_ALLOWED;
    }
}
