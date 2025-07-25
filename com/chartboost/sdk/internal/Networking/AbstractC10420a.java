package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.C10127p9;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URL;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.internal.Networking.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10420a implements EndpointRepository {

    /* renamed from: a */
    public final C10127p9 f23747a;

    /* renamed from: com.chartboost.sdk.internal.Networking.a$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10421a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23748a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.INTERSTITIAL_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EndpointRepository.EndPoint.REWARDED_GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EndpointRepository.EndPoint.PREFETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23748a = iArr;
        }
    }

    public AbstractC10420a(C10127p9 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f23747a = sdkConfiguration;
    }

    /* renamed from: a */
    public final URL m79770a(EndpointRepository.EndPoint endPoint) {
        int i = C10421a.f23748a[endPoint.ordinal()];
        if (i == 1) {
            String format = String.format("webview/%s/interstitial/get", Arrays.copyOf(new Object[]{this.f23747a.f22944x}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return m79769a(endPoint, format);
        } else if (i == 2) {
            String format2 = String.format("webview/%s/reward/get", Arrays.copyOf(new Object[]{this.f23747a.f22944x}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return m79769a(endPoint, format2);
        } else if (i != 3) {
            return null;
        } else {
            String webviewPrefetchEndpoint = this.f23747a.f22945y;
            Intrinsics.checkNotNullExpressionValue(webviewPrefetchEndpoint, "webviewPrefetchEndpoint");
            return m79769a(endPoint, webviewPrefetchEndpoint);
        }
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public URL getEndPointUrl(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        URL m79770a = m79770a(endPoint);
        if (m79770a == null) {
            return AbstractC10422b.m79766b(endPoint);
        }
        return m79770a;
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void setEndpoint(EndpointRepository.EndPoint endPoint, String host, String path) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IllegalStateException("Cannot set endpoint".toString());
    }

    /* renamed from: a */
    public final URL m79769a(EndpointRepository.EndPoint endPoint, String str) {
        String m79768a = AbstractC10422b.m79768a(endPoint);
        return new URL("https", m79768a, RemoteSettings.FORWARD_SLASH_STRING + str);
    }

    @Override // com.chartboost.sdk.internal.Networking.EndpointRepository
    public void restoreDefaults() {
    }
}
