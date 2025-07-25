package p869s;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: s.b */
/* loaded from: classes2.dex */
public interface ViewTarget<T extends View> extends Target {
    @NotNull
    T getView();
}
