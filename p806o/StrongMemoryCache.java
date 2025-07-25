package p806o;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1003v.Bitmaps;

@Metadata
/* renamed from: o.a */
/* loaded from: classes2.dex */
public final class StrongMemoryCache implements InterfaceC38829g {
    @NotNull

    /* renamed from: a */
    private final InterfaceC38830h f102217a;

    public StrongMemoryCache(@NotNull InterfaceC38830h interfaceC38830h) {
        this.f102217a = interfaceC38830h;
    }

    @Override // p806o.InterfaceC38829g
    @Nullable
    /* renamed from: b */
    public MemoryCache.C3478b mo14005b(@NotNull MemoryCache.Key key) {
        return null;
    }

    @Override // p806o.InterfaceC38829g
    /* renamed from: c */
    public void mo14004c(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        this.f102217a.mo14001c(key, bitmap, map, Bitmaps.m2856a(bitmap));
    }

    @Override // p806o.InterfaceC38829g
    /* renamed from: a */
    public void mo14006a(int i) {
    }
}
