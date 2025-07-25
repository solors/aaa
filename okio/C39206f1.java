package okio;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: -JvmPlatform.kt */
@Metadata
/* renamed from: okio.f1 */
/* loaded from: classes10.dex */
public final class C39206f1 {
    @NotNull
    /* renamed from: a */
    public static final byte[] m13575a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @NotNull
    /* renamed from: b */
    public static final ReentrantLock m13574b() {
        return new ReentrantLock();
    }

    @NotNull
    /* renamed from: c */
    public static final String m13573c(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }
}
