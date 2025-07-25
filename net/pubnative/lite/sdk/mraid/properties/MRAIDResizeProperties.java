package net.pubnative.lite.sdk.mraid.properties;

import com.maticoo.sdk.mraid.Consts;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class MRAIDResizeProperties {
    public static final int CUSTOM_CLOSE_POSITION_BOTTOM_CENTER = 5;
    public static final int CUSTOM_CLOSE_POSITION_BOTTOM_LEFT = 4;
    public static final int CUSTOM_CLOSE_POSITION_BOTTOM_RIGHT = 6;
    public static final int CUSTOM_CLOSE_POSITION_CENTER = 3;
    public static final int CUSTOM_CLOSE_POSITION_TOP_CENTER = 1;
    public static final int CUSTOM_CLOSE_POSITION_TOP_LEFT = 0;
    public static final int CUSTOM_CLOSE_POSITION_TOP_RIGHT = 2;
    public boolean allowOffscreen;
    public int customClosePosition;
    public int height;
    public int offsetX;
    public int offsetY;
    public int width;

    public MRAIDResizeProperties() {
        this(0, 0, 0, 0, 2, true);
    }

    public static int customClosePositionFromString(String str) {
        int indexOf = Arrays.asList("top-left", Consts.ResizePropertiesCCPositionTopCenter, "top-right", "center", "bottom-left", Consts.ResizePropertiesCCPositionBottomCenter, "bottom-right").indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    public MRAIDResizeProperties(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.width = i;
        this.height = i2;
        this.offsetX = i3;
        this.offsetY = i4;
        this.customClosePosition = i5;
        this.allowOffscreen = z;
    }
}
