package p1003v;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: v.u */
/* loaded from: classes2.dex */
public final class Time {
    @NotNull

    /* renamed from: a */
    public static final Time f116772a = new Time();
    @NotNull

    /* renamed from: b */
    private static Functions<Long> f116773b = C44488a.f116774c;

    /* compiled from: Time.kt */
    @Metadata
    /* renamed from: v.u$a */
    /* loaded from: classes2.dex */
    /* synthetic */ class C44488a extends FunctionReferenceImpl implements Functions<Long> {

        /* renamed from: c */
        public static final C44488a f116774c = new C44488a();

        C44488a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: c */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private Time() {
    }

    /* renamed from: a */
    public final long m2789a() {
        return f116773b.invoke().longValue();
    }
}
