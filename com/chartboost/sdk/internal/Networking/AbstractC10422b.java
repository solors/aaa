package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.internal.Networking.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10422b {

    /* renamed from: com.chartboost.sdk.internal.Networking.b$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10423a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23749a;

        static {
            int[] iArr = new int[EndpointRepository.EndPoint.values().length];
            try {
                iArr[EndpointRepository.EndPoint.BANNER_GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23749a = iArr;
        }
    }

    /* renamed from: a */
    public static final String m79768a(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "<this>");
        if (C10423a.f23749a[endPoint.ordinal()] == 1) {
            return EndpointRepository.EnumC10419a.f23742d.m79776b();
        }
        return EndpointRepository.EnumC10419a.f23741c.m79776b();
    }

    /* renamed from: b */
    public static final URL m79766b(EndpointRepository.EndPoint endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "<this>");
        return new URL("https", m79768a(endPoint), endPoint.getDefaultValue());
    }

    /* renamed from: a */
    public static final String m79767a(URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        String protocol = url.getProtocol();
        String host = url.getHost();
        return protocol + "://" + host;
    }
}
