package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mz1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class lz1 {
    @NotNull

    /* renamed from: a */
    private final mz1 f81979a;
    @NotNull

    /* renamed from: b */
    private final String f81980b;

    /* renamed from: c */
    private boolean f81981c;
    @Nullable

    /* renamed from: d */
    private iz1 f81982d;
    @NotNull

    /* renamed from: e */
    private final ArrayList f81983e;

    /* renamed from: f */
    private boolean f81984f;

    public lz1(@NotNull mz1 taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f81979a = taskRunner;
        this.f81980b = name;
        this.f81983e = new ArrayList();
    }

    /* renamed from: a */
    public final void m32183a(@NotNull iz1 task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f81979a) {
            if (this.f81981c) {
                if (task.m33088a()) {
                    if (mz1.f82496i.isLoggable(Level.FINE)) {
                        jz1.m32693b(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (mz1.f82496i.isLoggable(Level.FINE)) {
                    jz1.m32693b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (m32182a(task, j, false)) {
                this.f81979a.m31732a(this);
            }
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: b */
    public final boolean m32180b() {
        iz1 iz1Var = this.f81982d;
        if (iz1Var != null) {
            Intrinsics.m17074g(iz1Var);
            if (iz1Var.m33088a()) {
                this.f81984f = true;
            }
        }
        boolean z = false;
        for (int size = this.f81983e.size() - 1; -1 < size; size--) {
            if (((iz1) this.f81983e.get(size)).m33088a()) {
                iz1 iz1Var2 = (iz1) this.f81983e.get(size);
                if (mz1.f82496i.isLoggable(Level.FINE)) {
                    jz1.m32693b(iz1Var2, this, "canceled");
                }
                this.f81983e.remove(size);
                z = true;
            }
        }
        return z;
    }

    @Nullable
    /* renamed from: c */
    public final iz1 m32179c() {
        return this.f81982d;
    }

    /* renamed from: d */
    public final boolean m32178d() {
        return this.f81984f;
    }

    @NotNull
    /* renamed from: e */
    public final ArrayList m32177e() {
        return this.f81983e;
    }

    @NotNull
    /* renamed from: f */
    public final String m32176f() {
        return this.f81980b;
    }

    /* renamed from: g */
    public final boolean m32175g() {
        return this.f81981c;
    }

    @NotNull
    /* renamed from: h */
    public final mz1 m32174h() {
        return this.f81979a;
    }

    /* renamed from: i */
    public final void m32173i() {
        this.f81984f = false;
    }

    /* renamed from: j */
    public final void m32172j() {
        if (z32.f88702f && Thread.holdsLock(this)) {
            String name = Thread.currentThread().getName();
            throw new AssertionError("Thread " + name + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f81979a) {
            this.f81981c = true;
            if (m32180b()) {
                this.f81979a.m31732a(this);
            }
            Unit unit = Unit.f99208a;
        }
    }

    @NotNull
    public final String toString() {
        return this.f81980b;
    }

    /* renamed from: a */
    public final boolean m32182a(@NotNull iz1 task, long j, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.m33086a(this);
        long mo31724a = this.f81979a.m31727d().mo31724a();
        long j2 = mo31724a + j;
        int indexOf = this.f81983e.indexOf(task);
        if (indexOf != -1) {
            if (task.m33084c() <= j2) {
                mz1 mz1Var = mz1.f82495h;
                if (mz1.C30893b.m31725a().isLoggable(Level.FINE)) {
                    jz1.m32693b(task, this, "already scheduled");
                }
                return false;
            }
            this.f81983e.remove(indexOf);
        }
        task.m33087a(j2);
        mz1 mz1Var2 = mz1.f82495h;
        if (mz1.C30893b.m31725a().isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + jz1.m32695a(j2 - mo31724a);
            } else {
                str = "scheduled after " + jz1.m32695a(j2 - mo31724a);
            }
            jz1.m32693b(task, this, str);
        }
        Iterator it = this.f81983e.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((iz1) it.next()).m33084c() - mo31724a > j) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            i = this.f81983e.size();
        }
        this.f81983e.add(i, task);
        return i == 0;
    }

    /* renamed from: a */
    public final void m32184a(@Nullable iz1 iz1Var) {
        this.f81982d = iz1Var;
    }

    /* renamed from: a */
    public final void m32185a() {
        if (z32.f88702f && Thread.holdsLock(this)) {
            String name = Thread.currentThread().getName();
            throw new AssertionError("Thread " + name + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f81979a) {
            if (m32180b()) {
                this.f81979a.m31732a(this);
            }
            Unit unit = Unit.f99208a;
        }
    }
}
