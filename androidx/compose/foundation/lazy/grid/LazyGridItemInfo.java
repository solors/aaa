package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridItemInfo.kt */
@Metadata
/* loaded from: classes.dex */
public interface LazyGridItemInfo {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int UnknownColumn = -1;
    public static final int UnknownRow = -1;

    /* compiled from: LazyGridItemInfo.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int UnknownColumn = -1;
        public static final int UnknownRow = -1;

        private Companion() {
        }
    }

    int getColumn();

    int getIndex();

    @NotNull
    Object getKey();

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    long mo106483getOffsetnOccac();

    int getRow();

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long mo106484getSizeYbymL2g();
}
