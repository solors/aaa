package com.meevii.adsdk.common;

import android.content.Context;
import com.meevii.adsdk.common.util.DeviceUtil;

/* loaded from: classes6.dex */
public enum BannerSize {
    HEIGHT_SMALL(50),
    HEIGHT_SMALL_60(60),
    HEIGHT_MEDIUM(90),
    HEIGHT_LARGE(250);
    
    private int heightDp;

    BannerSize(int i) {
        this.heightDp = i;
    }

    public static BannerSize getDefault() {
        return HEIGHT_SMALL;
    }

    public static BannerSize getTabletDefault() {
        return HEIGHT_MEDIUM;
    }

    public int getHeightDp() {
        return this.heightDp;
    }

    public int getHeightPx(Context context) {
        return DeviceUtil.getPxFromDP(context, this.heightDp);
    }
}
