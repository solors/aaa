package sa;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p701hb.Severity;

@Metadata
/* renamed from: sa.f */
/* loaded from: classes8.dex */
public final class KLog {
    @NotNull

    /* renamed from: a */
    public static final KLog f104133a = new KLog();
    @NotNull

    /* renamed from: b */
    private static final List<InterfaceC39642h> f104134b = new ArrayList();

    private KLog() {
    }

    /* renamed from: a */
    public final boolean m11984a(@NotNull Severity minLevel) {
        Intrinsics.checkNotNullParameter(minLevel, "minLevel");
        return Log.m11979d(minLevel);
    }

    /* renamed from: b */
    public final void m11983b(int i, @NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.println(i, tag, message);
        List<InterfaceC39642h> list = f104134b;
        synchronized (list) {
            for (InterfaceC39642h interfaceC39642h : list) {
                interfaceC39642h.m11976a(i, tag, message);
            }
            Unit unit = Unit.f99208a;
        }
    }
}
