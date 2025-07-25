package p779m;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1003v.C44477j;
import p837q.C39310n;

@Metadata
/* renamed from: m.c */
/* loaded from: classes2.dex */
public final class UriKeyer implements Keyer<Uri> {
    @Override // p779m.Keyer
    @NotNull
    /* renamed from: b */
    public String mo15478a(@NotNull Uri uri, @NotNull C39310n c39310n) {
        if (Intrinsics.m17075f(uri.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append('-');
            sb2.append(C44477j.m2824k(c39310n.m13039g().getResources().getConfiguration()));
            return sb2.toString();
        }
        return uri.toString();
    }
}
