package androidx.compose.p015ui.platform;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import androidx.compose.p015ui.InternalComposeUiApi;
import androidx.compose.p015ui.text.input.PlatformTextInputService;
import androidx.compose.p015ui.text.input.TextInputService;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidComposeView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidComposeView_androidKt */
/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    private static Function1<? super PlatformTextInputService, ? extends TextInputService> textInputServiceFactory = AndroidComposeView_androidKt$textInputServiceFactory$1.INSTANCE;

    public static final /* synthetic */ LayoutDirection access$layoutDirectionFromInt(int i) {
        return layoutDirectionFromInt(i);
    }

    /* renamed from: dot-p89u6pk  reason: not valid java name */
    private static final float m109210dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    @NotNull
    public static final LayoutDirection getLocaleLayoutDirection(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    @NotNull
    public static final Function1<PlatformTextInputService, TextInputService> getTextInputServiceFactory() {
        return textInputServiceFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutDirection layoutDirectionFromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                return LayoutDirection.Ltr;
            }
            return LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E  reason: not valid java name */
    public static final void m109211preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float m109210dotp89u6pk = m109210dotp89u6pk(fArr2, 0, fArr, 0);
        float m109210dotp89u6pk2 = m109210dotp89u6pk(fArr2, 0, fArr, 1);
        float m109210dotp89u6pk3 = m109210dotp89u6pk(fArr2, 0, fArr, 2);
        float m109210dotp89u6pk4 = m109210dotp89u6pk(fArr2, 0, fArr, 3);
        float m109210dotp89u6pk5 = m109210dotp89u6pk(fArr2, 1, fArr, 0);
        float m109210dotp89u6pk6 = m109210dotp89u6pk(fArr2, 1, fArr, 1);
        float m109210dotp89u6pk7 = m109210dotp89u6pk(fArr2, 1, fArr, 2);
        float m109210dotp89u6pk8 = m109210dotp89u6pk(fArr2, 1, fArr, 3);
        float m109210dotp89u6pk9 = m109210dotp89u6pk(fArr2, 2, fArr, 0);
        float m109210dotp89u6pk10 = m109210dotp89u6pk(fArr2, 2, fArr, 1);
        float m109210dotp89u6pk11 = m109210dotp89u6pk(fArr2, 2, fArr, 2);
        float m109210dotp89u6pk12 = m109210dotp89u6pk(fArr2, 2, fArr, 3);
        float m109210dotp89u6pk13 = m109210dotp89u6pk(fArr2, 3, fArr, 0);
        float m109210dotp89u6pk14 = m109210dotp89u6pk(fArr2, 3, fArr, 1);
        float m109210dotp89u6pk15 = m109210dotp89u6pk(fArr2, 3, fArr, 2);
        float m109210dotp89u6pk16 = m109210dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = m109210dotp89u6pk;
        fArr[1] = m109210dotp89u6pk2;
        fArr[2] = m109210dotp89u6pk3;
        fArr[3] = m109210dotp89u6pk4;
        fArr[4] = m109210dotp89u6pk5;
        fArr[5] = m109210dotp89u6pk6;
        fArr[6] = m109210dotp89u6pk7;
        fArr[7] = m109210dotp89u6pk8;
        fArr[8] = m109210dotp89u6pk9;
        fArr[9] = m109210dotp89u6pk10;
        fArr[10] = m109210dotp89u6pk11;
        fArr[11] = m109210dotp89u6pk12;
        fArr[12] = m109210dotp89u6pk13;
        fArr[13] = m109210dotp89u6pk14;
        fArr[14] = m109210dotp89u6pk15;
        fArr[15] = m109210dotp89u6pk16;
    }

    public static final void setTextInputServiceFactory(@NotNull Function1<? super PlatformTextInputService, ? extends TextInputService> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        textInputServiceFactory = function1;
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getTextInputServiceFactory$annotations() {
    }
}
