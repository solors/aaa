package androidx.compose.p015ui.platform;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1 */
/* loaded from: classes.dex */
final class AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1 extends Lambda implements Functions<LifecycleOwner> {
    public static final AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1 INSTANCE = new AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1();

    AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final LifecycleOwner invoke() {
        AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalLifecycleOwner");
        throw new ExceptionsH();
    }
}
