package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.yandex.div.core.view2.l */
/* loaded from: classes8.dex */
public final class DivGestureListener extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b */
    private final boolean f75812b;
    @Nullable

    /* renamed from: c */
    private Functions<Unit> f75813c;
    @Nullable

    /* renamed from: d */
    private Functions<Unit> f75814d;

    public DivGestureListener(boolean z) {
        this.f75812b = z;
    }

    @Nullable
    /* renamed from: a */
    public final Functions<Unit> m36788a() {
        return this.f75814d;
    }

    @Nullable
    /* renamed from: b */
    public final Functions<Unit> m36787b() {
        return this.f75813c;
    }

    /* renamed from: c */
    public final void m36786c(@Nullable Functions<Unit> functions) {
        this.f75814d = functions;
    }

    /* renamed from: d */
    public final void m36785d(@Nullable Functions<Unit> functions) {
        this.f75813c = functions;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Functions<Unit> functions = this.f75814d;
        if (functions != null) {
            functions.invoke();
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.f75812b && (this.f75814d != null || this.f75813c != null)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(@NotNull MotionEvent e) {
        Functions<Unit> functions;
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.f75814d != null && (functions = this.f75813c) != null) {
            if (functions != null) {
                functions.invoke();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@NotNull MotionEvent e) {
        Functions<Unit> functions;
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.f75814d == null && (functions = this.f75813c) != null) {
            if (functions != null) {
                functions.invoke();
                return true;
            }
            return true;
        }
        return false;
    }
}
