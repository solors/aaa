package com.yandex.div.core.view2.errors;

import com.yandex.div.core.InterfaceC29586d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sb.DivData;

@Metadata
/* renamed from: com.yandex.div.core.view2.errors.d */
/* loaded from: classes8.dex */
public class ErrorCollector {
    @NotNull

    /* renamed from: a */
    private final Set<Function2<List<? extends Throwable>, List<? extends Throwable>, Unit>> f75700a = new LinkedHashSet();
    @NotNull

    /* renamed from: b */
    private final List<Throwable> f75701b = new ArrayList();
    @NotNull

    /* renamed from: c */
    private List<? extends Throwable> f75702c;
    @NotNull

    /* renamed from: d */
    private List<Throwable> f75703d;
    @NotNull

    /* renamed from: e */
    private List<Throwable> f75704e;

    /* renamed from: f */
    private boolean f75705f;

    public ErrorCollector() {
        List<? extends Throwable> m17166m;
        m17166m = C37563v.m17166m();
        this.f75702c = m17166m;
        this.f75703d = new ArrayList();
        this.f75704e = new ArrayList();
        this.f75705f = true;
    }

    /* renamed from: a */
    public static /* synthetic */ void m36945a(ErrorCollector errorCollector, Function2 function2) {
        m36937i(errorCollector, function2);
    }

    /* renamed from: g */
    private void m36939g() {
        this.f75705f = false;
        if (this.f75700a.isEmpty()) {
            return;
        }
        m36936j();
        Iterator<T> it = this.f75700a.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).mo105910invoke(this.f75704e, this.f75703d);
        }
    }

    /* renamed from: i */
    public static final void m36937i(ErrorCollector this$0, Function2 observer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        this$0.f75700a.remove(observer);
    }

    /* renamed from: j */
    private void m36936j() {
        if (this.f75705f) {
            return;
        }
        this.f75704e.clear();
        this.f75704e.addAll(this.f75702c);
        this.f75704e.addAll(this.f75701b);
        this.f75705f = true;
    }

    /* renamed from: b */
    public void m36944b(@Nullable DivData divData) {
        List<Exception> m17166m;
        if (divData == null || (m17166m = divData.f106840g) == null) {
            m17166m = C37563v.m17166m();
        }
        this.f75702c = m17166m;
        m36939g();
    }

    /* renamed from: c */
    public void m36943c() {
        this.f75703d.clear();
        this.f75701b.clear();
        m36939g();
    }

    @NotNull
    /* renamed from: d */
    public Iterator<Throwable> m36942d() {
        return this.f75703d.listIterator();
    }

    /* renamed from: e */
    public void m36941e(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f75701b.add(e);
        m36939g();
    }

    /* renamed from: f */
    public void m36940f(@NotNull Throwable warning) {
        Intrinsics.checkNotNullParameter(warning, "warning");
        this.f75703d.add(warning);
        m36939g();
    }

    @NotNull
    /* renamed from: h */
    public InterfaceC29586d m36938h(@NotNull final Function2<? super List<? extends Throwable>, ? super List<? extends Throwable>, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f75700a.add(observer);
        m36936j();
        observer.mo105910invoke(this.f75704e, this.f75703d);
        return new InterfaceC29586d() { // from class: com.yandex.div.core.view2.errors.c
            @Override // com.yandex.div.core.InterfaceC29586d, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorCollector.m36945a(ErrorCollector.this, observer);
            }
        };
    }
}
