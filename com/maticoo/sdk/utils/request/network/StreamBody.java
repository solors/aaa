package com.maticoo.sdk.utils.request.network;

import android.text.TextUtils;
import com.ironsource.C20517nb;
import com.maticoo.sdk.utils.IOUtil;
import java.io.BufferedInputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public class StreamBody implements ResponseBody {
    private String mContentType;
    private BufferedInputStream mStream;

    public StreamBody(String str, BufferedInputStream bufferedInputStream) {
        this.mContentType = str;
        this.mStream = bufferedInputStream;
    }

    @Override // com.maticoo.sdk.utils.request.network.ResponseBody
    public byte[] byteArray() throws IOException {
        return IOUtil.toByteArray(this.mStream);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mStream.close();
    }

    @Override // com.maticoo.sdk.utils.request.network.ResponseBody
    public BufferedInputStream stream() throws IOException {
        return this.mStream;
    }

    @Override // com.maticoo.sdk.utils.request.network.ResponseBody
    public String string() throws IOException {
        String parseSubValue = Headers.parseSubValue(this.mContentType, C20517nb.f52166M, "UTF-8");
        if (TextUtils.isEmpty(parseSubValue)) {
            return IOUtil.toString(this.mStream);
        }
        return IOUtil.toString(this.mStream, parseSubValue);
    }
}
