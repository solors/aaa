package p835pc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Date.kt */
@Metadata
/* renamed from: pc.d */
/* loaded from: classes9.dex */
public enum EnumC39298d {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");
    
    @NotNull

    /* renamed from: c */
    public static final C39299a f103210c = new C39299a(null);
    @NotNull

    /* renamed from: b */
    private final String f103219b;

    /* compiled from: Date.kt */
    @Metadata
    /* renamed from: pc.d$a */
    /* loaded from: classes9.dex */
    public static final class C39299a {
        private C39299a() {
        }

        public /* synthetic */ C39299a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final EnumC39298d m13192a(int i) {
            return EnumC39298d.values()[i];
        }
    }

    EnumC39298d(String str) {
        this.f103219b = str;
    }
}
