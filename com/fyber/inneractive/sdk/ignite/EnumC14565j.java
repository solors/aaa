package com.fyber.inneractive.sdk.ignite;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.ignite.j */
/* loaded from: classes4.dex */
public enum EnumC14565j {
    FAILED_TO_BIND_SERVICE("failed to bind"),
    FAILED_TO_RETRIEVE_CREDENTIALS("failed to retrieve credentials"),
    FAILED_TO_AUTHENTICATE("failed to authenticate"),
    INSTALL_TIMEOUT("install timeout"),
    WEBPAGE_NOT_LOADED_BEFORE_SHOW("webpage not loaded before show"),
    LOAD_WEBPAGE_TIMEOUT("webpage timeout"),
    NOT_CONNECTED("not connected"),
    SESSION_EXPIRED("session expired"),
    DOWNLOAD_IS_CANCELLED("Download is cancelled");
    
    private static final Map<String, EnumC14565j> CONSTANTS = new HashMap();
    private final String value;

    static {
        EnumC14565j[] values;
        for (EnumC14565j enumC14565j : values()) {
            CONSTANTS.put(enumC14565j.value, enumC14565j);
        }
    }

    EnumC14565j(String str) {
        this.value = str;
    }

    /* renamed from: a */
    public final String m77794a() {
        return this.value;
    }
}
