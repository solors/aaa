package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.C35120a;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes9.dex */
public class CacheControlHttpsConnectionPerformer {

    /* renamed from: a */
    private final C35120a f95867a;

    /* renamed from: b */
    private final SSLSocketFactory f95868b;

    /* loaded from: classes9.dex */
    public interface Client {
        @Nullable
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(@NonNull String str, @NonNull byte[] bArr);
    }

    public CacheControlHttpsConnectionPerformer(@Nullable SSLSocketFactory sSLSocketFactory) {
        this(new C35120a(), sSLSocketFactory);
    }

    public void performConnection(@NonNull String str, @NonNull Client client) {
        Response m20660a;
        int code;
        try {
            C35120a c35120a = this.f95867a;
            String oldETag = client.getOldETag();
            SSLSocketFactory sSLSocketFactory = this.f95868b;
            c35120a.getClass();
            m20660a = C35120a.m20660a(oldETag, str, sSLSocketFactory);
            code = m20660a.getCode();
        } catch (Throwable unused) {
        }
        if (code != 200) {
            if (code == 304) {
                client.onNotModified();
                return;
            } else {
                client.onError();
                return;
            }
        }
        List list = (List) CollectionUtils.getFromMapIgnoreCase(m20660a.getHeaders(), "ETag");
        client.onResponse((list == null || list.size() <= 0 || (r0 = (String) list.get(0)) == null) ? "" : "", m20660a.getResponseData());
    }

    CacheControlHttpsConnectionPerformer(C35120a c35120a, SSLSocketFactory sSLSocketFactory) {
        this.f95867a = c35120a;
        this.f95868b = sSLSocketFactory;
    }
}
