package com.ironsource;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.zp */
/* loaded from: classes6.dex */
public final class C21327zp extends ScheduledThreadPoolExecutor {
    @NotNull

    /* renamed from: a */
    private final Function1<Throwable, Unit> f54821a;
    @NotNull

    /* renamed from: b */
    private final Function1<String, Unit> f54822b;

    @Metadata
    /* renamed from: com.ironsource.zp$b */
    /* loaded from: classes6.dex */
    public static final class C21329b extends Lambda implements Function1<String, Unit> {

        /* renamed from: a */
        public static final C21329b f54824a = new C21329b();

        C21329b() {
            super(1);
        }

        /* renamed from: a */
        public final void m53743a(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            m53743a(str);
            return Unit.f99208a;
        }
    }

    public C21327zp() {
        this(0, null, null, 7, null);
    }

    /* renamed from: a */
    private final String m53745a(String str) {
        return C21327zp.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(@Nullable Runnable runnable, @Nullable Throwable th) {
        Function1<Throwable, Unit> function1;
        Throwable e;
        super.afterExecute(runnable, th);
        if (th != null) {
            this.f54822b.invoke(m53745a(th.toString()));
            this.f54821a.invoke(th);
        } else if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e2) {
                C20086i9.m57997d().m58003a(e2);
                this.f54822b.invoke(m53745a(e2.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e3) {
                e = e3;
                C20086i9.m57997d().m58003a(e);
                this.f54822b.invoke(m53745a(e.toString()));
                function1 = this.f54821a;
                function1.invoke(e);
            } catch (ExecutionException e4) {
                C20086i9.m57997d().m58003a(e4);
                this.f54822b.invoke(m53745a(e4.toString()));
                function1 = this.f54821a;
                e = e4.getCause();
                function1.invoke(e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21327zp(int i, @NotNull Function1<? super Throwable, Unit> report, @NotNull Function1<? super String, Unit> log) {
        super(i, new ThreadFactoryC19819ej());
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(log, "log");
        this.f54821a = report;
        this.f54822b = log;
    }

    public /* synthetic */ C21327zp(int i, Function1 function1, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C19595aq.f49182a : i, (i2 & 2) != 0 ? C21328a.f54823a : function1, (i2 & 4) != 0 ? C21329b.f54824a : function12);
    }

    @Metadata
    /* renamed from: com.ironsource.zp$a */
    /* loaded from: classes6.dex */
    public static final class C21328a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: a */
        public static final C21328a f54823a = new C21328a();

        C21328a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            m53744a(th);
            return Unit.f99208a;
        }

        /* renamed from: a */
        public final void m53744a(@Nullable Throwable th) {
        }
    }
}
