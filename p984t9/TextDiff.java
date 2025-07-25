package p984t9;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: t9.f */
/* loaded from: classes8.dex */
public final class TextDiff {
    @NotNull

    /* renamed from: d */
    public static final C44394a f116530d = new C44394a(null);

    /* renamed from: a */
    private final int f116531a;

    /* renamed from: b */
    private final int f116532b;

    /* renamed from: c */
    private final int f116533c;

    /* compiled from: TextDiff.kt */
    @Metadata
    /* renamed from: t9.f$a */
    /* loaded from: classes8.dex */
    public static final class C44394a {
        private C44394a() {
        }

        public /* synthetic */ C44394a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final TextDiff m3171a(@NotNull String left, @NotNull String right) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            if (left.length() > right.length()) {
                TextDiff m3171a = m3171a(right, left);
                return new TextDiff(m3171a.m3172c(), m3171a.m3173b(), m3171a.m3174a());
            }
            int length = right.length() - 1;
            int length2 = right.length() - left.length();
            int i = 0;
            while (i < length && i < left.length() && left.charAt(i) == right.charAt(i)) {
                i++;
            }
            while (true) {
                int i2 = length - length2;
                if (i2 < i || left.charAt(i2) != right.charAt(length)) {
                    break;
                }
                length--;
            }
            int i3 = (length + 1) - i;
            return new TextDiff(i, i3, i3 - length2);
        }
    }

    public TextDiff(int i, int i2, int i3) {
        this.f116531a = i;
        this.f116532b = i2;
        this.f116533c = i3;
    }

    /* renamed from: a */
    public final int m3174a() {
        return this.f116532b;
    }

    /* renamed from: b */
    public final int m3173b() {
        return this.f116533c;
    }

    /* renamed from: c */
    public final int m3172c() {
        return this.f116531a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextDiff)) {
            return false;
        }
        TextDiff textDiff = (TextDiff) obj;
        if (this.f116531a == textDiff.f116531a && this.f116532b == textDiff.f116532b && this.f116533c == textDiff.f116533c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f116531a) * 31) + Integer.hashCode(this.f116532b)) * 31) + Integer.hashCode(this.f116533c);
    }

    @NotNull
    public String toString() {
        return "TextDiff(start=" + this.f116531a + ", added=" + this.f116532b + ", removed=" + this.f116533c + ')';
    }
}
