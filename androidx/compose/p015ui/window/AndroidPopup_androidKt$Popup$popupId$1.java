package androidx.compose.p015ui.window;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidPopup.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1 */
/* loaded from: classes.dex */
final class AndroidPopup_androidKt$Popup$popupId$1 extends Lambda implements Functions<UUID> {
    public static final AndroidPopup_androidKt$Popup$popupId$1 INSTANCE = new AndroidPopup_androidKt$Popup$popupId$1();

    AndroidPopup_androidKt$Popup$popupId$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
