package za;

import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1059ya.C45080q;

@Metadata
/* renamed from: za.f */
/* loaded from: classes8.dex */
public final class PseudoViewPool implements ViewPool {
    @NotNull

    /* renamed from: a */
    private final ConcurrentHashMap<String, ViewFactory<? extends View>> f118922a = new ConcurrentHashMap<>();

    @Override // za.ViewPool
    @NotNull
    /* renamed from: a */
    public <T extends View> T mo559a(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        T t = (T) ((ViewFactory) C45080q.m972b(this.f118922a, tag, null, 2, null)).mo560a();
        Intrinsics.m17073h(t, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.PseudoViewPool.obtain");
        return t;
    }

    @Override // za.ViewPool
    /* renamed from: b */
    public void mo558b(@NotNull String tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // za.ViewPool
    /* renamed from: c */
    public <T extends View> void mo557c(@NotNull String tag, @NotNull ViewFactory<T> factory, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f118922a.put(tag, factory);
    }
}
