package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.random.a */
/* loaded from: classes7.dex */
public abstract class PlatformRandom extends Random {
    @Override // kotlin.random.Random
    /* renamed from: b */
    public int mo16982b(int i) {
        return C37623d.m16970f(mo16985i().nextInt(), i);
    }

    @Override // kotlin.random.Random
    /* renamed from: c */
    public int mo16981c() {
        return mo16985i().nextInt();
    }

    @Override // kotlin.random.Random
    /* renamed from: d */
    public int mo16980d(int i) {
        return mo16985i().nextInt(i);
    }

    @Override // kotlin.random.Random
    /* renamed from: f */
    public long mo16978f() {
        return mo16985i().nextLong();
    }

    @NotNull
    /* renamed from: i */
    public abstract Random mo16985i();
}
