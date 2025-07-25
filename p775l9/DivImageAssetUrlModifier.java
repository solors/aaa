package p775l9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: l9.a */
/* loaded from: classes8.dex */
public final class DivImageAssetUrlModifier implements DivImageUrlModifier {
    @Override // p775l9.DivImageUrlModifier
    @NotNull
    /* renamed from: a */
    public String mo15650a(@NotNull String imageUrl) {
        boolean m16624M;
        String m16547v0;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        m16624M = StringsJVM.m16624M(imageUrl, "divkit-asset", false, 2, null);
        if (m16624M) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("file:///android_asset/divkit/");
            m16547v0 = C37690r.m16547v0(imageUrl, "divkit-asset://");
            sb2.append(m16547v0);
            return sb2.toString();
        }
        return imageUrl;
    }
}
