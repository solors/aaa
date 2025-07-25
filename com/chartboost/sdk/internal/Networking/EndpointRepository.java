package com.chartboost.sdk.internal.Networking;

import java.net.URL;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import td.C44401b;
import td.EnumEntries;

@Metadata
/* loaded from: classes3.dex */
public interface EndpointRepository {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class EndPoint {

        /* renamed from: c */
        public static final /* synthetic */ EndPoint[] f23738c;

        /* renamed from: d */
        public static final /* synthetic */ EnumEntries f23739d;

        /* renamed from: b */
        public final String f23740b;
        public static final EndPoint CONFIG = new EndPoint("CONFIG", 0, "/api/config");
        public static final EndPoint INSTALL = new EndPoint("INSTALL", 1, "/api/install");
        public static final EndPoint PREFETCH = new EndPoint("PREFETCH", 2, "/webview/v2/prefetch");
        public static final EndPoint INTERSTITIAL_GET = new EndPoint("INTERSTITIAL_GET", 3, "/webview/v2/interstitial/get");
        public static final EndPoint INTERSTITIAL_SHOW = new EndPoint("INTERSTITIAL_SHOW", 4, "/interstitial/show");
        public static final EndPoint REWARDED_GET = new EndPoint("REWARDED_GET", 5, "/webview/v2/reward/get");
        public static final EndPoint REWARDED_SHOW = new EndPoint("REWARDED_SHOW", 6, "/reward/show");
        public static final EndPoint BANNER_GET = new EndPoint("BANNER_GET", 7, "/auction/sdk/banner");
        public static final EndPoint BANNER_SHOW = new EndPoint("BANNER_SHOW", 8, "/banner/show");
        public static final EndPoint CLICK = new EndPoint("CLICK", 9, "/api/click");
        public static final EndPoint VIDEO_COMPLETE = new EndPoint("VIDEO_COMPLETE", 10, "/api/video-complete");

        static {
            EndPoint[] m79778a = m79778a();
            f23738c = m79778a;
            f23739d = C44401b.m3113a(m79778a);
        }

        public EndPoint(String str, int i, String str2) {
            this.f23740b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EndPoint[] m79778a() {
            return new EndPoint[]{CONFIG, INSTALL, PREFETCH, INTERSTITIAL_GET, INTERSTITIAL_SHOW, REWARDED_GET, REWARDED_SHOW, BANNER_GET, BANNER_SHOW, CLICK, VIDEO_COMPLETE};
        }

        @NotNull
        public static EnumEntries<EndPoint> getEntries() {
            return f23739d;
        }

        public static EndPoint valueOf(String str) {
            return (EndPoint) Enum.valueOf(EndPoint.class, str);
        }

        public static EndPoint[] values() {
            return (EndPoint[]) f23738c.clone();
        }

        @NotNull
        public final String getDefaultValue() {
            return this.f23740b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.internal.Networking.EndpointRepository$a */
    /* loaded from: classes3.dex */
    public static final class EnumC10419a {

        /* renamed from: c */
        public static final EnumC10419a f23741c = new EnumC10419a("AD_GET", 0, "live.chartboost.com");

        /* renamed from: d */
        public static final EnumC10419a f23742d = new EnumC10419a("DA", 1, "da.chartboost.com");

        /* renamed from: e */
        public static final /* synthetic */ EnumC10419a[] f23743e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f23744f;

        /* renamed from: b */
        public final String f23745b;

        static {
            EnumC10419a[] m79777a = m79777a();
            f23743e = m79777a;
            f23744f = C44401b.m3113a(m79777a);
        }

        public EnumC10419a(String str, int i, String str2) {
            this.f23745b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10419a[] m79777a() {
            return new EnumC10419a[]{f23741c, f23742d};
        }

        public static EnumC10419a valueOf(String str) {
            return (EnumC10419a) Enum.valueOf(EnumC10419a.class, str);
        }

        public static EnumC10419a[] values() {
            return (EnumC10419a[]) f23743e.clone();
        }

        /* renamed from: b */
        public final String m79776b() {
            return this.f23745b;
        }
    }

    @NotNull
    URL getEndPointUrl(@NotNull EndPoint endPoint);

    void restoreDefaults();

    void setEndpoint(@NotNull EndPoint endPoint, @NotNull String str, @NotNull String str2);
}
