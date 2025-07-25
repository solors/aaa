package androidx.compose.material.internal;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata
/* loaded from: classes.dex */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1 extends Lambda implements Functions<UUID> {
    public static final ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1 INSTANCE = new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1();

    ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
