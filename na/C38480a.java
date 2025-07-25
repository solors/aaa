package na;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.CharJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: Color.kt */
@Metadata
/* renamed from: na.a */
/* loaded from: classes8.dex */
public final class C38480a {
    @NotNull

    /* renamed from: b */
    public static final C38481a f101823b = new C38481a(null);

    /* renamed from: a */
    private final int f101824a;

    /* compiled from: Color.kt */
    @Metadata
    /* renamed from: na.a$a */
    /* loaded from: classes8.dex */
    public static final class C38481a {
        private C38481a() {
        }

        public /* synthetic */ C38481a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m14642a(int i, int i2, int i3, int i4) {
            return C38480a.m14650d((i << 24) | (i2 << 16) | (i3 << 8) | i4);
        }

        /* renamed from: b */
        public final int m14641b(@NotNull String colorString) throws IllegalArgumentException, NumberFormatException {
            boolean z;
            boolean z2;
            String str;
            int checkRadix;
            Intrinsics.checkNotNullParameter(colorString, "colorString");
            if (colorString.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (colorString.charAt(0) == '#') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int length = colorString.length();
                    if (length != 4) {
                        if (length != 5) {
                            if (length != 7) {
                                if (length == 9) {
                                    str = colorString.substring(1);
                                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
                                } else {
                                    throw new IllegalArgumentException("Unknown color " + colorString);
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("ff");
                                String substring = colorString.substring(1);
                                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                                sb2.append(substring);
                                str = sb2.toString();
                            }
                        } else {
                            char charAt = colorString.charAt(1);
                            char charAt2 = colorString.charAt(2);
                            char charAt3 = colorString.charAt(3);
                            char charAt4 = colorString.charAt(4);
                            str = new String(new char[]{charAt, charAt, charAt2, charAt2, charAt3, charAt3, charAt4, charAt4});
                        }
                    } else {
                        char charAt5 = colorString.charAt(1);
                        char charAt6 = colorString.charAt(2);
                        char charAt7 = colorString.charAt(3);
                        str = new String(new char[]{'f', 'f', charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
                    }
                    checkRadix = CharJVM.checkRadix(16);
                    return C38480a.m14650d((int) Long.parseLong(str, checkRadix));
                }
                throw new IllegalArgumentException(("Unknown color " + colorString).toString());
            }
            throw new IllegalArgumentException("Expected color string, actual string is empty".toString());
        }
    }

    private /* synthetic */ C38480a(int i) {
        this.f101824a = i;
    }

    /* renamed from: a */
    public static final int m14653a(int i) {
        return i >>> 24;
    }

    /* renamed from: b */
    public static final int m14652b(int i) {
        return i & 255;
    }

    /* renamed from: c */
    public static final /* synthetic */ C38480a m14651c(int i) {
        return new C38480a(i);
    }

    /* renamed from: e */
    public static boolean m14649e(int i, Object obj) {
        if (!(obj instanceof C38480a) || i != ((C38480a) obj).m14643k()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m14648f(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final int m14647g(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: h */
    public static int m14646h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static final int m14645i(int i) {
        return (i >> 16) & 255;
    }

    @NotNull
    /* renamed from: j */
    public static String m14644j(int i) {
        String m16553p0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('#');
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(value)");
        m16553p0 = C37690r.m16553p0(hexString, 8, '0');
        String upperCase = m16553p0.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb2.append(upperCase);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return m14649e(this.f101824a, obj);
    }

    public int hashCode() {
        return m14646h(this.f101824a);
    }

    /* renamed from: k */
    public final /* synthetic */ int m14643k() {
        return this.f101824a;
    }

    @NotNull
    public String toString() {
        return m14644j(this.f101824a);
    }

    /* renamed from: d */
    public static int m14650d(int i) {
        return i;
    }
}
