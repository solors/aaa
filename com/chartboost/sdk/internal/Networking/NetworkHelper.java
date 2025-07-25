package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.C9763c7;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class NetworkHelper {

    /* renamed from: a */
    public static final NetworkHelper f23746a = new NetworkHelper();
    @Nullable
    private static String debugEndpoint;
    private static boolean isForceSDKToAcceptAllSSLCertsEnabled;

    /* renamed from: a */
    public final String m79773a(String endpoint, String str) {
        boolean m16624M;
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        String str2 = debugEndpoint;
        if (str2 != null && str2.length() != 0) {
            C9763c7.m81914e("normalizedUrl: " + endpoint + " to: " + debugEndpoint, null);
            endpoint = debugEndpoint;
            Intrinsics.m17074g(endpoint);
        }
        if (str == null || str.length() == 0) {
            str = "";
        } else {
            m16624M = StringsJVM.m16624M(str, RemoteSettings.FORWARD_SLASH_STRING, false, 2, null);
            if (!m16624M) {
                str = RemoteSettings.FORWARD_SLASH_STRING + str;
            }
        }
        return endpoint + str;
    }

    /* renamed from: b */
    public final String m79772b(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URL m79771c = m79771c(urlString);
        String str = null;
        if (m79771c != null) {
            try {
                str = m79771c.getPath();
            } catch (Exception e) {
                C9763c7.m81923a("getPathFromUrl: " + urlString + " : " + e, null);
                str = "";
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: c */
    public final URL m79771c(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (urlString.length() <= 0) {
            return null;
        }
        try {
            return new URL(urlString);
        } catch (Exception e) {
            C9763c7.m81923a("stringToURL: " + urlString + " : " + e, null);
            return null;
        }
    }

    /* renamed from: a */
    public final String m79774a(String urlString) {
        String str;
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        URL m79771c = m79771c(urlString);
        if (m79771c != null) {
            try {
                str = m79771c.getProtocol() + "://" + m79771c.getHost();
            } catch (Exception e) {
                C9763c7.m81923a("getEndpointFromUrl: " + urlString + " : " + e, null);
                str = "";
            }
            return str == null ? "" : str;
        }
        return "";
    }

    /* renamed from: a */
    public static final boolean m79775a() {
        return isForceSDKToAcceptAllSSLCertsEnabled;
    }
}
