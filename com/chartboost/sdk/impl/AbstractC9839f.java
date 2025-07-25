package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.chartboost.sdk.impl.f */
/* loaded from: classes3.dex */
public abstract class AbstractC9839f extends Exception {

    /* renamed from: com.chartboost.sdk.impl.f$a */
    /* loaded from: classes3.dex */
    public static final class C9840a extends AbstractC9839f {

        /* renamed from: b */
        public static final C9840a f21973b = new C9840a();

        public C9840a() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9840a)) {
                return false;
            }
            C9840a c9840a = (C9840a) obj;
            return true;
        }

        public int hashCode() {
            return 400454163;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BAD_BASE_64";
        }
    }

    public AbstractC9839f() {
    }

    public /* synthetic */ AbstractC9839f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
