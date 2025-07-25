package androidx.compose.p015ui.platform;

import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1 */
/* loaded from: classes.dex */
final class AndroidCompositionLocals_androidKt$LocalConfiguration$1 extends Lambda implements Functions<Configuration> {
    public static final AndroidCompositionLocals_androidKt$LocalConfiguration$1 INSTANCE = new AndroidCompositionLocals_androidKt$LocalConfiguration$1();

    AndroidCompositionLocals_androidKt$LocalConfiguration$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Configuration invoke() {
        AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalConfiguration");
        throw new ExceptionsH();
    }
}
