package p853r;

import androidx.annotation.InterfaceC0152Px;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Dimension.kt */
@Metadata
/* renamed from: r.c */
/* loaded from: classes2.dex */
public abstract class AbstractC39420c {

    /* compiled from: Dimension.kt */
    @Metadata
    /* renamed from: r.c$a */
    /* loaded from: classes2.dex */
    public static final class C39421a extends AbstractC39420c {

        /* renamed from: a */
        public final int f103635a;

        public C39421a(@InterfaceC0152Px int i) {
            super(null);
            boolean z;
            this.f103635a = i;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            throw new IllegalArgumentException("px must be > 0.".toString());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C39421a) && this.f103635a == ((C39421a) obj).f103635a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f103635a;
        }

        @NotNull
        public String toString() {
            return String.valueOf(this.f103635a);
        }
    }

    /* compiled from: Dimension.kt */
    @Metadata
    /* renamed from: r.c$b */
    /* loaded from: classes2.dex */
    public static final class C39422b extends AbstractC39420c {
        @NotNull

        /* renamed from: a */
        public static final C39422b f103636a = new C39422b();

        private C39422b() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Dimension.Undefined";
        }
    }

    private AbstractC39420c() {
    }

    public /* synthetic */ AbstractC39420c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
