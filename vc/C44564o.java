package vc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Buffer.kt */
@Metadata
/* renamed from: vc.o */
/* loaded from: classes9.dex */
public final class C44564o extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44564o(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C44564o(@NotNull String name, int i, int i2) {
        this("Not enough free space to write " + name + " of " + i + " bytes, available " + i2 + " bytes.");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
