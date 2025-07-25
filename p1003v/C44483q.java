package p1003v;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p853r.AbstractC39420c;
import p853r.C39424i;

/* compiled from: HardwareBitmaps.kt */
@Metadata
/* renamed from: v.q */
/* loaded from: classes2.dex */
final class C44483q extends AbstractC44481n {
    @NotNull

    /* renamed from: a */
    public static final C44484a f116763a = new C44484a(null);

    /* compiled from: HardwareBitmaps.kt */
    @Metadata
    /* renamed from: v.q$a */
    /* loaded from: classes2.dex */
    public static final class C44484a {
        private C44484a() {
        }

        public /* synthetic */ C44484a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C44483q(@Nullable InterfaceC44485r interfaceC44485r) {
        super(null);
    }

    @Override // p1003v.AbstractC44481n
    /* renamed from: a */
    public boolean mo2797a(@NotNull C39424i c39424i) {
        int i;
        AbstractC39420c m12722b = c39424i.m12722b();
        int i2 = Integer.MAX_VALUE;
        if (m12722b instanceof AbstractC39420c.C39421a) {
            i = ((AbstractC39420c.C39421a) m12722b).f103635a;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i > 100) {
            AbstractC39420c m12723a = c39424i.m12723a();
            if (m12723a instanceof AbstractC39420c.C39421a) {
                i2 = ((AbstractC39420c.C39421a) m12723a).f103635a;
            }
            if (i2 > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // p1003v.AbstractC44481n
    /* renamed from: b */
    public boolean mo2796b() {
        return C44480m.f116752a.m2803b(null);
    }
}
