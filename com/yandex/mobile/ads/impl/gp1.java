package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gp1 {
    @NotNull

    /* renamed from: a */
    private final dz1 f79740a;

    public /* synthetic */ gp1() {
        this(new dz1());
    }

    /* renamed from: b */
    public static /* synthetic */ Display m33801b(WindowManager windowManager) {
        return m33802a(windowManager);
    }

    /* renamed from: c */
    public static /* synthetic */ Point m33800c(Display display, Point point, gp1 gp1Var) {
        return m33803a(display, point, gp1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public final Point m33804a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        final WindowManager windowManager = (WindowManager) systemService;
        dz1 dz1Var = this.f79740a;
        Callable callable = new Callable() { // from class: com.yandex.mobile.ads.impl.kp2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return gp1.m33801b(windowManager);
            }
        };
        dz1Var.getClass();
        final Display display = (Display) dz1.m34738a(callable, windowManager, "getting display", "WindowManager");
        final Point point = new Point(0, 0);
        dz1 dz1Var2 = this.f79740a;
        Callable tryBlock = new Callable() { // from class: com.yandex.mobile.ads.impl.lp2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return gp1.m33800c(display, point, this);
            }
        };
        dz1Var2.getClass();
        Intrinsics.checkNotNullParameter(tryBlock, "tryBlock");
        Intrinsics.checkNotNullParameter("getting display metrics", "whileWhat");
        Intrinsics.checkNotNullParameter("Display", "whatIsNull");
        Object m34738a = dz1.m34738a(tryBlock, display, "getting display metrics", "Display");
        if (m34738a != 0) {
            point = m34738a;
        }
        return point;
    }

    public gp1(@NotNull dz1 systemServiceUtils) {
        Intrinsics.checkNotNullParameter(systemServiceUtils, "systemServiceUtils");
        this.f79740a = systemServiceUtils;
    }

    /* renamed from: a */
    public static final Display m33802a(WindowManager windowManager) {
        Intrinsics.checkNotNullParameter(windowManager, "$windowManager");
        return windowManager.getDefaultDisplay();
    }

    /* renamed from: a */
    public static final Point m33803a(Display display, Point defaultPoint, gp1 this$0) {
        Intrinsics.checkNotNullParameter(defaultPoint, "$defaultPoint");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (display != null) {
            this$0.getClass();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getRealMetrics(displayMetrics);
            return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        return defaultPoint;
    }
}
