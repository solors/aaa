package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.model.vast.k */
/* loaded from: classes4.dex */
public enum EnumC14618k {
    Jpeg("image/jpeg", "jpeg"),
    Jpg("image/jpg", "jpg"),
    Gif("image/gif", "gif"),
    Png("image/png", "png");
    
    private static final Map<String, EnumC14618k> sCreativeTypeMap = new HashMap();
    public final String extension;
    public final String mimeType;

    static {
        EnumC14618k[] values;
        for (EnumC14618k enumC14618k : values()) {
            sCreativeTypeMap.put(enumC14618k.mimeType, enumC14618k);
        }
    }

    EnumC14618k(String str, String str2) {
        this.mimeType = str;
        this.extension = str2;
    }

    /* renamed from: a */
    public static EnumC14618k m77751a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return sCreativeTypeMap.get(str.toLowerCase());
        }
        return null;
    }
}
