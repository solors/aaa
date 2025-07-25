package net.pubnative.lite.sdk.models;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes10.dex */
public enum ContentInfoIconAction {
    EXPAND("expand"),
    OPEN("open");
    
    public final String action;

    ContentInfoIconAction(String str) {
        this.action = str;
    }

    public static ContentInfoIconAction fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return EXPAND;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        ContentInfoIconAction contentInfoIconAction = EXPAND;
        if (lowerCase.equals(contentInfoIconAction.action)) {
            return contentInfoIconAction;
        }
        ContentInfoIconAction contentInfoIconAction2 = OPEN;
        if (lowerCase.equals(contentInfoIconAction2.action)) {
            return contentInfoIconAction2;
        }
        return contentInfoIconAction;
    }
}
