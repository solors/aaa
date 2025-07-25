package p833p9;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p833p9.DivViewState;

@Metadata
/* renamed from: p9.i */
/* loaded from: classes8.dex */
public final class PagerState implements DivViewState.InterfaceC39292a {

    /* renamed from: a */
    private final int f103169a;

    public PagerState(int i) {
        this.f103169a = i;
    }

    /* renamed from: a */
    public final int m13218a() {
        return this.f103169a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PagerState) && this.f103169a == ((PagerState) obj).f103169a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.f103169a);
    }

    @NotNull
    public String toString() {
        return "PagerState(currentPageIndex=" + this.f103169a + ')';
    }
}
