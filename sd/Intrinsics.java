package sd;

import kotlin.Metadata;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* renamed from: sd.a */
/* loaded from: classes7.dex */
public final class Intrinsics {

    /* renamed from: b */
    public static final Intrinsics f111779b = new Intrinsics("COROUTINE_SUSPENDED", 0);

    /* renamed from: c */
    public static final Intrinsics f111780c = new Intrinsics("UNDECIDED", 1);

    /* renamed from: d */
    public static final Intrinsics f111781d = new Intrinsics("RESUMED", 2);

    /* renamed from: f */
    private static final /* synthetic */ Intrinsics[] f111782f;

    /* renamed from: g */
    private static final /* synthetic */ EnumEntries f111783g;

    static {
        Intrinsics[] m6968b = m6968b();
        f111782f = m6968b;
        f111783g = C44401b.m3113a(m6968b);
    }

    private Intrinsics(String str, int i) {
    }

    /* renamed from: b */
    private static final /* synthetic */ Intrinsics[] m6968b() {
        return new Intrinsics[]{f111779b, f111780c, f111781d};
    }

    public static Intrinsics valueOf(String str) {
        return (Intrinsics) Enum.valueOf(Intrinsics.class, str);
    }

    public static Intrinsics[] values() {
        return (Intrinsics[]) f111782f.clone();
    }
}
