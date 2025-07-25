package p792n;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p837q.C39310n;

@Metadata
/* renamed from: n.e */
/* loaded from: classes2.dex */
public final class ResourceIntMapper implements Mapper<Integer, Uri> {
    /* renamed from: b */
    private final boolean m15110b(@DrawableRes int i, Context context) {
        try {
            if (context.getResources().getResourceEntryName(i) == null) {
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Override // p792n.Mapper
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Uri mo15106a(Integer num, C39310n c39310n) {
        return m15109c(num.intValue(), c39310n);
    }

    @Nullable
    /* renamed from: c */
    public Uri m15109c(@DrawableRes int i, @NotNull C39310n c39310n) {
        if (!m15110b(i, c39310n.m13039g())) {
            return null;
        }
        Uri parse = Uri.parse("android.resource://" + c39310n.m13039g().getPackageName() + '/' + i);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        return parse;
    }
}
