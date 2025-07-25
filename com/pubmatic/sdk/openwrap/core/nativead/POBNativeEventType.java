package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public enum POBNativeEventType {
    IMPRESSION(1),
    VIEWABLE_MRC50(2),
    VIEWABLE_MRC100(3),
    VIEWABLE_VIDEO_MRC50(4),
    OMID(555);
    

    /* renamed from: b */
    final int f70722b;

    POBNativeEventType(int i) {
        this.f70722b = i;
    }

    @Nullable
    public static POBNativeEventType getEventType(int i) {
        if (i != 555) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VIEWABLE_VIDEO_MRC50;
                    }
                    return VIEWABLE_MRC100;
                }
                return VIEWABLE_MRC50;
            }
            return IMPRESSION;
        }
        return OMID;
    }

    public int getEventTypeValue() {
        return this.f70722b;
    }
}
