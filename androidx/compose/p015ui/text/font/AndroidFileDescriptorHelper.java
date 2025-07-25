package androidx.compose.p015ui.text.font;

import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidFont.kt */
@RequiresApi(26)
@Metadata
/* renamed from: androidx.compose.ui.text.font.AndroidFileDescriptorHelper */
/* loaded from: classes.dex */
final class AndroidFileDescriptorHelper {
    @NotNull
    public static final AndroidFileDescriptorHelper INSTANCE = new AndroidFileDescriptorHelper();

    private AndroidFileDescriptorHelper() {
    }

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    public final Typeface create(@NotNull ParcelFileDescriptor fileDescriptor) {
        Typeface build;
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        build = new Typeface.Builder(fileDescriptor.getFileDescriptor()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(fileDescriptor.fileDescriptor).build()");
        return build;
    }
}
