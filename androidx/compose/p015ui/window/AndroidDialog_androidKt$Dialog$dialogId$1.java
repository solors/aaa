package androidx.compose.p015ui.window;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidDialog.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1 */
/* loaded from: classes.dex */
final class AndroidDialog_androidKt$Dialog$dialogId$1 extends Lambda implements Functions<UUID> {
    public static final AndroidDialog_androidKt$Dialog$dialogId$1 INSTANCE = new AndroidDialog_androidKt$Dialog$dialogId$1();

    AndroidDialog_androidKt$Dialog$dialogId$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
