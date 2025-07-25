package p984t9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges._Ranges;
import kotlin.text.Regex;
import kotlin.text._Strings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: t9.a */
/* loaded from: classes8.dex */
public abstract class BaseInputMask {
    @NotNull

    /* renamed from: a */
    private C44390b f116506a;
    @NotNull

    /* renamed from: b */
    private final Map<Character, Regex> f116507b;

    /* renamed from: c */
    protected List<? extends AbstractC44387a> f116508c;

    /* renamed from: d */
    private int f116509d;

    /* compiled from: BaseInputMask.kt */
    @Metadata
    /* renamed from: t9.a$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC44387a {

        /* compiled from: BaseInputMask.kt */
        @Metadata
        /* renamed from: t9.a$a$a */
        /* loaded from: classes8.dex */
        public static final class C44388a extends AbstractC44387a {
            @Nullable

            /* renamed from: a */
            private Character f116510a;
            @Nullable

            /* renamed from: b */
            private final Regex f116511b;

            /* renamed from: c */
            private final char f116512c;

            public C44388a(@Nullable Character ch, @Nullable Regex regex, char c) {
                super(null);
                this.f116510a = ch;
                this.f116511b = regex;
                this.f116512c = c;
            }

            @Nullable
            /* renamed from: a */
            public final Character m3204a() {
                return this.f116510a;
            }

            @Nullable
            /* renamed from: b */
            public final Regex m3203b() {
                return this.f116511b;
            }

            /* renamed from: c */
            public final char m3202c() {
                return this.f116512c;
            }

