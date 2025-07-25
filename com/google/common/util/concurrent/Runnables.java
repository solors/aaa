package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class Runnables {

    /* renamed from: a */
    private static final Runnable f41904a = new Runnable() { // from class: com.google.common.util.concurrent.Runnables.1
        @Override // java.lang.Runnable
        public void run() {
        }
    };

    private Runnables() {
    }

    public static Runnable doNothing() {
        return f41904a;
    }
}
