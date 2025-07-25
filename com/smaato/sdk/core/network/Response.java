package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.network.AutoValue_Response;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Collections;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class Response implements Closeable {

    /* loaded from: classes7.dex */
    public interface Body {
        long contentLength();

        @NonNull
        InputStream source();
    }

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract Builder body(Body body);

        public abstract Response build();

        public abstract Builder connection(HttpURLConnection httpURLConnection);

        public abstract Builder encoding(String str);

        public abstract Builder headers(Headers headers);

        public abstract Builder mimeType(MimeType mimeType);

        public abstract Builder request(Request request);

        public abstract Builder responseCode(int i);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_Response.C27225b().headers(Headers.m39436of(Collections.emptyMap()));
    }

    @NonNull
    public abstract Body body();

    @NonNull
    public Builder buildUpon() {
        return builder().request(request()).responseCode(responseCode()).headers(headers()).mimeType(mimeType()).body(body()).encoding(encoding()).connection(connection());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        connection().disconnect();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract HttpURLConnection connection();

    @Nullable
    public abstract String encoding();

    @NonNull
    public abstract Headers headers();

    public boolean isRedirect() {
        int responseCode = responseCode();
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        String method = request().method();
        if (!"GET".equalsIgnoreCase(method) && !"HEAD".equalsIgnoreCase(method)) {
            return false;
        }
        return true;
    }

    @Nullable
    public abstract MimeType mimeType();

    @NonNull
    public abstract Request request();

    public abstract int responseCode();
}
