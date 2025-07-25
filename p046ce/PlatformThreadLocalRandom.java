package p046ce;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.PlatformRandom;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ce.a */
/* loaded from: classes7.dex */
public final class PlatformThreadLocalRandom extends PlatformRandom {
    @Override // kotlin.random.Random
    /* renamed from: e */
    public int mo16979e(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.random.Random
    /* renamed from: g */
    public long mo16977g(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // kotlin.random.Random
    /* renamed from: h */
    public long mo16976h(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // kotlin.random.PlatformRandom
    @NotNull
    /* renamed from: i */
    public Random mo16985i() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(current, "current(...)");
        return current;
    }
}
