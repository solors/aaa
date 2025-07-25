package p837q;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.C45327u;
import p853r.C39424i;
import p853r.EnumC39423h;

/* compiled from: Options.kt */
@Metadata
/* renamed from: q.n */
/* loaded from: classes2.dex */
public final class C39310n {
    @NotNull

    /* renamed from: a */
    private final Context f103347a;
    @NotNull

    /* renamed from: b */
    private final Bitmap.Config f103348b;
    @Nullable

    /* renamed from: c */
    private final ColorSpace f103349c;
    @NotNull

    /* renamed from: d */
    private final C39424i f103350d;
    @NotNull

    /* renamed from: e */
    private final EnumC39423h f103351e;

    /* renamed from: f */
    private final boolean f103352f;

    /* renamed from: g */
    private final boolean f103353g;

    /* renamed from: h */
    private final boolean f103354h;
    @Nullable

    /* renamed from: i */
    private final String f103355i;
    @NotNull

    /* renamed from: j */
    private final C45327u f103356j;
    @NotNull

    /* renamed from: k */
    private final Tags f103357k;
    @NotNull

    /* renamed from: l */
    private final C39311o f103358l;
    @NotNull

    /* renamed from: m */
    private final EnumC39302b f103359m;
    @NotNull

    /* renamed from: n */
    private final EnumC39302b f103360n;
    @NotNull

    /* renamed from: o */
    private final EnumC39302b f103361o;

    public C39310n(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull C39424i c39424i, @NotNull EnumC39423h enumC39423h, boolean z, boolean z2, boolean z3, @Nullable String str, @NotNull C45327u c45327u, @NotNull Tags tags, @NotNull C39311o c39311o, @NotNull EnumC39302b enumC39302b, @NotNull EnumC39302b enumC39302b2, @NotNull EnumC39302b enumC39302b3) {
        this.f103347a = context;
        this.f103348b = config;
        this.f103349c = colorSpace;
        this.f103350d = c39424i;
        this.f103351e = enumC39423h;
        this.f103352f = z;
        this.f103353g = z2;
        this.f103354h = z3;
        this.f103355i = str;
        this.f103356j = c45327u;
        this.f103357k = tags;
        this.f103358l = c39311o;
        this.f103359m = enumC39302b;
        this.f103360n = enumC39302b2;
        this.f103361o = enumC39302b3;
    }

    @NotNull
    /* renamed from: a */
    public final C39310n m13045a(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull C39424i c39424i, @NotNull EnumC39423h enumC39423h, boolean z, boolean z2, boolean z3, @Nullable String str, @NotNull C45327u c45327u, @NotNull Tags tags, @NotNull C39311o c39311o, @NotNull EnumC39302b enumC39302b, @NotNull EnumC39302b enumC39302b2, @NotNull EnumC39302b enumC39302b3) {
        return new C39310n(context, config, colorSpace, c39424i, enumC39423h, z, z2, z3, str, c45327u, tags, c39311o, enumC39302b, enumC39302b2, enumC39302b3);
    }

    /* renamed from: c */
    public final boolean m13043c() {
        return this.f103352f;
    }

    /* renamed from: d */
    public final boolean m13042d() {
        return this.f103353g;
    }

    @Nullable
    /* renamed from: e */
    public final ColorSpace m13041e() {
        return this.f103349c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39310n) {
            C39310n c39310n = (C39310n) obj;
            if (Intrinsics.m17075f(this.f103347a, c39310n.f103347a) && this.f103348b == c39310n.f103348b && ((Build.VERSION.SDK_INT < 26 || Intrinsics.m17075f(this.f103349c, c39310n.f103349c)) && Intrinsics.m17075f(this.f103350d, c39310n.f103350d) && this.f103351e == c39310n.f103351e && this.f103352f == c39310n.f103352f && this.f103353g == c39310n.f103353g && this.f103354h == c39310n.f103354h && Intrinsics.m17075f(this.f103355i, c39310n.f103355i) && Intrinsics.m17075f(this.f103356j, c39310n.f103356j) && Intrinsics.m17075f(this.f103357k, c39310n.f103357k) && Intrinsics.m17075f(this.f103358l, c39310n.f103358l) && this.f103359m == c39310n.f103359m && this.f103360n == c39310n.f103360n && this.f103361o == c39310n.f103361o)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final Bitmap.Config m13040f() {
        return this.f103348b;
    }

    @NotNull
    /* renamed from: g */
    public final Context m13039g() {
        return this.f103347a;
    }

    @Nullable
    /* renamed from: h */
    public final String m13038h() {
        return this.f103355i;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f103347a.hashCode() * 31) + this.f103348b.hashCode()) * 31;
        ColorSpace colorSpace = this.f103349c;
        int i2 = 0;
        if (colorSpace != null) {
            i = colorSpace.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((((((((hashCode + i) * 31) + this.f103350d.hashCode()) * 31) + this.f103351e.hashCode()) * 31) + Boolean.hashCode(this.f103352f)) * 31) + Boolean.hashCode(this.f103353g)) * 31) + Boolean.hashCode(this.f103354h)) * 31;
        String str = this.f103355i;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((((((((((hashCode2 + i2) * 31) + this.f103356j.hashCode()) * 31) + this.f103357k.hashCode()) * 31) + this.f103358l.hashCode()) * 31) + this.f103359m.hashCode()) * 31) + this.f103360n.hashCode()) * 31) + this.f103361o.hashCode();
    }

    @NotNull
    /* renamed from: i */
    public final EnumC39302b m13037i() {
        return this.f103360n;
    }

    @NotNull
    /* renamed from: j */
    public final C45327u m13036j() {
        return this.f103356j;
    }

    @NotNull
    /* renamed from: k */
    public final EnumC39302b m13035k() {
        return this.f103361o;
    }

    /* renamed from: l */
    public final boolean m13034l() {
        return this.f103354h;
    }

    @NotNull
    /* renamed from: m */
    public final EnumC39423h m13033m() {
        return this.f103351e;
    }

    @NotNull
    /* renamed from: n */
    public final C39424i m13032n() {
        return this.f103350d;
    }

    @NotNull
    /* renamed from: o */
    public final Tags m13031o() {
        return this.f103357k;
    }
}
