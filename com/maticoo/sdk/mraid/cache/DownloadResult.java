package com.maticoo.sdk.mraid.cache;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes6.dex */
public class DownloadResult {
    public String contentEncoding;
    public String contentType;
    boolean fromCache;
    public InputStream inputStream;
    public int responseCode;
    public Map<String, String> responseHeaders;
    public String responseMsg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DownloadResult(int i, String str, InputStream inputStream, Map<String, String> map, String str2, String str3, boolean z) {
        this.responseCode = i;
        this.responseMsg = str;
        this.inputStream = inputStream;
        this.responseHeaders = map;
        this.contentEncoding = str2;
        this.contentType = str3;
        this.fromCache = z;
    }
}
