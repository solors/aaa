package p792n;

import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p837q.C39310n;

@Metadata
/* renamed from: n.f */
/* loaded from: classes2.dex */
public final class ResourceUriMapper implements Mapper<Uri, Uri> {
    /* renamed from: b */
    private final boolean m15108b(Uri uri) {
        boolean z;
        boolean m16635B;
        if (!Intrinsics.m17075f(uri.getScheme(), "android.resource")) {
            return false;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            m16635B = StringsJVM.m16635B(authority);
            if (!m16635B) {
                z = false;
                if (z && uri.getPathSegments().size() == 2) {
                    return true;
                }
            }
        }
        z = true;
        return z ? false : false;
    }

    @Override // p792n.Mapper
    @Nullable
    /* renamed from: c */
    public Uri mo15106a(@NotNull Uri uri, @NotNull C39310n c39310n) {
        if (!m15108b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = c39310n.m13039g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        boolean z = false;
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            z = true;
        }
        if (z) {
            Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            return parse;
        }
        throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
    }
}
