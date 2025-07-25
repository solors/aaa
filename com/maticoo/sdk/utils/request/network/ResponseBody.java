package com.maticoo.sdk.utils.request.network;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes6.dex */
public interface ResponseBody extends Closeable {
    byte[] byteArray() throws IOException;

    BufferedInputStream stream() throws IOException;

    String string() throws IOException;
}
