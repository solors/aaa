package p833p9;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: p9.l */
/* loaded from: classes8.dex */
public final class UpdateStateChangePageCallback extends ViewPager2.OnPageChangeCallback {
    @NotNull

    /* renamed from: d */
    private final String f103171d;
    @NotNull

    /* renamed from: e */
    private final DivViewState f103172e;

    public UpdateStateChangePageCallback(@NotNull String mBlockId, @NotNull DivViewState mDivViewState) {
        Intrinsics.checkNotNullParameter(mBlockId, "mBlockId");
        Intrinsics.checkNotNullParameter(mDivViewState, "mDivViewState");
        this.f103171d = mBlockId;
        this.f103172e = mDivViewState;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
        super.onPageSelected(i);
        this.f103172e.m13222d(this.f103171d, new PagerState(i));
    }
}
