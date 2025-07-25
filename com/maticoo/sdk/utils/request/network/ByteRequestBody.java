package com.maticoo.sdk.utils.request.network;

import com.maticoo.sdk.utils.IOUtil;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public class ByteRequestBody implements RequestBody {
    private final byte[] mBody;
    private final Charset mCharset;
    private final String mContentType;

    public ByteRequestBody(byte[] bArr) {
        this(bArr, Charset.forName("UTF-8"));
    }

    @Override // com.maticoo.sdk.utils.request.network.RequestBody
    public String contentType() {
        return this.mContentType;
    }

    @Override // com.maticoo.sdk.utils.request.network.RequestBody
    public long length() {
        return this.mBody.length;
    }

    @Override // com.maticoo.sdk.utils.request.network.RequestBody
    public void writeTo(OutputStream outputStream) throws IOException {
        IOUtil.write(outputStream, this.mBody);
    }

    public ByteRequestBody(byte[] bArr, Charset charset) {
        this(bArr, charset, "application/json");
    }

    public ByteRequestBody(byte[] bArr, String str) {
        this(bArr, Charset.forName("UTF-8"), str);
    }

    public ByteRequestBody(byte[] bArr, Charset charset, String str) {
        this.mBody = bArr;
        this.mCharset = charset;
        this.mContentType = str;
    }
}