            /* renamed from: d */
            public final void m3201d(@Nullable Character ch) {
                this.f116510a = ch;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C44388a)) {
                    return false;
                }
                C44388a c44388a = (C44388a) obj;
                if (Intrinsics.m17075f(this.f116510a, c44388a.f116510a) && Intrinsics.m17075f(this.f116511b, c44388a.f116511b) && this.f116512c == c44388a.f116512c) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                Character ch = this.f116510a;
                int i = 0;
                if (ch == null) {
                    hashCode = 0;
                } else {
                    hashCode = ch.hashCode();
                }
                int i2 = hashCode * 31;
                Regex regex = this.f116511b;
                if (regex != null) {
                    i = regex.hashCode();
                }
                return ((i2 + i) * 31) + Character.hashCode(this.f116512c);
            }

            @NotNull
            public String toString() {
                return "Dynamic(char=" + this.f116510a + ", filter=" + this.f116511b + ", placeholder=" + this.f116512c + ')';
            }
        }

        /* compiled from: BaseInputMask.kt */
        @Metadata
        /* renamed from: t9.a$a$b */
        /* loaded from: classes8.dex */
        public static final class C44389b extends AbstractC44387a {

            /* renamed from: a */
            private final char f116513a;

            public C44389b(char c) {
                super(null);
                this.f116513a = c;
            }

            /* renamed from: a */
            public final char m3200a() {
                return this.f116513a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C44389b) && this.f116513a == ((C44389b) obj).f116513a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Character.hashCode(this.f116513a);
            }

            @NotNull
            public String toString() {
                return "Static(char=" + this.f116513a + ')';
            }
        }

        private AbstractC44387a() {
        }

        public /* synthetic */ AbstractC44387a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata
    /* renamed from: t9.a$b */
    /* loaded from: classes8.dex */
    public static final class C44390b {
        @NotNull

        /* renamed from: a */
        private final String f116514a;
        @NotNull

        /* renamed from: b */
        private final List<C44391c> f116515b;

        /* renamed from: c */
        private final boolean f116516c;

        public C44390b(@NotNull String pattern, @NotNull List<C44391c> decoding, boolean z) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(decoding, "decoding");
            this.f116514a = pattern;
            this.f116515b = decoding;
            this.f116516c = z;
        }

        /* renamed from: a */
        public final boolean m3199a() {
            return this.f116516c;
        }

        @NotNull
        /* renamed from: b */
        public final List<C44391c> m3198b() {
            return this.f116515b;
        }

        @NotNull
        /* renamed from: c */
        public final String m3197c() {
            return this.f116514a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C44390b)) {
                return false;
            }
            C44390b c44390b = (C44390b) obj;
            if (Intrinsics.m17075f(this.f116514a, c44390b.f116514a) && Intrinsics.m17075f(this.f116515b, c44390b.f116515b) && this.f116516c == c44390b.f116516c) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f116514a.hashCode() * 31) + this.f116515b.hashCode()) * 31;
            boolean z = this.f116516c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        @NotNull
        public String toString() {
            return "MaskData(pattern=" + this.f116514a + ", decoding=" + this.f116515b + ", alwaysVisible=" + this.f116516c + ')';
        }
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata
    /* renamed from: t9.a$c */
    /* loaded from: classes8.dex */
    public static final class C44391c {

        /* renamed from: a */
        private final char f116517a;
        @Nullable

        /* renamed from: b */
        private final String f116518b;

        /* renamed from: c */
        private final char f116519c;

        public C44391c(char c, @Nullable String str, char c2) {
            this.f116517a = c;
            this.f116518b = str;
            this.f116519c = c2;
        }

        @Nullable
        /* renamed from: a */
        public final String m3196a() {
            return this.f116518b;
        }

        /* renamed from: b */
        public final char m3195b() {
            return this.f116517a;
        }

        /* renamed from: c */
        public final char m3194c() {
            return this.f116519c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseInputMask.kt */
    @Metadata
    /* renamed from: t9.a$d */
    /* loaded from: classes8.dex */
    public static final class C44392d extends Lambda implements Functions<Regex> {

        /* renamed from: g */
        final /* synthetic */ C37607l0 f116520g;

        /* renamed from: h */
        final /* synthetic */ BaseInputMask f116521h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44392d(C37607l0 c37607l0, BaseInputMask baseInputMask) {
            super(0);
            this.f116520g = c37607l0;
            this.f116521h = baseInputMask;
        }

        @Override // kotlin.jvm.functions.Functions
        @Nullable
        /* renamed from: b */
        public final Regex invoke() {
            Object m17528s0;
            AbstractC44387a.C44388a c44388a;
            while (this.f116520g.f99325b < this.f116521h.m3216m().size() && !(this.f116521h.m3216m().get(this.f116520g.f99325b) instanceof AbstractC44387a.C44388a)) {
                this.f116520g.f99325b++;
            }
            m17528s0 = _Collections.m17528s0(this.f116521h.m3216m(), this.f116520g.f99325b);
            if (m17528s0 instanceof AbstractC44387a.C44388a) {
                c44388a = (AbstractC44387a.C44388a) m17528s0;
            } else {
                c44388a = null;
            }
            if (c44388a == null) {
                return null;
            }
            return c44388a.m3203b();
        }
    }

    public BaseInputMask(@NotNull C44390b initialMaskData) {
        Intrinsics.checkNotNullParameter(initialMaskData, "initialMaskData");
        this.f116506a = initialMaskData;
        this.f116507b = new LinkedHashMap();
        m3205z(this, initialMaskData, false, 2, null);
    }

    /* renamed from: b */
    public static /* synthetic */ void m3227b(BaseInputMask baseInputMask, String str, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                num = null;
            }
            baseInputMask.mo3180a(str, num);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyChangeFrom");
    }

    /* renamed from: c */
    private final String m3226c(TextDiff textDiff, String str) {
        String substring = str.substring(textDiff.m3172c(), textDiff.m3172c() + textDiff.m3174a());
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    private final String m3225d(TextDiff textDiff) {
        return m3219j(textDiff.m3172c() + textDiff.m3173b(), m3216m().size() - 1);
    }

    /* renamed from: g */
    private final int m3222g(String str, int i) {
        int i2;
        int m16917e;
        if (this.f116507b.size() <= 1) {
            int i3 = 0;
            while (i < m3216m().size()) {
                if (m3216m().get(i) instanceof AbstractC44387a.C44388a) {
                    i3++;
                }
                i++;
            }
            i2 = i3 - str.length();
        } else {
            String m3223f = m3223f(str, i);
            int i4 = 0;
            while (i4 < m3216m().size() && Intrinsics.m17075f(m3223f, m3223f(str, i + i4))) {
                i4++;
            }
            i2 = i4 - 1;
        }
        m16917e = _Ranges.m16917e(i2, 0);
        return m16917e;
    }

    /* renamed from: v */
    public static /* synthetic */ void m3209v(BaseInputMask baseInputMask, String str, int i, Integer num, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                num = null;
            }
            baseInputMask.m3210u(str, i, num);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceChars");
    }

    /* renamed from: z */
    public static /* synthetic */ void m3205z(BaseInputMask baseInputMask, C44390b c44390b, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            baseInputMask.m3206y(c44390b, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMaskData");
    }

    /* renamed from: a */
    public void mo3180a(@NotNull String newValue, @Nullable Integer num) {
        int m16917e;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        TextDiff m3171a = TextDiff.f116530d.m3171a(m3212q(), newValue);
        if (num != null) {
            m16917e = _Ranges.m16917e(num.intValue() - m3171a.m3174a(), 0);
            m3171a = new TextDiff(m16917e, m3171a.m3174a(), m3171a.m3173b());
        }
        m3224e(m3171a, m3211t(m3171a, newValue));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m3224e(@NotNull TextDiff textDiff, int i) {
        Intrinsics.checkNotNullParameter(textDiff, "textDiff");
        int m3215n = m3215n();
        if (textDiff.m3172c() < m3215n) {
            m3215n = Math.min(m3218k(i), m3212q().length());
        }
        this.f116509d = m3215n;
    }

    @NotNull
    /* renamed from: f */
    protected final String m3223f(@NotNull String substring, int i) {
        Intrinsics.checkNotNullParameter(substring, "substring");
        StringBuilder sb2 = new StringBuilder();
        C37607l0 c37607l0 = new C37607l0();
        c37607l0.f99325b = i;
        C44392d c44392d = new C44392d(c37607l0, this);
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            Regex invoke = c44392d.invoke();
            if (invoke != null && invoke.m16766e(String.valueOf(charAt))) {
                sb2.append(charAt);
                c37607l0.f99325b++;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "charsCanBeInsertedStringBuilder.toString()");
        return sb3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m3221h(@NotNull TextDiff textDiff) {
        Intrinsics.checkNotNullParameter(textDiff, "textDiff");
        if (textDiff.m3174a() == 0 && textDiff.m3173b() == 1) {
            int m3172c = textDiff.m3172c();
            while (true) {
                if (m3172c < 0) {
                    break;
                }
                AbstractC44387a abstractC44387a = m3216m().get(m3172c);
                if (abstractC44387a instanceof AbstractC44387a.C44388a) {
                    AbstractC44387a.C44388a c44388a = (AbstractC44387a.C44388a) abstractC44387a;
                    if (c44388a.m3204a() != null) {
                        c44388a.m3201d(null);
                        break;
                    }
                }
                m3172c--;
            }
        }
        m3220i(textDiff.m3172c(), m3216m().size());
    }

    /* renamed from: i */
    protected final void m3220i(int i, int i2) {
        while (i < i2 && i < m3216m().size()) {
            AbstractC44387a abstractC44387a = m3216m().get(i);
            if (abstractC44387a instanceof AbstractC44387a.C44388a) {
                ((AbstractC44387a.C44388a) abstractC44387a).m3201d(null);
            }
            i++;
        }
    }

    @NotNull
    /* renamed from: j */
    protected final String m3219j(int i, int i2) {
        StringBuilder sb2 = new StringBuilder();
        while (i <= i2) {
            AbstractC44387a abstractC44387a = m3216m().get(i);
            if (abstractC44387a instanceof AbstractC44387a.C44388a) {
                AbstractC44387a.C44388a c44388a = (AbstractC44387a.C44388a) abstractC44387a;
                if (c44388a.m3204a() != null) {
                    sb2.append(c44388a.m3204a());
                }
            }
            i++;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "tailStringBuilder.toString()");
        return sb3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final int m3218k(int i) {
        while (i < m3216m().size() && !(m3216m().get(i) instanceof AbstractC44387a.C44388a)) {
            i++;
        }
        return i;
    }

    /* renamed from: l */
    public final int m3217l() {
        return this.f116509d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: m */
    public final List<AbstractC44387a> m3216m() {
        List list = this.f116508c;
        if (list != null) {
            return list;
        }
        Intrinsics.m17056y("destructedValue");
        return null;
    }

    /* renamed from: n */
    protected final int m3215n() {
        boolean z;
        Iterator<AbstractC44387a> it = m3216m().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                AbstractC44387a next = it.next();
                if ((next instanceof AbstractC44387a.C44388a) && ((AbstractC44387a.C44388a) next).m3204a() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return m3216m().size();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: o */
    public final C44390b m3214o() {
        return this.f116506a;
    }

    @NotNull
    /* renamed from: p */
    public final String m3213p() {
        return m3219j(0, m3216m().size() - 1);
    }

    @NotNull
    /* renamed from: q */
    public final String m3212q() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m3216m()) {
            AbstractC44387a abstractC44387a = (AbstractC44387a) obj;
            boolean z = true;
            if (abstractC44387a instanceof AbstractC44387a.C44389b) {
                sb2.append(((AbstractC44387a.C44389b) abstractC44387a).m3200a());
            } else {
                if (abstractC44387a instanceof AbstractC44387a.C44388a) {
                    AbstractC44387a.C44388a c44388a = (AbstractC44387a.C44388a) abstractC44387a;
                    if (c44388a.m3204a() != null) {
                        sb2.append(c44388a.m3204a());
                    }
                }
                if (this.f116506a.m3199a()) {
                    Intrinsics.m17073h(abstractC44387a, "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic");
                    sb2.append(((AbstractC44387a.C44388a) abstractC44387a).m3202c());
                } else {
                    z = false;
                }
            }
            if (!z) {
                break;
            }
            arrayList.add(obj);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "stringBuilder.toString()");
        return sb3;
    }

    /* renamed from: r */
    public abstract void mo3179r(@NotNull Exception exc);

    /* renamed from: s */
    public void mo3178s(@NotNull String newRawValue) {
        Intrinsics.checkNotNullParameter(newRawValue, "newRawValue");
        m3220i(0, m3216m().size());
        m3209v(this, newRawValue, 0, null, 4, null);
        this.f116509d = Math.min(this.f116509d, m3212q().length());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final int m3211t(@NotNull TextDiff textDiff, @NotNull String newValue) {
        boolean z;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(textDiff, "textDiff");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String m3226c = m3226c(textDiff, newValue);
        String m3225d = m3225d(textDiff);
        m3221h(textDiff);
        int m3215n = m3215n();
        if (m3225d.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(m3222g(m3225d, m3215n));
        }
        m3210u(m3226c, m3215n, valueOf);
        int m3215n2 = m3215n();
        m3209v(this, m3225d, m3215n2, null, 4, null);
        return m3215n2;
    }

    /* renamed from: u */
    protected final void m3210u(@NotNull String substring, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(substring, "substring");
        String m3223f = m3223f(substring, i);
        if (num != null) {
            m3223f = _Strings.m16531o1(m3223f, num.intValue());
        }
        int i2 = 0;
        while (i < m3216m().size() && i2 < m3223f.length()) {
            AbstractC44387a abstractC44387a = m3216m().get(i);
            char charAt = m3223f.charAt(i2);
            if (abstractC44387a instanceof AbstractC44387a.C44388a) {
                ((AbstractC44387a.C44388a) abstractC44387a).m3201d(Character.valueOf(charAt));
                i2++;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m3208w(int i) {
        this.f116509d = i;
    }

    /* renamed from: x */
    protected final void m3207x(@NotNull List<? extends AbstractC44387a> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f116508c = list;
    }

    /* renamed from: y */
    public void m3206y(@NotNull C44390b newMaskData, boolean z) {
        String str;
        Object obj;
        Object c44389b;
        boolean z2;
        Intrinsics.checkNotNullParameter(newMaskData, "newMaskData");
        if (!Intrinsics.m17075f(this.f116506a, newMaskData) && z) {
            str = m3213p();
        } else {
            str = null;
        }
        this.f116506a = newMaskData;
        this.f116507b.clear();
        for (C44391c c44391c : this.f116506a.m3198b()) {
            try {
                String m3196a = c44391c.m3196a();
                if (m3196a != null) {
                    this.f116507b.put(Character.valueOf(c44391c.m3195b()), new Regex(m3196a));
                }
            } catch (PatternSyntaxException e) {
                mo3179r(e);
            }
        }
        String m3197c = this.f116506a.m3197c();
        ArrayList arrayList = new ArrayList(m3197c.length());
        for (int i = 0; i < m3197c.length(); i++) {
            char charAt = m3197c.charAt(i);
            Iterator<T> it = this.f116506a.m3198b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C44391c) obj).m3195b() == charAt) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C44391c c44391c2 = (C44391c) obj;
            if (c44391c2 != null) {
                c44389b = new AbstractC44387a.C44388a(null, this.f116507b.get(Character.valueOf(c44391c2.m3195b())), c44391c2.m3194c());
            } else {
                c44389b = new AbstractC44387a.C44389b(charAt);
            }
            arrayList.add(c44389b);
        }
        m3207x(arrayList);
        if (str != null) {
            mo3178s(str);
        }
    }
}
