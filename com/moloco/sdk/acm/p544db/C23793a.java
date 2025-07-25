package com.moloco.sdk.acm.p544db;

import androidx.room.TypeConverter;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.acm.db.a */
/* loaded from: classes7.dex */
public final class C23793a {
    @TypeConverter
    @NotNull
    /* renamed from: a */
    public final EnumC23795c m47714a(@NotNull String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return EnumC23795c.valueOf(eventType);
    }

    @TypeConverter
    @NotNull
    /* renamed from: b */
    public final String m47713b(@NotNull EnumC23795c eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return eventType.name();
    }

    @TypeConverter
    @NotNull
    /* renamed from: c */
    public final String m47712c(@NotNull List<String> tags) {
        String m17521z0;
        Intrinsics.checkNotNullParameter(tags, "tags");
        m17521z0 = _Collections.m17521z0(tags, ",", null, null, 0, null, null, 62, null);
        return m17521z0;
    }

    @TypeConverter
    @NotNull
    /* renamed from: d */
    public final List<String> m47711d(@NotNull String tagsString) {
        List<String> m16611C0;
        List<String> m17166m;
        Intrinsics.checkNotNullParameter(tagsString, "tagsString");
        if (tagsString.length() == 0) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        m16611C0 = C37690r.m16611C0(tagsString, new String[]{","}, false, 0, 6, null);
        return m16611C0;
    }
}
