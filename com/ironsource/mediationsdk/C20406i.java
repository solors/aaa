package com.ironsource.mediationsdk;

import com.ironsource.C21253y4;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.mediationsdk.i */
/* loaded from: classes6.dex */
public final class C20406i {
    @NotNull

    /* renamed from: a */
    private final IronSource.AD_UNIT f51586a;
    @NotNull

    /* renamed from: b */
    private final ArrayList<C21253y4> f51587b;

    /* renamed from: c */
    private boolean f51588c;
    @NotNull

    /* renamed from: d */
    private String f51589d;

    /* renamed from: e */
    private boolean f51590e;
    @NotNull

    /* renamed from: f */
    private Map<String, Object> f51591f;
    @NotNull

    /* renamed from: g */
    private List<String> f51592g;

    /* renamed from: h */
    private int f51593h;
    @Nullable

    /* renamed from: i */
    private C20404h f51594i;
    @Nullable

    /* renamed from: j */
    private IronSourceSegment f51595j;
    @NotNull

    /* renamed from: k */
    private String f51596k;
    @Nullable

    /* renamed from: l */
    private ISBannerSize f51597l;

    /* renamed from: m */
    private boolean f51598m;

    /* renamed from: n */
    private boolean f51599n;

    /* renamed from: o */
    private boolean f51600o;
    @Nullable

    /* renamed from: p */
    private String f51601p;
    @Nullable

    /* renamed from: q */
    private String f51602q;
    @Nullable

    /* renamed from: r */
    private Boolean f51603r;

    public C20406i(@NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f51586a = adUnit;
        this.f51587b = new ArrayList<>();
        this.f51589d = "";
        this.f51591f = new HashMap();
        this.f51592g = new ArrayList();
        this.f51593h = -1;
        this.f51596k = "";
    }

    @NotNull
    /* renamed from: a */
    public final IronSource.AD_UNIT m56858a() {
        return this.f51586a;
    }

    @Nullable
    /* renamed from: b */
    public final String m56845b() {
        return this.f51602q;
    }

    @NotNull
    /* renamed from: c */
    public final IronSource.AD_UNIT m56842c() {
        return this.f51586a;
    }

    @Nullable
    /* renamed from: d */
    public final String m56839d() {
        return this.f51601p;
    }

    @Nullable
    /* renamed from: e */
    public final C20404h m56836e() {
        return this.f51594i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C20406i) && this.f51586a == ((C20406i) obj).f51586a) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final ISBannerSize m56834f() {
        return this.f51597l;
    }

    @NotNull
    /* renamed from: g */
    public final Map<String, Object> m56833g() {
        return this.f51591f;
    }

    public int hashCode() {
        return this.f51586a.hashCode();
    }

    @NotNull
    /* renamed from: i */
    public final String m56831i() {
        return this.f51589d;
    }

    @NotNull
    /* renamed from: j */
    public final ArrayList<C21253y4> m56830j() {
        return this.f51587b;
    }

    @NotNull
    /* renamed from: k */
    public final List<String> m56829k() {
        return this.f51592g;
    }

    @Nullable
    /* renamed from: m */
    public final IronSourceSegment m56827m() {
        return this.f51595j;
    }

    /* renamed from: n */
    public final int m56826n() {
        return this.f51593h;
    }

    /* renamed from: o */
    public final boolean m56825o() {
        return this.f51599n;
    }

    /* renamed from: p */
    public final boolean m56824p() {
        return this.f51600o;
    }

    @NotNull
    /* renamed from: q */
    public final String m56823q() {
        return this.f51596k;
    }

    /* renamed from: r */
    public final boolean m56822r() {
        return this.f51598m;
    }

    /* renamed from: s */
    public final boolean m56821s() {
        return this.f51590e;
    }

    @Nullable
    /* renamed from: t */
    public final Boolean m56820t() {
        return this.f51603r;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f51586a + ')';
    }

    /* renamed from: u */
    public final boolean m56819u() {
        return this.f51588c;
    }

    @NotNull
    /* renamed from: a */
    public final C20406i m56855a(@NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C20406i(adUnit);
    }

    /* renamed from: b */
    public final void m56844b(@Nullable String str) {
        this.f51601p = str;
    }

    /* renamed from: c */
    public final void m56841c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f51589d = str;
    }

    /* renamed from: d */
    public final void m56838d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f51596k = str;
    }

    /* renamed from: e */
    public final void m56835e(boolean z) {
        this.f51600o = z;
    }

    /* renamed from: a */
    public static /* synthetic */ C20406i m56852a(C20406i c20406i, IronSource.AD_UNIT ad_unit, int i, Object obj) {
        if ((i & 1) != 0) {
            ad_unit = c20406i.f51586a;
        }
        return c20406i.m56855a(ad_unit);
    }

    /* renamed from: b */
    public final void m56843b(boolean z) {
        this.f51590e = z;
    }

    /* renamed from: c */
    public final void m56840c(boolean z) {
        this.f51588c = z;
    }

    /* renamed from: d */
    public final void m56837d(boolean z) {
        this.f51599n = z;
    }

    /* renamed from: a */
    public final void m56857a(int i) {
        this.f51593h = i;
    }

    /* renamed from: a */
    public final void m56856a(@Nullable ISBannerSize iSBannerSize) {
        this.f51597l = iSBannerSize;
    }

    /* renamed from: a */
    public final void m56854a(@Nullable IronSourceSegment ironSourceSegment) {
        this.f51595j = ironSourceSegment;
    }

    /* renamed from: a */
    public final void m56853a(@Nullable C20404h c20404h) {
        this.f51594i = c20404h;
    }

    /* renamed from: a */
    public final void m56851a(@NotNull C21253y4 instanceInfo) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.f51587b.add(instanceInfo);
    }

    /* renamed from: a */
    public final void m56850a(@Nullable Boolean bool) {
        this.f51603r = bool;
    }

    /* renamed from: a */
    public final void m56849a(@Nullable String str) {
        this.f51602q = str;
    }

    /* renamed from: a */
    public final void m56848a(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f51592g = list;
    }

    /* renamed from: a */
    public final void m56847a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f51591f = map;
    }

    /* renamed from: a */
    public final void m56846a(boolean z) {
        this.f51598m = z;
    }

    /* renamed from: h */
    public static /* synthetic */ void m56832h() {
    }

    /* renamed from: l */
    public static /* synthetic */ void m56828l() {
    }
}
