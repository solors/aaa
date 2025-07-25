package p1046xd;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p804nd.C38497f;

@Metadata
/* renamed from: xd.c */
/* loaded from: classes7.dex */
public final class Closeable {
    /* renamed from: a */
    public static final void m1220a(@Nullable java.io.Closeable closeable, @Nullable Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C38497f.m14566a(th, th2);
            }
        }
    }
}
