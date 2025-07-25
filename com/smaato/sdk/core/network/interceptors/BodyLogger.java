package com.smaato.sdk.core.network.interceptors;

import android.util.Base64;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public class BodyLogger extends OutputStream {
    private final ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
    private boolean isAscii = true;
    private boolean isBlankOnly = true;
    private final Logger logger;

    public BodyLogger(Logger logger) {
        this.logger = logger;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        String encodeToString;
        byte[] byteArray = this.byteStream.toByteArray();
        if (byteArray.length != 0 && !this.isBlankOnly) {
            if (this.isAscii) {
                this.logger.debug(LogDomain.NETWORK, "Body (%d bytes):", Integer.valueOf(byteArray.length));
            } else {
                this.logger.debug(LogDomain.NETWORK, "Base64 Encoded Body (%d bytes):", Integer.valueOf(byteArray.length));
            }
            Logger logger = this.logger;
            LogDomain logDomain = LogDomain.NETWORK;
            if (this.isAscii) {
                encodeToString = new String(byteArray);
            } else {
                encodeToString = Base64.encodeToString(byteArray, 2);
            }
            logger.debug(logDomain, encodeToString, new Object[0]);
        } else {
            this.logger.debug(LogDomain.NETWORK, "<Empty body>", new Object[0]);
        }
        super.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.byteStream.write(i);
        this.isAscii &= i >= 31 && i <= 127;
        this.isBlankOnly &= i == 32;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        for (byte b : bArr) {
            write(b);
        }
    }
}
