package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
interface FileLogStore {
    void closeLogFile();

    void deleteLogFile();

    @Nullable
    byte[] getLogAsBytes();

    @Nullable
    String getLogAsString();

    void writeToLog(long j, String str);
}
