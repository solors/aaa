package p837q;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: q.a */
/* loaded from: classes2.dex */
public final class RequestDelegate extends AbstractC39315p {
    @NotNull

    /* renamed from: b */
    private final Lifecycle f103221b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC37708b2 f103222c;

    public RequestDelegate(@NotNull Lifecycle lifecycle, @NotNull InterfaceC37708b2 interfaceC37708b2) {
        super(null);
        this.f103221b = lifecycle;
        this.f103222c = interfaceC37708b2;
    }

    @Override // p837q.AbstractC39315p
    /* renamed from: b */
    public void mo13025b() {
        this.f103221b.removeObserver(this);
    }

    @Override // p837q.AbstractC39315p
    /* renamed from: c */
    public void mo13009c() {
        this.f103221b.addObserver(this);
    }

    /* renamed from: d */
    public void m13141d() {
        InterfaceC37708b2.C37709a.m16410a(this.f103222c, null, 1, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        m13141d();
    }
}
