package p1073z9;

import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTabsAdapter.kt */
@Metadata
/* renamed from: z9.m */
/* loaded from: classes8.dex */
public final class C45225m {
    @NotNull

    /* renamed from: a */
    private final ScrollableViewPager f118888a;

    public C45225m(@NotNull ScrollableViewPager scrollableViewPager) {
        Intrinsics.checkNotNullParameter(scrollableViewPager, "scrollableViewPager");
        this.f118888a = scrollableViewPager;
    }

    /* renamed from: a */
    public final int m607a() {
        return this.f118888a.getCurrentItem();
    }

    /* renamed from: b */
    public final void m606b(int i) {
        this.f118888a.setCurrentItem(i, true);
    }
}
