package mc;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Text.kt */
@Metadata
/* renamed from: mc.h */
/* loaded from: classes9.dex */
public final class C38267h {
    @NotNull

    /* renamed from: a */
    private final String f101141a;

    /* renamed from: b */
    private final int f101142b;

    public C38267h(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f101141a = content;
        String lowerCase = content.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f101142b = lowerCase.hashCode();
    }

    @NotNull
    /* renamed from: a */
    public final String m15234a() {
        return this.f101141a;
    }

    public boolean equals(@Nullable Object obj) {
        C38267h c38267h;
        String str;
        boolean m16615y;
        if (obj instanceof C38267h) {
            c38267h = (C38267h) obj;
        } else {
            c38267h = null;
        }
        if (c38267h != null && (str = c38267h.f101141a) != null) {
            m16615y = StringsJVM.m16615y(str, this.f101141a, true);
            if (!m16615y) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f101142b;
    }

    @NotNull
    public String toString() {
        return this.f101141a;
    }
}
