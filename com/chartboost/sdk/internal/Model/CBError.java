package com.chartboost.sdk.internal.Model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C44401b;
import td.EnumEntries;

@Metadata
/* loaded from: classes3.dex */
public final class CBError extends Exception {

    /* renamed from: b */
    public final InterfaceC10418d f23685b;

    /* renamed from: c */
    public final String f23686c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.internal.Model.CBError$a */
    /* loaded from: classes3.dex */
    public static final class EnumC10415a implements InterfaceC10418d {

        /* renamed from: b */
        public static final EnumC10415a f23687b = new EnumC10415a("URI_INVALID", 0);

        /* renamed from: c */
        public static final EnumC10415a f23688c = new EnumC10415a("URI_UNRECOGNIZED", 1);

        /* renamed from: d */
        public static final EnumC10415a f23689d = new EnumC10415a("LOAD_NOT_FINISHED", 2);

        /* renamed from: e */
        public static final EnumC10415a f23690e = new EnumC10415a("INTERNAL", 3);

        /* renamed from: f */
        public static final /* synthetic */ EnumC10415a[] f23691f;

        /* renamed from: g */
        public static final /* synthetic */ EnumEntries f23692g;

        static {
            EnumC10415a[] m79781a = m79781a();
            f23691f = m79781a;
            f23692g = C44401b.m3113a(m79781a);
        }

