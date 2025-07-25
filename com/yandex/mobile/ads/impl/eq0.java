package com.yandex.mobile.ads.impl;

import android.location.Location;
import com.yandex.mobile.ads.impl.ak1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class eq0 {
    @NotNull

    /* renamed from: a */
    private final Object f78750a;

    public eq0(@NotNull Object taskObject) {
        Intrinsics.checkNotNullParameter(taskObject, "taskObject");
        this.f78750a = taskObject;
    }

    @Nullable
    /* renamed from: a */
    public final Location m34471a() {
        Object m35839a = ak1.C29944a.m35839a(this.f78750a, "getResult", new Object[0]);
        if (m35839a instanceof Location) {
            return (Location) m35839a;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m34470b() {
        Boolean bool;
        Object m35839a = ak1.C29944a.m35839a(this.f78750a, "isComplete", new Object[0]);
        if (m35839a instanceof Boolean) {
            bool = (Boolean) m35839a;
        } else {
            bool = null;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
