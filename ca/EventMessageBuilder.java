package ca;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringBuilderJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ca.a */
/* loaded from: classes8.dex */
public class EventMessageBuilder {
    @NotNull

    /* renamed from: c */
    private final StringBuilder f1943c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    /* renamed from: A */
    public final String m103530A() {
        boolean z;
        StringBuilder sb2 = this.f1943c;
        if (sb2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String sb3 = sb2.toString();
            StringBuilderJVM.m16644i(sb2);
            return sb3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final void m103529z(@NotNull String event, @NotNull String message) {
        boolean z;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f1943c.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1943c.append(", ");
        }
        StringBuilder sb2 = this.f1943c;
        sb2.append(event + " (" + message + ')');
    }
}
