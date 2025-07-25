package com.unity3d.services.ads.gmascar.managers;

/* loaded from: classes7.dex */
public enum ScarBiddingManagerType {
    DISABLED("dis"),
    EAGER("eag");
    
    private final String name;

    /* loaded from: classes7.dex */
    private static class Constants {
        private static final String DIS = "dis";
        private static final String EAG = "eag";

        private Constants() {
        }
    }

    ScarBiddingManagerType(String str) {
        this.name = str;
    }

    public static ScarBiddingManagerType fromName(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 99470) {
            if (hashCode == 100171 && str.equals("eag")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("dis")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            return DISABLED;
        }
        return EAGER;
    }

    public String getName() {
        return this.name;
    }
}
