package p834pb;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb.DatabaseOpenHelper;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: pb.c */
/* loaded from: classes8.dex */
public final class SqlExtensions {
    /* renamed from: a */
    public static final void m13201a(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    public static final void m13200b(@NotNull DatabaseOpenHelper.InterfaceC38137b interfaceC38137b) {
        Intrinsics.checkNotNullParameter(interfaceC38137b, "<this>");
        try {
            interfaceC38137b.endTransaction();
        } catch (IllegalStateException unused) {
        }
    }
}
