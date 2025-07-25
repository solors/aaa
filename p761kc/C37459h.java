package p761kc;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpHeaderValueParser.kt */
@Metadata
/* renamed from: kc.h */
/* loaded from: classes9.dex */
public final class C37459h {
    @NotNull

    /* renamed from: a */
    private final String f98880a;
    @NotNull

    /* renamed from: b */
    private final String f98881b;

    /* renamed from: c */
    private final boolean f98882c;

    public C37459h(@NotNull String name, @NotNull String value, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f98880a = name;
        this.f98881b = value;
        this.f98882c = z;
    }

    @NotNull
    /* renamed from: a */
    public final String m17974a() {
        return this.f98880a;
    }

    @NotNull
    /* renamed from: b */
    public final String m17973b() {
        return this.f98881b;
    }

    public boolean equals(@Nullable Object obj) {
        boolean m16615y;
        boolean m16615y2;
        if (obj instanceof C37459h) {
            C37459h c37459h = (C37459h) obj;
            m16615y = StringsJVM.m16615y(c37459h.f98880a, this.f98880a, true);
            if (m16615y) {
                m16615y2 = StringsJVM.m16615y(c37459h.f98881b, this.f98881b, true);
                if (m16615y2) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f98880a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f98881b.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeaderValueParam(name=" + this.f98880a + ", value=" + this.f98881b + ", escapeValue=" + this.f98882c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37459h(@NotNull String name, @NotNull String value) {
        this(name, value, false);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
