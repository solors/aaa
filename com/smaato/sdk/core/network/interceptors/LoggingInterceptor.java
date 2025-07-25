package com.smaato.sdk.core.network.interceptors;

import androidx.annotation.NonNull;
import com.applovin.impl.C4801lz;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Headers;
import com.smaato.sdk.core.network.HttpNoResponseBodyException;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public class LoggingInterceptor implements Interceptor {
    private final Logger logger;
    private final boolean loggingEnabled;

    /* renamed from: com.smaato.sdk.core.network.interceptors.LoggingInterceptor$a */
    /* loaded from: classes7.dex */
    public class C27228a implements Response.Body {

        /* renamed from: a */
        final /* synthetic */ byte[] f71826a;

        /* renamed from: b */
        final /* synthetic */ long f71827b;

        C27228a(byte[] bArr, long j) {
            LoggingInterceptor.this = r1;
            this.f71826a = bArr;
            this.f71827b = j;
        }

        @Override // com.smaato.sdk.core.network.Response.Body
        public long contentLength() {
            return this.f71827b;
        }

        @Override // com.smaato.sdk.core.network.Response.Body
        @NonNull
        public InputStream source() {
            return new ByteArrayInputStream(this.f71826a);
        }
    }

    public LoggingInterceptor(Boolean bool, Logger logger) {
        this.loggingEnabled = bool.booleanValue();
        this.logger = logger;
    }

    private Response.Body createBody(long j, byte[] bArr) {
        return new C27228a(bArr, j);
    }

    private void log(Throwable th) {
        this.logger.error(LogDomain.NETWORK, th, "<-- HTTP FAILED", new Object[0]);
    }

    private Request logAndRestoreBody(Request request) {
        final byte[] bArr;
        if (request.body() == null) {
            this.logger.debug(LogDomain.NETWORK, "No request body", new Object[0]);
            return request;
        }
        try {
            BodyLogger bodyLogger = new BodyLogger(this.logger);
            bArr = readIntoByteArray(request.body());
            bodyLogger.write(bArr);
            bodyLogger.close();
        } catch (Throwable th) {
            bArr = new byte[0];
            this.logger.debug(LogDomain.NETWORK, th, "--> Logging body failed", new Object[0]);
        }
        return request.buildUpon().body(new Request.Body() { // from class: com.smaato.sdk.core.network.interceptors.a
            @Override // com.smaato.sdk.core.network.Request.Body
            public final void writeTo(OutputStream outputStream) {
                outputStream.write(bArr);
            }
        }).build();
    }

    private void logHeaders(Headers headers) {
        for (String str : headers.names()) {
            this.logger.debug(LogDomain.NETWORK, "%s: %s", str, C4801lz.m97621a(", ", headers.values(str)));
        }
    }

    private Request logRequestAndRestoreBody(Request request) {
        this.logger.info(LogDomain.NETWORK, "--> %s %s", request.method(), request.uri().toString());
        logHeaders(request.headers());
        return logAndRestoreBody(request);
    }

    private void logResponse(HttpNoResponseBodyException httpNoResponseBodyException, long j, Request request) {
        Logger logger = this.logger;
        LogDomain logDomain = LogDomain.NETWORK;
        logger.info(logDomain, "<-- %d (%dms) %s", Integer.valueOf(httpNoResponseBodyException.getResponseCode()), Long.valueOf(j), request.uri().toString());
        logHeaders(httpNoResponseBodyException.getHeaders());
        this.logger.info(logDomain, "Error reading body: %s", httpNoResponseBodyException.getMessage());
    }

    private Response logResponseAndRestoreBody(Response response, long j) {
        this.logger.info(LogDomain.NETWORK, "<-- %d (%dms) %s", Integer.valueOf(response.responseCode()), Long.valueOf(j), response.request().uri().toString());
        logHeaders(response.headers());
        return logAndRestoreBody(response);
    }

    private byte[] readIntoByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, 16384);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // com.smaato.sdk.core.network.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        if (this.loggingEnabled) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Request logRequestAndRestoreBody = logRequestAndRestoreBody(chain.request());
                currentTimeMillis = System.currentTimeMillis();
                return logResponseAndRestoreBody(chain.proceed(logRequestAndRestoreBody), System.currentTimeMillis() - currentTimeMillis);
            } catch (Exception e) {
                if (e instanceof HttpNoResponseBodyException) {
                    logResponse((HttpNoResponseBodyException) e, System.currentTimeMillis() - currentTimeMillis, chain.request());
                } else {
                    log(e);
                }
                throw e;
            }
        }
        return chain.proceed(chain.request());
    }

    private byte[] readIntoByteArray(Request.Body body) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        body.writeTo(byteArrayOutputStream);
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private Response logAndRestoreBody(Response response) {
        byte[] bArr;
        try {
            InputStream source = response.body().source();
            BodyLogger bodyLogger = new BodyLogger(this.logger);
            try {
                bArr = readIntoByteArray(source);
                if (bArr.length < 4194304) {
                    bodyLogger.write(bArr);
                }
                bodyLogger.close();
                if (source != null) {
                    source.close();
                }
            } catch (Throwable th) {
                try {
                    bodyLogger.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            bArr = new byte[0];
            this.logger.debug(LogDomain.NETWORK, th3, "<Logging body failed>", new Object[0]);
        }
        return response.buildUpon().body(createBody(response.body().contentLength(), bArr)).build();
    }
}
