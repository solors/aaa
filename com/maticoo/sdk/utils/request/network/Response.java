package com.maticoo.sdk.utils.request.network;

import com.maticoo.sdk.utils.IOUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class Response implements Closeable {
    private ResponseBody mBody;
    private int mCode;
    private AbstractUrlConnection mConnection;
    private Headers mHeaders;

    /* loaded from: classes6.dex */
    public static final class Builder {
        private ResponseBody mBody;
        private int mCode;
        private AbstractUrlConnection mConnection;
        private Headers mHeaders;

        Builder() {
        }

        public Builder body(ResponseBody responseBody) {
            this.mBody = responseBody;
            return this;
        }

        public Response build() {
            return new Response(this);
        }

        public Builder code(int i) {
            this.mCode = i;
            return this;
        }

        public Builder connection(AbstractUrlConnection abstractUrlConnection) {
            this.mConnection = abstractUrlConnection;
            return this;
        }

        public Builder headers(Headers headers) {
            this.mHeaders = headers;
            return this;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ResponseBody body() {
        return this.mBody;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            AbstractUrlConnection abstractUrlConnection = this.mConnection;
            if (abstractUrlConnection != null) {
                abstractUrlConnection.cancel();
                this.mConnection = null;
            }
            Headers headers = this.mHeaders;
            if (headers != null) {
                headers.clear();
                this.mHeaders = null;
            }
            IOUtil.closeQuietly(this.mBody.stream());
        } catch (Throwable th) {
            DeveloperLog.LogD("Response close", th);
        }
    }

    public int code() {
        return this.mCode;
    }

    public Headers headers() {
        return this.mHeaders;
    }

    public String toString() {
        return "Response{mCode=" + this.mCode + ", mHeaders=" + this.mHeaders + ", mBody=" + this.mBody + '}';
    }

    private Response(Builder builder) {
        this.mCode = builder.mCode;
        this.mHeaders = builder.mHeaders;
        this.mBody = builder.mBody;
        this.mConnection = builder.mConnection;
    }
}
