package net.pubnative.lite.sdk.mraid.properties;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class MRAIDOrientationProperties {
    public static final int FORCE_ORIENTATION_LANDSCAPE = 1;
    public static final int FORCE_ORIENTATION_NONE = 2;
    public static final int FORCE_ORIENTATION_PORTRAIT = 0;
    public boolean allowOrientationChange;
    public int forceOrientation;

    public MRAIDOrientationProperties() {
        this(true, 2);
    }

    public static int forceOrientationFromString(String str) {
        int indexOf = Arrays.asList("portrait", "landscape", "none").indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    public String forceOrientationString() {
        int i = this.forceOrientation;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return "error";
                }
                return "none";
            }
            return "landscape";
        }
        return "portrait";
    }

    public MRAIDOrientationProperties(boolean z, int i) {
        this.allowOrientationChange = z;
        this.forceOrientation = i;
    }
}
