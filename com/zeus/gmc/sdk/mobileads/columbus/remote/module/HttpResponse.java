package com.zeus.gmc.sdk.mobileads.columbus.remote.module;

import java.io.InputStream;

/* loaded from: classes8.dex */
public class HttpResponse {
    private long mContentLength;
    private InputStream mInputStream;
    private int mStatusCode;

    public HttpResponse(int i, long j, InputStream inputStream) {
        this.mStatusCode = i;
        this.mInputStream = inputStream;
        this.mContentLength = j;
    }

    public long getContentLength() {
        return this.mContentLength;
    }

    public InputStream getInputStream() {
        return this.mInputStream;
    }

    public boolean isSuccess() {
        if (this.mStatusCode == 200) {
            return true;
        }
        return false;
    }
}
