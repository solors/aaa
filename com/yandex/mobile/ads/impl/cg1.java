package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class cg1 {
    @NotNull

    /* renamed from: a */
    private final C30594j0 f77622a;
    @NotNull

    /* renamed from: b */
    private final zf1 f77623b;

    public /* synthetic */ cg1() {
        this(new C30594j0(), new zf1());
    }

    /* renamed from: a */
    public final boolean m35235a(@NotNull Context context, @NotNull List<yf1> preferredPackages) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferredPackages, "preferredPackages");
        Context m30861a = C31079p0.m30861a();
        if (m30861a == null) {
            this.f77622a.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            int i = 0;
            while (context instanceof ContextWrapper) {
                int i2 = i + 1;
                if (i >= 10) {
                    break;
                } else if (context instanceof Activity) {
                    m30861a = context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    i = i2;
                }
            }
            m30861a = null;
        }
        if (m30861a != null) {
            for (yf1 yf1Var : preferredPackages) {
                try {
                    this.f77623b.getClass();
                    m30861a.startActivity(zf1.m26242a(yf1Var));
                    return true;
                } catch (Exception unused) {
                    um0.m28727b(yf1Var.m26931c());
                }
            }
        }
        return false;
    }

    public cg1(@NotNull C30594j0 activityContextProvider, @NotNull zf1 preferredPackageIntentCreator) {
        Intrinsics.checkNotNullParameter(activityContextProvider, "activityContextProvider");
        Intrinsics.checkNotNullParameter(preferredPackageIntentCreator, "preferredPackageIntentCreator");
        this.f77622a = activityContextProvider;
        this.f77623b = preferredPackageIntentCreator;
    }
}
