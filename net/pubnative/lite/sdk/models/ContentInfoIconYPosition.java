package net.pubnative.lite.sdk.models;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Locale;

/* loaded from: classes10.dex */
public enum ContentInfoIconYPosition {
    TOP(ViewHierarchyConstants.DIMENSION_TOP_KEY),
    BOTTOM("bottom");
    
    public final String verticalPosition;

    ContentInfoIconYPosition(String str) {
        this.verticalPosition = str;
    }

    public static ContentInfoIconYPosition fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return TOP;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        ContentInfoIconYPosition contentInfoIconYPosition = TOP;
        if (lowerCase.equals(contentInfoIconYPosition.verticalPosition)) {
            return contentInfoIconYPosition;
        }
        ContentInfoIconYPosition contentInfoIconYPosition2 = BOTTOM;
        if (lowerCase.equals(contentInfoIconYPosition2.verticalPosition)) {
            return contentInfoIconYPosition2;
        }
        return contentInfoIconYPosition;
    }

    public static ContentInfoIconYPosition getDefaultYPosition() {
        return BOTTOM;
    }
}
