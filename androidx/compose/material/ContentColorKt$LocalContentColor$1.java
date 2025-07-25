package androidx.compose.material;

import androidx.compose.p015ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: ContentColor.kt */
@Metadata
/* loaded from: classes.dex */
final class ContentColorKt$LocalContentColor$1 extends Lambda implements Functions<Color> {
    public static final ContentColorKt$LocalContentColor$1 INSTANCE = new ContentColorKt$LocalContentColor$1();

    ContentColorKt$LocalContentColor$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Color invoke() {
        return Color.m107517boximpl(m106908invoke0d7_KjU());
    }

    /* renamed from: invoke-0d7_KjU  reason: not valid java name */
    public final long m106908invoke0d7_KjU() {
        return Color.Companion.m107553getBlack0d7_KjU();
    }
}
