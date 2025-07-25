package kotlin.text;

import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.text.t */
/* loaded from: classes7.dex */
public class _Strings extends _StringsJvm {
    @NotNull
    /* renamed from: g1 */
    public static String m16539g1(@NotNull String str, int i) {
        boolean z;
        int m16912j;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m16912j = _Ranges.m16912j(i, str.length());
            String substring = str.substring(m16912j);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: h1 */
    public static char m16538h1(@NotNull CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    /* renamed from: i1 */
    public static Character m16537i1(@NotNull CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    /* renamed from: j1 */
    public static char m16536j1(@NotNull CharSequence charSequence) {
        boolean z;
        int m16578Y;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m16578Y = C37690r.m16578Y(charSequence);
            return charSequence.charAt(m16578Y);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Nullable
    /* renamed from: k1 */
    public static Character m16535k1(@NotNull CharSequence charSequence) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    /* renamed from: l1 */
    public static char m16534l1(@NotNull CharSequence charSequence, @NotNull Random random) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return charSequence.charAt(random.mo16980d(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @NotNull
    /* renamed from: m1 */
    public static CharSequence m16533m1(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        Intrinsics.checkNotNullExpressionValue(reverse, "reverse(...)");
        return reverse;
    }

    /* renamed from: n1 */
    public static char m16532n1(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @NotNull
    /* renamed from: o1 */
    public static String m16531o1(@NotNull String str, int i) {
        boolean z;
        int m16912j;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m16912j = _Ranges.m16912j(i, str.length());
            String substring = str.substring(0, m16912j);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    @NotNull
    /* renamed from: p1 */
    public static <C extends Collection<? super Character>> C m16530p1(@NotNull CharSequence charSequence, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            destination.add(Character.valueOf(charSequence.charAt(i)));
        }
        return destination;
    }
}
