package p629d0;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import java.util.List;
import java.util.Locale;
import p023b0.AnimatableFloatValue;
import p023b0.AnimatableTextFrame;
import p023b0.AnimatableTextProperties;
import p023b0.AnimatableTransform;
import p035c0.ContentModel;
import p035c0.Mask;
import p707i0.Keyframe;

/* renamed from: d0.d */
/* loaded from: classes2.dex */
public class Layer {

    /* renamed from: a */
    private final List<ContentModel> f89405a;

    /* renamed from: b */
    private final LottieComposition f89406b;

    /* renamed from: c */
    private final String f89407c;

    /* renamed from: d */
    private final long f89408d;

    /* renamed from: e */
    private final EnumC32827a f89409e;

    /* renamed from: f */
    private final long f89410f;
    @Nullable

    /* renamed from: g */
    private final String f89411g;

    /* renamed from: h */
    private final List<Mask> f89412h;

    /* renamed from: i */
    private final AnimatableTransform f89413i;

    /* renamed from: j */
    private final int f89414j;

    /* renamed from: k */
    private final int f89415k;

    /* renamed from: l */
    private final int f89416l;

    /* renamed from: m */
    private final float f89417m;

    /* renamed from: n */
    private final float f89418n;

    /* renamed from: o */
    private final int f89419o;

    /* renamed from: p */
    private final int f89420p;
    @Nullable

    /* renamed from: q */
    private final AnimatableTextFrame f89421q;
    @Nullable

    /* renamed from: r */
    private final AnimatableTextProperties f89422r;
    @Nullable

    /* renamed from: s */
    private final AnimatableFloatValue f89423s;

    /* renamed from: t */
    private final List<Keyframe<Float>> f89424t;

    /* renamed from: u */
    private final EnumC32828b f89425u;

    /* renamed from: v */
    private final boolean f89426v;

    /* compiled from: Layer.java */
    /* renamed from: d0.d$a */
    /* loaded from: classes2.dex */
    public enum EnumC32827a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    /* renamed from: d0.d$b */
    /* loaded from: classes2.dex */
    public enum EnumC32828b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<ContentModel> list, LottieComposition lottieComposition, String str, long j, EnumC32827a enumC32827a, long j2, @Nullable String str2, List<Mask> list2, AnimatableTransform animatableTransform, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable AnimatableTextFrame animatableTextFrame, @Nullable AnimatableTextProperties animatableTextProperties, List<Keyframe<Float>> list3, EnumC32828b enumC32828b, @Nullable AnimatableFloatValue animatableFloatValue, boolean z) {
        this.f89405a = list;
        this.f89406b = lottieComposition;
        this.f89407c = str;
        this.f89408d = j;
        this.f89409e = enumC32827a;
        this.f89410f = j2;
        this.f89411g = str2;
        this.f89412h = list2;
        this.f89413i = animatableTransform;
        this.f89414j = i;
        this.f89415k = i2;
        this.f89416l = i3;
        this.f89417m = f;
        this.f89418n = f2;
        this.f89419o = i4;
        this.f89420p = i5;
        this.f89421q = animatableTextFrame;
        this.f89422r = animatableTextProperties;
        this.f89424t = list3;
        this.f89425u = enumC32828b;
        this.f89423s = animatableFloatValue;
        this.f89426v = z;
    }

    /* renamed from: a */
    public LottieComposition m25840a() {
        return this.f89406b;
    }

    /* renamed from: b */
    public long m25839b() {
        return this.f89408d;
    }

    /* renamed from: c */
    public List<Keyframe<Float>> m25838c() {
        return this.f89424t;
    }

    /* renamed from: d */
    public EnumC32827a m25837d() {
        return this.f89409e;
    }

    /* renamed from: e */
    public List<Mask> m25836e() {
        return this.f89412h;
    }

    /* renamed from: f */
    public EnumC32828b m25835f() {
        return this.f89425u;
    }

    /* renamed from: g */
    public String m25834g() {
        return this.f89407c;
    }

    /* renamed from: h */
    public long m25833h() {
        return this.f89410f;
    }

    /* renamed from: i */
    public int m25832i() {
        return this.f89420p;
    }

    /* renamed from: j */
    public int m25831j() {
        return this.f89419o;
    }

    @Nullable
    /* renamed from: k */
    public String m25830k() {
        return this.f89411g;
    }

    /* renamed from: l */
    public List<ContentModel> m25829l() {
        return this.f89405a;
    }

    /* renamed from: m */
    public int m25828m() {
        return this.f89416l;
    }

    /* renamed from: n */
    public int m25827n() {
        return this.f89415k;
    }

    /* renamed from: o */
    public int m25826o() {
        return this.f89414j;
    }

    /* renamed from: p */
    public float m25825p() {
        return this.f89418n / this.f89406b.m103394e();
    }

    @Nullable
    /* renamed from: q */
    public AnimatableTextFrame m25824q() {
        return this.f89421q;
    }

    @Nullable
    /* renamed from: r */
    public AnimatableTextProperties m25823r() {
        return this.f89422r;
    }

    @Nullable
    /* renamed from: s */
    public AnimatableFloatValue m25822s() {
        return this.f89423s;
    }

    /* renamed from: t */
    public float m25821t() {
        return this.f89417m;
    }

    public String toString() {
        return m25818w("");
    }

    /* renamed from: u */
    public AnimatableTransform m25820u() {
        return this.f89413i;
    }

    /* renamed from: v */
    public boolean m25819v() {
        return this.f89426v;
    }

    /* renamed from: w */
    public String m25818w(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(m25834g());
        sb2.append("\n");
        Layer m103379t = this.f89406b.m103379t(m25833h());
        if (m103379t != null) {
            sb2.append("\t\tParents: ");
            sb2.append(m103379t.m25834g());
            Layer m103379t2 = this.f89406b.m103379t(m103379t.m25833h());
            while (m103379t2 != null) {
                sb2.append("->");
                sb2.append(m103379t2.m25834g());
                m103379t2 = this.f89406b.m103379t(m103379t2.m25833h());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!m25836e().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(m25836e().size());
            sb2.append("\n");
        }
        if (m25826o() != 0 && m25827n() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m25826o()), Integer.valueOf(m25827n()), Integer.valueOf(m25828m())));
        }
        if (!this.f89405a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (ContentModel contentModel : this.f89405a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(contentModel);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
