package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.net.URI;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h */
/* loaded from: classes7.dex */
public final class C24607h {
    @NotNull
    /* renamed from: a */
    public static final String m46062a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        URI uri = new URI(str);
        String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "URI(this).run { URI(sche…l, fragment).toString() }");
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        byte[] bytes = uri2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "md.digest()");
        return C24630l.m46020a(digest);
    }
}
