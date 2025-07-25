package p837q;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import coil.memory.MemoryCache;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1003v.C44477j;
import p1003v.Contexts;
import p1003v.Requests;
import p1077ze.C45327u;
import p689h.Decoder;
import p748k.Fetcher;
import p837q.C39311o;
import p853r.C39424i;
import p853r.C39426k;
import p853r.C39430m;
import p853r.DisplaySizeResolver;
import p853r.EnumC39423h;
import p853r.Precision;
import p853r.SizeResolver;
import p853r.ViewSizeResolver;
import p869s.Target;
import p869s.ViewTarget;
import p974t.Transformation;
import p988u.InterfaceC44412c;

/* compiled from: ImageRequest.kt */
@Metadata
/* renamed from: q.i */
/* loaded from: classes2.dex */
public final class C39305i {
    @NotNull

    /* renamed from: A */
    private final Lifecycle f103265A;
    @NotNull

    /* renamed from: B */
    private final SizeResolver f103266B;
    @NotNull

    /* renamed from: C */
    private final EnumC39423h f103267C;
    @NotNull

    /* renamed from: D */
    private final C39311o f103268D;
    @Nullable

    /* renamed from: E */
    private final MemoryCache.Key f103269E;
    @Nullable

    /* renamed from: F */
    private final Integer f103270F;
    @Nullable

    /* renamed from: G */
    private final Drawable f103271G;
    @Nullable

    /* renamed from: H */
    private final Integer f103272H;
    @Nullable

    /* renamed from: I */
    private final Drawable f103273I;
    @Nullable

    /* renamed from: J */
    private final Integer f103274J;
    @Nullable

    /* renamed from: K */
    private final Drawable f103275K;
    @NotNull

    /* renamed from: L */
    private final DefinedRequestOptions f103276L;
    @NotNull

    /* renamed from: M */
    private final DefaultRequestOptions f103277M;
    @NotNull

    /* renamed from: a */
    private final Context f103278a;
    @NotNull

    /* renamed from: b */
    private final Object f103279b;
    @Nullable

    /* renamed from: c */
    private final Target f103280c;
    @Nullable

    /* renamed from: d */
    private final InterfaceC39307b f103281d;
    @Nullable

    /* renamed from: e */
    private final MemoryCache.Key f103282e;
    @Nullable

    /* renamed from: f */
    private final String f103283f;
    @NotNull

    /* renamed from: g */
    private final Bitmap.Config f103284g;
    @Nullable

    /* renamed from: h */
    private final ColorSpace f103285h;
    @NotNull

    /* renamed from: i */
    private final Precision f103286i;
    @Nullable

    /* renamed from: j */
    private final Tuples<Fetcher.InterfaceC37366a<?>, Class<?>> f103287j;
    @Nullable

    /* renamed from: k */
    private final Decoder.InterfaceC33439a f103288k;
    @NotNull

    /* renamed from: l */
    private final List<Transformation> f103289l;
    @NotNull

    /* renamed from: m */
    private final InterfaceC44412c.InterfaceC44413a f103290m;
    @NotNull

    /* renamed from: n */
    private final C45327u f103291n;
    @NotNull

    /* renamed from: o */
    private final Tags f103292o;

    /* renamed from: p */
    private final boolean f103293p;

    /* renamed from: q */
    private final boolean f103294q;

    /* renamed from: r */
    private final boolean f103295r;

    /* renamed from: s */
    private final boolean f103296s;
    @NotNull

    /* renamed from: t */
    private final EnumC39302b f103297t;
    @NotNull

    /* renamed from: u */
    private final EnumC39302b f103298u;
    @NotNull

    /* renamed from: v */
    private final EnumC39302b f103299v;
    @NotNull

    /* renamed from: w */
    private final CoroutineDispatcher f103300w;
    @NotNull

    /* renamed from: x */
    private final CoroutineDispatcher f103301x;
    @NotNull

    /* renamed from: y */
    private final CoroutineDispatcher f103302y;
    @NotNull

    /* renamed from: z */
    private final CoroutineDispatcher f103303z;

    /* compiled from: ImageRequest.kt */
    @Metadata
    /* renamed from: q.i$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC39307b {
        @MainThread
        /* renamed from: a */
        void mo13049a(@NotNull C39305i c39305i, @NotNull ImageResult imageResult);

