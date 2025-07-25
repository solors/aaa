package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.UnstableApi;
import java.io.Closeable;

@UnstableApi
/* loaded from: classes2.dex */
public interface DownloadCursor extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getCount();

    Download getDownload();

    int getPosition();

    default boolean isAfterLast() {
        if (getCount() == 0 || getPosition() == getCount()) {
            return true;
        }
        return false;
    }

    default boolean isBeforeFirst() {
        if (getCount() == 0 || getPosition() == -1) {
            return true;
        }
        return false;
    }

    boolean isClosed();

    default boolean isFirst() {
        if (getPosition() == 0 && getCount() != 0) {
            return true;
        }
        return false;
    }

    default boolean isLast() {
        int count = getCount();
        if (getPosition() == count - 1 && count != 0) {
            return true;
        }
        return false;
    }

    default boolean moveToFirst() {
        return moveToPosition(0);
    }

    default boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    default boolean moveToNext() {
        return moveToPosition(getPosition() + 1);
    }

    boolean moveToPosition(int i);

    default boolean moveToPrevious() {
        return moveToPosition(getPosition() - 1);
    }
}
