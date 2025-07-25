package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.InterfaceC37618e;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.yandex.div.core.widget.c */
/* loaded from: classes8.dex */
public interface AspectView {
    @NotNull

    /* renamed from: X7 */
    public static final C29781a f76009X7 = C29781a.f76010a;

    /* compiled from: AspectView.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.widget.c$a */
    /* loaded from: classes8.dex */
    public static final class C29781a {

        /* renamed from: a */
        static final /* synthetic */ C29781a f76010a = new C29781a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AspectView.kt */
        @Metadata
        /* renamed from: com.yandex.div.core.widget.c$a$a */
        /* loaded from: classes8.dex */
        public static final class C29782a extends Lambda implements Function1<Float, Float> {

            /* renamed from: g */
            public static final C29782a f76011g = new C29782a();

            C29782a() {
                super(1);
            }

            @NotNull
            public final Float invoke(float f) {
                float m16918d;
                m16918d = _Ranges.m16918d(f, 0.0f);
                return Float.valueOf(m16918d);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f) {
                return invoke(f.floatValue());
            }
        }

        private C29781a() {
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC37618e<View, Float> m36529a() {
            return C29788l.m36503c(Float.valueOf(0.0f), C29782a.f76011g);
        }
    }

    void setAspectRatio(float f);
}
