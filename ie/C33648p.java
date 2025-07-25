package ie;

import kotlin.Metadata;

/* compiled from: LimitedDispatcher.kt */
@Metadata
/* renamed from: ie.p */
/* loaded from: classes8.dex */
public final class C33648p {
    /* renamed from: a */
    public static final void m22931a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }
}
