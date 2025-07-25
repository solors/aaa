package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.SameDiTool;

/* loaded from: classes6.dex */
public class BannerSize {
    public static final int DEV_SET_TYPE = 5;
    public static final int LARGE_TYPE = 1;
    public static final int MEDIUM_TYPE = 2;
    public static final int SMART_TYPE = 3;
    public static final int STANDARD_TYPE = 4;
    private int height;
    private int width;

    public BannerSize(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            this.height = i3;
                            this.width = i2;
                            return;
                        }
                        return;
                    }
                    this.height = 50;
                    this.width = 320;
                    return;
                }
                setSmartMode();
                return;
            }
            this.height = 250;
            this.width = 300;
            return;
        }
        this.height = 90;
        this.width = 320;
    }

    private void setSmartMode() {
        if (SameDiTool.m51886h(MBSDKContext.m52746m().m52792c()) < 720) {
            this.height = 50;
            this.width = 320;
            return;
        }
        this.height = 90;
        this.width = 728;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
