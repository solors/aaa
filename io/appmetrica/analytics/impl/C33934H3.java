package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.H3 */
/* loaded from: classes9.dex */
public final class C33934H3 implements InterfaceC33886F5 {
    @Override // io.appmetrica.analytics.impl.InterfaceC33886F5, kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: a */
    public final Map<String, String> invoke(@NotNull ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap m21876c = AbstractC34451cb.m21876c(asString);
        if (!AbstractC34024Kl.m22489a(m21876c)) {
            AbstractC35018xi.m20774a("Passed clids (" + asString + ") are invalid.", new Object[0]);
            return null;
        }
        return m21876c;
    }
}
