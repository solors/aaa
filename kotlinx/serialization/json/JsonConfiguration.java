package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.serialization.json.f */
/* loaded from: classes8.dex */
public final class JsonConfiguration {

    /* renamed from: a */
    private final boolean f99731a;

    /* renamed from: b */
    private final boolean f99732b;

    /* renamed from: c */
    private final boolean f99733c;

    /* renamed from: d */
    private final boolean f99734d;

    /* renamed from: e */
    private final boolean f99735e;

    /* renamed from: f */
    private final boolean f99736f;
    @NotNull

    /* renamed from: g */
    private final String f99737g;

    /* renamed from: h */
    private final boolean f99738h;

    /* renamed from: i */
    private final boolean f99739i;
    @NotNull

    /* renamed from: j */
    private final String f99740j;

    /* renamed from: k */
    private final boolean f99741k;

    /* renamed from: l */
    private final boolean f99742l;

    public JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull String prettyPrintIndent, boolean z7, boolean z8, @NotNull String classDiscriminator, boolean z9, boolean z10, @Nullable JsonNamingStrategy jsonNamingStrategy) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        this.f99731a = z;
        this.f99732b = z2;
        this.f99733c = z3;
        this.f99734d = z4;
        this.f99735e = z5;
        this.f99736f = z6;
        this.f99737g = prettyPrintIndent;
        this.f99738h = z7;
        this.f99739i = z8;
        this.f99740j = classDiscriminator;
        this.f99741k = z9;
        this.f99742l = z10;
    }

    /* renamed from: a */
    public final boolean m15935a() {
        return this.f99741k;
    }

    /* renamed from: b */
    public final boolean m15934b() {
        return this.f99734d;
    }

    @NotNull
    /* renamed from: c */
    public final String m15933c() {
        return this.f99740j;
    }

    /* renamed from: d */
    public final boolean m15932d() {
        return this.f99738h;
    }

    /* renamed from: e */
    public final boolean m15931e() {
        return this.f99731a;
    }

    /* renamed from: f */
    public final boolean m15930f() {
        return this.f99736f;
    }

    /* renamed from: g */
    public final boolean m15929g() {
        return this.f99732b;
    }

    @Nullable
    /* renamed from: h */
    public final JsonNamingStrategy m15928h() {
        return null;
    }

    /* renamed from: i */
    public final boolean m15927i() {
        return this.f99735e;
    }

    @NotNull
    /* renamed from: j */
    public final String m15926j() {
        return this.f99737g;
    }

    /* renamed from: k */
    public final boolean m15925k() {
        return this.f99742l;
    }

    /* renamed from: l */
    public final boolean m15924l() {
        return this.f99739i;
    }

    /* renamed from: m */
    public final boolean m15923m() {
        return this.f99733c;
    }

    @NotNull
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f99731a + ", ignoreUnknownKeys=" + this.f99732b + ", isLenient=" + this.f99733c + ", allowStructuredMapKeys=" + this.f99734d + ", prettyPrint=" + this.f99735e + ", explicitNulls=" + this.f99736f + ", prettyPrintIndent='" + this.f99737g + "', coerceInputValues=" + this.f99738h + ", useArrayPolymorphism=" + this.f99739i + ", classDiscriminator='" + this.f99740j + "', allowSpecialFloatingPointValues=" + this.f99741k + ", useAlternativeNames=" + this.f99742l + ", namingStrategy=" + ((Object) null) + ')';
    }

    public /* synthetic */ JsonConfiguration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, JsonNamingStrategy jsonNamingStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & 1024) == 0 ? z9 : false, (i & 2048) == 0 ? z10 : true, (i & 4096) != 0 ? null : jsonNamingStrategy);
    }
}
