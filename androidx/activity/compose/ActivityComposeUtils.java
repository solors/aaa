package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: androidx.activity.compose.ActivityComposeUtilsKt */
/* loaded from: classes.dex */
public final class ActivityComposeUtils {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T findOwner(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = context;
        while (obj instanceof ContextWrapper) {
            Intrinsics.m17067n(3, "T");
            if (obj instanceof Object) {
                return (T) obj;
            }
            Object obj2 = (T) ((ContextWrapper) obj).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(obj2, "innerContext.baseContext");
            obj = obj2;
        }
        return null;
    }
}
