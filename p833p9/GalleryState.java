package p833p9;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p833p9.DivViewState;

@Metadata
/* renamed from: p9.h */
/* loaded from: classes8.dex */
public final class GalleryState implements DivViewState.InterfaceC39292a {

    /* renamed from: a */
    private final int f103167a;

    /* renamed from: b */
    private final int f103168b;

    public GalleryState(int i, int i2) {
        this.f103167a = i;
        this.f103168b = i2;
    }

    /* renamed from: a */
    public final int m13220a() {
        return this.f103168b;
    }

    /* renamed from: b */
    public final int m13219b() {
        return this.f103167a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryState)) {
            return false;
        }
        GalleryState galleryState = (GalleryState) obj;
        if (this.f103167a == galleryState.f103167a && this.f103168b == galleryState.f103168b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f103167a) * 31) + Integer.hashCode(this.f103168b);
    }

    @NotNull
    public String toString() {
        return "GalleryState(visibleItemIndex=" + this.f103167a + ", scrollOffset=" + this.f103168b + ')';
    }
}
