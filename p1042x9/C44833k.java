package p1042x9;

import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import kotlin.Metadata;

/* compiled from: DivActionBinder.kt */
@Metadata
/* renamed from: x9.k */
/* loaded from: classes8.dex */
public final class C44833k implements OverflowMenuSubscriber {

    /* renamed from: a */
    final /* synthetic */ OverflowMenuWrapper f117882a;

    public C44833k(OverflowMenuWrapper overflowMenuWrapper) {
        this.f117882a = overflowMenuWrapper;
    }

    @Override // com.yandex.div.internal.widget.menu.OverflowMenuSubscriber
    public final void dismiss() {
        this.f117882a.m36280b();
    }
}
