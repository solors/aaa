package kotlin.text;

import kotlin.Metadata;
import kotlin.ranges.C37626b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.text.a */
/* loaded from: classes7.dex */
public class Char extends CharJVM {
    /* renamed from: f */
    public static int m16760f(char c) {
        int m16780a = CharJVM.m16780a(c, 10);
        if (m16780a >= 0) {
            return m16780a;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    /* renamed from: g */
    public static final boolean m16759g(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m16758h(char c) {
        return new C37626b((char) 55296, (char) 57343).m16961g(c);
    }

    @NotNull
    /* renamed from: i */
    public static String m16757i(char c) {
        return _OneToManyTitlecaseMappings.m16514a(c);
    }
}
