package com.bykv.p135vk.openvk.preload.geckox.net;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.net.INetWork */
/* loaded from: classes3.dex */
public interface INetWork {
    Response doGet(String str) throws Exception;

    Response doPost(String str, String str2) throws Exception;

    Response doPost(String str, List<Pair<String, String>> list) throws Exception;

    void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception;

    void syncDoGet(String str);
}
