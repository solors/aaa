package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.j9 */
/* loaded from: classes6.dex */
public abstract class AbstractC19330j9 {
    /* renamed from: a */
    public static final boolean m60162a(Context context, String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (context == null) {
            return false;
        }
        try {
            if (context.checkCallingOrSelfPermission(permission) != 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
