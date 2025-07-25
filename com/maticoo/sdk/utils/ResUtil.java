package com.maticoo.sdk.utils;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.maticoo.sdk.p405ad.utils.Cache;
import com.maticoo.sdk.utils.constant.CommonConstants;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class ResUtil {
    public static String getResourceName(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String[] split = str.split(RemoteSettings.FORWARD_SLASH_STRING);
            return split[split.length - 1].split("\\.")[0];
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean isGifFile(String str) {
        try {
            return str.endsWith("gif");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        File cacheFile;
        FileInputStream fileInputStream;
        try {
            DeveloperLog.LogD(str);
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            cacheFile = Cache.getCacheFile(webView.getContext(), str, CommonConstants.FILE_HEADER_SUFFIX);
        } catch (Throwable th) {
            DeveloperLog.LogD("ResUtil", th);
            CrashUtil.getSingleton().reportSDKException(th);
        }
        if (cacheFile == null || !cacheFile.exists() || !TextUtils.isEmpty(Cache.getValueFromFile(cacheFile, "Location"))) {
            return null;
        }
        boolean existCache = Cache.existCache(webView.getContext(), str);
        DeveloperLog.LogD("url:" + str + "   existCache = " + existCache);
        if (existCache) {
            try {
                String valueFromFile = Cache.getValueFromFile(cacheFile, "Content-Type");
                if (TextUtils.isEmpty(valueFromFile)) {
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                    if (TextUtils.equals("js", fileExtensionFromUrl.toLowerCase())) {
                        valueFromFile = "application/x-javascript";
                    } else {
                        valueFromFile = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                    }
                }
                if (TextUtils.isEmpty(valueFromFile) || (fileInputStream = IOUtil.getFileInputStream(Cache.getCacheFile(webView.getContext().getApplicationContext(), str, null))) == null) {
                    return null;
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(valueFromFile, null, fileInputStream);
                HashMap hashMap = new HashMap();
                hashMap.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
                webResourceResponse.setResponseHeaders(hashMap);
                return webResourceResponse;
            } catch (Exception e) {
                DeveloperLog.LogD("ResUtil", e);
                CrashUtil.getSingleton().reportSDKException(e);
            }
        }
        return null;
    }
}
