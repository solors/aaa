package androidx.compose.p015ui.text.input;

import kotlin.Metadata;

/* compiled from: GapBuffer.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.GapBufferKt */
/* loaded from: classes.dex */
public final class GapBufferKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void toCharArray(String str, char[] cArr, int i, int i2, int i3) {
        for (int i4 = i2; i4 < i3; i4++) {
            cArr[(i + i4) - i2] = str.charAt(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void toCharArray$default(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        toCharArray(str, cArr, i, i2, i3);
    }
}
