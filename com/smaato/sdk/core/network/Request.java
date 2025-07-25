package com.smaato.sdk.core.network;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.network.AutoValue_Request;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class Request {

    /* loaded from: classes7.dex */
    public interface Body {
        void writeTo(OutputStream outputStream) throws IOException;
    }

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract Builder body(Body body);

        public abstract Request build();

        public abstract Builder followRedirects(boolean z);

        public abstract Builder headers(Headers headers);

        public abstract Builder method(String str);

        public abstract Builder uri(Uri uri);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39432a(byte[] bArr, OutputStream outputStream) {
        lambda$post$0(bArr, outputStream);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_Request.C27223b().headers(Headers.m39436of(Collections.emptyMap())).followRedirects(true);
    }

    @NonNull
    public static Request get(@NonNull String str) {
        return new AutoValue_Request.C27223b().method("GET").uri(Uri.parse(str)).headers(Headers.empty()).followRedirects(true).build();
    }

    public static /* synthetic */ void lambda$post$0(byte[] bArr, OutputStream outputStream) throws IOException {
        outputStream.write(bArr);
        outputStream.close();
    }

    @NonNull
    public static Request post(@NonNull String str, @NonNull final byte[] bArr) {
        return new AutoValue_Request.C27223b().method("POST").uri(Uri.parse(str)).headers(Headers.empty()).followRedirects(true).body(new Body() { // from class: com.smaato.sdk.core.network.q
            @Override // com.smaato.sdk.core.network.Request.Body
            public final void writeTo(OutputStream outputStream) {
                Request.m39432a(bArr, outputStream);
            }
        }).build();
    }

    @Nullable
    public abstract Body body();

    @NonNull
    public Builder buildUpon() {
        return new AutoValue_Request.C27223b().uri(uri()).method(method()).headers(headers()).body(body()).followRedirects(followRedirects());
    }

    public abstract boolean followRedirects();

    @NonNull
    public abstract Headers headers();

    @NonNull
    public abstract String method();

    @NonNull
    public abstract Uri uri();
}
