package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.network.AutoValue_HttpBody;
import com.smaato.sdk.core.network.Response;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue.CopyAnnotations
@AutoValue
/* renamed from: com.smaato.sdk.core.network.i */
/* loaded from: classes7.dex */
public abstract class HttpBody implements Response.Body {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpBody.java */
    @AutoValue.Builder
    /* renamed from: com.smaato.sdk.core.network.i$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC27227a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract HttpBody mo39429a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC27227a mo39428b(long j);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract AbstractC27227a mo39427c(InputStream inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static AbstractC27227a m39430a() {
        return new AutoValue_HttpBody.C27219b();
    }
}
