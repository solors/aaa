package p853r;

import android.view.View;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p853r.ViewSizeResolver;

@Metadata
/* renamed from: r.g */
/* loaded from: classes2.dex */
public final class RealViewSizeResolver<T extends View> implements ViewSizeResolver<T> {
    @NotNull

    /* renamed from: b */
    private final T f103643b;

    /* renamed from: c */
    private final boolean f103644c;

    public RealViewSizeResolver(@NotNull T t, boolean z) {
        this.f103643b = t;
        this.f103644c = z;
    }

    @Override // p853r.ViewSizeResolver
    /* renamed from: a */
    public boolean mo12719a() {
        return this.f103644c;
    }

    @Override // p853r.SizeResolver
    @Nullable
    /* renamed from: b */
    public Object mo12721b(@NotNull Continuation<? super C39424i> continuation) {
        return ViewSizeResolver.C39427a.m12711h(this, continuation);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RealViewSizeResolver) {
            RealViewSizeResolver realViewSizeResolver = (RealViewSizeResolver) obj;
            if (Intrinsics.m17075f(getView(), realViewSizeResolver.getView()) && mo12719a() == realViewSizeResolver.mo12719a()) {
                return true;
            }
        }
        return false;
    }

    @Override // p853r.ViewSizeResolver
    @NotNull
    public T getView() {
        return this.f103643b;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(mo12719a());
    }
}
