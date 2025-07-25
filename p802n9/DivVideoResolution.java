package p802n9;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: n9.e */
/* loaded from: classes8.dex */
public final class DivVideoResolution {

    /* renamed from: a */
    private final int f101816a;

    /* renamed from: b */
    private final int f101817b;

    public DivVideoResolution(int i, int i2) {
        this.f101816a = i;
        this.f101817b = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoResolution)) {
            return false;
        }
        DivVideoResolution divVideoResolution = (DivVideoResolution) obj;
        if (this.f101816a == divVideoResolution.f101816a && this.f101817b == divVideoResolution.f101817b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f101816a) * 31) + Integer.hashCode(this.f101817b);
    }

    @NotNull
    public String toString() {
        return "DivVideoResolution(width=" + this.f101816a + ", height=" + this.f101817b + ')';
    }
}
