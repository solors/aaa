package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Regex.kt */
@Metadata
/* renamed from: kotlin.text.f */
/* loaded from: classes7.dex */
public final class EnumC37685f {

    /* renamed from: d */
    public static final EnumC37685f f99474d = new EnumC37685f("IGNORE_CASE", 0, 2, 0, 2, null);

    /* renamed from: f */
    public static final EnumC37685f f99475f = new EnumC37685f("MULTILINE", 1, 8, 0, 2, null);

    /* renamed from: g */
    public static final EnumC37685f f99476g = new EnumC37685f("LITERAL", 2, 16, 0, 2, null);

    /* renamed from: h */
    public static final EnumC37685f f99477h = new EnumC37685f("UNIX_LINES", 3, 1, 0, 2, null);

    /* renamed from: i */
    public static final EnumC37685f f99478i = new EnumC37685f("COMMENTS", 4, 4, 0, 2, null);

    /* renamed from: j */
    public static final EnumC37685f f99479j = new EnumC37685f("DOT_MATCHES_ALL", 5, 32, 0, 2, null);

    /* renamed from: k */
    public static final EnumC37685f f99480k = new EnumC37685f("CANON_EQ", 6, 128, 0, 2, null);

    /* renamed from: l */
    private static final /* synthetic */ EnumC37685f[] f99481l;

    /* renamed from: m */
    private static final /* synthetic */ EnumEntries f99482m;

    /* renamed from: b */
    private final int f99483b;

    /* renamed from: c */
    private final int f99484c;

    static {
        EnumC37685f[] m16730b = m16730b();
        f99481l = m16730b;
        f99482m = C44401b.m3113a(m16730b);
    }

    private EnumC37685f(String str, int i, int i2, int i3) {
        this.f99483b = i2;
        this.f99484c = i3;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC37685f[] m16730b() {
        return new EnumC37685f[]{f99474d, f99475f, f99476g, f99477h, f99478i, f99479j, f99480k};
    }

    public static EnumC37685f valueOf(String str) {
        return (EnumC37685f) Enum.valueOf(EnumC37685f.class, str);
    }

    public static EnumC37685f[] values() {
        return (EnumC37685f[]) f99481l.clone();
    }

    /* renamed from: c */
    public int m16729c() {
        return this.f99483b;
    }

    /* synthetic */ EnumC37685f(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }
}
