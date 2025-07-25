package io.bidmachine.rendering;

import android.content.Context;
import androidx.annotation.NonNull;
import com.explorestack.iab.mraid.C10472c;
import com.explorestack.iab.utils.C10509f;
import io.bidmachine.rendering.internal.AbstractC37037k;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class Rendering {

    /* renamed from: a */
    private static final AtomicBoolean f97560a = new AtomicBoolean(false);

    public static void initialize(@NonNull Context context) {
        f97560a.compareAndSet(false, true);
    }

    public static void setLoggingEnabled(boolean z) {
        C10509f.EnumC10510a enumC10510a;
        AbstractC37037k.m19164a(z);
        if (z) {
            enumC10510a = C10509f.EnumC10510a.debug;
        } else {
            enumC10510a = C10509f.EnumC10510a.none;
        }
        C10472c.m79522h(enumC10510a);
    }
}
