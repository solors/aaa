package p1046xd;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p764io.FileTreeWalk;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileTreeWalk.kt */
@Metadata
/* renamed from: xd.l */
/* loaded from: classes7.dex */
public class C44982l extends C44980k {
    @NotNull
    /* renamed from: m */
    public static final C44971h m1180m(@NotNull File file, @NotNull FileTreeWalk direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new C44971h(file, direction);
    }

    /* renamed from: n */
    public static /* synthetic */ C44971h m1179n(File file, FileTreeWalk fileTreeWalk, int i, Object obj) {
        if ((i & 1) != 0) {
            fileTreeWalk = FileTreeWalk.f99300b;
        }
        return m1180m(file, fileTreeWalk);
    }

    @NotNull
    /* renamed from: o */
    public static final C44971h m1178o(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return m1180m(file, FileTreeWalk.f99301c);
    }
}
