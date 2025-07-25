package kotlin.text;

import com.google.android.exoplayer2.C15633C;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Charsets.kt */
@Metadata
/* loaded from: classes7.dex */
public final class Charsets {
    @NotNull
    public static final Charset UTF_8;
    @NotNull

    /* renamed from: a */
    public static final Charsets f99441a = new Charsets();
    @NotNull

    /* renamed from: b */
    public static final Charset f99442b;
    @NotNull

    /* renamed from: c */
    public static final Charset f99443c;
    @NotNull

    /* renamed from: d */
    public static final Charset f99444d;
    @NotNull

    /* renamed from: e */
    public static final Charset f99445e;
    @NotNull

    /* renamed from: f */
    public static final Charset f99446f;
    @Nullable

    /* renamed from: g */
    private static volatile Charset f99447g;
    @Nullable

    /* renamed from: h */
    private static volatile Charset f99448h;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        UTF_8 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(forName2, "forName(...)");
        f99442b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(forName3, "forName(...)");
        f99443c = forName3;
        Charset forName4 = Charset.forName(C15633C.UTF16LE_NAME);
        Intrinsics.checkNotNullExpressionValue(forName4, "forName(...)");
        f99444d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(forName5, "forName(...)");
        f99445e = forName5;
        Charset forName6 = Charset.forName(C15633C.ISO88591_NAME);
        Intrinsics.checkNotNullExpressionValue(forName6, "forName(...)");
        f99446f = forName6;
    }

    private Charsets() {
    }

    @NotNull
    /* renamed from: a */
    public final Charset m16775a() {
        Charset charset = f99448h;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            f99448h = forName;
            return forName;
        }
        return charset;
    }

    @NotNull
    /* renamed from: b */
    public final Charset m16774b() {
        Charset charset = f99447g;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            f99447g = forName;
            return forName;
        }
        return charset;
    }
}
