package com.maticoo.sdk.utils.request.network;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public interface RequestBody {
    String contentType();

    long length();

    void writeTo(OutputStream outputStream) throws IOException;
}
