package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.AlignmentLine;
import androidx.compose.p015ui.layout.Measured;
import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.foundation.layout.AlignmentLineProvider */
/* loaded from: classes.dex */
public abstract class RowColumnImpl {

    /* compiled from: RowColumnImpl.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* renamed from: androidx.compose.foundation.layout.AlignmentLineProvider$Block */
    /* loaded from: classes.dex */
    public static final class Block extends RowColumnImpl {
        public static final int $stable = 0;
        @NotNull
        private final Function1<Measured, Integer> lineProviderBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Block(@NotNull Function1<? super Measured, Integer> lineProviderBlock) {
            super(null);
            Intrinsics.checkNotNullParameter(lineProviderBlock, "lineProviderBlock");
            this.lineProviderBlock = lineProviderBlock;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Block copy$default(Block block, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = block.lineProviderBlock;
            }
            return block.copy(function1);
        }

        @Override // androidx.compose.foundation.layout.RowColumnImpl
        public int calculateAlignmentLinePosition(@NotNull Placeable placeable) {
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            return this.lineProviderBlock.invoke(placeable).intValue();
        }

        @NotNull
        public final Function1<Measured, Integer> component1() {
            return this.lineProviderBlock;
        }

        @NotNull
        public final Block copy(@NotNull Function1<? super Measured, Integer> lineProviderBlock) {
            Intrinsics.checkNotNullParameter(lineProviderBlock, "lineProviderBlock");
            return new Block(lineProviderBlock);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Block) && Intrinsics.m17075f(this.lineProviderBlock, ((Block) obj).lineProviderBlock)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Function1<Measured, Integer> getLineProviderBlock() {
            return this.lineProviderBlock;
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        @NotNull
        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* renamed from: androidx.compose.foundation.layout.AlignmentLineProvider$Value */
    /* loaded from: classes.dex */
    public static final class Value extends RowColumnImpl {
        public static final int $stable = 0;
        @NotNull
        private final AlignmentLine alignmentLine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Value(@NotNull AlignmentLine alignmentLine) {
            super(null);
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            this.alignmentLine = alignmentLine;
        }

        public static /* synthetic */ Value copy$default(Value value, AlignmentLine alignmentLine, int i, Object obj) {
            if ((i & 1) != 0) {
                alignmentLine = value.alignmentLine;
            }
            return value.copy(alignmentLine);
        }

        @Override // androidx.compose.foundation.layout.RowColumnImpl
        public int calculateAlignmentLinePosition(@NotNull Placeable placeable) {
            Intrinsics.checkNotNullParameter(placeable, "placeable");
            return placeable.get(this.alignmentLine);
        }

        @NotNull
        public final AlignmentLine component1() {
            return this.alignmentLine;
        }

        @NotNull
        public final Value copy(@NotNull AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            return new Value(alignmentLine);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Value) && Intrinsics.m17075f(this.alignmentLine, ((Value) obj).alignmentLine)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }
    }

    private RowColumnImpl() {
    }

    public /* synthetic */ RowColumnImpl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int calculateAlignmentLinePosition(@NotNull Placeable placeable);
}
