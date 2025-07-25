package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l7 */
/* loaded from: classes8.dex */
public final class C30774l7 {
    @NotNull

    /* renamed from: a */
    private static final C31082p3 f81701a = new C31082p3(1, "Received unsupported ad type", "Received unsupported ad type. We are already working on this issue.", null);
    @NotNull

    /* renamed from: b */
    private static final C31082p3 f81702b = new C31082p3(5, "android.webkit.WebView database is inoperable", "android.webkit.WebViewDatabase is inoperable. Try using another device for testing.", null);
    @NotNull

    /* renamed from: c */
    private static final C31082p3 f81703c = new C31082p3(1, "Internal state wasn't completely configured", "Internal state wasn't completely configured. Please try again later.", null);
    @NotNull

    /* renamed from: d */
    private static final C31082p3 f81704d = new C31082p3(1, "Incorrect data in server response", "Failed to parse server's response. We are already working on this issue.", null);
    @NotNull

    /* renamed from: e */
    private static final C31082p3 f81705e = new C31082p3(5, "android.webkit.WebView creation failed", "android.webkit.WebView creation failed. Try using another device for testing.", null);
    @NotNull

    /* renamed from: f */
    private static final C31082p3 f81706f = new C31082p3(1, "Invalid server response code", "Unexpected server response code. We are already working on this issue.", null);
    @NotNull

    /* renamed from: g */
    private static final C31082p3 f81707g = new C31082p3(1, "Service temporarily unavailable", "Service temporarily unavailable. Please try again later.", null);
    @NotNull

    /* renamed from: h */
    private static final C31082p3 f81708h = new C31082p3(1, "The loaded banner can't fit in the container.", "The loaded banner can't fit in the container.", null);
    @NotNull

    /* renamed from: i */
    private static final C31082p3 f81709i = new C31082p3(1, "Banner rendering failed with timeout", "Banner rendering failed with timeout. Please try again.", null);
    @NotNull

    /* renamed from: j */
    private static final C31082p3 f81710j = new C31082p3(1, "Invalid SDK state.", "Invalid SDK state.", null);
    @NotNull

    /* renamed from: k */
    private static final C31082p3 f81711k = new C31082p3(1, "Invalid SDK state.", "Invalid SDK state.", null);
    @NotNull

    /* renamed from: l */
    private static final C31082p3 f81712l = new C31082p3(4, "Ad request completed successfully, but there are no ads available.", "Ad request completed successfully, but there are no ads available.", null);
    @NotNull

    /* renamed from: m */
    private static final C31082p3 f81713m;
    @NotNull

    /* renamed from: n */
    private static final C31082p3 f81714n;
    @NotNull

    /* renamed from: o */
    private static final C31082p3 f81715o;
    @NotNull

    /* renamed from: p */
    private static final C31082p3 f81716p;
    @NotNull

    /* renamed from: q */
    private static final C31082p3 f81717q;
    @NotNull

    /* renamed from: r */
    private static final C31082p3 f81718r;
    @NotNull

    /* renamed from: s */
    private static final C31082p3 f81719s;
    @NotNull

    /* renamed from: t */
    private static final C31082p3 f81720t;
    @NotNull

    /* renamed from: u */
    private static final C31082p3 f81721u;
    @NotNull

    /* renamed from: v */
    private static final C31082p3 f81722v;
    @NotNull

    /* renamed from: w */
    private static final C31082p3 f81723w;
    @NotNull

    /* renamed from: x */
    private static final C31082p3 f81724x;
    @NotNull

    /* renamed from: y */
    private static final C31082p3 f81725y;

    /* renamed from: z */
    public static final /* synthetic */ int f81726z = 0;

    static {
        Intrinsics.checkNotNullParameter("Ad request configured incorrectly", "errorType");
        Intrinsics.checkNotNullParameter("Ad request configured incorrectly", "description");
        f81713m = new C31082p3(2, "Ad request configured incorrectly", "Ad request configured incorrectly", null);
        Intrinsics.checkNotNullParameter("Invalid request parameters", "errorType");
        Intrinsics.checkNotNullParameter("Invalid request parameters", "description");
        f81714n = new C31082p3(2, "Invalid request parameters", "Invalid request parameters", null);
        Intrinsics.checkNotNullParameter("Invalid Ad Unit Id. AdUnitId should be not empty string", "errorType");
        Intrinsics.checkNotNullParameter("Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.", "description");
        f81715o = new C31082p3(2, "Invalid Ad Unit Id. AdUnitId should be not empty string", "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.", null);
        Intrinsics.checkNotNullParameter("Invalid ad size. Please, specify AdSize excplicitly", "errorType");
        Intrinsics.checkNotNullParameter("Invalid ad size. Set the ad size using the 'setAdSize' method.", "description");
        f81716p = new C31082p3(2, "Invalid ad size. Please, specify AdSize excplicitly", "Invalid ad size. Set the ad size using the 'setAdSize' method.", null);
        f81717q = new C31082p3(1, "Invalid sdk configuration. Please request another ad.", "Invalid sdk configuration. Please request another ad.", null);
        f81718r = new C31082p3(5, "Device hasn't enough free memory.", "Device has not enough free memory.", null);
        f81719s = new C31082p3(2, "Feed ad preloading has already started", "Feed ad preloading was already started. You should use preloadAd method only once", null);
        f81720t = new C31082p3(3, "Ad request failed with network error", "Ad request failed with network error. Please try again later.", null);
        f81721u = new C31082p3(3, "Ad request failed with no connection error", "Ad request failed with network error. Please try again later.", null);
        f81722v = new C31082p3(3, "Ad request failed with timeout error", "Ad request failed with network error. Please try again later.", null);
        f81723w = new C31082p3(3, "Ad request failed with auth failure", "Ad request failed with network error. Please try again later.", null);
        f81724x = new C31082p3(3, "Ad request failed with client error", "Ad request failed with network error. Please try again later.", null);
        f81725y = new C31082p3(3, "Ad request failed with parse error", "Ad request failed with network error. Please try again later.", null);
    }

