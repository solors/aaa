package lb;

import android.database.Cursor;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import md.Provider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1059ya.IOUtils;

@Metadata
/* renamed from: lb.h */
/* loaded from: classes8.dex */
public final class ReadState implements Closeable {
    @NotNull

    /* renamed from: b */
    private final Functions<Unit> f100879b;
    @NotNull

    /* renamed from: c */
    private final Provider<Cursor> f100880c;
    @Nullable

    /* renamed from: d */
    private Cursor f100881d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReadState.kt */
    @Metadata
    /* renamed from: lb.h$a */
    /* loaded from: classes8.dex */
    public static final class C38139a extends Lambda implements Functions<Unit> {

        /* renamed from: g */
        public static final C38139a f100882g = new C38139a();

        C38139a() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Functions
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f99208a;
        }
    }

    public ReadState(@NotNull Functions<Unit> onCloseState, @NotNull Provider<Cursor> cursorProvider) {
        Intrinsics.checkNotNullParameter(onCloseState, "onCloseState");
        Intrinsics.checkNotNullParameter(cursorProvider, "cursorProvider");
        this.f100879b = onCloseState;
        this.f100880c = cursorProvider;
    }

    @NotNull
    /* renamed from: a */
    public final Cursor m15570a() {
        if (this.f100881d == null) {
            Cursor c = this.f100880c.get();
            this.f100881d = c;
            Intrinsics.checkNotNullExpressionValue(c, "c");
            return c;
        }
        throw new RuntimeException("Cursor should be called only once");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.m1006a(this.f100881d);
        this.f100879b.invoke();
    }

    public /* synthetic */ ReadState(Functions functions, Provider provider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C38139a.f100882g : functions, provider);
    }
}
