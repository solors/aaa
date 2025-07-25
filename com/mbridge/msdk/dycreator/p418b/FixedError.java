package com.mbridge.msdk.dycreator.p418b;

import com.pubmatic.sdk.video.player.POBPlayer;

/* renamed from: com.mbridge.msdk.dycreator.b.b */
/* loaded from: classes6.dex */
public enum FixedError {
    NOT_FOUND_VIEWOPTION(-101, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-102, "context is null"),
    FILE_CREATE_VIEW_FILE(-103, "file create view is null"),
    CAMPAIGNEX_IS_NULL(-104, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(-105, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(-106, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(-107, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(POBPlayer.MEDIA_DISPLAY_ERROR, "dynamic_option is not exits");
    

    /* renamed from: i */
    private int f55579i;

    /* renamed from: j */
    private String f55580j;

    FixedError(int i, String str) {
        this.f55579i = i;
        this.f55580j = str;
    }

    /* renamed from: a */
    public final int m53040a() {
        return this.f55579i;
    }

    /* renamed from: b */
    public final String m53039b() {
        return this.f55580j;
    }
}
