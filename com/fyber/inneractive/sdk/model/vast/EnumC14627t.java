package com.fyber.inneractive.sdk.model.vast;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.t */
/* loaded from: classes4.dex */
public enum EnumC14627t {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    MEDIA_TYPE_X_MPEG("application/x-mpegURL"),
    UNKNOWN("unknown");
    
    private static final Map<String, EnumC14627t> sMediaTypeMap = new HashMap();
    final String mimeType;

    static {
        EnumC14627t[] values;
        for (EnumC14627t enumC14627t : values()) {
            sMediaTypeMap.put(enumC14627t.mimeType, enumC14627t);
        }
    }

    EnumC14627t(String str) {
        this.mimeType = str;
    }

    /* renamed from: a */
    public static EnumC14627t m77748a(String str) {
        Map<String, EnumC14627t> map = sMediaTypeMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return UNKNOWN;
    }
}
