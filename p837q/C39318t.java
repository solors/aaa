package p837q;

import android.view.View;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* compiled from: Disposable.kt */
@Metadata
/* renamed from: q.t */
/* loaded from: classes2.dex */
public final class C39318t implements InterfaceC39303e {
    @NotNull

    /* renamed from: a */
    private final View f103381a;
    @NotNull

    /* renamed from: b */
    private volatile Deferred<? extends AbstractC39308j> f103382b;

    public C39318t(@NotNull View view, @NotNull Deferred<? extends AbstractC39308j> deferred) {
        this.f103381a = view;
        this.f103382b = deferred;
    }

    /* renamed from: a */
    public void m13011a(@NotNull Deferred<? extends AbstractC39308j> deferred) {
        this.f103382b = deferred;
    }
}
