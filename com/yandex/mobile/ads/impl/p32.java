package com.yandex.mobile.ads.impl;

import android.webkit.URLUtil;
import androidx.core.net.MailTo;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* loaded from: classes8.dex */
public final class p32 {

    /* renamed from: a */
    public static final /* synthetic */ int f83707a = 0;

    /* renamed from: com.yandex.mobile.ads.impl.p32$a */
    /* loaded from: classes8.dex */
    public static final class C31083a {
        /* renamed from: a */
        public static boolean m30844a(@NotNull String url) {
            boolean m16624M;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            if (url.length() != 0) {
                String m16764g = new Regex("http(s?)://").m16764g(url, "");
                for (EnumC31084b enumC31084b : EnumC31084b.values()) {
                    m16624M = StringsJVM.m16624M(m16764g, enumC31084b.m30842a(), false, 2, null);
                    if (m16624M) {
                        return false;
                    }
                }
            }
            if (!URLUtil.isNetworkUrl(url)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m30843b(@NotNull String url) {
            boolean m16624M;
            Intrinsics.checkNotNullParameter(url, "url");
            if (url.length() == 0) {
                return false;
            }
            String m16764g = new Regex("http(s?)://").m16764g(url, "");
            EnumC31084b.f83708c.getClass();
            EnumC31084b[] enumC31084bArr = {EnumC31084b.f83709d, EnumC31084b.f83710e, EnumC31084b.f83711f, EnumC31084b.f83712g};
            for (int i = 0; i < 4; i++) {
                m16624M = StringsJVM.m16624M(m16764g, enumC31084bArr[i].m30842a(), false, 2, null);
                if (m16624M) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.p32$b */
    /* loaded from: classes8.dex */
    public static final class EnumC31084b {
        @NotNull

        /* renamed from: c */
        public static final C31085a f83708c;

        /* renamed from: d */
        public static final EnumC31084b f83709d;

        /* renamed from: e */
        public static final EnumC31084b f83710e;

        /* renamed from: f */
        public static final EnumC31084b f83711f;

        /* renamed from: g */
        public static final EnumC31084b f83712g;

        /* renamed from: h */
        private static final /* synthetic */ EnumC31084b[] f83713h;
        @NotNull

        /* renamed from: b */
        private final String f83714b;

        /* renamed from: com.yandex.mobile.ads.impl.p32$b$a */
        /* loaded from: classes8.dex */
        public static final class C31085a {
            private C31085a() {
            }

            public /* synthetic */ C31085a(int i) {
                this();
            }
        }

        static {
            EnumC31084b enumC31084b = new EnumC31084b(0, "SMS_SCHEME", "sms:");
            EnumC31084b enumC31084b2 = new EnumC31084b(1, "MAIL_SCHEME", MailTo.MAILTO_SCHEME);
            EnumC31084b enumC31084b3 = new EnumC31084b(2, "VOICE_MAIL_SCHEME", "voicemail:");
            EnumC31084b enumC31084b4 = new EnumC31084b(3, "TEL_SCHEME", "tel:");
            EnumC31084b enumC31084b5 = new EnumC31084b(4, "CALLTO", "callto:");
            EnumC31084b enumC31084b6 = new EnumC31084b(5, "FAX", "fax:");
            EnumC31084b enumC31084b7 = new EnumC31084b(6, "GEO_SCHEME", "geo:");
            EnumC31084b enumC31084b8 = new EnumC31084b(7, "MAP_SCHEME", "map:");
            EnumC31084b enumC31084b9 = new EnumC31084b(8, "MAPS_SCHEME", "maps:");
            EnumC31084b enumC31084b10 = new EnumC31084b(9, "GOOGLE_MARKET_SCHEME", "market:");
            f83709d = enumC31084b10;
            EnumC31084b enumC31084b11 = new EnumC31084b(10, "GOOGLE_PLAY_SCHEME", "play:");
            f83710e = enumC31084b11;
            EnumC31084b enumC31084b12 = new EnumC31084b(11, "GOOGLE_STREET_VIEW_SCHEME", "google.streetview:");
            EnumC31084b enumC31084b13 = new EnumC31084b(12, "GOOGLE_MARKET_HOST", "market.android");
            f83711f = enumC31084b13;
            EnumC31084b enumC31084b14 = new EnumC31084b(13, "GOOGLE_PLAY_HOST", "play.google");
            f83712g = enumC31084b14;
            EnumC31084b[] enumC31084bArr = {enumC31084b, enumC31084b2, enumC31084b3, enumC31084b4, enumC31084b5, enumC31084b6, enumC31084b7, enumC31084b8, enumC31084b9, enumC31084b10, enumC31084b11, enumC31084b12, enumC31084b13, enumC31084b14, new EnumC31084b(14, "MAP_HOST", "map"), new EnumC31084b(15, "MAPS_HOST", "maps"), new EnumC31084b(16, "YMOBMAPS", "mobile.maps"), new EnumC31084b(17, "YSHORTMOBMAPS", "m.maps"), new EnumC31084b(18, "YOIDMAPS", "maps.yandex.ru"), new EnumC31084b(19, "MESSAGE", "message:"), new EnumC31084b(20, "SIP", "sip:"), new EnumC31084b(21, "SKYPE", "skype:"), new EnumC31084b(22, "SMS", "sms:"), new EnumC31084b(23, "GTALK", "gtalk:"), new EnumC31084b(24, "SPOTIFY", "spotify:"), new EnumC31084b(25, "LASTFM", "lastfm:"), new EnumC31084b(26, "YSTORE", "yastore:")};
            f83713h = enumC31084bArr;
            C44401b.m3113a(enumC31084bArr);
            f83708c = new C31085a(0);
        }

        private EnumC31084b(int i, String str, String str2) {
            this.f83714b = str2;
        }

        public static EnumC31084b valueOf(String str) {
            return (EnumC31084b) Enum.valueOf(EnumC31084b.class, str);
        }

        public static EnumC31084b[] values() {
            return (EnumC31084b[]) f83713h.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m30842a() {
            return this.f83714b;
        }
    }

    static {
        Pattern.compile("maps.yandex");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m30845a(@org.jetbrains.annotations.Nullable java.lang.String r2) {
        /*
            nd.q$a r0 = p804nd.Result.f101870c     // Catch: java.lang.Throwable -> L1c
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L12
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L10
            goto L12
        L10:
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = p804nd.Result.m14549b(r2)     // Catch: java.lang.Throwable -> L1c
            goto L27
        L1c:
            r2 = move-exception
            nd.q$a r0 = p804nd.Result.f101870c
            java.lang.Object r2 = p804nd.C38508r.m14540a(r2)
            java.lang.Object r2 = p804nd.Result.m14549b(r2)
        L27:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = p804nd.Result.m14544g(r2)
            if (r1 == 0) goto L30
            r2 = r0
        L30:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.p32.m30845a(java.lang.String):boolean");
    }
}
