package com.amazon.device.ads;

/* loaded from: classes2.dex */
enum MraidPlacementType {
    UNKNOWN,
    INLINE,
    INTERSTITIAL;

    /* renamed from: com.amazon.device.ads.MraidPlacementType$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C36521 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidPlacementType;

        static {
            int[] iArr = new int[MraidPlacementType.values().length];
            $SwitchMap$com$amazon$device$ads$MraidPlacementType = iArr;
            try {
                iArr[MraidPlacementType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidPlacementType[MraidPlacementType.INLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidPlacementType[MraidPlacementType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C36521.$SwitchMap$com$amazon$device$ads$MraidPlacementType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "interstitial";
            }
            return "inline";
        }
        return "unknown";
    }
}
