package com.ironsource;

import android.os.Looper;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.i4 */
/* loaded from: classes6.dex */
public final class C20077i4 {
    @NotNull

    /* renamed from: a */
    public static final C20078a f50519a = new C20078a(null);

    @Metadata
    /* renamed from: com.ironsource.i4$a */
    /* loaded from: classes6.dex */
    public static final class C20078a {
        private C20078a() {
        }

        public /* synthetic */ C20078a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m58038a() {
            if (Intrinsics.m17075f(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }
    }

    /* renamed from: a */
    public static final void m58039a() {
        f50519a.m58038a();
    }
}
