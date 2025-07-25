package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.network.AutoValue_RealChain;
import com.smaato.sdk.core.network.Interceptor;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue.CopyAnnotations
@AutoValue
/* renamed from: com.smaato.sdk.core.network.p */
/* loaded from: classes7.dex */
public abstract class RealChain implements Interceptor.Chain {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealChain.java */
    @AutoValue.Builder
    /* renamed from: com.smaato.sdk.core.network.p$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC27234a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract RealChain mo39418a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC27234a mo39417b(Call call);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract AbstractC27234a mo39416c(long j);

        /* renamed from: d */
        abstract AbstractC27234a mo39415d(int i);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract AbstractC27234a mo39414e(List<Interceptor> list);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract AbstractC27234a mo39413f(long j);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract AbstractC27234a mo39412g(Request request);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static AbstractC27234a m39421a() {
        return new AutoValue_RealChain.C27221b().mo39415d(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo39420b();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public abstract List<Interceptor> mo39419c();

    @Override // com.smaato.sdk.core.network.Interceptor.Chain
    @NonNull
    public Response proceed(@NonNull Request request) throws IOException {
        if (mo39420b() < mo39419c().size()) {
            RealChain mo39418a = m39421a().mo39413f(readTimeoutMillis()).mo39416c(connectTimeoutMillis()).mo39414e(mo39419c()).mo39415d(mo39420b() + 1).mo39412g(request).mo39417b(call()).mo39418a();
            Interceptor interceptor = mo39419c().get(mo39420b());
            Response intercept = interceptor.intercept(mo39418a);
            if (intercept != null) {
                if (intercept.body() != null) {
                    return intercept;
                }
                throw new IOException("interceptor " + interceptor + " returned response with null body");
            }
            throw new IOException("interceptor " + interceptor + " returned null");
        }
        throw new IndexOutOfBoundsException("index = " + mo39420b() + ", interceptors = " + mo39419c().size());
    }
}
