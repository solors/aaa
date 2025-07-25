package com.maticoo.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.maticoo.sdk.p405ad.utils.Cache;
import com.maticoo.sdk.utils.constant.CommonConstants;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.HeaderUtils;
import com.maticoo.sdk.utils.request.network.AdRequest;
import com.maticoo.sdk.utils.request.network.Headers;
import com.maticoo.sdk.utils.request.network.Response;
import java.io.File;
import java.net.URL;

/* loaded from: classes6.dex */
public class ResDownloader {
    private static void deleteFileWhenError(String str) {
        File cacheFile = Cache.getCacheFile(ApplicationUtil.getInstance().getApplicationContext(), str, null);
        if (cacheFile != null && cacheFile.exists()) {
            DeveloperLog.LogD("ResDownLoader", "delete content file when error : " + cacheFile.delete());
        }
        File cacheFile2 = Cache.getCacheFile(ApplicationUtil.getInstance().getApplicationContext(), str, CommonConstants.FILE_HEADER_SUFFIX);
        if (cacheFile2 != null && cacheFile2.exists()) {
            DeveloperLog.LogD("ResDownLoader", "delete header file when error : " + cacheFile2.delete());
        }
    }

    public static File downloadFile(String str) throws Exception {
        Throwable th;
        Response response;
        StringBuilder sb2;
        DeveloperLog.LogD("downloadFile, url = " + str);
        File file = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            response = AdRequest.get().url(str).connectTimeout(30000).readTimeout(600000).headers(getCacheHeaders(ApplicationUtil.getInstance().getApplicationContext(), str)).syncRequest();
            if (response == null) {
                sb2 = new StringBuilder();
            } else {
                try {
                    int code = response.code();
                    if (code == 200) {
                        if (Cache.saveFile(ApplicationUtil.getInstance().getApplicationContext(), str, response)) {
                            file = Cache.getCacheFile(ApplicationUtil.getInstance().getApplicationContext(), str, null);
                            sb2 = new StringBuilder();
                        } else {
                            deleteFileWhenError(str);
                            sb2 = new StringBuilder();
                        }
                    } else if (code == 304) {
                        Cache.saveHeaderFields(ApplicationUtil.getInstance().getApplicationContext(), str, response);
                        file = Cache.getCacheFile(ApplicationUtil.getInstance().getApplicationContext(), str, null);
                        sb2 = new StringBuilder();
                    } else if (code != 301 && code != 302 && code != 303 && code != 307) {
                        deleteFileWhenError(str);
                        sb2 = new StringBuilder();
                    } else {
                        Cache.saveHeaderFields(ApplicationUtil.getInstance().getApplicationContext(), str, response);
                        URL url = new URL(new URL(str), response.headers().getLocation());
                        DeveloperLog.LogD("redirect url is : " + url.toString());
                        file = downloadFile(url.toString());
                        sb2 = new StringBuilder();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    DeveloperLog.LogD("ResDownLoader", "url is : " + str + " finally close response");
                    IOUtil.closeQuietly(response);
                    throw th;
                }
            }
            sb2.append("url is : ");
            sb2.append(str);
            sb2.append(" finally close response");
            DeveloperLog.LogD("ResDownLoader", sb2.toString());
            IOUtil.closeQuietly(response);
            return file;
        } catch (Throwable th3) {
            th = th3;
            response = null;
        }
    }

    private static Headers getCacheHeaders(Context context, String str) throws Exception {
        Headers baseHeaders = HeaderUtils.getBaseHeaders();
        File cacheFile = Cache.getCacheFile(context, str, CommonConstants.FILE_HEADER_SUFFIX);
        if (cacheFile != null && cacheFile.exists()) {
            String valueFromFile = Cache.getValueFromFile(cacheFile, "ETag");
            if (!TextUtils.isEmpty(valueFromFile)) {
                baseHeaders.set("If-None-Match", valueFromFile);
            } else {
                String valueFromFile2 = Cache.getValueFromFile(cacheFile, "Last-Modified");
                if (!TextUtils.isEmpty(valueFromFile2)) {
                    baseHeaders.set("If-Modified-Since", valueFromFile2);
                }
            }
        }
        return baseHeaders;
    }
}
