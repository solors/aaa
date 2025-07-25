package p837q;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.Nullable;
import p853r.EnumC39423h;
import p853r.Precision;
import p853r.SizeResolver;
import p988u.InterfaceC44412c;

@Metadata
/* renamed from: q.d */
/* loaded from: classes2.dex */
public final class DefinedRequestOptions {
    @Nullable

    /* renamed from: a */
    private final Lifecycle f103245a;
    @Nullable

    /* renamed from: b */
    private final SizeResolver f103246b;
    @Nullable

    /* renamed from: c */
    private final EnumC39423h f103247c;
    @Nullable

    /* renamed from: d */
    private final CoroutineDispatcher f103248d;
    @Nullable

    /* renamed from: e */
    private final CoroutineDispatcher f103249e;
    @Nullable

    /* renamed from: f */
    private final CoroutineDispatcher f103250f;
    @Nullable

    /* renamed from: g */
    private final CoroutineDispatcher f103251g;
    @Nullable

    /* renamed from: h */
    private final InterfaceC44412c.InterfaceC44413a f103252h;
    @Nullable

    /* renamed from: i */
    private final Precision f103253i;
    @Nullable

    /* renamed from: j */
    private final Bitmap.Config f103254j;
    @Nullable

    /* renamed from: k */
    private final Boolean f103255k;
    @Nullable

    /* renamed from: l */
    private final Boolean f103256l;
    @Nullable

    /* renamed from: m */
    private final EnumC39302b f103257m;
    @Nullable

    /* renamed from: n */
    private final EnumC39302b f103258n;
    @Nullable

    /* renamed from: o */
    private final EnumC39302b f103259o;