        public EnumC10415a(String str, int i) {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10415a[] m79781a() {
            return new EnumC10415a[]{f23687b, f23688c, f23689d, f23690e};
        }

        public static EnumC10415a valueOf(String str) {
            return (EnumC10415a) Enum.valueOf(EnumC10415a.class, str);
        }

        public static EnumC10415a[] values() {
            return (EnumC10415a[]) f23691f.clone();
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.InterfaceC10418d
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.internal.Model.CBError$b */
    /* loaded from: classes3.dex */
    public static final class EnumC10416b implements InterfaceC10418d {

        /* renamed from: I */
        public static final /* synthetic */ EnumC10416b[] f23701I;

        /* renamed from: J */
        public static final /* synthetic */ EnumEntries f23702J;

        /* renamed from: b */
        public static final EnumC10416b f23703b = new EnumC10416b("INTERNAL", 0);

        /* renamed from: c */
        public static final EnumC10416b f23704c = new EnumC10416b("INTERNET_UNAVAILABLE", 1);

        /* renamed from: d */
        public static final EnumC10416b f23705d = new EnumC10416b("TOO_MANY_CONNECTIONS", 2);

        /* renamed from: e */
        public static final EnumC10416b f23706e = new EnumC10416b("WRONG_ORIENTATION", 3);

        /* renamed from: f */
        public static final EnumC10416b f23707f = new EnumC10416b("FIRST_SESSION_INTERSTITIALS_DISABLED", 4);

        /* renamed from: g */
        public static final EnumC10416b f23708g = new EnumC10416b("NETWORK_FAILURE", 5);

        /* renamed from: h */
        public static final EnumC10416b f23709h = new EnumC10416b("NO_AD_FOUND", 6);

        /* renamed from: i */
        public static final EnumC10416b f23710i = new EnumC10416b("SESSION_NOT_STARTED", 7);

        /* renamed from: j */
        public static final EnumC10416b f23711j = new EnumC10416b("IMPRESSION_ALREADY_VISIBLE", 8);

        /* renamed from: k */
        public static final EnumC10416b f23712k = new EnumC10416b("NO_HOST_ACTIVITY", 9);

        /* renamed from: l */
        public static final EnumC10416b f23713l = new EnumC10416b("USER_CANCELLATION", 10);

        /* renamed from: m */
        public static final EnumC10416b f23714m = new EnumC10416b("INVALID_LOCATION", 11);

        /* renamed from: n */
        public static final EnumC10416b f23715n = new EnumC10416b("VIDEO_UNAVAILABLE", 12);

        /* renamed from: o */
        public static final EnumC10416b f23716o = new EnumC10416b("VIDEO_ID_MISSING", 13);

        /* renamed from: p */
        public static final EnumC10416b f23717p = new EnumC10416b("ERROR_PLAYING_VIDEO", 14);

        /* renamed from: q */
        public static final EnumC10416b f23718q = new EnumC10416b("INVALID_RESPONSE", 15);

        /* renamed from: r */
        public static final EnumC10416b f23719r = new EnumC10416b("ASSETS_DOWNLOAD_FAILURE", 16);

        /* renamed from: s */
        public static final EnumC10416b f23720s = new EnumC10416b("ERROR_CREATING_VIEW", 17);

        /* renamed from: t */
        public static final EnumC10416b f23721t = new EnumC10416b("ERROR_DISPLAYING_VIEW", 18);

        /* renamed from: u */
        public static final EnumC10416b f23722u = new EnumC10416b("INCOMPATIBLE_API_VERSION", 19);

        /* renamed from: v */
        public static final EnumC10416b f23723v = new EnumC10416b("ERROR_LOADING_WEB_VIEW", 20);

        /* renamed from: w */
        public static final EnumC10416b f23724w = new EnumC10416b("ASSET_PREFETCH_IN_PROGRESS", 21);

        /* renamed from: x */
        public static final EnumC10416b f23725x = new EnumC10416b("ACTIVITY_MISSING_IN_MANIFEST", 22);

        /* renamed from: y */
        public static final EnumC10416b f23726y = new EnumC10416b("EMPTY_LOCAL_VIDEO_LIST", 23);

        /* renamed from: z */
        public static final EnumC10416b f23727z = new EnumC10416b("END_POINT_DISABLED", 24);

        /* renamed from: A */
        public static final EnumC10416b f23693A = new EnumC10416b("HARDWARE_ACCELERATION_DISABLED", 25);

        /* renamed from: B */
        public static final EnumC10416b f23694B = new EnumC10416b("PENDING_IMPRESSION_ERROR", 26);

        /* renamed from: C */
        public static final EnumC10416b f23695C = new EnumC10416b("VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION", 27);

        /* renamed from: D */
        public static final EnumC10416b f23696D = new EnumC10416b("ASSET_MISSING", 28);

        /* renamed from: E */
        public static final EnumC10416b f23697E = new EnumC10416b("WEB_VIEW_PAGE_LOAD_TIMEOUT", 29);

        /* renamed from: F */
        public static final EnumC10416b f23698F = new EnumC10416b("WEB_VIEW_CLIENT_RECEIVED_ERROR", 30);

        /* renamed from: G */
        public static final EnumC10416b f23699G = new EnumC10416b("INTERNET_UNAVAILABLE_AT_SHOW", 31);

        /* renamed from: H */
        public static final EnumC10416b f23700H = new EnumC10416b("INTERNET_UNAVAILABLE_AT_CACHE", 32);

        static {
            EnumC10416b[] m79780a = m79780a();
            f23701I = m79780a;
            f23702J = C44401b.m3113a(m79780a);
        }

        public EnumC10416b(String str, int i) {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10416b[] m79780a() {
            return new EnumC10416b[]{f23703b, f23704c, f23705d, f23706e, f23707f, f23708g, f23709h, f23710i, f23711j, f23712k, f23713l, f23714m, f23715n, f23716o, f23717p, f23718q, f23719r, f23720s, f23721t, f23722u, f23723v, f23724w, f23725x, f23726y, f23727z, f23693A, f23694B, f23695C, f23696D, f23697E, f23698F, f23699G, f23700H};
        }

        public static EnumC10416b valueOf(String str) {
            return (EnumC10416b) Enum.valueOf(EnumC10416b.class, str);
        }

        public static EnumC10416b[] values() {
            return (EnumC10416b[]) f23701I.clone();
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.InterfaceC10418d
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.internal.Model.CBError$c */
    /* loaded from: classes3.dex */
    public static final class EnumC10417c implements InterfaceC10418d {

        /* renamed from: b */
        public static final EnumC10417c f23728b = new EnumC10417c("MISCELLANEOUS", 0);

        /* renamed from: c */
        public static final EnumC10417c f23729c = new EnumC10417c("INTERNET_UNAVAILABLE", 1);

        /* renamed from: d */
        public static final EnumC10417c f23730d = new EnumC10417c("INVALID_RESPONSE", 2);

        /* renamed from: e */
        public static final EnumC10417c f23731e = new EnumC10417c("UNEXPECTED_RESPONSE", 3);

        /* renamed from: f */
        public static final EnumC10417c f23732f = new EnumC10417c("NETWORK_FAILURE", 4);

        /* renamed from: g */
        public static final EnumC10417c f23733g = new EnumC10417c("HTTP_NOT_FOUND", 5);

        /* renamed from: h */
        public static final EnumC10417c f23734h = new EnumC10417c("HTTP_NOT_OK", 6);

        /* renamed from: i */
        public static final EnumC10417c f23735i = new EnumC10417c("UNSUPPORTED_OS_VERSION", 7);

        /* renamed from: j */
        public static final /* synthetic */ EnumC10417c[] f23736j;

        /* renamed from: k */
        public static final /* synthetic */ EnumEntries f23737k;

        static {
            EnumC10417c[] m79779a = m79779a();
            f23736j = m79779a;
            f23737k = C44401b.m3113a(m79779a);
        }

        public EnumC10417c(String str, int i) {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10417c[] m79779a() {
            return new EnumC10417c[]{f23728b, f23729c, f23730d, f23731e, f23732f, f23733g, f23734h, f23735i};
        }

        public static EnumC10417c valueOf(String str) {
            return (EnumC10417c) Enum.valueOf(EnumC10417c.class, str);
        }

        public static EnumC10417c[] values() {
            return (EnumC10417c[]) f23736j.clone();
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.InterfaceC10418d
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* renamed from: com.chartboost.sdk.internal.Model.CBError$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC10418d {
        String getName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBError(@NotNull InterfaceC10418d type, @NotNull String errorDesc) {
        super(errorDesc);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        this.f23685b = type;
        this.f23686c = errorDesc;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.f23686c;
    }

    @NotNull
    public final EnumC10416b getImpressionError() {
        InterfaceC10418d interfaceC10418d = this.f23685b;
        if (interfaceC10418d == EnumC10417c.f23729c) {
            return EnumC10416b.f23704c;
        }
        if (interfaceC10418d == EnumC10417c.f23733g) {
            return EnumC10416b.f23709h;
        }
        if (interfaceC10418d == EnumC10417c.f23730d) {
            return EnumC10416b.f23718q;
        }
        if (interfaceC10418d == EnumC10417c.f23732f) {
            return EnumC10416b.f23708g;
        }
        return EnumC10416b.f23703b;
    }

    @NotNull
    public final InterfaceC10418d getType() {
        return this.f23685b;
    }
}