        @MainThread
        /* renamed from: b */
        void mo13048b(@NotNull C39305i c39305i, @NotNull C39316r c39316r);

        @MainThread
        /* renamed from: c */
        void mo13047c(@NotNull C39305i c39305i);

        @MainThread
        /* renamed from: d */
        void mo13046d(@NotNull C39305i c39305i);
    }

    public /* synthetic */ C39305i(Context context, Object obj, Target target, InterfaceC39307b interfaceC39307b, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Tuples tuples, Decoder.InterfaceC33439a interfaceC33439a, List list, InterfaceC44412c.InterfaceC44413a interfaceC44413a, C45327u c45327u, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, EnumC39302b enumC39302b, EnumC39302b enumC39302b2, EnumC39302b enumC39302b3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, EnumC39423h enumC39423h, C39311o c39311o, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, target, interfaceC39307b, key, str, config, colorSpace, precision, tuples, interfaceC33439a, list, interfaceC44413a, c45327u, tags, z, z2, z3, z4, enumC39302b, enumC39302b2, enumC39302b3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, sizeResolver, enumC39423h, c39311o, key2, num, drawable, num2, drawable2, num3, drawable3, definedRequestOptions, defaultRequestOptions);
    }

    /* renamed from: R */
    public static /* synthetic */ C39306a m13088R(C39305i c39305i, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = c39305i.f103278a;
        }
        return c39305i.m13089Q(context);
    }

    @Nullable
    /* renamed from: A */
    public final InterfaceC39307b m13105A() {
        return this.f103281d;
    }

    @Nullable
    /* renamed from: B */
    public final MemoryCache.Key m13104B() {
        return this.f103282e;
    }

    @NotNull
    /* renamed from: C */
    public final EnumC39302b m13103C() {
        return this.f103297t;
    }

    @NotNull
    /* renamed from: D */
    public final EnumC39302b m13102D() {
        return this.f103299v;
    }

    @NotNull
    /* renamed from: E */
    public final C39311o m13101E() {
        return this.f103268D;
    }

    @Nullable
    /* renamed from: F */
    public final Drawable m13100F() {
        return Requests.m2835c(this, this.f103271G, this.f103270F, this.f103277M.m13126l());
    }

    @Nullable
    /* renamed from: G */
    public final MemoryCache.Key m13099G() {
        return this.f103269E;
    }

    @NotNull
    /* renamed from: H */
    public final Precision m13098H() {
        return this.f103286i;
    }

    /* renamed from: I */
    public final boolean m13097I() {
        return this.f103296s;
    }

    @NotNull
    /* renamed from: J */
    public final EnumC39423h m13096J() {
        return this.f103267C;
    }

    @NotNull
    /* renamed from: K */
    public final SizeResolver m13095K() {
        return this.f103266B;
    }

    @NotNull
    /* renamed from: L */
    public final Tags m13094L() {
        return this.f103292o;
    }

    @Nullable
    /* renamed from: M */
    public final Target m13093M() {
        return this.f103280c;
    }

    @NotNull
    /* renamed from: N */
    public final CoroutineDispatcher m13092N() {
        return this.f103303z;
    }

    @NotNull
    /* renamed from: O */
    public final List<Transformation> m13091O() {
        return this.f103289l;
    }

    @NotNull
    /* renamed from: P */
    public final InterfaceC44412c.InterfaceC44413a m13090P() {
        return this.f103290m;
    }

    @NotNull
    /* renamed from: Q */
    public final C39306a m13089Q(@NotNull Context context) {
        return new C39306a(this, context);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39305i) {
            C39305i c39305i = (C39305i) obj;
            if (Intrinsics.m17075f(this.f103278a, c39305i.f103278a) && Intrinsics.m17075f(this.f103279b, c39305i.f103279b) && Intrinsics.m17075f(this.f103280c, c39305i.f103280c) && Intrinsics.m17075f(this.f103281d, c39305i.f103281d) && Intrinsics.m17075f(this.f103282e, c39305i.f103282e) && Intrinsics.m17075f(this.f103283f, c39305i.f103283f) && this.f103284g == c39305i.f103284g && ((Build.VERSION.SDK_INT < 26 || Intrinsics.m17075f(this.f103285h, c39305i.f103285h)) && this.f103286i == c39305i.f103286i && Intrinsics.m17075f(this.f103287j, c39305i.f103287j) && Intrinsics.m17075f(this.f103288k, c39305i.f103288k) && Intrinsics.m17075f(this.f103289l, c39305i.f103289l) && Intrinsics.m17075f(this.f103290m, c39305i.f103290m) && Intrinsics.m17075f(this.f103291n, c39305i.f103291n) && Intrinsics.m17075f(this.f103292o, c39305i.f103292o) && this.f103293p == c39305i.f103293p && this.f103294q == c39305i.f103294q && this.f103295r == c39305i.f103295r && this.f103296s == c39305i.f103296s && this.f103297t == c39305i.f103297t && this.f103298u == c39305i.f103298u && this.f103299v == c39305i.f103299v && Intrinsics.m17075f(this.f103300w, c39305i.f103300w) && Intrinsics.m17075f(this.f103301x, c39305i.f103301x) && Intrinsics.m17075f(this.f103302y, c39305i.f103302y) && Intrinsics.m17075f(this.f103303z, c39305i.f103303z) && Intrinsics.m17075f(this.f103269E, c39305i.f103269E) && Intrinsics.m17075f(this.f103270F, c39305i.f103270F) && Intrinsics.m17075f(this.f103271G, c39305i.f103271G) && Intrinsics.m17075f(this.f103272H, c39305i.f103272H) && Intrinsics.m17075f(this.f103273I, c39305i.f103273I) && Intrinsics.m17075f(this.f103274J, c39305i.f103274J) && Intrinsics.m17075f(this.f103275K, c39305i.f103275K) && Intrinsics.m17075f(this.f103265A, c39305i.f103265A) && Intrinsics.m17075f(this.f103266B, c39305i.f103266B) && this.f103267C == c39305i.f103267C && Intrinsics.m17075f(this.f103268D, c39305i.f103268D) && Intrinsics.m17075f(this.f103276L, c39305i.f103276L) && Intrinsics.m17075f(this.f103277M, c39305i.f103277M))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m13081g() {
        return this.f103293p;
    }

    /* renamed from: h */
    public final boolean m13080h() {
        return this.f103294q;
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
        int hashCode = ((this.f103278a.hashCode() * 31) + this.f103279b.hashCode()) * 31;
        Target target = this.f103280c;
        int i14 = 0;
        if (target != null) {
            i = target.hashCode();
        } else {
            i = 0;
        }
        int i15 = (hashCode + i) * 31;
        InterfaceC39307b interfaceC39307b = this.f103281d;
        if (interfaceC39307b != null) {
            i2 = interfaceC39307b.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        MemoryCache.Key key = this.f103282e;
        if (key != null) {
            i3 = key.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        String str = this.f103283f;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode2 = (((i17 + i4) * 31) + this.f103284g.hashCode()) * 31;
        ColorSpace colorSpace = this.f103285h;
        if (colorSpace != null) {
            i5 = colorSpace.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode3 = (((hashCode2 + i5) * 31) + this.f103286i.hashCode()) * 31;
        Tuples<Fetcher.InterfaceC37366a<?>, Class<?>> tuples = this.f103287j;
        if (tuples != null) {
            i6 = tuples.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (hashCode3 + i6) * 31;
        Decoder.InterfaceC33439a interfaceC33439a = this.f103288k;
        if (interfaceC33439a != null) {
            i7 = interfaceC33439a.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode4 = (((((((((((((((((((((((((((((((((((((((i18 + i7) * 31) + this.f103289l.hashCode()) * 31) + this.f103290m.hashCode()) * 31) + this.f103291n.hashCode()) * 31) + this.f103292o.hashCode()) * 31) + Boolean.hashCode(this.f103293p)) * 31) + Boolean.hashCode(this.f103294q)) * 31) + Boolean.hashCode(this.f103295r)) * 31) + Boolean.hashCode(this.f103296s)) * 31) + this.f103297t.hashCode()) * 31) + this.f103298u.hashCode()) * 31) + this.f103299v.hashCode()) * 31) + this.f103300w.hashCode()) * 31) + this.f103301x.hashCode()) * 31) + this.f103302y.hashCode()) * 31) + this.f103303z.hashCode()) * 31) + this.f103265A.hashCode()) * 31) + this.f103266B.hashCode()) * 31) + this.f103267C.hashCode()) * 31) + this.f103268D.hashCode()) * 31;
        MemoryCache.Key key2 = this.f103269E;
        if (key2 != null) {
            i8 = key2.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (hashCode4 + i8) * 31;
        Integer num = this.f103270F;
        if (num != null) {
            i9 = num.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        Drawable drawable = this.f103271G;
        if (drawable != null) {
            i10 = drawable.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        Integer num2 = this.f103272H;
        if (num2 != null) {
            i11 = num2.hashCode();
        } else {
            i11 = 0;
        }
        int i22 = (i21 + i11) * 31;
        Drawable drawable2 = this.f103273I;
        if (drawable2 != null) {
            i12 = drawable2.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (i22 + i12) * 31;
        Integer num3 = this.f103274J;
        if (num3 != null) {
            i13 = num3.hashCode();
        } else {
            i13 = 0;
        }
        int i24 = (i23 + i13) * 31;
        Drawable drawable3 = this.f103275K;
        if (drawable3 != null) {
            i14 = drawable3.hashCode();
        }
        return ((((i24 + i14) * 31) + this.f103276L.hashCode()) * 31) + this.f103277M.hashCode();
    }

    /* renamed from: i */
    public final boolean m13079i() {
        return this.f103295r;
    }

    @NotNull
    /* renamed from: j */
    public final Bitmap.Config m13078j() {
        return this.f103284g;
    }

    @Nullable
    /* renamed from: k */
    public final ColorSpace m13077k() {
        return this.f103285h;
    }

    @NotNull
    /* renamed from: l */
    public final Context m13076l() {
        return this.f103278a;
    }

    @NotNull
    /* renamed from: m */
    public final Object m13075m() {
        return this.f103279b;
    }

    @NotNull
    /* renamed from: n */
    public final CoroutineDispatcher m13074n() {
        return this.f103302y;
    }

    @Nullable
    /* renamed from: o */
    public final Decoder.InterfaceC33439a m13073o() {
        return this.f103288k;
    }

    @NotNull
    /* renamed from: p */
    public final DefaultRequestOptions m13072p() {
        return this.f103277M;
    }

    @NotNull
    /* renamed from: q */
    public final DefinedRequestOptions m13071q() {
        return this.f103276L;
    }

    @Nullable
    /* renamed from: r */
    public final String m13070r() {
        return this.f103283f;
    }

    @NotNull
    /* renamed from: s */
    public final EnumC39302b m13069s() {
        return this.f103298u;
    }

    @Nullable
    /* renamed from: t */
    public final Drawable m13068t() {
        return Requests.m2835c(this, this.f103273I, this.f103272H, this.f103277M.m13132f());
    }

    @Nullable
    /* renamed from: u */
    public final Drawable m13067u() {
        return Requests.m2835c(this, this.f103275K, this.f103274J, this.f103277M.m13131g());
    }

    @NotNull
    /* renamed from: v */
    public final CoroutineDispatcher m13066v() {
        return this.f103301x;
    }

    @Nullable
    /* renamed from: w */
    public final Tuples<Fetcher.InterfaceC37366a<?>, Class<?>> m13065w() {
        return this.f103287j;
    }

    @NotNull
    /* renamed from: x */
    public final C45327u m13064x() {
        return this.f103291n;
    }

    @NotNull
    /* renamed from: y */
    public final CoroutineDispatcher m13063y() {
        return this.f103300w;
    }

    @NotNull
    /* renamed from: z */
    public final Lifecycle m13062z() {
        return this.f103265A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C39305i(Context context, Object obj, Target target, InterfaceC39307b interfaceC39307b, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Tuples<? extends Fetcher.InterfaceC37366a<?>, ? extends Class<?>> tuples, Decoder.InterfaceC33439a interfaceC33439a, List<? extends Transformation> list, InterfaceC44412c.InterfaceC44413a interfaceC44413a, C45327u c45327u, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, EnumC39302b enumC39302b, EnumC39302b enumC39302b2, EnumC39302b enumC39302b3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, EnumC39423h enumC39423h, C39311o c39311o, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions) {
        this.f103278a = context;
        this.f103279b = obj;
        this.f103280c = target;
        this.f103281d = interfaceC39307b;
        this.f103282e = key;
        this.f103283f = str;
        this.f103284g = config;
        this.f103285h = colorSpace;
        this.f103286i = precision;
        this.f103287j = tuples;
        this.f103288k = interfaceC33439a;
        this.f103289l = list;
        this.f103290m = interfaceC44413a;
        this.f103291n = c45327u;
        this.f103292o = tags;
        this.f103293p = z;
        this.f103294q = z2;
        this.f103295r = z3;
        this.f103296s = z4;
        this.f103297t = enumC39302b;
        this.f103298u = enumC39302b2;
        this.f103299v = enumC39302b3;
        this.f103300w = coroutineDispatcher;
        this.f103301x = coroutineDispatcher2;
        this.f103302y = coroutineDispatcher3;
        this.f103303z = coroutineDispatcher4;
        this.f103265A = lifecycle;
        this.f103266B = sizeResolver;
        this.f103267C = enumC39423h;
        this.f103268D = c39311o;
        this.f103269E = key2;
        this.f103270F = num;
        this.f103271G = drawable;
        this.f103272H = num2;
        this.f103273I = drawable2;
        this.f103274J = num3;
        this.f103275K = drawable3;
        this.f103276L = definedRequestOptions;
        this.f103277M = defaultRequestOptions;
    }

    /* compiled from: ImageRequest.kt */
    @Metadata
    /* renamed from: q.i$a */
    /* loaded from: classes2.dex */
    public static final class C39306a {
        @Nullable

        /* renamed from: A */
        private CoroutineDispatcher f103304A;
        @Nullable

        /* renamed from: B */
        private C39311o.C39312a f103305B;
        @Nullable

        /* renamed from: C */
        private MemoryCache.Key f103306C;
        @DrawableRes
        @Nullable

        /* renamed from: D */
        private Integer f103307D;
        @Nullable

        /* renamed from: E */
        private Drawable f103308E;
        @DrawableRes
        @Nullable

        /* renamed from: F */
        private Integer f103309F;
        @Nullable

        /* renamed from: G */
        private Drawable f103310G;
        @DrawableRes
        @Nullable

        /* renamed from: H */
        private Integer f103311H;
        @Nullable

        /* renamed from: I */
        private Drawable f103312I;
        @Nullable

        /* renamed from: J */
        private Lifecycle f103313J;
        @Nullable

        /* renamed from: K */
        private SizeResolver f103314K;
        @Nullable

        /* renamed from: L */
        private EnumC39423h f103315L;
        @Nullable

        /* renamed from: M */
        private Lifecycle f103316M;
        @Nullable

        /* renamed from: N */
        private SizeResolver f103317N;
        @Nullable

        /* renamed from: O */
        private EnumC39423h f103318O;
        @NotNull

        /* renamed from: a */
        private final Context f103319a;
        @NotNull

        /* renamed from: b */
        private DefaultRequestOptions f103320b;
        @Nullable

        /* renamed from: c */
        private Object f103321c;
        @Nullable

        /* renamed from: d */
        private Target f103322d;
        @Nullable

        /* renamed from: e */
        private InterfaceC39307b f103323e;
        @Nullable

        /* renamed from: f */
        private MemoryCache.Key f103324f;
        @Nullable

        /* renamed from: g */
        private String f103325g;
        @Nullable

        /* renamed from: h */
        private Bitmap.Config f103326h;
        @Nullable

        /* renamed from: i */
        private ColorSpace f103327i;
        @Nullable

        /* renamed from: j */
        private Precision f103328j;
        @Nullable

        /* renamed from: k */
        private Tuples<? extends Fetcher.InterfaceC37366a<?>, ? extends Class<?>> f103329k;
        @Nullable

        /* renamed from: l */
        private Decoder.InterfaceC33439a f103330l;
        @NotNull

        /* renamed from: m */
        private List<? extends Transformation> f103331m;
        @Nullable

        /* renamed from: n */
        private InterfaceC44412c.InterfaceC44413a f103332n;
        @Nullable

        /* renamed from: o */
        private C45327u.C45328a f103333o;
        @Nullable

        /* renamed from: p */
        private Map<Class<?>, Object> f103334p;

        /* renamed from: q */
        private boolean f103335q;
        @Nullable

        /* renamed from: r */
        private Boolean f103336r;
        @Nullable

        /* renamed from: s */
        private Boolean f103337s;

        /* renamed from: t */
        private boolean f103338t;
        @Nullable

        /* renamed from: u */
        private EnumC39302b f103339u;
        @Nullable

        /* renamed from: v */
        private EnumC39302b f103340v;
        @Nullable

        /* renamed from: w */
        private EnumC39302b f103341w;
        @Nullable

        /* renamed from: x */
        private CoroutineDispatcher f103342x;
        @Nullable

        /* renamed from: y */
        private CoroutineDispatcher f103343y;
        @Nullable

        /* renamed from: z */
        private CoroutineDispatcher f103344z;

        public C39306a(@NotNull Context context) {
            List<? extends Transformation> m17166m;
            this.f103319a = context;
            this.f103320b = Requests.m2836b();
            this.f103321c = null;
            this.f103322d = null;
            this.f103323e = null;
            this.f103324f = null;
            this.f103325g = null;
            this.f103326h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f103327i = null;
            }
            this.f103328j = null;
            this.f103329k = null;
            this.f103330l = null;
            m17166m = C37563v.m17166m();
            this.f103331m = m17166m;
            this.f103332n = null;
            this.f103333o = null;
            this.f103334p = null;
            this.f103335q = true;
            this.f103336r = null;
            this.f103337s = null;
            this.f103338t = true;
            this.f103339u = null;
            this.f103340v = null;
            this.f103341w = null;
            this.f103342x = null;
            this.f103343y = null;
            this.f103344z = null;
            this.f103304A = null;
            this.f103305B = null;
            this.f103306C = null;
            this.f103307D = null;
            this.f103308E = null;
            this.f103309F = null;
            this.f103310G = null;
            this.f103311H = null;
            this.f103312I = null;
            this.f103313J = null;
            this.f103314K = null;
            this.f103315L = null;
            this.f103316M = null;
            this.f103317N = null;
            this.f103318O = null;
        }

        /* renamed from: e */
        private final void m13057e() {
            this.f103318O = null;
        }

        /* renamed from: f */
        private final void m13056f() {
            this.f103316M = null;
            this.f103317N = null;
            this.f103318O = null;
        }

        /* renamed from: g */
        private final Lifecycle m13055g() {
            Context context;
            Target target = this.f103322d;
            if (target instanceof ViewTarget) {
                context = ((ViewTarget) target).getView().getContext();
            } else {
                context = this.f103319a;
            }
            Lifecycle m2846c = Contexts.m2846c(context);
            if (m2846c == null) {
                return GlobalLifecycle.f103263a;
            }
            return m2846c;
        }

        /* renamed from: h */
        private final EnumC39423h m13054h() {
            ViewSizeResolver viewSizeResolver;
            ViewTarget viewTarget;
            View view;
            SizeResolver sizeResolver = this.f103314K;
            View view2 = null;
            if (sizeResolver instanceof ViewSizeResolver) {
                viewSizeResolver = (ViewSizeResolver) sizeResolver;
            } else {
                viewSizeResolver = null;
            }
            if (viewSizeResolver != null && (view = viewSizeResolver.getView()) != null) {
                view2 = view;
            } else {
                Target target = this.f103322d;
                if (target instanceof ViewTarget) {
                    viewTarget = (ViewTarget) target;
                } else {
                    viewTarget = null;
                }
                if (viewTarget != null) {
                    view2 = viewTarget.getView();
                }
            }
            if (view2 instanceof ImageView) {
                return C44477j.m2821n((ImageView) view2);
            }
            return EnumC39423h.FIT;
        }

        /* renamed from: i */
        private final SizeResolver m13053i() {
            boolean z;
            Target target = this.f103322d;
            if (target instanceof ViewTarget) {
                View view = ((ViewTarget) target).getView();
                if (view instanceof ImageView) {
                    ImageView.ScaleType scaleType = ((ImageView) view).getScaleType();
                    if (scaleType != ImageView.ScaleType.CENTER && scaleType != ImageView.ScaleType.MATRIX) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return C39426k.m12720a(C39424i.f103649d);
                    }
                }
                return C39430m.m12709b(view, false, 2, null);
            }
            return new DisplaySizeResolver(this.f103319a);
        }

        @NotNull
        /* renamed from: a */
        public final C39305i m13061a() {
            C45327u c45327u;
            Tags tags;
            boolean m13137a;
            boolean m13136b;
            C39311o c39311o;
            Context context = this.f103319a;
            Object obj = this.f103321c;
            if (obj == null) {
                obj = NullRequestData.f103345a;
            }
            Object obj2 = obj;
            Target target = this.f103322d;
            InterfaceC39307b interfaceC39307b = this.f103323e;
            MemoryCache.Key key = this.f103324f;
            String str = this.f103325g;
            Bitmap.Config config = this.f103326h;
            if (config == null) {
                config = this.f103320b.m13135c();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f103327i;
            Precision precision = this.f103328j;
            if (precision == null) {
                precision = this.f103320b.m13125m();
            }
            Precision precision2 = precision;
            Tuples<? extends Fetcher.InterfaceC37366a<?>, ? extends Class<?>> tuples = this.f103329k;
            Decoder.InterfaceC33439a interfaceC33439a = this.f103330l;
            List<? extends Transformation> list = this.f103331m;
            InterfaceC44412c.InterfaceC44413a interfaceC44413a = this.f103332n;
            if (interfaceC44413a == null) {
                interfaceC44413a = this.f103320b.m13123o();
            }
            InterfaceC44412c.InterfaceC44413a interfaceC44413a2 = interfaceC44413a;
            C45327u.C45328a c45328a = this.f103333o;
            if (c45328a != null) {
                c45327u = c45328a.m190e();
            } else {
                c45327u = null;
            }
            C45327u m2811x = C44477j.m2811x(c45327u);
            Map<Class<?>, ? extends Object> map = this.f103334p;
            if (map != null) {
                tags = Tags.f103378b.m13012a(map);
            } else {
                tags = null;
            }
            Tags m2812w = C44477j.m2812w(tags);
            boolean z = this.f103335q;
            Boolean bool = this.f103336r;
            if (bool != null) {
                m13137a = bool.booleanValue();
            } else {
                m13137a = this.f103320b.m13137a();
            }
            boolean z2 = m13137a;
            Boolean bool2 = this.f103337s;
            if (bool2 != null) {
                m13136b = bool2.booleanValue();
            } else {
                m13136b = this.f103320b.m13136b();
            }
            boolean z3 = m13136b;
            boolean z4 = this.f103338t;
            EnumC39302b enumC39302b = this.f103339u;
            if (enumC39302b == null) {
                enumC39302b = this.f103320b.m13128j();
            }
            EnumC39302b enumC39302b2 = enumC39302b;
            EnumC39302b enumC39302b3 = this.f103340v;
            if (enumC39302b3 == null) {
                enumC39302b3 = this.f103320b.m13133e();
            }
            EnumC39302b enumC39302b4 = enumC39302b3;
            EnumC39302b enumC39302b5 = this.f103341w;
            if (enumC39302b5 == null) {
                enumC39302b5 = this.f103320b.m13127k();
            }
            EnumC39302b enumC39302b6 = enumC39302b5;
            CoroutineDispatcher coroutineDispatcher = this.f103342x;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.f103320b.m13129i();
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcher3 = this.f103343y;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.f103320b.m13130h();
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            CoroutineDispatcher coroutineDispatcher5 = this.f103344z;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.f103320b.m13134d();
            }
            CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            CoroutineDispatcher coroutineDispatcher7 = this.f103304A;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.f103320b.m13124n();
            }
            CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            Lifecycle lifecycle = this.f103313J;
            if (lifecycle == null && (lifecycle = this.f103316M) == null) {
                lifecycle = m13055g();
            }
            Lifecycle lifecycle2 = lifecycle;
            SizeResolver sizeResolver = this.f103314K;
            if (sizeResolver == null && (sizeResolver = this.f103317N) == null) {
                sizeResolver = m13053i();
            }
            SizeResolver sizeResolver2 = sizeResolver;
            EnumC39423h enumC39423h = this.f103315L;
            if (enumC39423h == null && (enumC39423h = this.f103318O) == null) {
                enumC39423h = m13054h();
            }
            EnumC39423h enumC39423h2 = enumC39423h;
            C39311o.C39312a c39312a = this.f103305B;
            if (c39312a != null) {
                c39311o = c39312a.m13027a();
            } else {
                c39311o = null;
            }
            return new C39305i(context, obj2, target, interfaceC39307b, key, str, config2, colorSpace, precision2, tuples, interfaceC33439a, list, interfaceC44413a2, m2811x, m2812w, z, z2, z3, z4, enumC39302b2, enumC39302b4, enumC39302b6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle2, sizeResolver2, enumC39423h2, C44477j.m2813v(c39311o), this.f103306C, this.f103307D, this.f103308E, this.f103309F, this.f103310G, this.f103311H, this.f103312I, new DefinedRequestOptions(this.f103313J, this.f103314K, this.f103315L, this.f103342x, this.f103343y, this.f103344z, this.f103304A, this.f103332n, this.f103328j, this.f103326h, this.f103336r, this.f103337s, this.f103339u, this.f103340v, this.f103341w), this.f103320b, null);
        }

        @NotNull
        /* renamed from: b */
        public final C39306a m13060b(@Nullable Object obj) {
            this.f103321c = obj;
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C39306a m13059c(@NotNull DefaultRequestOptions defaultRequestOptions) {
            this.f103320b = defaultRequestOptions;
            m13057e();
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final C39306a m13058d(@NotNull Precision precision) {
            this.f103328j = precision;
            return this;
        }

        @NotNull
        /* renamed from: j */
        public final C39306a m13052j(@NotNull EnumC39423h enumC39423h) {
            this.f103315L = enumC39423h;
            return this;
        }

        @NotNull
        /* renamed from: k */
        public final C39306a m13051k(@NotNull SizeResolver sizeResolver) {
            this.f103314K = sizeResolver;
            m13056f();
            return this;
        }

        @NotNull
        /* renamed from: l */
        public final C39306a m13050l(@Nullable Target target) {
            this.f103322d = target;
            m13056f();
            return this;
        }

        public C39306a(@NotNull C39305i c39305i, @NotNull Context context) {
            Map<Class<?>, Object> m17285D;
            this.f103319a = context;
            this.f103320b = c39305i.m13072p();
            this.f103321c = c39305i.m13075m();
            this.f103322d = c39305i.m13093M();
            this.f103323e = c39305i.m13105A();
            this.f103324f = c39305i.m13104B();
            this.f103325g = c39305i.m13070r();
            this.f103326h = c39305i.m13071q().m13120c();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f103327i = c39305i.m13077k();
            }
            this.f103328j = c39305i.m13071q().m13112k();
            this.f103329k = c39305i.m13065w();
            this.f103330l = c39305i.m13073o();
            this.f103331m = c39305i.m13091O();
            this.f103332n = c39305i.m13071q().m13108o();
            this.f103333o = c39305i.m13064x().m198f();
            m17285D = C37559r0.m17285D(c39305i.m13094L().m13013a());
            this.f103334p = m17285D;
            this.f103335q = c39305i.m13081g();
            this.f103336r = c39305i.m13071q().m13122a();
            this.f103337s = c39305i.m13071q().m13121b();
            this.f103338t = c39305i.m13097I();
            this.f103339u = c39305i.m13071q().m13114i();
            this.f103340v = c39305i.m13071q().m13118e();
            this.f103341w = c39305i.m13071q().m13113j();
            this.f103342x = c39305i.m13071q().m13116g();
            this.f103343y = c39305i.m13071q().m13117f();
            this.f103344z = c39305i.m13071q().m13119d();
            this.f103304A = c39305i.m13071q().m13109n();
            this.f103305B = c39305i.m13101E().m13028d();
            this.f103306C = c39305i.m13099G();
            this.f103307D = c39305i.f103270F;
            this.f103308E = c39305i.f103271G;
            this.f103309F = c39305i.f103272H;
            this.f103310G = c39305i.f103273I;
            this.f103311H = c39305i.f103274J;
            this.f103312I = c39305i.f103275K;
            this.f103313J = c39305i.m13071q().m13115h();
            this.f103314K = c39305i.m13071q().m13110m();
            this.f103315L = c39305i.m13071q().m13111l();
            if (c39305i.m13076l() == context) {
                this.f103316M = c39305i.m13062z();
                this.f103317N = c39305i.m13095K();
                this.f103318O = c39305i.m13096J();
                return;
            }
            this.f103316M = null;
            this.f103317N = null;
            this.f103318O = null;
        }
    }
}
