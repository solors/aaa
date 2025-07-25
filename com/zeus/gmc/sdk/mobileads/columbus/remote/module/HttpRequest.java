package com.zeus.gmc.sdk.mobileads.columbus.remote.module;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.MLog;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.URLEncodeUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class HttpRequest {
    private static final String TAG = "HttpRequest";
    private String mHost;
    private String mPath;
    private String mUrl;
    private Method mMethod = Method.GET;
    private List<KeyValuePair> mQuery = new ArrayList();
    private List<KeyValuePair> mHeaders = new ArrayList();

    /* loaded from: classes8.dex */
    public enum Method {
        POST,
        GET
    }

    public HttpRequest(String str) {
        this.mUrl = str;
        try {
            int indexOf = str.indexOf("://");
            if (indexOf >= 0) {
                String str2 = this.mUrl;
                String substring = str2.substring(indexOf + 3, str2.length());
                int indexOf2 = substring.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
                this.mHost = substring.substring(0, indexOf2);
                if (substring.contains("?")) {
                    this.mPath = substring.substring(indexOf2, substring.indexOf("?"));
                } else {
                    this.mPath = substring.substring(indexOf2, substring.length());
                }
            }
        } catch (Exception e) {
            MLog.m25899e(HttpRequest.class.getName(), TAG, e);
        }
    }

    public void addHeader(String str, String str2) {
        this.mHeaders.add(new KeyValuePair(str, str2));
    }

    public void addParam(String str, String str2) {
        this.mQuery.add(new KeyValuePair(str, str2));
    }

    public String buildFullUrl() {
        if (this.mMethod == Method.GET) {
            String fromParamListToString = URLEncodeUtils.fromParamListToString(this.mQuery);
            String str = this.mUrl;
            if (!str.contains("?")) {
                str = str + "?";
            }
            return str + fromParamListToString;
        }
        return this.mUrl;
    }

    public List<KeyValuePair> getHeaders() {
        return this.mHeaders;
    }

    public String getHost() {
        return this.mHost;
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getPath() {
        return this.mPath;
    }

    public List<KeyValuePair> getPostQuery() {
        return this.mQuery;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setMethod(Method method) {
        this.mMethod = method;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public String toString() {
        try {
            String str = "";
            boolean z = true;
            for (KeyValuePair keyValuePair : this.mQuery) {
                if (z) {
                    z = false;
                } else {
                    str = str + C21114v8.C21123i.f54135c;
                }
                str = str + keyValuePair.getName() + "=" + keyValuePair.getValue();
            }
            String str2 = this.mUrl;
            if (!str2.contains("?")) {
                str2 = str2 + "?";
            }
            return str2 + str;
        } catch (Exception unused) {
            return this.mUrl;
        }
    }
}
