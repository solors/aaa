package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.v7 */
/* loaded from: classes9.dex */
public final class C34955v7 implements Converter {

    /* renamed from: a */
    public final C34877s7 f95505a;

    public C34955v7() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final ContentValues fromModel(@NotNull C34929u7 c34929u7) {
        ContentValues contentValues = new ContentValues();
        Long l = c34929u7.f95454a;
        if (l != null) {
            contentValues.put("id", Long.valueOf(l.longValue()));
        }
        EnumC34433bk enumC34433bk = c34929u7.f95455b;
        if (enumC34433bk != null) {
            contentValues.put("type", Integer.valueOf(enumC34433bk.f94042a));
        }
        String str = c34929u7.f95456c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C34877s7 c34877s7 = this.f95505a;
        contentValues.put("session_description", MessageNano.toByteArray(c34877s7.f95323a.fromModel(c34929u7.f95457d)));
        return contentValues;
    }

    public C34955v7(@NotNull C34877s7 c34877s7) {
        this.f95505a = c34877s7;
    }

    public /* synthetic */ C34955v7(C34877s7 c34877s7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C34877s7(null, 1, null) : c34877s7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34929u7 toModel(@NotNull ContentValues contentValues) {
        EnumC34433bk enumC34433bk;
        int intValue;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            Integer valueOf = Integer.valueOf(asInteger.intValue());
            enumC34433bk = EnumC34433bk.FOREGROUND;
            if (valueOf != null && (intValue = valueOf.intValue()) != 0 && intValue == 1) {
                enumC34433bk = EnumC34433bk.BACKGROUND;
            }
        } else {
            enumC34433bk = null;
        }
        return new C34929u7(asLong, enumC34433bk, contentValues.getAsString("report_request_parameters"), this.f95505a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