    @NotNull
    /* renamed from: a */
    public static C31082p3 m32336a(@NotNull String errorType, @NotNull String description) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(description, "description");
        return m32338a(1, errorType, description);
    }

    @NotNull
    /* renamed from: b */
    public static C31082p3 m32335b() {
        return f81708h;
    }

    @NotNull
    /* renamed from: c */
    public static C31082p3 m32334c() {
        return f81724x;
    }

    @NotNull
    /* renamed from: d */
    public static C31082p3 m32333d() {
        return f81716p;
    }

    @NotNull
    /* renamed from: e */
    public static C31082p3 m32332e() {
        return f81715o;
    }

    @NotNull
    /* renamed from: f */
    public static C31082p3 m32331f() {
        return f81711k;
    }

    @NotNull
    /* renamed from: g */
    public static C31082p3 m32330g() {
        return f81717q;
    }

    @NotNull
    /* renamed from: h */
    public static C31082p3 m32329h() {
        return f81710j;
    }

    @NotNull
    /* renamed from: i */
    public static C31082p3 m32328i() {
        return f81706f;
    }

    @NotNull
    /* renamed from: j */
    public static C31082p3 m32327j() {
        return f81704d;
    }

    @NotNull
    /* renamed from: k */
    public static C31082p3 m32326k() {
        return f81709i;
    }

    @NotNull
    /* renamed from: l */
    public static C31082p3 m32325l() {
        return f81703c;
    }

    @NotNull
    /* renamed from: m */
    public static C31082p3 m32324m() {
        return f81720t;
    }

    @NotNull
    /* renamed from: n */
    public static C31082p3 m32323n() {
        return f81718r;
    }

    @NotNull
    /* renamed from: o */
    public static C31082p3 m32322o() {
        return f81721u;
    }

    @NotNull
    /* renamed from: p */
    public static C31082p3 m32321p() {
        return f81712l;
    }

    @NotNull
    /* renamed from: q */
    public static C31082p3 m32320q() {
        return f81725y;
    }

    @NotNull
    /* renamed from: r */
    public static C31082p3 m32319r() {
        return f81719s;
    }

    @NotNull
    /* renamed from: s */
    public static C31082p3 m32318s() {
        return f81713m;
    }

    @NotNull
    /* renamed from: t */
    public static C31082p3 m32317t() {
        return f81714n;
    }

    @NotNull
    /* renamed from: u */
    public static C31082p3 m32316u() {
        return f81707g;
    }

    @NotNull
    /* renamed from: v */
    public static C31082p3 m32315v() {
        return f81722v;
    }

    @NotNull
    /* renamed from: w */
    public static C31082p3 m32314w() {
        return f81701a;
    }

    @NotNull
    /* renamed from: x */
    public static C31082p3 m32313x() {
        return f81705e;
    }

    @NotNull
    /* renamed from: y */
    public static C31082p3 m32312y() {
        return f81702b;
    }

    @NotNull
    /* renamed from: a */
    public static C31082p3 m32337a(@Nullable String str) {
        String str2;
        String errorType;
        if (str == null || str.length() == 0) {
            str2 = "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            errorType = "Invalid Ad Unit Id. AdUnitId should be not empty string";
        } else {
            str2 = "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            errorType = "Provided ad unit id doesn't exist";
        }
        C37612s0 c37612s0 = C37612s0.f99333a;
        String description = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(description, "format(...)");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(description, "description");
        return new C31082p3(2, errorType, description, null);
    }

    @NotNull
    /* renamed from: a */
    public static C31082p3 m32340a() {
        return f81723w;
    }

    @NotNull
    /* renamed from: a */
    public static C31082p3 m32339a(int i, int i2, int i3, int i4, int i5, int i6) {
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.US, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [%dx%d], Received size : [%dx%d], device screen size: [%dx%d].", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, 6));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return new C31082p3(1, "Ad was loaded successfully, but there is not enough space to display it", format, null);
    }

    /* renamed from: a */
    private static C31082p3 m32338a(int i, String str, String str2) {
        return new C31082p3(i, str, str2, null);
    }
}
