package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformRandom.kt */
@Metadata
/* renamed from: kotlin.random.b */
/* loaded from: classes7.dex */
public final class C37619b extends PlatformRandom {
    @NotNull

    /* renamed from: d */
    private final C37620a f99343d = new C37620a();

    /* compiled from: PlatformRandom.kt */
    @Metadata
    /* renamed from: kotlin.random.b$a */
    /* loaded from: classes7.dex */
    public static final class C37620a extends ThreadLocal<Random> {
        C37620a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @NotNull
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // kotlin.random.PlatformRandom
    @NotNull
    /* renamed from: i */
    public Random mo16985i() {
        Random random = this.f99343d.get();
        Intrinsics.checkNotNullExpressionValue(random, "get(...)");
        return random;
    }
}
