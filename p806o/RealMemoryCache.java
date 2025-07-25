package p806o;

import coil.memory.MemoryCache;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1003v.C44473c;

@Metadata
/* renamed from: o.d */
/* loaded from: classes2.dex */
public final class RealMemoryCache implements MemoryCache {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38829g f102221a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC38830h f102222b;

    public RealMemoryCache(@NotNull InterfaceC38829g interfaceC38829g, @NotNull InterfaceC38830h interfaceC38830h) {
        this.f102221a = interfaceC38829g;
        this.f102222b = interfaceC38830h;
    }

    @Override // coil.memory.MemoryCache
    /* renamed from: a */
    public void mo14024a(int i) {
        this.f102221a.mo14006a(i);
        this.f102222b.mo14003a(i);
    }

    @Override // coil.memory.MemoryCache
    @Nullable
    /* renamed from: b */
    public MemoryCache.C3478b mo14023b(@NotNull MemoryCache.Key key) {
        MemoryCache.C3478b mo14005b = this.f102221a.mo14005b(key);
        if (mo14005b == null) {
            return this.f102222b.mo14002b(key);
        }
        return mo14005b;
    }

    @Override // coil.memory.MemoryCache
    /* renamed from: c */
    public void mo14022c(@NotNull MemoryCache.Key key, @NotNull MemoryCache.C3478b c3478b) {
        this.f102221a.mo14004c(MemoryCache.Key.m103427c(key, null, C44473c.m2849b(key.m103426d()), 1, null), c3478b.m103422a(), C44473c.m2849b(c3478b.m103421b()));
    }
}
