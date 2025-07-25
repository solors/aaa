package p1043xa;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: xa.a */
/* loaded from: classes8.dex */
public abstract class Field<T> {
    @NotNull

    /* renamed from: b */
    public static final C44957a f118293b = new C44957a(null);

    /* renamed from: a */
    private final boolean f118294a;

    /* compiled from: Field.kt */
    @Metadata
    /* renamed from: xa.a$a */
    /* loaded from: classes8.dex */
    public static final class C44957a {
        private C44957a() {
        }

        public /* synthetic */ C44957a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final <T> Field<T> m1255a(boolean z) {
            Field<T> field;
            if (z) {
                field = C44959c.f118296c;
            } else {
                field = C44958b.f118295c;
            }
            Intrinsics.m17073h(field, "null cannot be cast to non-null type com.yandex.div.internal.template.Field<T of com.yandex.div.internal.template.Field.Companion.nullField>");
            return field;
        }
    }

    /* compiled from: Field.kt */
    @Metadata
    /* renamed from: xa.a$b */
    /* loaded from: classes8.dex */
    public static final class C44958b extends Field<Object> {
        @NotNull

        /* renamed from: c */
        public static final C44958b f118295c = new C44958b();

        private C44958b() {
            super(false, null);
        }
    }

    /* compiled from: Field.kt */
    @Metadata
    /* renamed from: xa.a$c */
    /* loaded from: classes8.dex */
    public static final class C44959c extends Field<Object> {
        @NotNull

        /* renamed from: c */
        public static final C44959c f118296c = new C44959c();

        private C44959c() {
            super(true, null);
        }
    }

    /* compiled from: Field.kt */
    @Metadata
    /* renamed from: xa.a$d */
    /* loaded from: classes8.dex */
    public static final class C44960d<T> extends Field<T> {
        @NotNull

        /* renamed from: c */
        private final String f118297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44960d(boolean z, @NotNull String reference) {
            super(z, null);
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.f118297c = reference;
        }

        @NotNull
        /* renamed from: b */
        public final String m1254b() {
            return this.f118297c;
        }
    }

    /* compiled from: Field.kt */
    @Metadata
    /* renamed from: xa.a$e */
    /* loaded from: classes8.dex */
    public static final class C44961e<T> extends Field<T> {

        /* renamed from: c */
        private final T f118298c;

        public C44961e(boolean z, T t) {
            super(z, null);
            this.f118298c = t;
        }

        /* renamed from: b */
        public final T m1253b() {
            return this.f118298c;
        }
    }

    public /* synthetic */ Field(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: a */
    public final boolean m1256a() {
        return this.f118294a;
    }

    private Field(boolean z) {
        this.f118294a = z;
    }
}
