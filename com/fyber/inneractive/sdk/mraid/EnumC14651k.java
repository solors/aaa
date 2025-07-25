package com.fyber.inneractive.sdk.mraid;

import com.maticoo.sdk.mraid.Consts;

/* renamed from: com.fyber.inneractive.sdk.mraid.k */
/* loaded from: classes4.dex */
public enum EnumC14651k {
    CLOSE("close"),
    EXPAND("expand"),
    USECUSTOMCLOSE("usecustomclose"),
    OPEN("open"),
    RESIZE("resize"),
    GET_RESIZE_PROPERTIES("getResizeProperties"),
    SET_RESIZE_PROPERTIES(Consts.CommandSetResizeProperties),
    SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
    PLAY_VIDEO("playVideo"),
    STORE_PICTURE("storePicture"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION("getDefaultPosition"),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    CREATE_CALENDAR_EVENT(Consts.CommandCreateCalendarEvent),
    UNSPECIFIED("");
    
    private String mCommand;

    EnumC14651k(String str) {
        this.mCommand = str;
    }

    /* renamed from: a */
    public static EnumC14651k m77740a(String str) {
        EnumC14651k[] values;
        for (EnumC14651k enumC14651k : values()) {
            if (enumC14651k.mCommand.equals(str)) {
                return enumC14651k;
            }
        }
        return UNSPECIFIED;
    }

    /* renamed from: a */
    public final String m77741a() {
        return this.mCommand;
    }
}
