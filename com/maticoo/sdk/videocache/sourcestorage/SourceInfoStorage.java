package com.maticoo.sdk.videocache.sourcestorage;

import com.maticoo.sdk.videocache.SourceInfo;

/* loaded from: classes6.dex */
public interface SourceInfoStorage {
    SourceInfo get(String str);

    void put(String str, SourceInfo sourceInfo);

    void release();
}
