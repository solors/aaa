package com.bytedance.adsdk.ugeno.core;

/* renamed from: com.bytedance.adsdk.ugeno.core.VB */
/* loaded from: classes3.dex */
public enum EnumC7069VB {
    UNKNOWN_EVENT("UNKNOWN_EVENT", 0),
    TAP_EVENT("onTap", 1),
    LONG_TAP_EVENT("onLongTap", 2),
    SHAKE_EVENT("onShake", 3),
    TWIST_EVENT("onTwist", 18),
    SLIDE_EVENT("onSlide", 4),
    EXPOSURE_EVENT("onExposure", 5),
    SCROLL_EVENT("onScroll", 6),
    PULL_TO_REFRESH_EVENT("onPullToRefresh", 7),
    LOAD_MORE_EVENT("onLoadMore", 8),
    TIMER("onTimer", 9),
    DELAY("onDelay", 10),
    ANIMATION("onAnimation", 11),
    VIDEO_PROGRESS("onVideoProgress", 12),
    VIDEO_PAUSE("onVideoPause", 13),
    VIDEO_RESUME("onVideoResume", 14),
    VIDEO_FINISH("onVideoFinish", 15),
    VIDEO_PLAY("onVideoPlay", 16),
    DOWN_EVENT("onDown", 17);
    

    /* renamed from: Fy */
    private String f15181Fy;

    /* renamed from: LZ */
    private int f15182LZ;

    EnumC7069VB(String str, int i) {
        this.f15181Fy = str;
        this.f15182LZ = i;
    }

    /* renamed from: bg */
    public int m90156bg() {
        return this.f15182LZ;
    }

    /* renamed from: bg */
    public static EnumC7069VB m90155bg(String str) {
        EnumC7069VB[] values;
        for (EnumC7069VB enumC7069VB : values()) {
            if (enumC7069VB.f15181Fy.equals(str)) {
                return enumC7069VB;
            }
        }
        return UNKNOWN_EVENT;
    }
}
