package tc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MemoryJvm.kt */
@Metadata
/* renamed from: tc.d */
/* loaded from: classes9.dex */
public final class C44400d {
    /* renamed from: a */
    public static final void m3117a(@NotNull ByteBuffer copyTo, @NotNull ByteBuffer destination, int i) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int remaining = destination.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && destination.hasArray() && !destination.isReadOnly()) {
            int position = destination.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i, destination.array(), destination.arrayOffset() + position, remaining);
            destination.position(position + remaining);
            return;
        }
        ByteBuffer duplicate = copyTo.duplicate();
        duplicate.limit(remaining + i);
        duplicate.position(i);
        destination.put(duplicate);
    }

    /* renamed from: b */
    public static final void m3116b(@NotNull ByteBuffer copyTo, @NotNull byte[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (copyTo.hasArray() && !copyTo.isReadOnly()) {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i, destination, i3, i2);
        } else {
            copyTo.duplicate().get(destination, i3, i2);
        }
    }

    /* renamed from: c */
    public static final void m3115c(@NotNull ByteBuffer copyTo, @NotNull ByteBuffer destination, int i) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (copyTo.hasArray() && !copyTo.isReadOnly()) {
            byte[] array = copyTo.array();
            Intrinsics.checkNotNullExpressionValue(array, "array()");
            int arrayOffset = copyTo.arrayOffset() + copyTo.position();
            int remaining = copyTo.remaining();
            ByteBuffer order = ByteBuffer.wrap(array, arrayOffset, remaining).slice().order(ByteOrder.BIG_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            MemoryJvm.m3120c(MemoryJvm.m3121b(order), destination, 0, remaining, i);
            copyTo.position(copyTo.limit());
            return;
        }
        m3114d(destination, i, copyTo.remaining()).put(copyTo);
    }

    @NotNull
    /* renamed from: d */
    public static final ByteBuffer m3114d(@NotNull ByteBuffer byteBuffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        Intrinsics.checkNotNullExpressionValue(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i);
        myDuplicate$lambda$1.limit(i + i2);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        Intrinsics.checkNotNullExpressionValue(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }
}
