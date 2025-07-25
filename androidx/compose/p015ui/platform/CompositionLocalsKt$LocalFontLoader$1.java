package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.text.font.Font;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: CompositionLocals.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1 */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalFontLoader$1 extends Lambda implements Functions<Font.ResourceLoader> {
    public static final CompositionLocalsKt$LocalFontLoader$1 INSTANCE = new CompositionLocalsKt$LocalFontLoader$1();

    CompositionLocalsKt$LocalFontLoader$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Font.ResourceLoader invoke() {
        CompositionLocals.noLocalProvidedFor("LocalFontLoader");
        throw new ExceptionsH();
    }
}
