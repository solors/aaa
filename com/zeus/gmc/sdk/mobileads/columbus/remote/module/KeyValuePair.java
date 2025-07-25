package com.zeus.gmc.sdk.mobileads.columbus.remote.module;

import android.util.Pair;

/* loaded from: classes8.dex */
public class KeyValuePair extends Pair<String, String> {
    public KeyValuePair(String str, String str2) {
        super(str, str2);
        if (str != null) {
            if (str2 != null) {
                return;
            }
            throw new IllegalArgumentException("value may not be null");
        }
        throw new IllegalArgumentException("key may not be null");
    }

    public String getName() {
        return (String) ((Pair) this).first;
    }

    public String getValue() {
        return (String) ((Pair) this).second;
    }
}
