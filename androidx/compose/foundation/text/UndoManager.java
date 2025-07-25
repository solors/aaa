package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UndoManager.kt */
@Metadata
/* loaded from: classes.dex */
public final class UndoManager {
    private boolean forceNextSnapshot;
    @Nullable
    private Long lastSnapshot;
    private final int maxStoredCharacters;
    @Nullable
    private Entry redoStack;
    private int storedCharacters;
    @Nullable
    private Entry undoStack;

    public UndoManager() {
        this(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[LOOP:0: B:8:0x000e->B:14:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0023 A[EDGE_INSN: B:19:0x0023->B:15:0x0023 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void removeLastUndo() {
        /*
            r3 = this;
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.undoStack
            r1 = 0
            if (r0 == 0) goto La
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            if (r2 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r2.getNext()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            androidx.compose.foundation.text.UndoManager$Entry r0 = r0.getNext()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.setNext(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.removeLastUndo():void");
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public final void makeSnapshot(@NotNull TextFieldValue value) {
        TextFieldValue textFieldValue;
        String str;
        TextFieldValue value2;
        Intrinsics.checkNotNullParameter(value, "value");
        this.forceNextSnapshot = false;
        Entry entry = this.undoStack;
        if (entry != null) {
            textFieldValue = entry.getValue();
        } else {
            textFieldValue = null;
        }
        if (Intrinsics.m17075f(value, textFieldValue)) {
            return;
        }
        String text = value.getText();
        Entry entry2 = this.undoStack;
        if (entry2 != null && (value2 = entry2.getValue()) != null) {
            str = value2.getText();
        } else {
            str = null;
        }
        if (Intrinsics.m17075f(text, str)) {
            Entry entry3 = this.undoStack;
            if (entry3 != null) {
                entry3.setValue(value);
                return;
            }
            return;
        }
        this.undoStack = new Entry(this.undoStack, value);
        this.redoStack = null;
        int length = this.storedCharacters + value.getText().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            removeLastUndo();
        }
    }

    @Nullable
    public final TextFieldValue redo() {
        Entry entry = this.redoStack;
        if (entry != null) {
            this.redoStack = entry.getNext();
            this.undoStack = new Entry(this.undoStack, entry.getValue());
            this.storedCharacters += entry.getValue().getText().length();
            return entry.getValue();
        }
        return null;
    }

    public final void snapshotIfNeeded(@NotNull TextFieldValue value, long j) {
        long j2;
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.forceNextSnapshot) {
            Long l = this.lastSnapshot;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            if (j <= j2 + UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(j);
        makeSnapshot(value);
    }

    @Nullable
    public final TextFieldValue undo() {
        Entry next;
        Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().getText().length();
        this.redoStack = new Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    public UndoManager(int i) {
        this.maxStoredCharacters = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UndoManager.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Entry {
        @Nullable
        private Entry next;
        @NotNull
        private TextFieldValue value;

        public Entry(@Nullable Entry entry, @NotNull TextFieldValue value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.next = entry;
            this.value = value;
        }

        @Nullable
        public final Entry getNext() {
            return this.next;
        }

        @NotNull
        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void setNext(@Nullable Entry entry) {
            this.next = entry;
        }

        public final void setValue(@NotNull TextFieldValue textFieldValue) {
            Intrinsics.checkNotNullParameter(textFieldValue, "<set-?>");
            this.value = textFieldValue;
        }

        public /* synthetic */ Entry(Entry entry, TextFieldValue textFieldValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : entry, textFieldValue);
        }
    }

    public /* synthetic */ UndoManager(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100000 : i);
    }
}
