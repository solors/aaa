package p689h;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: h.j */
/* loaded from: classes2.dex */
public final class ExifUtils {
    @NotNull

    /* renamed from: c */
    public static final C33440a f91256c = new C33440a(null);
    @NotNull

    /* renamed from: d */
    public static final ExifUtils f91257d = new ExifUtils(false, 0);

    /* renamed from: a */
    private final boolean f91258a;

    /* renamed from: b */
    private final int f91259b;

    /* compiled from: ExifUtils.kt */
    @Metadata
    /* renamed from: h.j$a */
    /* loaded from: classes2.dex */
    public static final class C33440a {
        private C33440a() {
        }

        public /* synthetic */ C33440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExifUtils(boolean z, int i) {
        this.f91258a = z;
        this.f91259b = i;
    }

    /* renamed from: a */
    public final int m23939a() {
        return this.f91259b;
    }

    /* renamed from: b */
    public final boolean m23938b() {
        return this.f91258a;
    }
}
