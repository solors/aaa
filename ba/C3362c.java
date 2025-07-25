package ba;

import android.net.Uri;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DivItemChangeActionHandler.kt */
@Metadata
/* renamed from: ba.c */
/* loaded from: classes8.dex */
public final class C3362c {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final DivViewWithItems m103880c(String str) {
        if (Intrinsics.m17075f(str, "set_previous_item")) {
            return DivViewWithItems.PREVIOUS;
        }
        if (Intrinsics.m17075f(str, "set_next_item")) {
            return DivViewWithItems.NEXT;
        }
        return DivViewWithItems.NEXT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final OverflowItemStrategy m103879d(Uri uri, int i, int i2, int i3, int i4, DisplayMetrics displayMetrics) {
        return OverflowItemStrategy.f1637b.m103850a(uri.getQueryParameter("overflow"), i, i2, i3, i4, displayMetrics);
    }
}
