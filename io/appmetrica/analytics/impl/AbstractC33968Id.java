package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.Id */
/* loaded from: classes9.dex */
public abstract class AbstractC33968Id {

    /* renamed from: a */
    public final int f93021a = -1;

    /* renamed from: b */
    public final int f93022b = 0;

    /* renamed from: c */
    public final int f93023c = 1;

    /* renamed from: a */
    public final int m22545a(@Nullable Boolean bool) {
        if (bool == null) {
            return this.f93021a;
        }
        if (Intrinsics.m17075f(bool, Boolean.FALSE)) {
            return this.f93022b;
        }
        if (Intrinsics.m17075f(bool, Boolean.TRUE)) {
            return this.f93023c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    /* renamed from: a */
    public final Boolean m22546a(int i) {
        if (i == this.f93022b) {
            return Boolean.FALSE;
        }
        if (i == this.f93023c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
