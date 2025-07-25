package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
/* loaded from: classes5.dex */
public final class zzq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final CharSequence zza(Object obj, String str) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }
}
