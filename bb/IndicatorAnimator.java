package bb;

import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.AbstractC29811c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: bb.a */
/* loaded from: classes8.dex */
public interface IndicatorAnimator {
    /* renamed from: b */
    void mo103840b(int i);

    @Nullable
    /* renamed from: c */
    RectF mo103839c(float f, float f2, float f3, boolean z);

    /* renamed from: e */
    float mo103837e(int i);

    @NotNull
    /* renamed from: f */
    AbstractC29811c mo103836f(int i);

    /* renamed from: g */
    int mo103835g(int i);

    /* renamed from: h */
    void mo103834h(int i, float f);

    /* renamed from: i */
    int mo103833i(int i);

    void onPageSelected(int i);

    /* renamed from: a */
    default void mo103841a(float f) {
    }

    /* renamed from: d */
    default void mo103838d(float f) {
    }
}
