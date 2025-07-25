package p792n;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p837q.C39310n;

@Metadata
/* renamed from: n.g */
/* loaded from: classes2.dex */
public final class StringMapper implements Mapper<String, Uri> {
    @Override // p792n.Mapper
    @NotNull
    /* renamed from: b */
    public Uri mo15106a(@NotNull String str, @NotNull C39310n c39310n) {
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        return parse;
    }
}
