package com.smaato.sdk.video.vast.parser;

import android.util.Xml;
import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public final class XmlEncodingUtils {
    private XmlEncodingUtils() {
    }

    public static boolean isSupported(@NonNull String str) {
        try {
            if (Xml.findEncodingByName(str) == null) {
                return false;
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }
}
