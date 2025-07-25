package com.maticoo.sdk.mraid.cache;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class ImageInterceptor extends BaseInterceptor {
    private static final String ACCEPT_HEADER = "Accept";
    private static final List<String> INTERCEPT_URL_EXTENSIONS = new ArrayList<String>() { // from class: com.maticoo.sdk.mraid.cache.ImageInterceptor.1
        {
            add("png");
            add("jpg");
            add("jpeg");
            add("webp");
            add("bmp");
            add("gif");
        }
    };

    public ImageInterceptor(@NonNull Context context) {
        super(context);
    }

    private String getFileExtensionFromUrl(String str) {
        int lastIndexOf;
        try {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (TextUtils.isEmpty(lastPathSegment) || (lastIndexOf = lastPathSegment.lastIndexOf(46)) < 0) {
                return "";
            }
            return lastPathSegment.substring(lastIndexOf + 1);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.maticoo.sdk.mraid.cache.BaseInterceptor
    protected boolean isIntercept(String str, Map<String, String> map) {
        String str2;
        if (INTERCEPT_URL_EXTENSIONS.contains(MimeTypeMap.getFileExtensionFromUrl(str))) {
            return true;
        }
        if (map != null && map.keySet().contains("Accept")) {
            String str3 = map.get("Accept");
            if (str3 != null && str3.startsWith("image")) {
                return true;
            }
            return false;
        }
        int lastIndexOf = str.lastIndexOf(63);
        if (lastIndexOf > 0) {
            str2 = str.substring(lastIndexOf);
        } else {
            str2 = "";
        }
        if (str2.contains("CTCache=1")) {
            return true;
        }
        return false;
    }
}