    public DefinedRequestOptions(@Nullable Lifecycle lifecycle, @Nullable SizeResolver sizeResolver, @Nullable EnumC39423h enumC39423h, @Nullable CoroutineDispatcher coroutineDispatcher, @Nullable CoroutineDispatcher coroutineDispatcher2, @Nullable CoroutineDispatcher coroutineDispatcher3, @Nullable CoroutineDispatcher coroutineDispatcher4, @Nullable InterfaceC44412c.InterfaceC44413a interfaceC44413a, @Nullable Precision precision, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable EnumC39302b enumC39302b, @Nullable EnumC39302b enumC39302b2, @Nullable EnumC39302b enumC39302b3) {
        this.f103245a = lifecycle;
        this.f103246b = sizeResolver;
        this.f103247c = enumC39423h;
        this.f103248d = coroutineDispatcher;
        this.f103249e = coroutineDispatcher2;
        this.f103250f = coroutineDispatcher3;
        this.f103251g = coroutineDispatcher4;
        this.f103252h = interfaceC44413a;
        this.f103253i = precision;
        this.f103254j = config;
        this.f103255k = bool;
        this.f103256l = bool2;
        this.f103257m = enumC39302b;
        this.f103258n = enumC39302b2;
        this.f103259o = enumC39302b3;
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m13122a() {
        return this.f103255k;
    }

    @Nullable
    /* renamed from: b */
    public final Boolean m13121b() {
        return this.f103256l;
    }

    @Nullable
    /* renamed from: c */
    public final Bitmap.Config m13120c() {
        return this.f103254j;
    }

    @Nullable
    /* renamed from: d */
    public final CoroutineDispatcher m13119d() {
        return this.f103250f;
    }

    @Nullable
    /* renamed from: e */
    public final EnumC39302b m13118e() {
        return this.f103258n;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefinedRequestOptions) {
            DefinedRequestOptions definedRequestOptions = (DefinedRequestOptions) obj;
            if (Intrinsics.m17075f(this.f103245a, definedRequestOptions.f103245a) && Intrinsics.m17075f(this.f103246b, definedRequestOptions.f103246b) && this.f103247c == definedRequestOptions.f103247c && Intrinsics.m17075f(this.f103248d, definedRequestOptions.f103248d) && Intrinsics.m17075f(this.f103249e, definedRequestOptions.f103249e) && Intrinsics.m17075f(this.f103250f, definedRequestOptions.f103250f) && Intrinsics.m17075f(this.f103251g, definedRequestOptions.f103251g) && Intrinsics.m17075f(this.f103252h, definedRequestOptions.f103252h) && this.f103253i == definedRequestOptions.f103253i && this.f103254j == definedRequestOptions.f103254j && Intrinsics.m17075f(this.f103255k, definedRequestOptions.f103255k) && Intrinsics.m17075f(this.f103256l, definedRequestOptions.f103256l) && this.f103257m == definedRequestOptions.f103257m && this.f103258n == definedRequestOptions.f103258n && this.f103259o == definedRequestOptions.f103259o) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final CoroutineDispatcher m13117f() {
        return this.f103249e;
    }

    @Nullable
    /* renamed from: g */
    public final CoroutineDispatcher m13116g() {
        return this.f103248d;
    }

    @Nullable
    /* renamed from: h */
    public final Lifecycle m13115h() {
        return this.f103245a;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Lifecycle lifecycle = this.f103245a;
        int i15 = 0;
        if (lifecycle != null) {
            i = lifecycle.hashCode();
        } else {
            i = 0;
        }
        int i16 = i * 31;
        SizeResolver sizeResolver = this.f103246b;
        if (sizeResolver != null) {
            i2 = sizeResolver.hashCode();
        } else {
            i2 = 0;
        }
        int i17 = (i16 + i2) * 31;
        EnumC39423h enumC39423h = this.f103247c;
        if (enumC39423h != null) {
            i3 = enumC39423h.hashCode();
        } else {
            i3 = 0;
        }
        int i18 = (i17 + i3) * 31;
        CoroutineDispatcher coroutineDispatcher = this.f103248d;
        if (coroutineDispatcher != null) {
            i4 = coroutineDispatcher.hashCode();
        } else {
            i4 = 0;
        }
        int i19 = (i18 + i4) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.f103249e;
        if (coroutineDispatcher2 != null) {
            i5 = coroutineDispatcher2.hashCode();
        } else {
            i5 = 0;
        }
        int i20 = (i19 + i5) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.f103250f;
        if (coroutineDispatcher3 != null) {
            i6 = coroutineDispatcher3.hashCode();
        } else {
            i6 = 0;
        }
        int i21 = (i20 + i6) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.f103251g;
        if (coroutineDispatcher4 != null) {
            i7 = coroutineDispatcher4.hashCode();
        } else {
            i7 = 0;
        }
        int i22 = (i21 + i7) * 31;
        InterfaceC44412c.InterfaceC44413a interfaceC44413a = this.f103252h;
        if (interfaceC44413a != null) {
            i8 = interfaceC44413a.hashCode();
        } else {
            i8 = 0;
        }
        int i23 = (i22 + i8) * 31;
        Precision precision = this.f103253i;
        if (precision != null) {
            i9 = precision.hashCode();
        } else {
            i9 = 0;
        }
        int i24 = (i23 + i9) * 31;
        Bitmap.Config config = this.f103254j;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = (i24 + i10) * 31;
        Boolean bool = this.f103255k;
        if (bool != null) {
            i11 = bool.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 31;
        Boolean bool2 = this.f103256l;
        if (bool2 != null) {
            i12 = bool2.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (i26 + i12) * 31;
        EnumC39302b enumC39302b = this.f103257m;
        if (enumC39302b != null) {
            i13 = enumC39302b.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 31;
        EnumC39302b enumC39302b2 = this.f103258n;
        if (enumC39302b2 != null) {
            i14 = enumC39302b2.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 31;
        EnumC39302b enumC39302b3 = this.f103259o;
        if (enumC39302b3 != null) {
            i15 = enumC39302b3.hashCode();
        }
        return i29 + i15;
    }

    @Nullable
    /* renamed from: i */
    public final EnumC39302b m13114i() {
        return this.f103257m;
    }

    @Nullable
    /* renamed from: j */
    public final EnumC39302b m13113j() {
        return this.f103259o;
    }

    @Nullable
    /* renamed from: k */
    public final Precision m13112k() {
        return this.f103253i;
    }

    @Nullable
    /* renamed from: l */
    public final EnumC39423h m13111l() {
        return this.f103247c;
    }

    @Nullable
    /* renamed from: m */
    public final SizeResolver m13110m() {
        return this.f103246b;
    }

    @Nullable
    /* renamed from: n */
    public final CoroutineDispatcher m13109n() {
        return this.f103251g;
    }

    @Nullable
    /* renamed from: o */
    public final InterfaceC44412c.InterfaceC44413a m13108o() {
        return this.f103252h;
    }
}
