package com.maticoo.sdk.utils.request.network;

import android.text.TextUtils;
import com.maticoo.sdk.utils.IOUtil;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public class StringRequestBody implements RequestBody {
    private final String mBody;
    private final String mContentType;

    public StringRequestBody(String str) {
        this(str, "application/json");
    }

    @Override // com.maticoo.sdk.utils.request.network.RequestBody
    public String contentType() {
        return this.mContentType;
    }

    @Override // com.maticoo.sdk.utils.request.network.RequestBody
    public long length() {
        if (TextUtils.isEmpty(this.mBody)) {
            return 0L;
        }
        return this.mBody.length();
    }

    @Override // com.maticoo.sdk.utils.request.network.RequestBody
    public void writeTo(OutputStream outputStream) throws IOException {
        IOUtil.write(outputStream, this.mBody);
    }

    public StringRequestBody(String str, String str2) {
        this.mBody = str;
        this.mContentType = str2;
    }
}
